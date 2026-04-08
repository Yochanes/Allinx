package androidx.constraintlayout.core.dsl;

import java.util.Arrays;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class KeyAttributes extends Keys {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class Fit {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Fit[] f21253a = {new Fit("SPLINE", 0), new Fit("LINEAR", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        Fit EF5;

        public static Fit valueOf(String str) {
            return (Fit) Enum.valueOf(Fit.class, str);
        }

        public static Fit[] values() {
            return (Fit[]) f21253a.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class Visibility {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Visibility[] f21254a = {new Visibility("VISIBLE", 0), new Visibility("INVISIBLE", 1), new Visibility("GONE", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        Visibility EF5;

        public static Visibility valueOf(String str) {
            return (Visibility) Enum.valueOf(Visibility.class, str);
        }

        public static Visibility[] values() {
            return (Visibility[]) f21254a.clone();
        }
    }

    public final String toString() {
        return "null:{\nframe:" + Arrays.toString((int[]) null) + ",\n},\n";
    }
}
