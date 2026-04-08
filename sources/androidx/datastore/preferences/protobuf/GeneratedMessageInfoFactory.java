package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class GeneratedMessageInfoFactory implements MessageInfoFactory {

    /* JADX INFO: renamed from: a */
    public static final GeneratedMessageInfoFactory f23987a = new GeneratedMessageInfoFactory();

    @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
    public final boolean isSupported(Class cls) {
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }

    @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
    public final MessageInfo messageInfoFor(Class cls) {
        if (!GeneratedMessageLite.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (MessageInfo) GeneratedMessageLite.m8502j(cls.asSubclass(GeneratedMessageLite.class)).mo8264h(GeneratedMessageLite.MethodToInvoke.f23994c);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }
}
