package io.intercom.android.sdk.lightcompressor.config;

import androidx.compose.animation.AbstractC0455a;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.intercom.android.sdk.lightcompressor.VideoQuality;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b+\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001aJ\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u00102\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\"J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003Jj\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0001¢\u0006\u0002\u00105J\u0013\u00106\u001a\u00020\u00052\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u00020\u0007HÖ\u0001J\t\u00109\u001a\u00020\u000fHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0016\"\u0004\b\u001f\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006:"}, m18302d2 = {"Lio/intercom/android/sdk/lightcompressor/config/Configuration;", "", "quality", "Lio/intercom/android/sdk/lightcompressor/VideoQuality;", "isMinBitrateCheckEnabled", "", "videoBitrateInMbps", "", "disableAudio", "keepOriginalResolution", "videoHeight", "", "videoWidth", "videoNames", "", "", "<init>", "(Lio/intercom/android/sdk/lightcompressor/VideoQuality;ZLjava/lang/Integer;ZZLjava/lang/Double;Ljava/lang/Double;Ljava/util/List;)V", "getQuality", "()Lio/intercom/android/sdk/lightcompressor/VideoQuality;", "setQuality", "(Lio/intercom/android/sdk/lightcompressor/VideoQuality;)V", "()Z", "setMinBitrateCheckEnabled", "(Z)V", "getVideoBitrateInMbps", "()Ljava/lang/Integer;", "setVideoBitrateInMbps", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getDisableAudio", "setDisableAudio", "getKeepOriginalResolution", "getVideoHeight", "()Ljava/lang/Double;", "setVideoHeight", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getVideoWidth", "setVideoWidth", "getVideoNames", "()Ljava/util/List;", "setVideoNames", "(Ljava/util/List;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lio/intercom/android/sdk/lightcompressor/VideoQuality;ZLjava/lang/Integer;ZZLjava/lang/Double;Ljava/lang/Double;Ljava/util/List;)Lio/intercom/android/sdk/lightcompressor/config/Configuration;", "equals", "other", "hashCode", "toString", "intercom-sdk-lightcompressor_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final /* data */ class Configuration {
    private boolean disableAudio;
    private boolean isMinBitrateCheckEnabled;
    private final boolean keepOriginalResolution;

    @NotNull
    private VideoQuality quality;

    @Nullable
    private Integer videoBitrateInMbps;

    @Nullable
    private Double videoHeight;

    @NotNull
    private List<String> videoNames;

    @Nullable
    private Double videoWidth;

    public Configuration(@NotNull VideoQuality quality, boolean z2, @Nullable Integer num, boolean z3, boolean z4, @Nullable Double d, @Nullable Double d2, @NotNull List<String> videoNames) {
        Intrinsics.m18599g(quality, "quality");
        Intrinsics.m18599g(videoNames, "videoNames");
        this.quality = quality;
        this.isMinBitrateCheckEnabled = z2;
        this.videoBitrateInMbps = num;
        this.disableAudio = z3;
        this.keepOriginalResolution = z4;
        this.videoHeight = d;
        this.videoWidth = d2;
        this.videoNames = videoNames;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Configuration copy$default(Configuration configuration, VideoQuality videoQuality, boolean z2, Integer num, boolean z3, boolean z4, Double d, Double d2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            videoQuality = configuration.quality;
        }
        if ((i & 2) != 0) {
            z2 = configuration.isMinBitrateCheckEnabled;
        }
        if ((i & 4) != 0) {
            num = configuration.videoBitrateInMbps;
        }
        if ((i & 8) != 0) {
            z3 = configuration.disableAudio;
        }
        if ((i & 16) != 0) {
            z4 = configuration.keepOriginalResolution;
        }
        if ((i & 32) != 0) {
            d = configuration.videoHeight;
        }
        if ((i & 64) != 0) {
            d2 = configuration.videoWidth;
        }
        if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
            list = configuration.videoNames;
        }
        Double d3 = d2;
        List list2 = list;
        boolean z5 = z4;
        Double d4 = d;
        return configuration.copy(videoQuality, z2, num, z3, z5, d4, d3, list2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final VideoQuality getQuality() {
        return this.quality;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsMinBitrateCheckEnabled() {
        return this.isMinBitrateCheckEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getVideoBitrateInMbps() {
        return this.videoBitrateInMbps;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getDisableAudio() {
        return this.disableAudio;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getKeepOriginalResolution() {
        return this.keepOriginalResolution;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Double getVideoHeight() {
        return this.videoHeight;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Double getVideoWidth() {
        return this.videoWidth;
    }

    @NotNull
    public final List<String> component8() {
        return this.videoNames;
    }

    @NotNull
    public final Configuration copy(@NotNull VideoQuality quality, boolean isMinBitrateCheckEnabled, @Nullable Integer videoBitrateInMbps, boolean disableAudio, boolean keepOriginalResolution, @Nullable Double videoHeight, @Nullable Double videoWidth, @NotNull List<String> videoNames) {
        Intrinsics.m18599g(quality, "quality");
        Intrinsics.m18599g(videoNames, "videoNames");
        return new Configuration(quality, isMinBitrateCheckEnabled, videoBitrateInMbps, disableAudio, keepOriginalResolution, videoHeight, videoWidth, videoNames);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Configuration)) {
            return false;
        }
        Configuration configuration = (Configuration) other;
        return this.quality == configuration.quality && this.isMinBitrateCheckEnabled == configuration.isMinBitrateCheckEnabled && Intrinsics.m18594b(this.videoBitrateInMbps, configuration.videoBitrateInMbps) && this.disableAudio == configuration.disableAudio && this.keepOriginalResolution == configuration.keepOriginalResolution && Intrinsics.m18594b(this.videoHeight, configuration.videoHeight) && Intrinsics.m18594b(this.videoWidth, configuration.videoWidth) && Intrinsics.m18594b(this.videoNames, configuration.videoNames);
    }

    public final boolean getDisableAudio() {
        return this.disableAudio;
    }

    public final boolean getKeepOriginalResolution() {
        return this.keepOriginalResolution;
    }

    @NotNull
    public final VideoQuality getQuality() {
        return this.quality;
    }

    @Nullable
    public final Integer getVideoBitrateInMbps() {
        return this.videoBitrateInMbps;
    }

    @Nullable
    public final Double getVideoHeight() {
        return this.videoHeight;
    }

    @NotNull
    public final List<String> getVideoNames() {
        return this.videoNames;
    }

    @Nullable
    public final Double getVideoWidth() {
        return this.videoWidth;
    }

    public int hashCode() {
        int iM2230e = AbstractC0455a.m2230e(this.quality.hashCode() * 31, 31, this.isMinBitrateCheckEnabled);
        Integer num = this.videoBitrateInMbps;
        int iM2230e2 = AbstractC0455a.m2230e(AbstractC0455a.m2230e((iM2230e + (num == null ? 0 : num.hashCode())) * 31, 31, this.disableAudio), 31, this.keepOriginalResolution);
        Double d = this.videoHeight;
        int iHashCode = (iM2230e2 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.videoWidth;
        return this.videoNames.hashCode() + ((iHashCode + (d2 != null ? d2.hashCode() : 0)) * 31);
    }

    public final boolean isMinBitrateCheckEnabled() {
        return this.isMinBitrateCheckEnabled;
    }

    public final void setDisableAudio(boolean z2) {
        this.disableAudio = z2;
    }

    public final void setMinBitrateCheckEnabled(boolean z2) {
        this.isMinBitrateCheckEnabled = z2;
    }

    public final void setQuality(@NotNull VideoQuality videoQuality) {
        Intrinsics.m18599g(videoQuality, "<set-?>");
        this.quality = videoQuality;
    }

    public final void setVideoBitrateInMbps(@Nullable Integer num) {
        this.videoBitrateInMbps = num;
    }

    public final void setVideoHeight(@Nullable Double d) {
        this.videoHeight = d;
    }

    public final void setVideoNames(@NotNull List<String> list) {
        Intrinsics.m18599g(list, "<set-?>");
        this.videoNames = list;
    }

    public final void setVideoWidth(@Nullable Double d) {
        this.videoWidth = d;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Configuration(quality=");
        sb.append(this.quality);
        sb.append(", isMinBitrateCheckEnabled=");
        sb.append(this.isMinBitrateCheckEnabled);
        sb.append(", videoBitrateInMbps=");
        sb.append(this.videoBitrateInMbps);
        sb.append(", disableAudio=");
        sb.append(this.disableAudio);
        sb.append(", keepOriginalResolution=");
        sb.append(this.keepOriginalResolution);
        sb.append(", videoHeight=");
        sb.append(this.videoHeight);
        sb.append(", videoWidth=");
        sb.append(this.videoWidth);
        sb.append(", videoNames=");
        return AbstractC0455a.m2242q(sb, this.videoNames, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Configuration(VideoQuality videoQuality, boolean z2, Integer num, boolean z3, boolean z4, Double d, Double d2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Double d3;
        List list2;
        boolean z5;
        Double d4;
        Integer num2;
        boolean z6;
        VideoQuality videoQuality2;
        videoQuality = (i & 1) != 0 ? VideoQuality.MEDIUM : videoQuality;
        z2 = (i & 2) != 0 ? true : z2;
        num = (i & 4) != 0 ? null : num;
        z3 = (i & 8) != 0 ? false : z3;
        z4 = (i & 16) != 0 ? false : z4;
        d = (i & 32) != 0 ? null : d;
        if ((i & 64) != 0) {
            d3 = null;
            z5 = z4;
            list2 = list;
            num2 = num;
            d4 = d;
            videoQuality2 = videoQuality;
            z6 = z3;
        } else {
            d3 = d2;
            list2 = list;
            z5 = z4;
            d4 = d;
            num2 = num;
            z6 = z3;
            videoQuality2 = videoQuality;
        }
        this(videoQuality2, z2, num2, z6, z5, d4, d3, list2);
    }
}
