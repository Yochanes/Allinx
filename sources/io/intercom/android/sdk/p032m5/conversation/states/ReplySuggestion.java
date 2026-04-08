package io.intercom.android.sdk.p032m5.conversation.states;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import io.intercom.android.sdk.models.AttributeType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0010\u001a\u00020\u0011H×\u0001J\t\u0010\u0012\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m18302d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ReplySuggestion;", "", "id", "", AttributeType.TEXT, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getText", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final /* data */ class ReplySuggestion {
    public static final int $stable = 0;

    @NotNull
    private final String id;

    @NotNull
    private final String text;

    public ReplySuggestion(@NotNull String id, @NotNull String text) {
        Intrinsics.m18599g(id, "id");
        Intrinsics.m18599g(text, "text");
        this.id = id;
        this.text = text;
    }

    public static /* synthetic */ ReplySuggestion copy$default(ReplySuggestion replySuggestion, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = replySuggestion.id;
        }
        if ((i & 2) != 0) {
            str2 = replySuggestion.text;
        }
        return replySuggestion.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final ReplySuggestion copy(@NotNull String id, @NotNull String text) {
        Intrinsics.m18599g(id, "id");
        Intrinsics.m18599g(text, "text");
        return new ReplySuggestion(id, text);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReplySuggestion)) {
            return false;
        }
        ReplySuggestion replySuggestion = (ReplySuggestion) other;
        return Intrinsics.m18594b(this.id, replySuggestion.id) && Intrinsics.m18594b(this.text, replySuggestion.text);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.text.hashCode() + (this.id.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("ReplySuggestion(id=");
        sb.append(this.id);
        sb.append(", text=");
        return AbstractC0455a.m2241p(sb, this.text, ')');
    }
}
