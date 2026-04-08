package io.intercom.android.sdk.p032m5.helpcenter.p034ui;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import io.intercom.android.sdk.p032m5.components.ErrorState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: io.intercom.android.sdk.m5.helpcenter.ui.ComposableSingletons$HelpCenterErrorScreenKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class ComposableSingletons$HelpCenterErrorScreenKt$lambda1$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$HelpCenterErrorScreenKt$lambda1$1 INSTANCE = new ComposableSingletons$HelpCenterErrorScreenKt$lambda1$1();

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Unit m16036a() {
        return invoke$lambda$0();
    }

    private static final Unit invoke$lambda$0() {
        return Unit.f51459a;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.f51459a;
    }

    @ComposableTarget
    @Composable
    public final void invoke(Composer composer, int i) {
        if ((i & 11) == 2 && composer.mo4242t()) {
            composer.mo4246x();
        } else {
            HelpCenterErrorScreenKt.HelpCenterErrorScreen(new ErrorState.WithCTA(0, 0, null, 0, new C5507a(), 15, null), null, composer, 0, 2);
        }
    }
}
