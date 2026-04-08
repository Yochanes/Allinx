package androidx.compose.foundation.text.input.internal;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/text/input/internal/MaskCodepointTransformation;", "Landroidx/compose/foundation/text/input/internal/CodepointTransformation;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final /* data */ class MaskCodepointTransformation implements CodepointTransformation {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MaskCodepointTransformation)) {
            return false;
        }
        ((MaskCodepointTransformation) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Character.hashCode((char) 0);
    }

    public final String toString() {
        return "MaskCodepointTransformation(character=\u0000)";
    }
}
