package io.intercom.android.sdk.models;

import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import io.intercom.android.sdk.utilities.NullSafety;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@AutoValue
public abstract class Upload {

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder {

        @Nullable
        String acl;

        @Nullable
        String aws_access_key;

        @Nullable
        String content_type;

        /* JADX INFO: renamed from: id */
        int f44374id;

        @Nullable
        String key;

        @Nullable
        UploadMetadata metadata;

        @Nullable
        String policy;

        @Nullable
        String public_url;

        @Nullable
        String signature;

        @Nullable
        String success_action_status;

        @Nullable
        String upload_destination;

        private UploadMetadata defaultMetadataBuilder() {
            UploadMetadata uploadMetadata = this.metadata;
            return uploadMetadata != null ? uploadMetadata : new UploadMetadata("");
        }

        public Upload build() {
            return new AutoValue_Upload(this.f44374id, NullSafety.valueOrEmpty(this.acl), NullSafety.valueOrEmpty(this.aws_access_key), NullSafety.valueOrEmpty(this.content_type), NullSafety.valueOrEmpty(this.key), NullSafety.valueOrEmpty(this.policy), NullSafety.valueOrEmpty(this.public_url), NullSafety.valueOrEmpty(this.signature), NullSafety.valueOrEmpty(this.success_action_status), NullSafety.valueOrEmpty(this.upload_destination), defaultMetadataBuilder());
        }
    }

    public abstract String getAcl();

    public abstract String getAwsAccessKey();

    public abstract String getContentType();

    public abstract int getId();

    public abstract String getKey();

    public abstract UploadMetadata getMetadata();

    public abstract String getPolicy();

    public abstract String getPublicUrl();

    public abstract String getSignature();

    public abstract String getSuccessActionStatus();

    public abstract String getUploadDestination();
}
