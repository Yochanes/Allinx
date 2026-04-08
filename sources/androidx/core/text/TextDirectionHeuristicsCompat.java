package androidx.core.text;

import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class TextDirectionHeuristicsCompat {

    /* JADX INFO: renamed from: a */
    public static final TextDirectionHeuristicCompat f23330a = new TextDirectionHeuristicInternal(null, false);

    /* JADX INFO: renamed from: b */
    public static final TextDirectionHeuristicCompat f23331b = new TextDirectionHeuristicInternal(null, true);

    /* JADX INFO: renamed from: c */
    public static final TextDirectionHeuristicCompat f23332c;

    /* JADX INFO: renamed from: d */
    public static final TextDirectionHeuristicCompat f23333d;

    /* JADX INFO: compiled from: Proguard */
    public static class AnyStrong implements TextDirectionAlgorithm {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class FirstStrong implements TextDirectionAlgorithm {

        /* JADX INFO: renamed from: a */
        public static final FirstStrong f23334a = new FirstStrong();
    }

    /* JADX INFO: compiled from: Proguard */
    public interface TextDirectionAlgorithm {
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class TextDirectionHeuristicImpl implements TextDirectionHeuristicCompat {

        /* JADX INFO: renamed from: a */
        public final FirstStrong f23335a;

        public TextDirectionHeuristicImpl(FirstStrong firstStrong) {
            this.f23335a = firstStrong;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
        @Override // androidx.core.text.TextDirectionHeuristicCompat
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean mo7674a(CharSequence charSequence, int i) {
            if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
                throw new IllegalArgumentException();
            }
            if (this.f23335a == null) {
                return mo7675b();
            }
            char c2 = 2;
            for (int i2 = 0; i2 < i && c2 == 2; i2++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i2));
                TextDirectionHeuristicCompat textDirectionHeuristicCompat = TextDirectionHeuristicsCompat.f23330a;
                if (directionality == 0) {
                    c2 = 1;
                    continue;
                } else if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            c2 = 0;
                            break;
                        default:
                            c2 = 2;
                            continue;
                    }
                } else {
                    c2 = 0;
                }
            }
            if (c2 == 0) {
                return true;
            }
            if (c2 != 1) {
                return mo7675b();
            }
            return false;
        }

        /* JADX INFO: renamed from: b */
        public abstract boolean mo7675b();
    }

    /* JADX INFO: compiled from: Proguard */
    public static class TextDirectionHeuristicInternal extends TextDirectionHeuristicImpl {

        /* JADX INFO: renamed from: b */
        public final boolean f23336b;

        public TextDirectionHeuristicInternal(FirstStrong firstStrong, boolean z2) {
            super(firstStrong);
            this.f23336b = z2;
        }

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl
        /* JADX INFO: renamed from: b */
        public final boolean mo7675b() {
            return this.f23336b;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class TextDirectionHeuristicLocale extends TextDirectionHeuristicImpl {
        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl
        /* JADX INFO: renamed from: b */
        public final boolean mo7675b() {
            return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
        }
    }

    static {
        FirstStrong firstStrong = FirstStrong.f23334a;
        f23332c = new TextDirectionHeuristicInternal(firstStrong, false);
        f23333d = new TextDirectionHeuristicInternal(firstStrong, true);
    }
}
