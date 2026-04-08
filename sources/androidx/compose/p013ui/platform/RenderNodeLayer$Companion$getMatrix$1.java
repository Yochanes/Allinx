package androidx.compose.p013ui.platform;

import android.graphics.Matrix;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m18302d2 = {"<anonymous>", "", "rn", "Landroidx/compose/ui/platform/DeviceRenderNode;", "matrix", "Landroid/graphics/Matrix;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class RenderNodeLayer$Companion$getMatrix$1 extends Lambda implements Function2<DeviceRenderNode, Matrix, Unit> {

    /* JADX INFO: renamed from: a */
    public static final RenderNodeLayer$Companion$getMatrix$1 f19515a = new RenderNodeLayer$Companion$getMatrix$1(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((DeviceRenderNode) obj).mo6112E((Matrix) obj2);
        return Unit.f51459a;
    }
}
