package javax.annotation.meta;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class When {

    /* JADX INFO: renamed from: a */
    public static final When f51404a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ When[] f51405b;

    static {
        When when = new When("ALWAYS", 0);
        f51404a = when;
        f51405b = new When[]{when, new When("UNKNOWN", 1), new When("MAYBE", 2), new When("NEVER", 3)};
    }

    public static When valueOf(String str) {
        return (When) Enum.valueOf(When.class, str);
    }

    public static When[] values() {
        return (When[]) f51405b.clone();
    }
}
