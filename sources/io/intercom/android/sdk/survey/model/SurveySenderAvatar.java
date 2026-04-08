package io.intercom.android.sdk.survey.model;

import androidx.compose.animation.AbstractC0455a;
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
@Metadata(m18301d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\r\u001a\u00020\u000eH×\u0001J\t\u0010\u000f\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m18302d2 = {"Lio/intercom/android/sdk/survey/model/SurveySenderAvatar;", "", "squareImg128", "", "<init>", "(Ljava/lang/String;)V", "getSquareImg128", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final /* data */ class SurveySenderAvatar {
    public static final int $stable = 0;

    @SerializedName("square_128")
    @NotNull
    private final String squareImg128;

    public SurveySenderAvatar() {
        this(null, 1, null);
    }

    public static /* synthetic */ SurveySenderAvatar copy$default(SurveySenderAvatar surveySenderAvatar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = surveySenderAvatar.squareImg128;
        }
        return surveySenderAvatar.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSquareImg128() {
        return this.squareImg128;
    }

    @NotNull
    public final SurveySenderAvatar copy(@NotNull String squareImg128) {
        Intrinsics.m18599g(squareImg128, "squareImg128");
        return new SurveySenderAvatar(squareImg128);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SurveySenderAvatar) && Intrinsics.m18594b(this.squareImg128, ((SurveySenderAvatar) other).squareImg128);
    }

    @NotNull
    public final String getSquareImg128() {
        return this.squareImg128;
    }

    public int hashCode() {
        return this.squareImg128.hashCode();
    }

    @NotNull
    public String toString() {
        return AbstractC0455a.m2241p(new StringBuilder("SurveySenderAvatar(squareImg128="), this.squareImg128, ')');
    }

    public SurveySenderAvatar(@NotNull String squareImg128) {
        Intrinsics.m18599g(squareImg128, "squareImg128");
        this.squareImg128 = squareImg128;
    }

    public /* synthetic */ SurveySenderAvatar(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
