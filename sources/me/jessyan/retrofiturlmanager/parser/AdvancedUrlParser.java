package me.jessyan.retrofiturlmanager.parser;

import android.text.TextUtils;
import java.io.EOFException;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import me.jessyan.retrofiturlmanager.RetrofitUrlManager;
import me.jessyan.retrofiturlmanager.cache.Cache;
import me.jessyan.retrofiturlmanager.cache.LruCache;
import okhttp3.HttpUrl;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class AdvancedUrlParser implements UrlParser {
    private Cache<String, String> mCache;
    private RetrofitUrlManager mRetrofitUrlManager;

    private String getKey(HttpUrl httpUrl, HttpUrl httpUrl2) {
        return httpUrl.m21256b() + httpUrl2.m21256b() + this.mRetrofitUrlManager.getPathSize();
    }

    @Override // me.jessyan.retrofiturlmanager.parser.UrlParser
    public void init(RetrofitUrlManager retrofitUrlManager) {
        this.mRetrofitUrlManager = retrofitUrlManager;
        this.mCache = new LruCache(100);
    }

    @Override // me.jessyan.retrofiturlmanager.parser.UrlParser
    public HttpUrl parseUrl(HttpUrl httpUrl, HttpUrl httpUrl2) throws EOFException {
        ArrayList arrayList;
        if (httpUrl == null) {
            return httpUrl2;
        }
        HttpUrl.Builder builderM21260f = httpUrl2.m21260f();
        if (TextUtils.isEmpty(this.mCache.get(getKey(httpUrl, httpUrl2)))) {
            int i = 0;
            while (true) {
                arrayList = httpUrl2.f57114f;
                if (i >= arrayList.size()) {
                    break;
                }
                builderM21260f.m21271g();
                i++;
            }
            ArrayList<String> arrayList2 = new ArrayList();
            arrayList2.addAll(httpUrl.m21257c());
            if (arrayList.size() > this.mRetrofitUrlManager.getPathSize()) {
                ArrayList arrayListM21257c = httpUrl2.m21257c();
                for (int pathSize = this.mRetrofitUrlManager.getPathSize(); pathSize < arrayListM21257c.size(); pathSize++) {
                    arrayList2.add(arrayListM21257c.get(pathSize));
                }
            } else if (arrayList.size() < this.mRetrofitUrlManager.getPathSize()) {
                throw new IllegalArgumentException("Your final path is " + (httpUrl2.f57109a + "://" + httpUrl2.f57112d + httpUrl2.m21256b()) + ", but the baseUrl of your RetrofitUrlManager#startAdvancedModel is " + (this.mRetrofitUrlManager.getBaseUrl().f57109a + "://" + this.mRetrofitUrlManager.getBaseUrl().f57112d + this.mRetrofitUrlManager.getBaseUrl().m21256b()));
            }
            for (String encodedPathSegment : arrayList2) {
                Intrinsics.m18599g(encodedPathSegment, "encodedPathSegment");
                builderM21260f.m21270f(encodedPathSegment, 0, encodedPathSegment.length(), false);
            }
        } else {
            builderM21260f.m21266b(this.mCache.get(getKey(httpUrl, httpUrl2)));
        }
        builderM21260f.m21273i(httpUrl.f57109a);
        builderM21260f.m21267c(httpUrl.f57112d);
        builderM21260f.m21269e(httpUrl.f57113e);
        HttpUrl httpUrlM21265a = builderM21260f.m21265a();
        if (TextUtils.isEmpty(this.mCache.get(getKey(httpUrl, httpUrl2)))) {
            this.mCache.put(getKey(httpUrl, httpUrl2), httpUrlM21265a.m21256b());
        }
        return httpUrlM21265a;
    }
}
