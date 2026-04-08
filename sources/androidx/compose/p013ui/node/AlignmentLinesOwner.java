package androidx.compose.p013ui.node;

import androidx.compose.p013ui.layout.Measurable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/ui/node/AlignmentLinesOwner;", "Landroidx/compose/ui/layout/Measurable;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface AlignmentLinesOwner extends Measurable {
    /* JADX INFO: renamed from: A */
    InnerNodeCoordinator mo5709A();

    /* JADX INFO: renamed from: I */
    AlignmentLinesOwner mo5710I();

    /* JADX INFO: renamed from: a0 */
    void mo5711a0();

    /* JADX INFO: renamed from: h0 */
    void mo5712h0(Function1 function1);

    /* JADX INFO: renamed from: o0 */
    void mo5713o0();

    /* JADX INFO: renamed from: p */
    AlignmentLines mo5714p();

    void requestLayout();

    /* JADX INFO: renamed from: x */
    boolean getF18895y();
}
