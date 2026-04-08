package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class ManifestSchemaFactory implements SchemaFactory {

    /* JADX INFO: renamed from: b */
    public static final C15751 f24030b = new C15751();

    /* JADX INFO: renamed from: a */
    public final CompositeMessageInfoFactory f24031a;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.ManifestSchemaFactory$1 */
    /* JADX INFO: compiled from: Proguard */
    public static class C15751 implements MessageInfoFactory {
        @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
        public final boolean isSupported(Class cls) {
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
        public final MessageInfo messageInfoFor(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class CompositeMessageInfoFactory implements MessageInfoFactory {

        /* JADX INFO: renamed from: a */
        public MessageInfoFactory[] f24032a;

        @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
        public final boolean isSupported(Class cls) {
            for (MessageInfoFactory messageInfoFactory : this.f24032a) {
                if (messageInfoFactory.isSupported(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.MessageInfoFactory
        public final MessageInfo messageInfoFor(Class cls) {
            for (MessageInfoFactory messageInfoFactory : this.f24032a) {
                if (messageInfoFactory.isSupported(cls)) {
                    return messageInfoFactory.messageInfoFor(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
        }
    }

    public ManifestSchemaFactory() {
        MessageInfoFactory messageInfoFactory;
        try {
            messageInfoFactory = (MessageInfoFactory) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            messageInfoFactory = f24030b;
        }
        MessageInfoFactory[] messageInfoFactoryArr = {GeneratedMessageInfoFactory.f23987a, messageInfoFactory};
        CompositeMessageInfoFactory compositeMessageInfoFactory = new CompositeMessageInfoFactory();
        compositeMessageInfoFactory.f24032a = messageInfoFactoryArr;
        Charset charset = Internal.f24003a;
        this.f24031a = compositeMessageInfoFactory;
    }
}
