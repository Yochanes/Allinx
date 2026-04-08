package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.AutoValue_ExternalPRequestContext;
import com.google.auto.value.AutoValue;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@AutoValue
public abstract class ExternalPRequestContext {

    /* JADX INFO: compiled from: Proguard */
    @AutoValue.Builder
    public static abstract class Builder {
        @NonNull
        public abstract ExternalPRequestContext build();

        @NonNull
        public abstract Builder setOriginAssociatedProductId(@Nullable Integer num);
    }

    @NonNull
    public static Builder builder() {
        return new AutoValue_ExternalPRequestContext.Builder();
    }

    @Nullable
    public abstract Integer getOriginAssociatedProductId();
}
