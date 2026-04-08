package com.exchange.allin.config;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/config/Host;", "", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final /* data */ class Host {

    /* JADX INFO: renamed from: a */
    public final String f35274a;

    /* JADX INFO: renamed from: b */
    public final String f35275b;

    /* JADX INFO: renamed from: c */
    public final String f35276c;

    /* JADX INFO: renamed from: d */
    public final String f35277d;

    /* JADX INFO: renamed from: e */
    public final String f35278e;

    /* JADX INFO: renamed from: f */
    public final String f35279f;

    /* JADX INFO: renamed from: g */
    public final String f35280g;

    /* JADX INFO: renamed from: h */
    public final String f35281h;

    /* JADX INFO: renamed from: i */
    public final String f35282i;

    /* JADX INFO: renamed from: j */
    public final String f35283j;

    public Host(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.f35274a = str;
        this.f35275b = str2;
        this.f35276c = str3;
        this.f35277d = str4;
        this.f35278e = str5;
        this.f35279f = str6;
        this.f35280g = str7;
        this.f35281h = str8;
        this.f35282i = str9;
        this.f35283j = str10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Host)) {
            return false;
        }
        Host host = (Host) obj;
        return Intrinsics.m18594b(this.f35274a, host.f35274a) && Intrinsics.m18594b(this.f35275b, host.f35275b) && Intrinsics.m18594b(this.f35276c, host.f35276c) && Intrinsics.m18594b(this.f35277d, host.f35277d) && Intrinsics.m18594b(this.f35278e, host.f35278e) && Intrinsics.m18594b(this.f35279f, host.f35279f) && Intrinsics.m18594b(this.f35280g, host.f35280g) && Intrinsics.m18594b(this.f35281h, host.f35281h) && Intrinsics.m18594b(this.f35282i, host.f35282i) && Intrinsics.m18594b(this.f35283j, host.f35283j);
    }

    public final int hashCode() {
        return this.f35283j.hashCode() + AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0000a.m5b(AbstractC0000a.m5b(this.f35274a.hashCode() * 31, 31, this.f35275b), 31, this.f35276c), 31, this.f35277d), 31, this.f35278e), 31, this.f35279f), 31, this.f35280g), 31, this.f35281h), 31, this.f35282i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Host(user=");
        sb.append(this.f35274a);
        sb.append(", spot=");
        sb.append(this.f35275b);
        sb.append(", spotWs=");
        sb.append(this.f35276c);
        sb.append(", futures=");
        sb.append(this.f35277d);
        sb.append(", futuresWs=");
        sb.append(this.f35278e);
        sb.append(", futures1k=");
        sb.append(this.f35279f);
        sb.append(", futures1kWs=");
        sb.append(this.f35280g);
        sb.append(", flash=");
        sb.append(this.f35281h);
        sb.append(", flashWs=");
        sb.append(this.f35282i);
        sb.append(", guess=");
        return AbstractC0455a.m2241p(sb, this.f35283j, ')');
    }
}
