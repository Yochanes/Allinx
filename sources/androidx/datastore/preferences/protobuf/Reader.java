package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.MapEntryLite;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
interface Reader {
    /* JADX INFO: renamed from: a */
    Object mo8305a(Schema schema, ExtensionRegistryLite extensionRegistryLite);

    /* JADX INFO: renamed from: b */
    void mo8306b(Map map, MapEntryLite.Metadata metadata, ExtensionRegistryLite extensionRegistryLite);

    /* JADX INFO: renamed from: c */
    void mo8307c(List list, Schema schema, ExtensionRegistryLite extensionRegistryLite);

    /* JADX INFO: renamed from: d */
    void mo8308d(List list, Schema schema, ExtensionRegistryLite extensionRegistryLite);

    /* JADX INFO: renamed from: e */
    Object mo8309e(Schema schema, ExtensionRegistryLite extensionRegistryLite);

    int getFieldNumber();

    int getTag();

    boolean readBool();

    void readBoolList(List list);

    ByteString readBytes();

    void readBytesList(List list);

    double readDouble();

    void readDoubleList(List list);

    int readEnum();

    void readEnumList(List list);

    int readFixed32();

    void readFixed32List(List list);

    long readFixed64();

    void readFixed64List(List list);

    float readFloat();

    void readFloatList(List list);

    int readInt32();

    void readInt32List(List list);

    long readInt64();

    void readInt64List(List list);

    int readSFixed32();

    void readSFixed32List(List list);

    long readSFixed64();

    void readSFixed64List(List list);

    int readSInt32();

    void readSInt32List(List list);

    long readSInt64();

    void readSInt64List(List list);

    String readString();

    void readStringList(List list);

    void readStringListRequireUtf8(List list);

    String readStringRequireUtf8();

    int readUInt32();

    void readUInt32List(List list);

    long readUInt64();

    void readUInt64List(List list);

    boolean skipField();
}
