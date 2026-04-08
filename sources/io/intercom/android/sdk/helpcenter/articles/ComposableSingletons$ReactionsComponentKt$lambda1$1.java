package io.intercom.android.sdk.helpcenter.articles;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: io.intercom.android.sdk.helpcenter.articles.ComposableSingletons$ReactionsComponentKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class ComposableSingletons$ReactionsComponentKt$lambda1$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ReactionsComponentKt$lambda1$1 INSTANCE = new ComposableSingletons$ReactionsComponentKt$lambda1$1();

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Unit m15482a() {
        return invoke$lambda$2();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Unit m15483b() {
        return invoke$lambda$1();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Unit m15484c() {
        return invoke$lambda$0();
    }

    private static final Unit invoke$lambda$0() {
        return Unit.f51459a;
    }

    private static final Unit invoke$lambda$1() {
        return Unit.f51459a;
    }

    private static final Unit invoke$lambda$2() {
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
            ReactionsComponentKt.ReactionsComponent(null, ArticleViewState.ReactionState.INSTANCE.getDefaultReactionState(), new C5217a(0), new C5217a(1), new C5217a(2), composer, 28080, 1);
        }
    }
}
