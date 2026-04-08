package com.king.ultraswiperefresh.theme;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.king.ultraswiperefresh.theme.ComposableSingletons$UltraSwipeRefreshThemeKt$lambda-3$1, reason: invalid class name */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, m18302d2 = {"<anonymous>", "", "it", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "invoke", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class ComposableSingletons$UltraSwipeRefreshThemeKt$lambda3$1 extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: a */
    public static final ComposableSingletons$UltraSwipeRefreshThemeKt$lambda3$1 f43275a = new ComposableSingletons$UltraSwipeRefreshThemeKt$lambda3$1(3);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Function2 it = (Function2) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.m18599g(it, "it");
        if ((iIntValue & 14) == 0) {
            iIntValue |= composer.mo4235m(it) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && composer.mo4242t()) {
            composer.mo4246x();
        } else {
            UltraSwipeRefreshThemeKt.m15395a(it, composer, iIntValue & 14);
        }
        return Unit.f51459a;
    }
}
