package androidx.core.provider;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.os.Trace;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.collection.LruCache;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class FontProvider {

    /* JADX INFO: renamed from: a */
    public static final LruCache f23269a = new LruCache(2);

    /* JADX INFO: renamed from: b */
    public static final C1449a f23270b = new C1449a();

    /* JADX INFO: compiled from: Proguard */
    public interface ContentQueryWrapper {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class ContentQueryWrapperApi16Impl implements ContentQueryWrapper {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class ContentQueryWrapperApi24Impl implements ContentQueryWrapper {

        /* JADX INFO: renamed from: a */
        public final ContentProviderClient f23271a;

        public ContentQueryWrapperApi24Impl(Context context, Uri uri) {
            this.f23271a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class ProviderCacheKey {

        /* JADX INFO: renamed from: a */
        public String f23272a;

        /* JADX INFO: renamed from: b */
        public String f23273b;

        /* JADX INFO: renamed from: c */
        public List f23274c;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProviderCacheKey)) {
                return false;
            }
            ProviderCacheKey providerCacheKey = (ProviderCacheKey) obj;
            return Objects.equals(this.f23272a, providerCacheKey.f23272a) && Objects.equals(this.f23273b, providerCacheKey.f23273b) && Objects.equals(this.f23274c, providerCacheKey.f23274c);
        }

        public final int hashCode() {
            return Objects.hash(this.f23272a, this.f23273b, this.f23274c);
        }
    }

    /* JADX INFO: renamed from: a */
    public static FontsContractCompat.FontFamilyResult m7661a(Context context, List list) {
        Trace.beginSection(androidx.tracing.Trace.m11952e("FontProvider.getFontFamilyResult"));
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                FontRequest fontRequest = (FontRequest) list.get(i);
                ProviderInfo providerInfoM7662b = m7662b(context.getPackageManager(), fontRequest, context.getResources());
                if (providerInfoM7662b == null) {
                    return new FontsContractCompat.FontFamilyResult();
                }
                arrayList.add(m7663c(context, fontRequest, providerInfoM7662b.authority));
            }
            return new FontsContractCompat.FontFamilyResult(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: b */
    public static ProviderInfo m7662b(PackageManager packageManager, FontRequest fontRequest, Resources resources) {
        Trace.beginSection(androidx.tracing.Trace.m11952e("FontProvider.getProvider"));
        try {
            List listM7538b = fontRequest.f23278d;
            String str = fontRequest.f23275a;
            String str2 = fontRequest.f23276b;
            if (listM7538b == null) {
                listM7538b = FontResourcesParserCompat.m7538b(resources, 0);
            }
            ProviderCacheKey providerCacheKey = new ProviderCacheKey();
            providerCacheKey.f23272a = str;
            providerCacheKey.f23273b = str2;
            providerCacheKey.f23274c = listM7538b;
            LruCache lruCache = f23269a;
            ProviderInfo providerInfo = (ProviderInfo) lruCache.get(providerCacheKey);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            C1449a c1449a = f23270b;
            Collections.sort(arrayList, c1449a);
            for (int i = 0; i < listM7538b.size(); i++) {
                ArrayList arrayList2 = new ArrayList((Collection) listM7538b.get(i));
                Collections.sort(arrayList2, c1449a);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                            break;
                        }
                    }
                    lruCache.put(providerCacheKey, providerInfoResolveContentProvider);
                    return providerInfoResolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: c */
    public static FontsContractCompat.FontInfo[] m7663c(Context context, FontRequest fontRequest, String str) {
        Trace.beginSection(androidx.tracing.Trace.m11952e("FontProvider.query"));
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme(FirebaseAnalytics.Param.CONTENT).authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme(FirebaseAnalytics.Param.CONTENT).authority(str).appendPath("file").build();
            ContentProviderClient contentProviderClient = new ContentQueryWrapperApi24Impl(context, uriBuild).f23271a;
            Cursor cursorQuery = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                Trace.beginSection(androidx.tracing.Trace.m11952e("ContentQueryWrapper.query"));
                try {
                    String[] strArr2 = {fontRequest.f23277c};
                    if (contentProviderClient != null) {
                        try {
                            cursorQuery = contentProviderClient.query(uriBuild, strArr, "query = ?", strArr2, null, null);
                        } catch (RemoteException e) {
                            Log.w("FontsProvider", "Unable to query the content provider", e);
                        }
                    }
                    Trace.endSection();
                    if (cursorQuery != null && cursorQuery.getCount() > 0) {
                        int columnIndex = cursorQuery.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursorQuery.getColumnIndex("_id");
                        int columnIndex3 = cursorQuery.getColumnIndex("file_id");
                        int columnIndex4 = cursorQuery.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursorQuery.getColumnIndex("font_weight");
                        int columnIndex6 = cursorQuery.getColumnIndex("font_italic");
                        while (cursorQuery.moveToNext()) {
                            int i = columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0;
                            arrayList2.add(new FontsContractCompat.FontInfo(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3)), columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : CarouselScreenFragment.CAROUSEL_ANIMATION_MS, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == 1, i));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (contentProviderClient != null) {
                        contentProviderClient.close();
                    }
                    return (FontsContractCompat.FontInfo[]) arrayList.toArray(new FontsContractCompat.FontInfo[0]);
                } finally {
                }
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (contentProviderClient != null) {
                    contentProviderClient.close();
                }
                throw th;
            }
        } finally {
        }
    }
}
