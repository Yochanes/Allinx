package com.google.accompanist.insets;

import androidx.compose.p013ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m18302d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class InsetsSizeModifier$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    final /* synthetic */ Placeable $placeable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsetsSizeModifier$measure$1(Placeable placeable) {
        super(1);
        this.$placeable = placeable;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable.PlacementScope) obj);
        return Unit.f51459a;
    }

    public final void invoke(@NotNull Placeable.PlacementScope layout) {
        Intrinsics.m18599g(layout, "$this$layout");
        layout.m5683e(this.$placeable, 0, 0, 0.0f);
    }
}
