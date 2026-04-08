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
public class DomainUrlParser implements UrlParser {
    private Cache<String, String> mCache;

    private String getKey(HttpUrl httpUrl, HttpUrl httpUrl2) {
        return httpUrl.m21256b().concat(httpUrl2.m21256b());
    }

    @Override // me.jessyan.retrofiturlmanager.parser.UrlParser
    public void init(RetrofitUrlManager retrofitUrlManager) {
        this.mCache = new LruCache(100);
    }

    @Override // me.jessyan.retrofiturlmanager.parser.UrlParser
    public HttpUrl parseUrl(HttpUrl httpUrl, HttpUrl httpUrl2) throws EOFException {
        if (httpUrl == null) {
            return httpUrl2;
        }
        HttpUrl.Builder builderM21260f = httpUrl2.m21260f();
        if (TextUtils.isEmpty(this.mCache.get(getKey(httpUrl, httpUrl2)))) {
            for (int i = 0; i < httpUrl2.f57114f.size(); i++) {
                builderM21260f.m21271g();
            }
            ArrayList<String> arrayList = new ArrayList();
            arrayList.addAll(httpUrl.m21257c());
            arrayList.addAll(httpUrl2.m21257c());
            for (String encodedPathSegment : arrayList) {
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
