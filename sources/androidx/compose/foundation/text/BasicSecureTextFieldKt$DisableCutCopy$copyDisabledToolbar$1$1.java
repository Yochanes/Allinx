package androidx.compose.foundation.text;

import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.platform.TextToolbar;
import androidx.compose.p013ui.platform.TextToolbarStatus;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/compose/foundation/text/BasicSecureTextFieldKt$DisableCutCopy$copyDisabledToolbar$1$1", "Landroidx/compose/ui/platform/TextToolbar;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class BasicSecureTextFieldKt$DisableCutCopy$copyDisabledToolbar$1$1 implements TextToolbar {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TextToolbar f8019a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TextToolbar f8020b;

    public BasicSecureTextFieldKt$DisableCutCopy$copyDisabledToolbar$1$1(TextToolbar textToolbar) {
        this.f8020b = textToolbar;
        this.f8019a = textToolbar;
    }

    @Override // androidx.compose.p013ui.platform.TextToolbar
    /* JADX INFO: renamed from: a */
    public final void mo3198a(Rect rect, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05) {
        this.f8020b.mo3198a(rect, null, function02, null, function04, function05);
    }

    @Override // androidx.compose.p013ui.platform.TextToolbar
    /* JADX INFO: renamed from: b */
    public final void mo3199b(Rect rect, Function0 function0, Function0 function02, Function0 function03, Function0 function04) {
        this.f8019a.mo3199b(rect, function0, function02, function03, function04);
    }

    @Override // androidx.compose.p013ui.platform.TextToolbar
    public final TextToolbarStatus getStatus() {
        return this.f8019a.getStatus();
    }

    @Override // androidx.compose.p013ui.platform.TextToolbar
    public final void hide() {
        this.f8019a.hide();
    }
}
