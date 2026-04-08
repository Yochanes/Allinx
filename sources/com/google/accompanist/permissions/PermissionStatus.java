package com.google.accompanist.permissions;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Stable
@ExperimentalPermissionsApi
@Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m18302d2 = {"Lcom/google/accompanist/permissions/PermissionStatus;", "", "Denied", "Granted", "Lcom/google/accompanist/permissions/PermissionStatus$Denied;", "Lcom/google/accompanist/permissions/PermissionStatus$Granted;", "permissions_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface PermissionStatus {

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m18302d2 = {"Lcom/google/accompanist/permissions/PermissionStatus$Denied;", "Lcom/google/accompanist/permissions/PermissionStatus;", "shouldShowRationale", "", "(Z)V", "getShouldShowRationale", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "permissions_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final /* data */ class Denied implements PermissionStatus {
        public static final int $stable = 0;
        private final boolean shouldShowRationale;

        public Denied(boolean z2) {
            this.shouldShowRationale = z2;
        }

        public static /* synthetic */ Denied copy$default(Denied denied, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z2 = denied.shouldShowRationale;
            }
            return denied.copy(z2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getShouldShowRationale() {
            return this.shouldShowRationale;
        }

        @NotNull
        public final Denied copy(boolean shouldShowRationale) {
            return new Denied(shouldShowRationale);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Denied) && this.shouldShowRationale == ((Denied) other).shouldShowRationale;
        }

        public final boolean getShouldShowRationale() {
            return this.shouldShowRationale;
        }

        public int hashCode() {
            return Boolean.hashCode(this.shouldShowRationale);
        }

        @NotNull
        public String toString() {
            return AbstractC0455a.m2243r(new StringBuilder("Denied(shouldShowRationale="), this.shouldShowRationale, ')');
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m18302d2 = {"Lcom/google/accompanist/permissions/PermissionStatus$Granted;", "Lcom/google/accompanist/permissions/PermissionStatus;", "()V", "permissions_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Granted implements PermissionStatus {
        public static final int $stable = 0;

        @NotNull
        public static final Granted INSTANCE = new Granted();

        private Granted() {
        }
    }
}
