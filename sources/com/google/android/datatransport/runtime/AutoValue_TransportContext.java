package com.google.android.datatransport.runtime;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.TransportContext;
import java.util.Arrays;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_TransportContext extends TransportContext {
    private final String backendName;
    private final byte[] extras;
    private final Priority priority;

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder extends TransportContext.Builder {
        private String backendName;
        private byte[] extras;
        private Priority priority;

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public TransportContext build() {
            String strM2C = this.backendName == null ? " backendName" : "";
            if (this.priority == null) {
                strM2C = AbstractC0000a.m2C(strM2C, " priority");
            }
            if (strM2C.isEmpty()) {
                return new AutoValue_TransportContext(this.backendName, this.extras, this.priority, null);
            }
            throw new IllegalStateException("Missing required properties:".concat(strM2C));
        }

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public TransportContext.Builder setBackendName(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.backendName = str;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public TransportContext.Builder setExtras(@Nullable byte[] bArr) {
            this.extras = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public TransportContext.Builder setPriority(Priority priority) {
            if (priority == null) {
                throw new NullPointerException("Null priority");
            }
            this.priority = priority;
            return this;
        }
    }

    public /* synthetic */ AutoValue_TransportContext(String str, byte[] bArr, Priority priority, C37021 c37021) {
        this(str, bArr, priority);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TransportContext) {
            TransportContext transportContext = (TransportContext) obj;
            if (this.backendName.equals(transportContext.getBackendName())) {
                if (Arrays.equals(this.extras, transportContext instanceof AutoValue_TransportContext ? ((AutoValue_TransportContext) transportContext).extras : transportContext.getExtras()) && this.priority.equals(transportContext.getPriority())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.TransportContext
    public String getBackendName() {
        return this.backendName;
    }

    @Override // com.google.android.datatransport.runtime.TransportContext
    @Nullable
    public byte[] getExtras() {
        return this.extras;
    }

    @Override // com.google.android.datatransport.runtime.TransportContext
    @RestrictTo
    public Priority getPriority() {
        return this.priority;
    }

    public int hashCode() {
        return ((((this.backendName.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.extras)) * 1000003) ^ this.priority.hashCode();
    }

    private AutoValue_TransportContext(String str, @Nullable byte[] bArr, Priority priority) {
        this.backendName = str;
        this.extras = bArr;
        this.priority = priority;
    }
}
