package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003¨\u0006\u0004"}, m18302d2 = {"Lkotlinx/coroutines/TimeoutCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Lkotlinx/coroutines/CopyableThrowable;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class TimeoutCancellationException extends CancellationException implements CopyableThrowable<TimeoutCancellationException> {

    /* JADX INFO: renamed from: a */
    public final transient Job f55366a;

    public TimeoutCancellationException(String str, Job job) {
        super(str);
        this.f55366a = job;
    }

    @Override // kotlinx.coroutines.CopyableThrowable
    public final Throwable createCopy() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        TimeoutCancellationException timeoutCancellationException = new TimeoutCancellationException(message, this.f55366a);
        timeoutCancellationException.initCause(this);
        return timeoutCancellationException;
    }
}
