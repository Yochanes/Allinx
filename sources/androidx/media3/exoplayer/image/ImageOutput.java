package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface ImageOutput {

    /* JADX INFO: renamed from: a */
    public static final ImageOutput f26866a = new C18321();

    /* JADX INFO: renamed from: a */
    void mo10338a();

    void onImageAvailable(long j, Bitmap bitmap);

    /* JADX INFO: renamed from: androidx.media3.exoplayer.image.ImageOutput$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C18321 implements ImageOutput {
        @Override // androidx.media3.exoplayer.image.ImageOutput
        /* JADX INFO: renamed from: a */
        public final void mo10338a() {
        }

        @Override // androidx.media3.exoplayer.image.ImageOutput
        public final void onImageAvailable(long j, Bitmap bitmap) {
        }
    }
}
