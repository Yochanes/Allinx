package kotlin.reflect.jvm.internal.impl.name;

import com.google.firebase.sessions.settings.RemoteSettings;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ClassId {

    /* JADX INFO: renamed from: a */
    public final FqName f54024a;

    /* JADX INFO: renamed from: b */
    public final FqName f54025b;

    /* JADX INFO: renamed from: c */
    public final boolean f54026c;

    public ClassId(FqName fqName, FqName fqName2, boolean z2) {
        if (fqName == null) {
            m19574a(1);
            throw null;
        }
        this.f54024a = fqName;
        this.f54025b = fqName2;
        this.f54026c = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void m19574a(int i) {
        String str;
        int i2;
        if (i != 5 && i != 6 && i != 7 && i != 9) {
            switch (i) {
                case 13:
                case 14:
                case 15:
                case 16:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 5 && i != 6 && i != 7 && i != 9) {
            switch (i) {
                case 13:
                case 14:
                case 15:
                case 16:
                    i2 = 2;
                    break;
                default:
                    i2 = 3;
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 3:
                objArr[0] = "packageFqName";
                break;
            case 2:
                objArr[0] = "relativeClassName";
                break;
            case 4:
                objArr[0] = "topLevelName";
                break;
            case 5:
            case 6:
            case 7:
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
                break;
            case 8:
                objArr[0] = "name";
                break;
            case 10:
                objArr[0] = "segment";
                break;
            case 11:
            case TYPE_BYTES_VALUE:
                objArr[0] = "string";
                break;
            default:
                objArr[0] = "topLevelFqName";
                break;
        }
        if (i == 5) {
            objArr[1] = "getPackageFqName";
        } else if (i == 6) {
            objArr[1] = "getRelativeClassName";
        } else if (i == 7) {
            objArr[1] = "getShortClassName";
        } else if (i != 9) {
            switch (i) {
                case 13:
                case 14:
                    objArr[1] = "asString";
                    break;
                case 15:
                case 16:
                    objArr[1] = "asFqNameString";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
                    break;
            }
        } else {
            objArr[1] = "asSingleFqName";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                objArr[2] = "<init>";
                break;
            case 5:
            case 6:
            case 7:
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
                break;
            case 8:
                objArr[2] = "createNestedClassId";
                break;
            case 10:
                objArr[2] = "startsWith";
                break;
            case 11:
            case TYPE_BYTES_VALUE:
                objArr[2] = "fromString";
                break;
            default:
                objArr[2] = "topLevel";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 5 && i != 6 && i != 7 && i != 9) {
            switch (i) {
                case 13:
                case 14:
                case 15:
                case 16:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: e */
    public static ClassId m19575e(String str, boolean z2) {
        String str2;
        if (str == null) {
            m19574a(12);
            throw null;
        }
        int iLastIndexOf = str.lastIndexOf(RemoteSettings.FORWARD_SLASH_STRING);
        if (iLastIndexOf == -1) {
            str2 = "";
        } else {
            String strReplace = str.substring(0, iLastIndexOf).replace('/', '.');
            str = str.substring(iLastIndexOf + 1);
            str2 = strReplace;
        }
        return new ClassId(new FqName(str2), new FqName(str), z2);
    }

    /* JADX INFO: renamed from: j */
    public static ClassId m19576j(FqName fqName) {
        if (fqName != null) {
            return new ClassId(fqName.m19589e(), fqName.m19590f());
        }
        m19574a(0);
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public final FqName m19577b() {
        FqName fqName = this.f54024a;
        boolean zM19588d = fqName.m19588d();
        FqName fqName2 = this.f54025b;
        if (zM19588d) {
            if (fqName2 != null) {
                return fqName2;
            }
            m19574a(9);
            throw null;
        }
        return new FqName(fqName.m19586b() + "." + fqName2.m19586b());
    }

    /* JADX INFO: renamed from: c */
    public final String m19578c() {
        FqName fqName = this.f54024a;
        boolean zM19588d = fqName.m19588d();
        FqName fqName2 = this.f54025b;
        if (zM19588d) {
            return fqName2.m19586b();
        }
        String str = fqName.m19586b().replace('.', '/') + RemoteSettings.FORWARD_SLASH_STRING + fqName2.m19586b();
        if (str != null) {
            return str;
        }
        m19574a(14);
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public final ClassId m19579d(Name name) {
        if (name != null) {
            return new ClassId(m19581g(), this.f54025b.m19587c(name), this.f54026c);
        }
        m19574a(8);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ClassId.class == obj.getClass()) {
            ClassId classId = (ClassId) obj;
            if (this.f54024a.equals(classId.f54024a) && this.f54025b.equals(classId.f54025b) && this.f54026c == classId.f54026c) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final ClassId m19580f() {
        FqName fqNameM19589e = this.f54025b.m19589e();
        if (fqNameM19589e.m19588d()) {
            return null;
        }
        return new ClassId(m19581g(), fqNameM19589e, this.f54026c);
    }

    /* JADX INFO: renamed from: g */
    public final FqName m19581g() {
        FqName fqName = this.f54024a;
        if (fqName != null) {
            return fqName;
        }
        m19574a(5);
        throw null;
    }

    /* JADX INFO: renamed from: h */
    public final FqName m19582h() {
        FqName fqName = this.f54025b;
        if (fqName != null) {
            return fqName;
        }
        m19574a(6);
        throw null;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f54026c).hashCode() + ((this.f54025b.hashCode() + (this.f54024a.hashCode() * 31)) * 31);
    }

    /* JADX INFO: renamed from: i */
    public final Name m19583i() {
        Name nameM19590f = this.f54025b.m19590f();
        if (nameM19590f != null) {
            return nameM19590f;
        }
        m19574a(7);
        throw null;
    }

    public final String toString() {
        return this.f54024a.m19588d() ? RemoteSettings.FORWARD_SLASH_STRING.concat(m19578c()) : m19578c();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClassId(FqName fqName, Name name) {
        this(fqName, FqName.m19585j(name), false);
        if (fqName == null) {
            m19574a(3);
            throw null;
        }
        if (name != null) {
        } else {
            m19574a(4);
            throw null;
        }
    }
}
