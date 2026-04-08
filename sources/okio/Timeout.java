package okio;

import androidx.compose.animation.AbstractC0455a;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lokio/Timeout;", "", "Companion", "okio"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public class Timeout {

    /* JADX INFO: renamed from: d */
    public static final Timeout$Companion$NONE$1 f57912d = new Timeout$Companion$NONE$1();

    /* JADX INFO: renamed from: a */
    public boolean f57913a;

    /* JADX INFO: renamed from: b */
    public long f57914b;

    /* JADX INFO: renamed from: c */
    public long f57915c;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"Lokio/Timeout$Companion;", "", "Lokio/Timeout;", "NONE", "Lokio/Timeout;", "okio"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: renamed from: a */
    public Timeout mo21651a() {
        this.f57913a = false;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public Timeout mo21652b() {
        this.f57915c = 0L;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public long mo21653c() {
        if (this.f57913a) {
            return this.f57914b;
        }
        throw new IllegalStateException("No deadline");
    }

    /* JADX INFO: renamed from: d */
    public Timeout mo21654d(long j) {
        this.f57913a = true;
        this.f57914b = j;
        return this;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public boolean getF57913a() {
        return this.f57913a;
    }

    /* JADX INFO: renamed from: f */
    public void mo21656f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f57913a && this.f57914b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* JADX INFO: renamed from: g */
    public Timeout mo21657g(long j, TimeUnit unit) {
        Intrinsics.m18599g(unit, "unit");
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC0455a.m2238m(j, "timeout < 0: ").toString());
        }
        this.f57915c = unit.toNanos(j);
        return this;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public long getF57915c() {
        return this.f57915c;
    }
}
