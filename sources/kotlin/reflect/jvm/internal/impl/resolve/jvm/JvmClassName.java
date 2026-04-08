package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import com.google.firebase.sessions.settings.RemoteSettings;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class JvmClassName {

    /* JADX INFO: renamed from: a */
    public final String f54396a;

    public JvmClassName(String str) {
        if (str != null) {
            this.f54396a = str;
        } else {
            m19984a(5);
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m19984a(int i) {
        String str = (i == 3 || i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 3 || i == 6 || i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "classId";
                break;
            case 2:
            case 4:
                objArr[0] = "fqName";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            case 5:
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i == 3) {
            objArr[1] = "byFqNameWithoutInnerClasses";
        } else if (i == 6) {
            objArr[1] = "getFqNameForClassNameWithoutDollars";
        } else if (i == 7) {
            objArr[1] = "getPackageFqName";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
        } else {
            objArr[1] = "getInternalName";
        }
        switch (i) {
            case 1:
                objArr[2] = "byClassId";
                break;
            case 2:
            case 4:
                objArr[2] = "byFqNameWithoutInnerClasses";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                break;
            case 5:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "byInternalName";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 3 && i != 6 && i != 7 && i != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: b */
    public static JvmClassName m19985b(ClassId classId) {
        if (classId == null) {
            m19984a(1);
            throw null;
        }
        FqName fqNameM19581g = classId.m19581g();
        String strReplace = classId.m19582h().m19586b().replace('.', '$');
        if (fqNameM19581g.m19588d()) {
            return new JvmClassName(strReplace);
        }
        return new JvmClassName(fqNameM19581g.m19586b().replace('.', '/') + RemoteSettings.FORWARD_SLASH_STRING + strReplace);
    }

    /* JADX INFO: renamed from: c */
    public static JvmClassName m19986c(FqName fqName) {
        if (fqName != null) {
            return new JvmClassName(fqName.m19586b().replace('.', '/'));
        }
        m19984a(2);
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public static JvmClassName m19987d(String str) {
        if (str != null) {
            return new JvmClassName(str);
        }
        m19984a(0);
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public final String m19988e() {
        String str = this.f54396a;
        if (str != null) {
            return str;
        }
        m19984a(8);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f54396a.equals(((JvmClassName) obj).f54396a);
    }

    public final int hashCode() {
        return this.f54396a.hashCode();
    }

    public final String toString() {
        return this.f54396a;
    }
}
