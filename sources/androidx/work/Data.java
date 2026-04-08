package androidx.work;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/work/Data;", "", "Builder", "Companion", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class Data {

    /* JADX INFO: renamed from: b */
    public static final Data f32563b = new Builder().m12093a();

    /* JADX INFO: renamed from: a */
    public final HashMap f32564a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/work/Data$Builder;", "", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class Builder {

        /* JADX INFO: renamed from: a */
        public final LinkedHashMap f32565a = new LinkedHashMap();

        /* JADX INFO: renamed from: a */
        public final Data m12093a() {
            Data data = new Data(this.f32565a);
            Companion.m12096b(data);
            return data;
        }

        /* JADX INFO: renamed from: b */
        public final void m12094b(HashMap values) {
            Object[] objArr;
            Intrinsics.m18599g(values, "values");
            for (Map.Entry entry : values.entrySet()) {
                String key = (String) entry.getKey();
                Object value = entry.getValue();
                Intrinsics.m18599g(key, "key");
                LinkedHashMap linkedHashMap = this.f32565a;
                if (value == null) {
                    value = null;
                } else {
                    Class<?> cls = value.getClass();
                    ReflectionFactory reflectionFactory = Reflection.f51660a;
                    KClass kClassMo18612b = reflectionFactory.mo18612b(cls);
                    if (kClassMo18612b.equals(reflectionFactory.mo18612b(Boolean.TYPE)) ? true : kClassMo18612b.equals(reflectionFactory.mo18612b(Byte.TYPE)) ? true : kClassMo18612b.equals(reflectionFactory.mo18612b(Integer.TYPE)) ? true : kClassMo18612b.equals(reflectionFactory.mo18612b(Long.TYPE)) ? true : kClassMo18612b.equals(reflectionFactory.mo18612b(Float.TYPE)) ? true : kClassMo18612b.equals(reflectionFactory.mo18612b(Double.TYPE)) ? true : kClassMo18612b.equals(reflectionFactory.mo18612b(String.class)) ? true : kClassMo18612b.equals(reflectionFactory.mo18612b(Boolean[].class)) ? true : kClassMo18612b.equals(reflectionFactory.mo18612b(Byte[].class)) ? true : kClassMo18612b.equals(reflectionFactory.mo18612b(Integer[].class)) ? true : kClassMo18612b.equals(reflectionFactory.mo18612b(Long[].class)) ? true : kClassMo18612b.equals(reflectionFactory.mo18612b(Float[].class)) ? true : kClassMo18612b.equals(reflectionFactory.mo18612b(Double[].class)) ? true : kClassMo18612b.equals(reflectionFactory.mo18612b(String[].class))) {
                        continue;
                    } else {
                        int i = 0;
                        if (kClassMo18612b.equals(reflectionFactory.mo18612b(boolean[].class))) {
                            boolean[] zArr = (boolean[]) value;
                            String str = Data_Kt.f32567a;
                            int length = zArr.length;
                            objArr = new Boolean[length];
                            while (i < length) {
                                objArr[i] = Boolean.valueOf(zArr[i]);
                                i++;
                            }
                        } else if (kClassMo18612b.equals(reflectionFactory.mo18612b(byte[].class))) {
                            byte[] bArr = (byte[]) value;
                            String str2 = Data_Kt.f32567a;
                            int length2 = bArr.length;
                            objArr = new Byte[length2];
                            while (i < length2) {
                                objArr[i] = Byte.valueOf(bArr[i]);
                                i++;
                            }
                        } else if (kClassMo18612b.equals(reflectionFactory.mo18612b(int[].class))) {
                            int[] iArr = (int[]) value;
                            String str3 = Data_Kt.f32567a;
                            int length3 = iArr.length;
                            objArr = new Integer[length3];
                            while (i < length3) {
                                objArr[i] = Integer.valueOf(iArr[i]);
                                i++;
                            }
                        } else if (kClassMo18612b.equals(reflectionFactory.mo18612b(long[].class))) {
                            long[] jArr = (long[]) value;
                            String str4 = Data_Kt.f32567a;
                            int length4 = jArr.length;
                            objArr = new Long[length4];
                            while (i < length4) {
                                objArr[i] = Long.valueOf(jArr[i]);
                                i++;
                            }
                        } else if (kClassMo18612b.equals(reflectionFactory.mo18612b(float[].class))) {
                            float[] fArr = (float[]) value;
                            String str5 = Data_Kt.f32567a;
                            int length5 = fArr.length;
                            objArr = new Float[length5];
                            while (i < length5) {
                                objArr[i] = Float.valueOf(fArr[i]);
                                i++;
                            }
                        } else {
                            if (!kClassMo18612b.equals(reflectionFactory.mo18612b(double[].class))) {
                                throw new IllegalArgumentException("Key " + key + " has invalid type " + kClassMo18612b);
                            }
                            double[] dArr = (double[]) value;
                            String str6 = Data_Kt.f32567a;
                            int length6 = dArr.length;
                            objArr = new Double[length6];
                            while (i < length6) {
                                objArr[i] = Double.valueOf(dArr[i]);
                                i++;
                            }
                        }
                        value = objArr;
                    }
                }
                linkedHashMap.put(key, value);
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011R\u0014\u0010\u0019\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R\u0014\u0010\u001a\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0011R\u0014\u0010\u001b\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0011R\u0014\u0010\u001c\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0011R\u0014\u0010\u001d\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0011R\u0014\u0010\u001e\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0011R\u0014\u0010\u001f\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0011¨\u0006 "}, m18302d2 = {"Landroidx/work/Data$Companion;", "", "Landroidx/work/Data;", "EMPTY", "Landroidx/work/Data;", "", "MAX_DATA_BYTES", "I", "", "NULL_STRING_V1", "Ljava/lang/String;", "", "STREAM_MAGIC", "S", "STREAM_VERSION", "", "TYPE_BOOLEAN", "B", "TYPE_BOOLEAN_ARRAY", "TYPE_BYTE", "TYPE_BYTE_ARRAY", "TYPE_DOUBLE", "TYPE_DOUBLE_ARRAY", "TYPE_FLOAT", "TYPE_FLOAT_ARRAY", "TYPE_INTEGER", "TYPE_INTEGER_ARRAY", "TYPE_LONG", "TYPE_LONG_ARRAY", "TYPE_NULL", "TYPE_STRING", "TYPE_STRING_ARRAY", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, java.lang.Double[]] */
        /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Serializable, java.lang.Float[]] */
        /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Serializable, java.lang.Long[]] */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Serializable, java.lang.Integer[]] */
        /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Serializable, java.lang.Byte[]] */
        /* JADX WARN: Type inference failed for: r0v7, types: [java.io.Serializable, java.lang.Boolean[]] */
        /* JADX WARN: Type inference failed for: r1v14, types: [java.io.Serializable, java.lang.String[]] */
        /* JADX INFO: renamed from: a */
        public static final Serializable m12095a(DataInputStream dataInputStream, byte b2) throws IOException {
            if (b2 == 0) {
                return null;
            }
            if (b2 == 1) {
                return Boolean.valueOf(dataInputStream.readBoolean());
            }
            if (b2 == 2) {
                return Byte.valueOf(dataInputStream.readByte());
            }
            if (b2 == 3) {
                return Integer.valueOf(dataInputStream.readInt());
            }
            if (b2 == 4) {
                return Long.valueOf(dataInputStream.readLong());
            }
            if (b2 == 5) {
                return Float.valueOf(dataInputStream.readFloat());
            }
            if (b2 == 6) {
                return Double.valueOf(dataInputStream.readDouble());
            }
            if (b2 == 7) {
                return dataInputStream.readUTF();
            }
            int i = 0;
            if (b2 == 8) {
                int i2 = dataInputStream.readInt();
                ?? r0 = new Boolean[i2];
                while (i < i2) {
                    r0[i] = Boolean.valueOf(dataInputStream.readBoolean());
                    i++;
                }
                return r0;
            }
            if (b2 == 9) {
                int i3 = dataInputStream.readInt();
                ?? r02 = new Byte[i3];
                while (i < i3) {
                    r02[i] = Byte.valueOf(dataInputStream.readByte());
                    i++;
                }
                return r02;
            }
            if (b2 == 10) {
                int i4 = dataInputStream.readInt();
                ?? r03 = new Integer[i4];
                while (i < i4) {
                    r03[i] = Integer.valueOf(dataInputStream.readInt());
                    i++;
                }
                return r03;
            }
            if (b2 == 11) {
                int i5 = dataInputStream.readInt();
                ?? r04 = new Long[i5];
                while (i < i5) {
                    r04[i] = Long.valueOf(dataInputStream.readLong());
                    i++;
                }
                return r04;
            }
            if (b2 == 12) {
                int i6 = dataInputStream.readInt();
                ?? r05 = new Float[i6];
                while (i < i6) {
                    r05[i] = Float.valueOf(dataInputStream.readFloat());
                    i++;
                }
                return r05;
            }
            if (b2 == 13) {
                int i7 = dataInputStream.readInt();
                ?? r06 = new Double[i7];
                while (i < i7) {
                    r06[i] = Double.valueOf(dataInputStream.readDouble());
                    i++;
                }
                return r06;
            }
            if (b2 != 14) {
                throw new IllegalStateException(AbstractC0000a.m9f(b2, "Unsupported type "));
            }
            int i8 = dataInputStream.readInt();
            ?? r1 = new String[i8];
            while (i < i8) {
                String utf = dataInputStream.readUTF();
                if (Intrinsics.m18594b(utf, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                    utf = null;
                }
                r1[i] = utf;
                i++;
            }
            return r1;
        }

        /* JADX INFO: renamed from: b */
        public static byte[] m12096b(Data data) {
            Intrinsics.m18599g(data, "data");
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                try {
                    dataOutputStream.writeShort(-21521);
                    dataOutputStream.writeShort(1);
                    HashMap map = data.f32564a;
                    dataOutputStream.writeInt(map.size());
                    for (Map.Entry entry : map.entrySet()) {
                        m12097c(dataOutputStream, (String) entry.getKey(), entry.getValue());
                    }
                    dataOutputStream.flush();
                    if (dataOutputStream.size() > 10240) {
                        throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    dataOutputStream.close();
                    Intrinsics.m18598f(byteArray, "{\n                ByteAr…          }\n            }");
                    return byteArray;
                } finally {
                }
            } catch (IOException e) {
                Logger.m12100e().mo12105d(Data_Kt.f32567a, "Error in Data#toByteArray: ", e);
                return new byte[0];
            }
        }

        /* JADX INFO: renamed from: c */
        public static final void m12097c(DataOutputStream dataOutputStream, String str, Object obj) throws IOException {
            int i;
            if (obj == null) {
                dataOutputStream.writeByte(0);
            } else if (obj instanceof Boolean) {
                dataOutputStream.writeByte(1);
                dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                dataOutputStream.writeByte(2);
                dataOutputStream.writeByte(((Number) obj).byteValue());
            } else if (obj instanceof Integer) {
                dataOutputStream.writeByte(3);
                dataOutputStream.writeInt(((Number) obj).intValue());
            } else if (obj instanceof Long) {
                dataOutputStream.writeByte(4);
                dataOutputStream.writeLong(((Number) obj).longValue());
            } else if (obj instanceof Float) {
                dataOutputStream.writeByte(5);
                dataOutputStream.writeFloat(((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                dataOutputStream.writeByte(6);
                dataOutputStream.writeDouble(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                dataOutputStream.writeByte(7);
                dataOutputStream.writeUTF((String) obj);
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalArgumentException("Unsupported value type " + Reflection.f51660a.mo18612b(obj.getClass()).mo18588i());
                }
                Object[] objArr = (Object[]) obj;
                Class<?> cls = objArr.getClass();
                ReflectionFactory reflectionFactory = Reflection.f51660a;
                KClass kClassMo18612b = reflectionFactory.mo18612b(cls);
                if (kClassMo18612b.equals(reflectionFactory.mo18612b(Boolean[].class))) {
                    i = 8;
                } else if (kClassMo18612b.equals(reflectionFactory.mo18612b(Byte[].class))) {
                    i = 9;
                } else if (kClassMo18612b.equals(reflectionFactory.mo18612b(Integer[].class))) {
                    i = 10;
                } else if (kClassMo18612b.equals(reflectionFactory.mo18612b(Long[].class))) {
                    i = 11;
                } else if (kClassMo18612b.equals(reflectionFactory.mo18612b(Float[].class))) {
                    i = 12;
                } else if (kClassMo18612b.equals(reflectionFactory.mo18612b(Double[].class))) {
                    i = 13;
                } else {
                    if (!kClassMo18612b.equals(reflectionFactory.mo18612b(String[].class))) {
                        throw new IllegalArgumentException("Unsupported value type " + reflectionFactory.mo18612b(objArr.getClass()).mo18587c());
                    }
                    i = 14;
                }
                dataOutputStream.writeByte(i);
                dataOutputStream.writeInt(objArr.length);
                for (Object obj2 : objArr) {
                    if (i == 8) {
                        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                        dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                    } else if (i == 9) {
                        Byte b2 = obj2 instanceof Byte ? (Byte) obj2 : null;
                        dataOutputStream.writeByte(b2 != null ? b2.byteValue() : (byte) 0);
                    } else if (i == 10) {
                        Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
                        dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                    } else if (i == 11) {
                        Long l = obj2 instanceof Long ? (Long) obj2 : null;
                        dataOutputStream.writeLong(l != null ? l.longValue() : 0L);
                    } else if (i == 12) {
                        Float f = obj2 instanceof Float ? (Float) obj2 : null;
                        dataOutputStream.writeFloat(f != null ? f.floatValue() : 0.0f);
                    } else if (i == 13) {
                        Double d = obj2 instanceof Double ? (Double) obj2 : null;
                        dataOutputStream.writeDouble(d != null ? d.doubleValue() : 0.0d);
                    } else if (i == 14) {
                        String str2 = obj2 instanceof String ? (String) obj2 : null;
                        if (str2 == null) {
                            str2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                        }
                        dataOutputStream.writeUTF(str2);
                    }
                }
            }
            dataOutputStream.writeUTF(str);
        }
    }

    public Data(Data other) {
        Intrinsics.m18599g(other, "other");
        this.f32564a = new HashMap(other.f32564a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Data m12090a(byte[] bytes) {
        Intrinsics.m18599g(bytes, "bytes");
        if (bytes.length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        if (bytes.length == 0) {
            return f32563b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            byte[] bArr = new byte[2];
            byteArrayInputStream.read(bArr);
            byte b2 = (byte) (-21267);
            int i = 0;
            if (bArr[0] == ((byte) 16777132)) {
                boolean z2 = true;
                if (bArr[1] != b2) {
                    z2 = false;
                }
                byteArrayInputStream.reset();
                if (z2) {
                    ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        int i2 = objectInputStream.readInt();
                        while (i < i2) {
                            String utf = objectInputStream.readUTF();
                            Intrinsics.m18598f(utf, "readUTF()");
                            linkedHashMap.put(utf, objectInputStream.readObject());
                            i++;
                        }
                        objectInputStream.close();
                    } finally {
                    }
                } else {
                    DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                    try {
                        short s = dataInputStream.readShort();
                        if (s != -21521) {
                            throw new IllegalStateException(AbstractC0000a.m9f(s, "Magic number doesn't match: ").toString());
                        }
                        short s2 = dataInputStream.readShort();
                        if (s2 != 1) {
                            throw new IllegalStateException(AbstractC0000a.m9f(s2, "Unsupported version number: ").toString());
                        }
                        int i3 = dataInputStream.readInt();
                        while (i < i3) {
                            Serializable serializableM12095a = Companion.m12095a(dataInputStream, dataInputStream.readByte());
                            String key = dataInputStream.readUTF();
                            Intrinsics.m18598f(key, "key");
                            linkedHashMap.put(key, serializableM12095a);
                            i++;
                        }
                        dataInputStream.close();
                    } finally {
                    }
                }
            }
        } catch (IOException e) {
            Logger.m12100e().mo12105d(Data_Kt.f32567a, "Error in Data#fromByteArray: ", e);
        } catch (ClassNotFoundException e2) {
            Logger.m12100e().mo12105d(Data_Kt.f32567a, "Error in Data#fromByteArray: ", e2);
        }
        return new Data(linkedHashMap);
    }

    /* JADX INFO: renamed from: b */
    public final String m12091b(String str) {
        Object obj = this.f32564a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m12092c(String str) {
        Object obj = this.f32564a.get(str);
        return obj != null && String.class.isAssignableFrom(obj.getClass());
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean zM18378m;
        if (this != obj) {
            if (obj != null && Data.class.equals(obj.getClass())) {
                HashMap map = this.f32564a;
                Set<String> setKeySet = map.keySet();
                HashMap map2 = ((Data) obj).f32564a;
                if (Intrinsics.m18594b(setKeySet, map2.keySet())) {
                    for (String str : setKeySet) {
                        Object obj2 = map.get(str);
                        Object obj3 = map2.get(str);
                        if (obj2 == null || obj3 == null) {
                            zM18378m = obj2 == obj3;
                        } else if (obj2 instanceof Object[]) {
                            zM18378m = obj3 instanceof Object[] ? ArraysKt.m18378m((Object[]) obj2, (Object[]) obj3) : obj2.equals(obj3);
                        }
                        if (!zM18378m) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (Map.Entry entry : this.f32564a.entrySet()) {
            Object value = entry.getValue();
            iHashCode += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value) : entry.hashCode();
        }
        return iHashCode * 31;
    }

    public final String toString() {
        String str = "Data {" + CollectionsKt.m18409J(this.f32564a.entrySet(), null, null, null, Data$toString$1$content$1.f32566a, 31) + "}";
        Intrinsics.m18598f(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }

    public Data(LinkedHashMap values) {
        Intrinsics.m18599g(values, "values");
        this.f32564a = new HashMap(values);
    }
}
