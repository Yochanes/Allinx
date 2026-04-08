package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Escapers {
    private static final Escaper NULL_ESCAPER = new C43761();

    /* JADX INFO: renamed from: com.google.common.escape.Escapers$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C43761 extends CharEscaper {
        @Override // com.google.common.escape.CharEscaper
        @CheckForNull
        public char[] escape(char c2) {
            return null;
        }

        @Override // com.google.common.escape.CharEscaper, com.google.common.escape.Escaper
        public String escape(String str) {
            return (String) Preconditions.checkNotNull(str);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder {
        private final Map<Character, String> replacementMap;
        private char safeMax;
        private char safeMin;

        @CheckForNull
        private String unsafeReplacement;

        /* JADX INFO: renamed from: com.google.common.escape.Escapers$Builder$1 */
        /* JADX INFO: compiled from: Proguard */
        public class C43771 extends ArrayBasedCharEscaper {

            @CheckForNull
            private final char[] replacementChars;

            public C43771(Map map, char c2, char c3) {
                super((Map<Character, String>) map, c2, c3);
                this.replacementChars = Builder.access$100(Builder.this) != null ? Builder.access$100(Builder.this).toCharArray() : null;
            }

            @Override // com.google.common.escape.ArrayBasedCharEscaper
            @CheckForNull
            public char[] escapeUnsafe(char c2) {
                return this.replacementChars;
            }
        }

        public /* synthetic */ Builder(C43761 c43761) {
            this();
        }

        public static /* synthetic */ String access$100(Builder builder) {
            return builder.unsafeReplacement;
        }

        @CanIgnoreReturnValue
        public Builder addEscape(char c2, String str) {
            Preconditions.checkNotNull(str);
            this.replacementMap.put(Character.valueOf(c2), str);
            return this;
        }

        public Escaper build() {
            return new C43771(this.replacementMap, this.safeMin, this.safeMax);
        }

        @CanIgnoreReturnValue
        public Builder setSafeRange(char c2, char c3) {
            this.safeMin = c2;
            this.safeMax = c3;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setUnsafeReplacement(String str) {
            this.unsafeReplacement = str;
            return this;
        }

        private Builder() {
            this.replacementMap = new HashMap();
            this.safeMin = (char) 0;
            this.safeMax = (char) 65535;
            this.unsafeReplacement = null;
        }
    }

    private Escapers() {
    }

    public static Builder builder() {
        return new Builder(null);
    }

    @CheckForNull
    public static String computeReplacement(CharEscaper charEscaper, char c2) {
        return stringOrNull(charEscaper.escape(c2));
    }

    public static Escaper nullEscaper() {
        return NULL_ESCAPER;
    }

    @CheckForNull
    private static String stringOrNull(@CheckForNull char[] cArr) {
        if (cArr == null) {
            return null;
        }
        return new String(cArr);
    }

    @CheckForNull
    public static String computeReplacement(UnicodeEscaper unicodeEscaper, int i) {
        return stringOrNull(unicodeEscaper.escape(i));
    }
}
