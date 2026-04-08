package io.ktor.http.cio;

import io.ktor.http.cio.internals.AsciiCharTree;
import io.ktor.http.cio.internals.CharArrayBuilder;
import io.ktor.http.cio.internals.CharsKt;
import io.ktor.util.InternalAPI;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@InternalAPI
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/cio/HttpHeadersMap;", "", "ktor-http-cio"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class HttpHeadersMap {

    /* JADX INFO: renamed from: a */
    public int f45797a;

    /* JADX INFO: renamed from: b */
    public int[] f45798b;

    /* JADX INFO: renamed from: c */
    public final CharArrayBuilder f45799c;

    public HttpHeadersMap(CharArrayBuilder builder) {
        Intrinsics.m18599g(builder, "builder");
        this.f45799c = builder;
        this.f45798b = (int[]) HttpHeadersMapKt.f45806b.mo17488G();
    }

    /* JADX INFO: renamed from: a */
    public final CharSequence m17007a(String name) {
        Intrinsics.m18599g(name, "name");
        AsciiCharTree asciiCharTree = CharsKt.f45899a;
        int iM17039b = CharsKt.m17039b(name, 0, name.length());
        int i = this.f45797a;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2 * 8;
            int[] iArr = this.f45798b;
            if (iArr[i3] == iM17039b) {
                return this.f45799c.subSequence(iArr[i3 + 4], iArr[i3 + 5]);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final CharSequence m17008b(int i) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!(i < this.f45797a)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i2 = i * 8;
        int[] iArr = this.f45798b;
        return this.f45799c.subSequence(iArr[i2 + 2], iArr[i2 + 3]);
    }

    /* JADX INFO: renamed from: c */
    public final void m17009c(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = this.f45797a;
        int i8 = i7 * 8;
        int[] iArr = this.f45798b;
        if (i8 >= iArr.length) {
            throw new NotImplementedError("An operation is not implemented: Implement headers overflow");
        }
        iArr[i8] = i;
        iArr[i8 + 1] = i2;
        iArr[i8 + 2] = i3;
        iArr[i8 + 3] = i4;
        iArr[i8 + 4] = i5;
        iArr[i8 + 5] = i6;
        iArr[i8 + 6] = -1;
        iArr[i8 + 7] = -1;
        this.f45797a = i7 + 1;
    }

    /* JADX INFO: renamed from: d */
    public final void m17010d() {
        this.f45797a = 0;
        int[] iArr = this.f45798b;
        int[] iArr2 = HttpHeadersMapKt.f45805a;
        this.f45798b = iArr2;
        if (iArr != iArr2) {
            HttpHeadersMapKt.f45806b.mo17522N0(iArr);
        }
    }

    /* JADX INFO: renamed from: e */
    public final CharSequence m17011e(int i) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!(i < this.f45797a)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i2 = i * 8;
        int[] iArr = this.f45798b;
        return this.f45799c.subSequence(iArr[i2 + 4], iArr[i2 + 5]);
    }

    public final String toString() throws IOException {
        StringBuilder sb = new StringBuilder();
        int[] iArr = HttpHeadersMapKt.f45805a;
        int i = this.f45797a;
        for (int i2 = 0; i2 < i; i2++) {
            sb.append((CharSequence) "");
            sb.append(m17008b(i2));
            sb.append((CharSequence) " => ");
            sb.append(m17011e(i2));
            sb.append((CharSequence) "\n");
        }
        String string = sb.toString();
        Intrinsics.m18598f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
