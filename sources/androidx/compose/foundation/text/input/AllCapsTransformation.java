package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.KeyboardOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/text/input/AllCapsTransformation;", "Landroidx/compose/foundation/text/input/InputTransformation;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final /* data */ class AllCapsTransformation implements InputTransformation {
    @Override // androidx.compose.foundation.text.input.InputTransformation
    /* JADX INFO: renamed from: a */
    public final KeyboardOptions mo3279a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AllCapsTransformation)) {
            return false;
        }
        ((AllCapsTransformation) obj).getClass();
        return true;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "InputTransformation.allCaps(locale=null)";
    }
}
