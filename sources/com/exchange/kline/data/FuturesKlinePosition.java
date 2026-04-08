package com.exchange.kline.data;

import androidx.compose.animation.AbstractC0455a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/kline/data/FuturesKlinePosition;", "", "kline_release"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final /* data */ class FuturesKlinePosition {

    /* JADX INFO: renamed from: a */
    public final long f42119a;

    /* JADX INFO: renamed from: b */
    public final double f42120b;

    /* JADX INFO: renamed from: c */
    public final double f42121c;

    /* JADX INFO: renamed from: d */
    public double f42122d;

    /* JADX INFO: renamed from: e */
    public final boolean f42123e;

    /* JADX INFO: renamed from: f */
    public final String f42124f;

    /* JADX INFO: renamed from: g */
    public float f42125g;

    /* JADX INFO: renamed from: h */
    public float f42126h;

    public FuturesKlinePosition(long j, double d, double d2, double d3, boolean z2, String money) {
        Intrinsics.m18599g(money, "money");
        this.f42119a = j;
        this.f42120b = d;
        this.f42121c = d2;
        this.f42122d = d3;
        this.f42123e = z2;
        this.f42124f = money;
        this.f42125g = 0.0f;
        this.f42126h = 0.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FuturesKlinePosition)) {
            return false;
        }
        FuturesKlinePosition futuresKlinePosition = (FuturesKlinePosition) obj;
        return this.f42119a == futuresKlinePosition.f42119a && Double.compare(this.f42120b, futuresKlinePosition.f42120b) == 0 && Double.compare(this.f42121c, futuresKlinePosition.f42121c) == 0 && Double.compare(this.f42122d, futuresKlinePosition.f42122d) == 0 && this.f42123e == futuresKlinePosition.f42123e && Intrinsics.m18594b(this.f42124f, futuresKlinePosition.f42124f) && Float.compare(this.f42125g, futuresKlinePosition.f42125g) == 0 && Float.compare(this.f42126h, futuresKlinePosition.f42126h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f42126h) + AbstractC0455a.m2226a(AbstractC0000a.m5b(AbstractC0455a.m2230e(AbstractC0455a.m2227b(AbstractC0455a.m2227b(AbstractC0455a.m2227b(Long.hashCode(this.f42119a) * 31, 31, this.f42120b), 31, this.f42121c), 31, this.f42122d), 31, this.f42123e), 31, this.f42124f), this.f42125g, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FuturesKlinePosition(positionId=");
        sb.append(this.f42119a);
        sb.append(", liqPrice=");
        sb.append(this.f42120b);
        sb.append(", margin=");
        sb.append(this.f42121c);
        sb.append(", pnl=");
        sb.append(this.f42122d);
        sb.append(", isBuyOrder=");
        sb.append(this.f42123e);
        sb.append(", money=");
        sb.append(this.f42124f);
        sb.append(", closeX=");
        sb.append(this.f42125g);
        sb.append(", closeY=");
        return AbstractC0000a.m16m(sb, this.f42126h, ')');
    }
}
