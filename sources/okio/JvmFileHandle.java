package okio;

import java.io.RandomAccessFile;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokio/JvmFileHandle;", "Lokio/FileHandle;", "okio"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class JvmFileHandle extends FileHandle {

    /* JADX INFO: renamed from: d */
    public final RandomAccessFile f57878d;

    public JvmFileHandle(RandomAccessFile randomAccessFile) {
        this.f57878d = randomAccessFile;
    }

    @Override // okio.FileHandle
    /* JADX INFO: renamed from: a */
    public final synchronized void mo21636a() {
        this.f57878d.close();
    }

    @Override // okio.FileHandle
    /* JADX INFO: renamed from: b */
    public final synchronized int mo21637b(long j, byte[] array, int i, int i2) {
        Intrinsics.m18599g(array, "array");
        this.f57878d.seek(j);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            int i4 = this.f57878d.read(array, i, i2 - i3);
            if (i4 != -1) {
                i3 += i4;
            } else if (i3 == 0) {
                return -1;
            }
        }
        return i3;
    }

    @Override // okio.FileHandle
    /* JADX INFO: renamed from: d */
    public final synchronized long mo21638d() {
        return this.f57878d.length();
    }
}
