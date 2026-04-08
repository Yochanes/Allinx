package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class Android {

    /* JADX INFO: renamed from: a */
    public static final Class f23840a;

    /* JADX INFO: renamed from: b */
    public static final boolean f23841b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f23840a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f23841b = cls2 != null;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m8304a() {
        return (f23840a == null || f23841b) ? false : true;
    }
}
