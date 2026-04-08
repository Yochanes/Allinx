package androidx.compose.p013ui.graphics.layer;

import android.media.ImageReader;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m18302d2 = {"<anonymous>", "", "it", "Landroid/media/ImageReader;", "kotlin.jvm.PlatformType", "onImageAvailable"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class LayerSnapshotV22$toBitmap$2$image$1$1 implements ImageReader.OnImageAvailableListener {
    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        imageReader.acquireLatestImage();
        throw null;
    }
}
