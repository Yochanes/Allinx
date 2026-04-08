package kotlin.reflect.jvm.internal.impl.utils;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class WrappedValues {

    /* JADX INFO: renamed from: a */
    public static final Object f55108a = new C62361();

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.utils.WrappedValues$1 */
    /* JADX INFO: compiled from: Proguard */
    public static class C62361 {
        public final String toString() {
            return "NULL_VALUE";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ThrowableWrapper {

        /* JADX INFO: renamed from: a */
        public final Throwable f55109a;

        public ThrowableWrapper(Throwable th) {
            this.f55109a = th;
        }

        public final String toString() {
            return this.f55109a.toString();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class WrappedProcessCanceledException extends RuntimeException {
    }

    /* JADX INFO: renamed from: a */
    public static Object m20351a(Throwable th) {
        return new ThrowableWrapper(th);
    }

    /* JADX INFO: renamed from: b */
    public static void m20352b(Object obj) throws Throwable {
        if (obj instanceof ThrowableWrapper) {
            throw ((ThrowableWrapper) obj).f55109a;
        }
    }
}
