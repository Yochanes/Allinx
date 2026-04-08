package androidx.camera.video.internal;

import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.core.util.Preconditions;
import com.google.auto.value.AutoValue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@AutoValue
@RequiresApi
public abstract class VideoValidatedEncoderProfilesProxy implements EncoderProfilesProxy {
    /* JADX INFO: renamed from: e */
    public static VideoValidatedEncoderProfilesProxy m1849e(EncoderProfilesProxy encoderProfilesProxy) {
        int iMo1393a = encoderProfilesProxy.mo1393a();
        int iMo1394b = encoderProfilesProxy.mo1394b();
        List listMo1395c = encoderProfilesProxy.mo1395c();
        List listMo1396d = encoderProfilesProxy.mo1396d();
        Preconditions.m7695b(!listMo1396d.isEmpty(), "Should contain at least one VideoProfile.");
        return new AutoValue_VideoValidatedEncoderProfilesProxy(iMo1393a, iMo1394b, Collections.unmodifiableList(new ArrayList(listMo1395c)), Collections.unmodifiableList(new ArrayList(listMo1396d)), !listMo1395c.isEmpty() ? (EncoderProfilesProxy.AudioProfileProxy) listMo1395c.get(0) : null, (EncoderProfilesProxy.VideoProfileProxy) listMo1396d.get(0));
    }

    /* JADX INFO: renamed from: f */
    public abstract EncoderProfilesProxy.AudioProfileProxy mo1843f();

    /* JADX INFO: renamed from: g */
    public abstract EncoderProfilesProxy.VideoProfileProxy mo1844g();
}
