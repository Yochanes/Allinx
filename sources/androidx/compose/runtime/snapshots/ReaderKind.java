package androidx.compose.runtime.snapshots;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0081@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/runtime/snapshots/ReaderKind;", "", "Companion", "mask", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@JvmInline
public final class ReaderKind {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/runtime/snapshots/ReaderKind$Companion;", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ReaderKind)) {
            return false;
        }
        ((ReaderKind) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(0);
    }

    public final String toString() {
        return "ReaderKind(mask=0)";
    }
}
