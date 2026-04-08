package androidx.compose.material3;

import androidx.compose.material3.internal.DraggableAnchorsConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "Landroidx/compose/material3/internal/DraggableAnchorsConfig;", "Landroidx/compose/material3/SheetValue;", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class ModalBottomSheetKt$ModalBottomSheetContent$3$1$newAnchors$1 extends Lambda implements Function1<DraggableAnchorsConfig<SheetValue>, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ float f13714a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f13715b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ SheetState f13716c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetKt$ModalBottomSheetContent$3$1$newAnchors$1(float f, long j, SheetState sheetState) {
        super(1);
        this.f13714a = f;
        this.f13715b = j;
        this.f13716c = sheetState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DraggableAnchorsConfig draggableAnchorsConfig = (DraggableAnchorsConfig) obj;
        SheetValue sheetValue = SheetValue.f14414a;
        float f = this.f13714a;
        draggableAnchorsConfig.m4167a(sheetValue, f);
        int i = (int) (this.f13715b & 4294967295L);
        float f2 = i;
        if (f2 > f / 2 && !this.f13716c.f14404a) {
            draggableAnchorsConfig.m4167a(SheetValue.f14416c, f / 2.0f);
        }
        if (i != 0) {
            draggableAnchorsConfig.m4167a(SheetValue.f14415b, Math.max(0.0f, f - f2));
        }
        return Unit.f51459a;
    }
}
