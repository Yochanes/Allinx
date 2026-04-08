package androidx.media3.exoplayer.source;

import androidx.media3.common.MediaItem;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.source.MediaSource;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
@Deprecated
public interface MediaSourceFactory extends MediaSource.Factory {

    /* JADX INFO: renamed from: b */
    public static final MediaSourceFactory f27240b = new C18721();

    /* JADX INFO: renamed from: androidx.media3.exoplayer.source.MediaSourceFactory$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C18721 implements MediaSourceFactory {
        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        /* JADX INFO: renamed from: a */
        public final MediaSource mo10498a(MediaItem mediaItem) {
            throw new UnsupportedOperationException();
        }
    }
}
