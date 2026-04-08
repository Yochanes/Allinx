package com.exchange.allin.p024ui.page.account.mine;

import androidx.compose.animation.AbstractC0455a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/mine/ItemMenu;", "", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
final /* data */ class ItemMenu {

    /* JADX INFO: renamed from: a */
    public final int f37401a;

    /* JADX INFO: renamed from: b */
    public final String f37402b;

    /* JADX INFO: renamed from: c */
    public final boolean f37403c;

    /* JADX INFO: renamed from: d */
    public final Function0 f37404d;

    public ItemMenu(int i, String str, boolean z2, Function0 block) {
        Intrinsics.m18599g(block, "block");
        this.f37401a = i;
        this.f37402b = str;
        this.f37403c = z2;
        this.f37404d = block;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemMenu)) {
            return false;
        }
        ItemMenu itemMenu = (ItemMenu) obj;
        return this.f37401a == itemMenu.f37401a && this.f37402b.equals(itemMenu.f37402b) && this.f37403c == itemMenu.f37403c && Intrinsics.m18594b(this.f37404d, itemMenu.f37404d);
    }

    public final int hashCode() {
        return this.f37404d.hashCode() + AbstractC0455a.m2230e(AbstractC0000a.m5b(Integer.hashCode(this.f37401a) * 31, 31, this.f37402b), 31, this.f37403c);
    }

    public final String toString() {
        return "ItemMenu(res=" + this.f37401a + ", title=" + this.f37402b + ", isRequiredLogin=" + this.f37403c + ", block=" + this.f37404d + ')';
    }
}
