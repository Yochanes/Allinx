package io.intercom.android.sdk.lightcompressor.config;

import androidx.compose.animation.AbstractC0455a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0011"}, m18302d2 = {"Lio/intercom/android/sdk/lightcompressor/config/AppSpecificStorageConfiguration;", "", "subFolderName", "", "<init>", "(Ljava/lang/String;)V", "getSubFolderName", "()Ljava/lang/String;", "setSubFolderName", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "intercom-sdk-lightcompressor_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final /* data */ class AppSpecificStorageConfiguration {

    @Nullable
    private String subFolderName;

    public AppSpecificStorageConfiguration() {
        this(null, 1, null);
    }

    public static /* synthetic */ AppSpecificStorageConfiguration copy$default(AppSpecificStorageConfiguration appSpecificStorageConfiguration, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appSpecificStorageConfiguration.subFolderName;
        }
        return appSpecificStorageConfiguration.copy(str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSubFolderName() {
        return this.subFolderName;
    }

    @NotNull
    public final AppSpecificStorageConfiguration copy(@Nullable String subFolderName) {
        return new AppSpecificStorageConfiguration(subFolderName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AppSpecificStorageConfiguration) && Intrinsics.m18594b(this.subFolderName, ((AppSpecificStorageConfiguration) other).subFolderName);
    }

    @Nullable
    public final String getSubFolderName() {
        return this.subFolderName;
    }

    public int hashCode() {
        String str = this.subFolderName;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setSubFolderName(@Nullable String str) {
        this.subFolderName = str;
    }

    @NotNull
    public String toString() {
        return AbstractC0455a.m2241p(new StringBuilder("AppSpecificStorageConfiguration(subFolderName="), this.subFolderName, ')');
    }

    public AppSpecificStorageConfiguration(@Nullable String str) {
        this.subFolderName = str;
    }

    public /* synthetic */ AppSpecificStorageConfiguration(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
