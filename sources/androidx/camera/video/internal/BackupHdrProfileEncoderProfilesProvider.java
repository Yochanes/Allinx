package androidx.camera.video.internal;

import android.util.Rational;
import androidx.annotation.RequiresApi;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.processing.C0324h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class BackupHdrProfileEncoderProfilesProvider implements EncoderProfilesProvider {

    /* JADX INFO: renamed from: d */
    public static final C0324h f3397d = new C0324h(2);

    /* JADX INFO: renamed from: a */
    public final EncoderProfilesProvider f3398a;

    /* JADX INFO: renamed from: b */
    public final C0324h f3399b;

    /* JADX INFO: renamed from: c */
    public final HashMap f3400c;

    public BackupHdrProfileEncoderProfilesProvider(EncoderProfilesProvider encoderProfilesProvider) {
        C0324h c0324h = f3397d;
        this.f3400c = new HashMap();
        this.f3398a = encoderProfilesProvider;
        this.f3399b = c0324h;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    /* JADX INFO: renamed from: a */
    public final boolean mo975a(int i) {
        return this.f3398a.mo975a(i) && m1845c(i) != null;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    /* JADX INFO: renamed from: b */
    public final EncoderProfilesProxy mo976b(int i) {
        return m1845c(i);
    }

    /* JADX INFO: renamed from: c */
    public final EncoderProfilesProxy m1845c(int i) {
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxy;
        int iDoubleValue;
        EncoderProfilesProxy.ImmutableEncoderProfilesProxy immutableEncoderProfilesProxy;
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxyM1487a;
        EncoderProfilesProxy.ImmutableEncoderProfilesProxy immutableEncoderProfilesProxyM1486e;
        HashMap map = this.f3400c;
        if (map.containsKey(Integer.valueOf(i))) {
            return (EncoderProfilesProxy) map.get(Integer.valueOf(i));
        }
        EncoderProfilesProvider encoderProfilesProvider = this.f3398a;
        if (!encoderProfilesProvider.mo975a(i)) {
            return null;
        }
        EncoderProfilesProxy encoderProfilesProxyMo976b = encoderProfilesProvider.mo976b(i);
        if (encoderProfilesProxyMo976b == null) {
            immutableEncoderProfilesProxyM1486e = null;
        } else {
            ArrayList arrayList = new ArrayList(encoderProfilesProxyMo976b.mo1396d());
            Iterator it = encoderProfilesProxyMo976b.mo1396d().iterator();
            while (true) {
                if (!it.hasNext()) {
                    videoProfileProxy = null;
                    break;
                }
                videoProfileProxy = (EncoderProfilesProxy.VideoProfileProxy) it.next();
                if (videoProfileProxy.mo1402g() == 0) {
                    break;
                }
            }
            if (videoProfileProxy == null) {
                videoProfileProxyM1487a = null;
                immutableEncoderProfilesProxy = null;
            } else {
                int iMo1400e = videoProfileProxy.mo1400e();
                String strMo1404i = videoProfileProxy.mo1404i();
                int iMo1405j = videoProfileProxy.mo1405j();
                if (1 != videoProfileProxy.mo1402g()) {
                    iMo1400e = 5;
                    strMo1404i = "video/hevc";
                    iMo1405j = 2;
                }
                String str = strMo1404i;
                int i2 = iMo1405j;
                int iMo1398c = videoProfileProxy.mo1398c();
                int iMo1397b = videoProfileProxy.mo1397b();
                if (10 == iMo1397b) {
                    iDoubleValue = iMo1398c;
                } else {
                    iDoubleValue = (int) (new Rational(10, iMo1397b).doubleValue() * ((double) iMo1398c));
                    if (Logger.m1285f("BackupHdrProfileEncoderProfilesProvider")) {
                        immutableEncoderProfilesProxy = null;
                        Logger.m1280a("BackupHdrProfileEncoderProfilesProvider", String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) = %d", Integer.valueOf(iMo1398c), 10, Integer.valueOf(iMo1397b), Integer.valueOf(iDoubleValue)));
                    }
                    videoProfileProxyM1487a = EncoderProfilesProxy.VideoProfileProxy.m1487a(iMo1400e, str, iDoubleValue, videoProfileProxy.mo1401f(), videoProfileProxy.mo1406k(), videoProfileProxy.mo1403h(), i2, 10, videoProfileProxy.mo1399d(), 1);
                }
                immutableEncoderProfilesProxy = null;
                videoProfileProxyM1487a = EncoderProfilesProxy.VideoProfileProxy.m1487a(iMo1400e, str, iDoubleValue, videoProfileProxy.mo1401f(), videoProfileProxy.mo1406k(), videoProfileProxy.mo1403h(), i2, 10, videoProfileProxy.mo1399d(), 1);
            }
            EncoderProfilesProxy.VideoProfileProxy videoProfileProxy2 = (EncoderProfilesProxy.VideoProfileProxy) this.f3399b.apply(videoProfileProxyM1487a);
            if (videoProfileProxy2 != null) {
                arrayList.add(videoProfileProxy2);
            }
            immutableEncoderProfilesProxyM1486e = arrayList.isEmpty() ? immutableEncoderProfilesProxy : EncoderProfilesProxy.ImmutableEncoderProfilesProxy.m1486e(encoderProfilesProxyMo976b.mo1393a(), encoderProfilesProxyMo976b.mo1394b(), arrayList, encoderProfilesProxyMo976b.mo1395c());
        }
        map.put(Integer.valueOf(i), immutableEncoderProfilesProxyM1486e);
        return immutableEncoderProfilesProxyM1486e;
    }
}
