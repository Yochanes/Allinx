package kotlin.reflect.jvm.internal.impl.protobuf;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class WireFormat {

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'f' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: compiled from: Proguard */
    public static class FieldType {

        /* JADX INFO: renamed from: c */
        public static final FieldType f54170c;

        /* JADX INFO: renamed from: d */
        public static final FieldType f54171d;

        /* JADX INFO: renamed from: f */
        public static final FieldType f54172f;

        /* JADX INFO: renamed from: g */
        public static final FieldType f54173g;

        /* JADX INFO: renamed from: i */
        public static final FieldType f54174i;

        /* JADX INFO: renamed from: j */
        public static final FieldType f54175j;

        /* JADX INFO: renamed from: n */
        public static final FieldType f54176n;

        /* JADX INFO: renamed from: o */
        public static final FieldType f54177o;

        /* JADX INFO: renamed from: p */
        public static final FieldType f54178p;

        /* JADX INFO: renamed from: q */
        public static final FieldType f54179q;

        /* JADX INFO: renamed from: r */
        public static final FieldType f54180r;

        /* JADX INFO: renamed from: s */
        public static final FieldType f54181s;

        /* JADX INFO: renamed from: t */
        public static final FieldType f54182t;

        /* JADX INFO: renamed from: u */
        public static final FieldType f54183u;

        /* JADX INFO: renamed from: v */
        public static final FieldType f54184v;

        /* JADX INFO: renamed from: w */
        public static final FieldType f54185w;

        /* JADX INFO: renamed from: x */
        public static final FieldType f54186x;

        /* JADX INFO: renamed from: y */
        public static final FieldType f54187y;

        /* JADX INFO: renamed from: z */
        public static final /* synthetic */ FieldType[] f54188z;

        /* JADX INFO: renamed from: a */
        public final JavaType f54189a;

        /* JADX INFO: renamed from: b */
        public final int f54190b;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType$1 */
        /* JADX INFO: compiled from: Proguard */
        public enum C61661 extends FieldType {
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType$2 */
        /* JADX INFO: compiled from: Proguard */
        public enum C61672 extends FieldType {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType
            /* JADX INFO: renamed from: a */
            public final boolean mo19729a() {
                return false;
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType$3 */
        /* JADX INFO: compiled from: Proguard */
        public enum C61683 extends FieldType {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType
            /* JADX INFO: renamed from: a */
            public final boolean mo19729a() {
                return false;
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType$4 */
        /* JADX INFO: compiled from: Proguard */
        public enum C61694 extends FieldType {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType
            /* JADX INFO: renamed from: a */
            public final boolean mo19729a() {
                return false;
            }
        }

        static {
            FieldType fieldType = new FieldType("DOUBLE", 0, JavaType.DOUBLE, 1);
            f54170c = fieldType;
            FieldType fieldType2 = new FieldType("FLOAT", 1, JavaType.FLOAT, 5);
            f54171d = fieldType2;
            JavaType javaType = JavaType.LONG;
            FieldType fieldType3 = new FieldType("INT64", 2, javaType, 0);
            f54172f = fieldType3;
            FieldType fieldType4 = new FieldType("UINT64", 3, javaType, 0);
            f54173g = fieldType4;
            JavaType javaType2 = JavaType.INT;
            FieldType fieldType5 = new FieldType("INT32", 4, javaType2, 0);
            f54174i = fieldType5;
            FieldType fieldType6 = new FieldType("FIXED64", 5, javaType, 1);
            f54175j = fieldType6;
            FieldType fieldType7 = new FieldType("FIXED32", 6, javaType2, 5);
            f54176n = fieldType7;
            FieldType fieldType8 = new FieldType("BOOL", 7, JavaType.BOOLEAN, 0);
            f54177o = fieldType8;
            C61661 c61661 = new C61661("STRING", 8, JavaType.STRING, 2);
            f54178p = c61661;
            JavaType javaType3 = JavaType.MESSAGE;
            C61672 c61672 = new C61672("GROUP", 9, javaType3, 3);
            f54179q = c61672;
            C61683 c61683 = new C61683("MESSAGE", 10, javaType3, 2);
            f54180r = c61683;
            C61694 c61694 = new C61694("BYTES", 11, JavaType.BYTE_STRING, 2);
            f54181s = c61694;
            FieldType fieldType9 = new FieldType("UINT32", 12, javaType2, 0);
            f54182t = fieldType9;
            FieldType fieldType10 = new FieldType("ENUM", 13, JavaType.ENUM, 0);
            f54183u = fieldType10;
            FieldType fieldType11 = new FieldType("SFIXED32", 14, javaType2, 5);
            f54184v = fieldType11;
            FieldType fieldType12 = new FieldType("SFIXED64", 15, javaType, 1);
            f54185w = fieldType12;
            FieldType fieldType13 = new FieldType("SINT32", 16, javaType2, 0);
            f54186x = fieldType13;
            FieldType fieldType14 = new FieldType("SINT64", 17, javaType, 0);
            f54187y = fieldType14;
            f54188z = new FieldType[]{fieldType, fieldType2, fieldType3, fieldType4, fieldType5, fieldType6, fieldType7, fieldType8, c61661, c61672, c61683, c61694, fieldType9, fieldType10, fieldType11, fieldType12, fieldType13, fieldType14};
        }

        public FieldType(String str, int i, JavaType javaType, int i2) {
            this.f54189a = javaType;
            this.f54190b = i2;
        }

        public static FieldType valueOf(String str) {
            return (FieldType) Enum.valueOf(FieldType.class, str);
        }

        public static FieldType[] values() {
            return (FieldType[]) f54188z.clone();
        }

        /* JADX INFO: renamed from: a */
        public boolean mo19729a() {
            return !(this instanceof C61661);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public enum JavaType {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(ByteString.f54075a),
        ENUM(null),
        MESSAGE(null);


        /* JADX INFO: renamed from: a */
        public final Object f54201a;

        JavaType(Object obj) {
            this.f54201a = obj;
        }
    }
}
