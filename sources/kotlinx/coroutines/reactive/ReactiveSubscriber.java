package kotlinx.coroutines.reactive;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelResult;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m18302d2 = {"Lkotlinx/coroutines/reactive/ReactiveSubscriber;", "", "T", "Lorg/reactivestreams/Subscriber;", "kotlinx-coroutines-reactive"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
final class ReactiveSubscriber<T> implements Subscriber<T> {

    /* JADX INFO: renamed from: a */
    public final long f56436a;

    /* JADX INFO: renamed from: b */
    public Subscription f56437b;

    /* JADX INFO: renamed from: c */
    public final BufferedChannel f56438c;

    public ReactiveSubscriber(int i, BufferOverflow bufferOverflow, long j) {
        this.f56436a = j;
        this.f56438c = kotlinx.coroutines.channels.ChannelKt.m20709a(i == 0 ? 1 : i, 4, bufferOverflow);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m20874a(ContinuationImpl continuationImpl) throws Throwable {
        ReactiveSubscriber$takeNextOrNull$1 reactiveSubscriber$takeNextOrNull$1;
        Object objM20666P;
        if (continuationImpl instanceof ReactiveSubscriber$takeNextOrNull$1) {
            reactiveSubscriber$takeNextOrNull$1 = (ReactiveSubscriber$takeNextOrNull$1) continuationImpl;
            int i = reactiveSubscriber$takeNextOrNull$1.f56441c;
            if ((i & Integer.MIN_VALUE) != 0) {
                reactiveSubscriber$takeNextOrNull$1.f56441c = i - Integer.MIN_VALUE;
            } else {
                reactiveSubscriber$takeNextOrNull$1 = new ReactiveSubscriber$takeNextOrNull$1(this, continuationImpl);
            }
        }
        Object obj = reactiveSubscriber$takeNextOrNull$1.f56439a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = reactiveSubscriber$takeNextOrNull$1.f56441c;
        if (i2 == 0) {
            ResultKt.m18313b(obj);
            BufferedChannel bufferedChannel = this.f56438c;
            reactiveSubscriber$takeNextOrNull$1.f56441c = 1;
            bufferedChannel.getClass();
            objM20666P = BufferedChannel.m20666P(bufferedChannel, reactiveSubscriber$takeNextOrNull$1);
            if (objM20666P == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m18313b(obj);
            objM20666P = ((ChannelResult) obj).f55452a;
        }
        Throwable thM20710a = ChannelResult.m20710a(objM20666P);
        if (thM20710a != null) {
            throw thM20710a;
        }
        if (!(objM20666P instanceof ChannelResult.Failed)) {
            return objM20666P;
        }
        ChannelResult.m20710a(objM20666P);
        return null;
    }

    @Override // org.reactivestreams.Subscriber
    /* JADX INFO: renamed from: j */
    public final void mo12367j(Subscription subscription) {
        this.f56437b = subscription;
        if (subscription != null) {
            subscription.request(this.f56436a);
        } else {
            Intrinsics.m18606n("subscription");
            throw null;
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        this.f56438c.mo11412b(null);
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        this.f56438c.m20701s(false, th);
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        BufferedChannel bufferedChannel = this.f56438c;
        if (bufferedChannel.mo11414v(obj) instanceof ChannelResult.Failed) {
            throw new IllegalArgumentException(("Element " + obj + " was not added to channel because it was full, " + bufferedChannel).toString());
        }
    }
}
