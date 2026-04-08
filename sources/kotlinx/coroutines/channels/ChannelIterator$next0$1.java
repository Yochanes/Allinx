package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "kotlinx.coroutines.channels.ChannelIterator$DefaultImpls", m18559f = "Channel.kt", m18560l = {602}, m18561m = "next")
final class ChannelIterator$next0$1<E> extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f55449a;

    /* JADX INFO: renamed from: b */
    public int f55450b;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f55449a = obj;
        int i = (this.f55450b | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.f55450b = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        if (i == 0) {
            ResultKt.m18313b(obj);
            this.f55450b = 1;
            throw null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m18313b(obj);
        if (((Boolean) obj).booleanValue()) {
            throw null;
        }
        throw new ClosedReceiveChannelException("Channel was closed");
    }
}
