package io.ktor.utils.p043io.jvm.javaio;

import io.ktor.utils.p043io.ByteReadChannel;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"io/ktor/utils/io/jvm/javaio/InputAdapter$loop$1", "Lio/ktor/utils/io/jvm/javaio/BlockingAdapter;", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class InputAdapter$loop$1 extends BlockingAdapter {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InputAdapter f47471g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Job f47472h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputAdapter$loop$1(InputAdapter inputAdapter, Job job, Job job2) {
        super(job2);
        this.f47471g = inputAdapter;
        this.f47472h = job;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.utils.p043io.jvm.javaio.BlockingAdapter
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo17566a(ContinuationImpl continuationImpl) {
        InputAdapter$loop$1$loop$1 inputAdapter$loop$1$loop$1;
        int iIntValue;
        InputAdapter$loop$1 inputAdapter$loop$1;
        Continuation continuationM18556b;
        if (continuationImpl instanceof InputAdapter$loop$1$loop$1) {
            inputAdapter$loop$1$loop$1 = (InputAdapter$loop$1$loop$1) continuationImpl;
            int i = inputAdapter$loop$1$loop$1.f47474b;
            if ((i & Integer.MIN_VALUE) != 0) {
                inputAdapter$loop$1$loop$1.f47474b = i - Integer.MIN_VALUE;
            } else {
                inputAdapter$loop$1$loop$1 = new InputAdapter$loop$1$loop$1(this, continuationImpl);
            }
        }
        Object objMo17329s = inputAdapter$loop$1$loop$1.f47473a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = inputAdapter$loop$1$loop$1.f47474b;
        Thread thread = null;
        if (i2 != 0) {
            if (i2 == 1) {
                inputAdapter$loop$1 = inputAdapter$loop$1$loop$1.f47476d;
                ResultKt.m18313b(objMo17329s);
                if (objMo17329s == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.ByteArray");
                }
                ByteReadChannel byteReadChannel = inputAdapter$loop$1.f47471g.f47470d;
                int i3 = inputAdapter$loop$1.f47455c;
                int i4 = inputAdapter$loop$1.f47456d;
                inputAdapter$loop$1$loop$1.f47476d = inputAdapter$loop$1;
                inputAdapter$loop$1$loop$1.f47474b = 2;
                objMo17329s = byteReadChannel.mo17329s((byte[]) objMo17329s, i3, i4, inputAdapter$loop$1$loop$1);
                if (objMo17329s == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                inputAdapter$loop$1 = inputAdapter$loop$1$loop$1.f47476d;
                ResultKt.m18313b(objMo17329s);
            }
            iIntValue = ((Number) objMo17329s).intValue();
            if (iIntValue == -1) {
                inputAdapter$loop$1.f47471g.f47467a.mo20549a();
                inputAdapter$loop$1.result = iIntValue;
                return Unit.f51459a;
            }
        } else {
            ResultKt.m18313b(objMo17329s);
            iIntValue = 0;
            inputAdapter$loop$1 = this;
        }
        inputAdapter$loop$1.result = iIntValue;
        inputAdapter$loop$1$loop$1.f47476d = inputAdapter$loop$1;
        inputAdapter$loop$1$loop$1.f47474b = 1;
        while (true) {
            Object obj = inputAdapter$loop$1.state;
            if (obj instanceof Thread) {
                thread = (Thread) obj;
                continuationM18556b = IntrinsicsKt.m18556b(inputAdapter$loop$1$loop$1);
            } else {
                if (!Intrinsics.m18594b(obj, inputAdapter$loop$1)) {
                    throw new IllegalStateException("Already suspended or in finished state");
                }
                continuationM18556b = IntrinsicsKt.m18556b(inputAdapter$loop$1$loop$1);
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = BlockingAdapter.f47452f;
            while (!atomicReferenceFieldUpdater.compareAndSet(inputAdapter$loop$1, obj, continuationM18556b)) {
                if (atomicReferenceFieldUpdater.get(inputAdapter$loop$1) != obj) {
                    break;
                }
            }
            if (thread != null) {
                PollersKt.m17573a().mo17572b(thread);
            }
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.f51584a;
            return coroutineSingletons;
        }
    }
}
