package com.exchange.allin;

import androidx.compose.runtime.Composer;
import com.exchange.allin.p024ui.common.AppNavGraphKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.exchange.allin.ComposableSingletons$MainActivityKt$lambda-2$1, reason: invalid class name */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class ComposableSingletons$MainActivityKt$lambda2$1 implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: a */
    public static final ComposableSingletons$MainActivityKt$lambda2$1 f35187a = new ComposableSingletons$MainActivityKt$lambda2$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.mo4242t()) {
            composer.mo4246x();
        } else {
            AppNavGraphKt.m13538a(composer, 0);
        }
        return Unit.f51459a;
    }
}
