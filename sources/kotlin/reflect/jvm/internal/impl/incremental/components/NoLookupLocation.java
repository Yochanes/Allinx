package kotlin.reflect.jvm.internal.impl.incremental.components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class NoLookupLocation implements LookupLocation {

    /* JADX INFO: renamed from: a */
    public static final NoLookupLocation f52683a;

    /* JADX INFO: renamed from: b */
    public static final NoLookupLocation f52684b;

    /* JADX INFO: renamed from: c */
    public static final NoLookupLocation f52685c;

    /* JADX INFO: renamed from: d */
    public static final NoLookupLocation f52686d;

    /* JADX INFO: renamed from: f */
    public static final NoLookupLocation f52687f;

    /* JADX INFO: renamed from: g */
    public static final NoLookupLocation f52688g;

    /* JADX INFO: renamed from: i */
    public static final NoLookupLocation f52689i;

    /* JADX INFO: renamed from: j */
    public static final NoLookupLocation f52690j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ NoLookupLocation[] f52691n;

    /* JADX INFO: Fake field, exist only in values array */
    NoLookupLocation EF1;

    static {
        NoLookupLocation noLookupLocation = new NoLookupLocation("FROM_IDE", 0);
        NoLookupLocation noLookupLocation2 = new NoLookupLocation("FROM_BACKEND", 1);
        NoLookupLocation noLookupLocation3 = new NoLookupLocation("FROM_TEST", 2);
        NoLookupLocation noLookupLocation4 = new NoLookupLocation("FROM_BUILTINS", 3);
        f52683a = noLookupLocation4;
        NoLookupLocation noLookupLocation5 = new NoLookupLocation("WHEN_CHECK_DECLARATION_CONFLICTS", 4);
        NoLookupLocation noLookupLocation6 = new NoLookupLocation("WHEN_CHECK_OVERRIDES", 5);
        NoLookupLocation noLookupLocation7 = new NoLookupLocation("FOR_SCRIPT", 6);
        NoLookupLocation noLookupLocation8 = new NoLookupLocation("FROM_REFLECTION", 7);
        f52684b = noLookupLocation8;
        NoLookupLocation noLookupLocation9 = new NoLookupLocation("WHEN_RESOLVE_DECLARATION", 8);
        NoLookupLocation noLookupLocation10 = new NoLookupLocation("WHEN_GET_DECLARATION_SCOPE", 9);
        NoLookupLocation noLookupLocation11 = new NoLookupLocation("WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS", 10);
        NoLookupLocation noLookupLocation12 = new NoLookupLocation("FOR_ALREADY_TRACKED", 11);
        f52685c = noLookupLocation12;
        NoLookupLocation noLookupLocation13 = new NoLookupLocation("WHEN_GET_ALL_DESCRIPTORS", 12);
        f52686d = noLookupLocation13;
        NoLookupLocation noLookupLocation14 = new NoLookupLocation("WHEN_TYPING", 13);
        NoLookupLocation noLookupLocation15 = new NoLookupLocation("WHEN_GET_SUPER_MEMBERS", 14);
        f52687f = noLookupLocation15;
        NoLookupLocation noLookupLocation16 = new NoLookupLocation("FOR_NON_TRACKED_SCOPE", 15);
        f52688g = noLookupLocation16;
        NoLookupLocation noLookupLocation17 = new NoLookupLocation("FROM_SYNTHETIC_SCOPE", 16);
        NoLookupLocation noLookupLocation18 = new NoLookupLocation("FROM_DESERIALIZATION", 17);
        f52689i = noLookupLocation18;
        NoLookupLocation noLookupLocation19 = new NoLookupLocation("FROM_JAVA_LOADER", 18);
        f52690j = noLookupLocation19;
        f52691n = new NoLookupLocation[]{noLookupLocation, noLookupLocation2, noLookupLocation3, noLookupLocation4, noLookupLocation5, noLookupLocation6, noLookupLocation7, noLookupLocation8, noLookupLocation9, noLookupLocation10, noLookupLocation11, noLookupLocation12, noLookupLocation13, noLookupLocation14, noLookupLocation15, noLookupLocation16, noLookupLocation17, noLookupLocation18, noLookupLocation19, new NoLookupLocation("WHEN_GET_LOCAL_VARIABLE", 19), new NoLookupLocation("WHEN_FIND_BY_FQNAME", 20), new NoLookupLocation("WHEN_GET_COMPANION_OBJECT", 21), new NoLookupLocation("FOR_DEFAULT_IMPORTS", 22)};
    }

    public static NoLookupLocation valueOf(String str) {
        return (NoLookupLocation) Enum.valueOf(NoLookupLocation.class, str);
    }

    public static NoLookupLocation[] values() {
        return (NoLookupLocation[]) f52691n.clone();
    }
}
