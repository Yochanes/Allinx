package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import io.intercom.android.sdk.models.AttributeType;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public enum JvmPrimitiveType {
    BOOLEAN(PrimitiveType.BOOLEAN, AttributeType.BOOLEAN, "Z", "java.lang.Boolean"),
    CHAR(PrimitiveType.CHAR, "char", "C", "java.lang.Character"),
    BYTE(PrimitiveType.BYTE, "byte", "B", "java.lang.Byte"),
    SHORT(PrimitiveType.SHORT, "short", "S", "java.lang.Short"),
    INT(PrimitiveType.INT, "int", "I", "java.lang.Integer"),
    FLOAT(PrimitiveType.FLOAT, AttributeType.FLOAT, "F", "java.lang.Float"),
    LONG(PrimitiveType.LONG, "long", "J", "java.lang.Long"),
    DOUBLE(PrimitiveType.DOUBLE, "double", "D", "java.lang.Double");


    /* JADX INFO: renamed from: r */
    public static final HashSet f54405r = new HashSet();

    /* JADX INFO: renamed from: s */
    public static final HashMap f54406s = new HashMap();

    /* JADX INFO: renamed from: t */
    public static final EnumMap f54407t = new EnumMap(PrimitiveType.class);

    /* JADX INFO: renamed from: u */
    public static final HashMap f54408u = new HashMap();

    /* JADX INFO: renamed from: a */
    public final PrimitiveType f54410a;

    /* JADX INFO: renamed from: b */
    public final String f54411b;

    /* JADX INFO: renamed from: c */
    public final String f54412c;

    /* JADX INFO: renamed from: d */
    public final FqName f54413d;

    static {
        for (JvmPrimitiveType jvmPrimitiveType : values()) {
            f54405r.add(jvmPrimitiveType.m19993e());
            f54406s.put(jvmPrimitiveType.f54411b, jvmPrimitiveType);
            f54407t.put(jvmPrimitiveType.m19992d(), jvmPrimitiveType);
            f54408u.put(jvmPrimitiveType.m19991c(), jvmPrimitiveType);
        }
    }

    JvmPrimitiveType(PrimitiveType primitiveType, String str, String str2, String str3) {
        if (primitiveType == null) {
            m19989a(6);
            throw null;
        }
        this.f54410a = primitiveType;
        this.f54411b = str;
        this.f54412c = str2;
        this.f54413d = new FqName(str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void m19989a(int i) {
        String str;
        int i2;
        if (i != 2 && i != 4) {
            switch (i) {
                case 10:
                case 11:
                case TYPE_BYTES_VALUE:
                case 13:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 2 && i != 4) {
            switch (i) {
                case 10:
                case 11:
                case TYPE_BYTES_VALUE:
                case 13:
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
            case 7:
                objArr[0] = "name";
                break;
            case 2:
            case 4:
            case 10:
            case 11:
            case TYPE_BYTES_VALUE:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                break;
            case 3:
                objArr[0] = "type";
                break;
            case 5:
            case 8:
                objArr[0] = "desc";
                break;
            case 6:
                objArr[0] = "primitiveType";
                break;
            case 9:
                objArr[0] = "wrapperClassName";
                break;
            default:
                objArr[0] = "className";
                break;
        }
        if (i != 2 && i != 4) {
            switch (i) {
                case 10:
                    objArr[1] = "getPrimitiveType";
                    break;
                case 11:
                    objArr[1] = "getJavaKeywordName";
                    break;
                case TYPE_BYTES_VALUE:
                    objArr[1] = "getDesc";
                    break;
                case 13:
                    objArr[1] = "getWrapperFqName";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                    break;
            }
        } else {
            objArr[1] = "get";
        }
        switch (i) {
            case 1:
            case 3:
                objArr[2] = "get";
                break;
            case 2:
            case 4:
            case 10:
            case 11:
            case TYPE_BYTES_VALUE:
            case 13:
                break;
            case 5:
                objArr[2] = "getByDesc";
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "isWrapperClassName";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 4) {
            switch (i) {
                case 10:
                case 11:
                case TYPE_BYTES_VALUE:
                case 13:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: b */
    public static JvmPrimitiveType m19990b(String str) {
        JvmPrimitiveType jvmPrimitiveType = (JvmPrimitiveType) f54406s.get(str);
        if (jvmPrimitiveType != null) {
            return jvmPrimitiveType;
        }
        throw new AssertionError("Non-primitive type name passed: ".concat(str));
    }

    /* JADX INFO: renamed from: c */
    public final String m19991c() {
        String str = this.f54412c;
        if (str != null) {
            return str;
        }
        m19989a(12);
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public final PrimitiveType m19992d() {
        PrimitiveType primitiveType = this.f54410a;
        if (primitiveType != null) {
            return primitiveType;
        }
        m19989a(10);
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public final FqName m19993e() {
        FqName fqName = this.f54413d;
        if (fqName != null) {
            return fqName;
        }
        m19989a(13);
        throw null;
    }
}
