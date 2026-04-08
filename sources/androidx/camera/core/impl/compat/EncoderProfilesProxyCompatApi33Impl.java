package androidx.camera.core.impl.compat;

import android.media.EncoderProfiles;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.EncoderProfilesProxy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
class EncoderProfilesProxyCompatApi33Impl {
    /* JADX INFO: renamed from: a */
    public static EncoderProfilesProxy m1578a(EncoderProfiles encoderProfiles) {
        int defaultDurationSeconds = encoderProfiles.getDefaultDurationSeconds();
        int recommendedFileFormat = encoderProfiles.getRecommendedFileFormat();
        List<EncoderProfiles.AudioProfile> audioProfiles = encoderProfiles.getAudioProfiles();
        ArrayList arrayList = new ArrayList();
        for (EncoderProfiles.AudioProfile audioProfile : audioProfiles) {
            arrayList.add(EncoderProfilesProxy.AudioProfileProxy.m1485a(audioProfile.getCodec(), audioProfile.getMediaType(), audioProfile.getBitrate(), audioProfile.getSampleRate(), audioProfile.getChannels(), audioProfile.getProfile()));
        }
        List<EncoderProfiles.VideoProfile> videoProfiles = encoderProfiles.getVideoProfiles();
        ArrayList arrayList2 = new ArrayList();
        for (EncoderProfiles.VideoProfile videoProfile : videoProfiles) {
            arrayList2.add(EncoderProfilesProxy.VideoProfileProxy.m1487a(videoProfile.getCodec(), videoProfile.getMediaType(), videoProfile.getBitrate(), videoProfile.getFrameRate(), videoProfile.getWidth(), videoProfile.getHeight(), videoProfile.getProfile(), videoProfile.getBitDepth(), videoProfile.getChromaSubsampling(), videoProfile.getHdrFormat()));
        }
        return EncoderProfilesProxy.ImmutableEncoderProfilesProxy.m1486e(defaultDurationSeconds, recommendedFileFormat, arrayList2, arrayList);
    }
}
