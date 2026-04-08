package androidx.camera.video.internal;

import androidx.annotation.RequiresApi;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.video.internal.utils.DynamicRangeUtil;
import androidx.camera.video.internal.workaround.QualityValidatedEncoderProfilesProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class DynamicRangeMatchedEncoderProfilesProvider implements EncoderProfilesProvider {

    /* JADX INFO: renamed from: a */
    public final QualityValidatedEncoderProfilesProvider f3403a;

    /* JADX INFO: renamed from: b */
    public final DynamicRange f3404b;

    /* JADX INFO: renamed from: c */
    public final HashMap f3405c = new HashMap();

    public DynamicRangeMatchedEncoderProfilesProvider(QualityValidatedEncoderProfilesProvider qualityValidatedEncoderProfilesProvider, DynamicRange dynamicRange) {
        this.f3403a = qualityValidatedEncoderProfilesProvider;
        this.f3404b = dynamicRange;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    /* JADX INFO: renamed from: a */
    public final boolean mo975a(int i) {
        return this.f3403a.mo975a(i) && m1848c(i) != null;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    /* JADX INFO: renamed from: b */
    public final EncoderProfilesProxy mo976b(int i) {
        return m1848c(i);
    }

    /* JADX INFO: renamed from: c */
    public final EncoderProfilesProxy m1848c(int i) {
        Set set;
        HashMap map = this.f3405c;
        if (map.containsKey(Integer.valueOf(i))) {
            return (EncoderProfilesProxy) map.get(Integer.valueOf(i));
        }
        QualityValidatedEncoderProfilesProvider qualityValidatedEncoderProfilesProvider = this.f3403a;
        EncoderProfilesProxy.ImmutableEncoderProfilesProxy immutableEncoderProfilesProxyM1486e = null;
        if (qualityValidatedEncoderProfilesProvider.mo975a(i)) {
            EncoderProfilesProxy encoderProfilesProxyMo976b = qualityValidatedEncoderProfilesProvider.mo976b(i);
            if (encoderProfilesProxyMo976b != null) {
                ArrayList arrayList = new ArrayList();
                for (EncoderProfilesProxy.VideoProfileProxy videoProfileProxy : encoderProfilesProxyMo976b.mo1396d()) {
                    HashMap map2 = DynamicRangeUtil.f3484a;
                    DynamicRange dynamicRange = this.f3404b;
                    Set set2 = (Set) map2.get(Integer.valueOf(dynamicRange.f2254b));
                    if (set2 != null && set2.contains(Integer.valueOf(videoProfileProxy.mo1397b())) && (set = (Set) DynamicRangeUtil.f3485b.get(Integer.valueOf(dynamicRange.f2253a))) != null && set.contains(Integer.valueOf(videoProfileProxy.mo1402g()))) {
                        arrayList.add(videoProfileProxy);
                    }
                }
                if (!arrayList.isEmpty()) {
                    immutableEncoderProfilesProxyM1486e = EncoderProfilesProxy.ImmutableEncoderProfilesProxy.m1486e(encoderProfilesProxyMo976b.mo1393a(), encoderProfilesProxyMo976b.mo1394b(), arrayList, encoderProfilesProxyMo976b.mo1395c());
                }
            }
            map.put(Integer.valueOf(i), immutableEncoderProfilesProxyM1486e);
        }
        return immutableEncoderProfilesProxyM1486e;
    }
}
