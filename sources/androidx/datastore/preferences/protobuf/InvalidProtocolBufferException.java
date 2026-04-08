package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class InvalidProtocolBufferException extends IOException {

    /* JADX INFO: compiled from: Proguard */
    public static class InvalidWireTypeException extends InvalidProtocolBufferException {
    }

    /* JADX INFO: renamed from: a */
    public static InvalidProtocolBufferException m8518a() {
        return new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
    }

    /* JADX INFO: renamed from: b */
    public static InvalidProtocolBufferException m8519b() {
        return new InvalidProtocolBufferException("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: renamed from: c */
    public static InvalidWireTypeException m8520c() {
        return new InvalidWireTypeException("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: renamed from: d */
    public static InvalidProtocolBufferException m8521d() {
        return new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: renamed from: e */
    public static InvalidProtocolBufferException m8522e() {
        return new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: renamed from: f */
    public static InvalidProtocolBufferException m8523f() {
        return new InvalidProtocolBufferException("Failed to parse the message.");
    }

    /* JADX INFO: renamed from: g */
    public static InvalidProtocolBufferException m8524g() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
