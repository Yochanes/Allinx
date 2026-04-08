package com.exchange.allin;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.exchange.allin.ComposableSingletons$MainActivityKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class ComposableSingletons$MainActivityKt$lambda1$1 implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: a */
    public static final ComposableSingletons$MainActivityKt$lambda1$1 f35186a = new ComposableSingletons$MainActivityKt$lambda1$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Function2 it = (Function2) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.m18599g(it, "it");
        if ((iIntValue & 6) == 0) {
            iIntValue |= composer.mo4235m(it) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && composer.mo4242t()) {
            composer.mo4246x();
        } else {
            MainActivityKt.m13198a(it, composer, iIntValue & 14);
        }
        return Unit.f51459a;
    }
}
