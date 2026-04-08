package kotlinx.coroutines.reactive;

import androidx.compose.animation.AbstractC0455a;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@InternalCoroutinesApi
@Metadata(m18301d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u0005R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u000b\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¨\u0006\u000b"}, m18302d2 = {"Lkotlinx/coroutines/reactive/PublisherCoroutine;", "T", "Lkotlinx/coroutines/AbstractCoroutine;", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lorg/reactivestreams/Subscription;", "", "cancelled", "Z", "Lkotlinx/atomicfu/AtomicLong;", "_nRequested", "kotlinx-coroutines-reactive"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class PublisherCoroutine<T> extends AbstractCoroutine<Unit> implements ProducerScope<T>, Subscription {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicLongFieldUpdater f56426d = AtomicLongFieldUpdater.newUpdater(PublisherCoroutine.class, "_nRequested$volatile");
    private volatile /* synthetic */ long _nRequested$volatile;
    private volatile boolean cancelled;

    @Override // kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: F */
    public final boolean mo11411F() {
        return !isActive();
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    /* JADX INFO: renamed from: N0 */
    public final void mo20490N0(boolean z2, Throwable th) {
        m20873U0(z2, th);
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    /* JADX INFO: renamed from: P0 */
    public final void mo20491P0(Object obj) {
        m20873U0(false, null);
    }

    /* JADX INFO: renamed from: T0 */
    public final Throwable m20872T0(Object obj) {
        obj.getClass();
        if (!isActive()) {
            throw null;
        }
        try {
            throw null;
        } catch (Throwable th) {
            this.cancelled = true;
            m20614J(th);
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
    
        throw null;
     */
    /* JADX INFO: renamed from: U0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m20873U0(boolean z2, Throwable th) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        do {
            atomicLongFieldUpdater = f56426d;
            j = atomicLongFieldUpdater.get(this);
            if (j == -2) {
                return;
            }
            if (j < 0) {
                throw new IllegalStateException("Check failed.");
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, -1L));
        if (j != 0) {
            throw null;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f56426d;
        if (atomicLongFieldUpdater2.get(this) == -2) {
            throw null;
        }
        atomicLongFieldUpdater2.set(this, -2L);
        if (this.cancelled) {
            if (th != null && z2) {
                throw null;
            }
            throw null;
        }
        if (th == null) {
            try {
                throw null;
            } catch (Throwable th2) {
                CoroutineExceptionHandlerKt.m20559a(th2, this.f55239c);
                throw null;
            }
        } else {
            try {
                throw null;
            } catch (Throwable th3) {
                if (th3 != th) {
                    ExceptionsKt.m18297a(th, th3);
                }
                CoroutineExceptionHandlerKt.m20559a(th, this.f55239c);
                throw null;
            }
        }
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        this.cancelled = true;
        mo17054i(null);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final boolean offer(Object obj) {
        return SendChannel.DefaultImpls.m20727a(this, obj);
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        long j3;
        if (j <= 0) {
            m20614J(new IllegalArgumentException(AbstractC0455a.m2238m(j, "non-positive subscription request ")));
            return;
        }
        do {
            atomicLongFieldUpdater = f56426d;
            j2 = atomicLongFieldUpdater.get(this);
            if (j2 < 0) {
                return;
            }
            j3 = j2 + j;
            if (j3 < 0 || j == Long.MAX_VALUE) {
                j3 = Long.MAX_VALUE;
            }
            if (j2 == j3) {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, j3));
        if (j2 == 0) {
            throw null;
        }
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: t */
    public final void mo11413t(Function1 function1) {
        throw new UnsupportedOperationException("PublisherCoroutine doesn't support invokeOnClose");
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: v */
    public final Object mo11414v(Object obj) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo11415w(Object obj, Continuation continuation) {
        PublisherCoroutine$send$1 publisherCoroutine$send$1;
        if (continuation instanceof PublisherCoroutine$send$1) {
            publisherCoroutine$send$1 = (PublisherCoroutine$send$1) continuation;
            int i = publisherCoroutine$send$1.f56434f;
            if ((i & Integer.MIN_VALUE) != 0) {
                publisherCoroutine$send$1.f56434f = i - Integer.MIN_VALUE;
            } else {
                publisherCoroutine$send$1 = new PublisherCoroutine$send$1(this, continuation);
            }
        }
        Object obj2 = publisherCoroutine$send$1.f56432c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = publisherCoroutine$send$1.f56434f;
        if (i2 == 0) {
            ResultKt.m18313b(obj2);
            publisherCoroutine$send$1.f56430a = this;
            publisherCoroutine$send$1.f56431b = obj;
            publisherCoroutine$send$1.f56434f = 1;
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Object obj3 = publisherCoroutine$send$1.f56431b;
        PublisherCoroutine publisherCoroutine = publisherCoroutine$send$1.f56430a;
        ResultKt.m18313b(obj2);
        publisherCoroutine.m20872T0(obj3);
        throw null;
    }

    @Override // kotlinx.coroutines.channels.ProducerScope
    /* JADX INFO: renamed from: e */
    public final SendChannel mo20664e() {
        return this;
    }
}
