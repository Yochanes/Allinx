package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.Tracks;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.RendererConfiguration;
import androidx.media3.exoplayer.trackselection.MappingTrackSelector;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class TrackSelectorResult {

    /* JADX INFO: renamed from: a */
    public final int f27657a;

    /* JADX INFO: renamed from: b */
    public final RendererConfiguration[] f27658b;

    /* JADX INFO: renamed from: c */
    public final ExoTrackSelection[] f27659c;

    /* JADX INFO: renamed from: d */
    public final Tracks f27660d;

    /* JADX INFO: renamed from: e */
    public final MappingTrackSelector.MappedTrackInfo f27661e;

    public TrackSelectorResult(RendererConfiguration[] rendererConfigurationArr, ExoTrackSelection[] exoTrackSelectionArr, Tracks tracks, MappingTrackSelector.MappedTrackInfo mappedTrackInfo) {
        Assertions.m9460a(rendererConfigurationArr.length == exoTrackSelectionArr.length);
        this.f27658b = rendererConfigurationArr;
        this.f27659c = (ExoTrackSelection[]) exoTrackSelectionArr.clone();
        this.f27660d = tracks;
        this.f27661e = mappedTrackInfo;
        this.f27657a = rendererConfigurationArr.length;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m10655a(TrackSelectorResult trackSelectorResult, int i) {
        return trackSelectorResult != null && Objects.equals(this.f27658b[i], trackSelectorResult.f27658b[i]) && Objects.equals(this.f27659c[i], trackSelectorResult.f27659c[i]);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m10656b(int i) {
        return this.f27658b[i] != null;
    }
}
