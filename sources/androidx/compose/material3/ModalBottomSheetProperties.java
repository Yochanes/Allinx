package androidx.compose.material3;

import androidx.compose.p013ui.window.SecureFlagPolicy;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@ExperimentalMaterial3Api
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material3/ModalBottomSheetProperties;", "", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class ModalBottomSheetProperties {

    /* JADX INFO: renamed from: a */
    public final SecureFlagPolicy f13774a = SecureFlagPolicy.f20802a;

    /* JADX INFO: renamed from: b */
    public final boolean f13775b = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ModalBottomSheetProperties) {
            return this.f13774a == ((ModalBottomSheetProperties) obj).f13774a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f13775b) + (this.f13774a.hashCode() * 31);
    }
}
