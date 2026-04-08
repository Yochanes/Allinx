package androidx.compose.material;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "Landroidx/compose/material/DraggableAnchorsConfig;", "Landroidx/compose/material/BottomDrawerValue;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class DrawerKt$BottomDrawer$1$1$2$1$newAnchors$1 extends Lambda implements Function1<DraggableAnchorsConfig<BottomDrawerValue>, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ float f10498a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f10499b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f10500c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawerKt$BottomDrawer$1$1$2$1$newAnchors$1(float f, float f2, boolean z2) {
        super(1);
        this.f10498a = f;
        this.f10499b = f2;
        this.f10500c = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DraggableAnchorsConfig draggableAnchorsConfig = (DraggableAnchorsConfig) obj;
        BottomDrawerValue bottomDrawerValue = BottomDrawerValue.f10239a;
        float f = this.f10498a;
        draggableAnchorsConfig.m3741a(bottomDrawerValue, f);
        float f2 = 0.5f * f;
        float f3 = this.f10499b;
        if (f3 > f2 || this.f10500c) {
            draggableAnchorsConfig.m3741a(BottomDrawerValue.f10240b, f2);
        }
        if (f3 > 0.0f) {
            draggableAnchorsConfig.m3741a(BottomDrawerValue.f10241c, Math.max(0.0f, f - f3));
        }
        return Unit.f51459a;
    }
}
