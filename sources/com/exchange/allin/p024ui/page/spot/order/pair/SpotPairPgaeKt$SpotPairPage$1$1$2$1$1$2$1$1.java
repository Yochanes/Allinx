package com.exchange.allin.p024ui.page.spot.order.pair;

import androidx.navigation.NavHostController;
import com.exchange.allin.utils.ext.NavigationExtKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
final class SpotPairPgaeKt$SpotPairPage$1$1$2$1$1$2$1$1 implements Function0<Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ NavHostController f40870a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f40871b;

    public SpotPairPgaeKt$SpotPairPage$1$1$2$1$1$2$1$1(NavHostController navHostController, String str) {
        this.f40870a = navHostController;
        this.f40871b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        NavigationExtKt.m14210a(this.f40870a, MapsKt.m18485h(new Pair("pair", this.f40871b)));
        return Unit.f51459a;
    }
}
