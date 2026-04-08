package kotlin.reflect.jvm.internal.impl.name;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class FqNameUnsafe {

    /* JADX INFO: renamed from: e */
    public static final Name f54030e = Name.m19607h("<root>");

    /* JADX INFO: renamed from: f */
    public static final Pattern f54031f = Pattern.compile("\\.");

    /* JADX INFO: renamed from: g */
    public static final Function1 f54032g = new C61531();

    /* JADX INFO: renamed from: a */
    public final String f54033a;

    /* JADX INFO: renamed from: b */
    public transient FqName f54034b;

    /* JADX INFO: renamed from: c */
    public transient FqNameUnsafe f54035c;

    /* JADX INFO: renamed from: d */
    public transient Name f54036d;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe$1 */
    /* JADX INFO: compiled from: Proguard */
    public static class C61531 implements Function1<String, Name> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Name.m19604d((String) obj);
        }
    }

    public FqNameUnsafe(String str, FqName fqName) {
        if (str == null) {
            m19594a(0);
            throw null;
        }
        if (fqName == null) {
            m19594a(1);
            throw null;
        }
        this.f54033a = str;
        this.f54034b = fqName;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m19594a(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case TYPE_BYTES_VALUE:
            case 13:
            case 14:
            case 17:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 15:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case TYPE_BYTES_VALUE:
            case 13:
            case 14:
            case 17:
                i2 = 2;
                break;
            case 9:
            case 15:
            case 16:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        if (i != 1) {
            switch (i) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case TYPE_BYTES_VALUE:
                case 13:
                case 14:
                case 17:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                case 9:
                    objArr[0] = "name";
                    break;
                case 15:
                    objArr[0] = "segment";
                    break;
                case 16:
                    objArr[0] = "shortName";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
        } else {
            objArr[0] = "safe";
        }
        switch (i) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
            case 6:
                objArr[1] = "toSafe";
                break;
            case 7:
            case 8:
                objArr[1] = "parent";
                break;
            case 9:
            case 15:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                break;
            case 10:
            case 11:
                objArr[1] = "shortName";
                break;
            case TYPE_BYTES_VALUE:
            case 13:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 14:
                objArr[1] = "pathSegments";
                break;
            case 17:
                objArr[1] = "toString";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case TYPE_BYTES_VALUE:
            case 13:
            case 14:
            case 17:
                break;
            case 9:
                objArr[2] = "child";
                break;
            case 15:
                objArr[2] = "startsWith";
                break;
            case 16:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case TYPE_BYTES_VALUE:
            case 13:
            case 14:
            case 17:
                throw new IllegalStateException(str2);
            case 9:
            case 15:
            case 16:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final FqNameUnsafe m19595b(Name name) {
        String strM19608b;
        if (name == null) {
            m19594a(9);
            throw null;
        }
        String str = this.f54033a;
        if (str.isEmpty()) {
            strM19608b = name.m19608b();
        } else {
            strM19608b = str + "." + name.m19608b();
        }
        return new FqNameUnsafe(strM19608b, this, name);
    }

    /* JADX INFO: renamed from: c */
    public final void m19596c() {
        String str = this.f54033a;
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            this.f54036d = Name.m19604d(str.substring(iLastIndexOf + 1));
            this.f54035c = new FqNameUnsafe(str.substring(0, iLastIndexOf));
        } else {
            this.f54036d = Name.m19604d(str);
            this.f54035c = FqName.f54027c.m19593i();
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m19597d() {
        if (this.f54034b != null) {
            return true;
        }
        String str = this.f54033a;
        if (str != null) {
            return str.indexOf(60) < 0;
        }
        m19594a(4);
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public final List m19598e() {
        List list;
        String str = this.f54033a;
        if (str.isEmpty()) {
            list = Collections.EMPTY_LIST;
        } else {
            String[] strArrSplit = f54031f.split(str);
            Function1 transform = f54032g;
            Intrinsics.m18599g(strArrSplit, "<this>");
            Intrinsics.m18599g(transform, "transform");
            ArrayList arrayList = new ArrayList(strArrSplit.length);
            for (String str2 : strArrSplit) {
                arrayList.add(((C61531) transform).invoke(str2));
            }
            list = arrayList;
        }
        if (list != null) {
            return list;
        }
        m19594a(14);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FqNameUnsafe) && this.f54033a.equals(((FqNameUnsafe) obj).f54033a);
    }

    /* JADX INFO: renamed from: f */
    public final Name m19599f() {
        Name name = this.f54036d;
        if (name != null) {
            if (name != null) {
                return name;
            }
            m19594a(10);
            throw null;
        }
        if (this.f54033a.isEmpty()) {
            throw new IllegalStateException("root");
        }
        m19596c();
        Name name2 = this.f54036d;
        if (name2 != null) {
            return name2;
        }
        m19594a(11);
        throw null;
    }

    /* JADX INFO: renamed from: g */
    public final FqName m19600g() {
        FqName fqName = this.f54034b;
        if (fqName == null) {
            FqName fqName2 = new FqName(this);
            this.f54034b = fqName2;
            return fqName2;
        }
        if (fqName != null) {
            return fqName;
        }
        m19594a(5);
        throw null;
    }

    public final int hashCode() {
        return this.f54033a.hashCode();
    }

    public final String toString() {
        String strM19608b = this.f54033a;
        if (strM19608b.isEmpty()) {
            strM19608b = f54030e.m19608b();
        }
        if (strM19608b != null) {
            return strM19608b;
        }
        m19594a(17);
        throw null;
    }

    public FqNameUnsafe(String str) {
        if (str != null) {
            this.f54033a = str;
        } else {
            m19594a(2);
            throw null;
        }
    }

    public FqNameUnsafe(String str, FqNameUnsafe fqNameUnsafe, Name name) {
        if (str != null) {
            this.f54033a = str;
            this.f54035c = fqNameUnsafe;
            this.f54036d = name;
            return;
        }
        m19594a(3);
        throw null;
    }
}
