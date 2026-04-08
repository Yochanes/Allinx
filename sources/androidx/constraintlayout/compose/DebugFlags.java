package androidx.constraintlayout.compose;

import androidx.compose.animation.AbstractC0455a;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/constraintlayout/compose/DebugFlags;", "", "Companion", "flags", "", "constraintlayout-compose_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@JvmInline
public final class DebugFlags {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m18302d2 = {"Landroidx/constraintlayout/compose/DebugFlags$Companion;", "", "", "BOUNDS_FLAG", "I", "KEY_POSITIONS_FLAG", "PATHS_FLAG", "constraintlayout-compose_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DebugFlags)) {
            return false;
        }
        ((DebugFlags) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DebugFlags(showBounds = ");
        sb.append(false);
        sb.append(", showPaths = ");
        sb.append(false);
        sb.append(", showKeyPositions = ");
        return AbstractC0455a.m2243r(sb, false, ')');
    }
}
