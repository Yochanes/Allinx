package androidx.camera.core.processing;

import android.util.Size;
import androidx.arch.core.util.Function;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.video.VideoCapture;
import androidx.camera.video.impl.VideoCaptureConfig;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import androidx.camera.video.internal.encoder.VideoEncoderConfig;
import androidx.camera.video.internal.encoder.VideoEncoderInfoImpl;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: androidx.camera.core.processing.h */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0324h implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3152a;

    public /* synthetic */ C0324h(int i) {
        this.f3152a = i;
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        ArrayList arrayList = null;
        switch (this.f3152a) {
            case 0:
                return new DefaultSurfaceProcessor((DynamicRange) obj);
            case 1:
                VideoEncoderConfig videoEncoderConfig = (VideoEncoderConfig) obj;
                VideoCaptureConfig videoCaptureConfig = VideoCapture.Defaults.f3366a;
                try {
                    return VideoEncoderInfoImpl.m1924h(videoEncoderConfig);
                } catch (InvalidConfigException e) {
                    Logger.m1289j("VideoCapture", "Unable to find VideoEncoderInfo", e);
                    return null;
                }
            case 2:
                EncoderProfilesProxy.VideoProfileProxy videoProfileProxy = (EncoderProfilesProxy.VideoProfileProxy) obj;
                if (videoProfileProxy == null) {
                    return null;
                }
                VideoEncoderConfig.Builder builderM1916a = VideoEncoderConfig.m1916a();
                builderM1916a.mo1901f(videoProfileProxy.mo1404i());
                builderM1916a.mo1902g(videoProfileProxy.mo1405j());
                builderM1916a.mo1903h(new Size(videoProfileProxy.mo1406k(), videoProfileProxy.mo1403h()));
                builderM1916a.mo1899d(videoProfileProxy.mo1401f());
                builderM1916a.mo1897b(videoProfileProxy.mo1398c());
                builderM1916a.mo1900e();
                VideoEncoderConfig videoEncoderConfigMo1896a = builderM1916a.mo1896a();
                try {
                    VideoEncoderInfoImpl videoEncoderInfoImplM1924h = VideoEncoderInfoImpl.m1924h(videoEncoderConfigMo1896a);
                    int iMo1889b = videoEncoderConfigMo1896a.mo1889b();
                    int iIntValue = ((Integer) videoEncoderInfoImplM1924h.f3480b.getBitrateRange().clamp(Integer.valueOf(iMo1889b))).intValue();
                    return iIntValue == iMo1889b ? videoProfileProxy : EncoderProfilesProxy.VideoProfileProxy.m1487a(videoProfileProxy.mo1400e(), videoProfileProxy.mo1404i(), iIntValue, videoProfileProxy.mo1401f(), videoProfileProxy.mo1406k(), videoProfileProxy.mo1403h(), videoProfileProxy.mo1405j(), videoProfileProxy.mo1397b(), videoProfileProxy.mo1399d(), videoProfileProxy.mo1402g());
                } catch (InvalidConfigException unused) {
                    return null;
                }
            default:
                List list = (List) obj;
                C0324h c0324h = WorkSpec.f33010y;
                if (list != null) {
                    List list2 = list;
                    arrayList = new ArrayList(CollectionsKt.m18452r(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((WorkSpec.WorkInfoPojo) it.next()).m12232a());
                    }
                }
                return arrayList;
        }
    }
}
