package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class ExtensionSchemas {

    /* JADX INFO: renamed from: a */
    public static final ExtensionSchemaLite f23928a = new ExtensionSchemaLite();

    /* JADX INFO: renamed from: b */
    public static final ExtensionSchema f23929b;

    static {
        ExtensionSchema extensionSchema;
        try {
            extensionSchema = (ExtensionSchema) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            extensionSchema = null;
        }
        f23929b = extensionSchema;
    }
}
