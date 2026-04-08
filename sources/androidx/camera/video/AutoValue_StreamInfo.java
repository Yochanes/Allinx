package androidx.camera.video;

import androidx.camera.core.SurfaceRequest;
import androidx.camera.video.StreamInfo;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_StreamInfo extends StreamInfo {

    /* JADX INFO: renamed from: d */
    public final StreamInfo.StreamState f3292d;

    public AutoValue_StreamInfo(StreamInfo.StreamState streamState) {
        this.f3292d = streamState;
    }

    @Override // androidx.camera.video.StreamInfo
    /* JADX INFO: renamed from: a */
    public final int mo1814a() {
        return 0;
    }

    @Override // androidx.camera.video.StreamInfo
    /* JADX INFO: renamed from: b */
    public final SurfaceRequest.TransformationInfo mo1815b() {
        return null;
    }

    @Override // androidx.camera.video.StreamInfo
    /* JADX INFO: renamed from: c */
    public final StreamInfo.StreamState mo1816c() {
        return this.f3292d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StreamInfo)) {
            return false;
        }
        StreamInfo streamInfo = (StreamInfo) obj;
        return streamInfo.mo1814a() == 0 && this.f3292d.equals(streamInfo.mo1816c()) && streamInfo.mo1815b() == null;
    }

    public final int hashCode() {
        return (this.f3292d.hashCode() ^ (-721379959)) * 1000003;
    }

    public final String toString() {
        return "StreamInfo{id=0, streamState=" + this.f3292d + ", inProgressTransformationInfo=null}";
    }
}
