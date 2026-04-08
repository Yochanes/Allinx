package androidx.constraintlayout.compose;

import androidx.compose.animation.AbstractC0455a;
import kotlin.Metadata;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/constraintlayout/compose/CarouselState;", "", "constraintlayout-compose_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
final /* data */ class CarouselState {

    /* JADX INFO: renamed from: a */
    public MotionCarouselDirection f20845a;

    /* JADX INFO: renamed from: b */
    public int f20846b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarouselState)) {
            return false;
        }
        CarouselState carouselState = (CarouselState) obj;
        return this.f20845a == carouselState.f20845a && this.f20846b == carouselState.f20846b;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + AbstractC0455a.m2230e(AbstractC0455a.m2228c(0, AbstractC0455a.m2228c(this.f20846b, this.f20845a.hashCode() * 31, 31), 31), 31, false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CarouselState(direction=");
        sb.append(this.f20845a);
        sb.append(", index=");
        return AbstractC0000a.m11h(this.f20846b, ", targetIndex=0, snapping=false, animating=false)", sb);
    }
}
