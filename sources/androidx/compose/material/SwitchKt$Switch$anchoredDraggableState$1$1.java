package androidx.compose.material;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "Landroidx/compose/material/DraggableAnchorsConfig;", "", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class SwitchKt$Switch$anchoredDraggableState$1$1 extends Lambda implements Function1<DraggableAnchorsConfig<Boolean>, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ float f11421a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchKt$Switch$anchoredDraggableState$1$1(float f) {
        super(1);
        this.f11421a = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DraggableAnchorsConfig draggableAnchorsConfig = (DraggableAnchorsConfig) obj;
        draggableAnchorsConfig.m3741a(Boolean.FALSE, 0.0f);
        draggableAnchorsConfig.m3741a(Boolean.TRUE, this.f11421a);
        return Unit.f51459a;
    }
}
