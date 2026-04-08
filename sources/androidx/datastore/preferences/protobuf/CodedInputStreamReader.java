package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.MapEntryLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class CodedInputStreamReader implements Reader {

    /* JADX INFO: renamed from: a */
    public final CodedInputStream f23896a;

    /* JADX INFO: renamed from: b */
    public int f23897b;

    /* JADX INFO: renamed from: c */
    public int f23898c;

    /* JADX INFO: renamed from: d */
    public int f23899d = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.CodedInputStreamReader$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C15511 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f23900a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f23900a = iArr;
            try {
                iArr[WireFormat.FieldType.f24173o.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23900a[WireFormat.FieldType.f24177s.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23900a[WireFormat.FieldType.f24166c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23900a[WireFormat.FieldType.f24179u.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23900a[WireFormat.FieldType.f24172n.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23900a[WireFormat.FieldType.f24171j.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23900a[WireFormat.FieldType.f24167d.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f23900a[WireFormat.FieldType.f24170i.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f23900a[WireFormat.FieldType.f24168f.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f23900a[WireFormat.FieldType.f24176r.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f23900a[WireFormat.FieldType.f24180v.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f23900a[WireFormat.FieldType.f24181w.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f23900a[WireFormat.FieldType.f24182x.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f23900a[WireFormat.FieldType.f24183y.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f23900a[WireFormat.FieldType.f24174p.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f23900a[WireFormat.FieldType.f24178t.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f23900a[WireFormat.FieldType.f24169g.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public CodedInputStreamReader(CodedInputStream codedInputStream) {
        Internal.m8515a(codedInputStream, MetricTracker.Object.INPUT);
        this.f23896a = codedInputStream;
        codedInputStream.f23870b = this;
    }

    /* JADX INFO: renamed from: l */
    public static void m8426l(int i) throws InvalidProtocolBufferException {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.m8523f();
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m8427m(int i) throws InvalidProtocolBufferException {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.m8523f();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    /* JADX INFO: renamed from: a */
    public final Object mo8305a(Schema schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
        m8433k(2);
        return m8430h(schema, extensionRegistryLite);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        r10.put(r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        r1.mo8371g(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        return;
     */
    @Override // androidx.datastore.preferences.protobuf.Reader
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo8306b(Map map, MapEntryLite.Metadata metadata, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
        m8433k(2);
        CodedInputStream codedInputStream = this.f23896a;
        int iMo8372h = codedInputStream.mo8372h(codedInputStream.mo8389y());
        metadata.getClass();
        Object objM8428f = "";
        GeneratedMessageLite generatedMessageLite = metadata.f24037c;
        Object objM8428f2 = generatedMessageLite;
        while (true) {
            try {
                int fieldNumber = getFieldNumber();
                if (fieldNumber == Integer.MAX_VALUE || codedInputStream.mo8370e()) {
                    break;
                }
                if (fieldNumber == 1) {
                    objM8428f = m8428f(metadata.f24035a, null, null);
                } else if (fieldNumber != 2) {
                    try {
                        if (!skipField()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        if (!skipField()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    }
                } else {
                    objM8428f2 = m8428f(metadata.f24036b, generatedMessageLite.getClass(), extensionRegistryLite);
                }
            } catch (Throwable th) {
                codedInputStream.mo8371g(iMo8372h);
                throw th;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    /* JADX INFO: renamed from: c */
    public final void mo8307c(List list, Schema schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iMo8388x;
        int i = this.f23897b;
        if ((i & 7) != 3) {
            throw InvalidProtocolBufferException.m8520c();
        }
        do {
            list.add(m8429g(schema, extensionRegistryLite));
            CodedInputStream codedInputStream = this.f23896a;
            if (codedInputStream.mo8370e() || this.f23899d != 0) {
                return;
            } else {
                iMo8388x = codedInputStream.mo8388x();
            }
        } while (iMo8388x == i);
        this.f23899d = iMo8388x;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    /* JADX INFO: renamed from: d */
    public final void mo8308d(List list, Schema schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iMo8388x;
        int i = this.f23897b;
        if ((i & 7) != 2) {
            throw InvalidProtocolBufferException.m8520c();
        }
        do {
            list.add(m8430h(schema, extensionRegistryLite));
            CodedInputStream codedInputStream = this.f23896a;
            if (codedInputStream.mo8370e() || this.f23899d != 0) {
                return;
            } else {
                iMo8388x = codedInputStream.mo8388x();
            }
        } while (iMo8388x == i);
        this.f23899d = iMo8388x;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    /* JADX INFO: renamed from: e */
    public final Object mo8309e(Schema schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
        m8433k(3);
        return m8429g(schema, extensionRegistryLite);
    }

    /* JADX INFO: renamed from: f */
    public final Object m8428f(WireFormat.FieldType fieldType, Class cls, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
        switch (fieldType.ordinal()) {
            case 0:
                return Double.valueOf(readDouble());
            case 1:
                return Float.valueOf(readFloat());
            case 2:
                return Long.valueOf(readInt64());
            case 3:
                return Long.valueOf(readUInt64());
            case 4:
                return Integer.valueOf(readInt32());
            case 5:
                return Long.valueOf(readFixed64());
            case 6:
                return Integer.valueOf(readFixed32());
            case 7:
                return Boolean.valueOf(readBool());
            case 8:
                return readStringRequireUtf8();
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                m8433k(2);
                return m8430h(Protobuf.f24078c.m8582a(cls), extensionRegistryLite);
            case 11:
                return readBytes();
            case TYPE_BYTES_VALUE:
                return Integer.valueOf(readUInt32());
            case 13:
                return Integer.valueOf(readEnum());
            case 14:
                return Integer.valueOf(readSFixed32());
            case 15:
                return Long.valueOf(readSFixed64());
            case 16:
                return Integer.valueOf(readSInt32());
            case 17:
                return Long.valueOf(readSInt64());
        }
    }

    /* JADX INFO: renamed from: g */
    public final Object m8429g(Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        int i = this.f23898c;
        this.f23898c = ((this.f23897b >>> 3) << 3) | 4;
        try {
            Object objNewInstance = schema.newInstance();
            schema.mo8560a(objNewInstance, this, extensionRegistryLite);
            schema.makeImmutable(objNewInstance);
            if (this.f23897b == this.f23898c) {
                return objNewInstance;
            }
            throw InvalidProtocolBufferException.m8523f();
        } finally {
            this.f23898c = i;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final int getFieldNumber() {
        int i = this.f23899d;
        if (i != 0) {
            this.f23897b = i;
            this.f23899d = 0;
        } else {
            this.f23897b = this.f23896a.mo8388x();
        }
        int i2 = this.f23897b;
        if (i2 == 0 || i2 == this.f23898c) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final int getTag() {
        return this.f23897b;
    }

    /* JADX INFO: renamed from: h */
    public final Object m8430h(Schema schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        CodedInputStream codedInputStream = this.f23896a;
        int iMo8389y = codedInputStream.mo8389y();
        if (codedInputStream.f23869a >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iMo8372h = codedInputStream.mo8372h(iMo8389y);
        Object objNewInstance = schema.newInstance();
        codedInputStream.f23869a++;
        schema.mo8560a(objNewInstance, this, extensionRegistryLite);
        schema.makeImmutable(objNewInstance);
        codedInputStream.mo8368a(0);
        codedInputStream.f23869a--;
        codedInputStream.mo8371g(iMo8372h);
        return objNewInstance;
    }

    /* JADX INFO: renamed from: i */
    public final void m8431i(List list, boolean z2) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iMo8388x;
        int iMo8388x2;
        if ((this.f23897b & 7) != 2) {
            throw InvalidProtocolBufferException.m8520c();
        }
        boolean z3 = list instanceof LazyStringList;
        CodedInputStream codedInputStream = this.f23896a;
        if (!z3 || z2) {
            do {
                list.add(z2 ? readStringRequireUtf8() : readString());
                if (codedInputStream.mo8370e()) {
                    return;
                } else {
                    iMo8388x = codedInputStream.mo8388x();
                }
            } while (iMo8388x == this.f23897b);
            this.f23899d = iMo8388x;
            return;
        }
        LazyStringList lazyStringList = (LazyStringList) list;
        do {
            lazyStringList.mo8527u(readBytes());
            if (codedInputStream.mo8370e()) {
                return;
            } else {
                iMo8388x2 = codedInputStream.mo8388x();
            }
        } while (iMo8388x2 == this.f23897b);
        this.f23899d = iMo8388x2;
    }

    /* JADX INFO: renamed from: j */
    public final void m8432j(int i) throws InvalidProtocolBufferException {
        if (this.f23896a.mo8369d() != i) {
            throw InvalidProtocolBufferException.m8524g();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m8433k(int i) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((this.f23897b & 7) != i) {
            throw InvalidProtocolBufferException.m8520c();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final boolean readBool() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m8433k(0);
        return this.f23896a.mo8373i();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void readBoolList(List list) throws InvalidProtocolBufferException {
        int iMo8388x;
        int iMo8388x2;
        boolean z2 = list instanceof BooleanArrayList;
        CodedInputStream codedInputStream = this.f23896a;
        if (!z2) {
            int i = this.f23897b & 7;
            if (i == 0) {
                do {
                    list.add(Boolean.valueOf(codedInputStream.mo8373i()));
                    if (codedInputStream.mo8370e()) {
                        return;
                    } else {
                        iMo8388x = codedInputStream.mo8388x();
                    }
                } while (iMo8388x == this.f23897b);
                this.f23899d = iMo8388x;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.m8520c();
            }
            int iMo8369d = codedInputStream.mo8369d() + codedInputStream.mo8389y();
            do {
                list.add(Boolean.valueOf(codedInputStream.mo8373i()));
            } while (codedInputStream.mo8369d() < iMo8369d);
            m8432j(iMo8369d);
            return;
        }
        BooleanArrayList booleanArrayList = (BooleanArrayList) list;
        int i2 = this.f23897b & 7;
        if (i2 == 0) {
            do {
                booleanArrayList.addBoolean(codedInputStream.mo8373i());
                if (codedInputStream.mo8370e()) {
                    return;
                } else {
                    iMo8388x2 = codedInputStream.mo8388x();
                }
            } while (iMo8388x2 == this.f23897b);
            this.f23899d = iMo8388x2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.m8520c();
        }
        int iMo8369d2 = codedInputStream.mo8369d() + codedInputStream.mo8389y();
        do {
            booleanArrayList.addBoolean(codedInputStream.mo8373i());
        } while (codedInputStream.mo8369d() < iMo8369d2);
        m8432j(iMo8369d2);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final ByteString readBytes() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m8433k(2);
        return this.f23896a.mo8374j();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void readBytesList(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iMo8388x;
        if ((this.f23897b & 7) != 2) {
            throw InvalidProtocolBufferException.m8520c();
        }
        do {
            list.add(readBytes());
            CodedInputStream codedInputStream = this.f23896a;
            if (codedInputStream.mo8370e()) {
                return;
            } else {
                iMo8388x = codedInputStream.mo8388x();
            }
        } while (iMo8388x == this.f23897b);
        this.f23899d = iMo8388x;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final double readDouble() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m8433k(1);
        return this.f23896a.mo8375k();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void readDoubleList(List list) throws InvalidProtocolBufferException {
        int iMo8388x;
        int iMo8388x2;
        boolean z2 = list instanceof DoubleArrayList;
        CodedInputStream codedInputStream = this.f23896a;
        if (!z2) {
            int i = this.f23897b & 7;
            if (i == 1) {
                do {
                    list.add(Double.valueOf(codedInputStream.mo8375k()));
                    if (codedInputStream.mo8370e()) {
                        return;
                    } else {
                        iMo8388x = codedInputStream.mo8388x();
                    }
                } while (iMo8388x == this.f23897b);
                this.f23899d = iMo8388x;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.m8520c();
            }
            int iMo8389y = codedInputStream.mo8389y();
            m8427m(iMo8389y);
            int iMo8369d = codedInputStream.mo8369d() + iMo8389y;
            do {
                list.add(Double.valueOf(codedInputStream.mo8375k()));
            } while (codedInputStream.mo8369d() < iMo8369d);
            return;
        }
        DoubleArrayList doubleArrayList = (DoubleArrayList) list;
        int i2 = this.f23897b & 7;
        if (i2 == 1) {
            do {
                doubleArrayList.addDouble(codedInputStream.mo8375k());
                if (codedInputStream.mo8370e()) {
                    return;
                } else {
                    iMo8388x2 = codedInputStream.mo8388x();
                }
            } while (iMo8388x2 == this.f23897b);
            this.f23899d = iMo8388x2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.m8520c();
        }
        int iMo8389y2 = codedInputStream.mo8389y();
        m8427m(iMo8389y2);
        int iMo8369d2 = codedInputStream.mo8369d() + iMo8389y2;
        do {
            doubleArrayList.addDouble(codedInputStream.mo8375k());
        } while (codedInputStream.mo8369d() < iMo8369d2);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final int readEnum() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m8433k(0);
        return this.f23896a.mo8376l();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void readEnumList(List list) throws InvalidProtocolBufferException {
        int iMo8388x;
        int iMo8388x2;
        boolean z2 = list instanceof IntArrayList;
        CodedInputStream codedInputStream = this.f23896a;
        if (!z2) {
            int i = this.f23897b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(codedInputStream.mo8376l()));
                    if (codedInputStream.mo8370e()) {
                        return;
                    } else {
                        iMo8388x = codedInputStream.mo8388x();
                    }
                } while (iMo8388x == this.f23897b);
                this.f23899d = iMo8388x;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.m8520c();
            }
            int iMo8369d = codedInputStream.mo8369d() + codedInputStream.mo8389y();
            do {
                list.add(Integer.valueOf(codedInputStream.mo8376l()));
            } while (codedInputStream.mo8369d() < iMo8369d);
            m8432j(iMo8369d);
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int i2 = this.f23897b & 7;
        if (i2 == 0) {
            do {
                intArrayList.addInt(codedInputStream.mo8376l());
                if (codedInputStream.mo8370e()) {
                    return;
                } else {
                    iMo8388x2 = codedInputStream.mo8388x();
                }
            } while (iMo8388x2 == this.f23897b);
            this.f23899d = iMo8388x2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.m8520c();
        }
        int iMo8369d2 = codedInputStream.mo8369d() + codedInputStream.mo8389y();
        do {
            intArrayList.addInt(codedInputStream.mo8376l());
        } while (codedInputStream.mo8369d() < iMo8369d2);
        m8432j(iMo8369d2);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final int readFixed32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m8433k(5);
        return this.f23896a.mo8377m();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void readFixed32List(List list) throws InvalidProtocolBufferException {
        int iMo8388x;
        int iMo8388x2;
        boolean z2 = list instanceof IntArrayList;
        CodedInputStream codedInputStream = this.f23896a;
        if (!z2) {
            int i = this.f23897b & 7;
            if (i == 2) {
                int iMo8389y = codedInputStream.mo8389y();
                m8426l(iMo8389y);
                int iMo8369d = codedInputStream.mo8369d() + iMo8389y;
                do {
                    list.add(Integer.valueOf(codedInputStream.mo8377m()));
                } while (codedInputStream.mo8369d() < iMo8369d);
                return;
            }
            if (i != 5) {
                throw InvalidProtocolBufferException.m8520c();
            }
            do {
                list.add(Integer.valueOf(codedInputStream.mo8377m()));
                if (codedInputStream.mo8370e()) {
                    return;
                } else {
                    iMo8388x = codedInputStream.mo8388x();
                }
            } while (iMo8388x == this.f23897b);
            this.f23899d = iMo8388x;
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int i2 = this.f23897b & 7;
        if (i2 == 2) {
            int iMo8389y2 = codedInputStream.mo8389y();
            m8426l(iMo8389y2);
            int iMo8369d2 = codedInputStream.mo8369d() + iMo8389y2;
            do {
                intArrayList.addInt(codedInputStream.mo8377m());
            } while (codedInputStream.mo8369d() < iMo8369d2);
            return;
        }
        if (i2 != 5) {
            throw InvalidProtocolBufferException.m8520c();
        }
        do {
            intArrayList.addInt(codedInputStream.mo8377m());
            if (codedInputStream.mo8370e()) {
                return;
            } else {
                iMo8388x2 = codedInputStream.mo8388x();
            }
        } while (iMo8388x2 == this.f23897b);
        this.f23899d = iMo8388x2;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final long readFixed64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m8433k(1);
        return this.f23896a.mo8378n();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void readFixed64List(List list) throws InvalidProtocolBufferException {
        int iMo8388x;
        int iMo8388x2;
        boolean z2 = list instanceof LongArrayList;
        CodedInputStream codedInputStream = this.f23896a;
        if (!z2) {
            int i = this.f23897b & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(codedInputStream.mo8378n()));
                    if (codedInputStream.mo8370e()) {
                        return;
                    } else {
                        iMo8388x = codedInputStream.mo8388x();
                    }
                } while (iMo8388x == this.f23897b);
                this.f23899d = iMo8388x;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.m8520c();
            }
            int iMo8389y = codedInputStream.mo8389y();
            m8427m(iMo8389y);
            int iMo8369d = codedInputStream.mo8369d() + iMo8389y;
            do {
                list.add(Long.valueOf(codedInputStream.mo8378n()));
            } while (codedInputStream.mo8369d() < iMo8369d);
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int i2 = this.f23897b & 7;
        if (i2 == 1) {
            do {
                longArrayList.addLong(codedInputStream.mo8378n());
                if (codedInputStream.mo8370e()) {
                    return;
                } else {
                    iMo8388x2 = codedInputStream.mo8388x();
                }
            } while (iMo8388x2 == this.f23897b);
            this.f23899d = iMo8388x2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.m8520c();
        }
        int iMo8389y2 = codedInputStream.mo8389y();
        m8427m(iMo8389y2);
        int iMo8369d2 = codedInputStream.mo8369d() + iMo8389y2;
        do {
            longArrayList.addLong(codedInputStream.mo8378n());
        } while (codedInputStream.mo8369d() < iMo8369d2);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final float readFloat() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m8433k(5);
        return this.f23896a.mo8379o();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void readFloatList(List list) throws InvalidProtocolBufferException {
        int iMo8388x;
        int iMo8388x2;
        boolean z2 = list instanceof FloatArrayList;
        CodedInputStream codedInputStream = this.f23896a;
        if (!z2) {
            int i = this.f23897b & 7;
            if (i == 2) {
                int iMo8389y = codedInputStream.mo8389y();
                m8426l(iMo8389y);
                int iMo8369d = codedInputStream.mo8369d() + iMo8389y;
                do {
                    list.add(Float.valueOf(codedInputStream.mo8379o()));
                } while (codedInputStream.mo8369d() < iMo8369d);
                return;
            }
            if (i != 5) {
                throw InvalidProtocolBufferException.m8520c();
            }
            do {
                list.add(Float.valueOf(codedInputStream.mo8379o()));
                if (codedInputStream.mo8370e()) {
                    return;
                } else {
                    iMo8388x = codedInputStream.mo8388x();
                }
            } while (iMo8388x == this.f23897b);
            this.f23899d = iMo8388x;
            return;
        }
        FloatArrayList floatArrayList = (FloatArrayList) list;
        int i2 = this.f23897b & 7;
        if (i2 == 2) {
            int iMo8389y2 = codedInputStream.mo8389y();
            m8426l(iMo8389y2);
            int iMo8369d2 = codedInputStream.mo8369d() + iMo8389y2;
            do {
                floatArrayList.addFloat(codedInputStream.mo8379o());
            } while (codedInputStream.mo8369d() < iMo8369d2);
            return;
        }
        if (i2 != 5) {
            throw InvalidProtocolBufferException.m8520c();
        }
        do {
            floatArrayList.addFloat(codedInputStream.mo8379o());
            if (codedInputStream.mo8370e()) {
                return;
            } else {
                iMo8388x2 = codedInputStream.mo8388x();
            }
        } while (iMo8388x2 == this.f23897b);
        this.f23899d = iMo8388x2;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final int readInt32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m8433k(0);
        return this.f23896a.mo8380p();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void readInt32List(List list) throws InvalidProtocolBufferException {
        int iMo8388x;
        int iMo8388x2;
        boolean z2 = list instanceof IntArrayList;
        CodedInputStream codedInputStream = this.f23896a;
        if (!z2) {
            int i = this.f23897b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(codedInputStream.mo8380p()));
                    if (codedInputStream.mo8370e()) {
                        return;
                    } else {
                        iMo8388x = codedInputStream.mo8388x();
                    }
                } while (iMo8388x == this.f23897b);
                this.f23899d = iMo8388x;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.m8520c();
            }
            int iMo8369d = codedInputStream.mo8369d() + codedInputStream.mo8389y();
            do {
                list.add(Integer.valueOf(codedInputStream.mo8380p()));
            } while (codedInputStream.mo8369d() < iMo8369d);
            m8432j(iMo8369d);
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int i2 = this.f23897b & 7;
        if (i2 == 0) {
            do {
                intArrayList.addInt(codedInputStream.mo8380p());
                if (codedInputStream.mo8370e()) {
                    return;
                } else {
                    iMo8388x2 = codedInputStream.mo8388x();
                }
            } while (iMo8388x2 == this.f23897b);
            this.f23899d = iMo8388x2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.m8520c();
        }
        int iMo8369d2 = codedInputStream.mo8369d() + codedInputStream.mo8389y();
        do {
            intArrayList.addInt(codedInputStream.mo8380p());
        } while (codedInputStream.mo8369d() < iMo8369d2);
        m8432j(iMo8369d2);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final long readInt64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m8433k(0);
        return this.f23896a.mo8381q();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void readInt64List(List list) throws InvalidProtocolBufferException {
        int iMo8388x;
        int iMo8388x2;
        boolean z2 = list instanceof LongArrayList;
        CodedInputStream codedInputStream = this.f23896a;
        if (!z2) {
            int i = this.f23897b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(codedInputStream.mo8381q()));
                    if (codedInputStream.mo8370e()) {
                        return;
                    } else {
                        iMo8388x = codedInputStream.mo8388x();
                    }
                } while (iMo8388x == this.f23897b);
                this.f23899d = iMo8388x;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.m8520c();
            }
            int iMo8369d = codedInputStream.mo8369d() + codedInputStream.mo8389y();
            do {
                list.add(Long.valueOf(codedInputStream.mo8381q()));
            } while (codedInputStream.mo8369d() < iMo8369d);
            m8432j(iMo8369d);
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int i2 = this.f23897b & 7;
        if (i2 == 0) {
            do {
                longArrayList.addLong(codedInputStream.mo8381q());
                if (codedInputStream.mo8370e()) {
                    return;
                } else {
                    iMo8388x2 = codedInputStream.mo8388x();
                }
            } while (iMo8388x2 == this.f23897b);
            this.f23899d = iMo8388x2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.m8520c();
        }
        int iMo8369d2 = codedInputStream.mo8369d() + codedInputStream.mo8389y();
        do {
            longArrayList.addLong(codedInputStream.mo8381q());
        } while (codedInputStream.mo8369d() < iMo8369d2);
        m8432j(iMo8369d2);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final int readSFixed32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m8433k(5);
        return this.f23896a.mo8382r();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void readSFixed32List(List list) throws InvalidProtocolBufferException {
        int iMo8388x;
        int iMo8388x2;
        boolean z2 = list instanceof IntArrayList;
        CodedInputStream codedInputStream = this.f23896a;
        if (!z2) {
            int i = this.f23897b & 7;
            if (i == 2) {
                int iMo8389y = codedInputStream.mo8389y();
                m8426l(iMo8389y);
                int iMo8369d = codedInputStream.mo8369d() + iMo8389y;
                do {
                    list.add(Integer.valueOf(codedInputStream.mo8382r()));
                } while (codedInputStream.mo8369d() < iMo8369d);
                return;
            }
            if (i != 5) {
                throw InvalidProtocolBufferException.m8520c();
            }
            do {
                list.add(Integer.valueOf(codedInputStream.mo8382r()));
                if (codedInputStream.mo8370e()) {
                    return;
                } else {
                    iMo8388x = codedInputStream.mo8388x();
                }
            } while (iMo8388x == this.f23897b);
            this.f23899d = iMo8388x;
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int i2 = this.f23897b & 7;
        if (i2 == 2) {
            int iMo8389y2 = codedInputStream.mo8389y();
            m8426l(iMo8389y2);
            int iMo8369d2 = codedInputStream.mo8369d() + iMo8389y2;
            do {
                intArrayList.addInt(codedInputStream.mo8382r());
            } while (codedInputStream.mo8369d() < iMo8369d2);
            return;
        }
        if (i2 != 5) {
            throw InvalidProtocolBufferException.m8520c();
        }
        do {
            intArrayList.addInt(codedInputStream.mo8382r());
            if (codedInputStream.mo8370e()) {
                return;
            } else {
                iMo8388x2 = codedInputStream.mo8388x();
            }
        } while (iMo8388x2 == this.f23897b);
        this.f23899d = iMo8388x2;
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final long readSFixed64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m8433k(1);
        return this.f23896a.mo8383s();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void readSFixed64List(List list) throws InvalidProtocolBufferException {
        int iMo8388x;
        int iMo8388x2;
        boolean z2 = list instanceof LongArrayList;
        CodedInputStream codedInputStream = this.f23896a;
        if (!z2) {
            int i = this.f23897b & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(codedInputStream.mo8383s()));
                    if (codedInputStream.mo8370e()) {
                        return;
                    } else {
                        iMo8388x = codedInputStream.mo8388x();
                    }
                } while (iMo8388x == this.f23897b);
                this.f23899d = iMo8388x;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.m8520c();
            }
            int iMo8389y = codedInputStream.mo8389y();
            m8427m(iMo8389y);
            int iMo8369d = codedInputStream.mo8369d() + iMo8389y;
            do {
                list.add(Long.valueOf(codedInputStream.mo8383s()));
            } while (codedInputStream.mo8369d() < iMo8369d);
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int i2 = this.f23897b & 7;
        if (i2 == 1) {
            do {
                longArrayList.addLong(codedInputStream.mo8383s());
                if (codedInputStream.mo8370e()) {
                    return;
                } else {
                    iMo8388x2 = codedInputStream.mo8388x();
                }
            } while (iMo8388x2 == this.f23897b);
            this.f23899d = iMo8388x2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.m8520c();
        }
        int iMo8389y2 = codedInputStream.mo8389y();
        m8427m(iMo8389y2);
        int iMo8369d2 = codedInputStream.mo8369d() + iMo8389y2;
        do {
            longArrayList.addLong(codedInputStream.mo8383s());
        } while (codedInputStream.mo8369d() < iMo8369d2);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final int readSInt32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m8433k(0);
        return this.f23896a.mo8384t();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void readSInt32List(List list) throws InvalidProtocolBufferException {
        int iMo8388x;
        int iMo8388x2;
        boolean z2 = list instanceof IntArrayList;
        CodedInputStream codedInputStream = this.f23896a;
        if (!z2) {
            int i = this.f23897b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(codedInputStream.mo8384t()));
                    if (codedInputStream.mo8370e()) {
                        return;
                    } else {
                        iMo8388x = codedInputStream.mo8388x();
                    }
                } while (iMo8388x == this.f23897b);
                this.f23899d = iMo8388x;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.m8520c();
            }
            int iMo8369d = codedInputStream.mo8369d() + codedInputStream.mo8389y();
            do {
                list.add(Integer.valueOf(codedInputStream.mo8384t()));
            } while (codedInputStream.mo8369d() < iMo8369d);
            m8432j(iMo8369d);
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int i2 = this.f23897b & 7;
        if (i2 == 0) {
            do {
                intArrayList.addInt(codedInputStream.mo8384t());
                if (codedInputStream.mo8370e()) {
                    return;
                } else {
                    iMo8388x2 = codedInputStream.mo8388x();
                }
            } while (iMo8388x2 == this.f23897b);
            this.f23899d = iMo8388x2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.m8520c();
        }
        int iMo8369d2 = codedInputStream.mo8369d() + codedInputStream.mo8389y();
        do {
            intArrayList.addInt(codedInputStream.mo8384t());
        } while (codedInputStream.mo8369d() < iMo8369d2);
        m8432j(iMo8369d2);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final long readSInt64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m8433k(0);
        return this.f23896a.mo8385u();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void readSInt64List(List list) throws InvalidProtocolBufferException {
        int iMo8388x;
        int iMo8388x2;
        boolean z2 = list instanceof LongArrayList;
        CodedInputStream codedInputStream = this.f23896a;
        if (!z2) {
            int i = this.f23897b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(codedInputStream.mo8385u()));
                    if (codedInputStream.mo8370e()) {
                        return;
                    } else {
                        iMo8388x = codedInputStream.mo8388x();
                    }
                } while (iMo8388x == this.f23897b);
                this.f23899d = iMo8388x;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.m8520c();
            }
            int iMo8369d = codedInputStream.mo8369d() + codedInputStream.mo8389y();
            do {
                list.add(Long.valueOf(codedInputStream.mo8385u()));
            } while (codedInputStream.mo8369d() < iMo8369d);
            m8432j(iMo8369d);
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int i2 = this.f23897b & 7;
        if (i2 == 0) {
            do {
                longArrayList.addLong(codedInputStream.mo8385u());
                if (codedInputStream.mo8370e()) {
                    return;
                } else {
                    iMo8388x2 = codedInputStream.mo8388x();
                }
            } while (iMo8388x2 == this.f23897b);
            this.f23899d = iMo8388x2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.m8520c();
        }
        int iMo8369d2 = codedInputStream.mo8369d() + codedInputStream.mo8389y();
        do {
            longArrayList.addLong(codedInputStream.mo8385u());
        } while (codedInputStream.mo8369d() < iMo8369d2);
        m8432j(iMo8369d2);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final String readString() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m8433k(2);
        return this.f23896a.mo8386v();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void readStringList(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        m8431i(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void readStringListRequireUtf8(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        m8431i(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final String readStringRequireUtf8() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m8433k(2);
        return this.f23896a.mo8387w();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final int readUInt32() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m8433k(0);
        return this.f23896a.mo8389y();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void readUInt32List(List list) throws InvalidProtocolBufferException {
        int iMo8388x;
        int iMo8388x2;
        boolean z2 = list instanceof IntArrayList;
        CodedInputStream codedInputStream = this.f23896a;
        if (!z2) {
            int i = this.f23897b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(codedInputStream.mo8389y()));
                    if (codedInputStream.mo8370e()) {
                        return;
                    } else {
                        iMo8388x = codedInputStream.mo8388x();
                    }
                } while (iMo8388x == this.f23897b);
                this.f23899d = iMo8388x;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.m8520c();
            }
            int iMo8369d = codedInputStream.mo8369d() + codedInputStream.mo8389y();
            do {
                list.add(Integer.valueOf(codedInputStream.mo8389y()));
            } while (codedInputStream.mo8369d() < iMo8369d);
            m8432j(iMo8369d);
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int i2 = this.f23897b & 7;
        if (i2 == 0) {
            do {
                intArrayList.addInt(codedInputStream.mo8389y());
                if (codedInputStream.mo8370e()) {
                    return;
                } else {
                    iMo8388x2 = codedInputStream.mo8388x();
                }
            } while (iMo8388x2 == this.f23897b);
            this.f23899d = iMo8388x2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.m8520c();
        }
        int iMo8369d2 = codedInputStream.mo8369d() + codedInputStream.mo8389y();
        do {
            intArrayList.addInt(codedInputStream.mo8389y());
        } while (codedInputStream.mo8369d() < iMo8369d2);
        m8432j(iMo8369d2);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final long readUInt64() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m8433k(0);
        return this.f23896a.mo8390z();
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final void readUInt64List(List list) throws InvalidProtocolBufferException {
        int iMo8388x;
        int iMo8388x2;
        boolean z2 = list instanceof LongArrayList;
        CodedInputStream codedInputStream = this.f23896a;
        if (!z2) {
            int i = this.f23897b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(codedInputStream.mo8390z()));
                    if (codedInputStream.mo8370e()) {
                        return;
                    } else {
                        iMo8388x = codedInputStream.mo8388x();
                    }
                } while (iMo8388x == this.f23897b);
                this.f23899d = iMo8388x;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.m8520c();
            }
            int iMo8369d = codedInputStream.mo8369d() + codedInputStream.mo8389y();
            do {
                list.add(Long.valueOf(codedInputStream.mo8390z()));
            } while (codedInputStream.mo8369d() < iMo8369d);
            m8432j(iMo8369d);
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int i2 = this.f23897b & 7;
        if (i2 == 0) {
            do {
                longArrayList.addLong(codedInputStream.mo8390z());
                if (codedInputStream.mo8370e()) {
                    return;
                } else {
                    iMo8388x2 = codedInputStream.mo8388x();
                }
            } while (iMo8388x2 == this.f23897b);
            this.f23899d = iMo8388x2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.m8520c();
        }
        int iMo8369d2 = codedInputStream.mo8369d() + codedInputStream.mo8389y();
        do {
            longArrayList.addLong(codedInputStream.mo8390z());
        } while (codedInputStream.mo8369d() < iMo8369d2);
        m8432j(iMo8369d2);
    }

    @Override // androidx.datastore.preferences.protobuf.Reader
    public final boolean skipField() {
        int i;
        CodedInputStream codedInputStream = this.f23896a;
        if (codedInputStream.mo8370e() || (i = this.f23897b) == this.f23898c) {
            return false;
        }
        return codedInputStream.mo8367A(i);
    }
}
