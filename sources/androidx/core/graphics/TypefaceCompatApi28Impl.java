package androidx.core.graphics;

import android.graphics.Typeface;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@RestrictTo
public class TypefaceCompatApi28Impl extends TypefaceCompatApi26Impl {
    @Override // androidx.core.graphics.TypefaceCompatApi26Impl
    /* JADX INFO: renamed from: l */
    public final Typeface mo7588l(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f23220g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f23226m.invoke(null, objNewInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // androidx.core.graphics.TypefaceCompatApi26Impl
    /* JADX INFO: renamed from: p */
    public final Method mo7591p(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
