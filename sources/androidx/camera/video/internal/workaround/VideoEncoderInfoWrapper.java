package androidx.camera.video.internal.workaround;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.annotation.RequiresApi;
import androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk;
import androidx.camera.video.internal.encoder.VideoEncoderInfo;
import androidx.core.util.Preconditions;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class VideoEncoderInfoWrapper implements VideoEncoderInfo {

    /* JADX INFO: renamed from: a */
    public final VideoEncoderInfo f3492a;

    /* JADX INFO: renamed from: b */
    public final Range f3493b;

    /* JADX INFO: renamed from: c */
    public final Range f3494c;

    /* JADX INFO: renamed from: d */
    public final HashSet f3495d;

    public VideoEncoderInfoWrapper(VideoEncoderInfo videoEncoderInfo, Size size) {
        HashSet hashSet = new HashSet();
        this.f3495d = hashSet;
        this.f3492a = videoEncoderInfo;
        int iMo1917a = videoEncoderInfo.mo1917a();
        this.f3493b = Range.create(Integer.valueOf(iMo1917a), Integer.valueOf(((int) Math.ceil(4096.0d / ((double) iMo1917a))) * iMo1917a));
        int iMo1920d = videoEncoderInfo.mo1920d();
        this.f3494c = Range.create(Integer.valueOf(iMo1920d), Integer.valueOf(((int) Math.ceil(2160.0d / ((double) iMo1920d))) * iMo1920d));
        if (size != null) {
            hashSet.add(size);
        }
        List list = MediaCodecInfoReportIncorrectInfoQuirk.f3419a;
        hashSet.addAll(MediaCodecInfoReportIncorrectInfoQuirk.f3419a.contains(Build.MODEL.toLowerCase(Locale.US)) ? Collections.singleton(new Size(1920, 1080)) : Collections.EMPTY_SET);
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    /* JADX INFO: renamed from: a */
    public final int mo1917a() {
        return this.f3492a.mo1917a();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    /* JADX INFO: renamed from: b */
    public final Range mo1918b(int i) {
        Integer numValueOf = Integer.valueOf(i);
        Range range = this.f3494c;
        boolean zContains = range.contains(numValueOf);
        VideoEncoderInfo videoEncoderInfo = this.f3492a;
        Preconditions.m7695b(zContains && i % videoEncoderInfo.mo1920d() == 0, "Not supported height: " + i + " which is not in " + range + " or can not be divided by alignment " + videoEncoderInfo.mo1920d());
        return this.f3493b;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    /* JADX INFO: renamed from: c */
    public final Range mo1919c(int i) {
        Integer numValueOf = Integer.valueOf(i);
        Range range = this.f3493b;
        boolean zContains = range.contains(numValueOf);
        VideoEncoderInfo videoEncoderInfo = this.f3492a;
        Preconditions.m7695b(zContains && i % videoEncoderInfo.mo1917a() == 0, "Not supported width: " + i + " which is not in " + range + " or can not be divided by alignment " + videoEncoderInfo.mo1917a());
        return this.f3494c;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    /* JADX INFO: renamed from: d */
    public final int mo1920d() {
        return this.f3492a.mo1920d();
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    /* JADX INFO: renamed from: e */
    public final Range mo1921e() {
        return this.f3493b;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    /* JADX INFO: renamed from: f */
    public final boolean mo1922f(int i, int i2) {
        HashSet hashSet = this.f3495d;
        if (!hashSet.isEmpty() && hashSet.contains(new Size(i, i2))) {
            return true;
        }
        if (!this.f3493b.contains(Integer.valueOf(i))) {
            return false;
        }
        if (!this.f3494c.contains(Integer.valueOf(i2))) {
            return false;
        }
        VideoEncoderInfo videoEncoderInfo = this.f3492a;
        return i % videoEncoderInfo.mo1917a() == 0 && i2 % videoEncoderInfo.mo1920d() == 0;
    }

    @Override // androidx.camera.video.internal.encoder.VideoEncoderInfo
    /* JADX INFO: renamed from: g */
    public final Range mo1923g() {
        return this.f3494c;
    }
}
