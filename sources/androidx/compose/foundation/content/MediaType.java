package androidx.compose.foundation.content;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/content/MediaType;", "", "Companion", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class MediaType {

    /* JADX INFO: renamed from: b */
    public static final MediaType f5191b = new MediaType("text/*");

    /* JADX INFO: renamed from: c */
    public static final MediaType f5192c = new MediaType("*/*");

    /* JADX INFO: renamed from: a */
    public final String f5193a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/content/MediaType$Companion;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public MediaType(String str) {
        this.f5193a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaType)) {
            return false;
        }
        return Intrinsics.m18594b(this.f5193a, ((MediaType) obj).f5193a);
    }

    public final int hashCode() {
        return this.f5193a.hashCode();
    }

    public final String toString() {
        return AbstractC0000a.m19p(new StringBuilder("MediaType(representation='"), this.f5193a, "')");
    }
}
