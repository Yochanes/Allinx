package com.exchange.allin.p024ui.page.guess.leisure;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/guess/leisure/Leisure;", "", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final /* data */ class Leisure {

    /* JADX INFO: renamed from: a */
    public final String f39729a;

    /* JADX INFO: renamed from: b */
    public final String f39730b;

    /* JADX INFO: renamed from: c */
    public final String f39731c;

    /* JADX INFO: renamed from: d */
    public final int f39732d;

    /* JADX INFO: renamed from: e */
    public final List f39733e;

    public Leisure(String str, String str2, String str3, int i, List list) {
        this.f39729a = str;
        this.f39730b = str2;
        this.f39731c = str3;
        this.f39732d = i;
        this.f39733e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Leisure)) {
            return false;
        }
        Leisure leisure = (Leisure) obj;
        return this.f39729a.equals(leisure.f39729a) && this.f39730b.equals(leisure.f39730b) && this.f39731c.equals(leisure.f39731c) && this.f39732d == leisure.f39732d && this.f39733e.equals(leisure.f39733e);
    }

    public final int hashCode() {
        return this.f39733e.hashCode() + AbstractC0455a.m2228c(this.f39732d, AbstractC0000a.m5b(AbstractC0000a.m5b(this.f39729a.hashCode() * 31, 31, this.f39730b), 31, this.f39731c), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Leisure(title=");
        sb.append(this.f39729a);
        sb.append(", content=");
        sb.append(this.f39730b);
        sb.append(", describe=");
        sb.append(this.f39731c);
        sb.append(", cover=");
        sb.append(this.f39732d);
        sb.append(", labelList=");
        return AbstractC0455a.m2242q(sb, this.f39733e, ')');
    }
}
