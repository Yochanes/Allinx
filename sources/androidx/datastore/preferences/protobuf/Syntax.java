package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public enum Syntax implements Internal.EnumLite {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: a */
    public final int f24137a;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.Syntax$1 */
    /* JADX INFO: compiled from: Proguard */
    public static class C15911 implements Internal.EnumLiteMap<Syntax> {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SyntaxVerifier implements Internal.EnumVerifier {
        @Override // androidx.datastore.preferences.protobuf.Internal.EnumVerifier
        public final boolean isInRange(int i) {
            return (i != 0 ? i != 1 ? null : Syntax.SYNTAX_PROTO3 : Syntax.SYNTAX_PROTO2) != null;
        }
    }

    Syntax(int i) {
        this.f24137a = i;
    }

    @Override // androidx.datastore.preferences.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f24137a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
