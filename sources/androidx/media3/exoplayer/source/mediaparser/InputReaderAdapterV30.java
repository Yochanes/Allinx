package androidx.media3.exoplayer.source.mediaparser;

import android.media.MediaParser$SeekableInputReader;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@UnstableApi
public final class InputReaderAdapterV30 implements MediaParser$SeekableInputReader {

    /* JADX INFO: renamed from: a */
    public DataSource f27497a;

    /* JADX INFO: renamed from: b */
    public long f27498b;

    /* JADX INFO: renamed from: c */
    public long f27499c;

    /* JADX INFO: renamed from: d */
    public long f27500d;

    public final long getLength() {
        return this.f27498b;
    }

    public final long getPosition() {
        return this.f27499c;
    }

    public final int read(byte[] bArr, int i, int i2) {
        DataSource dataSource = this.f27497a;
        int i3 = Util.f25665a;
        int i4 = dataSource.read(bArr, i, i2);
        this.f27499c += (long) i4;
        return i4;
    }

    public final void seekToPosition(long j) {
        this.f27500d = j;
    }
}
