package androidx.compose.foundation.gestures;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.p013ui.geometry.Offset;
import kotlin.Metadata;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/gestures/AnimationData;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final /* data */ class AnimationData {

    /* JADX INFO: renamed from: a */
    public final float f5414a;

    /* JADX INFO: renamed from: b */
    public final long f5415b;

    /* JADX INFO: renamed from: c */
    public final float f5416c;

    public AnimationData(float f, float f2, long j) {
        this.f5414a = f;
        this.f5415b = j;
        this.f5416c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnimationData)) {
            return false;
        }
        AnimationData animationData = (AnimationData) obj;
        return Float.compare(this.f5414a, animationData.f5414a) == 0 && Offset.m5053c(this.f5415b, animationData.f5415b) && Float.compare(this.f5416c, animationData.f5416c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f5416c) + AbstractC0455a.m2231f(this.f5415b, Float.hashCode(this.f5414a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimationData(zoom=");
        sb.append(this.f5414a);
        sb.append(", offset=");
        sb.append((Object) Offset.m5060j(this.f5415b));
        sb.append(", degrees=");
        return AbstractC0000a.m16m(sb, this.f5416c, ')');
    }
}
