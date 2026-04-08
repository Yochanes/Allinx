package androidx.media3.exoplayer;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.RendererCapabilitiesList;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.video.VideoRendererEventListener;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class DefaultRendererCapabilitiesList implements RendererCapabilitiesList {

    /* JADX INFO: compiled from: Proguard */
    public static final class Factory implements RendererCapabilitiesList.Factory {

        /* JADX INFO: renamed from: androidx.media3.exoplayer.DefaultRendererCapabilitiesList$Factory$1 */
        /* JADX INFO: compiled from: Proguard */
        class C17691 implements VideoRendererEventListener {
        }

        /* JADX INFO: renamed from: androidx.media3.exoplayer.DefaultRendererCapabilitiesList$Factory$2 */
        /* JADX INFO: compiled from: Proguard */
        class C17702 implements AudioRendererEventListener {
        }
    }
}
