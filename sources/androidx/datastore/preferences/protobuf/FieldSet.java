package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite;
import androidx.datastore.preferences.protobuf.Internal;
import androidx.datastore.preferences.protobuf.LazyField;
import androidx.datastore.preferences.protobuf.SmallSortedMap;
import androidx.datastore.preferences.protobuf.WireFormat;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class FieldSet<T extends FieldDescriptorLite<T>> {

    /* JADX INFO: renamed from: a */
    public final SmallSortedMap.C15851 f23962a;

    /* JADX INFO: renamed from: b */
    public boolean f23963b;

    /* JADX INFO: renamed from: c */
    public boolean f23964c;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.FieldSet$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C15651 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f23965a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f23966b;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f23966b = iArr;
            try {
                iArr[WireFormat.FieldType.f24166c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23966b[WireFormat.FieldType.f24167d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23966b[WireFormat.FieldType.f24168f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23966b[WireFormat.FieldType.f24169g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23966b[WireFormat.FieldType.f24170i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23966b[WireFormat.FieldType.f24171j.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23966b[WireFormat.FieldType.f24172n.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f23966b[WireFormat.FieldType.f24173o.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f23966b[WireFormat.FieldType.f24175q.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f23966b[WireFormat.FieldType.f24176r.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f23966b[WireFormat.FieldType.f24174p.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f23966b[WireFormat.FieldType.f24177s.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f23966b[WireFormat.FieldType.f24178t.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f23966b[WireFormat.FieldType.f24180v.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f23966b[WireFormat.FieldType.f24181w.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f23966b[WireFormat.FieldType.f24182x.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f23966b[WireFormat.FieldType.f24183y.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f23966b[WireFormat.FieldType.f24179u.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[WireFormat.JavaType.values().length];
            f23965a = iArr2;
            try {
                WireFormat.JavaType javaType = WireFormat.JavaType.INT;
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                int[] iArr3 = f23965a;
                WireFormat.JavaType javaType2 = WireFormat.JavaType.INT;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                int[] iArr4 = f23965a;
                WireFormat.JavaType javaType3 = WireFormat.JavaType.INT;
                iArr4[2] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                int[] iArr5 = f23965a;
                WireFormat.JavaType javaType4 = WireFormat.JavaType.INT;
                iArr5[3] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                int[] iArr6 = f23965a;
                WireFormat.JavaType javaType5 = WireFormat.JavaType.INT;
                iArr6[4] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                int[] iArr7 = f23965a;
                WireFormat.JavaType javaType6 = WireFormat.JavaType.INT;
                iArr7[5] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f23965a[WireFormat.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f23965a[WireFormat.JavaType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f23965a[WireFormat.JavaType.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder<T extends FieldDescriptorLite<T>> {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface FieldDescriptorLite<T extends FieldDescriptorLite<T>> extends Comparable<T> {
        WireFormat.JavaType getLiteJavaType();
    }

    static {
        new FieldSet(0);
    }

    public FieldSet() {
        this.f23962a = new SmallSortedMap.C15851(16);
    }

    /* JADX INFO: renamed from: b */
    public static int m8489b(WireFormat.FieldType fieldType, int i, Object obj) {
        int serializedSize;
        int iM8444s;
        int iM8442q = CodedOutputStream.m8442q(i);
        if (fieldType == WireFormat.FieldType.f24175q) {
            iM8442q *= 2;
        }
        int iM8445t = 4;
        switch (fieldType.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                Logger logger = CodedOutputStream.f23901b;
                iM8445t = 8;
                return iM8442q + iM8445t;
            case 1:
                ((Float) obj).getClass();
                Logger logger2 = CodedOutputStream.f23901b;
                return iM8442q + iM8445t;
            case 2:
                iM8445t = CodedOutputStream.m8445t(((Long) obj).longValue());
                return iM8442q + iM8445t;
            case 3:
                iM8445t = CodedOutputStream.m8445t(((Long) obj).longValue());
                return iM8442q + iM8445t;
            case 4:
                iM8445t = CodedOutputStream.m8439n(((Integer) obj).intValue());
                return iM8442q + iM8445t;
            case 5:
                ((Long) obj).getClass();
                Logger logger3 = CodedOutputStream.f23901b;
                iM8445t = 8;
                return iM8442q + iM8445t;
            case 6:
                ((Integer) obj).getClass();
                Logger logger4 = CodedOutputStream.f23901b;
                return iM8442q + iM8445t;
            case 7:
                ((Boolean) obj).getClass();
                Logger logger5 = CodedOutputStream.f23901b;
                iM8445t = 1;
                return iM8442q + iM8445t;
            case 8:
                iM8445t = obj instanceof ByteString ? CodedOutputStream.m8435j((ByteString) obj) : CodedOutputStream.m8441p((String) obj);
                return iM8442q + iM8445t;
            case 9:
                Logger logger6 = CodedOutputStream.f23901b;
                iM8445t = ((MessageLite) obj).getSerializedSize();
                return iM8442q + iM8445t;
            case 10:
                if (obj instanceof LazyField) {
                    iM8445t = CodedOutputStream.m8440o((LazyField) obj);
                    return iM8442q + iM8445t;
                }
                Logger logger7 = CodedOutputStream.f23901b;
                serializedSize = ((MessageLite) obj).getSerializedSize();
                iM8444s = CodedOutputStream.m8444s(serializedSize);
                iM8445t = iM8444s + serializedSize;
                return iM8442q + iM8445t;
            case 11:
                if (obj instanceof ByteString) {
                    iM8445t = CodedOutputStream.m8435j((ByteString) obj);
                    return iM8442q + iM8445t;
                }
                Logger logger8 = CodedOutputStream.f23901b;
                serializedSize = ((byte[]) obj).length;
                iM8444s = CodedOutputStream.m8444s(serializedSize);
                iM8445t = iM8444s + serializedSize;
                return iM8442q + iM8445t;
            case TYPE_BYTES_VALUE:
                iM8445t = CodedOutputStream.m8444s(((Integer) obj).intValue());
                return iM8442q + iM8445t;
            case 13:
                iM8445t = obj instanceof Internal.EnumLite ? CodedOutputStream.m8439n(((Internal.EnumLite) obj).getNumber()) : CodedOutputStream.m8439n(((Integer) obj).intValue());
                return iM8442q + iM8445t;
            case 14:
                ((Integer) obj).getClass();
                Logger logger9 = CodedOutputStream.f23901b;
                return iM8442q + iM8445t;
            case 15:
                ((Long) obj).getClass();
                Logger logger10 = CodedOutputStream.f23901b;
                iM8445t = 8;
                return iM8442q + iM8445t;
            case 16:
                iM8445t = CodedOutputStream.m8444s(CodedOutputStream.m8446u(((Integer) obj).intValue()));
                return iM8442q + iM8445t;
            case 17:
                iM8445t = CodedOutputStream.m8445t(CodedOutputStream.m8447v(((Long) obj).longValue()));
                return iM8442q + iM8445t;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m8490c(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        fieldDescriptorLite.getClass();
        return m8489b(null, 0, obj);
    }

    /* JADX INFO: renamed from: d */
    public static int m8491d(Map.Entry entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        entry.getValue();
        fieldDescriptorLite.getLiteJavaType();
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m8492f(Map.Entry entry) {
        ((FieldDescriptorLite) entry.getKey()).getLiteJavaType();
        throw null;
    }

    /* JADX INFO: renamed from: k */
    public static void m8493k(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i, Object obj) {
        if (fieldType == WireFormat.FieldType.f24175q) {
            codedOutputStream.mo8457J(i, 3);
            ((MessageLite) obj).mo8508b(codedOutputStream);
            codedOutputStream.mo8457J(i, 4);
        }
        codedOutputStream.mo8457J(i, fieldType.f24186b);
        switch (fieldType.ordinal()) {
            case 0:
                codedOutputStream.mo8449B(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                codedOutputStream.mo8448A(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                codedOutputStream.mo8459L(((Long) obj).longValue());
                break;
            case 3:
                codedOutputStream.mo8459L(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.mo8450C(((Integer) obj).intValue());
                break;
            case 5:
                codedOutputStream.mo8449B(((Long) obj).longValue());
                break;
            case 6:
                codedOutputStream.mo8448A(((Integer) obj).intValue());
                break;
            case 7:
                codedOutputStream.mo8462x(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.mo8456I((String) obj);
                } else {
                    codedOutputStream.mo8464z((ByteString) obj);
                }
                break;
            case 9:
                ((MessageLite) obj).mo8508b(codedOutputStream);
                break;
            case 10:
                codedOutputStream.mo8453F((MessageLite) obj);
                break;
            case 11:
                if (!(obj instanceof ByteString)) {
                    byte[] bArr = (byte[]) obj;
                    codedOutputStream.mo8463y(bArr.length, bArr);
                } else {
                    codedOutputStream.mo8464z((ByteString) obj);
                }
                break;
            case TYPE_BYTES_VALUE:
                codedOutputStream.mo8458K(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof Internal.EnumLite)) {
                    codedOutputStream.mo8450C(((Integer) obj).intValue());
                } else {
                    codedOutputStream.mo8450C(((Internal.EnumLite) obj).getNumber());
                }
                break;
            case 14:
                codedOutputStream.mo8448A(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.mo8449B(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.mo8458K(CodedOutputStream.m8446u(((Integer) obj).intValue()));
                break;
            case 17:
                codedOutputStream.mo8459L(CodedOutputStream.m8447v(((Long) obj).longValue()));
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public final FieldSet m8494a() {
        SmallSortedMap.C15851 c15851;
        FieldSet fieldSet = new FieldSet();
        int i = 0;
        while (true) {
            c15851 = this.f23962a;
            if (i >= c15851.f24109b.size()) {
                break;
            }
            Map.Entry entryM8631f = c15851.m8631f(i);
            fieldSet.m8499j((FieldDescriptorLite) entryM8631f.getKey(), entryM8631f.getValue());
            i++;
        }
        for (Map.Entry entry : c15851.m8632g()) {
            fieldSet.m8499j((FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        fieldSet.f23964c = this.f23964c;
        return fieldSet;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return m8494a();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m8495e() {
        SmallSortedMap.C15851 c15851 = this.f23962a;
        if (c15851.f24109b.size() > 0) {
            m8492f(c15851.m8631f(0));
            throw null;
        }
        Iterator it = c15851.m8632g().iterator();
        if (!it.hasNext()) {
            return true;
        }
        m8492f((Map.Entry) it.next());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FieldSet) {
            return this.f23962a.equals(((FieldSet) obj).f23962a);
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final Iterator m8496g() {
        boolean z2 = this.f23964c;
        SmallSortedMap.C15851 c15851 = this.f23962a;
        return z2 ? new LazyField.LazyIterator(((SmallSortedMap.EntrySet) c15851.entrySet()).iterator()) : ((SmallSortedMap.EntrySet) c15851.entrySet()).iterator();
    }

    /* JADX INFO: renamed from: h */
    public final void m8497h() {
        if (this.f23963b) {
            return;
        }
        this.f23962a.mo8634j();
        this.f23963b = true;
    }

    public final int hashCode() {
        return this.f23962a.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final void m8498i(Map.Entry entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof LazyField) {
            ((LazyField) value).m8525a(null);
        }
        fieldDescriptorLite.getClass();
        fieldDescriptorLite.getLiteJavaType();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m8499j(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        fieldDescriptorLite.getClass();
        Charset charset = Internal.f24003a;
        obj.getClass();
        boolean z2 = false;
        switch (r1.f24185a) {
            case INT:
                z2 = obj instanceof Integer;
                break;
            case LONG:
                z2 = obj instanceof Long;
                break;
            case FLOAT:
                z2 = obj instanceof Float;
                break;
            case DOUBLE:
                z2 = obj instanceof Double;
                break;
            case BOOLEAN:
                z2 = obj instanceof Boolean;
                break;
            case STRING:
                z2 = obj instanceof String;
                break;
            case BYTE_STRING:
                if ((obj instanceof ByteString) || (obj instanceof byte[])) {
                    z2 = true;
                }
                break;
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof Internal.EnumLite)) {
                }
                break;
            case MESSAGE:
                if ((obj instanceof MessageLite) || (obj instanceof LazyField)) {
                }
                break;
        }
        if (!z2) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof LazyField) {
            this.f23964c = true;
        }
        this.f23962a.m8635k(fieldDescriptorLite, obj);
    }

    public FieldSet(int i) {
        int i2 = SmallSortedMap.f24107j;
        this.f23962a = new SmallSortedMap.C15851(0);
        m8497h();
        m8497h();
    }
}
