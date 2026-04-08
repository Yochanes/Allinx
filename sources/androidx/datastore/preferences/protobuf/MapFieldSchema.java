package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.MapEntryLite;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
interface MapFieldSchema {
    /* JADX INFO: renamed from: a */
    MapFieldLite mo8538a();

    MapFieldLite forMapData(Object obj);

    MapEntryLite.Metadata forMapMetadata(Object obj);

    MapFieldLite forMutableMapData(Object obj);

    int getSerializedSize(int i, Object obj, Object obj2);

    boolean isImmutable(Object obj);

    MapFieldLite mergeFrom(Object obj, Object obj2);

    Object toImmutable(Object obj);
}
