package androidx.media3.exoplayer.mediacodec;

import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import java.util.Comparator;
import java.util.HashMap;

/* JADX INFO: renamed from: androidx.media3.exoplayer.mediacodec.f */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1848f implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MediaCodecUtil.ScoreProvider f27052a;

    public /* synthetic */ C1848f(MediaCodecUtil.ScoreProvider scoreProvider) {
        this.f27052a = scoreProvider;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        HashMap map = MediaCodecUtil.f27037a;
        MediaCodecUtil.ScoreProvider scoreProvider = this.f27052a;
        return scoreProvider.mo10431a(obj2) - scoreProvider.mo10431a(obj);
    }
}
