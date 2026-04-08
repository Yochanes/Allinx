package io.intercom.android.sdk.survey.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÇ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0018\u001a\u00020\u0019H×\u0001J\t\u0010\u001a\u001a\u00020\u0003H×\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m18302d2 = {"Lio/intercom/android/sdk/survey/model/SurveySenderData;", "", "firstName", "", "name", "initials", "avatar", "Lio/intercom/android/sdk/survey/model/SurveySenderAvatar;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/survey/model/SurveySenderAvatar;)V", "getFirstName", "()Ljava/lang/String;", "getName", "getInitials", "getAvatar", "()Lio/intercom/android/sdk/survey/model/SurveySenderAvatar;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final /* data */ class SurveySenderData {
    public static final int $stable = 0;

    @SerializedName("avatar")
    @Nullable
    private final SurveySenderAvatar avatar;

    @SerializedName("first_name")
    @Nullable
    private final String firstName;

    @SerializedName("initial")
    @Nullable
    private final String initials;

    @SerializedName("name")
    @Nullable
    private final String name;

    public SurveySenderData() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ SurveySenderData copy$default(SurveySenderData surveySenderData, String str, String str2, String str3, SurveySenderAvatar surveySenderAvatar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = surveySenderData.firstName;
        }
        if ((i & 2) != 0) {
            str2 = surveySenderData.name;
        }
        if ((i & 4) != 0) {
            str3 = surveySenderData.initials;
        }
        if ((i & 8) != 0) {
            surveySenderAvatar = surveySenderData.avatar;
        }
        return surveySenderData.copy(str, str2, str3, surveySenderAvatar);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getInitials() {
        return this.initials;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SurveySenderAvatar getAvatar() {
        return this.avatar;
    }

    @NotNull
    public final SurveySenderData copy(@Nullable String firstName, @Nullable String name, @Nullable String initials, @Nullable SurveySenderAvatar avatar) {
        return new SurveySenderData(firstName, name, initials, avatar);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SurveySenderData)) {
            return false;
        }
        SurveySenderData surveySenderData = (SurveySenderData) other;
        return Intrinsics.m18594b(this.firstName, surveySenderData.firstName) && Intrinsics.m18594b(this.name, surveySenderData.name) && Intrinsics.m18594b(this.initials, surveySenderData.initials) && Intrinsics.m18594b(this.avatar, surveySenderData.avatar);
    }

    @Nullable
    public final SurveySenderAvatar getAvatar() {
        return this.avatar;
    }

    @Nullable
    public final String getFirstName() {
        return this.firstName;
    }

    @Nullable
    public final String getInitials() {
        return this.initials;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.firstName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.initials;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        SurveySenderAvatar surveySenderAvatar = this.avatar;
        return iHashCode3 + (surveySenderAvatar != null ? surveySenderAvatar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SurveySenderData(firstName=" + this.firstName + ", name=" + this.name + ", initials=" + this.initials + ", avatar=" + this.avatar + ')';
    }

    public SurveySenderData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable SurveySenderAvatar surveySenderAvatar) {
        this.firstName = str;
        this.name = str2;
        this.initials = str3;
        this.avatar = surveySenderAvatar;
    }

    public /* synthetic */ SurveySenderData(String str, String str2, String str3, SurveySenderAvatar surveySenderAvatar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : surveySenderAvatar);
    }
}
