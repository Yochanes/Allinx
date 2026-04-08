package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
interface MessageInfoFactory {
    boolean isSupported(Class cls);

    MessageInfo messageInfoFor(Class cls);
}
