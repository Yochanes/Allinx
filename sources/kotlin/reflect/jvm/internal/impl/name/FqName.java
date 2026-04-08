package kotlin.reflect.jvm.internal.impl.name;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FqName {

    /* JADX INFO: renamed from: c */
    public static final FqName f54027c = new FqName("");

    /* JADX INFO: renamed from: a */
    public final FqNameUnsafe f54028a;

    /* JADX INFO: renamed from: b */
    public transient FqName f54029b;

    public FqName(String str) {
        if (str != null) {
            this.f54028a = new FqNameUnsafe(str, this);
        } else {
            m19584a(1);
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m19584a(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 8:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                i2 = 2;
                break;
            case 8:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "fqName";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 8:
                objArr[0] = "name";
                break;
            case TYPE_BYTES_VALUE:
                objArr[0] = "segment";
                break;
            case 13:
                objArr[0] = "shortName";
                break;
            default:
                objArr[0] = "names";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
                objArr[1] = "toUnsafe";
                break;
            case 6:
            case 7:
                objArr[1] = "parent";
                break;
            case 8:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 9:
                objArr[1] = "shortName";
                break;
            case 10:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 11:
                objArr[1] = "pathSegments";
                break;
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[2] = "<init>";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                break;
            case 8:
                objArr[2] = "child";
                break;
            case TYPE_BYTES_VALUE:
                objArr[2] = "startsWith";
                break;
            case 13:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "fromSegments";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(str2);
            case 8:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    /* JADX INFO: renamed from: j */
    public static FqName m19585j(Name name) {
        if (name == null) {
            m19584a(13);
            throw null;
        }
        if (name != null) {
            return new FqName(new FqNameUnsafe(name.m19608b(), f54027c.m19593i(), name));
        }
        FqNameUnsafe.m19594a(16);
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public final String m19586b() {
        String str = this.f54028a.f54033a;
        if (str != null) {
            return str;
        }
        FqNameUnsafe.m19594a(4);
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public final FqName m19587c(Name name) {
        if (name != null) {
            return new FqName(this.f54028a.m19595b(name), this);
        }
        m19584a(8);
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m19588d() {
        return this.f54028a.f54033a.isEmpty();
    }

    /* JADX INFO: renamed from: e */
    public final FqName m19589e() {
        FqName fqName = this.f54029b;
        if (fqName != null) {
            if (fqName != null) {
                return fqName;
            }
            m19584a(6);
            throw null;
        }
        if (m19588d()) {
            throw new IllegalStateException("root");
        }
        FqNameUnsafe fqNameUnsafe = this.f54028a;
        FqNameUnsafe fqNameUnsafe2 = fqNameUnsafe.f54035c;
        if (fqNameUnsafe2 == null) {
            if (fqNameUnsafe.f54033a.isEmpty()) {
                throw new IllegalStateException("root");
            }
            fqNameUnsafe.m19596c();
            fqNameUnsafe2 = fqNameUnsafe.f54035c;
            if (fqNameUnsafe2 == null) {
                FqNameUnsafe.m19594a(8);
                throw null;
            }
        }
        FqName fqName2 = new FqName(fqNameUnsafe2);
        this.f54029b = fqName2;
        return fqName2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FqName) && this.f54028a.equals(((FqName) obj).f54028a);
    }

    /* JADX INFO: renamed from: f */
    public final Name m19590f() {
        Name nameM19599f = this.f54028a.m19599f();
        if (nameM19599f != null) {
            return nameM19599f;
        }
        m19584a(9);
        throw null;
    }

    /* JADX INFO: renamed from: g */
    public final Name m19591g() {
        FqNameUnsafe fqNameUnsafe = this.f54028a;
        if (fqNameUnsafe.f54033a.isEmpty()) {
            Name name = FqNameUnsafe.f54030e;
            if (name != null) {
                return name;
            }
            FqNameUnsafe.m19594a(12);
            throw null;
        }
        Name nameM19599f = fqNameUnsafe.m19599f();
        if (nameM19599f != null) {
            return nameM19599f;
        }
        FqNameUnsafe.m19594a(13);
        throw null;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m19592h(Name name) {
        if (name == null) {
            m19584a(12);
            throw null;
        }
        String str = this.f54028a.f54033a;
        if (str.isEmpty()) {
            return false;
        }
        int iIndexOf = str.indexOf(46);
        String strM19608b = name.m19608b();
        if (iIndexOf == -1) {
            iIndexOf = Math.max(str.length(), strM19608b.length());
        }
        return str.regionMatches(0, strM19608b, 0, iIndexOf);
    }

    public final int hashCode() {
        return this.f54028a.f54033a.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final FqNameUnsafe m19593i() {
        FqNameUnsafe fqNameUnsafe = this.f54028a;
        if (fqNameUnsafe != null) {
            return fqNameUnsafe;
        }
        m19584a(5);
        throw null;
    }

    public final String toString() {
        return this.f54028a.toString();
    }

    public FqName(FqNameUnsafe fqNameUnsafe) {
        if (fqNameUnsafe != null) {
            this.f54028a = fqNameUnsafe;
        } else {
            m19584a(2);
            throw null;
        }
    }

    public FqName(FqNameUnsafe fqNameUnsafe, FqName fqName) {
        this.f54028a = fqNameUnsafe;
        this.f54029b = fqName;
    }
}
