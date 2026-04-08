package io.intercom.android.sdk.utilities;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class NullSafety {
    public static boolean valueOrDefault(@Nullable Boolean bool, boolean z2) {
        return bool == null ? z2 : bool.booleanValue();
    }

    public static String valueOrEmpty(@Nullable String str) {
        return str == null ? "" : str;
    }
}
