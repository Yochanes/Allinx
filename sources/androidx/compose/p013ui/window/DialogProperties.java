package androidx.compose.p013ui.window;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/window/DialogProperties;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class DialogProperties {

    /* JADX INFO: renamed from: a */
    public final boolean f20759a;

    /* JADX INFO: renamed from: b */
    public final boolean f20760b;

    /* JADX INFO: renamed from: c */
    public final SecureFlagPolicy f20761c;

    /* JADX INFO: renamed from: d */
    public final boolean f20762d;

    /* JADX INFO: renamed from: e */
    public final boolean f20763e;

    public DialogProperties(int i) {
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        SecureFlagPolicy secureFlagPolicy = SecureFlagPolicy.f20802a;
        this.f20759a = true;
        this.f20760b = z2;
        this.f20761c = secureFlagPolicy;
        this.f20762d = z3;
        this.f20763e = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DialogProperties)) {
            return false;
        }
        DialogProperties dialogProperties = (DialogProperties) obj;
        return this.f20759a == dialogProperties.f20759a && this.f20760b == dialogProperties.f20760b && this.f20761c == dialogProperties.f20761c && this.f20762d == dialogProperties.f20762d && this.f20763e == dialogProperties.f20763e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f20763e) + AbstractC0455a.m2230e((this.f20761c.hashCode() + AbstractC0455a.m2230e(Boolean.hashCode(this.f20759a) * 31, 31, this.f20760b)) * 31, 31, this.f20762d);
    }
}
