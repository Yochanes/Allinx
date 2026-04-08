package androidx.compose.p013ui.text;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/TextLinkStyles;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class TextLinkStyles {

    /* JADX INFO: renamed from: a */
    public final SpanStyle f20107a;

    /* JADX INFO: renamed from: b */
    public final SpanStyle f20108b;

    /* JADX INFO: renamed from: c */
    public final SpanStyle f20109c;

    /* JADX INFO: renamed from: d */
    public final SpanStyle f20110d;

    public TextLinkStyles(SpanStyle spanStyle, SpanStyle spanStyle2, SpanStyle spanStyle3, SpanStyle spanStyle4) {
        this.f20107a = spanStyle;
        this.f20108b = spanStyle2;
        this.f20109c = spanStyle3;
        this.f20110d = spanStyle4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof TextLinkStyles)) {
            return false;
        }
        TextLinkStyles textLinkStyles = (TextLinkStyles) obj;
        return Intrinsics.m18594b(this.f20107a, textLinkStyles.f20107a) && Intrinsics.m18594b(this.f20108b, textLinkStyles.f20108b) && Intrinsics.m18594b(this.f20109c, textLinkStyles.f20109c) && Intrinsics.m18594b(this.f20110d, textLinkStyles.f20110d);
    }

    public final int hashCode() {
        SpanStyle spanStyle = this.f20107a;
        int iHashCode = (spanStyle != null ? spanStyle.hashCode() : 0) * 31;
        SpanStyle spanStyle2 = this.f20108b;
        int iHashCode2 = (iHashCode + (spanStyle2 != null ? spanStyle2.hashCode() : 0)) * 31;
        SpanStyle spanStyle3 = this.f20109c;
        int iHashCode3 = (iHashCode2 + (spanStyle3 != null ? spanStyle3.hashCode() : 0)) * 31;
        SpanStyle spanStyle4 = this.f20110d;
        return iHashCode3 + (spanStyle4 != null ? spanStyle4.hashCode() : 0);
    }
}
