package androidx.compose.p013ui.platform;

import android.view.ActionMode;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.platform.actionmodecallback.FloatingTextActionModeCallback;
import androidx.compose.p013ui.platform.actionmodecallback.TextActionModeCallback;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/platform/AndroidTextToolbar;", "Landroidx/compose/ui/platform/TextToolbar;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class AndroidTextToolbar implements TextToolbar {

    /* JADX INFO: renamed from: a */
    public final AndroidComposeView f19281a;

    /* JADX INFO: renamed from: b */
    public ActionMode f19282b;

    /* JADX INFO: renamed from: c */
    public final TextActionModeCallback f19283c = new TextActionModeCallback(new AndroidTextToolbar$textActionModeCallback$1(this));

    /* JADX INFO: renamed from: d */
    public TextToolbarStatus f19284d = TextToolbarStatus.f19532b;

    public AndroidTextToolbar(AndroidComposeView androidComposeView) {
        this.f19281a = androidComposeView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.p013ui.platform.TextToolbar
    /* JADX INFO: renamed from: a */
    public final void mo3198a(Rect rect, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05) {
        TextActionModeCallback textActionModeCallback = this.f19283c;
        textActionModeCallback.f19645b = rect;
        textActionModeCallback.f19646c = function0;
        textActionModeCallback.f19648e = function03;
        textActionModeCallback.f19647d = (Lambda) function02;
        textActionModeCallback.f19649f = function04;
        textActionModeCallback.f19650g = (Lambda) function05;
        ActionMode actionMode = this.f19282b;
        if (actionMode != null) {
            actionMode.invalidate();
            return;
        }
        this.f19284d = TextToolbarStatus.f19531a;
        this.f19282b = this.f19281a.startActionMode(new FloatingTextActionModeCallback(textActionModeCallback), 1);
    }

    @Override // androidx.compose.p013ui.platform.TextToolbar
    /* JADX INFO: renamed from: b */
    public final void mo3199b(Rect rect, Function0 function0, Function0 function02, Function0 function03, Function0 function04) {
        mo3198a(rect, function0, function02, function03, function04, null);
    }

    @Override // androidx.compose.p013ui.platform.TextToolbar
    /* JADX INFO: renamed from: getStatus, reason: from getter */
    public final TextToolbarStatus getF19284d() {
        return this.f19284d;
    }

    @Override // androidx.compose.p013ui.platform.TextToolbar
    public final void hide() {
        this.f19284d = TextToolbarStatus.f19532b;
        ActionMode actionMode = this.f19282b;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.f19282b = null;
    }
}
