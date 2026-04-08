package io.intercom.android.sdk.models;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import io.intercom.android.sdk.models.Avatar;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@kotlin.Metadata(m18301d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÇ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0016H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m18302d2 = {"Lio/intercom/android/sdk/models/AvatarDetails;", "", "avatarType", "Lio/intercom/android/sdk/models/AvatarType;", "avatars", "", "Lio/intercom/android/sdk/models/Avatar$Builder;", "<init>", "(Lio/intercom/android/sdk/models/AvatarType;Ljava/util/List;)V", "getAvatarType", "()Lio/intercom/android/sdk/models/AvatarType;", "getAvatars", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final /* data */ class AvatarDetails {
    public static final int $stable = 8;

    @SerializedName("avatar_type")
    @NotNull
    private final AvatarType avatarType;

    @SerializedName("avatars")
    @NotNull
    private final List<Avatar.Builder> avatars;

    public AvatarDetails(@NotNull AvatarType avatarType, @NotNull List<Avatar.Builder> avatars) {
        Intrinsics.m18599g(avatarType, "avatarType");
        Intrinsics.m18599g(avatars, "avatars");
        this.avatarType = avatarType;
        this.avatars = avatars;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AvatarDetails copy$default(AvatarDetails avatarDetails, AvatarType avatarType, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            avatarType = avatarDetails.avatarType;
        }
        if ((i & 2) != 0) {
            list = avatarDetails.avatars;
        }
        return avatarDetails.copy(avatarType, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AvatarType getAvatarType() {
        return this.avatarType;
    }

    @NotNull
    public final List<Avatar.Builder> component2() {
        return this.avatars;
    }

    @NotNull
    public final AvatarDetails copy(@NotNull AvatarType avatarType, @NotNull List<Avatar.Builder> avatars) {
        Intrinsics.m18599g(avatarType, "avatarType");
        Intrinsics.m18599g(avatars, "avatars");
        return new AvatarDetails(avatarType, avatars);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvatarDetails)) {
            return false;
        }
        AvatarDetails avatarDetails = (AvatarDetails) other;
        return this.avatarType == avatarDetails.avatarType && Intrinsics.m18594b(this.avatars, avatarDetails.avatars);
    }

    @NotNull
    public final AvatarType getAvatarType() {
        return this.avatarType;
    }

    @NotNull
    public final List<Avatar.Builder> getAvatars() {
        return this.avatars;
    }

    public int hashCode() {
        return this.avatars.hashCode() + (this.avatarType.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("AvatarDetails(avatarType=");
        sb.append(this.avatarType);
        sb.append(", avatars=");
        return AbstractC0455a.m2242q(sb, this.avatars, ')');
    }
}
