package io.intercom.android.sdk.lightcompressor.config;

import androidx.compose.animation.AbstractC0455a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m18302d2 = {"Lio/intercom/android/sdk/lightcompressor/config/SharedStorageConfiguration;", "", "saveAt", "Lio/intercom/android/sdk/lightcompressor/config/SaveLocation;", "subFolderName", "", "<init>", "(Lio/intercom/android/sdk/lightcompressor/config/SaveLocation;Ljava/lang/String;)V", "getSaveAt", "()Lio/intercom/android/sdk/lightcompressor/config/SaveLocation;", "setSaveAt", "(Lio/intercom/android/sdk/lightcompressor/config/SaveLocation;)V", "getSubFolderName", "()Ljava/lang/String;", "setSubFolderName", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "intercom-sdk-lightcompressor_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final /* data */ class SharedStorageConfiguration {

    @Nullable
    private SaveLocation saveAt;

    @Nullable
    private String subFolderName;

    public SharedStorageConfiguration() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ SharedStorageConfiguration copy$default(SharedStorageConfiguration sharedStorageConfiguration, SaveLocation saveLocation, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            saveLocation = sharedStorageConfiguration.saveAt;
        }
        if ((i & 2) != 0) {
            str = sharedStorageConfiguration.subFolderName;
        }
        return sharedStorageConfiguration.copy(saveLocation, str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SaveLocation getSaveAt() {
        return this.saveAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubFolderName() {
        return this.subFolderName;
    }

    @NotNull
    public final SharedStorageConfiguration copy(@Nullable SaveLocation saveAt, @Nullable String subFolderName) {
        return new SharedStorageConfiguration(saveAt, subFolderName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SharedStorageConfiguration)) {
            return false;
        }
        SharedStorageConfiguration sharedStorageConfiguration = (SharedStorageConfiguration) other;
        return this.saveAt == sharedStorageConfiguration.saveAt && Intrinsics.m18594b(this.subFolderName, sharedStorageConfiguration.subFolderName);
    }

    @Nullable
    public final SaveLocation getSaveAt() {
        return this.saveAt;
    }

    @Nullable
    public final String getSubFolderName() {
        return this.subFolderName;
    }

    public int hashCode() {
        SaveLocation saveLocation = this.saveAt;
        int iHashCode = (saveLocation == null ? 0 : saveLocation.hashCode()) * 31;
        String str = this.subFolderName;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final void setSaveAt(@Nullable SaveLocation saveLocation) {
        this.saveAt = saveLocation;
    }

    public final void setSubFolderName(@Nullable String str) {
        this.subFolderName = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("SharedStorageConfiguration(saveAt=");
        sb.append(this.saveAt);
        sb.append(", subFolderName=");
        return AbstractC0455a.m2241p(sb, this.subFolderName, ')');
    }

    public SharedStorageConfiguration(@Nullable SaveLocation saveLocation, @Nullable String str) {
        this.saveAt = saveLocation;
        this.subFolderName = str;
    }

    public /* synthetic */ SharedStorageConfiguration(SaveLocation saveLocation, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : saveLocation, (i & 2) != 0 ? null : str);
    }
}
