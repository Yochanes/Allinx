package io.intercom.android.sdk;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0012\u001a\u00020\u0003H×\u0001J\t\u0010\u0013\u001a\u00020\u0005H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m18302d2 = {"Lio/intercom/android/sdk/IntercomError;", "", "errorCode", "", "errorMessage", "", "<init>", "(ILjava/lang/String;)V", "getErrorCode", "()I", "getErrorMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final /* data */ class IntercomError {
    public static final int $stable = 0;
    private final int errorCode;

    @NotNull
    private final String errorMessage;

    public IntercomError() {
        this(0, null, 3, null);
    }

    public static /* synthetic */ IntercomError copy$default(IntercomError intercomError, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = intercomError.errorCode;
        }
        if ((i2 & 2) != 0) {
            str = intercomError.errorMessage;
        }
        return intercomError.copy(i, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @NotNull
    public final IntercomError copy(int errorCode, @NotNull String errorMessage) {
        Intrinsics.m18599g(errorMessage, "errorMessage");
        return new IntercomError(errorCode, errorMessage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntercomError)) {
            return false;
        }
        IntercomError intercomError = (IntercomError) other;
        return this.errorCode == intercomError.errorCode && Intrinsics.m18594b(this.errorMessage, intercomError.errorMessage);
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public int hashCode() {
        return this.errorMessage.hashCode() + (Integer.hashCode(this.errorCode) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("IntercomError(errorCode=");
        sb.append(this.errorCode);
        sb.append(", errorMessage=");
        return AbstractC0455a.m2241p(sb, this.errorMessage, ')');
    }

    public IntercomError(int i, @NotNull String errorMessage) {
        Intrinsics.m18599g(errorMessage, "errorMessage");
        this.errorCode = i;
        this.errorMessage = errorMessage;
    }

    public /* synthetic */ IntercomError(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str);
    }
}
