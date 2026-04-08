package io.intercom.android.sdk;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0003H×\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0016"}, m18302d2 = {"Lio/intercom/android/sdk/AuthToken;", "", "name", "", "token", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getToken", "setToken", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final /* data */ class AuthToken {
    public static final int $stable = 8;

    @NotNull
    private String name;

    @NotNull
    private String token;

    public AuthToken(@NotNull String name, @NotNull String token) {
        Intrinsics.m18599g(name, "name");
        Intrinsics.m18599g(token, "token");
        this.name = name;
        this.token = token;
    }

    public static /* synthetic */ AuthToken copy$default(AuthToken authToken, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authToken.name;
        }
        if ((i & 2) != 0) {
            str2 = authToken.token;
        }
        return authToken.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @NotNull
    public final AuthToken copy(@NotNull String name, @NotNull String token) {
        Intrinsics.m18599g(name, "name");
        Intrinsics.m18599g(token, "token");
        return new AuthToken(name, token);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthToken)) {
            return false;
        }
        AuthToken authToken = (AuthToken) other;
        return Intrinsics.m18594b(this.name, authToken.name) && Intrinsics.m18594b(this.token, authToken.token);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return this.token.hashCode() + (this.name.hashCode() * 31);
    }

    public final void setName(@NotNull String str) {
        Intrinsics.m18599g(str, "<set-?>");
        this.name = str;
    }

    public final void setToken(@NotNull String str) {
        Intrinsics.m18599g(str, "<set-?>");
        this.token = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("AuthToken(name=");
        sb.append(this.name);
        sb.append(", token=");
        return AbstractC0455a.m2241p(sb, this.token, ')');
    }
}
