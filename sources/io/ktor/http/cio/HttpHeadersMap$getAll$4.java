package io.ktor.http.cio;

import io.ktor.http.cio.internals.CharArrayBuilder;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "it", "", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
final class HttpHeadersMap$getAll$4 extends Lambda implements Function1<Integer, CharSequence> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ HttpHeadersMap f45804a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpHeadersMap$getAll$4(HttpHeadersMap httpHeadersMap) {
        super(1);
        this.f45804a = httpHeadersMap;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int iIntValue = ((Number) obj).intValue();
        HttpHeadersMap httpHeadersMap = this.f45804a;
        CharArrayBuilder charArrayBuilder = httpHeadersMap.f45799c;
        int[] iArr = httpHeadersMap.f45798b;
        return charArrayBuilder.subSequence(iArr[iIntValue + 4], iArr[iIntValue + 5]);
    }
}
