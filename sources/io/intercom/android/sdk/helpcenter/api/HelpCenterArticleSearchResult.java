package io.intercom.android.sdk.helpcenter.api;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\t\u0010\u0018\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m18302d2 = {"Lio/intercom/android/sdk/helpcenter/api/HelpCenterArticleSearchResult;", "", "articleId", "", "title", "summary", "matchingSnippet", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getArticleId", "()Ljava/lang/String;", "getTitle", "getSummary", "getMatchingSnippet", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final /* data */ class HelpCenterArticleSearchResult {
    public static final int $stable = 0;

    @NotNull
    private final String articleId;

    @NotNull
    private final String matchingSnippet;

    @NotNull
    private final String summary;

    @NotNull
    private final String title;

    public HelpCenterArticleSearchResult(@NotNull String articleId, @NotNull String title, @NotNull String summary, @NotNull String matchingSnippet) {
        Intrinsics.m18599g(articleId, "articleId");
        Intrinsics.m18599g(title, "title");
        Intrinsics.m18599g(summary, "summary");
        Intrinsics.m18599g(matchingSnippet, "matchingSnippet");
        this.articleId = articleId;
        this.title = title;
        this.summary = summary;
        this.matchingSnippet = matchingSnippet;
    }

    public static /* synthetic */ HelpCenterArticleSearchResult copy$default(HelpCenterArticleSearchResult helpCenterArticleSearchResult, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = helpCenterArticleSearchResult.articleId;
        }
        if ((i & 2) != 0) {
            str2 = helpCenterArticleSearchResult.title;
        }
        if ((i & 4) != 0) {
            str3 = helpCenterArticleSearchResult.summary;
        }
        if ((i & 8) != 0) {
            str4 = helpCenterArticleSearchResult.matchingSnippet;
        }
        return helpCenterArticleSearchResult.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getArticleId() {
        return this.articleId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMatchingSnippet() {
        return this.matchingSnippet;
    }

    @NotNull
    public final HelpCenterArticleSearchResult copy(@NotNull String articleId, @NotNull String title, @NotNull String summary, @NotNull String matchingSnippet) {
        Intrinsics.m18599g(articleId, "articleId");
        Intrinsics.m18599g(title, "title");
        Intrinsics.m18599g(summary, "summary");
        Intrinsics.m18599g(matchingSnippet, "matchingSnippet");
        return new HelpCenterArticleSearchResult(articleId, title, summary, matchingSnippet);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HelpCenterArticleSearchResult)) {
            return false;
        }
        HelpCenterArticleSearchResult helpCenterArticleSearchResult = (HelpCenterArticleSearchResult) other;
        return Intrinsics.m18594b(this.articleId, helpCenterArticleSearchResult.articleId) && Intrinsics.m18594b(this.title, helpCenterArticleSearchResult.title) && Intrinsics.m18594b(this.summary, helpCenterArticleSearchResult.summary) && Intrinsics.m18594b(this.matchingSnippet, helpCenterArticleSearchResult.matchingSnippet);
    }

    @NotNull
    public final String getArticleId() {
        return this.articleId;
    }

    @NotNull
    public final String getMatchingSnippet() {
        return this.matchingSnippet;
    }

    @NotNull
    public final String getSummary() {
        return this.summary;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.matchingSnippet.hashCode() + AbstractC0000a.m5b(AbstractC0000a.m5b(this.articleId.hashCode() * 31, 31, this.title), 31, this.summary);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("HelpCenterArticleSearchResult(articleId=");
        sb.append(this.articleId);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", summary=");
        sb.append(this.summary);
        sb.append(", matchingSnippet=");
        return AbstractC0455a.m2241p(sb, this.matchingSnippet, ')');
    }

    public /* synthetic */ HelpCenterArticleSearchResult(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
