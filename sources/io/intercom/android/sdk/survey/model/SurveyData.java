package io.intercom.android.sdk.survey.model;

import androidx.annotation.StringRes;
import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.p041ui.common.StringProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0081\b\u0018\u0000 :2\u00020\u0001:\u00056789:BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\nHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010.\u001a\u00020\u000eHÆ\u0003J\t\u0010/\u001a\u00020\u0010HÆ\u0003J\t\u00100\u001a\u00020\u0010HÆ\u0003Jk\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÇ\u0001J\u0013\u00102\u001a\u00020\u00102\b\u00103\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u00104\u001a\u00020\u000eH×\u0001J\t\u00105\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010 R\u0016\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\"\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010&\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b'\u0010\u0015¨\u0006;"}, m18302d2 = {"Lio/intercom/android/sdk/survey/model/SurveyData;", "", "_format", "", "id", "steps", "", "Lio/intercom/android/sdk/survey/model/SurveyData$Step;", "surveyProgressId", "customization", "Lio/intercom/android/sdk/survey/model/SurveyCustomization;", "sender", "Lio/intercom/android/sdk/survey/model/SurveySenderData;", "stepCount", "", "isDismissible", "", "showProgressBar", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lio/intercom/android/sdk/survey/model/SurveyCustomization;Lio/intercom/android/sdk/survey/model/SurveySenderData;IZZ)V", "get_format", "()Ljava/lang/String;", "getId", "getSteps", "()Ljava/util/List;", "getSurveyProgressId", "getCustomization", "()Lio/intercom/android/sdk/survey/model/SurveyCustomization;", "getSender", "()Lio/intercom/android/sdk/survey/model/SurveySenderData;", "getStepCount", "()I", "()Z", "getShowProgressBar", "format", "Lio/intercom/android/sdk/survey/model/SurveyData$SurveyFormat;", "getFormat", "()Lio/intercom/android/sdk/survey/model/SurveyData$SurveyFormat;", "formatMetric", "getFormatMetric", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "StepType", "SurveyFormat", "SurveyActions", "Step", "Companion", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final /* data */ class SurveyData {

    @SerializedName("format")
    @NotNull
    private final String _format;

    @SerializedName("customization_options")
    @NotNull
    private final SurveyCustomization customization;

    @SerializedName("id")
    @NotNull
    private final String id;

    @SerializedName("dismissible")
    private final boolean isDismissible;

    @SerializedName("sender")
    @Nullable
    private final SurveySenderData sender;

    @SerializedName("show_progress_bar")
    private final boolean showProgressBar;

    @SerializedName("step_count")
    private final int stepCount;

    @SerializedName("steps")
    @NotNull
    private final List<Step> steps;

    @SerializedName("survey_progress_id")
    @NotNull
    private final String surveyProgressId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final SurveyData NULL = new SurveyData("1", "", EmptyList.f51496a, "0", new SurveyCustomization(null, null, 3, null), new SurveySenderData(null, null, null, null, 15, null), 0, true, false, 256, null);

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m18302d2 = {"Lio/intercom/android/sdk/survey/model/SurveyData$Companion;", "", "<init>", "()V", "NULL", "Lio/intercom/android/sdk/survey/model/SurveyData;", "getNULL", "()Lio/intercom/android/sdk/survey/model/SurveyData;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SurveyData getNULL() {
            return SurveyData.access$getNULL$cp();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m18302d2 = {"Lio/intercom/android/sdk/survey/model/SurveyData$StepType;", "", "<init>", "(Ljava/lang/String;I)V", "CONTENT", "QUESTION", "INTRO", "THANK_YOU", "UNSUPPORTED", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class StepType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ StepType[] $VALUES;
        public static final StepType CONTENT = new StepType("CONTENT", 0);
        public static final StepType QUESTION = new StepType("QUESTION", 1);
        public static final StepType INTRO = new StepType("INTRO", 2);
        public static final StepType THANK_YOU = new StepType("THANK_YOU", 3);
        public static final StepType UNSUPPORTED = new StepType("UNSUPPORTED", 4);

        private static final /* synthetic */ StepType[] $values() {
            return new StepType[]{CONTENT, QUESTION, INTRO, THANK_YOU, UNSUPPORTED};
        }

        static {
            StepType[] stepTypeArr$values = $values();
            $VALUES = stepTypeArr$values;
            $ENTRIES = EnumEntriesKt.m18563a(stepTypeArr$values);
        }

        private StepType(String str, int i) {
        }

        @NotNull
        public static EnumEntries<StepType> getEntries() {
            return $ENTRIES;
        }

        public static StepType valueOf(String str) {
            return (StepType) Enum.valueOf(StepType.class, str);
        }

        public static StepType[] values() {
            return (StepType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m18302d2 = {"Lio/intercom/android/sdk/survey/model/SurveyData$SurveyFormat;", "", "<init>", "(Ljava/lang/String;I)V", "SMALL_FORMAT", "LARGE_FORMAT", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class SurveyFormat {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SurveyFormat[] $VALUES;
        public static final SurveyFormat SMALL_FORMAT = new SurveyFormat("SMALL_FORMAT", 0);
        public static final SurveyFormat LARGE_FORMAT = new SurveyFormat("LARGE_FORMAT", 1);

        private static final /* synthetic */ SurveyFormat[] $values() {
            return new SurveyFormat[]{SMALL_FORMAT, LARGE_FORMAT};
        }

        static {
            SurveyFormat[] surveyFormatArr$values = $values();
            $VALUES = surveyFormatArr$values;
            $ENTRIES = EnumEntriesKt.m18563a(surveyFormatArr$values);
        }

        private SurveyFormat(String str, int i) {
        }

        @NotNull
        public static EnumEntries<SurveyFormat> getEntries() {
            return $ENTRIES;
        }

        public static SurveyFormat valueOf(String str) {
            return (SurveyFormat) Enum.valueOf(SurveyFormat.class, str);
        }

        public static SurveyFormat[] values() {
            return (SurveyFormat[]) $VALUES.clone();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SurveyFormat.values().length];
            try {
                iArr[SurveyFormat.SMALL_FORMAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SurveyFormat.LARGE_FORMAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SurveyData(@NotNull String _format, @NotNull String id, @NotNull List<Step> steps, @NotNull String surveyProgressId, @NotNull SurveyCustomization customization, @Nullable SurveySenderData surveySenderData, int i, boolean z2, boolean z3) {
        Intrinsics.m18599g(_format, "_format");
        Intrinsics.m18599g(id, "id");
        Intrinsics.m18599g(steps, "steps");
        Intrinsics.m18599g(surveyProgressId, "surveyProgressId");
        Intrinsics.m18599g(customization, "customization");
        this._format = _format;
        this.id = id;
        this.steps = steps;
        this.surveyProgressId = surveyProgressId;
        this.customization = customization;
        this.sender = surveySenderData;
        this.stepCount = i;
        this.isDismissible = z2;
        this.showProgressBar = z3;
    }

    public static final /* synthetic */ SurveyData access$getNULL$cp() {
        return NULL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SurveyData copy$default(SurveyData surveyData, String str, String str2, List list, String str3, SurveyCustomization surveyCustomization, SurveySenderData surveySenderData, int i, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = surveyData._format;
        }
        if ((i2 & 2) != 0) {
            str2 = surveyData.id;
        }
        if ((i2 & 4) != 0) {
            list = surveyData.steps;
        }
        if ((i2 & 8) != 0) {
            str3 = surveyData.surveyProgressId;
        }
        if ((i2 & 16) != 0) {
            surveyCustomization = surveyData.customization;
        }
        if ((i2 & 32) != 0) {
            surveySenderData = surveyData.sender;
        }
        if ((i2 & 64) != 0) {
            i = surveyData.stepCount;
        }
        if ((i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
            z2 = surveyData.isDismissible;
        }
        if ((i2 & 256) != 0) {
            z3 = surveyData.showProgressBar;
        }
        boolean z4 = z2;
        boolean z5 = z3;
        SurveySenderData surveySenderData2 = surveySenderData;
        int i3 = i;
        SurveyCustomization surveyCustomization2 = surveyCustomization;
        List list2 = list;
        return surveyData.copy(str, str2, list2, str3, surveyCustomization2, surveySenderData2, i3, z4, z5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String get_format() {
        return this._format;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final List<Step> component3() {
        return this.steps;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSurveyProgressId() {
        return this.surveyProgressId;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final SurveyCustomization getCustomization() {
        return this.customization;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final SurveySenderData getSender() {
        return this.sender;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getStepCount() {
        return this.stepCount;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsDismissible() {
        return this.isDismissible;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getShowProgressBar() {
        return this.showProgressBar;
    }

    @NotNull
    public final SurveyData copy(@NotNull String _format, @NotNull String id, @NotNull List<Step> steps, @NotNull String surveyProgressId, @NotNull SurveyCustomization customization, @Nullable SurveySenderData sender, int stepCount, boolean isDismissible, boolean showProgressBar) {
        Intrinsics.m18599g(_format, "_format");
        Intrinsics.m18599g(id, "id");
        Intrinsics.m18599g(steps, "steps");
        Intrinsics.m18599g(surveyProgressId, "surveyProgressId");
        Intrinsics.m18599g(customization, "customization");
        return new SurveyData(_format, id, steps, surveyProgressId, customization, sender, stepCount, isDismissible, showProgressBar);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SurveyData)) {
            return false;
        }
        SurveyData surveyData = (SurveyData) other;
        return Intrinsics.m18594b(this._format, surveyData._format) && Intrinsics.m18594b(this.id, surveyData.id) && Intrinsics.m18594b(this.steps, surveyData.steps) && Intrinsics.m18594b(this.surveyProgressId, surveyData.surveyProgressId) && Intrinsics.m18594b(this.customization, surveyData.customization) && Intrinsics.m18594b(this.sender, surveyData.sender) && this.stepCount == surveyData.stepCount && this.isDismissible == surveyData.isDismissible && this.showProgressBar == surveyData.showProgressBar;
    }

    @NotNull
    public final SurveyCustomization getCustomization() {
        return this.customization;
    }

    @NotNull
    public final SurveyFormat getFormat() {
        return Integer.parseInt(this._format) == 0 ? SurveyFormat.SMALL_FORMAT : SurveyFormat.LARGE_FORMAT;
    }

    @NotNull
    public final String getFormatMetric() {
        int i = WhenMappings.$EnumSwitchMapping$0[getFormat().ordinal()];
        if (i == 1) {
            return "small_full_screen";
        }
        if (i == 2) {
            return "large_full_screen";
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final SurveySenderData getSender() {
        return this.sender;
    }

    public final boolean getShowProgressBar() {
        return this.showProgressBar;
    }

    public final int getStepCount() {
        return this.stepCount;
    }

    @NotNull
    public final List<Step> getSteps() {
        return this.steps;
    }

    @NotNull
    public final String getSurveyProgressId() {
        return this.surveyProgressId;
    }

    @NotNull
    public final String get_format() {
        return this._format;
    }

    public int hashCode() {
        int iHashCode = (this.customization.hashCode() + AbstractC0000a.m5b(AbstractC0455a.m2233h(this.steps, AbstractC0000a.m5b(this._format.hashCode() * 31, 31, this.id), 31), 31, this.surveyProgressId)) * 31;
        SurveySenderData surveySenderData = this.sender;
        return Boolean.hashCode(this.showProgressBar) + AbstractC0455a.m2230e(AbstractC0455a.m2228c(this.stepCount, (iHashCode + (surveySenderData == null ? 0 : surveySenderData.hashCode())) * 31, 31), 31, this.isDismissible);
    }

    public final boolean isDismissible() {
        return this.isDismissible;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("SurveyData(_format=");
        sb.append(this._format);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", steps=");
        sb.append(this.steps);
        sb.append(", surveyProgressId=");
        sb.append(this.surveyProgressId);
        sb.append(", customization=");
        sb.append(this.customization);
        sb.append(", sender=");
        sb.append(this.sender);
        sb.append(", stepCount=");
        sb.append(this.stepCount);
        sb.append(", isDismissible=");
        sb.append(this.isDismissible);
        sb.append(", showProgressBar=");
        return AbstractC0455a.m2243r(sb, this.showProgressBar, ')');
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0018\u001a\u00020\u0005H×\u0001J\t\u0010\u0019\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, m18302d2 = {"Lio/intercom/android/sdk/survey/model/SurveyData$SurveyActions;", "", "actionTitle", "", "id", "", "webUrl", "androidUri", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getActionTitle", "()Ljava/lang/String;", "getId", "()I", "getWebUrl", "getAndroidUri", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final /* data */ class SurveyActions {
        public static final int $stable = 0;

        @SerializedName("action_title")
        @NotNull
        private final String actionTitle;

        @SerializedName("android_uri")
        @Nullable
        private final String androidUri;

        @SerializedName("id")
        private final int id;

        @SerializedName("web_url")
        @Nullable
        private final String webUrl;

        public SurveyActions(@NotNull String actionTitle, int i, @Nullable String str, @Nullable String str2) {
            Intrinsics.m18599g(actionTitle, "actionTitle");
            this.actionTitle = actionTitle;
            this.id = i;
            this.webUrl = str;
            this.androidUri = str2;
        }

        public static /* synthetic */ SurveyActions copy$default(SurveyActions surveyActions, String str, int i, String str2, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = surveyActions.actionTitle;
            }
            if ((i2 & 2) != 0) {
                i = surveyActions.id;
            }
            if ((i2 & 4) != 0) {
                str2 = surveyActions.webUrl;
            }
            if ((i2 & 8) != 0) {
                str3 = surveyActions.androidUri;
            }
            return surveyActions.copy(str, i, str2, str3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getActionTitle() {
            return this.actionTitle;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getId() {
            return this.id;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getWebUrl() {
            return this.webUrl;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getAndroidUri() {
            return this.androidUri;
        }

        @NotNull
        public final SurveyActions copy(@NotNull String actionTitle, int id, @Nullable String webUrl, @Nullable String androidUri) {
            Intrinsics.m18599g(actionTitle, "actionTitle");
            return new SurveyActions(actionTitle, id, webUrl, androidUri);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SurveyActions)) {
                return false;
            }
            SurveyActions surveyActions = (SurveyActions) other;
            return Intrinsics.m18594b(this.actionTitle, surveyActions.actionTitle) && this.id == surveyActions.id && Intrinsics.m18594b(this.webUrl, surveyActions.webUrl) && Intrinsics.m18594b(this.androidUri, surveyActions.androidUri);
        }

        @NotNull
        public final String getActionTitle() {
            return this.actionTitle;
        }

        @Nullable
        public final String getAndroidUri() {
            return this.androidUri;
        }

        public final int getId() {
            return this.id;
        }

        @Nullable
        public final String getWebUrl() {
            return this.webUrl;
        }

        public int hashCode() {
            int iM2228c = AbstractC0455a.m2228c(this.id, this.actionTitle.hashCode() * 31, 31);
            String str = this.webUrl;
            int iHashCode = (iM2228c + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.androidUri;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("SurveyActions(actionTitle=");
            sb.append(this.actionTitle);
            sb.append(", id=");
            sb.append(this.id);
            sb.append(", webUrl=");
            sb.append(this.webUrl);
            sb.append(", androidUri=");
            return AbstractC0455a.m2241p(sb, this.androidUri, ')');
        }

        public /* synthetic */ SurveyActions(String str, int i, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001'BO\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÂ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003JY\u0010!\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006HÇ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010%\u001a\u00020\nH×\u0001J\t\u0010&\u001a\u00020\u0006H×\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0010\u0010\t\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006("}, m18302d2 = {"Lio/intercom/android/sdk/survey/model/SurveyData$Step;", "", "blocks", "", "Lio/intercom/android/sdk/blocks/lib/models/Block$Builder;", "id", "", "questions", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question;", "_type", "", "actions", "Lio/intercom/android/sdk/survey/model/SurveyData$SurveyActions;", "customButtonText", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;ILjava/util/List;Ljava/lang/String;)V", "getBlocks", "()Ljava/util/List;", "getId", "()Ljava/lang/String;", "getQuestions", "getActions", "getCustomButtonText", "type", "Lio/intercom/android/sdk/survey/model/SurveyData$StepType;", "getType", "()Lio/intercom/android/sdk/survey/model/SurveyData$StepType;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "Question", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final /* data */ class Step {
        public static final int $stable = 8;

        @SerializedName("step_type")
        private final int _type;

        @SerializedName("actions")
        @NotNull
        private final List<SurveyActions> actions;

        @SerializedName("blocks")
        @NotNull
        private final List<Block.Builder> blocks;

        @SerializedName("custom_button_text")
        @Nullable
        private final String customButtonText;

        @SerializedName("id")
        @NotNull
        private final String id;

        @SerializedName("questions")
        @NotNull
        private final List<Question> questions;

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @Metadata(m18301d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001:\r\u001d\u001e\u001f !\"#$%&'()B-\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0011\u001a\u00020\u0012J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÂ\u0003J\t\u0010\u0016\u001a\u00020\nHÂ\u0003J7\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÇ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001b\u001a\u00020\bH×\u0001J\t\u0010\u001c\u001a\u00020\u0006H×\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0007\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, m18302d2 = {"Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question;", "", "blocks", "", "Lio/intercom/android/sdk/blocks/lib/models/Block$Builder;", "id", "", "questionType", "", "questionData", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionData;", "<init>", "(Ljava/util/List;Ljava/lang/String;ILio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionData;)V", "getBlocks", "()Ljava/util/List;", "getId", "()Ljava/lang/String;", "getQuestionModel", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionModel;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "QuestionType", "QuestionValidation", "QuestionData", "QuestionModel", "DropDownQuestionModel", "SingleChoiceQuestionModel", "MultipleChoiceQuestionModel", "ShortTextQuestionModel", "DatePickerQuestionModel", "LongTextQuestionModel", "NumericRatingQuestionModel", "UploadFileQuestionModel", "UnsupportedQuestion", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
        @SourceDebugExtension
        public static final /* data */ class Question {
            public static final int $stable = 8;

            @SerializedName("blocks")
            @NotNull
            private final List<Block.Builder> blocks;

            @SerializedName("id")
            @NotNull
            private final String id;

            @SerializedName("data")
            @NotNull
            private final QuestionData questionData;

            @SerializedName("question_type")
            private final int questionType;

            /* JADX INFO: compiled from: Proguard */
            @StabilityInferred
            @Metadata(m18301d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m18302d2 = {"Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$DatePickerQuestionModel;", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionModel;", "id", "", "title", "", "Lio/intercom/android/sdk/blocks/lib/models/Block$Builder;", "isRequired", "", "<init>", "(Ljava/lang/String;Ljava/util/List;Z)V", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
            public static final class DatePickerQuestionModel extends QuestionModel {
                public static final int $stable = 0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public DatePickerQuestionModel(@NotNull String id, @NotNull List<Block.Builder> title, boolean z2) {
                    super(id, title, null, z2, 4, null);
                    Intrinsics.m18599g(id, "id");
                    Intrinsics.m18599g(title, "title");
                }
            }

            /* JADX INFO: compiled from: Proguard */
            @StabilityInferred
            @Metadata(m18301d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000e\u001a\u00020\u000f¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0010\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0015\u0010\u0011\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b \u0010\u0019¨\u0006!"}, m18302d2 = {"Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$LongTextQuestionModel;", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionModel;", "id", "", "title", "", "Lio/intercom/android/sdk/blocks/lib/models/Block$Builder;", "isRequired", "", "placeholder", "validationType", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionValidation$ValidationType;", "characterLimit", "", "minHeight", "Landroidx/compose/ui/unit/Dp;", "maxLine", "placeHolderStringRes", "<init>", "(Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionValidation$ValidationType;Ljava/lang/Integer;FILjava/lang/Integer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getPlaceholder", "()Ljava/lang/String;", "getValidationType", "()Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionValidation$ValidationType;", "getCharacterLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMinHeight-D9Ej5fM", "()F", "F", "getMaxLine", "()I", "getPlaceHolderStringRes", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
            public static final class LongTextQuestionModel extends QuestionModel {
                public static final int $stable = 0;

                @Nullable
                private final Integer characterLimit;
                private final int maxLine;
                private final float minHeight;

                @Nullable
                private final Integer placeHolderStringRes;

                @NotNull
                private final String placeholder;

                @NotNull
                private final QuestionValidation.ValidationType validationType;

                public /* synthetic */ LongTextQuestionModel(String str, List list, boolean z2, String str2, QuestionValidation.ValidationType validationType, Integer num, float f, int i, @StringRes Integer num2, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str, list, z2, str2, validationType, num, f, i, num2);
                }

                @Nullable
                public final Integer getCharacterLimit() {
                    return this.characterLimit;
                }

                public final int getMaxLine() {
                    return this.maxLine;
                }

                /* JADX INFO: renamed from: getMinHeight-D9Ej5fM, reason: not valid java name and from getter */
                public final float getMinHeight() {
                    return this.minHeight;
                }

                @Nullable
                public final Integer getPlaceHolderStringRes() {
                    return this.placeHolderStringRes;
                }

                @NotNull
                public final String getPlaceholder() {
                    return this.placeholder;
                }

                @NotNull
                public final QuestionValidation.ValidationType getValidationType() {
                    return this.validationType;
                }

                public /* synthetic */ LongTextQuestionModel(String str, List list, boolean z2, String str2, QuestionValidation.ValidationType validationType, Integer num, float f, int i, Integer num2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str, list, z2, (i2 & 8) != 0 ? "" : str2, validationType, num, (i2 & 64) != 0 ? Float.NaN : f, (i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? 6 : i, (i2 & 256) != 0 ? null : num2, null);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                private LongTextQuestionModel(String id, List<Block.Builder> title, boolean z2, String placeholder, QuestionValidation.ValidationType validationType, Integer num, float f, int i, Integer num2) {
                    super(id, title, null, z2, 4, null);
                    Intrinsics.m18599g(id, "id");
                    Intrinsics.m18599g(title, "title");
                    Intrinsics.m18599g(placeholder, "placeholder");
                    Intrinsics.m18599g(validationType, "validationType");
                    this.placeholder = placeholder;
                    this.validationType = validationType;
                    this.characterLimit = num;
                    this.minHeight = f;
                    this.maxLine = i;
                    this.placeHolderStringRes = num2;
                }
            }

            /* JADX INFO: compiled from: Proguard */
            @StabilityInferred
            @Metadata(m18301d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, m18302d2 = {"Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$MultipleChoiceQuestionModel;", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionModel;", "id", "", "title", "", "Lio/intercom/android/sdk/blocks/lib/models/Block$Builder;", "isRequired", "", "options", "includeOther", "minSelection", "", "maxSelection", "<init>", "(Ljava/lang/String;Ljava/util/List;ZLjava/util/List;ZII)V", "getOptions", "()Ljava/util/List;", "getIncludeOther", "()Z", "getMinSelection", "()I", "getMaxSelection", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
            public static final class MultipleChoiceQuestionModel extends QuestionModel {
                public static final int $stable = 8;
                private final boolean includeOther;
                private final int maxSelection;
                private final int minSelection;

                @NotNull
                private final List<String> options;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public MultipleChoiceQuestionModel(@NotNull String id, @NotNull List<Block.Builder> title, boolean z2, @NotNull List<String> options, boolean z3, int i, int i2) {
                    super(id, title, null, z2, 4, null);
                    Intrinsics.m18599g(id, "id");
                    Intrinsics.m18599g(title, "title");
                    Intrinsics.m18599g(options, "options");
                    this.options = options;
                    this.includeOther = z3;
                    this.minSelection = i;
                    this.maxSelection = i2;
                }

                public final boolean getIncludeOther() {
                    return this.includeOther;
                }

                public final int getMaxSelection() {
                    return this.maxSelection;
                }

                public final int getMinSelection() {
                    return this.minSelection;
                }

                @NotNull
                public final List<String> getOptions() {
                    return this.options;
                }
            }

            /* JADX INFO: compiled from: Proguard */
            @StabilityInferred
            @Metadata(m18301d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001eB[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m18302d2 = {"Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$NumericRatingQuestionModel;", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionModel;", "id", "", "title", "", "Lio/intercom/android/sdk/blocks/lib/models/Block$Builder;", "isRequired", "", "options", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$NumericRatingQuestionModel$RatingOption;", "lowerLabel", "upperLabel", "scaleStart", "", "scaleEnd", "questionSubType", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionData$QuestionSubType;", "<init>", "(Ljava/lang/String;Ljava/util/List;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;IILio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionData$QuestionSubType;)V", "getOptions", "()Ljava/util/List;", "getLowerLabel", "()Ljava/lang/String;", "getUpperLabel", "getScaleStart", "()I", "getScaleEnd", "getQuestionSubType", "()Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionData$QuestionSubType;", "RatingOption", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
            public static final class NumericRatingQuestionModel extends QuestionModel {
                public static final int $stable = 8;

                @NotNull
                private final String lowerLabel;

                @NotNull
                private final List<RatingOption> options;

                @NotNull
                private final QuestionData.QuestionSubType questionSubType;
                private final int scaleEnd;
                private final int scaleStart;

                @NotNull
                private final String upperLabel;

                /* JADX INFO: compiled from: Proguard */
                @StabilityInferred
                @Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m18302d2 = {"Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$NumericRatingQuestionModel$RatingOption;", "", "<init>", "()V", "EmojiRatingOption", "NumericRatingOption", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$NumericRatingQuestionModel$RatingOption$EmojiRatingOption;", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$NumericRatingQuestionModel$RatingOption$NumericRatingOption;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
                public static abstract class RatingOption {
                    public static final int $stable = 0;

                    /* JADX INFO: compiled from: Proguard */
                    @StabilityInferred
                    @Metadata(m18301d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, m18302d2 = {"Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$NumericRatingQuestionModel$RatingOption$EmojiRatingOption;", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$NumericRatingQuestionModel$RatingOption;", "value", "", "emojiUrl", "", "unicode", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "getValue", "()I", "getEmojiUrl", "()Ljava/lang/String;", "getUnicode", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
                    public static final class EmojiRatingOption extends RatingOption {
                        public static final int $stable = 0;

                        @SerializedName("image_url")
                        @NotNull
                        private final String emojiUrl;

                        @SerializedName("unicodeEmoticon")
                        @NotNull
                        private final String unicode;

                        @SerializedName("value")
                        private final int value;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public EmojiRatingOption(int i, @NotNull String emojiUrl, @NotNull String unicode) {
                            super(null);
                            Intrinsics.m18599g(emojiUrl, "emojiUrl");
                            Intrinsics.m18599g(unicode, "unicode");
                            this.value = i;
                            this.emojiUrl = emojiUrl;
                            this.unicode = unicode;
                        }

                        @NotNull
                        public final String getEmojiUrl() {
                            return this.emojiUrl;
                        }

                        @NotNull
                        public final String getUnicode() {
                            return this.unicode;
                        }

                        public final int getValue() {
                            return this.value;
                        }
                    }

                    /* JADX INFO: compiled from: Proguard */
                    @StabilityInferred
                    @Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m18302d2 = {"Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$NumericRatingQuestionModel$RatingOption$NumericRatingOption;", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$NumericRatingQuestionModel$RatingOption;", "value", "", "<init>", "(I)V", "getValue", "()I", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
                    public static final class NumericRatingOption extends RatingOption {
                        public static final int $stable = 0;
                        private final int value;

                        public NumericRatingOption(int i) {
                            super(null);
                            this.value = i;
                        }

                        public final int getValue() {
                            return this.value;
                        }
                    }

                    public /* synthetic */ RatingOption(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private RatingOption() {
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public NumericRatingQuestionModel(@NotNull String id, @NotNull List<Block.Builder> title, boolean z2, @NotNull List<? extends RatingOption> options, @NotNull String lowerLabel, @NotNull String upperLabel, int i, int i2, @NotNull QuestionData.QuestionSubType questionSubType) {
                    super(id, title, null, z2, 4, null);
                    Intrinsics.m18599g(id, "id");
                    Intrinsics.m18599g(title, "title");
                    Intrinsics.m18599g(options, "options");
                    Intrinsics.m18599g(lowerLabel, "lowerLabel");
                    Intrinsics.m18599g(upperLabel, "upperLabel");
                    Intrinsics.m18599g(questionSubType, "questionSubType");
                    this.options = options;
                    this.lowerLabel = lowerLabel;
                    this.upperLabel = upperLabel;
                    this.scaleStart = i;
                    this.scaleEnd = i2;
                    this.questionSubType = questionSubType;
                }

                @NotNull
                public final String getLowerLabel() {
                    return this.lowerLabel;
                }

                @NotNull
                public final List<RatingOption> getOptions() {
                    return this.options;
                }

                @NotNull
                public final QuestionData.QuestionSubType getQuestionSubType() {
                    return this.questionSubType;
                }

                public final int getScaleEnd() {
                    return this.scaleEnd;
                }

                public final int getScaleStart() {
                    return this.scaleStart;
                }

                @NotNull
                public final String getUpperLabel() {
                    return this.upperLabel;
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* JADX INFO: compiled from: Proguard */
            @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m18302d2 = {"Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionType;", "", "<init>", "(Ljava/lang/String;I)V", "INPUT", "TEXT", "DROPDOWN", "RATING_SCALE", "MULTI_SELECT", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
            public static final class QuestionType {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ QuestionType[] $VALUES;
                public static final QuestionType INPUT = new QuestionType("INPUT", 0);
                public static final QuestionType TEXT = new QuestionType("TEXT", 1);
                public static final QuestionType DROPDOWN = new QuestionType("DROPDOWN", 2);
                public static final QuestionType RATING_SCALE = new QuestionType("RATING_SCALE", 3);
                public static final QuestionType MULTI_SELECT = new QuestionType("MULTI_SELECT", 4);

                private static final /* synthetic */ QuestionType[] $values() {
                    return new QuestionType[]{INPUT, TEXT, DROPDOWN, RATING_SCALE, MULTI_SELECT};
                }

                static {
                    QuestionType[] questionTypeArr$values = $values();
                    $VALUES = questionTypeArr$values;
                    $ENTRIES = EnumEntriesKt.m18563a(questionTypeArr$values);
                }

                private QuestionType(String str, int i) {
                }

                @NotNull
                public static EnumEntries<QuestionType> getEntries() {
                    return $ENTRIES;
                }

                public static QuestionType valueOf(String str) {
                    return (QuestionType) Enum.valueOf(QuestionType.class, str);
                }

                public static QuestionType[] values() {
                    return (QuestionType[]) $VALUES.clone();
                }
            }

            /* JADX INFO: compiled from: Proguard */
            @StabilityInferred
            @Metadata(m18301d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u000f\u001a\u00020\u0003H×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0010\u0010\u0002\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, m18302d2 = {"Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionValidation;", "", "_type", "", "<init>", "(I)V", "validationType", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionValidation$ValidationType;", "getValidationType", "()Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionValidation$ValidationType;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "ValidationType", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
            public static final /* data */ class QuestionValidation {
                public static final int $stable = 0;

                @SerializedName("type")
                private final int _type;

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                /* JADX INFO: compiled from: Proguard */
                @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m18302d2 = {"Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionValidation$ValidationType;", "", "<init>", "(Ljava/lang/String;I)V", "TEXT", "NUMBER", "EMAIL", "PHONE", "NO_VALIDATION", "FLOAT", "INTEGER", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
                public static final class ValidationType {
                    private static final /* synthetic */ EnumEntries $ENTRIES;
                    private static final /* synthetic */ ValidationType[] $VALUES;
                    public static final ValidationType TEXT = new ValidationType("TEXT", 0);
                    public static final ValidationType NUMBER = new ValidationType("NUMBER", 1);
                    public static final ValidationType EMAIL = new ValidationType("EMAIL", 2);
                    public static final ValidationType PHONE = new ValidationType("PHONE", 3);
                    public static final ValidationType NO_VALIDATION = new ValidationType("NO_VALIDATION", 4);
                    public static final ValidationType FLOAT = new ValidationType("FLOAT", 5);
                    public static final ValidationType INTEGER = new ValidationType("INTEGER", 6);

                    private static final /* synthetic */ ValidationType[] $values() {
                        return new ValidationType[]{TEXT, NUMBER, EMAIL, PHONE, NO_VALIDATION, FLOAT, INTEGER};
                    }

                    static {
                        ValidationType[] validationTypeArr$values = $values();
                        $VALUES = validationTypeArr$values;
                        $ENTRIES = EnumEntriesKt.m18563a(validationTypeArr$values);
                    }

                    private ValidationType(String str, int i) {
                    }

                    @NotNull
                    public static EnumEntries<ValidationType> getEntries() {
                        return $ENTRIES;
                    }

                    public static ValidationType valueOf(String str) {
                        return (ValidationType) Enum.valueOf(ValidationType.class, str);
                    }

                    public static ValidationType[] values() {
                        return (ValidationType[]) $VALUES.clone();
                    }
                }

                public QuestionValidation(int i) {
                    this._type = i;
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                private final int get_type() {
                    return this._type;
                }

                public static /* synthetic */ QuestionValidation copy$default(QuestionValidation questionValidation, int i, int i2, Object obj) {
                    if ((i2 & 1) != 0) {
                        i = questionValidation._type;
                    }
                    return questionValidation.copy(i);
                }

                @NotNull
                public final QuestionValidation copy(int _type) {
                    return new QuestionValidation(_type);
                }

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof QuestionValidation) && this._type == ((QuestionValidation) other)._type;
                }

                @NotNull
                public final ValidationType getValidationType() {
                    int i = this._type;
                    ValidationType validationType = ValidationType.TEXT;
                    if (i == validationType.ordinal()) {
                        return validationType;
                    }
                    ValidationType validationType2 = ValidationType.NUMBER;
                    if (i == validationType2.ordinal()) {
                        return validationType2;
                    }
                    ValidationType validationType3 = ValidationType.EMAIL;
                    if (i == validationType3.ordinal()) {
                        return validationType3;
                    }
                    ValidationType validationType4 = ValidationType.PHONE;
                    if (i == validationType4.ordinal()) {
                        return validationType4;
                    }
                    ValidationType validationType5 = ValidationType.FLOAT;
                    if (i == validationType5.ordinal()) {
                        return validationType5;
                    }
                    ValidationType validationType6 = ValidationType.INTEGER;
                    return i == validationType6.ordinal() ? validationType6 : ValidationType.NO_VALIDATION;
                }

                public int hashCode() {
                    return Integer.hashCode(this._type);
                }

                @NotNull
                public String toString() {
                    return AbstractC0000a.m17n(new StringBuilder("QuestionValidation(_type="), this._type, ')');
                }
            }

            /* JADX INFO: compiled from: Proguard */
            @StabilityInferred
            @Metadata(m18301d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m18302d2 = {"Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$SingleChoiceQuestionModel;", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionModel;", "id", "", "title", "", "Lio/intercom/android/sdk/blocks/lib/models/Block$Builder;", "isRequired", "", "options", "includeOther", "<init>", "(Ljava/lang/String;Ljava/util/List;ZLjava/util/List;Z)V", "getOptions", "()Ljava/util/List;", "getIncludeOther", "()Z", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
            public static final class SingleChoiceQuestionModel extends QuestionModel {
                public static final int $stable = 8;
                private final boolean includeOther;

                @NotNull
                private final List<String> options;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public SingleChoiceQuestionModel(@NotNull String id, @NotNull List<Block.Builder> title, boolean z2, @NotNull List<String> options, boolean z3) {
                    super(id, title, null, z2, 4, null);
                    Intrinsics.m18599g(id, "id");
                    Intrinsics.m18599g(title, "title");
                    Intrinsics.m18599g(options, "options");
                    this.options = options;
                    this.includeOther = z3;
                }

                public final boolean getIncludeOther() {
                    return this.includeOther;
                }

                @NotNull
                public final List<String> getOptions() {
                    return this.options;
                }
            }

            /* JADX INFO: compiled from: Proguard */
            @StabilityInferred
            @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18302d2 = {"Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$UnsupportedQuestion;", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionModel;", "<init>", "()V", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
            public static final class UnsupportedQuestion extends QuestionModel {
                public static final int $stable = 0;

                @NotNull
                public static final UnsupportedQuestion INSTANCE = new UnsupportedQuestion();

                private UnsupportedQuestion() {
                    super("", EmptyList.f51496a, null, false, 4, null);
                }
            }

            public Question(@NotNull List<Block.Builder> blocks, @NotNull String id, int i, @NotNull QuestionData questionData) {
                Intrinsics.m18599g(blocks, "blocks");
                Intrinsics.m18599g(id, "id");
                Intrinsics.m18599g(questionData, "questionData");
                this.blocks = blocks;
                this.id = id;
                this.questionType = i;
                this.questionData = questionData;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            private final int getQuestionType() {
                return this.questionType;
            }

            /* JADX INFO: renamed from: component4, reason: from getter */
            private final QuestionData getQuestionData() {
                return this.questionData;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Question copy$default(Question question, List list, String str, int i, QuestionData questionData, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    list = question.blocks;
                }
                if ((i2 & 2) != 0) {
                    str = question.id;
                }
                if ((i2 & 4) != 0) {
                    i = question.questionType;
                }
                if ((i2 & 8) != 0) {
                    questionData = question.questionData;
                }
                return question.copy(list, str, i, questionData);
            }

            @NotNull
            public final List<Block.Builder> component1() {
                return this.blocks;
            }

            @NotNull
            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getId() {
                return this.id;
            }

            @NotNull
            public final Question copy(@NotNull List<Block.Builder> blocks, @NotNull String id, int questionType, @NotNull QuestionData questionData) {
                Intrinsics.m18599g(blocks, "blocks");
                Intrinsics.m18599g(id, "id");
                Intrinsics.m18599g(questionData, "questionData");
                return new Question(blocks, id, questionType, questionData);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Question)) {
                    return false;
                }
                Question question = (Question) other;
                return Intrinsics.m18594b(this.blocks, question.blocks) && Intrinsics.m18594b(this.id, question.id) && this.questionType == question.questionType && Intrinsics.m18594b(this.questionData, question.questionData);
            }

            @NotNull
            public final List<Block.Builder> getBlocks() {
                return this.blocks;
            }

            @NotNull
            public final String getId() {
                return this.id;
            }

            @NotNull
            public final QuestionModel getQuestionModel() {
                ArrayList arrayList;
                int i = this.questionType;
                if (i == QuestionType.DROPDOWN.ordinal()) {
                    String str = this.id;
                    List<Block.Builder> list = this.blocks;
                    boolean required = this.questionData.getRequired();
                    String placeholder = this.questionData.getPlaceholder();
                    JsonArray options = this.questionData.getOptions();
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.m18452r(options, 10));
                    Iterator<JsonElement> it = options.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(it.next().getAsString());
                    }
                    return new DropDownQuestionModel(str, list, required, arrayList2, placeholder, null, 32, null);
                }
                if (i == QuestionType.INPUT.ordinal()) {
                    return new ShortTextQuestionModel(this.id, this.blocks, this.questionData.getRequired(), this.questionData.getPlaceholder(), this.questionData.getValidation() != null ? this.questionData.getValidation().getValidationType() : QuestionValidation.ValidationType.NO_VALIDATION, this.questionData.getCharacterLimit(), false, null, null, 448, null);
                }
                if (i == QuestionType.TEXT.ordinal()) {
                    return new LongTextQuestionModel(this.id, this.blocks, this.questionData.getRequired(), this.questionData.getPlaceholder(), this.questionData.getValidation() != null ? this.questionData.getValidation().getValidationType() : QuestionValidation.ValidationType.NO_VALIDATION, this.questionData.getCharacterLimit(), 0.0f, 0, null, 448, null);
                }
                if (i != QuestionType.RATING_SCALE.ordinal()) {
                    if (i != QuestionType.MULTI_SELECT.ordinal()) {
                        return UnsupportedQuestion.INSTANCE;
                    }
                    if (this.questionData.getMaxSelection() == 1) {
                        String str2 = this.id;
                        List<Block.Builder> list2 = this.blocks;
                        boolean required2 = this.questionData.getRequired();
                        JsonArray options2 = this.questionData.getOptions();
                        ArrayList arrayList3 = new ArrayList(CollectionsKt.m18452r(options2, 10));
                        Iterator<JsonElement> it2 = options2.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add(it2.next().getAsString());
                        }
                        return new SingleChoiceQuestionModel(str2, list2, required2, arrayList3, this.questionData.getIncludeOther());
                    }
                    String str3 = this.id;
                    List<Block.Builder> list3 = this.blocks;
                    boolean required3 = this.questionData.getRequired();
                    JsonArray options3 = this.questionData.getOptions();
                    ArrayList arrayList4 = new ArrayList(CollectionsKt.m18452r(options3, 10));
                    Iterator<JsonElement> it3 = options3.iterator();
                    while (it3.hasNext()) {
                        arrayList4.add(it3.next().getAsString());
                    }
                    return new MultipleChoiceQuestionModel(str3, list3, required3, arrayList4, this.questionData.getIncludeOther(), this.questionData.getMinSelection(), this.questionData.getMaxSelection());
                }
                String str4 = this.id;
                List<Block.Builder> list4 = this.blocks;
                boolean required4 = this.questionData.getRequired();
                String lowerLabel = this.questionData.getLowerLabel();
                String upperLabel = this.questionData.getUpperLabel();
                int scaleStart = this.questionData.getScaleStart();
                int scaleEnd = this.questionData.getScaleEnd();
                if (this.questionData.getQuestionSubtype() == QuestionData.QuestionSubType.EMOJI.ordinal()) {
                    Gson gson = new Gson();
                    JsonArray options4 = this.questionData.getOptions();
                    arrayList = new ArrayList(CollectionsKt.m18452r(options4, 10));
                    Iterator<JsonElement> it4 = options4.iterator();
                    while (it4.hasNext()) {
                        arrayList.add((NumericRatingQuestionModel.RatingOption.EmojiRatingOption) gson.fromJson(it4.next(), NumericRatingQuestionModel.RatingOption.EmojiRatingOption.class));
                    }
                } else {
                    IntRange intRange = new IntRange(this.questionData.getScaleStart(), this.questionData.getScaleEnd(), 1);
                    arrayList = new ArrayList(CollectionsKt.m18452r(intRange, 10));
                    IntProgressionIterator intProgressionIteratorM18652g = intRange.m18652g();
                    while (intProgressionIteratorM18652g.f51690c) {
                        arrayList.add(new NumericRatingQuestionModel.RatingOption.NumericRatingOption(intProgressionIteratorM18652g.mo2140c()));
                    }
                }
                ArrayList arrayList5 = arrayList;
                int questionSubtype = this.questionData.getQuestionSubtype();
                QuestionData.QuestionSubType questionSubType = QuestionData.QuestionSubType.NUMERIC;
                if (questionSubtype != questionSubType.ordinal()) {
                    questionSubType = QuestionData.QuestionSubType.STARS;
                    if (questionSubtype != questionSubType.ordinal()) {
                        questionSubType = QuestionData.QuestionSubType.EMOJI;
                        if (questionSubtype != questionSubType.ordinal()) {
                            questionSubType = QuestionData.QuestionSubType.NPS;
                            if (questionSubtype != questionSubType.ordinal()) {
                                questionSubType = QuestionData.QuestionSubType.UNSUPPORTED;
                            }
                        }
                    }
                }
                return new NumericRatingQuestionModel(str4, list4, required4, arrayList5, lowerLabel, upperLabel, scaleStart, scaleEnd, questionSubType);
            }

            public int hashCode() {
                return this.questionData.hashCode() + AbstractC0455a.m2228c(this.questionType, AbstractC0000a.m5b(this.blocks.hashCode() * 31, 31, this.id), 31);
            }

            @NotNull
            public String toString() {
                return "Question(blocks=" + this.blocks + ", id=" + this.id + ", questionType=" + this.questionType + ", questionData=" + this.questionData + ')';
            }

            /* JADX INFO: compiled from: Proguard */
            @StabilityInferred
            @Metadata(m18301d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m18302d2 = {"Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$DropDownQuestionModel;", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionModel;", "id", "", "title", "", "Lio/intercom/android/sdk/blocks/lib/models/Block$Builder;", "isRequired", "", "options", "placeholder", "placeHolderStringRes", "", "<init>", "(Ljava/lang/String;Ljava/util/List;ZLjava/util/List;Ljava/lang/String;Ljava/lang/Integer;)V", "getOptions", "()Ljava/util/List;", "getPlaceholder", "()Ljava/lang/String;", "getPlaceHolderStringRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
            public static final class DropDownQuestionModel extends QuestionModel {
                public static final int $stable = 8;

                @NotNull
                private final List<String> options;

                @Nullable
                private final Integer placeHolderStringRes;

                @NotNull
                private final String placeholder;

                public /* synthetic */ DropDownQuestionModel(String str, List list, boolean z2, List list2, String str2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str, list, z2, list2, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? null : num);
                }

                @NotNull
                public final List<String> getOptions() {
                    return this.options;
                }

                @Nullable
                public final Integer getPlaceHolderStringRes() {
                    return this.placeHolderStringRes;
                }

                @NotNull
                public final String getPlaceholder() {
                    return this.placeholder;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public DropDownQuestionModel(@NotNull String id, @NotNull List<Block.Builder> title, boolean z2, @NotNull List<String> options, @NotNull String placeholder, @StringRes @Nullable Integer num) {
                    super(id, title, null, z2, 4, null);
                    Intrinsics.m18599g(id, "id");
                    Intrinsics.m18599g(title, "title");
                    Intrinsics.m18599g(options, "options");
                    Intrinsics.m18599g(placeholder, "placeholder");
                    this.options = options;
                    this.placeholder = placeholder;
                    this.placeHolderStringRes = num;
                }
            }

            /* JADX INFO: compiled from: Proguard */
            @StabilityInferred
            @Metadata(m18301d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001c\u0010\u0018R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001d\u0010\u0018¨\u0006\u001e"}, m18302d2 = {"Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$ShortTextQuestionModel;", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionModel;", "id", "", "title", "", "Lio/intercom/android/sdk/blocks/lib/models/Block$Builder;", "isRequired", "", "placeholder", "validationType", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionValidation$ValidationType;", "characterLimit", "", "enabled", "placeHolderStringRes", "titleStringRes", "<init>", "(Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionValidation$ValidationType;Ljava/lang/Integer;ZLjava/lang/Integer;Ljava/lang/Integer;)V", "getPlaceholder", "()Ljava/lang/String;", "getValidationType", "()Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionValidation$ValidationType;", "getCharacterLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getEnabled", "()Z", "getPlaceHolderStringRes", "getTitleStringRes", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
            public static final class ShortTextQuestionModel extends QuestionModel {
                public static final int $stable = 0;

                @Nullable
                private final Integer characterLimit;
                private final boolean enabled;

                @Nullable
                private final Integer placeHolderStringRes;

                @NotNull
                private final String placeholder;

                @Nullable
                private final Integer titleStringRes;

                @NotNull
                private final QuestionValidation.ValidationType validationType;

                /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                    java.lang.NullPointerException
                    */
                public /* synthetic */ ShortTextQuestionModel(java.lang.String r13, java.util.List r14, boolean r15, java.lang.String r16, io.intercom.android.sdk.survey.model.SurveyData.Step.Question.QuestionValidation.ValidationType r17, java.lang.Integer r18, boolean r19, java.lang.Integer r20, java.lang.Integer r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
                    /*
                        r12 = this;
                        r0 = r22
                        r1 = r0 & 8
                        if (r1 == 0) goto La
                        java.lang.String r1 = ""
                        r6 = r1
                        goto Lc
                    La:
                        r6 = r16
                    Lc:
                        r1 = r0 & 64
                        if (r1 == 0) goto L13
                        r1 = 1
                        r9 = r1
                        goto L15
                    L13:
                        r9 = r19
                    L15:
                        r1 = r0 & 128(0x80, float:1.8E-43)
                        r2 = 0
                        if (r1 == 0) goto L1c
                        r10 = r2
                        goto L1e
                    L1c:
                        r10 = r20
                    L1e:
                        r0 = r0 & 256(0x100, float:3.59E-43)
                        if (r0 == 0) goto L2c
                        r11 = r2
                        r3 = r13
                        r4 = r14
                        r5 = r15
                        r7 = r17
                        r8 = r18
                        r2 = r12
                        goto L36
                    L2c:
                        r11 = r21
                        r2 = r12
                        r3 = r13
                        r4 = r14
                        r5 = r15
                        r7 = r17
                        r8 = r18
                    L36:
                        r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.survey.model.SurveyData.Step.Question.ShortTextQuestionModel.<init>(java.lang.String, java.util.List, boolean, java.lang.String, io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionValidation$ValidationType, java.lang.Integer, boolean, java.lang.Integer, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
                }

                @Nullable
                public final Integer getCharacterLimit() {
                    return this.characterLimit;
                }

                public final boolean getEnabled() {
                    return this.enabled;
                }

                @Nullable
                public final Integer getPlaceHolderStringRes() {
                    return this.placeHolderStringRes;
                }

                @NotNull
                public final String getPlaceholder() {
                    return this.placeholder;
                }

                @Nullable
                public final Integer getTitleStringRes() {
                    return this.titleStringRes;
                }

                @NotNull
                public final QuestionValidation.ValidationType getValidationType() {
                    return this.validationType;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ShortTextQuestionModel(@NotNull String id, @NotNull List<Block.Builder> title, boolean z2, @NotNull String placeholder, @NotNull QuestionValidation.ValidationType validationType, @Nullable Integer num, boolean z3, @StringRes @Nullable Integer num2, @StringRes @Nullable Integer num3) {
                    super(id, title, null, z2, 4, null);
                    Intrinsics.m18599g(id, "id");
                    Intrinsics.m18599g(title, "title");
                    Intrinsics.m18599g(placeholder, "placeholder");
                    Intrinsics.m18599g(validationType, "validationType");
                    this.placeholder = placeholder;
                    this.validationType = validationType;
                    this.characterLimit = num;
                    this.enabled = z3;
                    this.placeHolderStringRes = num2;
                    this.titleStringRes = num3;
                }
            }

            /* JADX INFO: compiled from: Proguard */
            @StabilityInferred
            @Metadata(m18301d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m18302d2 = {"Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$UploadFileQuestionModel;", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionModel;", "id", "", "title", "", "Lio/intercom/android/sdk/blocks/lib/models/Block$Builder;", "description", "Lio/intercom/android/sdk/ui/common/StringProvider;", "isRequired", "", "maxSelection", "", "supportedFileType", "", "<init>", "(Ljava/lang/String;Ljava/util/List;Lio/intercom/android/sdk/ui/common/StringProvider;ZILjava/util/Set;)V", "getMaxSelection", "()I", "getSupportedFileType", "()Ljava/util/Set;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
            public static final class UploadFileQuestionModel extends QuestionModel {
                public static final int $stable = 8;
                private final int maxSelection;

                @NotNull
                private final Set<String> supportedFileType;

                public /* synthetic */ UploadFileQuestionModel(String str, List list, StringProvider stringProvider, boolean z2, int i, Set set, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str, list, (i2 & 4) != 0 ? new StringProvider.ActualString("") : stringProvider, z2, i, set);
                }

                public final int getMaxSelection() {
                    return this.maxSelection;
                }

                @NotNull
                public final Set<String> getSupportedFileType() {
                    return this.supportedFileType;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public UploadFileQuestionModel(@NotNull String id, @NotNull List<Block.Builder> title, @NotNull StringProvider description, boolean z2, int i, @NotNull Set<String> supportedFileType) {
                    super(id, title, description, z2);
                    Intrinsics.m18599g(id, "id");
                    Intrinsics.m18599g(title, "title");
                    Intrinsics.m18599g(description, "description");
                    Intrinsics.m18599g(supportedFileType, "supportedFileType");
                    this.maxSelection = i;
                    this.supportedFileType = supportedFileType;
                }
            }

            /* JADX INFO: compiled from: Proguard */
            @StabilityInferred
            @Metadata(m18301d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0017\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0013¨\u0006\u0014"}, m18302d2 = {"Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionModel;", "", "id", "", "title", "", "Lio/intercom/android/sdk/blocks/lib/models/Block$Builder;", "description", "Lio/intercom/android/sdk/ui/common/StringProvider;", "isRequired", "", "<init>", "(Ljava/lang/String;Ljava/util/List;Lio/intercom/android/sdk/ui/common/StringProvider;Z)V", "getId", "()Ljava/lang/String;", "getTitle", "()Ljava/util/List;", "getDescription", "()Lio/intercom/android/sdk/ui/common/StringProvider;", "()Z", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
            public static class QuestionModel {
                public static final int $stable = 8;

                @NotNull
                private final StringProvider description;

                @NotNull
                private final String id;
                private final boolean isRequired;

                @NotNull
                private final List<Block.Builder> title;

                public QuestionModel(@NotNull String id, @NotNull List<Block.Builder> title, @NotNull StringProvider description, boolean z2) {
                    Intrinsics.m18599g(id, "id");
                    Intrinsics.m18599g(title, "title");
                    Intrinsics.m18599g(description, "description");
                    this.id = id;
                    this.title = title;
                    this.description = description;
                    this.isRequired = z2;
                }

                @NotNull
                public final StringProvider getDescription() {
                    return this.description;
                }

                @NotNull
                public final String getId() {
                    return this.id;
                }

                @NotNull
                public final List<Block.Builder> getTitle() {
                    return this.title;
                }

                /* JADX INFO: renamed from: isRequired, reason: from getter */
                public final boolean getIsRequired() {
                    return this.isRequired;
                }

                public /* synthetic */ QuestionModel(String str, List list, StringProvider stringProvider, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str, list, (i & 4) != 0 ? new StringProvider.ActualString("") : stringProvider, z2);
                }
            }

            /* JADX INFO: compiled from: Proguard */
            @StabilityInferred
            @Metadata(m18301d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b-\b\u0087\b\u0018\u00002\u00020\u0001:\u0001>Bw\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0007HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u000bHÆ\u0003J\t\u00101\u001a\u00020\u000bHÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\u000bHÆ\u0003J\t\u00104\u001a\u00020\u000bHÆ\u0003J\t\u00105\u001a\u00020\u000bHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010'J\u0096\u0001\u00108\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000bHÇ\u0001¢\u0006\u0002\u00109J\u0013\u0010:\u001a\u00020\u00052\b\u0010;\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010<\u001a\u00020\u000bH×\u0001J\t\u0010=\u001a\u00020\u0003H×\u0001R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0016\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0016\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0016\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0016\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u0011\u0010)\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b*\u0010\u001b¨\u0006?"}, m18302d2 = {"Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionData;", "", "_placeholder", "", "required", "", "options", "Lcom/google/gson/JsonArray;", "lowerLabel", "upperLabel", "scaleStart", "", "scaleEnd", "includeOther", "maxSelection", "minSelection", "questionSubtype", "validation", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionValidation;", "characterLimit", "<init>", "(Ljava/lang/String;ZLcom/google/gson/JsonArray;Ljava/lang/String;Ljava/lang/String;IIZIIILio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionValidation;Ljava/lang/Integer;)V", "getRequired", "()Z", "getOptions", "()Lcom/google/gson/JsonArray;", "getLowerLabel", "()Ljava/lang/String;", "getUpperLabel", "getScaleStart", "()I", "getScaleEnd", "getIncludeOther", "getMaxSelection", "getMinSelection", "getQuestionSubtype", "getValidation", "()Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionValidation;", "getCharacterLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "placeholder", "getPlaceholder", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;ZLcom/google/gson/JsonArray;Ljava/lang/String;Ljava/lang/String;IIZIIILio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionValidation;Ljava/lang/Integer;)Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionData;", "equals", "other", "hashCode", "toString", "QuestionSubType", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
            public static final /* data */ class QuestionData {
                public static final int $stable = 8;

                @SerializedName("placeholder")
                @Nullable
                private final String _placeholder;

                @SerializedName("character_limit")
                @Nullable
                private final Integer characterLimit;

                @SerializedName("include_other")
                private final boolean includeOther;

                @SerializedName("lower_label")
                @NotNull
                private final String lowerLabel;

                @SerializedName("maximum_selection")
                private final int maxSelection;

                @SerializedName("minimum_selection")
                private final int minSelection;

                @SerializedName("options")
                @NotNull
                private final JsonArray options;

                @SerializedName("type")
                private final int questionSubtype;

                @SerializedName("required")
                private final boolean required;

                @SerializedName("scale_end")
                private final int scaleEnd;

                @SerializedName("scale_start")
                private final int scaleStart;

                @SerializedName("upper_label")
                @NotNull
                private final String upperLabel;

                @SerializedName("validation")
                @Nullable
                private final QuestionValidation validation;

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                /* JADX INFO: compiled from: Proguard */
                @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m18302d2 = {"Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionData$QuestionSubType;", "", "<init>", "(Ljava/lang/String;I)V", "NUMERIC", "STARS", "EMOJI", "NPS", "UNSUPPORTED", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
                public static final class QuestionSubType {
                    private static final /* synthetic */ EnumEntries $ENTRIES;
                    private static final /* synthetic */ QuestionSubType[] $VALUES;
                    public static final QuestionSubType NUMERIC = new QuestionSubType("NUMERIC", 0);
                    public static final QuestionSubType STARS = new QuestionSubType("STARS", 1);
                    public static final QuestionSubType EMOJI = new QuestionSubType("EMOJI", 2);
                    public static final QuestionSubType NPS = new QuestionSubType("NPS", 3);
                    public static final QuestionSubType UNSUPPORTED = new QuestionSubType("UNSUPPORTED", 4);

                    private static final /* synthetic */ QuestionSubType[] $values() {
                        return new QuestionSubType[]{NUMERIC, STARS, EMOJI, NPS, UNSUPPORTED};
                    }

                    static {
                        QuestionSubType[] questionSubTypeArr$values = $values();
                        $VALUES = questionSubTypeArr$values;
                        $ENTRIES = EnumEntriesKt.m18563a(questionSubTypeArr$values);
                    }

                    private QuestionSubType(String str, int i) {
                    }

                    @NotNull
                    public static EnumEntries<QuestionSubType> getEntries() {
                        return $ENTRIES;
                    }

                    public static QuestionSubType valueOf(String str) {
                        return (QuestionSubType) Enum.valueOf(QuestionSubType.class, str);
                    }

                    public static QuestionSubType[] values() {
                        return (QuestionSubType[]) $VALUES.clone();
                    }
                }

                public QuestionData(@Nullable String str, boolean z2, @NotNull JsonArray options, @NotNull String lowerLabel, @NotNull String upperLabel, int i, int i2, boolean z3, int i3, int i4, int i5, @Nullable QuestionValidation questionValidation, @Nullable Integer num) {
                    Intrinsics.m18599g(options, "options");
                    Intrinsics.m18599g(lowerLabel, "lowerLabel");
                    Intrinsics.m18599g(upperLabel, "upperLabel");
                    this._placeholder = str;
                    this.required = z2;
                    this.options = options;
                    this.lowerLabel = lowerLabel;
                    this.upperLabel = upperLabel;
                    this.scaleStart = i;
                    this.scaleEnd = i2;
                    this.includeOther = z3;
                    this.maxSelection = i3;
                    this.minSelection = i4;
                    this.questionSubtype = i5;
                    this.validation = questionValidation;
                    this.characterLimit = num;
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                private final String get_placeholder() {
                    return this._placeholder;
                }

                public static /* synthetic */ QuestionData copy$default(QuestionData questionData, String str, boolean z2, JsonArray jsonArray, String str2, String str3, int i, int i2, boolean z3, int i3, int i4, int i5, QuestionValidation questionValidation, Integer num, int i6, Object obj) {
                    if ((i6 & 1) != 0) {
                        str = questionData._placeholder;
                    }
                    return questionData.copy(str, (i6 & 2) != 0 ? questionData.required : z2, (i6 & 4) != 0 ? questionData.options : jsonArray, (i6 & 8) != 0 ? questionData.lowerLabel : str2, (i6 & 16) != 0 ? questionData.upperLabel : str3, (i6 & 32) != 0 ? questionData.scaleStart : i, (i6 & 64) != 0 ? questionData.scaleEnd : i2, (i6 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? questionData.includeOther : z3, (i6 & 256) != 0 ? questionData.maxSelection : i3, (i6 & 512) != 0 ? questionData.minSelection : i4, (i6 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? questionData.questionSubtype : i5, (i6 & 2048) != 0 ? questionData.validation : questionValidation, (i6 & 4096) != 0 ? questionData.characterLimit : num);
                }

                /* JADX INFO: renamed from: component10, reason: from getter */
                public final int getMinSelection() {
                    return this.minSelection;
                }

                /* JADX INFO: renamed from: component11, reason: from getter */
                public final int getQuestionSubtype() {
                    return this.questionSubtype;
                }

                @Nullable
                /* JADX INFO: renamed from: component12, reason: from getter */
                public final QuestionValidation getValidation() {
                    return this.validation;
                }

                @Nullable
                /* JADX INFO: renamed from: component13, reason: from getter */
                public final Integer getCharacterLimit() {
                    return this.characterLimit;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final boolean getRequired() {
                    return this.required;
                }

                @NotNull
                /* JADX INFO: renamed from: component3, reason: from getter */
                public final JsonArray getOptions() {
                    return this.options;
                }

                @NotNull
                /* JADX INFO: renamed from: component4, reason: from getter */
                public final String getLowerLabel() {
                    return this.lowerLabel;
                }

                @NotNull
                /* JADX INFO: renamed from: component5, reason: from getter */
                public final String getUpperLabel() {
                    return this.upperLabel;
                }

                /* JADX INFO: renamed from: component6, reason: from getter */
                public final int getScaleStart() {
                    return this.scaleStart;
                }

                /* JADX INFO: renamed from: component7, reason: from getter */
                public final int getScaleEnd() {
                    return this.scaleEnd;
                }

                /* JADX INFO: renamed from: component8, reason: from getter */
                public final boolean getIncludeOther() {
                    return this.includeOther;
                }

                /* JADX INFO: renamed from: component9, reason: from getter */
                public final int getMaxSelection() {
                    return this.maxSelection;
                }

                @NotNull
                public final QuestionData copy(@Nullable String _placeholder, boolean required, @NotNull JsonArray options, @NotNull String lowerLabel, @NotNull String upperLabel, int scaleStart, int scaleEnd, boolean includeOther, int maxSelection, int minSelection, int questionSubtype, @Nullable QuestionValidation validation, @Nullable Integer characterLimit) {
                    Intrinsics.m18599g(options, "options");
                    Intrinsics.m18599g(lowerLabel, "lowerLabel");
                    Intrinsics.m18599g(upperLabel, "upperLabel");
                    return new QuestionData(_placeholder, required, options, lowerLabel, upperLabel, scaleStart, scaleEnd, includeOther, maxSelection, minSelection, questionSubtype, validation, characterLimit);
                }

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof QuestionData)) {
                        return false;
                    }
                    QuestionData questionData = (QuestionData) other;
                    return Intrinsics.m18594b(this._placeholder, questionData._placeholder) && this.required == questionData.required && Intrinsics.m18594b(this.options, questionData.options) && Intrinsics.m18594b(this.lowerLabel, questionData.lowerLabel) && Intrinsics.m18594b(this.upperLabel, questionData.upperLabel) && this.scaleStart == questionData.scaleStart && this.scaleEnd == questionData.scaleEnd && this.includeOther == questionData.includeOther && this.maxSelection == questionData.maxSelection && this.minSelection == questionData.minSelection && this.questionSubtype == questionData.questionSubtype && Intrinsics.m18594b(this.validation, questionData.validation) && Intrinsics.m18594b(this.characterLimit, questionData.characterLimit);
                }

                @Nullable
                public final Integer getCharacterLimit() {
                    return this.characterLimit;
                }

                public final boolean getIncludeOther() {
                    return this.includeOther;
                }

                @NotNull
                public final String getLowerLabel() {
                    return this.lowerLabel;
                }

                public final int getMaxSelection() {
                    return this.maxSelection;
                }

                public final int getMinSelection() {
                    return this.minSelection;
                }

                @NotNull
                public final JsonArray getOptions() {
                    return this.options;
                }

                @NotNull
                public final String getPlaceholder() {
                    String str = this._placeholder;
                    return str == null ? "" : str;
                }

                public final int getQuestionSubtype() {
                    return this.questionSubtype;
                }

                public final boolean getRequired() {
                    return this.required;
                }

                public final int getScaleEnd() {
                    return this.scaleEnd;
                }

                public final int getScaleStart() {
                    return this.scaleStart;
                }

                @NotNull
                public final String getUpperLabel() {
                    return this.upperLabel;
                }

                @Nullable
                public final QuestionValidation getValidation() {
                    return this.validation;
                }

                public int hashCode() {
                    String str = this._placeholder;
                    int iM2228c = AbstractC0455a.m2228c(this.questionSubtype, AbstractC0455a.m2228c(this.minSelection, AbstractC0455a.m2228c(this.maxSelection, AbstractC0455a.m2230e(AbstractC0455a.m2228c(this.scaleEnd, AbstractC0455a.m2228c(this.scaleStart, AbstractC0000a.m5b(AbstractC0000a.m5b((this.options.hashCode() + AbstractC0455a.m2230e((str == null ? 0 : str.hashCode()) * 31, 31, this.required)) * 31, 31, this.lowerLabel), 31, this.upperLabel), 31), 31), 31, this.includeOther), 31), 31), 31);
                    QuestionValidation questionValidation = this.validation;
                    int iHashCode = (iM2228c + (questionValidation == null ? 0 : questionValidation.hashCode())) * 31;
                    Integer num = this.characterLimit;
                    return iHashCode + (num != null ? num.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "QuestionData(_placeholder=" + this._placeholder + ", required=" + this.required + ", options=" + this.options + ", lowerLabel=" + this.lowerLabel + ", upperLabel=" + this.upperLabel + ", scaleStart=" + this.scaleStart + ", scaleEnd=" + this.scaleEnd + ", includeOther=" + this.includeOther + ", maxSelection=" + this.maxSelection + ", minSelection=" + this.minSelection + ", questionSubtype=" + this.questionSubtype + ", validation=" + this.validation + ", characterLimit=" + this.characterLimit + ')';
                }

                public /* synthetic */ QuestionData(String str, boolean z2, JsonArray jsonArray, String str2, String str3, int i, int i2, boolean z3, int i3, int i4, int i5, QuestionValidation questionValidation, Integer num, int i6, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str, z2, (i6 & 4) != 0 ? new JsonArray() : jsonArray, str2, str3, i, i2, z3, i3, i4, i5, questionValidation, num);
                }
            }
        }

        public Step(@NotNull List<Block.Builder> blocks, @NotNull String id, @NotNull List<Question> questions, int i, @NotNull List<SurveyActions> actions, @Nullable String str) {
            Intrinsics.m18599g(blocks, "blocks");
            Intrinsics.m18599g(id, "id");
            Intrinsics.m18599g(questions, "questions");
            Intrinsics.m18599g(actions, "actions");
            this.blocks = blocks;
            this.id = id;
            this.questions = questions;
            this._type = i;
            this.actions = actions;
            this.customButtonText = str;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        private final int get_type() {
            return this._type;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Step copy$default(Step step, List list, String str, List list2, int i, List list3, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                list = step.blocks;
            }
            if ((i2 & 2) != 0) {
                str = step.id;
            }
            if ((i2 & 4) != 0) {
                list2 = step.questions;
            }
            if ((i2 & 8) != 0) {
                i = step._type;
            }
            if ((i2 & 16) != 0) {
                list3 = step.actions;
            }
            if ((i2 & 32) != 0) {
                str2 = step.customButtonText;
            }
            List list4 = list3;
            String str3 = str2;
            return step.copy(list, str, list2, i, list4, str3);
        }

        @NotNull
        public final List<Block.Builder> component1() {
            return this.blocks;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final List<Question> component3() {
            return this.questions;
        }

        @NotNull
        public final List<SurveyActions> component5() {
            return this.actions;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getCustomButtonText() {
            return this.customButtonText;
        }

        @NotNull
        public final Step copy(@NotNull List<Block.Builder> blocks, @NotNull String id, @NotNull List<Question> questions, int _type, @NotNull List<SurveyActions> actions, @Nullable String customButtonText) {
            Intrinsics.m18599g(blocks, "blocks");
            Intrinsics.m18599g(id, "id");
            Intrinsics.m18599g(questions, "questions");
            Intrinsics.m18599g(actions, "actions");
            return new Step(blocks, id, questions, _type, actions, customButtonText);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Step)) {
                return false;
            }
            Step step = (Step) other;
            return Intrinsics.m18594b(this.blocks, step.blocks) && Intrinsics.m18594b(this.id, step.id) && Intrinsics.m18594b(this.questions, step.questions) && this._type == step._type && Intrinsics.m18594b(this.actions, step.actions) && Intrinsics.m18594b(this.customButtonText, step.customButtonText);
        }

        @NotNull
        public final List<SurveyActions> getActions() {
            return this.actions;
        }

        @NotNull
        public final List<Block.Builder> getBlocks() {
            return this.blocks;
        }

        @Nullable
        public final String getCustomButtonText() {
            return this.customButtonText;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final List<Question> getQuestions() {
            return this.questions;
        }

        @NotNull
        public final StepType getType() {
            int i = this._type;
            return i != 0 ? i != 1 ? i != 2 ? i != 3 ? StepType.UNSUPPORTED : StepType.THANK_YOU : StepType.INTRO : StepType.QUESTION : StepType.CONTENT;
        }

        public int hashCode() {
            int iM2233h = AbstractC0455a.m2233h(this.actions, AbstractC0455a.m2228c(this._type, AbstractC0455a.m2233h(this.questions, AbstractC0000a.m5b(this.blocks.hashCode() * 31, 31, this.id), 31), 31), 31);
            String str = this.customButtonText;
            return iM2233h + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("Step(blocks=");
            sb.append(this.blocks);
            sb.append(", id=");
            sb.append(this.id);
            sb.append(", questions=");
            sb.append(this.questions);
            sb.append(", _type=");
            sb.append(this._type);
            sb.append(", actions=");
            sb.append(this.actions);
            sb.append(", customButtonText=");
            return AbstractC0455a.m2241p(sb, this.customButtonText, ')');
        }

        public /* synthetic */ Step(List list, String str, List list2, int i, List list3, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, str, list2, i, (i2 & 16) != 0 ? EmptyList.f51496a : list3, (i2 & 32) != 0 ? null : str2);
        }
    }

    public /* synthetic */ SurveyData(String str, String str2, List list, String str3, SurveyCustomization surveyCustomization, SurveySenderData surveySenderData, int i, boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list, str3, surveyCustomization, surveySenderData, i, z2, (i2 & 256) != 0 ? true : z3);
    }
}
