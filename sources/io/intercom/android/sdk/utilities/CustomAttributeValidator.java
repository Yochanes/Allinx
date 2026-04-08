package io.intercom.android.sdk.utilities;

import androidx.annotation.Nullable;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class CustomAttributeValidator {
    private static final List<? extends Class<? extends Serializable>> ACCEPTED_CUSTOM_ATTRIBUTE_TYPES = Arrays.asList(String.class, Character.class, Short.class, Long.class, Float.class, Double.class, Integer.class, Byte.class, Boolean.class);

    public static String getAcceptedTypes() {
        StringBuilder sb = new StringBuilder();
        for (Class<? extends Serializable> cls : ACCEPTED_CUSTOM_ATTRIBUTE_TYPES) {
            if (sb.length() != 0) {
                sb.append(", ");
            }
            sb.append(cls.getSimpleName());
        }
        return sb.toString();
    }

    public static boolean isValid(@Nullable Object obj) {
        return obj == null || ACCEPTED_CUSTOM_ATTRIBUTE_TYPES.contains(obj.getClass());
    }
}
