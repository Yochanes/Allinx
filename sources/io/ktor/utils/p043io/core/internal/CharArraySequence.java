package io.ktor.utils.p043io.core.internal;

import androidx.compose.animation.AbstractC0455a;
import kotlin.Metadata;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/utils/io/core/internal/CharArraySequence;", "", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class CharArraySequence implements CharSequence {
    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i < 0) {
            throw null;
        }
        throw new IndexOutOfBoundsException(AbstractC0000a.m10g(i, "String index out of bounds: ", " > 0"));
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return 0;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC0000a.m9f(i, "startIndex shouldn't be negative: "));
        }
        if (!(i <= 0)) {
            throw new IllegalArgumentException(AbstractC0000a.m10g(i, "startIndex is too large: ", " > 0"));
        }
        if (i + i2 > 0) {
            throw new IllegalArgumentException(AbstractC0000a.m10g(i2, "endIndex is too large: ", " > 0"));
        }
        if (i2 >= i) {
            throw null;
        }
        throw new IllegalArgumentException(AbstractC0455a.m2237l(i, i2, "endIndex should be greater or equal to startIndex: ", " > "));
    }
}
