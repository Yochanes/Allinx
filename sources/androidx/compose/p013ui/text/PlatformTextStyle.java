package androidx.compose.p013ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/PlatformTextStyle;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class PlatformTextStyle {

    /* JADX INFO: renamed from: a */
    public final PlatformSpanStyle f19982a;

    /* JADX INFO: renamed from: b */
    public final PlatformParagraphStyle f19983b;

    public PlatformTextStyle(PlatformSpanStyle platformSpanStyle, PlatformParagraphStyle platformParagraphStyle) {
        this.f19982a = platformSpanStyle;
        this.f19983b = platformParagraphStyle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformTextStyle)) {
            return false;
        }
        PlatformTextStyle platformTextStyle = (PlatformTextStyle) obj;
        return Intrinsics.m18594b(this.f19983b, platformTextStyle.f19983b) && Intrinsics.m18594b(this.f19982a, platformTextStyle.f19982a);
    }

    public final int hashCode() {
        PlatformSpanStyle platformSpanStyle = this.f19982a;
        int iHashCode = (platformSpanStyle != null ? platformSpanStyle.hashCode() : 0) * 31;
        PlatformParagraphStyle platformParagraphStyle = this.f19983b;
        return iHashCode + (platformParagraphStyle != null ? platformParagraphStyle.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.f19982a + ", paragraphSyle=" + this.f19983b + ')';
    }

    public PlatformTextStyle() {
        this(null, new PlatformParagraphStyle());
    }
}
