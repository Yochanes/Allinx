package androidx.compose.p013ui.window;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.Immutable;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/window/PopupProperties;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class PopupProperties {

    /* JADX INFO: renamed from: a */
    public final int f20797a;

    /* JADX INFO: renamed from: b */
    public final boolean f20798b;

    /* JADX INFO: renamed from: c */
    public final boolean f20799c;

    /* JADX INFO: renamed from: d */
    public final boolean f20800d;

    /* JADX INFO: renamed from: e */
    public final boolean f20801e;

    public PopupProperties(int i, boolean z2) {
        this.f20797a = i;
        this.f20798b = z2;
        this.f20799c = true;
        this.f20800d = true;
        this.f20801e = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PopupProperties)) {
            return false;
        }
        PopupProperties popupProperties = (PopupProperties) obj;
        return this.f20797a == popupProperties.f20797a && this.f20798b == popupProperties.f20798b && this.f20799c == popupProperties.f20799c && this.f20800d == popupProperties.f20800d && this.f20801e == popupProperties.f20801e;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + AbstractC0455a.m2230e(AbstractC0455a.m2230e(AbstractC0455a.m2230e(AbstractC0455a.m2230e(this.f20797a * 31, 31, this.f20798b), 31, this.f20799c), 31, this.f20800d), 31, this.f20801e);
    }

    public PopupProperties(boolean z2, int i) {
        this((i & 1) != 0 ? false : z2, SecureFlagPolicy.f20802a, true);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PopupProperties(boolean z2, SecureFlagPolicy secureFlagPolicy, boolean z3) {
        DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = AndroidPopup_androidKt.f20710a;
        int i = !z2 ? 262152 : 262144;
        i = secureFlagPolicy == SecureFlagPolicy.f20803b ? i | UserMetadata.MAX_INTERNAL_KEY_SIZE : i;
        this(z3 ? i : i | 512, secureFlagPolicy == SecureFlagPolicy.f20802a);
    }
}
