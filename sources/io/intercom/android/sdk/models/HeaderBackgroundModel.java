package io.intercom.android.sdk.models;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@kotlin.Metadata(m18301d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u000bHÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001eJ\t\u0010,\u001a\u00020\u000eHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010.\u001a\u00020\u000bHÆ\u0003J\u0096\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000bHÇ\u0001¢\u0006\u0002\u00100J\u0013\u00101\u001a\u00020\u000b2\b\u00102\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u00103\u001a\u000204H×\u0001J\t\u00105\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0016\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001c¨\u00066"}, m18302d2 = {"Lio/intercom/android/sdk/models/HeaderBackgroundModel;", "", "color", "", "colorDark", "gradient", "", "gradientDark", "imageUrl", "imageDarkUrl", "fade", "", "fadeToDark", "type", "Lio/intercom/android/sdk/models/HeaderBackdropType;", "typeDark", "enabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Lio/intercom/android/sdk/models/HeaderBackdropType;Lio/intercom/android/sdk/models/HeaderBackdropType;Z)V", "getColor", "()Ljava/lang/String;", "getColorDark", "getGradient", "()Ljava/util/List;", "getGradientDark", "getImageUrl", "getImageDarkUrl", "getFade", "()Z", "getFadeToDark", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getType", "()Lio/intercom/android/sdk/models/HeaderBackdropType;", "getTypeDark", "getEnabled", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Lio/intercom/android/sdk/models/HeaderBackdropType;Lio/intercom/android/sdk/models/HeaderBackdropType;Z)Lio/intercom/android/sdk/models/HeaderBackgroundModel;", "equals", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final /* data */ class HeaderBackgroundModel {
    public static final int $stable = 8;

    @SerializedName("color")
    @NotNull
    private final String color;

    @SerializedName("color_dark")
    @Nullable
    private final String colorDark;

    @SerializedName("enabled")
    private final boolean enabled;

    @SerializedName("fade_to_white")
    private final boolean fade;

    @SerializedName("fade_to_dark")
    @Nullable
    private final Boolean fadeToDark;

    @SerializedName("gradient")
    @Nullable
    private final List<String> gradient;

    @SerializedName("gradient_dark")
    @Nullable
    private final List<String> gradientDark;

    @SerializedName("image_dark_url")
    @Nullable
    private final String imageDarkUrl;

    @SerializedName("image_url")
    @Nullable
    private final String imageUrl;

    @SerializedName("type")
    @NotNull
    private final HeaderBackdropType type;

    @SerializedName("type_dark")
    @Nullable
    private final HeaderBackdropType typeDark;

    public HeaderBackgroundModel() {
        this(null, null, null, null, null, null, false, null, null, null, false, 2047, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HeaderBackgroundModel copy$default(HeaderBackgroundModel headerBackgroundModel, String str, String str2, List list, List list2, String str3, String str4, boolean z2, Boolean bool, HeaderBackdropType headerBackdropType, HeaderBackdropType headerBackdropType2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = headerBackgroundModel.color;
        }
        if ((i & 2) != 0) {
            str2 = headerBackgroundModel.colorDark;
        }
        if ((i & 4) != 0) {
            list = headerBackgroundModel.gradient;
        }
        if ((i & 8) != 0) {
            list2 = headerBackgroundModel.gradientDark;
        }
        if ((i & 16) != 0) {
            str3 = headerBackgroundModel.imageUrl;
        }
        if ((i & 32) != 0) {
            str4 = headerBackgroundModel.imageDarkUrl;
        }
        if ((i & 64) != 0) {
            z2 = headerBackgroundModel.fade;
        }
        if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
            bool = headerBackgroundModel.fadeToDark;
        }
        if ((i & 256) != 0) {
            headerBackdropType = headerBackgroundModel.type;
        }
        if ((i & 512) != 0) {
            headerBackdropType2 = headerBackgroundModel.typeDark;
        }
        if ((i & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            z3 = headerBackgroundModel.enabled;
        }
        HeaderBackdropType headerBackdropType3 = headerBackdropType2;
        boolean z4 = z3;
        Boolean bool2 = bool;
        HeaderBackdropType headerBackdropType4 = headerBackdropType;
        String str5 = str4;
        boolean z5 = z2;
        String str6 = str3;
        List list3 = list;
        return headerBackgroundModel.copy(str, str2, list3, list2, str6, str5, z5, bool2, headerBackdropType4, headerBackdropType3, z4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final HeaderBackdropType getTypeDark() {
        return this.typeDark;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getColorDark() {
        return this.colorDark;
    }

    @Nullable
    public final List<String> component3() {
        return this.gradient;
    }

    @Nullable
    public final List<String> component4() {
        return this.gradientDark;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getImageDarkUrl() {
        return this.imageDarkUrl;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getFade() {
        return this.fade;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getFadeToDark() {
        return this.fadeToDark;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final HeaderBackdropType getType() {
        return this.type;
    }

    @NotNull
    public final HeaderBackgroundModel copy(@NotNull String color, @Nullable String colorDark, @Nullable List<String> gradient, @Nullable List<String> gradientDark, @Nullable String imageUrl, @Nullable String imageDarkUrl, boolean fade, @Nullable Boolean fadeToDark, @NotNull HeaderBackdropType type, @Nullable HeaderBackdropType typeDark, boolean enabled) {
        Intrinsics.m18599g(color, "color");
        Intrinsics.m18599g(type, "type");
        return new HeaderBackgroundModel(color, colorDark, gradient, gradientDark, imageUrl, imageDarkUrl, fade, fadeToDark, type, typeDark, enabled);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeaderBackgroundModel)) {
            return false;
        }
        HeaderBackgroundModel headerBackgroundModel = (HeaderBackgroundModel) other;
        return Intrinsics.m18594b(this.color, headerBackgroundModel.color) && Intrinsics.m18594b(this.colorDark, headerBackgroundModel.colorDark) && Intrinsics.m18594b(this.gradient, headerBackgroundModel.gradient) && Intrinsics.m18594b(this.gradientDark, headerBackgroundModel.gradientDark) && Intrinsics.m18594b(this.imageUrl, headerBackgroundModel.imageUrl) && Intrinsics.m18594b(this.imageDarkUrl, headerBackgroundModel.imageDarkUrl) && this.fade == headerBackgroundModel.fade && Intrinsics.m18594b(this.fadeToDark, headerBackgroundModel.fadeToDark) && this.type == headerBackgroundModel.type && this.typeDark == headerBackgroundModel.typeDark && this.enabled == headerBackgroundModel.enabled;
    }

    @NotNull
    public final String getColor() {
        return this.color;
    }

    @Nullable
    public final String getColorDark() {
        return this.colorDark;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final boolean getFade() {
        return this.fade;
    }

    @Nullable
    public final Boolean getFadeToDark() {
        return this.fadeToDark;
    }

    @Nullable
    public final List<String> getGradient() {
        return this.gradient;
    }

    @Nullable
    public final List<String> getGradientDark() {
        return this.gradientDark;
    }

    @Nullable
    public final String getImageDarkUrl() {
        return this.imageDarkUrl;
    }

    @Nullable
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    public final HeaderBackdropType getType() {
        return this.type;
    }

    @Nullable
    public final HeaderBackdropType getTypeDark() {
        return this.typeDark;
    }

    public int hashCode() {
        int iHashCode = this.color.hashCode() * 31;
        String str = this.colorDark;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.gradient;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.gradientDark;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.imageUrl;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.imageDarkUrl;
        int iM2230e = AbstractC0455a.m2230e((iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.fade);
        Boolean bool = this.fadeToDark;
        int iHashCode6 = (this.type.hashCode() + ((iM2230e + (bool == null ? 0 : bool.hashCode())) * 31)) * 31;
        HeaderBackdropType headerBackdropType = this.typeDark;
        return Boolean.hashCode(this.enabled) + ((iHashCode6 + (headerBackdropType != null ? headerBackdropType.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("HeaderBackgroundModel(color=");
        sb.append(this.color);
        sb.append(", colorDark=");
        sb.append(this.colorDark);
        sb.append(", gradient=");
        sb.append(this.gradient);
        sb.append(", gradientDark=");
        sb.append(this.gradientDark);
        sb.append(", imageUrl=");
        sb.append(this.imageUrl);
        sb.append(", imageDarkUrl=");
        sb.append(this.imageDarkUrl);
        sb.append(", fade=");
        sb.append(this.fade);
        sb.append(", fadeToDark=");
        sb.append(this.fadeToDark);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", typeDark=");
        sb.append(this.typeDark);
        sb.append(", enabled=");
        return AbstractC0455a.m2243r(sb, this.enabled, ')');
    }

    public HeaderBackgroundModel(@NotNull String color, @Nullable String str, @Nullable List<String> list, @Nullable List<String> list2, @Nullable String str2, @Nullable String str3, boolean z2, @Nullable Boolean bool, @NotNull HeaderBackdropType type, @Nullable HeaderBackdropType headerBackdropType, boolean z3) {
        Intrinsics.m18599g(color, "color");
        Intrinsics.m18599g(type, "type");
        this.color = color;
        this.colorDark = str;
        this.gradient = list;
        this.gradientDark = list2;
        this.imageUrl = str2;
        this.imageDarkUrl = str3;
        this.fade = z2;
        this.fadeToDark = bool;
        this.type = type;
        this.typeDark = headerBackdropType;
        this.enabled = z3;
    }

    public /* synthetic */ HeaderBackgroundModel(String str, String str2, List list, List list2, String str3, String str4, boolean z2, Boolean bool, HeaderBackdropType headerBackdropType, HeaderBackdropType headerBackdropType2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "#FFFFFF" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? true : z2, (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? null : bool, (i & 256) != 0 ? HeaderBackdropType.SOLID : headerBackdropType, (i & 512) != 0 ? null : headerBackdropType2, (i & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? false : z3);
    }
}
