package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.SimpleArrayMap;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@RestrictTo
class TypefaceCompatApi24Impl extends TypefaceCompatBaseImpl {

    /* JADX INFO: renamed from: b */
    public static final Class f23216b;

    /* JADX INFO: renamed from: c */
    public static final Constructor f23217c;

    /* JADX INFO: renamed from: d */
    public static final Method f23218d;

    /* JADX INFO: renamed from: e */
    public static final Method f23219e;

    static {
        Class<?> cls;
        Constructor<?> constructor;
        Method method;
        Method method2;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class cls2 = Integer.TYPE;
            method = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            constructor = null;
            method = null;
            method2 = null;
        }
        f23217c = constructor;
        f23216b = cls;
        f23218d = method;
        f23219e = method2;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m7582h(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z2) {
        try {
            return ((Boolean) f23218d.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: i */
    public static Typeface m7583i(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f23216b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f23219e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0068 A[SYNTHETIC] */
    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Typeface mo7580a(Context context, FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, Resources resources, int i) {
        Object objNewInstance;
        MappedByteBuffer map;
        FileInputStream fileInputStream;
        try {
            objNewInstance = f23217c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            for (FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry : fontFamilyFilesResourceEntry.f23157a) {
                int i2 = fontFileResourceEntry.f23163f;
                File fileM7604d = TypefaceCompatUtil.m7604d(context);
                if (fileM7604d != null) {
                    try {
                        if (TypefaceCompatUtil.m7602b(fileM7604d, resources, i2)) {
                            try {
                                fileInputStream = new FileInputStream(fileM7604d);
                            } catch (IOException unused2) {
                                map = null;
                            }
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                if (map == null) {
                                    if (m7582h(objNewInstance, map, fontFileResourceEntry.f23162e, fontFileResourceEntry.f23159b, fontFileResourceEntry.f23160c)) {
                                    }
                                }
                            } finally {
                            }
                        }
                    } finally {
                        fileM7604d.delete();
                    }
                }
                map = null;
                if (map == null) {
                }
            }
            return m7583i(objNewInstance);
        }
        return null;
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    /* JADX INFO: renamed from: b */
    public final Typeface mo7581b(Context context, FontsContractCompat.FontInfo[] fontInfoArr, int i) {
        Object objNewInstance;
        int i2 = 0;
        try {
            objNewInstance = f23217c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            SimpleArrayMap simpleArrayMap = new SimpleArrayMap(0);
            int length = fontInfoArr.length;
            while (true) {
                if (i2 >= length) {
                    Typeface typefaceM7583i = m7583i(objNewInstance);
                    if (typefaceM7583i != null) {
                        return Typeface.create(typefaceM7583i, i);
                    }
                } else {
                    FontsContractCompat.FontInfo fontInfo = fontInfoArr[i2];
                    Uri uri = fontInfo.f23298a;
                    ByteBuffer byteBufferM7605e = (ByteBuffer) simpleArrayMap.get(uri);
                    if (byteBufferM7605e == null) {
                        byteBufferM7605e = TypefaceCompatUtil.m7605e(context, uri);
                        simpleArrayMap.put(uri, byteBufferM7605e);
                    }
                    if (byteBufferM7605e == null) {
                        break;
                    }
                    if (!m7582h(objNewInstance, byteBufferM7605e, fontInfo.f23299b, fontInfo.f23300c, fontInfo.f23301d)) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return null;
    }
}
