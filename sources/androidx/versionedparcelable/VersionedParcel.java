package androidx.versionedparcelable;

import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public abstract class VersionedParcel {

    /* JADX INFO: renamed from: a */
    public final ArrayMap f32410a;

    /* JADX INFO: renamed from: b */
    public final ArrayMap f32411b;

    /* JADX INFO: renamed from: c */
    public final ArrayMap f32412c;

    /* JADX INFO: renamed from: androidx.versionedparcelable.VersionedParcel$1 */
    /* JADX INFO: compiled from: Proguard */
    class C22391 extends ObjectInputStream {
        @Override // java.io.ObjectInputStream
        public final Class resolveClass(ObjectStreamClass objectStreamClass) throws ClassNotFoundException {
            Class<?> cls = Class.forName(objectStreamClass.getName(), false, getClass().getClassLoader());
            return cls != null ? cls : super.resolveClass(objectStreamClass);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class ParcelException extends RuntimeException {
    }

    public VersionedParcel(ArrayMap arrayMap, ArrayMap arrayMap2, ArrayMap arrayMap3) {
        this.f32410a = arrayMap;
        this.f32411b = arrayMap2;
        this.f32412c = arrayMap3;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo12036a();

    /* JADX INFO: renamed from: b */
    public abstract VersionedParcel mo12037b();

    /* JADX INFO: renamed from: c */
    public final Class m12038c(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        ArrayMap arrayMap = this.f32412c;
        Class cls2 = (Class) arrayMap.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        arrayMap.put(cls.getName(), cls3);
        return cls3;
    }

    /* JADX INFO: renamed from: d */
    public final Method m12039d(String str) throws NoSuchMethodException {
        ArrayMap arrayMap = this.f32410a;
        Method method = (Method) arrayMap.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, VersionedParcel.class.getClassLoader()).getDeclaredMethod("read", VersionedParcel.class);
        arrayMap.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: e */
    public final Method m12040e(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        ArrayMap arrayMap = this.f32411b;
        Method method = (Method) arrayMap.get(name);
        if (method != null) {
            return method;
        }
        Class clsM12038c = m12038c(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsM12038c.getDeclaredMethod("write", cls, VersionedParcel.class);
        arrayMap.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: f */
    public boolean m12041f() {
        return this instanceof VersionedParcelStream;
    }

    /* JADX INFO: renamed from: g */
    public abstract boolean mo12042g();

    /* JADX INFO: renamed from: h */
    public abstract byte[] mo12043h();

    /* JADX INFO: renamed from: i */
    public abstract CharSequence mo12044i();

    /* JADX INFO: renamed from: j */
    public abstract boolean mo12045j(int i);

    /* JADX INFO: renamed from: k */
    public abstract int mo12046k();

    /* JADX INFO: renamed from: l */
    public abstract Parcelable mo12047l();

    /* JADX INFO: renamed from: m */
    public abstract String mo12048m();

    /* JADX INFO: renamed from: n */
    public final VersionedParcelable m12049n() {
        String strMo12048m = mo12048m();
        if (strMo12048m == null) {
            return null;
        }
        try {
            return (VersionedParcelable) m12039d(strMo12048m).invoke(null, mo12037b());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    /* JADX INFO: renamed from: o */
    public abstract void mo12050o(int i);

    /* JADX INFO: renamed from: q */
    public abstract void mo12052q(boolean z2);

    /* JADX INFO: renamed from: r */
    public abstract void mo12053r(byte[] bArr);

    /* JADX INFO: renamed from: s */
    public abstract void mo12054s(CharSequence charSequence);

    /* JADX INFO: renamed from: t */
    public abstract void mo12055t(int i);

    /* JADX INFO: renamed from: u */
    public abstract void mo12056u(Parcelable parcelable);

    /* JADX INFO: renamed from: v */
    public abstract void mo12057v(String str);

    /* JADX INFO: renamed from: w */
    public final void m12058w(VersionedParcelable versionedParcelable) {
        if (versionedParcelable == null) {
            mo12057v(null);
            return;
        }
        try {
            mo12057v(m12038c(versionedParcelable.getClass()).getName());
            VersionedParcel versionedParcelMo12037b = mo12037b();
            try {
                m12040e(versionedParcelable.getClass()).invoke(null, versionedParcelable, versionedParcelMo12037b);
                versionedParcelMo12037b.mo12036a();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(versionedParcelable.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }

    /* JADX INFO: renamed from: p */
    public void mo12051p(boolean z2, boolean z3) {
    }
}
