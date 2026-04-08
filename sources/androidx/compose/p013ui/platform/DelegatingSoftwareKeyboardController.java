package androidx.compose.p013ui.platform;

import androidx.compose.p013ui.text.input.TextInputService;
import androidx.compose.p013ui.text.input.TextInputSession;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/platform/DelegatingSoftwareKeyboardController;", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class DelegatingSoftwareKeyboardController implements SoftwareKeyboardController {

    /* JADX INFO: renamed from: a */
    public final TextInputService f19400a;

    public DelegatingSoftwareKeyboardController(TextInputService textInputService) {
        this.f19400a = textInputService;
    }

    @Override // androidx.compose.p013ui.platform.SoftwareKeyboardController
    public final void hide() {
        this.f19400a.f20408a.mo3340d();
    }

    @Override // androidx.compose.p013ui.platform.SoftwareKeyboardController
    public final void show() {
        TextInputService textInputService = this.f19400a;
        if (((TextInputSession) textInputService.f20409b.get()) != null) {
            textInputService.f20408a.mo3339b();
        }
    }
}
