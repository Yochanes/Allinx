package com.exchange.allin.p024ui.page.assets;

import androidx.compose.animation.AbstractC0455a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/assets/AccountAsset;", "", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
final /* data */ class AccountAsset {

    /* JADX INFO: renamed from: a */
    public final int f38076a;

    /* JADX INFO: renamed from: b */
    public final String f38077b;

    /* JADX INFO: renamed from: c */
    public final String f38078c;

    /* JADX INFO: renamed from: d */
    public final String f38079d;

    public AccountAsset(String str, int i, String balance, String str2) {
        Intrinsics.m18599g(balance, "balance");
        this.f38076a = i;
        this.f38077b = str;
        this.f38078c = balance;
        this.f38079d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountAsset)) {
            return false;
        }
        AccountAsset accountAsset = (AccountAsset) obj;
        return this.f38076a == accountAsset.f38076a && Intrinsics.m18594b(this.f38077b, accountAsset.f38077b) && Intrinsics.m18594b(this.f38078c, accountAsset.f38078c) && Intrinsics.m18594b(this.f38079d, accountAsset.f38079d);
    }

    public final int hashCode() {
        return this.f38079d.hashCode() + AbstractC0000a.m5b(AbstractC0000a.m5b(Integer.hashCode(this.f38076a) * 31, 31, this.f38077b), 31, this.f38078c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountAsset(res=");
        sb.append(this.f38076a);
        sb.append(", account=");
        sb.append(this.f38077b);
        sb.append(", balance=");
        sb.append(this.f38078c);
        sb.append(", navArgument=");
        return AbstractC0455a.m2241p(sb, this.f38079d, ')');
    }
}
