package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u0001H\u0002H\n"}, m18302d2 = {"<anonymous>", "", "E", "", "it"}, m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNull$1", m18559f = "Deprecated.kt", m18560l = {}, m18561m = "invokeSuspend")
final class ChannelsKt__DeprecatedKt$filterNotNull$1 extends SuspendLambda implements Function2<Object, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f55506a;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChannelsKt__DeprecatedKt$filterNotNull$1 channelsKt__DeprecatedKt$filterNotNull$1 = new ChannelsKt__DeprecatedKt$filterNotNull$1(2, continuation);
        channelsKt__DeprecatedKt$filterNotNull$1.f55506a = obj;
        return channelsKt__DeprecatedKt$filterNotNull$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChannelsKt__DeprecatedKt$filterNotNull$1) create(obj, (Continuation) obj2)).invokeSuspend(Unit.f51459a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        ResultKt.m18313b(obj);
        return Boolean.valueOf(this.f55506a != null);
    }
}
