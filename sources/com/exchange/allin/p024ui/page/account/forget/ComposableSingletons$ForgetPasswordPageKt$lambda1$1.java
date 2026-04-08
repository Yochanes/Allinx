package com.exchange.allin.p024ui.page.account.forget;

import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.account.forget.ComposableSingletons$ForgetPasswordPageKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class ComposableSingletons$ForgetPasswordPageKt$lambda1$1 implements Function4<PagerScope, Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: a */
    public static final ComposableSingletons$ForgetPasswordPageKt$lambda1$1 f37082a = new ComposableSingletons$ForgetPasswordPageKt$lambda1$1();

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        PagerScope TabPager = (PagerScope) obj;
        int iIntValue = ((Number) obj2).intValue();
        Composer composer = (Composer) obj3;
        ((Number) obj4).intValue();
        Intrinsics.m18599g(TabPager, "$this$TabPager");
        if (iIntValue == 0) {
            composer.mo4221N(-818744590);
            ForgetPasswordPageKt.m13643b(null, composer, 0);
            composer.mo4213F();
        } else if (iIntValue != 1) {
            composer.mo4221N(388804196);
            composer.mo4213F();
        } else {
            composer.mo4221N(-818743118);
            ForgetPasswordPageKt.m13644c(null, null, composer, 0);
            composer.mo4213F();
        }
        return Unit.f51459a;
    }
}
