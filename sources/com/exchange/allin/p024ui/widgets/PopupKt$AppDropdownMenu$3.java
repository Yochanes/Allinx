package com.exchange.allin.p024ui.widgets;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
@SourceDebugExtension
final class PopupKt$AppDropdownMenu$3 implements Function3<ColumnScope, Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ColumnScope DropdownMenu = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.m18599g(DropdownMenu, "$this$DropdownMenu");
        if ((iIntValue & 17) != 16 || !composer.mo4242t()) {
            throw null;
        }
        composer.mo4246x();
        return Unit.f51459a;
    }
}
