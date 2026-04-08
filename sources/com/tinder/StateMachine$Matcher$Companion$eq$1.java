package com.tinder;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\n\b\u0001\u0010\u0004\u0018\u0001*\u0002H\u0002\"\b\b\u0002\u0010\u0002*\u00020\u0003\"\n\b\u0003\u0010\u0004 \u0001*\u0002H\u0002\"\b\b\u0004\u0010\u0005*\u00020\u0003\"\b\b\u0005\u0010\u0006*\u00020\u0003\"\b\b\u0006\u0010\u0007*\u00020\u0003*\u0002H\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, m18302d2 = {"<anonymous>", "", "T", "", "R", "STATE", "EVENT", "SIDE_EFFECT", "invoke", "(Ljava/lang/Object;)Z"}, m18303k = 3, m18304mv = {1, 1, 13})
public final class StateMachine$Matcher$Companion$eq$1 extends Lambda implements Function1<Object, Boolean> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object receiver$0) {
        Intrinsics.m18600h(receiver$0, "receiver$0");
        return Boolean.valueOf(receiver$0.equals(null));
    }
}
