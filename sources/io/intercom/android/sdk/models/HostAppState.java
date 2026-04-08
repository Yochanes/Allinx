package io.intercom.android.sdk.models;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@kotlin.Metadata(m18301d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0016H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m18302d2 = {"Lio/intercom/android/sdk/models/HostAppState;", "", "isBackgrounded", "", "sessionStartedSinceLastBackgrounded", "backgroundedTimestamp", "", "<init>", "(ZZJ)V", "()Z", "getSessionStartedSinceLastBackgrounded", "getBackgroundedTimestamp", "()J", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final /* data */ class HostAppState {
    public static final int $stable = 0;

    @JvmField
    @NotNull
    public static final HostAppState NULL = new HostAppState(false, false, 0, 7, null);
    private final long backgroundedTimestamp;
    private final boolean isBackgrounded;
    private final boolean sessionStartedSinceLastBackgrounded;

    public HostAppState() {
        this(false, false, 0L, 7, null);
    }

    public static /* synthetic */ HostAppState copy$default(HostAppState hostAppState, boolean z2, boolean z3, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            z2 = hostAppState.isBackgrounded;
        }
        if ((i & 2) != 0) {
            z3 = hostAppState.sessionStartedSinceLastBackgrounded;
        }
        if ((i & 4) != 0) {
            j = hostAppState.backgroundedTimestamp;
        }
        return hostAppState.copy(z2, z3, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsBackgrounded() {
        return this.isBackgrounded;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getSessionStartedSinceLastBackgrounded() {
        return this.sessionStartedSinceLastBackgrounded;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getBackgroundedTimestamp() {
        return this.backgroundedTimestamp;
    }

    @NotNull
    public final HostAppState copy(boolean isBackgrounded, boolean sessionStartedSinceLastBackgrounded, long backgroundedTimestamp) {
        return new HostAppState(isBackgrounded, sessionStartedSinceLastBackgrounded, backgroundedTimestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HostAppState)) {
            return false;
        }
        HostAppState hostAppState = (HostAppState) other;
        return this.isBackgrounded == hostAppState.isBackgrounded && this.sessionStartedSinceLastBackgrounded == hostAppState.sessionStartedSinceLastBackgrounded && this.backgroundedTimestamp == hostAppState.backgroundedTimestamp;
    }

    public final long getBackgroundedTimestamp() {
        return this.backgroundedTimestamp;
    }

    public final boolean getSessionStartedSinceLastBackgrounded() {
        return this.sessionStartedSinceLastBackgrounded;
    }

    public int hashCode() {
        return Long.hashCode(this.backgroundedTimestamp) + AbstractC0455a.m2230e(Boolean.hashCode(this.isBackgrounded) * 31, 31, this.sessionStartedSinceLastBackgrounded);
    }

    public final boolean isBackgrounded() {
        return this.isBackgrounded;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("HostAppState(isBackgrounded=");
        sb.append(this.isBackgrounded);
        sb.append(", sessionStartedSinceLastBackgrounded=");
        sb.append(this.sessionStartedSinceLastBackgrounded);
        sb.append(", backgroundedTimestamp=");
        return AbstractC0455a.m2240o(sb, this.backgroundedTimestamp, ')');
    }

    public HostAppState(boolean z2, boolean z3, long j) {
        this.isBackgrounded = z2;
        this.sessionStartedSinceLastBackgrounded = z3;
        this.backgroundedTimestamp = j;
    }

    public /* synthetic */ HostAppState(boolean z2, boolean z3, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z2, (i & 2) != 0 ? false : z3, (i & 4) != 0 ? 0L : j);
    }
}
