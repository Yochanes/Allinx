package androidx.compose.p013ui.autofill;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0083@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/ui/autofill/AndroidContentDataType;", "Landroidx/compose/ui/autofill/ContentDataType;", "androidAutofillType", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@JvmInline
final class AndroidContentDataType implements ContentDataType {
    public final boolean equals(Object obj) {
        if (!(obj instanceof AndroidContentDataType)) {
            return false;
        }
        ((AndroidContentDataType) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(1);
    }

    public final String toString() {
        return "AndroidContentDataType(androidAutofillType=1)";
    }
}
