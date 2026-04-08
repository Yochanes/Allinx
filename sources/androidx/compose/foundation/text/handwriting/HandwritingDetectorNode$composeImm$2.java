package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.text.input.internal.ComposeInputMethodManager;
import androidx.compose.foundation.text.input.internal.ComposeInputMethodManager_androidKt;
import androidx.compose.p013ui.node.DelegatableNode_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m18302d2 = {"<anonymous>", "Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class HandwritingDetectorNode$composeImm$2 extends Lambda implements Function0<ComposeInputMethodManager> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ HandwritingDetectorNode f8772a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandwritingDetectorNode$composeImm$2(HandwritingDetectorNode handwritingDetectorNode) {
        super(0);
        this.f8772a = handwritingDetectorNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return ComposeInputMethodManager_androidKt.m3311a(DelegatableNode_androidKt.m5745a(this.f8772a));
    }
}
