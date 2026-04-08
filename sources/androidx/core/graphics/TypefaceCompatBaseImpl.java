package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class TypefaceCompatBaseImpl {

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f23227a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: androidx.core.graphics.TypefaceCompatBaseImpl$1 */
    /* JADX INFO: compiled from: Proguard */
    class C14331 implements StyleExtractor<FontsContractCompat.FontInfo> {
        @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
        /* JADX INFO: renamed from: a */
        public final int mo7599a(Object obj) {
            return ((FontsContractCompat.FontInfo) obj).f23300c;
        }

        @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
        /* JADX INFO: renamed from: b */
        public final boolean mo7600b(Object obj) {
            return ((FontsContractCompat.FontInfo) obj).f23301d;
        }
    }

    /* JADX INFO: renamed from: androidx.core.graphics.TypefaceCompatBaseImpl$2 */
    /* JADX INFO: compiled from: Proguard */
    class C14342 implements StyleExtractor<FontResourcesParserCompat.FontFileResourceEntry> {
        @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
        /* JADX INFO: renamed from: a */
        public final int mo7599a(Object obj) {
            return ((FontResourcesParserCompat.FontFileResourceEntry) obj).f23159b;
        }

        @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
        /* JADX INFO: renamed from: b */
        public final boolean mo7600b(Object obj) {
            return ((FontResourcesParserCompat.FontFileResourceEntry) obj).f23160c;
        }
    }

    /* JADX INFO: renamed from: androidx.core.graphics.TypefaceCompatBaseImpl$3 */
    /* JADX INFO: compiled from: Proguard */
    class C14353 implements StyleExtractor<FontResourcesParserCompat.FontFileResourceEntry> {
        @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
        /* JADX INFO: renamed from: a */
        public final int mo7599a(Object obj) {
            return ((FontResourcesParserCompat.FontFileResourceEntry) obj).f23159b;
        }

        @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
        /* JADX INFO: renamed from: b */
        public final boolean mo7600b(Object obj) {
            return ((FontResourcesParserCompat.FontFileResourceEntry) obj).f23160c;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface StyleExtractor<T> {
        /* JADX INFO: renamed from: a */
        int mo7599a(Object obj);

        /* JADX INFO: renamed from: b */
        boolean mo7600b(Object obj);
    }

    /* JADX INFO: renamed from: f */
    public static Object m7598f(Object[] objArr, int i, StyleExtractor styleExtractor) {
        int i2 = (i & 1) == 0 ? CarouselScreenFragment.CAROUSEL_ANIMATION_MS : 700;
        boolean z2 = (i & 2) != 0;
        Object obj = null;
        int i3 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int iAbs = (Math.abs(styleExtractor.mo7599a(obj2) - i2) * 2) + (styleExtractor.mo7600b(obj2) == z2 ? 0 : 1);
            if (obj == null || i3 > iAbs) {
                obj = obj2;
                i3 = iAbs;
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: a */
    public Typeface mo7580a(Context context, FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, Resources resources, int i) {
        long jLongValue;
        FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry = (FontResourcesParserCompat.FontFileResourceEntry) m7598f(fontFamilyFilesResourceEntry.f23157a, i, new C14342());
        if (fontFileResourceEntry == null) {
            return null;
        }
        Typeface typefaceM7576d = TypefaceCompat.m7576d(context, resources, fontFileResourceEntry.f23163f, fontFileResourceEntry.f23158a, 0, i);
        if (typefaceM7576d == null) {
            jLongValue = 0;
        } else {
            try {
                Field declaredField = Typeface.class.getDeclaredField("native_instance");
                declaredField.setAccessible(true);
                jLongValue = ((Number) declaredField.get(typefaceM7576d)).longValue();
            } catch (IllegalAccessException e) {
                Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e);
                jLongValue = 0;
            } catch (NoSuchFieldException e2) {
                Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
                jLongValue = 0;
            }
        }
        if (jLongValue != 0) {
            this.f23227a.put(Long.valueOf(jLongValue), fontFamilyFilesResourceEntry);
        }
        return typefaceM7576d;
    }

    /* JADX INFO: renamed from: b */
    public Typeface mo7581b(Context context, FontsContractCompat.FontInfo[] fontInfoArr, int i) throws Throwable {
        InputStream inputStreamOpenInputStream;
        InputStream inputStream = null;
        if (fontInfoArr.length < 1) {
            return null;
        }
        try {
            inputStreamOpenInputStream = context.getContentResolver().openInputStream(mo7597g(fontInfoArr, i).f23298a);
            try {
                Typeface typefaceMo7596d = mo7596d(context, inputStreamOpenInputStream);
                TypefaceCompatUtil.m7601a(inputStreamOpenInputStream);
                return typefaceMo7596d;
            } catch (IOException unused) {
                TypefaceCompatUtil.m7601a(inputStreamOpenInputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream = inputStreamOpenInputStream;
                TypefaceCompatUtil.m7601a(inputStream);
                throw th;
            }
        } catch (IOException unused2) {
            inputStreamOpenInputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: c */
    public Typeface mo7595c(Context context, int i, List list) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    /* JADX INFO: renamed from: d */
    public Typeface mo7596d(Context context, InputStream inputStream) {
        File fileM7604d = TypefaceCompatUtil.m7604d(context);
        if (fileM7604d == null) {
            return null;
        }
        try {
            if (TypefaceCompatUtil.m7603c(inputStream, fileM7604d)) {
                return Typeface.createFromFile(fileM7604d.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM7604d.delete();
        }
    }

    /* JADX INFO: renamed from: e */
    public Typeface mo7585e(Context context, Resources resources, int i, String str, int i2) {
        File fileM7604d = TypefaceCompatUtil.m7604d(context);
        if (fileM7604d == null) {
            return null;
        }
        try {
            if (TypefaceCompatUtil.m7602b(fileM7604d, resources, i)) {
                return Typeface.createFromFile(fileM7604d.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM7604d.delete();
        }
    }

    /* JADX INFO: renamed from: g */
    public FontsContractCompat.FontInfo mo7597g(FontsContractCompat.FontInfo[] fontInfoArr, int i) {
        return (FontsContractCompat.FontInfo) m7598f(fontInfoArr, i, new C14331());
    }
}
