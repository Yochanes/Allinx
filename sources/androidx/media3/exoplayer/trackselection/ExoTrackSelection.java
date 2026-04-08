package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.Format;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface ExoTrackSelection extends TrackSelection {

    /* JADX INFO: compiled from: Proguard */
    public static final class Definition {

        /* JADX INFO: renamed from: a */
        public final TrackGroup f27646a;

        /* JADX INFO: renamed from: b */
        public final int[] f27647b;

        public Definition(TrackGroup trackGroup, int[] iArr) {
            if (iArr.length == 0) {
                Log.m9508d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f27646a = trackGroup;
            this.f27647b = iArr;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface Factory {
    }

    /* JADX INFO: renamed from: b */
    int mo10438b();

    /* JADX INFO: renamed from: c */
    void mo10521c();

    /* JADX INFO: renamed from: f */
    void mo10524f();

    /* JADX INFO: renamed from: h */
    int mo10526h();

    /* JADX INFO: renamed from: i */
    Format mo10527i();

    /* JADX INFO: renamed from: j */
    void mo10528j(float f);

    /* JADX INFO: renamed from: k */
    default void mo10529k() {
    }

    /* JADX INFO: renamed from: l */
    default void mo10530l() {
    }

    /* JADX INFO: renamed from: d */
    default void mo10522d(boolean z2) {
    }
}
