package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.text.style.ResolvedTextDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;", "", "Companion", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final /* data */ class TextFieldHandleState {

    /* JADX INFO: renamed from: f */
    public static final TextFieldHandleState f9201f = new TextFieldHandleState(false, 9205357640488583168L, 0.0f, ResolvedTextDirection.f20528a, false);

    /* JADX INFO: renamed from: a */
    public final boolean f9202a;

    /* JADX INFO: renamed from: b */
    public final long f9203b;

    /* JADX INFO: renamed from: c */
    public final float f9204c;

    /* JADX INFO: renamed from: d */
    public final ResolvedTextDirection f9205d;

    /* JADX INFO: renamed from: e */
    public final boolean f9206e;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState$Companion;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public TextFieldHandleState(boolean z2, long j, float f, ResolvedTextDirection resolvedTextDirection, boolean z3) {
        this.f9202a = z2;
        this.f9203b = j;
        this.f9204c = f;
        this.f9205d = resolvedTextDirection;
        this.f9206e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldHandleState)) {
            return false;
        }
        TextFieldHandleState textFieldHandleState = (TextFieldHandleState) obj;
        return this.f9202a == textFieldHandleState.f9202a && Offset.m5053c(this.f9203b, textFieldHandleState.f9203b) && Float.compare(this.f9204c, textFieldHandleState.f9204c) == 0 && this.f9205d == textFieldHandleState.f9205d && this.f9206e == textFieldHandleState.f9206e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9206e) + ((this.f9205d.hashCode() + AbstractC0455a.m2226a(AbstractC0455a.m2231f(this.f9203b, Boolean.hashCode(this.f9202a) * 31, 31), this.f9204c, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextFieldHandleState(visible=");
        sb.append(this.f9202a);
        sb.append(", position=");
        sb.append((Object) Offset.m5060j(this.f9203b));
        sb.append(", lineHeight=");
        sb.append(this.f9204c);
        sb.append(", direction=");
        sb.append(this.f9205d);
        sb.append(", handlesCrossed=");
        return AbstractC0455a.m2243r(sb, this.f9206e, ')');
    }
}
