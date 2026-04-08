package okio;

import androidx.compose.animation.AbstractC0455a;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.Closeable;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, m18302d2 = {"Lokio/FileHandle;", "Ljava/io/Closeable;", "Lokio/Closeable;", "FileHandleSink", "FileHandleSource", "okio"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public abstract class FileHandle implements Closeable {

    /* JADX INFO: renamed from: a */
    public boolean f57848a;

    /* JADX INFO: renamed from: b */
    public int f57849b;

    /* JADX INFO: renamed from: c */
    public final ReentrantLock f57850c = new ReentrantLock();

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokio/FileHandle$FileHandleSource;", "Lokio/Source;", "okio"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class FileHandleSource implements Source {

        /* JADX INFO: renamed from: a */
        public final FileHandle f57851a;

        /* JADX INFO: renamed from: b */
        public long f57852b;

        /* JADX INFO: renamed from: c */
        public boolean f57853c;

        public FileHandleSource(FileHandle fileHandle, long j) {
            Intrinsics.m18599g(fileHandle, "fileHandle");
            this.f57851a = fileHandle;
            this.f57852b = j;
        }

        @Override // okio.Source
        /* JADX INFO: renamed from: J0 */
        public final long mo12415J0(Buffer sink, long j) {
            long j2;
            long j3;
            Intrinsics.m18599g(sink, "sink");
            if (this.f57853c) {
                throw new IllegalStateException(MetricTracker.Action.CLOSED);
            }
            long j4 = this.f57852b;
            FileHandle fileHandle = this.f57851a;
            fileHandle.getClass();
            if (j < 0) {
                throw new IllegalArgumentException(AbstractC0455a.m2238m(j, "byteCount < 0: ").toString());
            }
            long j5 = j + j4;
            long j6 = j4;
            while (true) {
                if (j6 >= j5) {
                    j2 = -1;
                    break;
                }
                Segment segmentM21604w0 = sink.m21604w0(1);
                j2 = -1;
                long j7 = j5;
                int iMo21637b = fileHandle.mo21637b(j6, segmentM21604w0.f57899a, segmentM21604w0.f57901c, (int) Math.min(j5 - j6, 8192 - r10));
                if (iMo21637b == -1) {
                    if (segmentM21604w0.f57900b == segmentM21604w0.f57901c) {
                        sink.f57829a = segmentM21604w0.m21706a();
                        SegmentPool.m21710a(segmentM21604w0);
                    }
                    if (j4 == j6) {
                        j3 = -1;
                    }
                } else {
                    segmentM21604w0.f57901c += iMo21637b;
                    long j8 = iMo21637b;
                    j6 += j8;
                    sink.f57830b += j8;
                    j5 = j7;
                }
            }
            j3 = j6 - j4;
            if (j3 != j2) {
                this.f57852b += j3;
            }
            return j3;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f57853c) {
                return;
            }
            this.f57853c = true;
            FileHandle fileHandle = this.f57851a;
            ReentrantLock reentrantLock = fileHandle.f57850c;
            reentrantLock.lock();
            try {
                int i = fileHandle.f57849b - 1;
                fileHandle.f57849b = i;
                if (i == 0) {
                    if (fileHandle.f57848a) {
                        reentrantLock.unlock();
                        fileHandle.mo21636a();
                    }
                }
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // okio.Source
        public final Timeout timeout() {
            return Timeout.f57912d;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo21636a();

    /* JADX INFO: renamed from: b */
    public abstract int mo21637b(long j, byte[] bArr, int i, int i2);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f57850c;
        reentrantLock.lock();
        try {
            if (this.f57848a) {
                return;
            }
            this.f57848a = true;
            if (this.f57849b != 0) {
                return;
            }
            reentrantLock.unlock();
            mo21636a();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract long mo21638d();

    /* JADX INFO: renamed from: g */
    public final long m21639g() {
        ReentrantLock reentrantLock = this.f57850c;
        reentrantLock.lock();
        try {
            if (this.f57848a) {
                throw new IllegalStateException(MetricTracker.Action.CLOSED);
            }
            reentrantLock.unlock();
            return mo21638d();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: h */
    public final Source m21640h(long j) {
        ReentrantLock reentrantLock = this.f57850c;
        reentrantLock.lock();
        try {
            if (this.f57848a) {
                throw new IllegalStateException(MetricTracker.Action.CLOSED);
            }
            this.f57849b++;
            reentrantLock.unlock();
            return new FileHandleSource(this, j);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokio/FileHandle$FileHandleSink;", "Lokio/Sink;", "okio"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class FileHandleSink implements Sink {
        @Override // okio.Sink, java.io.Flushable
        public final void flush() {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }

        @Override // okio.Sink
        /* JADX INFO: renamed from: o0 */
        public final void mo12451o0(Buffer source, long j) {
            Intrinsics.m18599g(source, "source");
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }

        @Override // okio.Sink
        public final Timeout timeout() {
            return Timeout.f57912d;
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }
}
