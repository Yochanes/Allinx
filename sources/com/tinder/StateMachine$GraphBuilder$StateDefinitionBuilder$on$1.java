package com.tinder;

import com.tinder.StateMachine;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0004*\u0002H\u0005\"\b\b\u0001\u0010\u0006*\u0002H\u0002\"\b\b\u0002\u0010\u0002*\u00020\u0007\"\b\b\u0003\u0010\u0005*\u00020\u0007\"\b\b\u0004\u0010\u0003*\u00020\u0007\"\b\b\u0005\u0010\u0002*\u00020\u0007\"\b\b\u0006\u0010\u0005*\u00020\u0007\"\b\b\u0007\u0010\u0003*\u00020\u00072\u0006\u0010\b\u001a\u0002H\u00022\u0006\u0010\t\u001a\u0002H\u0005H\n¢\u0006\u0004\b\n\u0010\u000b"}, m18302d2 = {"<anonymous>", "Lcom/tinder/StateMachine$Graph$State$TransitionTo;", "STATE", "SIDE_EFFECT", "E", "EVENT", "S", "", "state", "event", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/tinder/StateMachine$Graph$State$TransitionTo;"}, m18303k = 3, m18304mv = {1, 1, 13})
final class StateMachine$GraphBuilder$StateDefinitionBuilder$on$1 extends Lambda implements Function2<Object, Object, StateMachine.Graph.State.TransitionTo<Object, Object>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Lambda f43444a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public StateMachine$GraphBuilder$StateDefinitionBuilder$on$1(Function2 function2) {
        super(2);
        this.f43444a = (Lambda) function2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object state, Object event) {
        Intrinsics.m18600h(state, "state");
        Intrinsics.m18600h(event, "event");
        return (StateMachine.Graph.State.TransitionTo) this.f43444a.invoke(state, event);
    }
}
