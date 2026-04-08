package androidx.datastore.preferences.protobuf;

import java.io.Serializable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public enum JavaType {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(ByteString.class, ByteString.f23857b),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);


    /* JADX INFO: renamed from: a */
    public final Serializable f24017a;

    JavaType(Class cls, Serializable serializable) {
        this.f24017a = serializable;
    }
}
