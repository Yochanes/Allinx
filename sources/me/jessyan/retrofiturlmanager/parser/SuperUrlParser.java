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
public class SuperUrlParser implements UrlParser {
    private Cache<String, String> mCache;
    private RetrofitUrlManager mRetrofitUrlManager;

    private String getKey(HttpUrl httpUrl, HttpUrl httpUrl2, int i) {
        return httpUrl.m21256b() + httpUrl2.m21256b() + i;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int resolvePathSize(HttpUrl httpUrl, HttpUrl.Builder builder) throws EOFException {
        int i;
        String str = httpUrl.f57116h;
        StringBuffer stringBuffer = new StringBuffer();
        if (str.indexOf("#") == -1) {
            String[] strArrSplit = str.split("=");
            i = strArrSplit.length > 1 ? Integer.parseInt(strArrSplit[1]) : 0;
        } else if (str.indexOf(RetrofitUrlManager.IDENTIFICATION_PATH_SIZE) == -1) {
            int iIndexOf = str.indexOf("#");
            stringBuffer.append(str.substring(iIndexOf + 1, str.length()));
            String[] strArrSplit2 = str.substring(0, iIndexOf).split("=");
            if (strArrSplit2.length > 1) {
                i = Integer.parseInt(strArrSplit2[1]);
            }
        } else {
            String[] strArrSplit3 = str.split(RetrofitUrlManager.IDENTIFICATION_PATH_SIZE);
            stringBuffer.append(strArrSplit3[0]);
            if (strArrSplit3.length > 1) {
                int iIndexOf2 = strArrSplit3[1].indexOf("#");
                if (iIndexOf2 != -1) {
                    String str2 = strArrSplit3[1];
                    stringBuffer.append(str2.substring(iIndexOf2, str2.length()));
                    String strSubstring = strArrSplit3[1].substring(0, iIndexOf2);
                    if (!TextUtils.isEmpty(strSubstring)) {
                        i = Integer.parseInt(strSubstring);
                    }
                } else {
                    i = Integer.parseInt(strArrSplit3[1]);
                }
            }
        }
        String strM21274a = null;
        if (TextUtils.isEmpty(stringBuffer.toString())) {
            builder.f57126h = null;
            return i;
        }
        String string = stringBuffer.toString();
        if (string != null) {
            builder.getClass();
            strM21274a = HttpUrl.Companion.m21274a(string, 0, 0, "", 187);
        }
        builder.f57126h = strM21274a;
        return i;
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
        int iResolvePathSize = resolvePathSize(httpUrl2, builderM21260f);
        if (TextUtils.isEmpty(this.mCache.get(getKey(httpUrl, httpUrl2, iResolvePathSize)))) {
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
            if (arrayList.size() > iResolvePathSize) {
                ArrayList arrayListM21257c = httpUrl2.m21257c();
                for (int i2 = iResolvePathSize; i2 < arrayListM21257c.size(); i2++) {
                    arrayList2.add(arrayListM21257c.get(i2));
                }
            } else if (arrayList.size() < iResolvePathSize) {
                throw new IllegalArgumentException(String.format("Your final path is %s, the pathSize = %d, but the #baseurl_path_size = %d, #baseurl_path_size must be less than or equal to pathSize of the final path", httpUrl2.f57109a + "://" + httpUrl2.f57112d + httpUrl2.m21256b(), Integer.valueOf(arrayList.size()), Integer.valueOf(iResolvePathSize)));
            }
            for (String encodedPathSegment : arrayList2) {
                Intrinsics.m18599g(encodedPathSegment, "encodedPathSegment");
                builderM21260f.m21270f(encodedPathSegment, 0, encodedPathSegment.length(), false);
            }
        } else {
            builderM21260f.m21266b(this.mCache.get(getKey(httpUrl, httpUrl2, iResolvePathSize)));
        }
        builderM21260f.m21273i(httpUrl.f57109a);
        builderM21260f.m21267c(httpUrl.f57112d);
        builderM21260f.m21269e(httpUrl.f57113e);
        HttpUrl httpUrlM21265a = builderM21260f.m21265a();
        if (TextUtils.isEmpty(this.mCache.get(getKey(httpUrl, httpUrl2, iResolvePathSize)))) {
            this.mCache.put(getKey(httpUrl, httpUrl2, iResolvePathSize), httpUrlM21265a.m21256b());
        }
        return httpUrlM21265a;
    }
}
