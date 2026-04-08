package com.exchange.allin.p024ui.page.guess.list;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import com.exchange.allin.data.GuessTopic;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.exchange.allin.ui.page.guess.list.ComposableSingletons$GuessListPageKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class ComposableSingletons$GuessListPageKt$lambda1$1 implements Function4<LazyItemScope, GuessTopic, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: a */
    public static final ComposableSingletons$GuessListPageKt$lambda1$1 f39759a = new ComposableSingletons$GuessListPageKt$lambda1$1();

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        LazyItemScope items = (LazyItemScope) obj;
        GuessTopic it = (GuessTopic) obj2;
        Composer composer = (Composer) obj3;
        int iIntValue = ((Number) obj4).intValue();
        Intrinsics.m18599g(items, "$this$items");
        Intrinsics.m18599g(it, "it");
        if ((iIntValue & 48) == 0) {
            iIntValue |= (iIntValue & 64) == 0 ? composer.mo4220M(it) : composer.mo4235m(it) ? 32 : 16;
        }
        if ((iIntValue & 145) == 144 && composer.mo4242t()) {
            composer.mo4246x();
        } else {
            GuessListPageKt.m13922b(it, null, null, composer, GuessTopic.$stable | ((iIntValue >> 3) & 14));
        }
        return Unit.f51459a;
    }
}
