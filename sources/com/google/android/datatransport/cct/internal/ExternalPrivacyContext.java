package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.AutoValue_ExternalPrivacyContext;
import com.google.auto.value.AutoValue;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@AutoValue
public abstract class ExternalPrivacyContext {

    /* JADX INFO: compiled from: Proguard */
    @AutoValue.Builder
    public static abstract class Builder {
        @NonNull
        public abstract ExternalPrivacyContext build();

        @NonNull
        public abstract Builder setPrequest(@Nullable ExternalPRequestContext externalPRequestContext);
    }

    @NonNull
    public static Builder builder() {
        return new AutoValue_ExternalPrivacyContext.Builder();
    }

    @Nullable
    public abstract ExternalPRequestContext getPrequest();
}
