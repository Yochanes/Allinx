package me.jessyan.retrofiturlmanager;

import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import me.jessyan.retrofiturlmanager.parser.DefaultUrlParser;
import me.jessyan.retrofiturlmanager.parser.UrlParser;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class RetrofitUrlManager {
    private static final boolean DEPENDENCY_OKHTTP;
    private static final String DOMAIN_NAME = "Domain-Name";
    public static final String DOMAIN_NAME_HEADER = "Domain-Name: ";
    private static final String GLOBAL_DOMAIN_NAME = "me.jessyan.retrofiturlmanager.globalDomainName";
    public static final String IDENTIFICATION_IGNORE = "#url_ignore";
    public static final String IDENTIFICATION_PATH_SIZE = "#baseurl_path_size=";
    private static final String TAG = "RetrofitUrlManager";
    private HttpUrl baseUrl;
    private boolean debug;
    private boolean isRun;
    private final Map<String, HttpUrl> mDomainNameHub;
    private final Interceptor mInterceptor;
    private final List<onUrlChangeListener> mListeners;
    private UrlParser mUrlParser;
    private int pathSize;

    /* JADX INFO: renamed from: me.jessyan.retrofiturlmanager.RetrofitUrlManager$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C63561 implements Interceptor {
        public C63561() {
        }

        @Override // okhttp3.Interceptor
        public Response intercept(Interceptor.Chain chain) {
            return !RetrofitUrlManager.this.isRun() ? chain.mo21281a(chain.request()) : chain.mo21281a(RetrofitUrlManager.this.processRequest(chain.request()));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class RetrofitUrlManagerHolder {
        private static final RetrofitUrlManager INSTANCE = new RetrofitUrlManager(null);

        private RetrofitUrlManagerHolder() {
        }

        public static /* synthetic */ RetrofitUrlManager access$100() {
            return INSTANCE;
        }
    }

    static {
        boolean z2;
        try {
            List list = OkHttpClient.f57146G;
            z2 = true;
        } catch (ClassNotFoundException unused) {
            z2 = false;
        }
        DEPENDENCY_OKHTTP = z2;
    }

    public /* synthetic */ RetrofitUrlManager(C63561 c63561) {
        this();
    }

    public static final RetrofitUrlManager getInstance() {
        return RetrofitUrlManagerHolder.access$100();
    }

    private Object[] listenersToArray() {
        Object[] array;
        synchronized (this.mListeners) {
            try {
                array = this.mListeners.size() > 0 ? this.mListeners.toArray() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return array;
    }

    private void notifyListener(Request request, String str, Object[] objArr) {
        if (objArr != null) {
            for (Object obj : objArr) {
                ((onUrlChangeListener) obj).onUrlChangeBefore(request.f57210a, str);
            }
        }
    }

    private String obtainDomainNameFromHeaders(Request request) {
        List listM21244j = request.f57212c.m21244j(DOMAIN_NAME);
        if (listM21244j.size() == 0) {
            return null;
        }
        if (listM21244j.size() <= 1) {
            return request.f57212c.m21240c(DOMAIN_NAME);
        }
        throw new IllegalArgumentException("Only one Domain-Name in the headers");
    }

    private Request pruneIdentification(Request.Builder builder, String str) {
        String[] strArrSplit = str.split(IDENTIFICATION_IGNORE);
        StringBuffer stringBuffer = new StringBuffer();
        for (String str2 : strArrSplit) {
            stringBuffer.append(str2);
        }
        builder.m21302g(stringBuffer.toString());
        return builder.m21297b();
    }

    public void clearAllDomain() {
        this.mDomainNameHub.clear();
    }

    public synchronized int domainSize() {
        return this.mDomainNameHub.size();
    }

    public synchronized HttpUrl fetchDomain(String str) {
        Utils.checkNotNull(str, "domainName cannot be null");
        return this.mDomainNameHub.get(str);
    }

    public HttpUrl getBaseUrl() {
        return this.baseUrl;
    }

    public synchronized HttpUrl getGlobalDomain() {
        return this.mDomainNameHub.get(GLOBAL_DOMAIN_NAME);
    }

    public int getPathSize() {
        return this.pathSize;
    }

    public synchronized boolean haveDomain(String str) {
        return this.mDomainNameHub.containsKey(str);
    }

    public boolean isAdvancedModel() {
        return this.baseUrl != null;
    }

    public boolean isRun() {
        return this.isRun;
    }

    public Request processRequest(Request request) {
        HttpUrl globalDomain;
        if (request == null) {
            return request;
        }
        Request.Builder builderM21295b = request.m21295b();
        HttpUrl httpUrl = request.f57210a;
        String str = httpUrl.f57117i;
        if (str.contains(IDENTIFICATION_IGNORE)) {
            return pruneIdentification(builderM21295b, str);
        }
        String strObtainDomainNameFromHeaders = obtainDomainNameFromHeaders(request);
        Object[] objArrListenersToArray = listenersToArray();
        if (TextUtils.isEmpty(strObtainDomainNameFromHeaders)) {
            notifyListener(request, GLOBAL_DOMAIN_NAME, objArrListenersToArray);
            globalDomain = getGlobalDomain();
        } else {
            notifyListener(request, strObtainDomainNameFromHeaders, objArrListenersToArray);
            globalDomain = fetchDomain(strObtainDomainNameFromHeaders);
            builderM21295b.f57218c.m21251g(DOMAIN_NAME);
        }
        if (globalDomain == null) {
            return builderM21295b.m21297b();
        }
        HttpUrl url = this.mUrlParser.parseUrl(globalDomain, httpUrl);
        if (this.debug) {
            Log.d(TAG, "The new url is { " + url.f57117i + " }, old url is { " + httpUrl.f57117i + " }");
        }
        if (objArrListenersToArray != null) {
            for (Object obj : objArrListenersToArray) {
                ((onUrlChangeListener) obj).onUrlChanged(url, httpUrl);
            }
        }
        Intrinsics.m18599g(url, "url");
        builderM21295b.f57216a = url;
        return builderM21295b.m21297b();
    }

    public void putDomain(String str, String str2) {
        Utils.checkNotNull(str, "domainName cannot be null");
        Utils.checkNotNull(str2, "domainUrl cannot be null");
        synchronized (this.mDomainNameHub) {
            this.mDomainNameHub.put(str, Utils.checkUrl(str2));
        }
    }

    public void registerUrlChangeListener(onUrlChangeListener onurlchangelistener) {
        Utils.checkNotNull(onurlchangelistener, "listener cannot be null");
        synchronized (this.mListeners) {
            this.mListeners.add(onurlchangelistener);
        }
    }

    public void removeDomain(String str) {
        Utils.checkNotNull(str, "domainName cannot be null");
        synchronized (this.mDomainNameHub) {
            this.mDomainNameHub.remove(str);
        }
    }

    public void removeGlobalDomain() {
        synchronized (this.mDomainNameHub) {
            this.mDomainNameHub.remove(GLOBAL_DOMAIN_NAME);
        }
    }

    public void setDebug(boolean z2) {
        this.debug = z2;
    }

    public void setGlobalDomain(String str) {
        Utils.checkNotNull(str, "globalDomain cannot be null");
        synchronized (this.mDomainNameHub) {
            this.mDomainNameHub.put(GLOBAL_DOMAIN_NAME, Utils.checkUrl(str));
        }
    }

    public String setPathSizeOfUrl(String str, int i) {
        Utils.checkNotNull(str, "url cannot be null");
        if (i < 0) {
            throw new IllegalArgumentException("pathSize must be >= 0");
        }
        return str + IDENTIFICATION_PATH_SIZE + i;
    }

    public void setRun(boolean z2) {
        this.isRun = z2;
    }

    public String setUrlNotChange(String str) {
        Utils.checkNotNull(str, "url cannot be null");
        return AbstractC0000a.m2C(str, IDENTIFICATION_IGNORE);
    }

    public void setUrlParser(UrlParser urlParser) {
        Utils.checkNotNull(urlParser, "parser cannot be null");
        this.mUrlParser = urlParser;
    }

    public void startAdvancedModel(String str) {
        Utils.checkNotNull(str, "baseUrl cannot be null");
        startAdvancedModel(Utils.checkUrl(str));
    }

    public void unregisterUrlChangeListener(onUrlChangeListener onurlchangelistener) {
        Utils.checkNotNull(onurlchangelistener, "listener cannot be null");
        synchronized (this.mListeners) {
            this.mListeners.remove(onurlchangelistener);
        }
    }

    public OkHttpClient.Builder with(OkHttpClient.Builder builder) {
        Utils.checkNotNull(builder, "builder cannot be null");
        builder.m21291a(this.mInterceptor);
        return builder;
    }

    private RetrofitUrlManager() {
        this.isRun = true;
        this.debug = false;
        this.mDomainNameHub = new HashMap();
        this.mListeners = new ArrayList();
        if (!DEPENDENCY_OKHTTP) {
            throw new IllegalStateException("Must be dependency Okhttp");
        }
        DefaultUrlParser defaultUrlParser = new DefaultUrlParser();
        defaultUrlParser.init(this);
        setUrlParser(defaultUrlParser);
        this.mInterceptor = new C63561();
    }

    public synchronized void startAdvancedModel(HttpUrl httpUrl) {
        Utils.checkNotNull(httpUrl, "baseUrl cannot be null");
        this.baseUrl = httpUrl;
        this.pathSize = httpUrl.f57114f.size();
        if ("".equals(httpUrl.f57114f.get(r3.size() - 1))) {
            this.pathSize--;
        }
    }
}
