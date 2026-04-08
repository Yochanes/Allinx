package io.ktor.util;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083@\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/util/DigestImpl;", "Lio/ktor/util/Digest;", "ktor-utils"}, m18303k = 1, m18304mv = {1, 4, 2})
@JvmInline
final class DigestImpl implements Digest {
    public final boolean equals(Object obj) {
        if (!(obj instanceof DigestImpl)) {
            return false;
        }
        ((DigestImpl) obj).getClass();
        return Intrinsics.m18594b(null, null);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "DigestImpl(delegate=" + ((Object) null) + ")";
    }
}
