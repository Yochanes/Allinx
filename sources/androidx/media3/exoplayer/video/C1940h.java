package androidx.media3.exoplayer.video;

import androidx.media3.common.VideoFrameProcessor;
import androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper;
import com.google.common.base.Supplier;

/* JADX INFO: renamed from: androidx.media3.exoplayer.video.h */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1940h implements Supplier {
    @Override // com.google.common.base.Supplier
    public final Object get() {
        Supplier supplier = PlaybackVideoGraphWrapper.ReflectiveDefaultVideoFrameProcessorFactory.f27922a;
        try {
            Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
            Object objInvoke = cls.getMethod("build", new Class[0]).invoke(cls.getConstructor(new Class[0]).newInstance(new Object[0]), new Object[0]);
            objInvoke.getClass();
            return (VideoFrameProcessor.Factory) objInvoke;
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
