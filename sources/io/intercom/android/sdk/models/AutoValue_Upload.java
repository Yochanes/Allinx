package io.intercom.android.sdk.models;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_Upload extends Upload {
    private final String acl;
    private final String awsAccessKey;
    private final String contentType;

    /* JADX INFO: renamed from: id */
    private final int f44358id;
    private final String key;
    private final UploadMetadata metadata;
    private final String policy;
    private final String publicUrl;
    private final String signature;
    private final String successActionStatus;
    private final String uploadDestination;

    public AutoValue_Upload(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, UploadMetadata uploadMetadata) {
        this.f44358id = i;
        if (str == null) {
            throw new NullPointerException("Null acl");
        }
        this.acl = str;
        if (str2 == null) {
            throw new NullPointerException("Null awsAccessKey");
        }
        this.awsAccessKey = str2;
        if (str3 == null) {
            throw new NullPointerException("Null contentType");
        }
        this.contentType = str3;
        if (str4 == null) {
            throw new NullPointerException("Null key");
        }
        this.key = str4;
        if (str5 == null) {
            throw new NullPointerException("Null policy");
        }
        this.policy = str5;
        if (str6 == null) {
            throw new NullPointerException("Null publicUrl");
        }
        this.publicUrl = str6;
        if (str7 == null) {
            throw new NullPointerException("Null signature");
        }
        this.signature = str7;
        if (str8 == null) {
            throw new NullPointerException("Null successActionStatus");
        }
        this.successActionStatus = str8;
        if (str9 == null) {
            throw new NullPointerException("Null uploadDestination");
        }
        this.uploadDestination = str9;
        if (uploadMetadata == null) {
            throw new NullPointerException("Null metadata");
        }
        this.metadata = uploadMetadata;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Upload) {
            Upload upload = (Upload) obj;
            if (this.f44358id == upload.getId() && this.acl.equals(upload.getAcl()) && this.awsAccessKey.equals(upload.getAwsAccessKey()) && this.contentType.equals(upload.getContentType()) && this.key.equals(upload.getKey()) && this.policy.equals(upload.getPolicy()) && this.publicUrl.equals(upload.getPublicUrl()) && this.signature.equals(upload.getSignature()) && this.successActionStatus.equals(upload.getSuccessActionStatus()) && this.uploadDestination.equals(upload.getUploadDestination()) && this.metadata.equals(upload.getMetadata())) {
                return true;
            }
        }
        return false;
    }

    @Override // io.intercom.android.sdk.models.Upload
    public String getAcl() {
        return this.acl;
    }

    @Override // io.intercom.android.sdk.models.Upload
    public String getAwsAccessKey() {
        return this.awsAccessKey;
    }

    @Override // io.intercom.android.sdk.models.Upload
    public String getContentType() {
        return this.contentType;
    }

    @Override // io.intercom.android.sdk.models.Upload
    public int getId() {
        return this.f44358id;
    }

    @Override // io.intercom.android.sdk.models.Upload
    public String getKey() {
        return this.key;
    }

    @Override // io.intercom.android.sdk.models.Upload
    public UploadMetadata getMetadata() {
        return this.metadata;
    }

    @Override // io.intercom.android.sdk.models.Upload
    public String getPolicy() {
        return this.policy;
    }

    @Override // io.intercom.android.sdk.models.Upload
    public String getPublicUrl() {
        return this.publicUrl;
    }

    @Override // io.intercom.android.sdk.models.Upload
    public String getSignature() {
        return this.signature;
    }

    @Override // io.intercom.android.sdk.models.Upload
    public String getSuccessActionStatus() {
        return this.successActionStatus;
    }

    @Override // io.intercom.android.sdk.models.Upload
    public String getUploadDestination() {
        return this.uploadDestination;
    }

    public int hashCode() {
        return ((((((((((((((((((((this.f44358id ^ 1000003) * 1000003) ^ this.acl.hashCode()) * 1000003) ^ this.awsAccessKey.hashCode()) * 1000003) ^ this.contentType.hashCode()) * 1000003) ^ this.key.hashCode()) * 1000003) ^ this.policy.hashCode()) * 1000003) ^ this.publicUrl.hashCode()) * 1000003) ^ this.signature.hashCode()) * 1000003) ^ this.successActionStatus.hashCode()) * 1000003) ^ this.uploadDestination.hashCode()) * 1000003) ^ this.metadata.hashCode();
    }

    public String toString() {
        return "Upload{id=" + this.f44358id + ", acl=" + this.acl + ", awsAccessKey=" + this.awsAccessKey + ", contentType=" + this.contentType + ", key=" + this.key + ", policy=" + this.policy + ", publicUrl=" + this.publicUrl + ", signature=" + this.signature + ", successActionStatus=" + this.successActionStatus + ", uploadDestination=" + this.uploadDestination + ", metadata=" + this.metadata + "}";
    }
}
