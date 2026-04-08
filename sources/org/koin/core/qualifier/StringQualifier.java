package org.koin.core.qualifier;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lorg/koin/core/qualifier/StringQualifier;", "Lorg/koin/core/qualifier/Qualifier;", "koin-core"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final /* data */ class StringQualifier implements Qualifier {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StringQualifier)) {
            return false;
        }
        ((StringQualifier) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return -1466499394;
    }

    public final String toString() {
        return "_root_";
    }
}
