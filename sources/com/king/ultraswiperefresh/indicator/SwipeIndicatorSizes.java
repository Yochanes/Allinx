package com.king.ultraswiperefresh.indicator;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.p013ui.unit.C1338Dp;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Immutable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/king/ultraswiperefresh/indicator/SwipeIndicatorSizes;", "", "refresh_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
final /* data */ class SwipeIndicatorSizes {

    /* JADX INFO: renamed from: a */
    public final float f43186a;

    /* JADX INFO: renamed from: b */
    public final float f43187b;

    /* JADX INFO: renamed from: c */
    public final float f43188c;

    /* JADX INFO: renamed from: d */
    public final float f43189d;

    /* JADX INFO: renamed from: e */
    public final float f43190e;

    public SwipeIndicatorSizes(float f, float f2, float f3, float f4, float f5) {
        this.f43186a = f;
        this.f43187b = f2;
        this.f43188c = f3;
        this.f43189d = f4;
        this.f43190e = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SwipeIndicatorSizes)) {
            return false;
        }
        SwipeIndicatorSizes swipeIndicatorSizes = (SwipeIndicatorSizes) obj;
        return C1338Dp.m6641a(this.f43186a, swipeIndicatorSizes.f43186a) && C1338Dp.m6641a(this.f43187b, swipeIndicatorSizes.f43187b) && C1338Dp.m6641a(this.f43188c, swipeIndicatorSizes.f43188c) && C1338Dp.m6641a(this.f43189d, swipeIndicatorSizes.f43189d) && C1338Dp.m6641a(this.f43190e, swipeIndicatorSizes.f43190e);
    }

    public final int hashCode() {
        return Float.hashCode(this.f43190e) + AbstractC0455a.m2226a(AbstractC0455a.m2226a(AbstractC0455a.m2226a(Float.hashCode(this.f43186a) * 31, this.f43187b, 31), this.f43188c, 31), this.f43189d, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SwipeIndicatorSizes(size=");
        AbstractC0455a.m2248w(this.f43186a, ", arcRadius=", sb);
        AbstractC0455a.m2248w(this.f43187b, ", strokeWidth=", sb);
        AbstractC0455a.m2248w(this.f43188c, ", arrowWidth=", sb);
        AbstractC0455a.m2248w(this.f43189d, ", arrowHeight=", sb);
        sb.append((Object) C1338Dp.m6642b(this.f43190e));
        sb.append(')');
        return sb.toString();
    }
}
