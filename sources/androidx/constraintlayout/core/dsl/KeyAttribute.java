package androidx.constraintlayout.core.dsl;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class KeyAttribute extends Keys {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class Fit {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Fit[] f21251a = {new Fit("SPLINE", 0), new Fit("LINEAR", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        Fit EF5;

        public static Fit valueOf(String str) {
            return (Fit) Enum.valueOf(Fit.class, str);
        }

        public static Fit[] values() {
            return (Fit[]) f21251a.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class Visibility {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Visibility[] f21252a = {new Visibility("VISIBLE", 0), new Visibility("INVISIBLE", 1), new Visibility("GONE", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        Visibility EF5;

        public static Visibility valueOf(String str) {
            return (Visibility) Enum.valueOf(Visibility.class, str);
        }

        public static Visibility[] values() {
            return (Visibility[]) f21252a.clone();
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo6849b(StringBuilder sb) {
        sb.append("frame:");
        sb.append(0);
        sb.append(",\n");
        Keys.m6850a("alpha", sb);
        Keys.m6850a("rotationX", sb);
        Keys.m6850a("rotationY", sb);
        Keys.m6850a("rotationZ", sb);
        Keys.m6850a("pivotX", sb);
        Keys.m6850a("pivotY", sb);
        Keys.m6850a("pathRotate", sb);
        Keys.m6850a("scaleX", sb);
        Keys.m6850a("scaleY", sb);
        Keys.m6850a("translationX", sb);
        Keys.m6850a("translationY", sb);
        Keys.m6850a("translationZ", sb);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("null:{\n");
        mo6849b(sb);
        sb.append("},\n");
        return sb.toString();
    }
}
