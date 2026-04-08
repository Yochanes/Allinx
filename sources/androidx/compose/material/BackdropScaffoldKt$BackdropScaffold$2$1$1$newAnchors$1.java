package androidx.compose.material;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "Landroidx/compose/material/DraggableAnchorsConfig;", "Landroidx/compose/material/BackdropValue;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class BackdropScaffoldKt$BackdropScaffold$2$1$1$newAnchors$1 extends Lambda implements Function1<DraggableAnchorsConfig<BackdropValue>, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ float f10173a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f10174b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f10175c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Ref.FloatRef f10176d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldKt$BackdropScaffold$2$1$1$newAnchors$1(float f, float f2, float f3, Ref.FloatRef floatRef) {
        super(1);
        this.f10173a = f;
        this.f10174b = f2;
        this.f10175c = f3;
        this.f10176d = floatRef;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0010  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        DraggableAnchorsConfig draggableAnchorsConfig = (DraggableAnchorsConfig) obj;
        float f = this.f10173a;
        if (f == 0.0f) {
            draggableAnchorsConfig.m3741a(BackdropValue.f10224a, this.f10175c);
        } else {
            float f2 = this.f10174b;
            if (f != f2) {
                draggableAnchorsConfig.m3741a(BackdropValue.f10224a, f2);
                draggableAnchorsConfig.m3741a(BackdropValue.f10225b, this.f10176d.f51656a);
            }
        }
        return Unit.f51459a;
    }
}
