package io.intercom.android.sdk.models;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@kotlin.Metadata(m18301d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u0000 &2\u00020\u0001:\u0001&B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003JK\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÇ\u0001J\u0013\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010#\u001a\u00020$H×\u0001J\t\u0010%\u001a\u00020\tH×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, m18302d2 = {"Lio/intercom/android/sdk/models/AttachmentSettings;", "", "cameraEnabled", "", "mediaEnabled", "filesEnabled", "gifsEnabled", "trustedFileExtensions", "", "", "uploadSizeLimit", "", "<init>", "(ZZZZLjava/util/Set;J)V", "getCameraEnabled", "()Z", "getMediaEnabled", "getFilesEnabled", "getGifsEnabled", "getTrustedFileExtensions", "()Ljava/util/Set;", "getUploadSizeLimit", "()J", "uploadSizeLimitMB", "getUploadSizeLimitMB", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final /* data */ class AttachmentSettings {

    @SerializedName("conversation_camera_enabled")
    private final boolean cameraEnabled;

    @SerializedName("conversation_files_enabled")
    private final boolean filesEnabled;

    @SerializedName("conversation_gifs_enabled")
    private final boolean gifsEnabled;

    @SerializedName("conversation_media_enabled")
    private final boolean mediaEnabled;

    @SerializedName("file_upload_extension_trusted_list")
    @NotNull
    private final Set<String> trustedFileExtensions;

    @SerializedName("upload_size_limit")
    private final long uploadSizeLimit;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final long DEFAULT_UPLOAD_SIZE_LIMIT = 104857600;

    @NotNull
    private static final AttachmentSettings DEFAULT = new AttachmentSettings(true, true, true, true, EmptySet.f51498a, DEFAULT_UPLOAD_SIZE_LIMIT);

    /* JADX INFO: compiled from: Proguard */
    @kotlin.Metadata(m18301d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m18302d2 = {"Lio/intercom/android/sdk/models/AttachmentSettings$Companion;", "", "<init>", "()V", "DEFAULT_UPLOAD_SIZE_LIMIT", "", "DEFAULT", "Lio/intercom/android/sdk/models/AttachmentSettings;", "getDEFAULT", "()Lio/intercom/android/sdk/models/AttachmentSettings;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AttachmentSettings getDEFAULT() {
            return AttachmentSettings.access$getDEFAULT$cp();
        }

        private Companion() {
        }
    }

    public AttachmentSettings(boolean z2, boolean z3, boolean z4, boolean z5, @NotNull Set<String> trustedFileExtensions, long j) {
        Intrinsics.m18599g(trustedFileExtensions, "trustedFileExtensions");
        this.cameraEnabled = z2;
        this.mediaEnabled = z3;
        this.filesEnabled = z4;
        this.gifsEnabled = z5;
        this.trustedFileExtensions = trustedFileExtensions;
        this.uploadSizeLimit = j;
    }

    public static final /* synthetic */ AttachmentSettings access$getDEFAULT$cp() {
        return DEFAULT;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AttachmentSettings copy$default(AttachmentSettings attachmentSettings, boolean z2, boolean z3, boolean z4, boolean z5, Set set, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            z2 = attachmentSettings.cameraEnabled;
        }
        if ((i & 2) != 0) {
            z3 = attachmentSettings.mediaEnabled;
        }
        if ((i & 4) != 0) {
            z4 = attachmentSettings.filesEnabled;
        }
        if ((i & 8) != 0) {
            z5 = attachmentSettings.gifsEnabled;
        }
        if ((i & 16) != 0) {
            set = attachmentSettings.trustedFileExtensions;
        }
        if ((i & 32) != 0) {
            j = attachmentSettings.uploadSizeLimit;
        }
        long j2 = j;
        Set set2 = set;
        boolean z6 = z4;
        return attachmentSettings.copy(z2, z3, z6, z5, set2, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getCameraEnabled() {
        return this.cameraEnabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getMediaEnabled() {
        return this.mediaEnabled;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getFilesEnabled() {
        return this.filesEnabled;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getGifsEnabled() {
        return this.gifsEnabled;
    }

    @NotNull
    public final Set<String> component5() {
        return this.trustedFileExtensions;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getUploadSizeLimit() {
        return this.uploadSizeLimit;
    }

    @NotNull
    public final AttachmentSettings copy(boolean cameraEnabled, boolean mediaEnabled, boolean filesEnabled, boolean gifsEnabled, @NotNull Set<String> trustedFileExtensions, long uploadSizeLimit) {
        Intrinsics.m18599g(trustedFileExtensions, "trustedFileExtensions");
        return new AttachmentSettings(cameraEnabled, mediaEnabled, filesEnabled, gifsEnabled, trustedFileExtensions, uploadSizeLimit);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AttachmentSettings)) {
            return false;
        }
        AttachmentSettings attachmentSettings = (AttachmentSettings) other;
        return this.cameraEnabled == attachmentSettings.cameraEnabled && this.mediaEnabled == attachmentSettings.mediaEnabled && this.filesEnabled == attachmentSettings.filesEnabled && this.gifsEnabled == attachmentSettings.gifsEnabled && Intrinsics.m18594b(this.trustedFileExtensions, attachmentSettings.trustedFileExtensions) && this.uploadSizeLimit == attachmentSettings.uploadSizeLimit;
    }

    public final boolean getCameraEnabled() {
        return this.cameraEnabled;
    }

    public final boolean getFilesEnabled() {
        return this.filesEnabled;
    }

    public final boolean getGifsEnabled() {
        return this.gifsEnabled;
    }

    public final boolean getMediaEnabled() {
        return this.mediaEnabled;
    }

    @NotNull
    public final Set<String> getTrustedFileExtensions() {
        return this.trustedFileExtensions;
    }

    public final long getUploadSizeLimit() {
        return this.uploadSizeLimit;
    }

    @NotNull
    public final String getUploadSizeLimitMB() {
        return String.valueOf(this.uploadSizeLimit / ((long) 1048576));
    }

    public int hashCode() {
        return Long.hashCode(this.uploadSizeLimit) + ((this.trustedFileExtensions.hashCode() + AbstractC0455a.m2230e(AbstractC0455a.m2230e(AbstractC0455a.m2230e(Boolean.hashCode(this.cameraEnabled) * 31, 31, this.mediaEnabled), 31, this.filesEnabled), 31, this.gifsEnabled)) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("AttachmentSettings(cameraEnabled=");
        sb.append(this.cameraEnabled);
        sb.append(", mediaEnabled=");
        sb.append(this.mediaEnabled);
        sb.append(", filesEnabled=");
        sb.append(this.filesEnabled);
        sb.append(", gifsEnabled=");
        sb.append(this.gifsEnabled);
        sb.append(", trustedFileExtensions=");
        sb.append(this.trustedFileExtensions);
        sb.append(", uploadSizeLimit=");
        return AbstractC0455a.m2240o(sb, this.uploadSizeLimit, ')');
    }
}
