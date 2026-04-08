package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.FieldSet;
import androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
abstract class ExtensionSchema<T extends FieldSet.FieldDescriptorLite<T>> {
    /* JADX INFO: renamed from: a */
    public abstract void mo8479a(Map.Entry entry);

    /* JADX INFO: renamed from: b */
    public abstract GeneratedMessageLite.GeneratedExtension mo8480b(ExtensionRegistryLite extensionRegistryLite, MessageLite messageLite, int i);

    /* JADX INFO: renamed from: c */
    public abstract FieldSet mo8481c(Object obj);

    /* JADX INFO: renamed from: d */
    public abstract FieldSet mo8482d(Object obj);

    /* JADX INFO: renamed from: e */
    public abstract boolean mo8483e(MessageLite messageLite);

    /* JADX INFO: renamed from: f */
    public abstract void mo8484f(Object obj);

    /* JADX INFO: renamed from: g */
    public abstract Object mo8485g(Object obj);

    /* JADX INFO: renamed from: h */
    public abstract void mo8486h(Object obj);

    /* JADX INFO: renamed from: i */
    public abstract void mo8487i(Object obj);

    /* JADX INFO: renamed from: j */
    public abstract void mo8488j(Map.Entry entry);
}
