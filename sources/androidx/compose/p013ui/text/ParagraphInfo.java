package androidx.compose.p013ui.text;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/ParagraphInfo;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final /* data */ class ParagraphInfo {

    /* JADX INFO: renamed from: a */
    public final AndroidParagraph f19956a;

    /* JADX INFO: renamed from: b */
    public final int f19957b;

    /* JADX INFO: renamed from: c */
    public final int f19958c;

    /* JADX INFO: renamed from: d */
    public final int f19959d;

    /* JADX INFO: renamed from: e */
    public final int f19960e;

    /* JADX INFO: renamed from: f */
    public final float f19961f;

    /* JADX INFO: renamed from: g */
    public final float f19962g;

    public ParagraphInfo(AndroidParagraph androidParagraph, int i, int i2, int i3, int i4, float f, float f2) {
        this.f19956a = androidParagraph;
        this.f19957b = i;
        this.f19958c = i2;
        this.f19959d = i3;
        this.f19960e = i4;
        this.f19961f = f;
        this.f19962g = f2;
    }

    /* JADX INFO: renamed from: a */
    public final Rect m6377a(Rect rect) {
        return rect.m5073k((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(this.f19961f)) & 4294967295L));
    }

    /* JADX INFO: renamed from: b */
    public final long m6378b(long j, boolean z2) {
        if (z2) {
            long j2 = TextRange.f20115b;
            if (TextRange.m6403b(j, j2)) {
                return j2;
            }
        }
        int i = TextRange.f20116c;
        int i2 = (int) (j >> 32);
        int i3 = this.f19957b;
        return TextRangeKt.m6410a(i2 + i3, ((int) (j & 4294967295L)) + i3);
    }

    /* JADX INFO: renamed from: c */
    public final Rect m6379c(Rect rect) {
        float f = -this.f19961f;
        return rect.m5073k((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
    }

    /* JADX INFO: renamed from: d */
    public final int m6380d(int i) {
        int i2 = this.f19958c;
        int i3 = this.f19957b;
        return RangesKt.m18656c(i, i3, i2) - i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParagraphInfo)) {
            return false;
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) obj;
        return this.f19956a.equals(paragraphInfo.f19956a) && this.f19957b == paragraphInfo.f19957b && this.f19958c == paragraphInfo.f19958c && this.f19959d == paragraphInfo.f19959d && this.f19960e == paragraphInfo.f19960e && Float.compare(this.f19961f, paragraphInfo.f19961f) == 0 && Float.compare(this.f19962g, paragraphInfo.f19962g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f19962g) + AbstractC0455a.m2226a(AbstractC0455a.m2228c(this.f19960e, AbstractC0455a.m2228c(this.f19959d, AbstractC0455a.m2228c(this.f19958c, AbstractC0455a.m2228c(this.f19957b, this.f19956a.hashCode() * 31, 31), 31), 31), 31), this.f19961f, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.f19956a);
        sb.append(", startIndex=");
        sb.append(this.f19957b);
        sb.append(", endIndex=");
        sb.append(this.f19958c);
        sb.append(", startLineIndex=");
        sb.append(this.f19959d);
        sb.append(", endLineIndex=");
        sb.append(this.f19960e);
        sb.append(", top=");
        sb.append(this.f19961f);
        sb.append(", bottom=");
        return AbstractC0000a.m16m(sb, this.f19962g, ')');
    }
}
