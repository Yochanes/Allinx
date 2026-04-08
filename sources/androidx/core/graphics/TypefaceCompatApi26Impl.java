package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@RestrictTo
public class TypefaceCompatApi26Impl extends TypefaceCompatApi21Impl {

    /* JADX INFO: renamed from: g */
    public final Class f23220g;

    /* JADX INFO: renamed from: h */
    public final Constructor f23221h;

    /* JADX INFO: renamed from: i */
    public final Method f23222i;

    /* JADX INFO: renamed from: j */
    public final Method f23223j;

    /* JADX INFO: renamed from: k */
    public final Method f23224k;

    /* JADX INFO: renamed from: l */
    public final Method f23225l;

    /* JADX INFO: renamed from: m */
    public final Method f23226m;

    public TypefaceCompatApi26Impl() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method methodM7584o;
        Method method2;
        Method method3;
        Method methodMo7591p;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            methodM7584o = m7584o(cls);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
            method3 = cls.getMethod("freeze", new Class[0]);
            method = cls.getMethod("abortCreation", new Class[0]);
            methodMo7591p = mo7591p(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            cls = null;
            method = null;
            constructor = null;
            methodM7584o = null;
            method2 = null;
            method3 = null;
            methodMo7591p = null;
        }
        this.f23220g = cls;
        this.f23221h = constructor;
        this.f23222i = methodM7584o;
        this.f23223j = method2;
        this.f23224k = method3;
        this.f23225l = method;
        this.f23226m = methodMo7591p;
    }

    /* JADX INFO: renamed from: o */
    public static Method m7584o(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    @Override // androidx.core.graphics.TypefaceCompatApi21Impl, androidx.core.graphics.TypefaceCompatBaseImpl
    /* JADX INFO: renamed from: a */
    public final Typeface mo7580a(Context context, FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, Resources resources, int i) {
        Method method = this.f23222i;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.mo7580a(context, fontFamilyFilesResourceEntry, resources, i);
        }
        Object objM7590n = m7590n();
        if (objM7590n != null) {
            FontResourcesParserCompat.FontFileResourceEntry[] fontFileResourceEntryArr = fontFamilyFilesResourceEntry.f23157a;
            int length = fontFileResourceEntryArr.length;
            int i2 = 0;
            while (i2 < length) {
                FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry = fontFileResourceEntryArr[i2];
                String str = fontFileResourceEntry.f23158a;
                FontVariationAxis[] fontVariationAxisArrFromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(fontFileResourceEntry.f23161d);
                Context context2 = context;
                if (!m7587k(context2, objM7590n, str, fontFileResourceEntry.f23162e, fontFileResourceEntry.f23159b, fontFileResourceEntry.f23160c ? 1 : 0, fontVariationAxisArrFromFontVariationSettings)) {
                    m7586j(objM7590n);
                    return null;
                }
                i2++;
                context = context2;
            }
            if (m7589m(objM7590n)) {
                return mo7588l(objM7590n);
            }
        }
        return null;
    }

    @Override // androidx.core.graphics.TypefaceCompatApi21Impl, androidx.core.graphics.TypefaceCompatBaseImpl
    /* JADX INFO: renamed from: b */
    public final Typeface mo7581b(Context context, FontsContractCompat.FontInfo[] fontInfoArr, int i) {
        Typeface typefaceMo7588l;
        boolean zBooleanValue;
        if (fontInfoArr.length >= 1) {
            Method method = this.f23222i;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            if (method != null) {
                HashMap map = new HashMap();
                for (FontsContractCompat.FontInfo fontInfo : fontInfoArr) {
                    if (fontInfo.f23302e == 0) {
                        Uri uri = fontInfo.f23298a;
                        if (!map.containsKey(uri)) {
                            map.put(uri, TypefaceCompatUtil.m7605e(context, uri));
                        }
                    }
                }
                Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                Object objM7590n = m7590n();
                if (objM7590n != null) {
                    int length = fontInfoArr.length;
                    int i2 = 0;
                    boolean z2 = false;
                    while (i2 < length) {
                        FontsContractCompat.FontInfo fontInfo2 = fontInfoArr[i2];
                        ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(fontInfo2.f23298a);
                        if (byteBuffer != null) {
                            try {
                                zBooleanValue = ((Boolean) this.f23223j.invoke(objM7590n, byteBuffer, Integer.valueOf(fontInfo2.f23299b), null, Integer.valueOf(fontInfo2.f23300c), Integer.valueOf(fontInfo2.f23301d ? 1 : 0))).booleanValue();
                            } catch (IllegalAccessException | InvocationTargetException unused) {
                                zBooleanValue = false;
                            }
                            if (!zBooleanValue) {
                                m7586j(objM7590n);
                                return null;
                            }
                            z2 = true;
                        }
                        i2++;
                        z2 = z2;
                    }
                    if (!z2) {
                        m7586j(objM7590n);
                        return null;
                    }
                    if (m7589m(objM7590n) && (typefaceMo7588l = mo7588l(objM7590n)) != null) {
                        return Typeface.create(typefaceMo7588l, i);
                    }
                }
            } else {
                FontsContractCompat.FontInfo fontInfoMo7597g = mo7597g(fontInfoArr, i);
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(fontInfoMo7597g.f23298a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(fontInfoMo7597g.f23300c).setItalic(fontInfoMo7597g.f23301d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } finally {
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                } catch (IOException unused2) {
                }
            }
        }
        return null;
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    /* JADX INFO: renamed from: e */
    public final Typeface mo7585e(Context context, Resources resources, int i, String str, int i2) {
        Method method = this.f23222i;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.mo7585e(context, resources, i, str, i2);
        }
        Object objM7590n = m7590n();
        if (objM7590n != null) {
            if (!m7587k(context, objM7590n, str, 0, -1, -1, null)) {
                m7586j(objM7590n);
                return null;
            }
            if (m7589m(objM7590n)) {
                return mo7588l(objM7590n);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m7586j(Object obj) {
        try {
            this.f23225l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m7587k(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f23222i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: l */
    public Typeface mo7588l(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f23220g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f23226m.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m7589m(Object obj) {
        try {
            return ((Boolean) this.f23224k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: n */
    public final Object m7590n() {
        try {
            return this.f23221h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: p */
    public Method mo7591p(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
