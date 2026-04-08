package com.google.accompanist.insets.p026ui;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.google.accompanist.insets.ui.ComposableSingletons$TopAppBarKt$lambda-2$1, reason: invalid class name */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, m18302d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/RowScope;", "invoke", "(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)V"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class ComposableSingletons$TopAppBarKt$lambda2$1 extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$TopAppBarKt$lambda2$1 INSTANCE = new ComposableSingletons$TopAppBarKt$lambda2$1();

    public ComposableSingletons$TopAppBarKt$lambda2$1() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f51459a;
    }

    @Composable
    public final void invoke(@NotNull RowScope rowScope, @Nullable Composer composer, int i) {
        Intrinsics.m18599g(rowScope, "$this$null");
        if ((i & 81) == 16 && composer.mo4242t()) {
            composer.mo4246x();
        }
    }
}
