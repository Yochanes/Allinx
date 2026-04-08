package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Trace;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.collection.LruCache;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.provider.FontRequest;
import androidx.core.provider.FontsContractCompat;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class TypefaceCompat {

    /* JADX INFO: renamed from: a */
    public static final TypefaceCompatBaseImpl f23208a;

    /* JADX INFO: renamed from: b */
    public static final LruCache f23209b;

    /* JADX INFO: compiled from: Proguard */
    @RestrictTo
    public static class ResourcesCallbackAdapter extends FontsContractCompat.FontRequestCallback {

        /* JADX INFO: renamed from: a */
        public ResourcesCompat.FontCallback f23210a;
    }

    static {
        Trace.beginSection(androidx.tracing.Trace.m11952e("TypefaceCompat static init"));
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f23208a = new TypefaceCompatApi29Impl();
        } else if (i >= 28) {
            f23208a = new TypefaceCompatApi28Impl();
        } else if (i >= 26) {
            f23208a = new TypefaceCompatApi26Impl();
        } else {
            Method method = TypefaceCompatApi24Impl.f23218d;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f23208a = new TypefaceCompatApi24Impl();
            } else {
                f23208a = new TypefaceCompatApi21Impl();
            }
        }
        f23209b = new LruCache(16);
        Trace.endSection();
    }

    /* JADX INFO: renamed from: a */
    public static Typeface m7573a(Context context, FontsContractCompat.FontInfo[] fontInfoArr, int i) {
        Trace.beginSection(androidx.tracing.Trace.m11952e("TypefaceCompat.createFromFontInfo"));
        try {
            return f23208a.mo7581b(context, fontInfoArr, i);
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: b */
    public static Typeface m7574b(Context context, int i, List list) {
        Trace.beginSection(androidx.tracing.Trace.m11952e("TypefaceCompat.createFromFontInfoWithFallback"));
        try {
            return f23208a.mo7595c(context, i, list);
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface m7575c(Context context, FontResourcesParserCompat.FamilyResourceEntry familyResourceEntry, Resources resources, int i, String str, int i2, int i3, ResourcesCompat.FontCallback fontCallback, boolean z2) {
        Typeface typefaceMo7580a;
        Typeface typefaceCreate;
        List listUnmodifiableList;
        if (familyResourceEntry instanceof FontResourcesParserCompat.ProviderResourceEntry) {
            FontResourcesParserCompat.ProviderResourceEntry providerResourceEntry = (FontResourcesParserCompat.ProviderResourceEntry) familyResourceEntry;
            String str2 = providerResourceEntry.f23168e;
            if (str2 == null || str2.isEmpty()) {
                typefaceCreate = null;
                if (typefaceCreate == null) {
                    if (fontCallback != null) {
                        fontCallback.callbackSuccessAsync(typefaceCreate, null);
                    }
                    return typefaceCreate;
                }
                boolean z3 = !z2 ? fontCallback != null : providerResourceEntry.f23167d != 0;
                int i4 = z2 ? providerResourceEntry.f23166c : -1;
                Handler handler = ResourcesCompat.FontCallback.getHandler(null);
                ResourcesCallbackAdapter resourcesCallbackAdapter = new ResourcesCallbackAdapter();
                resourcesCallbackAdapter.f23210a = fontCallback;
                FontRequest fontRequest = providerResourceEntry.f23164a;
                FontRequest fontRequest2 = providerResourceEntry.f23165b;
                if (fontRequest2 != null) {
                    Object[] objArr = {fontRequest, fontRequest2};
                    ArrayList arrayList = new ArrayList(2);
                    for (int i5 = 0; i5 < 2; i5++) {
                        Object obj = objArr[i5];
                        Objects.requireNonNull(obj);
                        arrayList.add(obj);
                    }
                    listUnmodifiableList = Collections.unmodifiableList(arrayList);
                } else {
                    Object[] objArr2 = {fontRequest};
                    ArrayList arrayList2 = new ArrayList(1);
                    Object obj2 = objArr2[0];
                    Objects.requireNonNull(obj2);
                    arrayList2.add(obj2);
                    listUnmodifiableList = Collections.unmodifiableList(arrayList2);
                }
                typefaceMo7580a = FontsContractCompat.m7667b(context, listUnmodifiableList, i3, z3, i4, handler, resourcesCallbackAdapter);
            } else {
                typefaceCreate = Typeface.create(str2, 0);
                Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
                if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                }
                if (typefaceCreate == null) {
                }
            }
        } else {
            typefaceMo7580a = f23208a.mo7580a(context, (FontResourcesParserCompat.FontFamilyFilesResourceEntry) familyResourceEntry, resources, i3);
            if (fontCallback != null) {
                if (typefaceMo7580a != null) {
                    fontCallback.callbackSuccessAsync(typefaceMo7580a, null);
                } else {
                    fontCallback.callbackFailAsync(-3, null);
                }
            }
        }
        if (typefaceMo7580a != null) {
            f23209b.put(m7577e(resources, i, str, i2, i3), typefaceMo7580a);
        }
        return typefaceMo7580a;
    }

    /* JADX INFO: renamed from: d */
    public static Typeface m7576d(Context context, Resources resources, int i, String str, int i2, int i3) {
        Typeface typefaceMo7585e = f23208a.mo7585e(context, resources, i, str, i3);
        if (typefaceMo7585e != null) {
            f23209b.put(m7577e(resources, i, str, i2, i3), typefaceMo7585e);
        }
        return typefaceMo7585e;
    }

    /* JADX INFO: renamed from: e */
    public static String m7577e(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
