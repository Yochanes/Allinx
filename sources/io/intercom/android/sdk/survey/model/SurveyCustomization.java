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
@Metadata(m18301d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0010\u001a\u00020\u0011H×\u0001J\t\u0010\u0012\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m18302d2 = {"Lio/intercom/android/sdk/survey/model/SurveyCustomization;", "", "backgroundColor", "", "buttonColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getBackgroundColor", "()Ljava/lang/String;", "getButtonColor", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final /* data */ class SurveyCustomization {
    public static final int $stable = 0;

    @SerializedName("background_color")
    @NotNull
    private final String backgroundColor;

    @SerializedName("button_color")
    @NotNull
    private final String buttonColor;

    public SurveyCustomization() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ SurveyCustomization copy$default(SurveyCustomization surveyCustomization, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = surveyCustomization.backgroundColor;
        }
        if ((i & 2) != 0) {
            str2 = surveyCustomization.buttonColor;
        }
        return surveyCustomization.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getButtonColor() {
        return this.buttonColor;
    }

    @NotNull
    public final SurveyCustomization copy(@NotNull String backgroundColor, @NotNull String buttonColor) {
        Intrinsics.m18599g(backgroundColor, "backgroundColor");
        Intrinsics.m18599g(buttonColor, "buttonColor");
        return new SurveyCustomization(backgroundColor, buttonColor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SurveyCustomization)) {
            return false;
        }
        SurveyCustomization surveyCustomization = (SurveyCustomization) other;
        return Intrinsics.m18594b(this.backgroundColor, surveyCustomization.backgroundColor) && Intrinsics.m18594b(this.buttonColor, surveyCustomization.buttonColor);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final String getButtonColor() {
        return this.buttonColor;
    }

    public int hashCode() {
        return this.buttonColor.hashCode() + (this.backgroundColor.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("SurveyCustomization(backgroundColor=");
        sb.append(this.backgroundColor);
        sb.append(", buttonColor=");
        return AbstractC0455a.m2241p(sb, this.buttonColor, ')');
    }

    public SurveyCustomization(@NotNull String backgroundColor, @NotNull String buttonColor) {
        Intrinsics.m18599g(backgroundColor, "backgroundColor");
        Intrinsics.m18599g(buttonColor, "buttonColor");
        this.backgroundColor = backgroundColor;
        this.buttonColor = buttonColor;
    }

    public /* synthetic */ SurveyCustomization(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "#FFFFFF" : str, (i & 2) != 0 ? "#000000" : str2);
    }
}
