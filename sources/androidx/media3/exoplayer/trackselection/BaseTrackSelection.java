package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.Format;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public abstract class BaseTrackSelection implements ExoTrackSelection {

    /* JADX INFO: renamed from: a */
    public final TrackGroup f27555a;

    /* JADX INFO: renamed from: b */
    public final int f27556b;

    /* JADX INFO: renamed from: c */
    public final int[] f27557c;

    /* JADX INFO: renamed from: d */
    public final Format[] f27558d;

    /* JADX INFO: renamed from: e */
    public int f27559e;

    public BaseTrackSelection(TrackGroup trackGroup, int[] iArr) {
        Format[] formatArr;
        Assertions.m9464e(iArr.length > 0);
        trackGroup.getClass();
        this.f27555a = trackGroup;
        int length = iArr.length;
        this.f27556b = length;
        this.f27558d = new Format[length];
        int i = 0;
        while (true) {
            int length2 = iArr.length;
            formatArr = trackGroup.f25368d;
            if (i >= length2) {
                break;
            }
            this.f27558d[i] = formatArr[iArr[i]];
            i++;
        }
        Arrays.sort(this.f27558d, new C1905b(6));
        this.f27557c = new int[this.f27556b];
        int i2 = 0;
        while (true) {
            int i3 = this.f27556b;
            if (i2 >= i3) {
                long[] jArr = new long[i3];
                return;
            }
            int[] iArr2 = this.f27557c;
            Format format = this.f27558d[i2];
            int i4 = 0;
            while (true) {
                if (i4 >= formatArr.length) {
                    i4 = -1;
                    break;
                } else if (format == formatArr[i4]) {
                    break;
                } else {
                    i4++;
                }
            }
            iArr2[i2] = i4;
            i2++;
        }
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    /* JADX INFO: renamed from: a */
    public final TrackGroup mo10520a() {
        return this.f27555a;
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    /* JADX INFO: renamed from: e */
    public final Format mo10523e(int i) {
        return this.f27558d[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            BaseTrackSelection baseTrackSelection = (BaseTrackSelection) obj;
            if (this.f27555a.equals(baseTrackSelection.f27555a) && Arrays.equals(this.f27557c, baseTrackSelection.f27557c)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    /* JADX INFO: renamed from: g */
    public final int mo10525g(int i) {
        return this.f27557c[i];
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    /* JADX INFO: renamed from: h */
    public final int mo10526h() {
        return this.f27557c[mo10438b()];
    }

    public final int hashCode() {
        if (this.f27559e == 0) {
            this.f27559e = Arrays.hashCode(this.f27557c) + (System.identityHashCode(this.f27555a) * 31);
        }
        return this.f27559e;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    /* JADX INFO: renamed from: i */
    public final Format mo10527i() {
        return this.f27558d[mo10438b()];
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    public final int length() {
        return this.f27557c.length;
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelection
    /* JADX INFO: renamed from: m */
    public final int mo10531m(int i) {
        for (int i2 = 0; i2 < this.f27556b; i2++) {
            if (this.f27557c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    /* JADX INFO: renamed from: c */
    public void mo10521c() {
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    /* JADX INFO: renamed from: f */
    public void mo10524f() {
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    /* JADX INFO: renamed from: d */
    public final void mo10522d(boolean z2) {
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    /* JADX INFO: renamed from: j */
    public void mo10528j(float f) {
    }
}
