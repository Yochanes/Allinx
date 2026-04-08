package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public abstract class FieldNamingPolicy implements FieldNamingStrategy {
    private static final /* synthetic */ FieldNamingPolicy[] $VALUES;
    public static final FieldNamingPolicy IDENTITY;
    public static final FieldNamingPolicy LOWER_CASE_WITH_DASHES;
    public static final FieldNamingPolicy LOWER_CASE_WITH_DOTS;
    public static final FieldNamingPolicy LOWER_CASE_WITH_UNDERSCORES;
    public static final FieldNamingPolicy UPPER_CAMEL_CASE;
    public static final FieldNamingPolicy UPPER_CAMEL_CASE_WITH_SPACES;
    public static final FieldNamingPolicy UPPER_CASE_WITH_UNDERSCORES;

    /* JADX INFO: renamed from: com.google.gson.FieldNamingPolicy$1 */
    /* JADX INFO: compiled from: Proguard */
    public enum C47771 extends FieldNamingPolicy {
        public C47771(String str, int i) {
            super(str, i, null);
        }

        @Override // com.google.gson.FieldNamingStrategy
        public String translateName(Field field) {
            return field.getName();
        }
    }

    /* JADX INFO: renamed from: com.google.gson.FieldNamingPolicy$2 */
    /* JADX INFO: compiled from: Proguard */
    public enum C47782 extends FieldNamingPolicy {
        public C47782(String str, int i) {
            super(str, i, null);
        }

        @Override // com.google.gson.FieldNamingStrategy
        public String translateName(Field field) {
            return FieldNamingPolicy.upperCaseFirstLetter(field.getName());
        }
    }

    /* JADX INFO: renamed from: com.google.gson.FieldNamingPolicy$3 */
    /* JADX INFO: compiled from: Proguard */
    public enum C47793 extends FieldNamingPolicy {
        public C47793(String str, int i) {
            super(str, i, null);
        }

        @Override // com.google.gson.FieldNamingStrategy
        public String translateName(Field field) {
            return FieldNamingPolicy.upperCaseFirstLetter(FieldNamingPolicy.separateCamelCase(field.getName(), ' '));
        }
    }

    /* JADX INFO: renamed from: com.google.gson.FieldNamingPolicy$4 */
    /* JADX INFO: compiled from: Proguard */
    public enum C47804 extends FieldNamingPolicy {
        public C47804(String str, int i) {
            super(str, i, null);
        }

        @Override // com.google.gson.FieldNamingStrategy
        public String translateName(Field field) {
            return FieldNamingPolicy.separateCamelCase(field.getName(), '_').toUpperCase(Locale.ENGLISH);
        }
    }

    /* JADX INFO: renamed from: com.google.gson.FieldNamingPolicy$5 */
    /* JADX INFO: compiled from: Proguard */
    public enum C47815 extends FieldNamingPolicy {
        public C47815(String str, int i) {
            super(str, i, null);
        }

        @Override // com.google.gson.FieldNamingStrategy
        public String translateName(Field field) {
            return FieldNamingPolicy.separateCamelCase(field.getName(), '_').toLowerCase(Locale.ENGLISH);
        }
    }

    /* JADX INFO: renamed from: com.google.gson.FieldNamingPolicy$6 */
    /* JADX INFO: compiled from: Proguard */
    public enum C47826 extends FieldNamingPolicy {
        public C47826(String str, int i) {
            super(str, i, null);
        }

        @Override // com.google.gson.FieldNamingStrategy
        public String translateName(Field field) {
            return FieldNamingPolicy.separateCamelCase(field.getName(), '-').toLowerCase(Locale.ENGLISH);
        }
    }

    /* JADX INFO: renamed from: com.google.gson.FieldNamingPolicy$7 */
    /* JADX INFO: compiled from: Proguard */
    public enum C47837 extends FieldNamingPolicy {
        public C47837(String str, int i) {
            super(str, i, null);
        }

        @Override // com.google.gson.FieldNamingStrategy
        public String translateName(Field field) {
            return FieldNamingPolicy.separateCamelCase(field.getName(), '.').toLowerCase(Locale.ENGLISH);
        }
    }

    static {
        C47771 c47771 = new C47771("IDENTITY", 0);
        IDENTITY = c47771;
        C47782 c47782 = new C47782("UPPER_CAMEL_CASE", 1);
        UPPER_CAMEL_CASE = c47782;
        C47793 c47793 = new C47793("UPPER_CAMEL_CASE_WITH_SPACES", 2);
        UPPER_CAMEL_CASE_WITH_SPACES = c47793;
        C47804 c47804 = new C47804("UPPER_CASE_WITH_UNDERSCORES", 3);
        UPPER_CASE_WITH_UNDERSCORES = c47804;
        C47815 c47815 = new C47815("LOWER_CASE_WITH_UNDERSCORES", 4);
        LOWER_CASE_WITH_UNDERSCORES = c47815;
        C47826 c47826 = new C47826("LOWER_CASE_WITH_DASHES", 5);
        LOWER_CASE_WITH_DASHES = c47826;
        C47837 c47837 = new C47837("LOWER_CASE_WITH_DOTS", 6);
        LOWER_CASE_WITH_DOTS = c47837;
        $VALUES = new FieldNamingPolicy[]{c47771, c47782, c47793, c47804, c47815, c47826, c47837};
    }

    private FieldNamingPolicy(String str, int i) {
    }

    public static String separateCamelCase(String str, char c2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(c2);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    public static String upperCaseFirstLetter(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            char cCharAt = str.charAt(i);
            if (!Character.isLetter(cCharAt)) {
                i++;
            } else if (!Character.isUpperCase(cCharAt)) {
                char upperCase = Character.toUpperCase(cCharAt);
                if (i == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i) + upperCase + str.substring(i + 1);
            }
        }
        return str;
    }

    public static FieldNamingPolicy valueOf(String str) {
        return (FieldNamingPolicy) Enum.valueOf(FieldNamingPolicy.class, str);
    }

    public static FieldNamingPolicy[] values() {
        return (FieldNamingPolicy[]) $VALUES.clone();
    }

    public /* synthetic */ FieldNamingPolicy(String str, int i, C47771 c47771) {
        this(str, i);
    }
}
