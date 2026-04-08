package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class MapFieldSchemas {

    /* JADX INFO: renamed from: a */
    public static final MapFieldSchema f24040a;

    /* JADX INFO: renamed from: b */
    public static final MapFieldSchemaLite f24041b;

    static {
        MapFieldSchema mapFieldSchema;
        try {
            mapFieldSchema = (MapFieldSchema) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            mapFieldSchema = null;
        }
        f24040a = mapFieldSchema;
        f24041b = new MapFieldSchemaLite();
    }
}
