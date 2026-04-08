package io.intercom.android.sdk.survey.model;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m18302d2 = {"Lio/intercom/android/sdk/survey/model/SubmitSurveyRequestItem;", "", "questionId", "", "response", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getQuestionId", "()Ljava/lang/String;", "getResponse", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final /* data */ class SubmitSurveyRequestItem {
    public static final int $stable = 8;

    @SerializedName("question_id")
    @NotNull
    private final String questionId;

    @SerializedName("response")
    @NotNull
    private final List<String> response;

    public SubmitSurveyRequestItem(@NotNull String questionId, @NotNull List<String> response) {
        Intrinsics.m18599g(questionId, "questionId");
        Intrinsics.m18599g(response, "response");
        this.questionId = questionId;
        this.response = response;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SubmitSurveyRequestItem copy$default(SubmitSurveyRequestItem submitSurveyRequestItem, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = submitSurveyRequestItem.questionId;
        }
        if ((i & 2) != 0) {
            list = submitSurveyRequestItem.response;
        }
        return submitSurveyRequestItem.copy(str, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getQuestionId() {
        return this.questionId;
    }

    @NotNull
    public final List<String> component2() {
        return this.response;
    }

    @NotNull
    public final SubmitSurveyRequestItem copy(@NotNull String questionId, @NotNull List<String> response) {
        Intrinsics.m18599g(questionId, "questionId");
        Intrinsics.m18599g(response, "response");
        return new SubmitSurveyRequestItem(questionId, response);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubmitSurveyRequestItem)) {
            return false;
        }
        SubmitSurveyRequestItem submitSurveyRequestItem = (SubmitSurveyRequestItem) other;
        return Intrinsics.m18594b(this.questionId, submitSurveyRequestItem.questionId) && Intrinsics.m18594b(this.response, submitSurveyRequestItem.response);
    }

    @NotNull
    public final String getQuestionId() {
        return this.questionId;
    }

    @NotNull
    public final List<String> getResponse() {
        return this.response;
    }

    public int hashCode() {
        return this.response.hashCode() + (this.questionId.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("SubmitSurveyRequestItem(questionId=");
        sb.append(this.questionId);
        sb.append(", response=");
        return AbstractC0455a.m2242q(sb, this.response, ')');
    }
}
