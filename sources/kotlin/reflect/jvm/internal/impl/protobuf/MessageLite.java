package kotlin.reflect.jvm.internal.impl.protobuf;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface MessageLite extends MessageLiteOrBuilder {

    /* JADX INFO: compiled from: Proguard */
    public interface Builder extends Cloneable, MessageLiteOrBuilder {
        MessageLite build();

        /* JADX INFO: renamed from: n */
        Builder mo19425n(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);
    }

    /* JADX INFO: renamed from: a */
    void mo19416a(CodedOutputStream codedOutputStream);

    int getSerializedSize();

    Builder newBuilderForType();

    Builder toBuilder();
}
