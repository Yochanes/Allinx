package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class Flags {

    /* JADX INFO: renamed from: A */
    public static final BooleanFlagField f53870A;

    /* JADX INFO: renamed from: B */
    public static final BooleanFlagField f53871B;

    /* JADX INFO: renamed from: C */
    public static final BooleanFlagField f53872C;

    /* JADX INFO: renamed from: D */
    public static final BooleanFlagField f53873D;

    /* JADX INFO: renamed from: E */
    public static final BooleanFlagField f53874E;

    /* JADX INFO: renamed from: F */
    public static final BooleanFlagField f53875F;

    /* JADX INFO: renamed from: G */
    public static final BooleanFlagField f53876G;

    /* JADX INFO: renamed from: H */
    public static final BooleanFlagField f53877H;

    /* JADX INFO: renamed from: I */
    public static final BooleanFlagField f53878I;

    /* JADX INFO: renamed from: J */
    public static final BooleanFlagField f53879J;

    /* JADX INFO: renamed from: K */
    public static final BooleanFlagField f53880K;

    /* JADX INFO: renamed from: L */
    public static final BooleanFlagField f53881L;

    /* JADX INFO: renamed from: M */
    public static final BooleanFlagField f53882M;

    /* JADX INFO: renamed from: a */
    public static final BooleanFlagField f53883a;

    /* JADX INFO: renamed from: b */
    public static final BooleanFlagField f53884b;

    /* JADX INFO: renamed from: c */
    public static final BooleanFlagField f53885c;

    /* JADX INFO: renamed from: d */
    public static final FlagField f53886d;

    /* JADX INFO: renamed from: e */
    public static final FlagField f53887e;

    /* JADX INFO: renamed from: f */
    public static final FlagField f53888f;

    /* JADX INFO: renamed from: g */
    public static final BooleanFlagField f53889g;

    /* JADX INFO: renamed from: h */
    public static final BooleanFlagField f53890h;

    /* JADX INFO: renamed from: i */
    public static final BooleanFlagField f53891i;

    /* JADX INFO: renamed from: j */
    public static final BooleanFlagField f53892j;

    /* JADX INFO: renamed from: k */
    public static final BooleanFlagField f53893k;

    /* JADX INFO: renamed from: l */
    public static final BooleanFlagField f53894l;

    /* JADX INFO: renamed from: m */
    public static final BooleanFlagField f53895m;

    /* JADX INFO: renamed from: n */
    public static final BooleanFlagField f53896n;

    /* JADX INFO: renamed from: o */
    public static final FlagField f53897o;

    /* JADX INFO: renamed from: p */
    public static final BooleanFlagField f53898p;

    /* JADX INFO: renamed from: q */
    public static final BooleanFlagField f53899q;

    /* JADX INFO: renamed from: r */
    public static final BooleanFlagField f53900r;

    /* JADX INFO: renamed from: s */
    public static final BooleanFlagField f53901s;

    /* JADX INFO: renamed from: t */
    public static final BooleanFlagField f53902t;

    /* JADX INFO: renamed from: u */
    public static final BooleanFlagField f53903u;

    /* JADX INFO: renamed from: v */
    public static final BooleanFlagField f53904v;

    /* JADX INFO: renamed from: w */
    public static final BooleanFlagField f53905w;

    /* JADX INFO: renamed from: x */
    public static final BooleanFlagField f53906x;

    /* JADX INFO: renamed from: y */
    public static final BooleanFlagField f53907y;

    /* JADX INFO: renamed from: z */
    public static final BooleanFlagField f53908z;

    /* JADX INFO: compiled from: Proguard */
    public static class BooleanFlagField extends FlagField<Boolean> {
        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField
        /* JADX INFO: renamed from: c */
        public final /* bridge */ /* synthetic */ Object mo19527c(int i) {
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField
        /* JADX INFO: renamed from: d */
        public final /* bridge */ /* synthetic */ int mo19528d(Object obj) {
            throw null;
        }

        /* JADX INFO: renamed from: e */
        public final Boolean m19529e(int i) {
            return Boolean.valueOf((i & (1 << this.f53910a)) != 0);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class EnumLiteFlagField<E extends Internal.EnumLite> extends FlagField<E> {

        /* JADX INFO: renamed from: c */
        public final Internal.EnumLite[] f53909c;

        /* JADX WARN: Illegal instructions before constructor call */
        public EnumLiteFlagField(int i, Internal.EnumLite[] enumLiteArr) {
            if (enumLiteArr == null) {
                throw new IllegalArgumentException("Argument for @NotNull parameter 'enumEntries' of kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField.bitWidth must not be null");
            }
            int i2 = 1;
            int length = enumLiteArr.length - 1;
            if (length != 0) {
                for (int i3 = 31; i3 >= 0; i3--) {
                    if (((1 << i3) & length) != 0) {
                        i2 = 1 + i3;
                    }
                }
                throw new IllegalStateException("Empty enum: " + enumLiteArr.getClass());
            }
            super(i, i2);
            this.f53909c = enumLiteArr;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField
        /* JADX INFO: renamed from: c */
        public final Object mo19527c(int i) {
            int i2 = (1 << this.f53911b) - 1;
            int i3 = this.f53910a;
            int i4 = (i & (i2 << i3)) >> i3;
            for (Internal.EnumLite enumLite : this.f53909c) {
                if (enumLite.getNumber() == i4) {
                    return enumLite;
                }
            }
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField
        /* JADX INFO: renamed from: d */
        public final int mo19528d(Object obj) {
            return ((Internal.EnumLite) obj).getNumber() << this.f53910a;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class FlagField<E> {

        /* JADX INFO: renamed from: a */
        public final int f53910a;

        /* JADX INFO: renamed from: b */
        public final int f53911b;

        public FlagField(int i, int i2) {
            this.f53910a = i;
            this.f53911b = i2;
        }

        /* JADX INFO: renamed from: a */
        public static BooleanFlagField m19530a(FlagField flagField) {
            return new BooleanFlagField(flagField.f53910a + flagField.f53911b, 1);
        }

        /* JADX INFO: renamed from: b */
        public static BooleanFlagField m19531b() {
            return new BooleanFlagField(0, 1);
        }

        /* JADX INFO: renamed from: c */
        public abstract Object mo19527c(int i);

        /* JADX INFO: renamed from: d */
        public abstract int mo19528d(Object obj);
    }

    static {
        BooleanFlagField booleanFlagFieldM19531b = FlagField.m19531b();
        f53883a = booleanFlagFieldM19531b;
        f53884b = FlagField.m19530a(booleanFlagFieldM19531b);
        BooleanFlagField booleanFlagFieldM19531b2 = FlagField.m19531b();
        f53885c = booleanFlagFieldM19531b2;
        ProtoBuf.Visibility[] visibilityArrValues = ProtoBuf.Visibility.values();
        int i = booleanFlagFieldM19531b2.f53910a + booleanFlagFieldM19531b2.f53911b;
        EnumLiteFlagField enumLiteFlagField = new EnumLiteFlagField(i, visibilityArrValues);
        f53886d = enumLiteFlagField;
        ProtoBuf.Modality[] modalityArrValues = ProtoBuf.Modality.values();
        int i2 = i + enumLiteFlagField.f53911b;
        EnumLiteFlagField enumLiteFlagField2 = new EnumLiteFlagField(i2, modalityArrValues);
        f53887e = enumLiteFlagField2;
        ProtoBuf.Class.Kind[] kindArrValues = ProtoBuf.Class.Kind.values();
        int i3 = enumLiteFlagField2.f53911b;
        EnumLiteFlagField enumLiteFlagField3 = new EnumLiteFlagField(i2 + i3, kindArrValues);
        f53888f = enumLiteFlagField3;
        BooleanFlagField booleanFlagFieldM19530a = FlagField.m19530a(enumLiteFlagField3);
        f53889g = booleanFlagFieldM19530a;
        BooleanFlagField booleanFlagFieldM19530a2 = FlagField.m19530a(booleanFlagFieldM19530a);
        f53890h = booleanFlagFieldM19530a2;
        BooleanFlagField booleanFlagFieldM19530a3 = FlagField.m19530a(booleanFlagFieldM19530a2);
        f53891i = booleanFlagFieldM19530a3;
        BooleanFlagField booleanFlagFieldM19530a4 = FlagField.m19530a(booleanFlagFieldM19530a3);
        f53892j = booleanFlagFieldM19530a4;
        BooleanFlagField booleanFlagFieldM19530a5 = FlagField.m19530a(booleanFlagFieldM19530a4);
        f53893k = booleanFlagFieldM19530a5;
        f53894l = FlagField.m19530a(booleanFlagFieldM19530a5);
        BooleanFlagField booleanFlagFieldM19530a6 = FlagField.m19530a(enumLiteFlagField);
        f53895m = booleanFlagFieldM19530a6;
        f53896n = FlagField.m19530a(booleanFlagFieldM19530a6);
        EnumLiteFlagField enumLiteFlagField4 = new EnumLiteFlagField(i2 + i3, ProtoBuf.MemberKind.values());
        f53897o = enumLiteFlagField4;
        BooleanFlagField booleanFlagFieldM19530a7 = FlagField.m19530a(enumLiteFlagField4);
        f53898p = booleanFlagFieldM19530a7;
        BooleanFlagField booleanFlagFieldM19530a8 = FlagField.m19530a(booleanFlagFieldM19530a7);
        f53899q = booleanFlagFieldM19530a8;
        BooleanFlagField booleanFlagFieldM19530a9 = FlagField.m19530a(booleanFlagFieldM19530a8);
        f53900r = booleanFlagFieldM19530a9;
        BooleanFlagField booleanFlagFieldM19530a10 = FlagField.m19530a(booleanFlagFieldM19530a9);
        f53901s = booleanFlagFieldM19530a10;
        BooleanFlagField booleanFlagFieldM19530a11 = FlagField.m19530a(booleanFlagFieldM19530a10);
        f53902t = booleanFlagFieldM19530a11;
        BooleanFlagField booleanFlagFieldM19530a12 = FlagField.m19530a(booleanFlagFieldM19530a11);
        f53903u = booleanFlagFieldM19530a12;
        BooleanFlagField booleanFlagFieldM19530a13 = FlagField.m19530a(booleanFlagFieldM19530a12);
        f53904v = booleanFlagFieldM19530a13;
        f53905w = FlagField.m19530a(booleanFlagFieldM19530a13);
        BooleanFlagField booleanFlagFieldM19530a14 = FlagField.m19530a(enumLiteFlagField4);
        f53906x = booleanFlagFieldM19530a14;
        BooleanFlagField booleanFlagFieldM19530a15 = FlagField.m19530a(booleanFlagFieldM19530a14);
        f53907y = booleanFlagFieldM19530a15;
        BooleanFlagField booleanFlagFieldM19530a16 = FlagField.m19530a(booleanFlagFieldM19530a15);
        f53908z = booleanFlagFieldM19530a16;
        BooleanFlagField booleanFlagFieldM19530a17 = FlagField.m19530a(booleanFlagFieldM19530a16);
        f53870A = booleanFlagFieldM19530a17;
        BooleanFlagField booleanFlagFieldM19530a18 = FlagField.m19530a(booleanFlagFieldM19530a17);
        f53871B = booleanFlagFieldM19530a18;
        BooleanFlagField booleanFlagFieldM19530a19 = FlagField.m19530a(booleanFlagFieldM19530a18);
        f53872C = booleanFlagFieldM19530a19;
        BooleanFlagField booleanFlagFieldM19530a20 = FlagField.m19530a(booleanFlagFieldM19530a19);
        f53873D = booleanFlagFieldM19530a20;
        BooleanFlagField booleanFlagFieldM19530a21 = FlagField.m19530a(booleanFlagFieldM19530a20);
        f53874E = booleanFlagFieldM19530a21;
        f53875F = FlagField.m19530a(booleanFlagFieldM19530a21);
        BooleanFlagField booleanFlagFieldM19530a22 = FlagField.m19530a(booleanFlagFieldM19531b2);
        f53876G = booleanFlagFieldM19530a22;
        BooleanFlagField booleanFlagFieldM19530a23 = FlagField.m19530a(booleanFlagFieldM19530a22);
        f53877H = booleanFlagFieldM19530a23;
        f53878I = FlagField.m19530a(booleanFlagFieldM19530a23);
        BooleanFlagField booleanFlagFieldM19530a24 = FlagField.m19530a(enumLiteFlagField2);
        f53879J = booleanFlagFieldM19530a24;
        BooleanFlagField booleanFlagFieldM19530a25 = FlagField.m19530a(booleanFlagFieldM19530a24);
        f53880K = booleanFlagFieldM19530a25;
        f53881L = FlagField.m19530a(booleanFlagFieldM19530a25);
        f53882M = FlagField.m19531b();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002b  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void m19526a(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "modality";
        } else if (i == 2) {
            objArr[0] = "kind";
        } else if (i != 5) {
            if (i == 6) {
                objArr[0] = "memberKind";
            } else if (i != 8) {
                if (i != 9) {
                    if (i != 11) {
                        objArr[0] = "visibility";
                    }
                }
            }
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags";
        switch (i) {
            case 3:
                objArr[2] = "getConstructorFlags";
                break;
            case 4:
            case 5:
            case 6:
                objArr[2] = "getFunctionFlags";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "getPropertyFlags";
                break;
            case 10:
            case 11:
                objArr[2] = "getAccessorFlags";
                break;
            default:
                objArr[2] = "getClassFlags";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }
}
