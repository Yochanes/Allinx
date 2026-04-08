package org.mp4parser;

import java.io.Closeable;
import org.mp4parser.support.DoNotParseDetail;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@DoNotParseDetail
public class IsoFile extends BasicContainer implements Closeable {
    /* JADX INFO: renamed from: g */
    public static byte[] m21819g(String str) {
        byte[] bArr = new byte[4];
        if (str != null) {
            for (int i = 0; i < Math.min(4, str.length()); i++) {
                bArr[i] = (byte) str.charAt(i);
            }
        }
        return bArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // org.mp4parser.BasicContainer
    public final String toString() {
        return "model(null)";
    }
}
