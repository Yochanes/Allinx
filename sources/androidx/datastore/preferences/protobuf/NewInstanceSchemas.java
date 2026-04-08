package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class NewInstanceSchemas {

    /* JADX INFO: renamed from: a */
    public static final NewInstanceSchema f24067a;

    /* JADX INFO: renamed from: b */
    public static final NewInstanceSchemaLite f24068b;

    static {
        NewInstanceSchema newInstanceSchema;
        try {
            newInstanceSchema = (NewInstanceSchema) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            newInstanceSchema = null;
        }
        f24067a = newInstanceSchema;
        f24068b = new NewInstanceSchemaLite();
    }
}
