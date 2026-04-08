package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class ByteBufferWriter {
    static {
        Class<?> cls;
        new ThreadLocal();
        try {
            cls = Class.forName("java.io.FileOutputStream");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                if (UnsafeUtil.f24157f) {
                    UnsafeUtil.f24155d.m8697n(cls.getDeclaredField("channel"));
                }
            } catch (Throwable unused2) {
            }
        }
    }
}
