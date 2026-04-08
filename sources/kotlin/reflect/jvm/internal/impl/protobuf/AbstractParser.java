package kotlin.reflect.jvm.internal.impl.protobuf;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractParser<MessageType extends MessageLite> implements Parser<MessageType> {
    static {
        int i = ExtensionRegistryLite.f54095b;
    }

    /* JADX INFO: renamed from: b */
    public static void m19616b(MessageLite messageLite) throws InvalidProtocolBufferException {
        UninitializedMessageException uninitializedMessageException;
        if (messageLite == null || messageLite.isInitialized()) {
            return;
        }
        if (messageLite instanceof AbstractMessageLite) {
            uninitializedMessageException = new UninitializedMessageException();
        } else {
            uninitializedMessageException = new UninitializedMessageException();
        }
        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(uninitializedMessageException.getMessage());
        invalidProtocolBufferException.f54121a = messageLite;
        throw invalidProtocolBufferException;
    }

    /* JADX INFO: renamed from: c */
    public final MessageLite m19617c(ByteArrayInputStream byteArrayInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        MessageLite messageLite;
        try {
            int i = byteArrayInputStream.read();
            if (i == -1) {
                messageLite = null;
            } else {
                if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                    i &= 127;
                    int i2 = 7;
                    while (true) {
                        if (i2 >= 32) {
                            while (i2 < 64) {
                                int i3 = byteArrayInputStream.read();
                                if (i3 == -1) {
                                    throw InvalidProtocolBufferException.m19710a();
                                }
                                if ((i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
                                    i2 += 7;
                                }
                            }
                            throw new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
                        }
                        int i4 = byteArrayInputStream.read();
                        if (i4 == -1) {
                            throw InvalidProtocolBufferException.m19710a();
                        }
                        i |= (i4 & 127) << i2;
                        if ((i4 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
                            break;
                        }
                        i2 += 7;
                    }
                }
                CodedInputStream codedInputStream = new CodedInputStream(new AbstractMessageLite.Builder.LimitedInputStream(byteArrayInputStream, i));
                MessageLite messageLite2 = (MessageLite) mo19417a(codedInputStream, extensionRegistryLite);
                try {
                    codedInputStream.m19639a(0);
                    messageLite = messageLite2;
                } catch (InvalidProtocolBufferException e) {
                    e.f54121a = messageLite2;
                    throw e;
                }
            }
            m19616b(messageLite);
            return messageLite;
        } catch (IOException e2) {
            throw new InvalidProtocolBufferException(e2.getMessage());
        }
    }
}
