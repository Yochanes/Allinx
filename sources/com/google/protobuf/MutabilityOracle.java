package com.google.protobuf;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
interface MutabilityOracle {
    public static final MutabilityOracle IMMUTABLE = new C49141();

    /* JADX INFO: renamed from: com.google.protobuf.MutabilityOracle$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C49141 implements MutabilityOracle {
        @Override // com.google.protobuf.MutabilityOracle
        public void ensureMutable() {
            throw new UnsupportedOperationException();
        }
    }

    void ensureMutable();
}
