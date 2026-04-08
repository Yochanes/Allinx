package androidx.compose.foundation;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import androidx.compose.p013ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/AndroidEmbeddedExternalSurfaceState;", "Landroidx/compose/foundation/BaseAndroidExternalSurfaceState;", "Landroid/view/TextureView$SurfaceTextureListener;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class AndroidEmbeddedExternalSurfaceState extends BaseAndroidExternalSurfaceState implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: a */
    public Surface f4827a;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (!IntSize.m6665b(0L, 0L)) {
            surfaceTexture.setDefaultBufferSize((int) (0 >> 32), (int) (0 & 4294967295L));
        }
        this.f4827a = new Surface(surfaceTexture);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Intrinsics.m18596d(this.f4827a);
        this.f4827a = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        if (!IntSize.m6665b(0L, 0L)) {
            surfaceTexture.setDefaultBufferSize((int) (0 >> 32), (int) (0 & 4294967295L));
        }
        Intrinsics.m18596d(this.f4827a);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
