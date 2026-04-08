package com.android.volley.toolbox;

import com.android.volley.Header;
import com.android.volley.Request;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class HurlStack extends BaseHttpStack {

    /* JADX INFO: compiled from: Proguard */
    public static class UrlConnectionInputStream extends FilterInputStream {

        /* JADX INFO: renamed from: a */
        public final HttpURLConnection f35016a;

        /* JADX WARN: Illegal instructions before constructor call */
        public UrlConnectionInputStream(HttpURLConnection httpURLConnection) {
            InputStream errorStream;
            try {
                errorStream = httpURLConnection.getInputStream();
            } catch (IOException unused) {
                errorStream = httpURLConnection.getErrorStream();
            }
            super(errorStream);
            this.f35016a = httpURLConnection;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            super.close();
            this.f35016a.disconnect();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface UrlRewriter extends com.android.volley.toolbox.UrlRewriter {
    }

    /* JADX INFO: renamed from: b */
    public static ArrayList m12843b(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new Header((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }

    @Override // com.android.volley.toolbox.BaseHttpStack
    /* JADX INFO: renamed from: a */
    public final HttpResponse mo12817a(Request request, Map map) throws Throwable {
        HashMap map2 = new HashMap();
        map2.putAll(map);
        map2.putAll(Collections.EMPTY_MAP);
        URL url = new URL(request.f34943b);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int i = request.f34952p.f34921a;
        httpURLConnection.setConnectTimeout(i);
        httpURLConnection.setReadTimeout(i);
        boolean z2 = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        "https".equals(url.getProtocol());
        try {
            for (String str : map2.keySet()) {
                httpURLConnection.setRequestProperty(str, (String) map2.get(str));
            }
            httpURLConnection.setRequestMethod("GET");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            if ((100 <= responseCode && responseCode < 200) || responseCode == 204 || responseCode == 304) {
                HttpResponse httpResponse = new HttpResponse(responseCode, m12843b(httpURLConnection.getHeaderFields()), -1, null);
                httpURLConnection.disconnect();
                return httpResponse;
            }
            try {
                try {
                    return new HttpResponse(responseCode, m12843b(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new UrlConnectionInputStream(httpURLConnection));
                } catch (Throwable th) {
                    th = th;
                    z2 = true;
                    if (!z2) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
