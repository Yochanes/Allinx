package com.android.volley.toolbox;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class PoolingByteArrayOutputStream extends ByteArrayOutputStream {

    /* JADX INFO: renamed from: a */
    public final ByteArrayPool f35025a;

    public PoolingByteArrayOutputStream(ByteArrayPool byteArrayPool, int i) {
        this.f35025a = byteArrayPool;
        ((ByteArrayOutputStream) this).buf = byteArrayPool.m12819a(Math.max(i, 256));
    }

    /* JADX INFO: renamed from: a */
    public final void m12847a(int i) {
        int i2 = ((ByteArrayOutputStream) this).count;
        if (i2 + i <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        int i3 = (i2 + i) * 2;
        ByteArrayPool byteArrayPool = this.f35025a;
        byte[] bArrM12819a = byteArrayPool.m12819a(i3);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArrM12819a, 0, ((ByteArrayOutputStream) this).count);
        byteArrayPool.m12820b(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = bArrM12819a;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f35025a.m12820b(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.f35025a.m12820b(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        m12847a(i2);
        super.write(bArr, i, i2);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i) {
        m12847a(1);
        super.write(i);
    }
}
