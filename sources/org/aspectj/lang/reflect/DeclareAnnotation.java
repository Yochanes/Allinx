package org.aspectj.lang.reflect;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface DeclareAnnotation {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class Kind {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Kind[] f57993a = {new Kind("Field", 0), new Kind("Method", 1), new Kind("Constructor", 2), new Kind("Type", 3)};

        /* JADX INFO: Fake field, exist only in values array */
        Kind EF5;

        public static Kind valueOf(String str) {
            return (Kind) Enum.valueOf(Kind.class, str);
        }

        public static Kind[] values() {
            return (Kind[]) f57993a.clone();
        }
    }
}
