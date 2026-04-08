package kotlin.p044io;

import java.io.Closeable;
import java.io.IOException;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"kotlin-stdlib"}, m18303k = 2, m18304mv = {2, 1, 0}, m18306xi = 48)
@JvmName
public final class CloseableKt {
    /* JADX INFO: renamed from: a */
    public static final void m18567a(Closeable closeable, Throwable th) throws IOException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                ExceptionsKt.m18297a(th, th2);
            }
        }
    }
}
