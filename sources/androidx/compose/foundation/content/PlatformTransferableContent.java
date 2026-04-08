package androidx.compose.foundation.content;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@ExperimentalFoundationApi
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/content/PlatformTransferableContent;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class PlatformTransferableContent {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformTransferableContent)) {
            return false;
        }
        ((PlatformTransferableContent) obj).getClass();
        return Intrinsics.m18594b(null, null) && Intrinsics.m18594b(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "PlatformTransferableContent(linkUri=" + ((Object) null) + ", extras=" + ((Object) null) + ')';
    }
}
