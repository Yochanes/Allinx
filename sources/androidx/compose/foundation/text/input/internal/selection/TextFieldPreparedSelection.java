package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.p013ui.text.TextLayoutResult;
import androidx.compose.p013ui.text.TextRange;
import androidx.compose.p013ui.text.style.ResolvedTextDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;", "", "Companion", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class TextFieldPreparedSelection {

    /* JADX INFO: renamed from: a */
    public final TransformedTextFieldState f9226a;

    /* JADX INFO: renamed from: b */
    public final TextLayoutResult f9227b;

    /* JADX INFO: renamed from: c */
    public final TextFieldPreparedSelectionState f9228c;

    /* JADX INFO: renamed from: d */
    public long f9229d;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection$Companion;", "", "", "NoCharacterFound", "I", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public TextFieldPreparedSelection(TransformedTextFieldState transformedTextFieldState, TextLayoutResult textLayoutResult, boolean z2, float f, TextFieldPreparedSelectionState textFieldPreparedSelectionState) {
        this.f9226a = transformedTextFieldState;
        this.f9227b = textLayoutResult;
        this.f9228c = textFieldPreparedSelectionState;
        Snapshot snapshotM4786a = Snapshot.Companion.m4786a();
        Function1 function1Mo4767e = snapshotM4786a != null ? snapshotM4786a.mo4767e() : null;
        Snapshot snapshotM4787b = Snapshot.Companion.m4787b(snapshotM4786a);
        try {
            transformedTextFieldState.getClass();
            throw null;
        } catch (Throwable th) {
            Snapshot.Companion.m4790e(snapshotM4786a, snapshotM4787b, function1Mo4767e);
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3473a() {
        TextLayoutResult textLayoutResult = this.f9227b;
        if (textLayoutResult == null) {
            return true;
        }
        long j = this.f9229d;
        int i = TextRange.f20116c;
        return textLayoutResult.m6399h((int) (j & 4294967295L)) == ResolvedTextDirection.f20528a;
    }

    /* JADX INFO: renamed from: b */
    public final void m3474b() {
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public final void m3475c() {
        throw null;
    }
}
