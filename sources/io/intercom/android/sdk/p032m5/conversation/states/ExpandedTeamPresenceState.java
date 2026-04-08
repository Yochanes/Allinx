package io.intercom.android.sdk.p032m5.conversation.states;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import io.intercom.android.sdk.models.AvatarType;
import io.intercom.android.sdk.models.Header;
import io.intercom.android.sdk.p032m5.components.avatar.AvatarWrapper;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u0000 +2\u00020\u0001:\u0001+BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\u0005HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\u0005HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0010HÆ\u0003Jg\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÇ\u0001J\u0013\u0010&\u001a\u00020\u00102\b\u0010'\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010(\u001a\u00020)H×\u0001J\t\u0010*\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006,"}, m18302d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ExpandedTeamPresenceState;", "", "title", "", "body", "", "Lio/intercom/android/sdk/models/Header$Expanded$Body;", "avatarType", "Lio/intercom/android/sdk/models/AvatarType;", "avatars", "Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "footers", "Lio/intercom/android/sdk/models/Header$Expanded$Footer;", "socialAccounts", "Lio/intercom/android/sdk/models/Header$Expanded$SocialAccount;", "displayActiveIndicator", "", "<init>", "(Ljava/lang/String;Ljava/util/List;Lio/intercom/android/sdk/models/AvatarType;Ljava/util/List;Ljava/util/List;Ljava/util/List;Z)V", "getTitle", "()Ljava/lang/String;", "getBody", "()Ljava/util/List;", "getAvatarType", "()Lio/intercom/android/sdk/models/AvatarType;", "getAvatars", "getFooters", "getSocialAccounts", "getDisplayActiveIndicator", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final /* data */ class ExpandedTeamPresenceState {

    /* JADX INFO: renamed from: default, reason: not valid java name */
    @NotNull
    private static final ExpandedTeamPresenceState f59578default;

    @NotNull
    private final AvatarType avatarType;

    @NotNull
    private final List<AvatarWrapper> avatars;

    @NotNull
    private final List<Header.Expanded.Body> body;
    private final boolean displayActiveIndicator;

    @NotNull
    private final List<Header.Expanded.Footer> footers;

    @NotNull
    private final List<Header.Expanded.SocialAccount> socialAccounts;

    @NotNull
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m18302d2 = {"Lio/intercom/android/sdk/m5/conversation/states/ExpandedTeamPresenceState$Companion;", "", "<init>", "()V", "default", "Lio/intercom/android/sdk/m5/conversation/states/ExpandedTeamPresenceState;", "getDefault", "()Lio/intercom/android/sdk/m5/conversation/states/ExpandedTeamPresenceState;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ExpandedTeamPresenceState getDefault() {
            return ExpandedTeamPresenceState.access$getDefault$cp();
        }

        private Companion() {
        }
    }

    static {
        EmptyList emptyList = EmptyList.f51496a;
        f59578default = new ExpandedTeamPresenceState("", emptyList, AvatarType.UNKNOWN, emptyList, emptyList, emptyList, false);
    }

    public ExpandedTeamPresenceState(@NotNull String title, @NotNull List<Header.Expanded.Body> body, @NotNull AvatarType avatarType, @NotNull List<AvatarWrapper> avatars, @NotNull List<Header.Expanded.Footer> footers, @NotNull List<Header.Expanded.SocialAccount> socialAccounts, boolean z2) {
        Intrinsics.m18599g(title, "title");
        Intrinsics.m18599g(body, "body");
        Intrinsics.m18599g(avatarType, "avatarType");
        Intrinsics.m18599g(avatars, "avatars");
        Intrinsics.m18599g(footers, "footers");
        Intrinsics.m18599g(socialAccounts, "socialAccounts");
        this.title = title;
        this.body = body;
        this.avatarType = avatarType;
        this.avatars = avatars;
        this.footers = footers;
        this.socialAccounts = socialAccounts;
        this.displayActiveIndicator = z2;
    }

    public static final /* synthetic */ ExpandedTeamPresenceState access$getDefault$cp() {
        return f59578default;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExpandedTeamPresenceState copy$default(ExpandedTeamPresenceState expandedTeamPresenceState, String str, List list, AvatarType avatarType, List list2, List list3, List list4, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = expandedTeamPresenceState.title;
        }
        if ((i & 2) != 0) {
            list = expandedTeamPresenceState.body;
        }
        if ((i & 4) != 0) {
            avatarType = expandedTeamPresenceState.avatarType;
        }
        if ((i & 8) != 0) {
            list2 = expandedTeamPresenceState.avatars;
        }
        if ((i & 16) != 0) {
            list3 = expandedTeamPresenceState.footers;
        }
        if ((i & 32) != 0) {
            list4 = expandedTeamPresenceState.socialAccounts;
        }
        if ((i & 64) != 0) {
            z2 = expandedTeamPresenceState.displayActiveIndicator;
        }
        List list5 = list4;
        boolean z3 = z2;
        List list6 = list3;
        AvatarType avatarType2 = avatarType;
        return expandedTeamPresenceState.copy(str, list, avatarType2, list2, list6, list5, z3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final List<Header.Expanded.Body> component2() {
        return this.body;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final AvatarType getAvatarType() {
        return this.avatarType;
    }

    @NotNull
    public final List<AvatarWrapper> component4() {
        return this.avatars;
    }

    @NotNull
    public final List<Header.Expanded.Footer> component5() {
        return this.footers;
    }

    @NotNull
    public final List<Header.Expanded.SocialAccount> component6() {
        return this.socialAccounts;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getDisplayActiveIndicator() {
        return this.displayActiveIndicator;
    }

    @NotNull
    public final ExpandedTeamPresenceState copy(@NotNull String title, @NotNull List<Header.Expanded.Body> body, @NotNull AvatarType avatarType, @NotNull List<AvatarWrapper> avatars, @NotNull List<Header.Expanded.Footer> footers, @NotNull List<Header.Expanded.SocialAccount> socialAccounts, boolean displayActiveIndicator) {
        Intrinsics.m18599g(title, "title");
        Intrinsics.m18599g(body, "body");
        Intrinsics.m18599g(avatarType, "avatarType");
        Intrinsics.m18599g(avatars, "avatars");
        Intrinsics.m18599g(footers, "footers");
        Intrinsics.m18599g(socialAccounts, "socialAccounts");
        return new ExpandedTeamPresenceState(title, body, avatarType, avatars, footers, socialAccounts, displayActiveIndicator);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExpandedTeamPresenceState)) {
            return false;
        }
        ExpandedTeamPresenceState expandedTeamPresenceState = (ExpandedTeamPresenceState) other;
        return Intrinsics.m18594b(this.title, expandedTeamPresenceState.title) && Intrinsics.m18594b(this.body, expandedTeamPresenceState.body) && this.avatarType == expandedTeamPresenceState.avatarType && Intrinsics.m18594b(this.avatars, expandedTeamPresenceState.avatars) && Intrinsics.m18594b(this.footers, expandedTeamPresenceState.footers) && Intrinsics.m18594b(this.socialAccounts, expandedTeamPresenceState.socialAccounts) && this.displayActiveIndicator == expandedTeamPresenceState.displayActiveIndicator;
    }

    @NotNull
    public final AvatarType getAvatarType() {
        return this.avatarType;
    }

    @NotNull
    public final List<AvatarWrapper> getAvatars() {
        return this.avatars;
    }

    @NotNull
    public final List<Header.Expanded.Body> getBody() {
        return this.body;
    }

    public final boolean getDisplayActiveIndicator() {
        return this.displayActiveIndicator;
    }

    @NotNull
    public final List<Header.Expanded.Footer> getFooters() {
        return this.footers;
    }

    @NotNull
    public final List<Header.Expanded.SocialAccount> getSocialAccounts() {
        return this.socialAccounts;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return Boolean.hashCode(this.displayActiveIndicator) + AbstractC0455a.m2233h(this.socialAccounts, AbstractC0455a.m2233h(this.footers, AbstractC0455a.m2233h(this.avatars, (this.avatarType.hashCode() + AbstractC0455a.m2233h(this.body, this.title.hashCode() * 31, 31)) * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("ExpandedTeamPresenceState(title=");
        sb.append(this.title);
        sb.append(", body=");
        sb.append(this.body);
        sb.append(", avatarType=");
        sb.append(this.avatarType);
        sb.append(", avatars=");
        sb.append(this.avatars);
        sb.append(", footers=");
        sb.append(this.footers);
        sb.append(", socialAccounts=");
        sb.append(this.socialAccounts);
        sb.append(", displayActiveIndicator=");
        return AbstractC0455a.m2243r(sb, this.displayActiveIndicator, ')');
    }
}
