package com.google.common.base;

import com.engagelab.privates.common.BuildConfig;
import com.google.common.annotations.GwtCompatible;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = BuildConfig.IS_FOR_ENGAGELAB)
@ElementTypesAreNonnullByDefault
final class Platform {
    private static final PatternCompiler patternCompiler = loadPatternCompiler();

    /* JADX INFO: compiled from: Proguard */
    public static final class JdkPatternCompiler implements PatternCompiler {
        private JdkPatternCompiler() {
        }

        @Override // com.google.common.base.PatternCompiler
        public CommonPattern compile(String str) {
            return new JdkPattern(Pattern.compile(str));
        }

        @Override // com.google.common.base.PatternCompiler
        public boolean isPcreLike() {
            return true;
        }

        public /* synthetic */ JdkPatternCompiler(C41121 c41121) {
            this();
        }
    }

    private Platform() {
    }

    public static CommonPattern compilePattern(String str) {
        Preconditions.checkNotNull(str);
        return patternCompiler.compile(str);
    }

    @CheckForNull
    public static String emptyToNull(@CheckForNull String str) {
        if (stringIsNullOrEmpty(str)) {
            return null;
        }
        return str;
    }

    public static String formatCompact4Digits(double d) {
        return String.format(Locale.ROOT, "%.4g", Double.valueOf(d));
    }

    public static <T extends Enum<T>> Optional<T> getEnumIfPresent(Class<T> cls, String str) {
        WeakReference<? extends Enum<?>> weakReference = Enums.getEnumConstants(cls).get(str);
        return weakReference == null ? Optional.absent() : Optional.fromNullable(cls.cast(weakReference.get()));
    }

    private static PatternCompiler loadPatternCompiler() {
        return new JdkPatternCompiler(null);
    }

    public static String nullToEmpty(@CheckForNull String str) {
        return str == null ? "" : str;
    }

    public static boolean patternCompilerIsPcreLike() {
        return patternCompiler.isPcreLike();
    }

    public static CharMatcher precomputeCharMatcher(CharMatcher charMatcher) {
        return charMatcher.precomputedInternal();
    }

    public static boolean stringIsNullOrEmpty(@CheckForNull String str) {
        return str == null || str.isEmpty();
    }
}
