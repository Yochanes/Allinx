package androidx.compose.material3;

import androidx.compose.material3.internal.DraggableAnchorsConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "Landroidx/compose/material3/internal/DraggableAnchorsConfig;", "Landroidx/compose/material3/SheetValue;", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class BottomSheetScaffoldKt$StandardBottomSheet$1$1$newAnchors$1 extends Lambda implements Function1<DraggableAnchorsConfig<SheetValue>, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SheetState f12268a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f12269b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f12270c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ float f12271d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$StandardBottomSheet$1$1$newAnchors$1(SheetState sheetState, float f, float f2, float f3) {
        super(1);
        this.f12268a = sheetState;
        this.f12269b = f;
        this.f12270c = f2;
        this.f12271d = f3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DraggableAnchorsConfig draggableAnchorsConfig = (DraggableAnchorsConfig) obj;
        SheetState sheetState = this.f12268a;
        boolean z2 = sheetState.f14404a;
        float f = this.f12270c;
        float f2 = this.f12269b;
        if (!z2) {
            draggableAnchorsConfig.m4167a(SheetValue.f14416c, f2 - f);
        }
        float f3 = this.f12271d;
        if (f3 != f) {
            draggableAnchorsConfig.m4167a(SheetValue.f14415b, Math.max(f2 - f3, 0.0f));
        }
        if (!sheetState.f14405b) {
            draggableAnchorsConfig.m4167a(SheetValue.f14414a, f2);
        }
        return Unit.f51459a;
    }
}
