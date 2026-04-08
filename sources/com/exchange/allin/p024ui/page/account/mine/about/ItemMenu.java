package com.exchange.allin.p024ui.page.account.mine.about;

import androidx.compose.animation.AbstractC0455a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/page/account/mine/about/ItemMenu;", "", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
final /* data */ class ItemMenu {

    /* JADX INFO: renamed from: a */
    public final String f37408a;

    /* JADX INFO: renamed from: b */
    public final String f37409b;

    /* JADX INFO: renamed from: c */
    public final boolean f37410c;

    /* JADX INFO: renamed from: d */
    public final Function0 f37411d;

    public ItemMenu(String str, String content, boolean z2, Function0 block) {
        Intrinsics.m18599g(content, "content");
        Intrinsics.m18599g(block, "block");
        this.f37408a = str;
        this.f37409b = content;
        this.f37410c = z2;
        this.f37411d = block;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemMenu)) {
            return false;
        }
        ItemMenu itemMenu = (ItemMenu) obj;
        return Intrinsics.m18594b(this.f37408a, itemMenu.f37408a) && Intrinsics.m18594b(this.f37409b, itemMenu.f37409b) && this.f37410c == itemMenu.f37410c && Intrinsics.m18594b(this.f37411d, itemMenu.f37411d);
    }

    public final int hashCode() {
        return this.f37411d.hashCode() + AbstractC0455a.m2230e(AbstractC0000a.m5b(this.f37408a.hashCode() * 31, 31, this.f37409b), 31, this.f37410c);
    }

    public final String toString() {
        return "ItemMenu(title=" + this.f37408a + ", content=" + this.f37409b + ", isShowPoint=" + this.f37410c + ", block=" + this.f37411d + ')';
    }
}
