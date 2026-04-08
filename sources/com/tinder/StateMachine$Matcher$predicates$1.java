package com.tinder;

import com.tinder.StateMachine;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\n\b\u0001\u0010\u0004 \u0001*\u0002H\u0002\"\b\b\u0002\u0010\u0005*\u00020\u0003\"\b\b\u0003\u0010\u0006*\u00020\u0003\"\b\b\u0004\u0010\u0007*\u00020\u00032\u0006\u0010\b\u001a\u0002H\u0002H\n¢\u0006\u0004\b\t\u0010\n"}, m18302d2 = {"<anonymous>", "", "T", "", "R", "STATE", "EVENT", "SIDE_EFFECT", "it", "invoke", "(Ljava/lang/Object;)Z"}, m18303k = 3, m18304mv = {1, 1, 13})
final class StateMachine$Matcher$predicates$1 extends Lambda implements Function1<Object, Boolean> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ StateMachine.Matcher f43447a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateMachine$Matcher$predicates$1(StateMachine.Matcher matcher) {
        super(1);
        this.f43447a = matcher;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object it) {
        Intrinsics.m18600h(it, "it");
        return Boolean.valueOf(this.f43447a.f43446a.isInstance(it));
    }
}
