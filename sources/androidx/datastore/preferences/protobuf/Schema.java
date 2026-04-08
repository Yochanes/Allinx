package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
interface Schema<T> {
    /* JADX INFO: renamed from: a */
    void mo8560a(Object obj, Reader reader, ExtensionRegistryLite extensionRegistryLite);

    /* JADX INFO: renamed from: b */
    int mo8561b(AbstractMessageLite abstractMessageLite);

    /* JADX INFO: renamed from: c */
    void mo8562c(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2);

    /* JADX INFO: renamed from: d */
    int mo8563d(GeneratedMessageLite generatedMessageLite);

    /* JADX INFO: renamed from: e */
    void mo8564e(Object obj, Writer writer);

    /* JADX INFO: renamed from: f */
    boolean mo8565f(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2);

    boolean isInitialized(Object obj);

    void makeImmutable(Object obj);

    Object newInstance();
}
