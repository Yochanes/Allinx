package com.google.firebase.crashlytics;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public class CustomKeysAndValues {
    final Map<String, String> keysAndValues;

    /* JADX INFO: compiled from: Proguard */
    public static class Builder {
        private Map<String, String> keysAndValues = new HashMap();

        public static /* synthetic */ Map access$000(Builder builder) {
            return builder.keysAndValues;
        }

        @NonNull
        public CustomKeysAndValues build() {
            return new CustomKeysAndValues(this);
        }

        @NonNull
        public Builder putBoolean(@NonNull String str, boolean z2) {
            this.keysAndValues.put(str, Boolean.toString(z2));
            return this;
        }

        @NonNull
        public Builder putDouble(@NonNull String str, double d) {
            this.keysAndValues.put(str, Double.toString(d));
            return this;
        }

        @NonNull
        public Builder putFloat(@NonNull String str, float f) {
            this.keysAndValues.put(str, Float.toString(f));
            return this;
        }

        @NonNull
        public Builder putInt(@NonNull String str, int i) {
            this.keysAndValues.put(str, Integer.toString(i));
            return this;
        }

        @NonNull
        public Builder putLong(@NonNull String str, long j) {
            this.keysAndValues.put(str, Long.toString(j));
            return this;
        }

        @NonNull
        public Builder putString(@NonNull String str, @NonNull String str2) {
            this.keysAndValues.put(str, str2);
            return this;
        }
    }

    public CustomKeysAndValues(@NonNull Builder builder) {
        this.keysAndValues = Builder.access$000(builder);
    }
}
