package androidx.compose.foundation;

import android.graphics.Rect;
import android.view.SurfaceHolder;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/AndroidExternalSurfaceState;", "Landroidx/compose/foundation/BaseAndroidExternalSurfaceState;", "Landroid/view/SurfaceHolder$Callback;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class AndroidExternalSurfaceState extends BaseAndroidExternalSurfaceState implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: a */
    public int f4828a;

    /* JADX INFO: renamed from: b */
    public int f4829b;

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (this.f4828a == i2 && this.f4829b == i3) {
            return;
        }
        this.f4828a = i2;
        this.f4829b = i3;
        surfaceHolder.getSurface();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        this.f4828a = surfaceFrame.width();
        this.f4829b = surfaceFrame.height();
        surfaceHolder.getSurface();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        surfaceHolder.getSurface();
    }
}
