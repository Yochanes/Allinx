package androidx.camera.core.impl;

import android.util.Size;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.quirk.ProfileResolutionQuirk;
import java.util.ArrayList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class ResolutionValidatedEncoderProfilesProvider implements EncoderProfilesProvider {

    /* JADX INFO: renamed from: a */
    public final EncoderProfilesProvider f2754a;

    /* JADX INFO: renamed from: b */
    public final EncoderProfilesResolutionValidator f2755b;

    public ResolutionValidatedEncoderProfilesProvider(EncoderProfilesProvider encoderProfilesProvider, Quirks quirks) {
        this.f2754a = encoderProfilesProvider;
        this.f2755b = new EncoderProfilesResolutionValidator(quirks.m1515c(ProfileResolutionQuirk.class));
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    /* JADX INFO: renamed from: a */
    public final boolean mo975a(int i) {
        EncoderProfilesProvider encoderProfilesProvider = this.f2754a;
        if (!encoderProfilesProvider.mo975a(i)) {
            return false;
        }
        EncoderProfilesResolutionValidator encoderProfilesResolutionValidator = this.f2755b;
        if (!encoderProfilesResolutionValidator.f2707a.isEmpty()) {
            EncoderProfilesProxy encoderProfilesProxyMo976b = encoderProfilesProvider.mo976b(i);
            if (encoderProfilesProxyMo976b == null) {
                return false;
            }
            if (encoderProfilesResolutionValidator.f2707a.isEmpty()) {
                return !encoderProfilesProxyMo976b.mo1396d().isEmpty();
            }
            for (EncoderProfilesProxy.VideoProfileProxy videoProfileProxy : encoderProfilesProxyMo976b.mo1396d()) {
                if (encoderProfilesResolutionValidator.f2708b.contains(new Size(videoProfileProxy.mo1406k(), videoProfileProxy.mo1403h()))) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    /* JADX INFO: renamed from: b */
    public final EncoderProfilesProxy mo976b(int i) {
        EncoderProfilesProvider encoderProfilesProvider = this.f2754a;
        if (!encoderProfilesProvider.mo975a(i)) {
            return null;
        }
        EncoderProfilesProxy encoderProfilesProxyMo976b = encoderProfilesProvider.mo976b(i);
        EncoderProfilesResolutionValidator encoderProfilesResolutionValidator = this.f2755b;
        if (encoderProfilesResolutionValidator.f2707a.isEmpty()) {
            return encoderProfilesProxyMo976b;
        }
        if (encoderProfilesProxyMo976b == null) {
            return null;
        }
        if (encoderProfilesResolutionValidator.f2707a.isEmpty()) {
            return encoderProfilesProxyMo976b;
        }
        ArrayList arrayList = new ArrayList();
        for (EncoderProfilesProxy.VideoProfileProxy videoProfileProxy : encoderProfilesProxyMo976b.mo1396d()) {
            if (encoderProfilesResolutionValidator.f2708b.contains(new Size(videoProfileProxy.mo1406k(), videoProfileProxy.mo1403h()))) {
                arrayList.add(videoProfileProxy);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return EncoderProfilesProxy.ImmutableEncoderProfilesProxy.m1486e(encoderProfilesProxyMo976b.mo1393a(), encoderProfilesProxyMo976b.mo1394b(), arrayList, encoderProfilesProxyMo976b.mo1395c());
    }
}
