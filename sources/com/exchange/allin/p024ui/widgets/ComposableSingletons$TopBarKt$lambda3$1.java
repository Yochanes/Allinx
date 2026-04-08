package com.exchange.allin.p024ui.widgets;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.exchange.allin.ui.widgets.ComposableSingletons$TopBarKt$lambda-3$1, reason: invalid class name */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class ComposableSingletons$TopBarKt$lambda3$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.mo4242t()) {
            composer.mo4246x();
        }
        return Unit.f51459a;
    }
}
