package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public interface MessageLite extends MessageLiteOrBuilder {

    /* JADX INFO: compiled from: Proguard */
    public interface Builder extends MessageLiteOrBuilder, Cloneable {
        MessageLite buildPartial();
    }

    /* JADX INFO: renamed from: b */
    void mo8508b(CodedOutputStream codedOutputStream);

    int getSerializedSize();

    GeneratedMessageLite.Builder newBuilderForType();

    GeneratedMessageLite.Builder toBuilder();

    ByteString toByteString();
}
