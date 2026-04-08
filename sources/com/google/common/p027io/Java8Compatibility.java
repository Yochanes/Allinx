package com.google.common.p027io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.nio.Buffer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
final class Java8Compatibility {
    private Java8Compatibility() {
    }

    public static void clear(Buffer buffer) {
        buffer.clear();
    }

    public static void flip(Buffer buffer) {
        buffer.flip();
    }

    public static void limit(Buffer buffer, int i) {
        buffer.limit(i);
    }

    public static void mark(Buffer buffer) {
        buffer.mark();
    }

    public static void position(Buffer buffer, int i) {
        buffer.position(i);
    }

    public static void reset(Buffer buffer) {
        buffer.reset();
    }
}
