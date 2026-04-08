package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@RestrictTo
public class TypefaceCompatApi29Impl extends TypefaceCompatBaseImpl {
    /* JADX INFO: renamed from: h */
    public static Font m7592h(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : CarouselScreenFragment.CAROUSEL_ANIMATION_MS, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iM7594j = m7594j(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int iM7594j2 = m7594j(fontStyle, font2.getStyle());
            if (iM7594j2 < iM7594j) {
                font = font2;
                iM7594j = iM7594j2;
            }
        }
        return font;
    }

    /* JADX INFO: renamed from: i */
    public static FontFamily m7593i(FontsContractCompat.FontInfo[] fontInfoArr, ContentResolver contentResolver) {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        FontFamily.Builder builder = null;
        for (FontsContractCompat.FontInfo fontInfo : fontInfoArr) {
            try {
                parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(fontInfo.f23298a, "r", null);
            } catch (IOException e) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            }
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                }
            } else {
                try {
                    Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(fontInfo.f23300c).setSlant(fontInfo.f23301d ? 1 : 0).setTtcIndex(fontInfo.f23299b).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (Throwable th) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            parcelFileDescriptorOpenFileDescriptor.close();
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    /* JADX INFO: renamed from: j */
    public static int m7594j(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    /* JADX INFO: renamed from: a */
    public final Typeface mo7580a(Context context, FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry : fontFamilyFilesResourceEntry.f23157a) {
                try {
                    Font fontBuild = new Font.Builder(resources, fontFileResourceEntry.f23163f).setWeight(fontFileResourceEntry.f23159b).setSlant(fontFileResourceEntry.f23160c ? 1 : 0).setTtcIndex(fontFileResourceEntry.f23162e).setFontVariationSettings(fontFileResourceEntry.f23161d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(m7592h(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    /* JADX INFO: renamed from: b */
    public final Typeface mo7581b(Context context, FontsContractCompat.FontInfo[] fontInfoArr, int i) {
        try {
            FontFamily fontFamilyM7593i = m7593i(fontInfoArr, context.getContentResolver());
            if (fontFamilyM7593i == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyM7593i).setStyle(m7592h(fontFamilyM7593i, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    /* JADX INFO: renamed from: c */
    public final Typeface mo7595c(Context context, int i, List list) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyM7593i = m7593i((FontsContractCompat.FontInfo[]) list.get(0), contentResolver);
            if (fontFamilyM7593i == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyM7593i);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily fontFamilyM7593i2 = m7593i((FontsContractCompat.FontInfo[]) list.get(i2), contentResolver);
                if (fontFamilyM7593i2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyM7593i2);
                }
            }
            return customFallbackBuilder.setStyle(m7592h(fontFamilyM7593i, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    /* JADX INFO: renamed from: d */
    public final Typeface mo7596d(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    /* JADX INFO: renamed from: e */
    public final Typeface mo7585e(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    /* JADX INFO: renamed from: g */
    public final FontsContractCompat.FontInfo mo7597g(FontsContractCompat.FontInfo[] fontInfoArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
