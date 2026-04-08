package io.ktor.http.cio.internals;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ktor-http-cio"}, m18303k = 2, m18304mv = {1, 4, 2})
public final class TokenizerKt {
    /* JADX INFO: renamed from: a */
    public static final int m17045a(CharArrayBuilder charArrayBuilder, MutableRange mutableRange) {
        int i = mutableRange.f45912a;
        int i2 = mutableRange.f45913b;
        if (i < i2 && !kotlin.text.CharsKt.m20381c(charArrayBuilder.charAt(i))) {
            do {
                i++;
                if (i >= i2) {
                    break;
                }
            } while (!kotlin.text.CharsKt.m20381c(charArrayBuilder.charAt(i)));
        }
        return i;
    }

    /* JADX INFO: renamed from: b */
    public static final void m17046b(CharArrayBuilder charArrayBuilder, MutableRange mutableRange) {
        int i = mutableRange.f45912a;
        int i2 = mutableRange.f45913b;
        if (i >= i2 || !kotlin.text.CharsKt.m20381c(charArrayBuilder.charAt(i))) {
            return;
        }
        do {
            i++;
            if (i >= i2) {
                break;
            }
        } while (kotlin.text.CharsKt.m20381c(charArrayBuilder.charAt(i)));
        mutableRange.f45912a = i;
    }
}
