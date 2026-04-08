package androidx.compose.p013ui.text.input;

import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/input/TransformedText;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class TransformedText {

    /* JADX INFO: renamed from: a */
    public final AnnotatedString f20438a;

    /* JADX INFO: renamed from: b */
    public final OffsetMapping f20439b;

    public TransformedText(AnnotatedString annotatedString, OffsetMapping offsetMapping) {
        this.f20438a = annotatedString;
        this.f20439b = offsetMapping;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransformedText)) {
            return false;
        }
        TransformedText transformedText = (TransformedText) obj;
        return Intrinsics.m18594b(this.f20438a, transformedText.f20438a) && Intrinsics.m18594b(this.f20439b, transformedText.f20439b);
    }

    public final int hashCode() {
        return this.f20439b.hashCode() + (this.f20438a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.f20438a) + ", offsetMapping=" + this.f20439b + ')';
    }
}
