package io.intercom.android.sdk.models;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@kotlin.Metadata(m18301d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u001a2\u00020\u0001:\u0002\u0019\u001aB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\f\u001a\u00020\rH\u0002J\u0006\u0010\u000e\u001a\u00020\u0005J\u0006\u0010\u000f\u001a\u00020\u0005J\t\u0010\u0010\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\t\u0010\u0018\u001a\u00020\u0003H×\u0001R\u0010\u0010\u0002\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001b"}, m18302d2 = {"Lio/intercom/android/sdk/models/ComposerState;", "", "visibility", "", "isWorkflowActive", "", "placeholder", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "()Z", "getPlaceholder", "()Ljava/lang/String;", "getComposerVisibility", "Lio/intercom/android/sdk/models/ComposerState$ComposerVisibility;", "isVisible", "isDisabled", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "ComposerVisibility", "Companion", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final /* data */ class ComposerState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ComposerState NULL = new ComposerState("visible_and_enabled", false, "");

    @SerializedName("workflow_active")
    private final boolean isWorkflowActive;

    @SerializedName("placeholder")
    @NotNull
    private final String placeholder;

    @SerializedName("visibility")
    @NotNull
    private final String visibility;

    /* JADX INFO: compiled from: Proguard */
    @kotlin.Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m18302d2 = {"Lio/intercom/android/sdk/models/ComposerState$Companion;", "", "<init>", "()V", "NULL", "Lio/intercom/android/sdk/models/ComposerState;", "getNULL", "()Lio/intercom/android/sdk/models/ComposerState;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ComposerState getNULL() {
            return ComposerState.access$getNULL$cp();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @kotlin.Metadata(m18301d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m18302d2 = {"Lio/intercom/android/sdk/models/ComposerState$ComposerVisibility;", "", "VisibleAndDisabled", "VisibleAndEnabled", "Hidden", "Lio/intercom/android/sdk/models/ComposerState$ComposerVisibility$Hidden;", "Lio/intercom/android/sdk/models/ComposerState$ComposerVisibility$VisibleAndDisabled;", "Lio/intercom/android/sdk/models/ComposerState$ComposerVisibility$VisibleAndEnabled;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public interface ComposerVisibility {

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @kotlin.Metadata(m18301d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, m18302d2 = {"Lio/intercom/android/sdk/models/ComposerState$ComposerVisibility$Hidden;", "Lio/intercom/android/sdk/models/ComposerState$ComposerVisibility;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
        public static final /* data */ class Hidden implements ComposerVisibility {
            public static final int $stable = 0;

            @NotNull
            public static final Hidden INSTANCE = new Hidden();

            private Hidden() {
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof Hidden);
            }

            public int hashCode() {
                return 421902457;
            }

            @NotNull
            public String toString() {
                return "Hidden";
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @kotlin.Metadata(m18301d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, m18302d2 = {"Lio/intercom/android/sdk/models/ComposerState$ComposerVisibility$VisibleAndDisabled;", "Lio/intercom/android/sdk/models/ComposerState$ComposerVisibility;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
        public static final /* data */ class VisibleAndDisabled implements ComposerVisibility {
            public static final int $stable = 0;

            @NotNull
            public static final VisibleAndDisabled INSTANCE = new VisibleAndDisabled();

            private VisibleAndDisabled() {
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof VisibleAndDisabled);
            }

            public int hashCode() {
                return 1977747952;
            }

            @NotNull
            public String toString() {
                return "VisibleAndDisabled";
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @StabilityInferred
        @kotlin.Metadata(m18301d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, m18302d2 = {"Lio/intercom/android/sdk/models/ComposerState$ComposerVisibility$VisibleAndEnabled;", "Lio/intercom/android/sdk/models/ComposerState$ComposerVisibility;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
        public static final /* data */ class VisibleAndEnabled implements ComposerVisibility {
            public static final int $stable = 0;

            @NotNull
            public static final VisibleAndEnabled INSTANCE = new VisibleAndEnabled();

            private VisibleAndEnabled() {
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof VisibleAndEnabled);
            }

            public int hashCode() {
                return -861799091;
            }

            @NotNull
            public String toString() {
                return "VisibleAndEnabled";
            }
        }
    }

    public ComposerState(@NotNull String visibility, boolean z2, @NotNull String placeholder) {
        Intrinsics.m18599g(visibility, "visibility");
        Intrinsics.m18599g(placeholder, "placeholder");
        this.visibility = visibility;
        this.isWorkflowActive = z2;
        this.placeholder = placeholder;
    }

    public static final /* synthetic */ ComposerState access$getNULL$cp() {
        return NULL;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final String getVisibility() {
        return this.visibility;
    }

    public static /* synthetic */ ComposerState copy$default(ComposerState composerState, String str, boolean z2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = composerState.visibility;
        }
        if ((i & 2) != 0) {
            z2 = composerState.isWorkflowActive;
        }
        if ((i & 4) != 0) {
            str2 = composerState.placeholder;
        }
        return composerState.copy(str, z2, str2);
    }

    private final ComposerVisibility getComposerVisibility() {
        String str = this.visibility;
        int iHashCode = str.hashCode();
        if (iHashCode != -1217487446) {
            if (iHashCode != -888711535) {
                if (iHashCode == 1262491788 && str.equals("visible_and_enabled")) {
                    return ComposerVisibility.VisibleAndEnabled.INSTANCE;
                }
            } else if (str.equals("visible_and_disabled")) {
                return ComposerVisibility.VisibleAndDisabled.INSTANCE;
            }
        } else if (str.equals("hidden")) {
            return ComposerVisibility.Hidden.INSTANCE;
        }
        return ComposerVisibility.VisibleAndEnabled.INSTANCE;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsWorkflowActive() {
        return this.isWorkflowActive;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @NotNull
    public final ComposerState copy(@NotNull String visibility, boolean isWorkflowActive, @NotNull String placeholder) {
        Intrinsics.m18599g(visibility, "visibility");
        Intrinsics.m18599g(placeholder, "placeholder");
        return new ComposerState(visibility, isWorkflowActive, placeholder);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComposerState)) {
            return false;
        }
        ComposerState composerState = (ComposerState) other;
        return Intrinsics.m18594b(this.visibility, composerState.visibility) && this.isWorkflowActive == composerState.isWorkflowActive && Intrinsics.m18594b(this.placeholder, composerState.placeholder);
    }

    @NotNull
    public final String getPlaceholder() {
        return this.placeholder;
    }

    public int hashCode() {
        return this.placeholder.hashCode() + AbstractC0455a.m2230e(this.visibility.hashCode() * 31, 31, this.isWorkflowActive);
    }

    public final boolean isDisabled() {
        return Intrinsics.m18594b(getComposerVisibility(), ComposerVisibility.VisibleAndDisabled.INSTANCE);
    }

    public final boolean isVisible() {
        return !Intrinsics.m18594b(getComposerVisibility(), ComposerVisibility.Hidden.INSTANCE);
    }

    public final boolean isWorkflowActive() {
        return this.isWorkflowActive;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("ComposerState(visibility=");
        sb.append(this.visibility);
        sb.append(", isWorkflowActive=");
        sb.append(this.isWorkflowActive);
        sb.append(", placeholder=");
        return AbstractC0455a.m2241p(sb, this.placeholder, ')');
    }
}
