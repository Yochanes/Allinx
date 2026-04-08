package com.google.accompanist.insets.p026ui;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class BottomNavigationKt$BottomNavigationSurface$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function2<Composer, Integer, Unit> $content;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BottomNavigationKt$BottomNavigationSurface$1(Function2<? super Composer, ? super Integer, Unit> function2, int i) {
        super(2);
        this.$content = function2;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.f51459a;
    }

    @ComposableTarget
    @Composable
    public final void invoke(@Nullable Composer composer, int i) {
        if ((i & 11) == 2 && composer.mo4242t()) {
            composer.mo4246x();
        } else {
            this.$content.invoke(composer, Integer.valueOf((this.$$dirty >> 12) & 14));
        }
    }
}
