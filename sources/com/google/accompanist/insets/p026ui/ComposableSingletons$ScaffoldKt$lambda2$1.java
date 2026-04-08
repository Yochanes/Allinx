package com.google.accompanist.insets.p026ui;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.google.accompanist.insets.ui.ComposableSingletons$ScaffoldKt$lambda-2$1, reason: invalid class name */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m18302d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class ComposableSingletons$ScaffoldKt$lambda2$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ScaffoldKt$lambda2$1 INSTANCE = new ComposableSingletons$ScaffoldKt$lambda2$1();

    public ComposableSingletons$ScaffoldKt$lambda2$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Unit.f51459a;
    }

    @Composable
    public final void invoke(@Nullable Composer composer, int i) {
        if ((i & 11) == 2 && composer.mo4242t()) {
            composer.mo4246x();
        }
    }
}
