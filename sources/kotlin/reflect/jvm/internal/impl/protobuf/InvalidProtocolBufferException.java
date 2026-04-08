package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class InvalidProtocolBufferException extends IOException {

    /* JADX INFO: renamed from: a */
    public MessageLite f54121a;

    public InvalidProtocolBufferException(String str) {
        super(str);
        this.f54121a = null;
    }

    /* JADX INFO: renamed from: a */
    public static InvalidProtocolBufferException m19710a() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }
}
