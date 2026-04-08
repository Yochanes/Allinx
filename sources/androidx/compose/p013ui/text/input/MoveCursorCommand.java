package androidx.compose.p013ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/input/MoveCursorCommand;", "Landroidx/compose/ui/text/input/EditCommand;", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class MoveCursorCommand implements EditCommand {
    @Override // androidx.compose.p013ui.text.input.EditCommand
    /* JADX INFO: renamed from: a */
    public final void mo3330a(EditingBuffer editingBuffer) {
        if (editingBuffer.m6538d() == -1) {
            int i = editingBuffer.f20358b;
            editingBuffer.m6542h(i, i);
        }
        int i2 = editingBuffer.f20358b;
        editingBuffer.f20357a.toString();
        editingBuffer.m6542h(i2, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoveCursorCommand)) {
            return false;
        }
        ((MoveCursorCommand) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "MoveCursorCommand(amount=0)";
    }
}
