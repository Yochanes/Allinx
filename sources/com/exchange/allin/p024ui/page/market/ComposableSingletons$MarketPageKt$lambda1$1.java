package com.exchange.allin.p024ui.page.market;

import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.market.ComposableSingletons$MarketPageKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class ComposableSingletons$MarketPageKt$lambda1$1 implements Function4<PagerScope, Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: a */
    public static final ComposableSingletons$MarketPageKt$lambda1$1 f39928a = new ComposableSingletons$MarketPageKt$lambda1$1();

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        PagerScope TabPager = (PagerScope) obj;
        int iIntValue = ((Number) obj2).intValue();
        Composer composer = (Composer) obj3;
        ((Number) obj4).intValue();
        Intrinsics.m18599g(TabPager, "$this$TabPager");
        if (iIntValue == 0) {
            composer.mo4221N(42237738);
            MarketPageKt.m13943c(null, null, composer, 0);
            composer.mo4213F();
        } else if (iIntValue == 1) {
            composer.mo4221N(42238890);
            MarketPageKt.m13944d(null, null, composer, 0);
            composer.mo4213F();
        } else if (iIntValue != 2) {
            composer.mo4221N(1309467654);
            composer.mo4213F();
        } else {
            composer.mo4221N(42240041);
            MarketPageKt.m13945e(null, null, composer, 0);
            composer.mo4213F();
        }
        return Unit.f51459a;
    }
}
