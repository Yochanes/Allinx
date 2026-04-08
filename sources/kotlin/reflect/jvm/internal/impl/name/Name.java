package kotlin.reflect.jvm.internal.impl.name;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class Name implements Comparable<Name> {

    /* JADX INFO: renamed from: a */
    public final String f54037a;

    /* JADX INFO: renamed from: b */
    public final boolean f54038b;

    public Name(String str, boolean z2) {
        if (str == null) {
            m19603a(0);
            throw null;
        }
        this.f54037a = str;
        this.f54038b = z2;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m19603a(int i) {
        String str = (i == 1 || i == 2 || i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 4) ? 2 : 3];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i == 1) {
            objArr[1] = "asString";
        } else if (i == 2) {
            objArr[1] = "getIdentifier";
        } else if (i == 3 || i == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "special";
                break;
            case 8:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: d */
    public static Name m19604d(String str) {
        if (str != null) {
            return str.startsWith("<") ? m19607h(str) : m19605e(str);
        }
        m19603a(8);
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public static Name m19605e(String str) {
        if (str != null) {
            return new Name(str, false);
        }
        m19603a(5);
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m19606f(String str) {
        if (str == null) {
            m19603a(6);
            throw null;
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '.' || cCharAt == '/' || cCharAt == '\\') {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public static Name m19607h(String str) {
        if (str == null) {
            m19603a(7);
            throw null;
        }
        if (str.startsWith("<")) {
            return new Name(str, true);
        }
        throw new IllegalArgumentException("special name must start with '<': ".concat(str));
    }

    /* JADX INFO: renamed from: b */
    public final String m19608b() {
        String str = this.f54037a;
        if (str != null) {
            return str;
        }
        m19603a(1);
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public final String m19609c() {
        if (this.f54038b) {
            throw new IllegalStateException("not identifier: " + this);
        }
        String strM19608b = m19608b();
        if (strM19608b != null) {
            return strM19608b;
        }
        m19603a(2);
        throw null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Name name) {
        return this.f54037a.compareTo(name.f54037a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Name)) {
            return false;
        }
        Name name = (Name) obj;
        return this.f54038b == name.f54038b && this.f54037a.equals(name.f54037a);
    }

    public final int hashCode() {
        return (this.f54037a.hashCode() * 31) + (this.f54038b ? 1 : 0);
    }

    public final String toString() {
        return this.f54037a;
    }
}
