package androidx.compose.p013ui.text;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.p013ui.graphics.Brush;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.Shadow;
import androidx.compose.p013ui.graphics.drawscope.DrawStyle;
import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.font.FontFamily;
import androidx.compose.p013ui.text.font.FontStyle;
import androidx.compose.p013ui.text.font.FontSynthesis;
import androidx.compose.p013ui.text.font.FontWeight;
import androidx.compose.p013ui.text.intl.LocaleList;
import androidx.compose.p013ui.text.style.BaselineShift;
import androidx.compose.p013ui.text.style.TextDecoration;
import androidx.compose.p013ui.text.style.TextForegroundStyle;
import androidx.compose.p013ui.text.style.TextGeometricTransform;
import androidx.compose.p013ui.unit.TextUnit;
import androidx.compose.p013ui.unit.TextUnitType;
import androidx.compose.runtime.Immutable;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/SpanStyle;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class SpanStyle implements AnnotatedString.Annotation {

    /* JADX INFO: renamed from: a */
    public final TextForegroundStyle f20064a;

    /* JADX INFO: renamed from: b, reason: from toString */
    public final long fontSize;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final FontWeight fontWeight;

    /* JADX INFO: renamed from: d, reason: from toString */
    public final FontStyle fontStyle;

    /* JADX INFO: renamed from: e, reason: from toString */
    public final FontSynthesis fontSynthesis;

    /* JADX INFO: renamed from: f, reason: from toString */
    public final FontFamily fontFamily;

    /* JADX INFO: renamed from: g, reason: from toString */
    public final String fontFeatureSettings;

    /* JADX INFO: renamed from: h, reason: from toString */
    public final long letterSpacing;

    /* JADX INFO: renamed from: i, reason: from toString */
    public final BaselineShift baselineShift;

    /* JADX INFO: renamed from: j, reason: from toString */
    public final TextGeometricTransform textGeometricTransform;

    /* JADX INFO: renamed from: k, reason: from toString */
    public final LocaleList localeList;

    /* JADX INFO: renamed from: l */
    public final long f20075l;

    /* JADX INFO: renamed from: m, reason: from toString */
    public final TextDecoration background;

    /* JADX INFO: renamed from: n, reason: from toString */
    public final Shadow shadow;

    /* JADX INFO: renamed from: o, reason: from toString */
    public final PlatformSpanStyle platformStyle;

    /* JADX INFO: renamed from: p, reason: from toString */
    public final DrawStyle drawStyle;

    public SpanStyle(TextForegroundStyle textForegroundStyle, long j, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j2, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j3, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle, DrawStyle drawStyle) {
        this.f20064a = textForegroundStyle;
        this.fontSize = j;
        this.fontWeight = fontWeight;
        this.fontStyle = fontStyle;
        this.fontSynthesis = fontSynthesis;
        this.fontFamily = fontFamily;
        this.fontFeatureSettings = str;
        this.letterSpacing = j2;
        this.baselineShift = baselineShift;
        this.textGeometricTransform = textGeometricTransform;
        this.localeList = localeList;
        this.f20075l = j3;
        this.background = textDecoration;
        this.shadow = shadow;
        this.platformStyle = platformSpanStyle;
        this.drawStyle = drawStyle;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m6386a(SpanStyle spanStyle) {
        if (this == spanStyle) {
            return true;
        }
        return TextUnit.m6673a(this.fontSize, spanStyle.fontSize) && Intrinsics.m18594b(this.fontWeight, spanStyle.fontWeight) && Intrinsics.m18594b(this.fontStyle, spanStyle.fontStyle) && Intrinsics.m18594b(this.fontSynthesis, spanStyle.fontSynthesis) && Intrinsics.m18594b(this.fontFamily, spanStyle.fontFamily) && Intrinsics.m18594b(this.fontFeatureSettings, spanStyle.fontFeatureSettings) && TextUnit.m6673a(this.letterSpacing, spanStyle.letterSpacing) && Intrinsics.m18594b(this.baselineShift, spanStyle.baselineShift) && Intrinsics.m18594b(this.textGeometricTransform, spanStyle.textGeometricTransform) && Intrinsics.m18594b(this.localeList, spanStyle.localeList) && Color.m5181c(this.f20075l, spanStyle.f20075l) && Intrinsics.m18594b(this.platformStyle, spanStyle.platformStyle);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m6387b(SpanStyle spanStyle) {
        return Intrinsics.m18594b(this.f20064a, spanStyle.f20064a) && Intrinsics.m18594b(this.background, spanStyle.background) && Intrinsics.m18594b(this.shadow, spanStyle.shadow) && Intrinsics.m18594b(this.drawStyle, spanStyle.drawStyle);
    }

    /* JADX INFO: renamed from: c */
    public final SpanStyle m6388c(SpanStyle spanStyle) {
        if (spanStyle == null) {
            return this;
        }
        TextForegroundStyle textForegroundStyle = spanStyle.f20064a;
        return SpanStyleKt.m6389a(this, textForegroundStyle.getF20516a(), textForegroundStyle.mo6593e(), textForegroundStyle.getF20515b(), spanStyle.fontSize, spanStyle.fontWeight, spanStyle.fontStyle, spanStyle.fontSynthesis, spanStyle.fontFamily, spanStyle.fontFeatureSettings, spanStyle.letterSpacing, spanStyle.baselineShift, spanStyle.textGeometricTransform, spanStyle.localeList, spanStyle.f20075l, spanStyle.background, spanStyle.shadow, spanStyle.platformStyle, spanStyle.drawStyle);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpanStyle)) {
            return false;
        }
        SpanStyle spanStyle = (SpanStyle) obj;
        return m6386a(spanStyle) && m6387b(spanStyle);
    }

    public final int hashCode() {
        TextForegroundStyle textForegroundStyle = this.f20064a;
        long jMo6592c = textForegroundStyle.getF20516a();
        int i = Color.f17584l;
        int iHashCode = Long.hashCode(jMo6592c) * 31;
        Brush brushMo6593e = textForegroundStyle.mo6593e();
        int iHashCode2 = (Float.hashCode(textForegroundStyle.getF20515b()) + ((iHashCode + (brushMo6593e != null ? brushMo6593e.hashCode() : 0)) * 31)) * 31;
        TextUnitType[] textUnitTypeArr = TextUnit.f20574b;
        int iM2231f = AbstractC0455a.m2231f(this.fontSize, iHashCode2, 31);
        FontWeight fontWeight = this.fontWeight;
        int i2 = (iM2231f + (fontWeight != null ? fontWeight.f20303a : 0)) * 31;
        FontStyle fontStyle = this.fontStyle;
        int iHashCode3 = (i2 + (fontStyle != null ? Integer.hashCode(fontStyle.f20290a) : 0)) * 31;
        FontSynthesis fontSynthesis = this.fontSynthesis;
        int iHashCode4 = (iHashCode3 + (fontSynthesis != null ? Integer.hashCode(fontSynthesis.f20291a) : 0)) * 31;
        FontFamily fontFamily = this.fontFamily;
        int iHashCode5 = (iHashCode4 + (fontFamily != null ? fontFamily.hashCode() : 0)) * 31;
        String str = this.fontFeatureSettings;
        int iM2231f2 = AbstractC0455a.m2231f(this.letterSpacing, (iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31);
        BaselineShift baselineShift = this.baselineShift;
        int iHashCode6 = (iM2231f2 + (baselineShift != null ? Float.hashCode(baselineShift.f20513a) : 0)) * 31;
        TextGeometricTransform textGeometricTransform = this.textGeometricTransform;
        int iHashCode7 = (iHashCode6 + (textGeometricTransform != null ? textGeometricTransform.hashCode() : 0)) * 31;
        LocaleList localeList = this.localeList;
        int iM2231f3 = AbstractC0455a.m2231f(this.f20075l, (iHashCode7 + (localeList != null ? localeList.f20449a.hashCode() : 0)) * 31, 31);
        TextDecoration textDecoration = this.background;
        int i3 = (iM2231f3 + (textDecoration != null ? textDecoration.f20536a : 0)) * 31;
        Shadow shadow = this.shadow;
        int iHashCode8 = (i3 + (shadow != null ? shadow.hashCode() : 0)) * 31;
        PlatformSpanStyle platformSpanStyle = this.platformStyle;
        int iHashCode9 = (iHashCode8 + (platformSpanStyle != null ? platformSpanStyle.hashCode() : 0)) * 31;
        DrawStyle drawStyle = this.drawStyle;
        return iHashCode9 + (drawStyle != null ? drawStyle.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        TextForegroundStyle textForegroundStyle = this.f20064a;
        sb.append((Object) Color.m5187i(textForegroundStyle.getF20516a()));
        sb.append(", brush=");
        sb.append(textForegroundStyle.mo6593e());
        sb.append(", alpha=");
        sb.append(textForegroundStyle.getF20515b());
        sb.append(", fontSize=");
        sb.append((Object) TextUnit.m6677e(this.fontSize));
        sb.append(", fontWeight=");
        sb.append(this.fontWeight);
        sb.append(", fontStyle=");
        sb.append(this.fontStyle);
        sb.append(", fontSynthesis=");
        sb.append(this.fontSynthesis);
        sb.append(", fontFamily=");
        sb.append(this.fontFamily);
        sb.append(", fontFeatureSettings=");
        sb.append(this.fontFeatureSettings);
        sb.append(", letterSpacing=");
        sb.append((Object) TextUnit.m6677e(this.letterSpacing));
        sb.append(", baselineShift=");
        sb.append(this.baselineShift);
        sb.append(", textGeometricTransform=");
        sb.append(this.textGeometricTransform);
        sb.append(", localeList=");
        sb.append(this.localeList);
        sb.append(", background=");
        AbstractC0455a.m2223B(this.f20075l, ", textDecoration=", sb);
        sb.append(this.background);
        sb.append(", shadow=");
        sb.append(this.shadow);
        sb.append(", platformStyle=");
        sb.append(this.platformStyle);
        sb.append(", drawStyle=");
        sb.append(this.drawStyle);
        sb.append(')');
        return sb.toString();
    }

    public SpanStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, int i) {
        this((i & 1) != 0 ? Color.f17583k : j, (i & 2) != 0 ? TextUnit.f20575c : j2, (i & 4) != 0 ? null : fontWeight, (i & 8) != 0 ? null : fontStyle, (i & 16) != 0 ? null : fontSynthesis, (i & 32) != 0 ? null : fontFamily, (i & 64) != 0 ? null : str, (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? TextUnit.f20575c : j3, (i & 256) != 0 ? null : baselineShift, (i & 512) != 0 ? null : textGeometricTransform, (i & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? null : localeList, (i & 2048) != 0 ? Color.f17583k : j4, (i & 4096) != 0 ? null : textDecoration, (i & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? null : shadow, (PlatformSpanStyle) null);
    }

    public SpanStyle(long j, long j2, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j3, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformSpanStyle) {
        this(TextForegroundStyle.Companion.m6607b(j), j2, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j3, baselineShift, textGeometricTransform, localeList, j4, textDecoration, shadow, platformSpanStyle, null);
    }
}
