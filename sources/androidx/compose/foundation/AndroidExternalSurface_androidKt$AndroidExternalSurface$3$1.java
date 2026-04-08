package androidx.compose.foundation;

import android.view.SurfaceView;
import androidx.compose.p013ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "view", "Landroid/view/SurfaceView;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1 extends Lambda implements Function1<SurfaceView, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SurfaceView surfaceView = (SurfaceView) obj;
        if (IntSize.m6665b(0L, 0L)) {
            surfaceView.getHolder().setSizeFromLayout();
        } else {
            surfaceView.getHolder().setFixedSize((int) (0 >> 32), (int) (0 & 4294967295L));
        }
        surfaceView.getHolder().setFormat(-3);
        surfaceView.setZOrderOnTop(false);
        surfaceView.setSecure(false);
        return Unit.f51459a;
    }
}
