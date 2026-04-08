package kotlinx.coroutines.channels;

import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.InternalCoroutinesApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087@\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\u0003\u0004\u0005\u0088\u0001\u0006\u0092\u0001\u0004\u0018\u00010\u0002¨\u0006\u0007"}, m18302d2 = {"Lkotlinx/coroutines/channels/ChannelResult;", "T", "", "Failed", "Closed", "Companion", "holder", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@JvmInline
public final class ChannelResult<T> {

    /* JADX INFO: renamed from: b */
    public static final Failed f55451b = new Failed();

    /* JADX INFO: renamed from: a */
    public final Object f55452a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/coroutines/channels/ChannelResult$Closed;", "Lkotlinx/coroutines/channels/ChannelResult$Failed;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Closed extends Failed {

        /* JADX INFO: renamed from: a */
        public final Throwable f55453a;

        public Closed(Throwable th) {
            this.f55453a = th;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Closed) {
                return Intrinsics.m18594b(this.f55453a, ((Closed) obj).f55453a);
            }
            return false;
        }

        public final int hashCode() {
            Throwable th = this.f55453a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // kotlinx.coroutines.channels.ChannelResult.Failed
        public final String toString() {
            return "Closed(" + this.f55453a + ')';
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @InternalCoroutinesApi
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"Lkotlinx/coroutines/channels/ChannelResult$Companion;", "", "Lkotlinx/coroutines/channels/ChannelResult$Failed;", MetricTracker.Action.FAILED, "Lkotlinx/coroutines/channels/ChannelResult$Failed;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/coroutines/channels/ChannelResult$Failed;", "", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static class Failed {
        public String toString() {
            return "Failed";
        }
    }

    public /* synthetic */ ChannelResult(Object obj) {
        this.f55452a = obj;
    }

    /* JADX INFO: renamed from: a */
    public static final Throwable m20710a(Object obj) {
        Closed closed = obj instanceof Closed ? (Closed) obj : null;
        if (closed != null) {
            return closed.f55453a;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final Object m20711b(Object obj) {
        if (obj instanceof Failed) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: c */
    public static final void m20712c(Object obj) throws Throwable {
        Throwable th;
        if (obj instanceof Failed) {
            if ((obj instanceof Closed) && (th = ((Closed) obj).f55453a) != null) {
                throw th;
            }
            throw new IllegalStateException(("Trying to call 'getOrThrow' on a failed channel result: " + obj).toString());
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ChannelResult) {
            return Intrinsics.m18594b(this.f55452a, ((ChannelResult) obj).f55452a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f55452a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f55452a;
        if (obj instanceof Closed) {
            return ((Closed) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
