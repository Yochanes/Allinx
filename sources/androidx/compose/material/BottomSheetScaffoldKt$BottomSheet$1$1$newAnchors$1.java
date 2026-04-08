package androidx.compose.material;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "Landroidx/compose/material/DraggableAnchorsConfig;", "Landroidx/compose/material/BottomSheetValue;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class BottomSheetScaffoldKt$BottomSheet$1$1$newAnchors$1 extends Lambda implements Function1<DraggableAnchorsConfig<BottomSheetValue>, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10261a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f10262b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f10263c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$BottomSheet$1$1$newAnchors$1(int i, float f, float f2) {
        super(1);
        this.f10261a = i;
        this.f10262b = f;
        this.f10263c = f2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DraggableAnchorsConfig draggableAnchorsConfig = (DraggableAnchorsConfig) obj;
        BottomSheetValue bottomSheetValue = BottomSheetValue.f10314a;
        float f = this.f10261a;
        float f2 = this.f10262b;
        draggableAnchorsConfig.m3741a(bottomSheetValue, f - f2);
        float f3 = this.f10263c;
        if (f3 > 0.0f && f3 != f2) {
            draggableAnchorsConfig.m3741a(BottomSheetValue.f10315b, f - f3);
        }
        return Unit.f51459a;
    }
}
