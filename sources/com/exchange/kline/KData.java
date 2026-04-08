package com.exchange.kline;

import androidx.compose.animation.AbstractC0455a;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/kline/KData;", "", "kline_release"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class KData {

    /* JADX INFO: renamed from: A */
    public double f41805A;

    /* JADX INFO: renamed from: B */
    public double f41806B;

    /* JADX INFO: renamed from: C */
    public double f41807C;

    /* JADX INFO: renamed from: D */
    public double f41808D;

    /* JADX INFO: renamed from: E */
    public double f41809E;

    /* JADX INFO: renamed from: F */
    public double f41810F;

    /* JADX INFO: renamed from: G */
    public boolean f41811G;

    /* JADX INFO: renamed from: a */
    public final long f41812a;

    /* JADX INFO: renamed from: b */
    public final double f41813b;

    /* JADX INFO: renamed from: c */
    public final double f41814c;

    /* JADX INFO: renamed from: d */
    public final double f41815d;

    /* JADX INFO: renamed from: e */
    public final double f41816e;

    /* JADX INFO: renamed from: f */
    public final double f41817f;

    /* JADX INFO: renamed from: g */
    public final double f41818g;

    /* JADX INFO: renamed from: h */
    public double f41819h;

    /* JADX INFO: renamed from: i */
    public double f41820i;

    /* JADX INFO: renamed from: j */
    public double f41821j;

    /* JADX INFO: renamed from: k */
    public double f41822k;

    /* JADX INFO: renamed from: l */
    public double f41823l;

    /* JADX INFO: renamed from: m */
    public double f41824m;

    /* JADX INFO: renamed from: n */
    public double f41825n;

    /* JADX INFO: renamed from: o */
    public double f41826o;

    /* JADX INFO: renamed from: p */
    public double f41827p;

    /* JADX INFO: renamed from: q */
    public double f41828q;

    /* JADX INFO: renamed from: r */
    public double f41829r;

    /* JADX INFO: renamed from: s */
    public double f41830s;

    /* JADX INFO: renamed from: t */
    public double f41831t;

    /* JADX INFO: renamed from: u */
    public double f41832u;

    /* JADX INFO: renamed from: v */
    public double f41833v;

    /* JADX INFO: renamed from: w */
    public double f41834w;

    /* JADX INFO: renamed from: x */
    public double f41835x;

    /* JADX INFO: renamed from: y */
    public double f41836y;

    /* JADX INFO: renamed from: z */
    public double f41837z;

    public KData(long j, double d, double d2, double d3, double d4, double d5, double d6) {
        this.f41812a = j;
        this.f41813b = d;
        this.f41814c = d2;
        this.f41815d = d3;
        this.f41816e = d4;
        this.f41817f = d5;
        this.f41818g = d6;
    }

    /* JADX INFO: renamed from: a */
    public final double m14255a() {
        return this.f41814c - this.f41813b;
    }

    /* JADX INFO: renamed from: b */
    public final double m14256b() {
        double d = this.f41814c;
        double d2 = this.f41813b;
        return (d - d2) / d2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KData{time=");
        sb.append(this.f41812a);
        sb.append(", openPrice=");
        sb.append(this.f41813b);
        sb.append(", closePrice=");
        sb.append(this.f41814c);
        sb.append(", maxPrice=");
        sb.append(this.f41815d);
        sb.append(", minPrice=");
        sb.append(this.f41816e);
        sb.append(", volume=");
        sb.append(this.f41817f);
        sb.append(", upDnAmount=0.0, upDnRate=0.0, priceMa5=");
        sb.append(this.f41819h);
        sb.append(", priceMa10=");
        sb.append(this.f41820i);
        sb.append(", priceMa30=");
        sb.append(this.f41821j);
        sb.append(", ema5=");
        sb.append(this.f41822k);
        sb.append(", ema10=");
        sb.append(this.f41823l);
        sb.append(", ema30=");
        sb.append(this.f41824m);
        sb.append(", ema=0.0, volumeMa5=");
        sb.append(this.f41825n);
        sb.append(", volumeMa10=");
        sb.append(this.f41826o);
        sb.append(", bollMb=");
        sb.append(this.f41827p);
        sb.append(", bollUp=");
        sb.append(this.f41828q);
        sb.append(", bollDn=");
        sb.append(this.f41829r);
        sb.append(", macd=");
        sb.append(this.f41830s);
        sb.append(", dea=");
        sb.append(this.f41831t);
        sb.append(", dif=");
        sb.append(this.f41832u);
        sb.append(", k=");
        sb.append(this.f41833v);
        sb.append(", d=");
        sb.append(this.f41834w);
        sb.append(", j=");
        sb.append(this.f41835x);
        sb.append(", rs1=");
        sb.append(this.f41836y);
        sb.append(", rs2=");
        sb.append(this.f41837z);
        sb.append(", rs3=");
        sb.append(this.f41805A);
        sb.append(", leftX=");
        sb.append(this.f41806B);
        sb.append(", rightX=");
        sb.append(this.f41807C);
        sb.append(", closeY=");
        sb.append(this.f41809E);
        sb.append(", openY=");
        sb.append(this.f41810F);
        sb.append(", initFinish=");
        return AbstractC0455a.m2243r(sb, this.f41811G, '}');
    }
}
