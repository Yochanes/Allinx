package kotlinx.coroutines.reactive;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"kotlinx/coroutines/reactive/AwaitKt$awaitOne$2$1", "Lorg/reactivestreams/Subscriber;", "kotlinx-coroutines-reactive"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class AwaitKt$awaitOne$2$1 implements Subscriber<Object> {

    /* JADX INFO: renamed from: a */
    public Subscription f56375a;

    /* JADX INFO: renamed from: b */
    public Object f56376b;

    /* JADX INFO: renamed from: c */
    public boolean f56377c;

    /* JADX INFO: renamed from: d */
    public boolean f56378d;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CancellableContinuationImpl f56379f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Mode f56380g;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Mode.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Mode mode = Mode.f56408b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Mode mode2 = Mode.f56408b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Mode mode3 = Mode.f56408b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                Mode mode4 = Mode.f56408b;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public AwaitKt$awaitOne$2$1(CancellableContinuationImpl cancellableContinuationImpl, Mode mode) {
        this.f56379f = cancellableContinuationImpl;
        this.f56380g = mode;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m20867a(Function0 function0) {
        function0.invoke();
    }

    @Override // org.reactivestreams.Subscriber
    /* JADX INFO: renamed from: j */
    public final void mo12367j(Subscription subscription) {
        if (this.f56375a != null) {
            m20867a(new AwaitKt$awaitOne$2$1$onSubscribe$1(subscription));
            return;
        }
        this.f56375a = subscription;
        this.f56379f.m20536r(new AwaitKt$awaitOne$2$1$onSubscribe$2(this, subscription));
        m20867a(new AwaitKt$awaitOne$2$1$onSubscribe$3(subscription, this.f56380g));
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        boolean z2 = this.f56378d;
        CancellableContinuationImpl cancellableContinuationImpl = this.f56379f;
        if (z2) {
            CoroutineExceptionHandlerKt.m20559a(new IllegalStateException("'onComplete' was called after the publisher already signalled being in a terminal state"), cancellableContinuationImpl.f55265f);
            return;
        }
        this.f56378d = true;
        boolean z3 = this.f56377c;
        Mode mode = this.f56380g;
        if (z3) {
            if (mode == Mode.f56409c || mode == Mode.f56408b || !cancellableContinuationImpl.m20538u()) {
                return;
            }
            cancellableContinuationImpl.resumeWith(this.f56376b);
            return;
        }
        if (mode == Mode.f56409c || mode == Mode.f56411f) {
            cancellableContinuationImpl.resumeWith(null);
        } else if (cancellableContinuationImpl.m20538u()) {
            cancellableContinuationImpl.resumeWith(ResultKt.m18312a(new NoSuchElementException("No value received via onNext for " + mode)));
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        boolean z2 = this.f56378d;
        CancellableContinuationImpl cancellableContinuationImpl = this.f56379f;
        if (z2) {
            CoroutineExceptionHandlerKt.m20559a(new IllegalStateException("'onError' was called after the publisher already signalled being in a terminal state"), cancellableContinuationImpl.f55265f);
        } else {
            this.f56378d = true;
            cancellableContinuationImpl.resumeWith(ResultKt.m18312a(th));
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        Subscription subscription = this.f56375a;
        CancellableContinuationImpl cancellableContinuationImpl = this.f56379f;
        CoroutineContext coroutineContext = cancellableContinuationImpl.f55265f;
        if (subscription == null) {
            CoroutineExceptionHandlerKt.m20559a(new IllegalStateException("'onNext' was called before 'onSubscribe'"), coroutineContext);
            return;
        }
        if (this.f56378d) {
            CoroutineExceptionHandlerKt.m20559a(new IllegalStateException("'onNext' was called after the publisher already signalled being in a terminal state"), coroutineContext);
            return;
        }
        Mode mode = this.f56380g;
        int iOrdinal = mode.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            if (!this.f56377c) {
                this.f56377c = true;
                m20867a(new AwaitKt$awaitOne$2$1$onNext$1(subscription));
                cancellableContinuationImpl.resumeWith(obj);
                return;
            } else {
                CoroutineExceptionHandlerKt.m20559a(new IllegalStateException("Only a single value was requested in '" + mode + "', but the publisher provided more"), coroutineContext);
                return;
            }
        }
        if (iOrdinal != 2 && iOrdinal != 3 && iOrdinal != 4) {
            throw new NoWhenBranchMatchedException();
        }
        if ((mode != Mode.f56410d && mode != Mode.f56411f) || !this.f56377c) {
            this.f56376b = obj;
            this.f56377c = true;
            return;
        }
        m20867a(new AwaitKt$awaitOne$2$1$onNext$2(subscription));
        if (cancellableContinuationImpl.m20538u()) {
            cancellableContinuationImpl.resumeWith(ResultKt.m18312a(new IllegalArgumentException("More than one onNext value for " + mode)));
        }
    }
}
