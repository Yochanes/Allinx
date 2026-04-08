package androidx.constraintlayout.core.parser;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class CLToken extends CLElement {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class Type {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Type[] f21539a = {new Type("UNKNOWN", 0), new Type("TRUE", 1), new Type("FALSE", 2), new Type("NULL", 3)};

        /* JADX INFO: Fake field, exist only in values array */
        Type EF5;

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f21539a.clone();
        }
    }
}
