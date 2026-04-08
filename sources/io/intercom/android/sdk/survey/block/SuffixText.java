package io.intercom.android.sdk.survey.block;

import androidx.compose.p013ui.graphics.Color;
import androidx.compose.runtime.internal.StabilityInferred;
import io.intercom.android.sdk.models.AttributeType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0019\u001a\u00020\u001aH×\u0001J\t\u0010\u001b\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u00020\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u001d"}, m18302d2 = {"Lio/intercom/android/sdk/survey/block/SuffixText;", "", AttributeType.TEXT, "", "ttsText", "color", "Landroidx/compose/ui/graphics/Color;", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getText", "()Ljava/lang/String;", "getTtsText", "getColor-0d7_KjU", "()J", "J", "component1", "component2", "component3", "component3-0d7_KjU", "copy", "copy-mxwnekA", "(Ljava/lang/String;Ljava/lang/String;J)Lio/intercom/android/sdk/survey/block/SuffixText;", "equals", "", "other", "hashCode", "", "toString", "Companion", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final /* data */ class SuffixText {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final SuffixText NO_SUFFIX;
    private final long color;

    @NotNull
    private final String text;

    @NotNull
    private final String ttsText;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m18302d2 = {"Lio/intercom/android/sdk/survey/block/SuffixText$Companion;", "", "<init>", "()V", "NO_SUFFIX", "Lio/intercom/android/sdk/survey/block/SuffixText;", "getNO_SUFFIX", "()Lio/intercom/android/sdk/survey/block/SuffixText;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SuffixText getNO_SUFFIX() {
            return SuffixText.access$getNO_SUFFIX$cp();
        }

        private Companion() {
        }
    }

    static {
        int i = Color.f17584l;
        NO_SUFFIX = new SuffixText("", "", Color.f17574b, null);
    }

    public /* synthetic */ SuffixText(String str, String str2, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j);
    }

    public static final /* synthetic */ SuffixText access$getNO_SUFFIX$cp() {
        return NO_SUFFIX;
    }

    /* JADX INFO: renamed from: copy-mxwnekA$default, reason: not valid java name */
    public static /* synthetic */ SuffixText m22441copymxwnekA$default(SuffixText suffixText, String str, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = suffixText.text;
        }
        if ((i & 2) != 0) {
            str2 = suffixText.ttsText;
        }
        if ((i & 4) != 0) {
            j = suffixText.color;
        }
        return suffixText.m22443copymxwnekA(str, str2, j);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTtsText() {
        return this.ttsText;
    }

    /* JADX INFO: renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    public final long getColor() {
        return this.color;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-mxwnekA, reason: not valid java name */
    public final SuffixText m22443copymxwnekA(@NotNull String text, @NotNull String ttsText, long color) {
        Intrinsics.m18599g(text, "text");
        Intrinsics.m18599g(ttsText, "ttsText");
        return new SuffixText(text, ttsText, color, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SuffixText)) {
            return false;
        }
        SuffixText suffixText = (SuffixText) other;
        return Intrinsics.m18594b(this.text, suffixText.text) && Intrinsics.m18594b(this.ttsText, suffixText.ttsText) && Color.m5181c(this.color, suffixText.color);
    }

    /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m22444getColor0d7_KjU() {
        return this.color;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final String getTtsText() {
        return this.ttsText;
    }

    public int hashCode() {
        int iM5b = AbstractC0000a.m5b(this.text.hashCode() * 31, 31, this.ttsText);
        long j = this.color;
        int i = Color.f17584l;
        return Long.hashCode(j) + iM5b;
    }

    @NotNull
    public String toString() {
        return "SuffixText(text=" + this.text + ", ttsText=" + this.ttsText + ", color=" + ((Object) Color.m5187i(this.color)) + ')';
    }

    private SuffixText(String text, String ttsText, long j) {
        Intrinsics.m18599g(text, "text");
        Intrinsics.m18599g(ttsText, "ttsText");
        this.text = text;
        this.ttsText = ttsText;
        this.color = j;
    }
}
