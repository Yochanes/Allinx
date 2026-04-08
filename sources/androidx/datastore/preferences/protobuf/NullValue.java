package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public enum NullValue implements Internal.EnumLite {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f24073a;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.NullValue$1 */
    /* JADX INFO: compiled from: Proguard */
    public static class C15821 implements Internal.EnumLiteMap<NullValue> {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class NullValueVerifier implements Internal.EnumVerifier {
        @Override // androidx.datastore.preferences.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return (i != 0 ? null : NullValue.NULL_VALUE) != null;
        }
    }

    NullValue(int i) {
        this.f24073a = i;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f24073a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
