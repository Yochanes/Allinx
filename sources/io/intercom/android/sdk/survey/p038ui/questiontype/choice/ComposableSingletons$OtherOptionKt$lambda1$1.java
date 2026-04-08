package io.intercom.android.sdk.survey.p038ui.questiontype.choice;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import com.exchange.allin.p024ui.page.account.register.AbstractC2929c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.questiontype.choice.ComposableSingletons$OtherOptionKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class ComposableSingletons$OtherOptionKt$lambda1$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$OtherOptionKt$lambda1$1 INSTANCE = new ComposableSingletons$OtherOptionKt$lambda1$1();

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Unit m16457a(String str) {
        return invoke$lambda$1(str);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Unit m16458b() {
        return invoke$lambda$0();
    }

    private static final Unit invoke$lambda$0() {
        return Unit.f51459a;
    }

    private static final Unit invoke$lambda$1(String it) {
        Intrinsics.m18599g(it, "it");
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
            OtherOptionKt.m22470OtherOptionYCJL08c(true, AbstractC2929c.m13700e(null, null, 3, null), "none", new C5724b(), new C5725c(0), 0L, 0.0f, 0L, null, 0L, composer, 28038, 992);
        }
    }
}
