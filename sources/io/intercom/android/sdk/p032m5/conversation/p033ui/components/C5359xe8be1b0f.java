package io.intercom.android.sdk.p032m5.conversation.p033ui.components;

import androidx.compose.p013ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.InlineSourcesSheetContentKt$InlineSourcesSheetContent$1$1$2$1$2$2$1$1$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class C5359xe8be1b0f implements Function1<DrawScope, Unit> {
    final /* synthetic */ long $iconBackgroundColor;

    public C5359xe8be1b0f(long j) {
        this.$iconBackgroundColor = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DrawScope) obj);
        return Unit.f51459a;
    }

    public final void invoke(DrawScope drawBehind) {
        Intrinsics.m18599g(drawBehind, "$this$drawBehind");
        DrawScope.m5374Y0(drawBehind, this.$iconBackgroundColor, 0.0f, 0L, null, 0, 126);
    }
}
