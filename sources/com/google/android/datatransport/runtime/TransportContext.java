package com.google.android.datatransport.runtime;

import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.AutoValue_TransportContext;
import com.google.auto.value.AutoValue;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@AutoValue
public abstract class TransportContext {

    /* JADX INFO: compiled from: Proguard */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract TransportContext build();

        public abstract Builder setBackendName(String str);

        public abstract Builder setExtras(@Nullable byte[] bArr);

        @RestrictTo
        public abstract Builder setPriority(Priority priority);
    }

    public static Builder builder() {
        return new AutoValue_TransportContext.Builder().setPriority(Priority.DEFAULT);
    }

    public abstract String getBackendName();

    @Nullable
    public abstract byte[] getExtras();

    @RestrictTo
    public abstract Priority getPriority();

    public boolean shouldUploadClientHealthMetrics() {
        return getExtras() != null;
    }

    public final String toString() {
        String backendName = getBackendName();
        Priority priority = getPriority();
        String strEncodeToString = getExtras() == null ? "" : Base64.encodeToString(getExtras(), 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(backendName);
        sb.append(", ");
        sb.append(priority);
        sb.append(", ");
        return AbstractC0000a.m19p(sb, strEncodeToString, ")");
    }

    @RestrictTo
    public TransportContext withPriority(Priority priority) {
        return builder().setBackendName(getBackendName()).setPriority(priority).setExtras(getExtras()).build();
    }
}
