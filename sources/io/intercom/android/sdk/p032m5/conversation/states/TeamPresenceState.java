package io.intercom.android.sdk.p032m5.conversation.states;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, m18302d2 = {"Lio/intercom/android/sdk/m5/conversation/states/TeamPresenceState;", "", "expandedTeamPresenceState", "Lio/intercom/android/sdk/m5/conversation/states/ExpandedTeamPresenceState;", "teamIntro", "", "specialNotice", "<init>", "(Lio/intercom/android/sdk/m5/conversation/states/ExpandedTeamPresenceState;Ljava/lang/String;Ljava/lang/String;)V", "getExpandedTeamPresenceState", "()Lio/intercom/android/sdk/m5/conversation/states/ExpandedTeamPresenceState;", "getTeamIntro", "()Ljava/lang/String;", "getSpecialNotice", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class TeamPresenceState {
    public static final int $stable = 8;

    @NotNull
    private final ExpandedTeamPresenceState expandedTeamPresenceState;

    @NotNull
    private final String specialNotice;

    @NotNull
    private final String teamIntro;

    public TeamPresenceState(@NotNull ExpandedTeamPresenceState expandedTeamPresenceState, @NotNull String teamIntro, @NotNull String specialNotice) {
        Intrinsics.m18599g(expandedTeamPresenceState, "expandedTeamPresenceState");
        Intrinsics.m18599g(teamIntro, "teamIntro");
        Intrinsics.m18599g(specialNotice, "specialNotice");
        this.expandedTeamPresenceState = expandedTeamPresenceState;
        this.teamIntro = teamIntro;
        this.specialNotice = specialNotice;
    }

    @NotNull
    public final ExpandedTeamPresenceState getExpandedTeamPresenceState() {
        return this.expandedTeamPresenceState;
    }

    @NotNull
    public final String getSpecialNotice() {
        return this.specialNotice;
    }

    @NotNull
    public final String getTeamIntro() {
        return this.teamIntro;
    }
}
