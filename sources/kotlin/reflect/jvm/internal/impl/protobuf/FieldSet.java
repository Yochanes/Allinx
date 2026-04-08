package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.SmallSortedMap;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class FieldSet<FieldDescriptorType extends FieldDescriptorLite<FieldDescriptorType>> {

    /* JADX INFO: renamed from: d */
    public static final FieldSet f54099d = new FieldSet(0);

    /* JADX INFO: renamed from: a */
    public final SmallSortedMap.C61601 f54100a;

    /* JADX INFO: renamed from: b */
    public boolean f54101b;

    /* JADX INFO: renamed from: c */
    public boolean f54102c;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.FieldSet$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C61551 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f54103a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f54104b;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f54104b = iArr;
            try {
                iArr[WireFormat.FieldType.f54170c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f54104b[WireFormat.FieldType.f54171d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f54104b[WireFormat.FieldType.f54172f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f54104b[WireFormat.FieldType.f54173g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f54104b[WireFormat.FieldType.f54174i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f54104b[WireFormat.FieldType.f54175j.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f54104b[WireFormat.FieldType.f54176n.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f54104b[WireFormat.FieldType.f54177o.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f54104b[WireFormat.FieldType.f54178p.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f54104b[WireFormat.FieldType.f54181s.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f54104b[WireFormat.FieldType.f54182t.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f54104b[WireFormat.FieldType.f54184v.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f54104b[WireFormat.FieldType.f54185w.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f54104b[WireFormat.FieldType.f54186x.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f54104b[WireFormat.FieldType.f54187y.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f54104b[WireFormat.FieldType.f54179q.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f54104b[WireFormat.FieldType.f54180r.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f54104b[WireFormat.FieldType.f54183u.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[WireFormat.JavaType.values().length];
            f54103a = iArr2;
            try {
                WireFormat.JavaType javaType = WireFormat.JavaType.INT;
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                int[] iArr3 = f54103a;
                WireFormat.JavaType javaType2 = WireFormat.JavaType.INT;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                int[] iArr4 = f54103a;
                WireFormat.JavaType javaType3 = WireFormat.JavaType.INT;
                iArr4[2] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                int[] iArr5 = f54103a;
                WireFormat.JavaType javaType4 = WireFormat.JavaType.INT;
                iArr5[3] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                int[] iArr6 = f54103a;
                WireFormat.JavaType javaType5 = WireFormat.JavaType.INT;
                iArr6[4] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                int[] iArr7 = f54103a;
                WireFormat.JavaType javaType6 = WireFormat.JavaType.INT;
                iArr7[5] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                int[] iArr8 = f54103a;
                WireFormat.JavaType javaType7 = WireFormat.JavaType.INT;
                iArr8[6] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                int[] iArr9 = f54103a;
                WireFormat.JavaType javaType8 = WireFormat.JavaType.INT;
                iArr9[7] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                int[] iArr10 = f54103a;
                WireFormat.JavaType javaType9 = WireFormat.JavaType.INT;
                iArr10[8] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface FieldDescriptorLite<T extends FieldDescriptorLite<T>> extends Comparable<T> {
        /* JADX INFO: renamed from: g */
        GeneratedMessageLite.Builder mo19694g(MessageLite.Builder builder, MessageLite messageLite);

        WireFormat.JavaType getLiteJavaType();

        WireFormat.FieldType getLiteType();

        int getNumber();

        boolean isPacked();

        boolean isRepeated();
    }

    public FieldSet() {
        this.f54102c = false;
        this.f54100a = new SmallSortedMap.C61601(16);
    }

    /* JADX INFO: renamed from: c */
    public static int m19683c(WireFormat.FieldType fieldType, Object obj) {
        int serializedSize;
        int iM19663f;
        switch (fieldType.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                return 8;
            case 1:
                ((Float) obj).getClass();
                return 4;
            case 2:
                return CodedOutputStream.m19664g(((Long) obj).longValue());
            case 3:
                return CodedOutputStream.m19664g(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.m19660c(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                return 8;
            case 6:
                ((Integer) obj).getClass();
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                return 1;
            case 8:
                try {
                    byte[] bytes = ((String) obj).getBytes("UTF-8");
                    return CodedOutputStream.m19663f(bytes.length) + bytes.length;
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException("UTF-8 not supported.", e);
                }
            case 9:
                return ((MessageLite) obj).getSerializedSize();
            case 10:
                if (!(obj instanceof LazyField)) {
                    return CodedOutputStream.m19662e((MessageLite) obj);
                }
                LazyField lazyField = (LazyField) obj;
                lazyField.getClass();
                serializedSize = lazyField.f54124a.getSerializedSize();
                iM19663f = CodedOutputStream.m19663f(serializedSize);
                break;
                break;
            case 11:
                if (!(obj instanceof ByteString)) {
                    byte[] bArr = (byte[]) obj;
                    return CodedOutputStream.m19663f(bArr.length) + bArr.length;
                }
                ByteString byteString = (ByteString) obj;
                serializedSize = CodedOutputStream.m19663f(byteString.size());
                iM19663f = byteString.size();
                break;
                break;
            case TYPE_BYTES_VALUE:
                return CodedOutputStream.m19663f(((Integer) obj).intValue());
            case 13:
                return obj instanceof Internal.EnumLite ? CodedOutputStream.m19660c(((Internal.EnumLite) obj).getNumber()) : CodedOutputStream.m19660c(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                return 4;
            case 15:
                ((Long) obj).getClass();
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return CodedOutputStream.m19663f((iIntValue >> 31) ^ (iIntValue << 1));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return CodedOutputStream.m19664g((jLongValue >> 63) ^ (jLongValue << 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iM19663f + serializedSize;
    }

    /* JADX INFO: renamed from: d */
    public static int m19684d(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        WireFormat.FieldType liteType = fieldDescriptorLite.getLiteType();
        int number = fieldDescriptorLite.getNumber();
        if (!fieldDescriptorLite.isRepeated()) {
            int iM19665h = CodedOutputStream.m19665h(number);
            if (liteType == WireFormat.FieldType.f54179q) {
                iM19665h *= 2;
            }
            return iM19665h + m19683c(liteType, obj);
        }
        int iM19683c = 0;
        if (fieldDescriptorLite.isPacked()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iM19683c += m19683c(liteType, it.next());
            }
            return CodedOutputStream.m19663f(iM19683c) + CodedOutputStream.m19665h(number) + iM19683c;
        }
        for (Object obj2 : (List) obj) {
            int iM19665h2 = CodedOutputStream.m19665h(number);
            if (liteType == WireFormat.FieldType.f54179q) {
                iM19665h2 *= 2;
            }
            iM19683c += iM19665h2 + m19683c(liteType, obj2);
        }
        return iM19683c;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m19685f(Map.Entry entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        if (fieldDescriptorLite.getLiteJavaType() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        if (fieldDescriptorLite.isRepeated()) {
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                if (!((MessageLite) it.next()).isInitialized()) {
                    return false;
                }
            }
            return true;
        }
        Object value = entry.getValue();
        if (value instanceof MessageLite) {
            return ((MessageLite) value).isInitialized();
        }
        if (value instanceof LazyField) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* JADX INFO: renamed from: h */
    public static Object m19686h(CodedInputStream codedInputStream, WireFormat.FieldType fieldType) {
        switch (fieldType.ordinal()) {
            case 0:
                return Double.valueOf(Double.longBitsToDouble(codedInputStream.m19648j()));
            case 1:
                return Float.valueOf(Float.intBitsToFloat(codedInputStream.m19647i()));
            case 2:
                return Long.valueOf(codedInputStream.m19650l());
            case 3:
                return Long.valueOf(codedInputStream.m19650l());
            case 4:
                return Integer.valueOf(codedInputStream.m19649k());
            case 5:
                return Long.valueOf(codedInputStream.m19648j());
            case 6:
                return Integer.valueOf(codedInputStream.m19647i());
            case 7:
                return Boolean.valueOf(codedInputStream.m19650l() != 0);
            case 8:
                int iM19649k = codedInputStream.m19649k();
                int i = codedInputStream.f54083b;
                int i2 = codedInputStream.f54085d;
                if (iM19649k > i - i2 || iM19649k <= 0) {
                    return iM19649k == 0 ? "" : new String(codedInputStream.m19646h(iM19649k), "UTF-8");
                }
                String str = new String(codedInputStream.f54082a, i2, iM19649k, "UTF-8");
                codedInputStream.f54085d += iM19649k;
                return str;
            case 9:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 10:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 11:
                return codedInputStream.m19643e();
            case TYPE_BYTES_VALUE:
                return Integer.valueOf(codedInputStream.m19649k());
            case 13:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            case 14:
                return Integer.valueOf(codedInputStream.m19647i());
            case 15:
                return Long.valueOf(codedInputStream.m19648j());
            case 16:
                int iM19649k2 = codedInputStream.m19649k();
                return Integer.valueOf((-(iM19649k2 & 1)) ^ (iM19649k2 >>> 1));
            case 17:
                long jM19650l = codedInputStream.m19650l();
                return Long.valueOf((-(jM19650l & 1)) ^ (jM19650l >>> 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m19687j(WireFormat.FieldType fieldType, Object obj) {
        obj.getClass();
        boolean z2 = true;
        boolean z3 = false;
        switch (fieldType.f54189a) {
            case INT:
                z3 = obj instanceof Integer;
                break;
            case LONG:
                z3 = obj instanceof Long;
                break;
            case FLOAT:
                z3 = obj instanceof Float;
                break;
            case DOUBLE:
                z3 = obj instanceof Double;
                break;
            case BOOLEAN:
                z3 = obj instanceof Boolean;
                break;
            case STRING:
                z3 = obj instanceof String;
                break;
            case BYTE_STRING:
                if (!(obj instanceof ByteString) && !(obj instanceof byte[])) {
                    z2 = false;
                }
                z3 = z2;
                break;
            case ENUM:
                if (!(obj instanceof Integer) && !(obj instanceof Internal.EnumLite)) {
                }
                z3 = z2;
                break;
            case MESSAGE:
                if (!(obj instanceof MessageLite) && !(obj instanceof LazyField)) {
                }
                z3 = z2;
                break;
        }
        if (!z3) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m19688k(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i, Object obj) throws IOException {
        if (fieldType == WireFormat.FieldType.f54179q) {
            codedOutputStream.m19681x(i, 3);
            ((MessageLite) obj).mo19416a(codedOutputStream);
            codedOutputStream.m19681x(i, 4);
        }
        codedOutputStream.m19681x(i, fieldType.f54190b);
        switch (fieldType.ordinal()) {
            case 0:
                double dDoubleValue = ((Double) obj).doubleValue();
                codedOutputStream.getClass();
                codedOutputStream.m19678u(Double.doubleToRawLongBits(dDoubleValue));
                break;
            case 1:
                float fFloatValue = ((Float) obj).floatValue();
                codedOutputStream.getClass();
                codedOutputStream.m19677t(Float.floatToRawIntBits(fFloatValue));
                break;
            case 2:
                codedOutputStream.m19680w(((Long) obj).longValue());
                break;
            case 3:
                codedOutputStream.m19680w(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.m19671n(((Integer) obj).intValue());
                break;
            case 5:
                codedOutputStream.m19678u(((Long) obj).longValue());
                break;
            case 6:
                codedOutputStream.m19677t(((Integer) obj).intValue());
                break;
            case 7:
                codedOutputStream.m19674q(((Boolean) obj).booleanValue() ? 1 : 0);
                break;
            case 8:
                codedOutputStream.getClass();
                byte[] bytes = ((String) obj).getBytes("UTF-8");
                codedOutputStream.m19679v(bytes.length);
                codedOutputStream.m19676s(bytes);
                break;
            case 9:
                codedOutputStream.getClass();
                ((MessageLite) obj).mo19416a(codedOutputStream);
                break;
            case 10:
                codedOutputStream.m19673p((MessageLite) obj);
                break;
            case 11:
                if (!(obj instanceof ByteString)) {
                    byte[] bArr = (byte[]) obj;
                    codedOutputStream.getClass();
                    codedOutputStream.m19679v(bArr.length);
                    codedOutputStream.m19676s(bArr);
                } else {
                    ByteString byteString = (ByteString) obj;
                    codedOutputStream.getClass();
                    codedOutputStream.m19679v(byteString.size());
                    codedOutputStream.m19675r(byteString);
                }
                break;
            case TYPE_BYTES_VALUE:
                codedOutputStream.m19679v(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof Internal.EnumLite)) {
                    codedOutputStream.m19671n(((Integer) obj).intValue());
                } else {
                    codedOutputStream.m19671n(((Internal.EnumLite) obj).getNumber());
                }
                break;
            case 14:
                codedOutputStream.m19677t(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.m19678u(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                codedOutputStream.m19679v((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                codedOutputStream.m19680w((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m19689a(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        List arrayList;
        if (!((GeneratedMessageLite.ExtensionDescriptor) fieldDescriptorLite).f54114c) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        m19687j(((GeneratedMessageLite.ExtensionDescriptor) fieldDescriptorLite).f54113b, obj);
        Object objM19691e = m19691e(fieldDescriptorLite);
        if (objM19691e == null) {
            arrayList = new ArrayList();
            this.f54100a.m19723j(fieldDescriptorLite, arrayList);
        } else {
            arrayList = (List) objM19691e;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b */
    public final FieldSet m19690b() {
        SmallSortedMap.C61601 c61601;
        FieldSet fieldSet = new FieldSet();
        int i = 0;
        while (true) {
            c61601 = this.f54100a;
            if (i >= c61601.f54153b.size()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c61601.f54153b.get(i);
            fieldSet.m19693i((FieldDescriptorLite) entry.getKey(), entry.getValue());
            i++;
        }
        for (Map.Entry entry2 : c61601.m19720f()) {
            fieldSet.m19693i((FieldDescriptorLite) entry2.getKey(), entry2.getValue());
        }
        fieldSet.f54102c = this.f54102c;
        return fieldSet;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return m19690b();
    }

    /* JADX INFO: renamed from: e */
    public final Object m19691e(FieldDescriptorLite fieldDescriptorLite) {
        Object obj = this.f54100a.get(fieldDescriptorLite);
        return obj instanceof LazyField ? ((LazyField) obj).m19711a() : obj;
    }

    /* JADX INFO: renamed from: g */
    public final void m19692g(Map.Entry entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof LazyField) {
            value = ((LazyField) value).m19711a();
        }
        boolean zIsRepeated = fieldDescriptorLite.isRepeated();
        SmallSortedMap.C61601 c61601 = this.f54100a;
        if (zIsRepeated) {
            Object objM19691e = m19691e(fieldDescriptorLite);
            if (objM19691e == null) {
                objM19691e = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) objM19691e;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            c61601.m19723j(fieldDescriptorLite, objM19691e);
            return;
        }
        if (fieldDescriptorLite.getLiteJavaType() != WireFormat.JavaType.MESSAGE) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            c61601.m19723j(fieldDescriptorLite, value);
            return;
        }
        Object objM19691e2 = m19691e(fieldDescriptorLite);
        if (objM19691e2 != null) {
            c61601.m19723j(fieldDescriptorLite, fieldDescriptorLite.mo19694g(((MessageLite) objM19691e2).toBuilder(), (MessageLite) value).build());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        c61601.m19723j(fieldDescriptorLite, value);
    }

    /* JADX INFO: renamed from: i */
    public final void m19693i(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        if (!fieldDescriptorLite.isRepeated()) {
            m19687j(fieldDescriptorLite.getLiteType(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m19687j(fieldDescriptorLite.getLiteType(), it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof LazyField) {
            this.f54102c = true;
        }
        this.f54100a.m19723j(fieldDescriptorLite, obj);
    }

    public FieldSet(int i) {
        this.f54102c = false;
        SmallSortedMap.C61601 c61601 = new SmallSortedMap.C61601(0);
        this.f54100a = c61601;
        if (this.f54101b) {
            return;
        }
        c61601.mo19722h();
        this.f54101b = true;
    }
}
