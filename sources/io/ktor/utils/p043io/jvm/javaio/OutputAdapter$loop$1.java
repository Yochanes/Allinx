package io.ktor.utils.p043io.jvm.javaio;

import io.ktor.utils.p043io.ByteWriteChannelKt;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"io/ktor/utils/io/jvm/javaio/OutputAdapter$loop$1", "Lio/ktor/utils/io/jvm/javaio/BlockingAdapter;", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class OutputAdapter$loop$1 extends BlockingAdapter {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ OutputAdapter f47480g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutputAdapter$loop$1(OutputAdapter outputAdapter) {
        super(null);
        this.f47480g = outputAdapter;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int, io.ktor.utils.io.jvm.javaio.OutputAdapter$loop$1] */
    @Override // io.ktor.utils.p043io.jvm.javaio.BlockingAdapter
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo17566a(ContinuationImpl continuationImpl) throws Throwable {
        OutputAdapter$loop$1$loop$1 outputAdapter$loop$1$loop$1;
        Throwable thMo17300e;
        OutputAdapter$loop$1 outputAdapter$loop$1;
        Continuation continuationM18556b;
        Throwable thMo17300e2;
        if (continuationImpl instanceof OutputAdapter$loop$1$loop$1) {
            outputAdapter$loop$1$loop$1 = (OutputAdapter$loop$1$loop$1) continuationImpl;
            int i = outputAdapter$loop$1$loop$1.f47482b;
            if ((i & Integer.MIN_VALUE) != 0) {
                outputAdapter$loop$1$loop$1.f47482b = i - Integer.MIN_VALUE;
            } else {
                outputAdapter$loop$1$loop$1 = new OutputAdapter$loop$1$loop$1(this, continuationImpl);
            }
        }
        Object obj = outputAdapter$loop$1$loop$1.f47481a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        ?? r2 = outputAdapter$loop$1$loop$1.f47482b;
        Thread thread = null;
        try {
            if (r2 == 0) {
                ResultKt.m18313b(obj);
                outputAdapter$loop$1 = this;
            } else if (r2 == 1) {
                outputAdapter$loop$1 = outputAdapter$loop$1$loop$1.f47484d;
                ResultKt.m18313b(obj);
                if (obj == BlockingKt.f47463a) {
                    if (ByteWriteChannelKt.m17380a(outputAdapter$loop$1.f47480g.f47479c) || (thMo17300e2 = outputAdapter$loop$1.f47480g.f47479c.mo17300e()) == null) {
                        return Unit.f51459a;
                    }
                    throw thMo17300e2;
                }
                if (obj == BlockingKt.f47464b) {
                    outputAdapter$loop$1.f47480g.f47479c.flush();
                    Throwable thMo17300e3 = outputAdapter$loop$1.f47480g.f47479c.mo17300e();
                    if (thMo17300e3 != null) {
                        throw thMo17300e3;
                    }
                } else if (obj instanceof byte[]) {
                    int i2 = outputAdapter$loop$1.f47455c;
                    int i3 = outputAdapter$loop$1.f47456d;
                    outputAdapter$loop$1$loop$1.f47484d = outputAdapter$loop$1;
                    outputAdapter$loop$1$loop$1.f47482b = 2;
                    if (outputAdapter$loop$1.f47480g.f47479c.mo17258G((byte[]) obj, i2, i3, outputAdapter$loop$1$loop$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (r2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                outputAdapter$loop$1 = outputAdapter$loop$1$loop$1.f47484d;
                ResultKt.m18313b(obj);
            }
            outputAdapter$loop$1.result = 0;
            outputAdapter$loop$1$loop$1.f47484d = outputAdapter$loop$1;
            outputAdapter$loop$1$loop$1.f47482b = 1;
            while (true) {
                Object obj2 = outputAdapter$loop$1.state;
                if (obj2 instanceof Thread) {
                    thread = (Thread) obj2;
                    continuationM18556b = IntrinsicsKt.m18556b(outputAdapter$loop$1$loop$1);
                } else {
                    if (!Intrinsics.m18594b(obj2, outputAdapter$loop$1)) {
                        throw new IllegalStateException("Already suspended or in finished state");
                    }
                    continuationM18556b = IntrinsicsKt.m18556b(outputAdapter$loop$1$loop$1);
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = BlockingAdapter.f47452f;
                while (!atomicReferenceFieldUpdater.compareAndSet(outputAdapter$loop$1, obj2, continuationM18556b)) {
                    if (atomicReferenceFieldUpdater.get(outputAdapter$loop$1) != obj2) {
                        break;
                    }
                }
                if (thread != null) {
                    PollersKt.m17573a().mo17572b(thread);
                }
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.f51584a;
                return coroutineSingletons;
            }
        } catch (Throwable th) {
            try {
                if (!(th instanceof CancellationException)) {
                    r2.f47480g.f47479c.mo17293b(th);
                }
                throw th;
            } catch (Throwable th2) {
                if (ByteWriteChannelKt.m17380a(r2.f47480g.f47479c) || (thMo17300e = r2.f47480g.f47479c.mo17300e()) == null) {
                    throw th2;
                }
                throw thMo17300e;
            }
        }
    }
}
