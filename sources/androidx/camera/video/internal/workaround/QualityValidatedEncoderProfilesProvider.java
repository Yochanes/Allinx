package androidx.camera.video.internal.workaround;

import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.ResolutionValidatedEncoderProfilesProvider;
import androidx.camera.video.Quality;
import androidx.camera.video.internal.compat.quirk.VideoQualityQuirk;
import java.util.HashMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class QualityValidatedEncoderProfilesProvider implements EncoderProfilesProvider {

    /* JADX INFO: renamed from: d */
    public static final HashMap f3488d;

    /* JADX INFO: renamed from: a */
    public final ResolutionValidatedEncoderProfilesProvider f3489a;

    /* JADX INFO: renamed from: b */
    public final CameraInfoInternal f3490b;

    /* JADX INFO: renamed from: c */
    public final Quirks f3491c;

    static {
        HashMap map = new HashMap();
        f3488d = map;
        map.put(1, Quality.f3307f);
        map.put(8, Quality.f3305d);
        map.put(6, Quality.f3304c);
        map.put(5, Quality.f3303b);
        map.put(4, Quality.f3302a);
        map.put(0, Quality.f3306e);
    }

    public QualityValidatedEncoderProfilesProvider(ResolutionValidatedEncoderProfilesProvider resolutionValidatedEncoderProfilesProvider, CameraInfoInternal cameraInfoInternal, Quirks quirks) {
        this.f3489a = resolutionValidatedEncoderProfilesProvider;
        this.f3490b = cameraInfoInternal;
        this.f3491c = quirks;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    /* JADX INFO: renamed from: a */
    public final boolean mo975a(int i) {
        if (!this.f3489a.mo975a(i)) {
            return false;
        }
        Quality quality = (Quality) f3488d.get(Integer.valueOf(i));
        if (quality == null) {
            return true;
        }
        for (VideoQualityQuirk videoQualityQuirk : this.f3491c.m1515c(VideoQualityQuirk.class)) {
            if (videoQualityQuirk != null && videoQualityQuirk.mo1875a(this.f3490b, quality) && !videoQualityQuirk.mo1879c()) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    /* JADX INFO: renamed from: b */
    public final EncoderProfilesProxy mo976b(int i) {
        if (mo975a(i)) {
            return this.f3489a.mo976b(i);
        }
        return null;
    }
}
