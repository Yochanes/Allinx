package androidx.compose.material;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "Landroidx/compose/material/DraggableAnchorsConfig;", "Landroidx/compose/material/ModalBottomSheetValue;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class ModalBottomSheetKt$modalBottomSheetAnchors$1$newAnchors$1 extends Lambda implements Function1<DraggableAnchorsConfig<ModalBottomSheetValue>, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ float f10750a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f10751b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetKt$modalBottomSheetAnchors$1$newAnchors$1(float f, ModalBottomSheetState modalBottomSheetState, long j) {
        super(1);
        this.f10750a = f;
        this.f10751b = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DraggableAnchorsConfig draggableAnchorsConfig = (DraggableAnchorsConfig) obj;
        ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.f10756a;
        float f = this.f10750a;
        draggableAnchorsConfig.m3741a(modalBottomSheetValue, f);
        float f2 = f / 2.0f;
        long j = this.f10751b;
        if (((int) (j & 4294967295L)) > f2) {
            draggableAnchorsConfig.m3741a(ModalBottomSheetValue.f10758c, f2);
        }
        int i = (int) (j & 4294967295L);
        if (i != 0) {
            draggableAnchorsConfig.m3741a(ModalBottomSheetValue.f10757b, Math.max(0.0f, f - i));
        }
        return Unit.f51459a;
    }
}
