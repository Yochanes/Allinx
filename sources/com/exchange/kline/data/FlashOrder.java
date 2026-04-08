package com.exchange.kline.data;

import androidx.compose.animation.AbstractC0455a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/kline/data/FlashOrder;", "", "kline_release"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final /* data */ class FlashOrder {

    /* JADX INFO: renamed from: a */
    public final double f42115a;

    /* JADX INFO: renamed from: b */
    public final String f42116b;

    /* JADX INFO: renamed from: c */
    public String f42117c;

    /* JADX INFO: renamed from: d */
    public final boolean f42118d;

    public FlashOrder(double d, String amount, String time, boolean z2) {
        Intrinsics.m18599g(amount, "amount");
        Intrinsics.m18599g(time, "time");
        this.f42115a = d;
        this.f42116b = amount;
        this.f42117c = time;
        this.f42118d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlashOrder)) {
            return false;
        }
        FlashOrder flashOrder = (FlashOrder) obj;
        return Double.compare(this.f42115a, flashOrder.f42115a) == 0 && Intrinsics.m18594b(this.f42116b, flashOrder.f42116b) && Intrinsics.m18594b(this.f42117c, flashOrder.f42117c) && this.f42118d == flashOrder.f42118d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f42118d) + AbstractC0000a.m5b(AbstractC0000a.m5b(Double.hashCode(this.f42115a) * 31, 31, this.f42116b), 31, this.f42117c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlashOrder(price=");
        sb.append(this.f42115a);
        sb.append(", amount=");
        sb.append(this.f42116b);
        sb.append(", time=");
        sb.append(this.f42117c);
        sb.append(", isBuyOrder=");
        return AbstractC0455a.m2243r(sb, this.f42118d, ')');
    }
}
