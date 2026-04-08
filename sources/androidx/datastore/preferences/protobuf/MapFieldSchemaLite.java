package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.MapEntryLite;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class MapFieldSchemaLite implements MapFieldSchema {
    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    /* JADX INFO: renamed from: a */
    public final MapFieldLite mo8538a() {
        return MapFieldLite.f24038b.m8537f();
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public final MapFieldLite forMapData(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public final MapEntryLite.Metadata forMapMetadata(Object obj) {
        return ((MapEntryLite) obj).f24033a;
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public final MapFieldLite forMutableMapData(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public final int getSerializedSize(int i, Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        MapEntryLite mapEntryLite = (MapEntryLite) obj2;
        int iM8744v = 0;
        if (mapFieldLite.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : mapFieldLite.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            mapEntryLite.getClass();
            int iM8442q = CodedOutputStream.m8442q(i);
            int iM8533a = MapEntryLite.m8533a(mapEntryLite.f24033a, key, value);
            iM8744v = AbstractC1610a.m8744v(iM8533a, iM8533a, iM8442q, iM8744v);
        }
        return iM8744v;
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public final boolean isImmutable(Object obj) {
        return !((MapFieldLite) obj).f24039a;
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public final MapFieldLite mergeFrom(Object obj, Object obj2) {
        MapFieldLite mapFieldLiteM8537f = (MapFieldLite) obj;
        MapFieldLite mapFieldLite = (MapFieldLite) obj2;
        if (!mapFieldLite.isEmpty()) {
            if (!mapFieldLiteM8537f.f24039a) {
                mapFieldLiteM8537f = mapFieldLiteM8537f.m8537f();
            }
            mapFieldLiteM8537f.m8536e();
            if (!mapFieldLite.isEmpty()) {
                mapFieldLiteM8537f.putAll(mapFieldLite);
            }
        }
        return mapFieldLiteM8537f;
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public final Object toImmutable(Object obj) {
        ((MapFieldLite) obj).f24039a = false;
        return obj;
    }
}
