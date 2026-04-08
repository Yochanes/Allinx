package androidx.constraintlayout.core.dsl;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class KeyCycles extends KeyAttributes {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class Wave {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Wave[] f21256a = {new Wave("SIN", 0), new Wave("SQUARE", 1), new Wave("TRIANGLE", 2), new Wave("SAW", 3), new Wave("REVERSE_SAW", 4), new Wave("COS", 5)};

        /* JADX INFO: Fake field, exist only in values array */
        Wave EF5;

        public static Wave valueOf(String str) {
            return (Wave) Enum.valueOf(Wave.class, str);
        }

        public static Wave[] values() {
            return (Wave[]) f21256a.clone();
        }
    }
}
