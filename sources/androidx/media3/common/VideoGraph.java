package androidx.media3.common;

import androidx.media3.common.util.UnstableApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface VideoGraph {

    /* JADX INFO: compiled from: Proguard */
    @UnstableApi
    public interface Listener {
    }

    /* JADX INFO: renamed from: a */
    void m9397a();

    /* JADX INFO: renamed from: b */
    VideoFrameProcessor m9398b();

    /* JADX INFO: renamed from: c */
    void m9399c();

    void initialize();

    void release();
}
