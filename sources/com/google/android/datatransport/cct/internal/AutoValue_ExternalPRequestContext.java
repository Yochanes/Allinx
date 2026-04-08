package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.ExternalPRequestContext;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_ExternalPRequestContext extends ExternalPRequestContext {
    private final Integer originAssociatedProductId;

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder extends ExternalPRequestContext.Builder {
        private Integer originAssociatedProductId;

        @Override // com.google.android.datatransport.cct.internal.ExternalPRequestContext.Builder
        public ExternalPRequestContext build() {
            return new AutoValue_ExternalPRequestContext(this.originAssociatedProductId, null);
        }

        @Override // com.google.android.datatransport.cct.internal.ExternalPRequestContext.Builder
        public ExternalPRequestContext.Builder setOriginAssociatedProductId(@Nullable Integer num) {
            this.originAssociatedProductId = num;
            return this;
        }
    }

    public /* synthetic */ AutoValue_ExternalPRequestContext(Integer num, C36951 c36951) {
        this(num);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExternalPRequestContext)) {
            return false;
        }
        Integer num = this.originAssociatedProductId;
        Integer originAssociatedProductId = ((ExternalPRequestContext) obj).getOriginAssociatedProductId();
        return num == null ? originAssociatedProductId == null : num.equals(originAssociatedProductId);
    }

    @Override // com.google.android.datatransport.cct.internal.ExternalPRequestContext
    @Nullable
    public Integer getOriginAssociatedProductId() {
        return this.originAssociatedProductId;
    }

    public int hashCode() {
        Integer num = this.originAssociatedProductId;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.originAssociatedProductId + "}";
    }

    private AutoValue_ExternalPRequestContext(@Nullable Integer num) {
        this.originAssociatedProductId = num;
    }
}
