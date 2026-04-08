package androidx.media3.exoplayer.source;

import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class TimelineWithUpdatedMediaItem extends ForwardingTimeline {

    /* JADX INFO: renamed from: c */
    public final MediaItem f27449c;

    public TimelineWithUpdatedMediaItem(Timeline timeline, MediaItem mediaItem) {
        super(timeline);
        this.f27449c = mediaItem;
    }

    @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
    /* JADX INFO: renamed from: n */
    public final Timeline.Window mo9358n(int i, Timeline.Window window, long j) {
        super.mo9358n(i, window, j);
        MediaItem mediaItem = this.f27449c;
        window.f25352c = mediaItem;
        MediaItem.LocalConfiguration localConfiguration = mediaItem.f25216b;
        window.f25351b = localConfiguration != null ? localConfiguration.f25252g : null;
        return window;
    }
}
