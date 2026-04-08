package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@RestrictTo
class TypefaceCompatApi21Impl extends TypefaceCompatBaseImpl {

    /* JADX INFO: renamed from: b */
    public static Class f23211b = null;

    /* JADX INFO: renamed from: c */
    public static Constructor f23212c = null;

    /* JADX INFO: renamed from: d */
    public static Method f23213d = null;

    /* JADX INFO: renamed from: e */
    public static Method f23214e = null;

    /* JADX INFO: renamed from: f */
    public static boolean f23215f = false;

    /* JADX INFO: renamed from: h */
    public static boolean m7578h(boolean z2, String str, int i, Object obj) {
        m7579i();
        try {
            return ((Boolean) f23213d.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m7579i() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f23215f) {
            return;
        }
        f23215f = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f23212c = constructor;
        f23211b = cls;
        f23213d = method2;
        f23214e = method;
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    /* JADX INFO: renamed from: a */
    public Typeface mo7580a(Context context, FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, Resources resources, int i) {
        m7579i();
        try {
            Object objNewInstance = f23212c.newInstance(new Object[0]);
            for (FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry : fontFamilyFilesResourceEntry.f23157a) {
                File fileM7604d = TypefaceCompatUtil.m7604d(context);
                if (fileM7604d == null) {
                    return null;
                }
                try {
                    if (!TypefaceCompatUtil.m7602b(fileM7604d, resources, fontFileResourceEntry.f23163f)) {
                        return null;
                    }
                    if (!m7578h(fontFileResourceEntry.f23160c, fileM7604d.getPath(), fontFileResourceEntry.f23159b, objNewInstance)) {
                        return null;
                    }
                    fileM7604d.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileM7604d.delete();
                }
            }
            m7579i();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) f23211b, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f23214e.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    /* JADX INFO: renamed from: b */
    public Typeface mo7581b(Context context, FontsContractCompat.FontInfo[] fontInfoArr, int i) {
        String str;
        if (fontInfoArr.length >= 1) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(mo7597g(fontInfoArr, i).f23298a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        try {
                            str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                        } finally {
                        }
                    } catch (ErrnoException unused) {
                    }
                    File file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                    if (file != null && file.canRead()) {
                        Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceCreateFromFile;
                    }
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        Typeface typefaceMo7596d = mo7596d(context, fileInputStream);
                        fileInputStream.close();
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceMo7596d;
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
        return null;
    }
}
