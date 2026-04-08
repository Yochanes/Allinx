package androidx.room;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u0001H\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0003H\u008a@"}, m18302d2 = {"<anonymous>", "R", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.room.CoroutinesRoom$Companion$execute$2", m18559f = "CoroutinesRoom.kt", m18560l = {}, m18561m = "invokeSuspend")
final class CoroutinesRoom$Companion$execute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<Object>, Object> {
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        throw null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CoroutinesRoom$Companion$execute$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f51459a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        ResultKt.m18313b(obj);
        throw null;
    }
}
