package com.tinder;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.tinder.StateMachine$GraphBuilder$StateDefinitionBuilder$onEnter$$inlined$with$lambda$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u0002H\u0003\"\b\b\u0001\u0010\u0003*\u00020\u0004\"\b\b\u0002\u0010\u0005*\u00020\u0004\"\b\b\u0003\u0010\u0006*\u00020\u0004\"\b\b\u0004\u0010\u0003*\u00020\u0004\"\b\b\u0005\u0010\u0005*\u00020\u0004\"\b\b\u0006\u0010\u0006*\u00020\u00042\u0006\u0010\u0007\u001a\u0002H\u00032\u0006\u0010\b\u001a\u0002H\u0005H\n¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m18302d2 = {"<anonymous>", "", "S", "STATE", "", "EVENT", "SIDE_EFFECT", "state", "cause", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)V", "com/tinder/StateMachine$GraphBuilder$StateDefinitionBuilder$onEnter$1$1"}, m18303k = 3, m18304mv = {1, 1, 13})
final class C5051xbc677dc4 extends Lambda implements Function2<Object, Object, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Lambda f43445a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5051xbc677dc4(Function2 function2) {
        super(2);
        this.f43445a = (Lambda) function2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object state, Object cause) {
        Intrinsics.m18600h(state, "state");
        Intrinsics.m18600h(cause, "cause");
        this.f43445a.invoke(state, cause);
        return Unit.f51459a;
    }
}
