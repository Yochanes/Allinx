package com.google.android.gms.common.internal.safeparcel;

import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public interface SafeParcelable extends Parcelable {

    @NonNull
    public static final String NULL = "SAFE_PARCELABLE_NULL_STRING";

    /* JADX INFO: compiled from: Proguard */
    public @interface Class {
        @NonNull
        String creator();

        boolean creatorIsFinal() default true;

        boolean doNotParcelTypeDefaultValues() default false;

        boolean validate() default false;
    }

    /* JADX INFO: compiled from: Proguard */
    public @interface Constructor {
    }

    /* JADX INFO: compiled from: Proguard */
    public @interface Field {
        @NonNull
        String defaultValue() default "SAFE_PARCELABLE_NULL_STRING";

        @NonNull
        String defaultValueUnchecked() default "SAFE_PARCELABLE_NULL_STRING";

        @NonNull
        String getter() default "SAFE_PARCELABLE_NULL_STRING";

        /* JADX INFO: renamed from: id */
        int m14479id();

        @NonNull
        String type() default "SAFE_PARCELABLE_NULL_STRING";
    }

    /* JADX INFO: compiled from: Proguard */
    public @interface Indicator {
        @NonNull
        String getter() default "SAFE_PARCELABLE_NULL_STRING";
    }

    /* JADX INFO: compiled from: Proguard */
    public @interface Param {
        /* JADX INFO: renamed from: id */
        int m14480id();
    }

    /* JADX INFO: compiled from: Proguard */
    public @interface RemovedParam {
        @NonNull
        String defaultValue() default "SAFE_PARCELABLE_NULL_STRING";

        @NonNull
        String defaultValueUnchecked() default "SAFE_PARCELABLE_NULL_STRING";

        /* JADX INFO: renamed from: id */
        int m14481id();
    }

    /* JADX INFO: compiled from: Proguard */
    public @interface Reserved {
        @NonNull
        int[] value();
    }

    /* JADX INFO: compiled from: Proguard */
    public @interface VersionField {
        @NonNull
        String getter() default "SAFE_PARCELABLE_NULL_STRING";

        /* JADX INFO: renamed from: id */
        int m14482id();

        @NonNull
        String type() default "SAFE_PARCELABLE_NULL_STRING";
    }
}
