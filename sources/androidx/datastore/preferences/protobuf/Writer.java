package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.MapEntryLite;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
interface Writer {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class FieldOrder {

        /* JADX INFO: renamed from: a */
        public static final FieldOrder f24199a;

        /* JADX INFO: renamed from: b */
        public static final FieldOrder f24200b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ FieldOrder[] f24201c;

        static {
            FieldOrder fieldOrder = new FieldOrder("ASCENDING", 0);
            f24199a = fieldOrder;
            FieldOrder fieldOrder2 = new FieldOrder("DESCENDING", 1);
            f24200b = fieldOrder2;
            f24201c = new FieldOrder[]{fieldOrder, fieldOrder2};
        }

        public static FieldOrder valueOf(String str) {
            return (FieldOrder) java.lang.Enum.valueOf(FieldOrder.class, str);
        }

        public static FieldOrder[] values() {
            return (FieldOrder[]) f24201c.clone();
        }
    }

    /* JADX INFO: renamed from: a */
    void mo8322a(int i, List list, Schema schema);

    /* JADX INFO: renamed from: b */
    void mo8323b(int i, List list, Schema schema);

    /* JADX INFO: renamed from: c */
    void mo8336c(int i, ByteString byteString);

    /* JADX INFO: renamed from: d */
    void mo8337d(int i, Object obj, Schema schema);

    /* JADX INFO: renamed from: e */
    void mo8324e(int i, MapEntryLite.Metadata metadata, Map map);

    /* JADX INFO: renamed from: f */
    void mo8338f(int i, Object obj, Schema schema);

    FieldOrder fieldOrder();

    void writeBool(int i, boolean z2);

    void writeBoolList(int i, List list, boolean z2);

    void writeBytesList(int i, List list);

    void writeDouble(int i, double d);

    void writeDoubleList(int i, List list, boolean z2);

    void writeEndGroup(int i);

    void writeEnum(int i, int i2);

    void writeEnumList(int i, List list, boolean z2);

    void writeFixed32(int i, int i2);

    void writeFixed32List(int i, List list, boolean z2);

    void writeFixed64(int i, long j);

    void writeFixed64List(int i, List list, boolean z2);

    void writeFloat(int i, float f);

    void writeFloatList(int i, List list, boolean z2);

    void writeInt32(int i, int i2);

    void writeInt32List(int i, List list, boolean z2);

    void writeInt64(int i, long j);

    void writeInt64List(int i, List list, boolean z2);

    void writeMessage(int i, Object obj);

    void writeMessageSetItem(int i, Object obj);

    void writeSFixed32(int i, int i2);

    void writeSFixed32List(int i, List list, boolean z2);

    void writeSFixed64(int i, long j);

    void writeSFixed64List(int i, List list, boolean z2);

    void writeSInt32(int i, int i2);

    void writeSInt32List(int i, List list, boolean z2);

    void writeSInt64(int i, long j);

    void writeSInt64List(int i, List list, boolean z2);

    void writeStartGroup(int i);

    void writeString(int i, String str);

    void writeStringList(int i, List list);

    void writeUInt32(int i, int i2);

    void writeUInt32List(int i, List list, boolean z2);

    void writeUInt64(int i, long j);

    void writeUInt64List(int i, List list, boolean z2);
}
