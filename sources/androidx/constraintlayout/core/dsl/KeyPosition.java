package androidx.constraintlayout.core.dsl;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class KeyPosition extends Keys {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class Type {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Type[] f21257a = {new Type("CARTESIAN", 0), new Type("SCREEN", 1), new Type("PATH", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        Type EF5;

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f21257a.clone();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KeyPositions:{\nframe:0,\n");
        Keys.m6850a("percentX", sb);
        Keys.m6850a("percentY", sb);
        Keys.m6850a("percentWidth", sb);
        Keys.m6850a("percentHeight", sb);
        sb.append("},\n");
        return sb.toString();
    }
}
