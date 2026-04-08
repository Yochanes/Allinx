package com.google.accompanist.placeholder;

import androidx.compose.p013ui.graphics.Shape;
import androidx.compose.p013ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.google.accompanist.placeholder.PlaceholderKt$placeholder-cf5BqRc$$inlined$debugInspectorInfo$1, reason: invalid class name */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, m18302d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class PlaceholderKt$placeholdercf5BqRc$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {
    final /* synthetic */ long $color$inlined;
    final /* synthetic */ PlaceholderHighlight $highlight$inlined;
    final /* synthetic */ Shape $shape$inlined;
    final /* synthetic */ boolean $visible$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaceholderKt$placeholdercf5BqRc$$inlined$debugInspectorInfo$1(boolean z2, long j, PlaceholderHighlight placeholderHighlight, Shape shape) {
        super(1);
        this.$visible$inlined = z2;
        this.$color$inlined = j;
        this.$highlight$inlined = placeholderHighlight;
        this.$shape$inlined = shape;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return Unit.f51459a;
    }

    public final void invoke(@NotNull InspectorInfo inspectorInfo) {
        inspectorInfo.getClass();
        throw null;
    }
}
