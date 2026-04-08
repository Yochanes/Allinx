package com.exchange.allin.p024ui.widgets;

import androidx.compose.runtime.Composer;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.exchange.allin.R;
import com.king.ultraswiperefresh.UltraSwipeRefreshState;
import com.king.ultraswiperefresh.indicator.lottie.LottieRefreshHeaderKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.exchange.allin.ui.widgets.ComposableSingletons$SwipeRefreshKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class ComposableSingletons$SwipeRefreshKt$lambda1$1 implements Function3<UltraSwipeRefreshState, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: a */
    public static final ComposableSingletons$SwipeRefreshKt$lambda1$1 f41106a = new ComposableSingletons$SwipeRefreshKt$lambda1$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        UltraSwipeRefreshState it = (UltraSwipeRefreshState) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.m18599g(it, "it");
        if ((iIntValue & 6) == 0) {
            iIntValue |= composer.mo4220M(it) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && composer.mo4242t()) {
            composer.mo4246x();
        } else {
            LottieRefreshHeaderKt.m15392a(it, null, new LottieCompositionSpec.RawRes(R.raw.loader), 0.0f, null, 0.0f, null, composer, iIntValue & 14);
        }
        return Unit.f51459a;
    }
}
