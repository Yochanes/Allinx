package com.exchange.allin.p024ui.page.account.mine.info;

import androidx.compose.animation.AbstractC0455a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/mine/info/ItemMenu;", "", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
final /* data */ class ItemMenu {

    /* JADX INFO: renamed from: a */
    public final String f37488a;

    /* JADX INFO: renamed from: b */
    public final String f37489b;

    /* JADX INFO: renamed from: c */
    public final String f37490c;

    /* JADX INFO: renamed from: d */
    public final boolean f37491d;

    /* JADX INFO: renamed from: e */
    public final boolean f37492e;

    /* JADX INFO: renamed from: f */
    public final Function0 f37493f;

    public ItemMenu(String str, String str2, Function0 block, int i) {
        String str3 = (i & 4) != 0 ? null : "";
        boolean z2 = (i & 8) == 0;
        boolean z3 = (i & 16) != 0;
        Intrinsics.m18599g(block, "block");
        this.f37488a = str;
        this.f37489b = str2;
        this.f37490c = str3;
        this.f37491d = z2;
        this.f37492e = z3;
        this.f37493f = block;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemMenu)) {
            return false;
        }
        ItemMenu itemMenu = (ItemMenu) obj;
        return Intrinsics.m18594b(this.f37488a, itemMenu.f37488a) && Intrinsics.m18594b(this.f37489b, itemMenu.f37489b) && Intrinsics.m18594b(this.f37490c, itemMenu.f37490c) && this.f37491d == itemMenu.f37491d && this.f37492e == itemMenu.f37492e && Intrinsics.m18594b(this.f37493f, itemMenu.f37493f);
    }

    public final int hashCode() {
        int iM5b = AbstractC0000a.m5b(this.f37488a.hashCode() * 31, 31, this.f37489b);
        String str = this.f37490c;
        return this.f37493f.hashCode() + AbstractC0455a.m2230e(AbstractC0455a.m2230e((iM5b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f37491d), 31, this.f37492e);
    }

    public final String toString() {
        return "ItemMenu(title=" + this.f37488a + ", content=" + this.f37489b + ", avatar=" + this.f37490c + ", isCopy=" + this.f37491d + ", isShowArrow=" + this.f37492e + ", block=" + this.f37493f + ')';
    }
}
