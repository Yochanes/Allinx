package com.exchange.allin.p024ui.page.futures.history;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.graphics.RectangleShapeKt;
import androidx.compose.runtime.Composer;
import com.exchange.allin.data.FuturesOrder;
import com.exchange.allin.p024ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.futures.history.ComposableSingletons$FuturesHistoryPageKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
@SourceDebugExtension
public final class ComposableSingletons$FuturesHistoryPageKt$lambda1$1 implements Function4<LazyItemScope, FuturesOrder, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: a */
    public static final ComposableSingletons$FuturesHistoryPageKt$lambda1$1 f39293a = new ComposableSingletons$FuturesHistoryPageKt$lambda1$1();

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        LazyItemScope items = (LazyItemScope) obj;
        FuturesOrder it = (FuturesOrder) obj2;
        Composer composer = (Composer) obj3;
        int iIntValue = ((Number) obj4).intValue();
        Intrinsics.m18599g(items, "$this$items");
        Intrinsics.m18599g(it, "it");
        if ((iIntValue & 48) == 0) {
            iIntValue |= composer.mo4220M(it) ? 32 : 16;
        }
        if ((iIntValue & 145) == 144 && composer.mo4242t()) {
            composer.mo4246x();
        } else {
            FuturesHistoryPageKt.m13893b(it, composer, (iIntValue >> 3) & 14);
            SpacerKt.m2836a(composer, BackgroundKt.m2430b(PaddingKt.m2797h(SizeKt.m2818f(SizeKt.m2816d(Modifier.Companion.f17180a, 1.0f), 1), 16, 0.0f, 2), AppTheme.m14099a(composer).m14082h(), RectangleShapeKt.f17631a));
        }
        return Unit.f51459a;
    }
}
