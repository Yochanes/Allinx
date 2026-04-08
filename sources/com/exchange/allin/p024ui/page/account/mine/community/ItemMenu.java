package com.exchange.allin.p024ui.page.account.mine.community;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/mine/community/ItemMenu;", "", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
final /* data */ class ItemMenu {

    /* JADX INFO: renamed from: a */
    public final int f37479a;

    /* JADX INFO: renamed from: b */
    public final String f37480b;

    /* JADX INFO: renamed from: c */
    public final String f37481c;

    /* JADX INFO: renamed from: d */
    public final Function1 f37482d;

    public ItemMenu(int i, String str, String str2, Function1 function1) {
        this.f37479a = i;
        this.f37480b = str;
        this.f37481c = str2;
        this.f37482d = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemMenu)) {
            return false;
        }
        ItemMenu itemMenu = (ItemMenu) obj;
        return this.f37479a == itemMenu.f37479a && this.f37480b.equals(itemMenu.f37480b) && this.f37481c.equals(itemMenu.f37481c) && this.f37482d.equals(itemMenu.f37482d);
    }

    public final int hashCode() {
        return this.f37482d.hashCode() + AbstractC0000a.m5b(AbstractC0000a.m5b(Integer.hashCode(this.f37479a) * 31, 31, this.f37480b), 31, this.f37481c);
    }

    public final String toString() {
        return "ItemMenu(res=" + this.f37479a + ", title=" + this.f37480b + ", content=" + this.f37481c + ", block=" + this.f37482d + ')';
    }
}
