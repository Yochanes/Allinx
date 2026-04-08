package org.aspectj.lang;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class SoftException extends RuntimeException {
    static {
        try {
            Class.forName("java.nio.Buffer");
        } catch (Throwable unused) {
        }
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return null;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        super.printStackTrace(System.err);
    }
}
