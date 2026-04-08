package com.exchange.allin.p024ui.widgets;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.exchange.allin.ui.widgets.ComposableSingletons$TabPageKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class ComposableSingletons$TabPageKt$lambda1$1 implements Function3<BoxScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: a */
    public static final ComposableSingletons$TabPageKt$lambda1$1 f41111a = new ComposableSingletons$TabPageKt$lambda1$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.m18599g((BoxScope) obj, "<this>");
        if ((iIntValue & 17) == 16 && composer.mo4242t()) {
            composer.mo4246x();
        }
        return Unit.f51459a;
    }
}
