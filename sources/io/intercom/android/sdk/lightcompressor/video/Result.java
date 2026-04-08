package io.intercom.android.sdk.lightcompressor.video;

import androidx.compose.animation.AbstractC0455a;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0017\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J?\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012¨\u0006 "}, m18302d2 = {"Lio/intercom/android/sdk/lightcompressor/video/Result;", "", FirebaseAnalytics.Param.INDEX, "", FirebaseAnalytics.Param.SUCCESS, "", "failureMessage", "", "size", "", "path", "<init>", "(IZLjava/lang/String;JLjava/lang/String;)V", "getIndex", "()I", "getSuccess", "()Z", "getFailureMessage", "()Ljava/lang/String;", "getSize", "()J", "getPath", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "intercom-sdk-lightcompressor_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final /* data */ class Result {

    @Nullable
    private final String failureMessage;
    private final int index;

    @Nullable
    private final String path;
    private final long size;
    private final boolean success;

    public Result(int i, boolean z2, @Nullable String str, long j, @Nullable String str2) {
        this.index = i;
        this.success = z2;
        this.failureMessage = str;
        this.size = j;
        this.path = str2;
    }

    public static /* synthetic */ Result copy$default(Result result, int i, boolean z2, String str, long j, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = result.index;
        }
        if ((i2 & 2) != 0) {
            z2 = result.success;
        }
        if ((i2 & 4) != 0) {
            str = result.failureMessage;
        }
        if ((i2 & 8) != 0) {
            j = result.size;
        }
        if ((i2 & 16) != 0) {
            str2 = result.path;
        }
        String str3 = str2;
        String str4 = str;
        return result.copy(i, z2, str4, j, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFailureMessage() {
        return this.failureMessage;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    @NotNull
    public final Result copy(int index, boolean success, @Nullable String failureMessage, long size, @Nullable String path) {
        return new Result(index, success, failureMessage, size, path);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Result)) {
            return false;
        }
        Result result = (Result) other;
        return this.index == result.index && this.success == result.success && Intrinsics.m18594b(this.failureMessage, result.failureMessage) && this.size == result.size && Intrinsics.m18594b(this.path, result.path);
    }

    @Nullable
    public final String getFailureMessage() {
        return this.failureMessage;
    }

    public final int getIndex() {
        return this.index;
    }

    @Nullable
    public final String getPath() {
        return this.path;
    }

    public final long getSize() {
        return this.size;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int iM2230e = AbstractC0455a.m2230e(Integer.hashCode(this.index) * 31, 31, this.success);
        String str = this.failureMessage;
        int iM2231f = AbstractC0455a.m2231f(this.size, (iM2230e + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.path;
        return iM2231f + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Result(index=");
        sb.append(this.index);
        sb.append(", success=");
        sb.append(this.success);
        sb.append(", failureMessage=");
        sb.append(this.failureMessage);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(", path=");
        return AbstractC0455a.m2241p(sb, this.path, ')');
    }

    public /* synthetic */ Result(int i, boolean z2, String str, long j, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z2, str, (i2 & 8) != 0 ? 0L : j, (i2 & 16) != 0 ? null : str2);
    }
}
