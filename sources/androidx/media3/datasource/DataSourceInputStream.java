package androidx.media3.datasource;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import com.google.common.primitives.UnsignedBytes;
import java.io.InputStream;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class DataSourceInputStream extends InputStream {

    /* JADX INFO: renamed from: a */
    public final DataSource f25814a;

    /* JADX INFO: renamed from: b */
    public final DataSpec f25815b;

    /* JADX INFO: renamed from: d */
    public boolean f25817d = false;

    /* JADX INFO: renamed from: f */
    public boolean f25818f = false;

    /* JADX INFO: renamed from: c */
    public final byte[] f25816c = new byte[1];

    public DataSourceInputStream(DataSource dataSource, DataSpec dataSpec) {
        this.f25814a = dataSource;
        this.f25815b = dataSpec;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f25818f) {
            return;
        }
        this.f25814a.close();
        this.f25818f = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f25816c;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & UnsignedBytes.MAX_VALUE;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        Assertions.m9464e(!this.f25818f);
        boolean z2 = this.f25817d;
        DataSource dataSource = this.f25814a;
        if (!z2) {
            dataSource.mo9671i(this.f25815b);
            this.f25817d = true;
        }
        int i3 = dataSource.read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        return i3;
    }
}
