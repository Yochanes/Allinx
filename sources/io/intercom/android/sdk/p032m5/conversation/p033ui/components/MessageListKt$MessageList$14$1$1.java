package io.intercom.android.sdk.p032m5.conversation.p033ui.components;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class MessageListKt$MessageList$14$1$1 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ Function2<Composer, Integer, Unit> $renderMessageRow;

    /* JADX WARN: Multi-variable type inference failed */
    public MessageListKt$MessageList$14$1$1(Function2<? super Composer, ? super Integer, Unit> function2) {
        this.$renderMessageRow = function2;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f51459a;
    }

    @ComposableTarget
    @Composable
    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        Intrinsics.m18599g(AnimatedVisibility, "$this$AnimatedVisibility");
        this.$renderMessageRow.invoke(composer, 6);
    }
}
