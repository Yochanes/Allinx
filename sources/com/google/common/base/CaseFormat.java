package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import javax.annotation.CheckForNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class CaseFormat {
    private final CharMatcher wordBoundary;
    private final String wordSeparator;
    public static final CaseFormat LOWER_HYPHEN = new C40961("LOWER_HYPHEN", 0, CharMatcher.m14758is('-'), "-");
    public static final CaseFormat LOWER_UNDERSCORE = new C40972("LOWER_UNDERSCORE", 1, CharMatcher.m14758is('_'), "_");
    public static final CaseFormat LOWER_CAMEL = new C40983("LOWER_CAMEL", 2, CharMatcher.inRange('A', 'Z'), "");
    public static final CaseFormat UPPER_CAMEL = new C40994("UPPER_CAMEL", 3, CharMatcher.inRange('A', 'Z'), "");
    public static final CaseFormat UPPER_UNDERSCORE = new C41005("UPPER_UNDERSCORE", 4, CharMatcher.m14758is('_'), "_");
    private static final /* synthetic */ CaseFormat[] $VALUES = $values();

    /* JADX INFO: renamed from: com.google.common.base.CaseFormat$1 */
    /* JADX INFO: compiled from: Proguard */
    public enum C40961 extends CaseFormat {
        public C40961(String str, int i, CharMatcher charMatcher, String str2) {
            super(str, i, charMatcher, str2, null);
        }

        @Override // com.google.common.base.CaseFormat
        public String convert(CaseFormat caseFormat, String str) {
            return caseFormat == CaseFormat.LOWER_UNDERSCORE ? str.replace('-', '_') : caseFormat == CaseFormat.UPPER_UNDERSCORE ? Ascii.toUpperCase(str.replace('-', '_')) : super.convert(caseFormat, str);
        }

        @Override // com.google.common.base.CaseFormat
        public String normalizeWord(String str) {
            return Ascii.toLowerCase(str);
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.CaseFormat$2 */
    /* JADX INFO: compiled from: Proguard */
    public enum C40972 extends CaseFormat {
        public C40972(String str, int i, CharMatcher charMatcher, String str2) {
            super(str, i, charMatcher, str2, null);
        }

        @Override // com.google.common.base.CaseFormat
        public String convert(CaseFormat caseFormat, String str) {
            return caseFormat == CaseFormat.LOWER_HYPHEN ? str.replace('_', '-') : caseFormat == CaseFormat.UPPER_UNDERSCORE ? Ascii.toUpperCase(str) : super.convert(caseFormat, str);
        }

        @Override // com.google.common.base.CaseFormat
        public String normalizeWord(String str) {
            return Ascii.toLowerCase(str);
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.CaseFormat$3 */
    /* JADX INFO: compiled from: Proguard */
    public enum C40983 extends CaseFormat {
        public C40983(String str, int i, CharMatcher charMatcher, String str2) {
            super(str, i, charMatcher, str2, null);
        }

        @Override // com.google.common.base.CaseFormat
        public String normalizeFirstWord(String str) {
            return Ascii.toLowerCase(str);
        }

        @Override // com.google.common.base.CaseFormat
        public String normalizeWord(String str) {
            return CaseFormat.access$100(str);
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.CaseFormat$4 */
    /* JADX INFO: compiled from: Proguard */
    public enum C40994 extends CaseFormat {
        public C40994(String str, int i, CharMatcher charMatcher, String str2) {
            super(str, i, charMatcher, str2, null);
        }

        @Override // com.google.common.base.CaseFormat
        public String normalizeWord(String str) {
            return CaseFormat.access$100(str);
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.CaseFormat$5 */
    /* JADX INFO: compiled from: Proguard */
    public enum C41005 extends CaseFormat {
        public C41005(String str, int i, CharMatcher charMatcher, String str2) {
            super(str, i, charMatcher, str2, null);
        }

        @Override // com.google.common.base.CaseFormat
        public String convert(CaseFormat caseFormat, String str) {
            return caseFormat == CaseFormat.LOWER_HYPHEN ? Ascii.toLowerCase(str.replace('_', '-')) : caseFormat == CaseFormat.LOWER_UNDERSCORE ? Ascii.toLowerCase(str) : super.convert(caseFormat, str);
        }

        @Override // com.google.common.base.CaseFormat
        public String normalizeWord(String str) {
            return Ascii.toUpperCase(str);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class StringConverter extends Converter<String, String> implements Serializable {
        private static final long serialVersionUID = 0;
        private final CaseFormat sourceFormat;
        private final CaseFormat targetFormat;

        public StringConverter(CaseFormat caseFormat, CaseFormat caseFormat2) {
            this.sourceFormat = (CaseFormat) Preconditions.checkNotNull(caseFormat);
            this.targetFormat = (CaseFormat) Preconditions.checkNotNull(caseFormat2);
        }

        @Override // com.google.common.base.Converter
        public /* bridge */ /* synthetic */ String doBackward(String str) {
            return doBackward2(str);
        }

        @Override // com.google.common.base.Converter
        public /* bridge */ /* synthetic */ String doForward(String str) {
            return doForward2(str);
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof StringConverter) {
                StringConverter stringConverter = (StringConverter) obj;
                if (this.sourceFormat.equals(stringConverter.sourceFormat) && this.targetFormat.equals(stringConverter.targetFormat)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.sourceFormat.hashCode() ^ this.targetFormat.hashCode();
        }

        public String toString() {
            return this.sourceFormat + ".converterTo(" + this.targetFormat + ")";
        }

        /* JADX INFO: renamed from: doBackward, reason: avoid collision after fix types in other method */
        public String doBackward2(String str) {
            return this.targetFormat.m14757to(this.sourceFormat, str);
        }

        /* JADX INFO: renamed from: doForward, reason: avoid collision after fix types in other method */
        public String doForward2(String str) {
            return this.sourceFormat.m14757to(this.targetFormat, str);
        }
    }

    private static /* synthetic */ CaseFormat[] $values() {
        return new CaseFormat[]{LOWER_HYPHEN, LOWER_UNDERSCORE, LOWER_CAMEL, UPPER_CAMEL, UPPER_UNDERSCORE};
    }

    public /* synthetic */ CaseFormat(String str, int i, CharMatcher charMatcher, String str2, C40961 c40961) {
        this(str, i, charMatcher, str2);
    }

    public static /* synthetic */ String access$100(String str) {
        return firstCharOnlyToUpper(str);
    }

    private static String firstCharOnlyToUpper(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return Ascii.toUpperCase(str.charAt(0)) + Ascii.toLowerCase(str.substring(1));
    }

    public static CaseFormat valueOf(String str) {
        return (CaseFormat) Enum.valueOf(CaseFormat.class, str);
    }

    public static CaseFormat[] values() {
        return (CaseFormat[]) $VALUES.clone();
    }

    public String convert(CaseFormat caseFormat, String str) {
        StringBuilder sb = null;
        int length = 0;
        int iIndexIn = -1;
        while (true) {
            iIndexIn = this.wordBoundary.indexIn(str, iIndexIn + 1);
            if (iIndexIn == -1) {
                break;
            }
            if (length == 0) {
                sb = new StringBuilder((caseFormat.wordSeparator.length() * 4) + str.length());
                sb.append(caseFormat.normalizeFirstWord(str.substring(length, iIndexIn)));
            } else {
                java.util.Objects.requireNonNull(sb);
                sb.append(caseFormat.normalizeWord(str.substring(length, iIndexIn)));
            }
            sb.append(caseFormat.wordSeparator);
            length = this.wordSeparator.length() + iIndexIn;
        }
        if (length == 0) {
            return caseFormat.normalizeFirstWord(str);
        }
        java.util.Objects.requireNonNull(sb);
        sb.append(caseFormat.normalizeWord(str.substring(length)));
        return sb.toString();
    }

    public Converter<String, String> converterTo(CaseFormat caseFormat) {
        return new StringConverter(this, caseFormat);
    }

    public String normalizeFirstWord(String str) {
        return normalizeWord(str);
    }

    public abstract String normalizeWord(String str);

    /* JADX INFO: renamed from: to */
    public final String m14757to(CaseFormat caseFormat, String str) {
        Preconditions.checkNotNull(caseFormat);
        Preconditions.checkNotNull(str);
        return caseFormat == this ? str : convert(caseFormat, str);
    }

    private CaseFormat(String str, int i, CharMatcher charMatcher, String str2) {
        this.wordBoundary = charMatcher;
        this.wordSeparator = str2;
    }
}
