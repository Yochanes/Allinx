package androidx.datastore.preferences.protobuf;

import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class UnsafeUtil {

    /* JADX INFO: renamed from: a */
    public static final Logger f24152a = Logger.getLogger(UnsafeUtil.class.getName());

    /* JADX INFO: renamed from: b */
    public static final Unsafe f24153b;

    /* JADX INFO: renamed from: c */
    public static final Class f24154c;

    /* JADX INFO: renamed from: d */
    public static final MemoryAccessor f24155d;

    /* JADX INFO: renamed from: e */
    public static final boolean f24156e;

    /* JADX INFO: renamed from: f */
    public static final boolean f24157f;

    /* JADX INFO: renamed from: g */
    public static final long f24158g;

    /* JADX INFO: renamed from: h */
    public static final long f24159h;

    /* JADX INFO: renamed from: i */
    public static final boolean f24160i;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.UnsafeUtil$1 */
    /* JADX INFO: compiled from: Proguard */
    final class C16001 implements PrivilegedExceptionAction<Unsafe> {
        /* JADX INFO: renamed from: a */
        public static Unsafe m8678a() throws IllegalAccessException {
            for (java.lang.reflect.Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }

        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Unsafe run() {
            return m8678a();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Android32MemoryAccessor extends MemoryAccessor {
        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        /* JADX INFO: renamed from: c */
        public final void mo8679c(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        /* JADX INFO: renamed from: d */
        public final void mo8680d(byte[] bArr, long j, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        /* JADX INFO: renamed from: e */
        public final boolean mo8681e(Object obj, long j) {
            return UnsafeUtil.f24160i ? UnsafeUtil.m8668g(obj, j) != 0 : UnsafeUtil.m8669h(obj, j) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        /* JADX INFO: renamed from: f */
        public final byte mo8682f(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        /* JADX INFO: renamed from: g */
        public final byte mo8683g(Object obj, long j) {
            return UnsafeUtil.f24160i ? UnsafeUtil.m8668g(obj, j) : UnsafeUtil.m8669h(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        /* JADX INFO: renamed from: h */
        public final double mo8684h(Object obj, long j) {
            return Double.longBitsToDouble(m8695l(obj, j));
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        /* JADX INFO: renamed from: i */
        public final float mo8685i(Object obj, long j) {
            return Float.intBitsToFloat(m8694j(obj, j));
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        /* JADX INFO: renamed from: k */
        public final long mo8686k(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        /* JADX INFO: renamed from: o */
        public final void mo8687o(Object obj, long j, boolean z2) {
            if (UnsafeUtil.f24160i) {
                UnsafeUtil.m8673l(obj, j, z2 ? (byte) 1 : (byte) 0);
            } else {
                UnsafeUtil.m8674m(obj, j, z2 ? (byte) 1 : (byte) 0);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        /* JADX INFO: renamed from: p */
        public final void mo8688p(long j, byte b2) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        /* JADX INFO: renamed from: q */
        public final void mo8689q(Object obj, long j, byte b2) {
            if (UnsafeUtil.f24160i) {
                UnsafeUtil.m8673l(obj, j, b2);
            } else {
                UnsafeUtil.m8674m(obj, j, b2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        /* JADX INFO: renamed from: r */
        public final void mo8690r(Object obj, long j, double d) {
            m8699u(obj, j, Double.doubleToLongBits(d));
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        /* JADX INFO: renamed from: s */
        public final void mo8691s(Object obj, long j, float f) {
            m8698t(obj, j, Float.floatToIntBits(f));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Android64MemoryAccessor extends MemoryAccessor {
        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        /* JADX INFO: renamed from: c */
        public final void mo8679c(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        /* JADX INFO: renamed from: d */
        public final void mo8680d(byte[] bArr, long j, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        /* JADX INFO: renamed from: e */
        public final boolean mo8681e(Object obj, long j) {
            return UnsafeUtil.f24160i ? UnsafeUtil.m8668g(obj, j) != 0 : UnsafeUtil.m8669h(obj, j) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        /* JADX INFO: renamed from: f */
        public final byte mo8682f(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        /* JADX INFO: renamed from: g */
        public final byte mo8683g(Object obj, long j) {
            return UnsafeUtil.f24160i ? UnsafeUtil.m8668g(obj, j) : UnsafeUtil.m8669h(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        /* JADX INFO: renamed from: h */
        public final double mo8684h(Object obj, long j) {
            return Double.longBitsToDouble(m8695l(obj, j));
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        /* JADX INFO: renamed from: i */
        public final float mo8685i(Object obj, long j) {
            return Float.intBitsToFloat(m8694j(obj, j));
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        /* JADX INFO: renamed from: k */
        public final long mo8686k(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        /* JADX INFO: renamed from: o */
        public final void mo8687o(Object obj, long j, boolean z2) {
            if (UnsafeUtil.f24160i) {
                UnsafeUtil.m8673l(obj, j, z2 ? (byte) 1 : (byte) 0);
            } else {
                UnsafeUtil.m8674m(obj, j, z2 ? (byte) 1 : (byte) 0);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        /* JADX INFO: renamed from: p */
        public final void mo8688p(long j, byte b2) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        /* JADX INFO: renamed from: q */
        public final void mo8689q(Object obj, long j, byte b2) {
            if (UnsafeUtil.f24160i) {
                UnsafeUtil.m8673l(obj, j, b2);
            } else {
                UnsafeUtil.m8674m(obj, j, b2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        /* JADX INFO: renamed from: r */
        public final void mo8690r(Object obj, long j, double d) {
            m8699u(obj, j, Double.doubleToLongBits(d));
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        /* JADX INFO: renamed from: s */
        public final void mo8691s(Object obj, long j, float f) {
            m8698t(obj, j, Float.floatToIntBits(f));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class JvmMemoryAccessor extends MemoryAccessor {
        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        /* JADX INFO: renamed from: c */
        public final void mo8679c(long j, byte[] bArr, long j2, long j3) {
            this.f24161a.copyMemory((Object) null, j, bArr, UnsafeUtil.f24158g + j2, j3);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        /* JADX INFO: renamed from: d */
        public final void mo8680d(byte[] bArr, long j, long j2, long j3) {
            this.f24161a.copyMemory(bArr, UnsafeUtil.f24158g + j, (Object) null, j2, j3);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        /* JADX INFO: renamed from: e */
        public final boolean mo8681e(Object obj, long j) {
            return this.f24161a.getBoolean(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        /* JADX INFO: renamed from: f */
        public final byte mo8682f(long j) {
            return this.f24161a.getByte(j);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        /* JADX INFO: renamed from: g */
        public final byte mo8683g(Object obj, long j) {
            return this.f24161a.getByte(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        /* JADX INFO: renamed from: h */
        public final double mo8684h(Object obj, long j) {
            return this.f24161a.getDouble(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        /* JADX INFO: renamed from: i */
        public final float mo8685i(Object obj, long j) {
            return this.f24161a.getFloat(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        /* JADX INFO: renamed from: k */
        public final long mo8686k(long j) {
            return this.f24161a.getLong(j);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        /* JADX INFO: renamed from: o */
        public final void mo8687o(Object obj, long j, boolean z2) {
            this.f24161a.putBoolean(obj, j, z2);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        /* JADX INFO: renamed from: p */
        public final void mo8688p(long j, byte b2) {
            this.f24161a.putByte(j, b2);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        /* JADX INFO: renamed from: q */
        public final void mo8689q(Object obj, long j, byte b2) {
            this.f24161a.putByte(obj, j, b2);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        /* JADX INFO: renamed from: r */
        public final void mo8690r(Object obj, long j, double d) {
            this.f24161a.putDouble(obj, j, d);
        }

        @Override // androidx.datastore.preferences.protobuf.UnsafeUtil.MemoryAccessor
        /* JADX INFO: renamed from: s */
        public final void mo8691s(Object obj, long j, float f) {
            this.f24161a.putFloat(obj, j, f);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class MemoryAccessor {

        /* JADX INFO: renamed from: a */
        public final Unsafe f24161a;

        public MemoryAccessor(Unsafe unsafe) {
            this.f24161a = unsafe;
        }

        /* JADX INFO: renamed from: a */
        public final int m8692a(Class cls) {
            return this.f24161a.arrayBaseOffset(cls);
        }

        /* JADX INFO: renamed from: b */
        public final int m8693b(Class cls) {
            return this.f24161a.arrayIndexScale(cls);
        }

        /* JADX INFO: renamed from: c */
        public abstract void mo8679c(long j, byte[] bArr, long j2, long j3);

        /* JADX INFO: renamed from: d */
        public abstract void mo8680d(byte[] bArr, long j, long j2, long j3);

        /* JADX INFO: renamed from: e */
        public abstract boolean mo8681e(Object obj, long j);

        /* JADX INFO: renamed from: f */
        public abstract byte mo8682f(long j);

        /* JADX INFO: renamed from: g */
        public abstract byte mo8683g(Object obj, long j);

        /* JADX INFO: renamed from: h */
        public abstract double mo8684h(Object obj, long j);

        /* JADX INFO: renamed from: i */
        public abstract float mo8685i(Object obj, long j);

        /* JADX INFO: renamed from: j */
        public final int m8694j(Object obj, long j) {
            return this.f24161a.getInt(obj, j);
        }

        /* JADX INFO: renamed from: k */
        public abstract long mo8686k(long j);

        /* JADX INFO: renamed from: l */
        public final long m8695l(Object obj, long j) {
            return this.f24161a.getLong(obj, j);
        }

        /* JADX INFO: renamed from: m */
        public final Object m8696m(Object obj, long j) {
            return this.f24161a.getObject(obj, j);
        }

        /* JADX INFO: renamed from: n */
        public final long m8697n(java.lang.reflect.Field field) {
            return this.f24161a.objectFieldOffset(field);
        }

        /* JADX INFO: renamed from: o */
        public abstract void mo8687o(Object obj, long j, boolean z2);

        /* JADX INFO: renamed from: p */
        public abstract void mo8688p(long j, byte b2);

        /* JADX INFO: renamed from: q */
        public abstract void mo8689q(Object obj, long j, byte b2);

        /* JADX INFO: renamed from: r */
        public abstract void mo8690r(Object obj, long j, double d);

        /* JADX INFO: renamed from: s */
        public abstract void mo8691s(Object obj, long j, float f);

        /* JADX INFO: renamed from: t */
        public final void m8698t(Object obj, long j, int i) {
            this.f24161a.putInt(obj, j, i);
        }

        /* JADX INFO: renamed from: u */
        public final void m8699u(Object obj, long j, long j2) {
            this.f24161a.putLong(obj, j, j2);
        }

        /* JADX INFO: renamed from: v */
        public final void m8700v(Object obj, long j, Object obj2) {
            this.f24161a.putObject(obj, j, obj2);
        }
    }

    static {
        boolean z2;
        boolean z3;
        MemoryAccessor memoryAccessor;
        Unsafe unsafeM8670i = m8670i();
        f24153b = unsafeM8670i;
        f24154c = Android.f23840a;
        Class cls = Long.TYPE;
        boolean zM8666e = m8666e(cls);
        Class cls2 = Integer.TYPE;
        boolean zM8666e2 = m8666e(cls2);
        MemoryAccessor jvmMemoryAccessor = null;
        if (unsafeM8670i != null) {
            if (!Android.m8304a()) {
                jvmMemoryAccessor = new JvmMemoryAccessor(unsafeM8670i);
            } else if (zM8666e) {
                jvmMemoryAccessor = new Android64MemoryAccessor(unsafeM8670i);
            } else if (zM8666e2) {
                jvmMemoryAccessor = new Android32MemoryAccessor(unsafeM8670i);
            }
        }
        f24155d = jvmMemoryAccessor;
        Class cls3 = Byte.TYPE;
        if (unsafeM8670i == null) {
            z2 = false;
        } else {
            try {
                Class<?> cls4 = unsafeM8670i.getClass();
                cls4.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls4.getMethod("getLong", Object.class, cls);
                if (m8665d() != null) {
                    if (!Android.m8304a()) {
                        cls4.getMethod("getByte", cls);
                        cls4.getMethod("putByte", cls, cls3);
                        cls4.getMethod("getInt", cls);
                        cls4.getMethod("putInt", cls, cls2);
                        cls4.getMethod("getLong", cls);
                        cls4.getMethod("putLong", cls, cls);
                        cls4.getMethod("copyMemory", cls, cls, cls);
                        cls4.getMethod("copyMemory", Object.class, cls, Object.class, cls, cls);
                    }
                    z2 = true;
                }
            } catch (Throwable th) {
                f24152a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
            }
            z2 = false;
        }
        f24156e = z2;
        Unsafe unsafe = f24153b;
        if (unsafe == null) {
            z3 = false;
        } else {
            try {
                Class<?> cls5 = unsafe.getClass();
                cls5.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls5.getMethod("arrayBaseOffset", Class.class);
                cls5.getMethod("arrayIndexScale", Class.class);
                cls5.getMethod("getInt", Object.class, cls);
                cls5.getMethod("putInt", Object.class, cls, cls2);
                cls5.getMethod("getLong", Object.class, cls);
                cls5.getMethod("putLong", Object.class, cls, cls);
                cls5.getMethod("getObject", Object.class, cls);
                cls5.getMethod("putObject", Object.class, cls, Object.class);
                if (!Android.m8304a()) {
                    cls5.getMethod("getByte", Object.class, cls);
                    cls5.getMethod("putByte", Object.class, cls, cls3);
                    cls5.getMethod("getBoolean", Object.class, cls);
                    cls5.getMethod("putBoolean", Object.class, cls, Boolean.TYPE);
                    cls5.getMethod("getFloat", Object.class, cls);
                    cls5.getMethod("putFloat", Object.class, cls, Float.TYPE);
                    cls5.getMethod("getDouble", Object.class, cls);
                    cls5.getMethod("putDouble", Object.class, cls, Double.TYPE);
                }
                z3 = true;
            } catch (Throwable th2) {
                f24152a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
                z3 = false;
            }
        }
        f24157f = z3;
        f24158g = m8663b(byte[].class);
        m8663b(boolean[].class);
        m8664c(boolean[].class);
        m8663b(int[].class);
        m8664c(int[].class);
        m8663b(long[].class);
        m8664c(long[].class);
        m8663b(float[].class);
        m8664c(float[].class);
        m8663b(double[].class);
        m8664c(double[].class);
        m8663b(Object[].class);
        m8664c(Object[].class);
        java.lang.reflect.Field fieldM8665d = m8665d();
        f24159h = (fieldM8665d == null || (memoryAccessor = f24155d) == null) ? -1L : memoryAccessor.m8697n(fieldM8665d);
        f24160i = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: a */
    public static Object m8662a(Class cls) {
        try {
            return f24153b.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m8663b(Class cls) {
        if (f24157f) {
            return f24155d.m8692a(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public static void m8664c(Class cls) {
        if (f24157f) {
            f24155d.m8693b(cls);
        }
    }

    /* JADX INFO: renamed from: d */
    public static java.lang.reflect.Field m8665d() {
        java.lang.reflect.Field declaredField;
        java.lang.reflect.Field declaredField2;
        if (Android.m8304a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m8666e(Class cls) {
        if (!Android.m8304a()) {
            return false;
        }
        try {
            Class cls2 = f24154c;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    public static byte m8667f(byte[] bArr, long j) {
        return f24155d.mo8683g(bArr, f24158g + j);
    }

    /* JADX INFO: renamed from: g */
    public static byte m8668g(Object obj, long j) {
        return (byte) ((f24155d.m8694j(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: h */
    public static byte m8669h(Object obj, long j) {
        return (byte) ((f24155d.m8694j(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: i */
    public static Unsafe m8670i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C16001());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m8671j(long j, byte b2) {
        f24155d.mo8688p(j, b2);
    }

    /* JADX INFO: renamed from: k */
    public static void m8672k(byte[] bArr, long j, byte b2) {
        f24155d.mo8689q(bArr, f24158g + j, b2);
    }

    /* JADX INFO: renamed from: l */
    public static void m8673l(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int iM8694j = f24155d.m8694j(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m8675n(obj, j2, ((255 & b2) << i) | (iM8694j & (~(255 << i))));
    }

    /* JADX INFO: renamed from: m */
    public static void m8674m(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m8675n(obj, j2, ((255 & b2) << i) | (f24155d.m8694j(obj, j2) & (~(255 << i))));
    }

    /* JADX INFO: renamed from: n */
    public static void m8675n(Object obj, long j, int i) {
        f24155d.m8698t(obj, j, i);
    }

    /* JADX INFO: renamed from: o */
    public static void m8676o(Object obj, long j, long j2) {
        f24155d.m8699u(obj, j, j2);
    }

    /* JADX INFO: renamed from: p */
    public static void m8677p(Object obj, long j, Object obj2) {
        f24155d.m8700v(obj, j, obj2);
    }
}
