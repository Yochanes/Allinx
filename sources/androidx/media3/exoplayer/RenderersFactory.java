package androidx.media3.exoplayer;

import android.os.Handler;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.metadata.MetadataOutput;
import androidx.media3.exoplayer.text.TextOutput;
import androidx.media3.exoplayer.video.VideoRendererEventListener;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface RenderersFactory {
    /* JADX INFO: renamed from: a */
    Renderer[] mo9817a(Handler handler, VideoRendererEventListener videoRendererEventListener, AudioRendererEventListener audioRendererEventListener, TextOutput textOutput, MetadataOutput metadataOutput);

    /* JADX INFO: renamed from: b */
    default void mo9818b(Renderer renderer) {
    }
}
