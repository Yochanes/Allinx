package kotlinx.serialization.json.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/serialization/json/internal/JsonToStringWriter;", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "kotlinx-serialization-json"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class JsonToStringWriter implements InternalJsonWriter {

    /* JADX INFO: renamed from: a */
    public char[] f56895a;

    /* JADX INFO: renamed from: b */
    public int f56896b;

    /* JADX INFO: renamed from: a */
    public final void m21131a(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = this.f56895a;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i3);
            Intrinsics.m18598f(cArrCopyOf, "copyOf(...)");
            this.f56895a = cArrCopyOf;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m21132b() {
        CharArrayPool charArrayPool = CharArrayPool.f56873c;
        char[] array = this.f56895a;
        charArrayPool.getClass();
        Intrinsics.m18599g(array, "array");
        synchronized (charArrayPool) {
            int i = charArrayPool.f56875b;
            if (array.length + i < ArrayPoolsKt.f56872a) {
                charArrayPool.f56875b = i + array.length;
                charArrayPool.f56874a.addLast(array);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m21133c(String text) {
        Intrinsics.m18599g(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        m21131a(this.f56896b, length);
        text.getChars(0, text.length(), this.f56895a, this.f56896b);
        this.f56896b += length;
    }

    /* JADX INFO: renamed from: d */
    public final void m21134d(long j) {
        m21133c(String.valueOf(j));
    }

    public final String toString() {
        return new String(this.f56895a, 0, this.f56896b);
    }
}
