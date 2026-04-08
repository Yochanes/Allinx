package androidx.media3.exoplayer.source;

import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class TrackGroupArray {

    /* JADX INFO: renamed from: d */
    public static final TrackGroupArray f27450d = new TrackGroupArray(new TrackGroup[0]);

    /* JADX INFO: renamed from: a */
    public final int f27451a;

    /* JADX INFO: renamed from: b */
    public final ImmutableList f27452b;

    /* JADX INFO: renamed from: c */
    public int f27453c;

    static {
        Util.m9594D(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TrackGroupArray(TrackGroup... trackGroupArr) {
        this.f27452b = ImmutableList.copyOf(trackGroupArr);
        this.f27451a = trackGroupArr.length;
        int i = 0;
        while (true) {
            ImmutableList immutableList = this.f27452b;
            if (i >= immutableList.size()) {
                return;
            }
            int i2 = i + 1;
            for (int i3 = i2; i3 < immutableList.size(); i3++) {
                if (((TrackGroup) immutableList.get(i)).equals(immutableList.get(i3))) {
                    Log.m9508d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final TrackGroup m10583a(int i) {
        return (TrackGroup) this.f27452b.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && TrackGroupArray.class == obj.getClass()) {
            TrackGroupArray trackGroupArray = (TrackGroupArray) obj;
            if (this.f27451a == trackGroupArray.f27451a && this.f27452b.equals(trackGroupArray.f27452b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f27453c == 0) {
            this.f27453c = this.f27452b.hashCode();
        }
        return this.f27453c;
    }

    public final String toString() {
        return this.f27452b.toString();
    }
}
