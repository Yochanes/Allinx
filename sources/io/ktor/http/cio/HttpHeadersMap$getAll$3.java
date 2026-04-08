package io.ktor.http.cio;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "it", "", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
final class HttpHeadersMap$getAll$3 extends Lambda implements Function1<Integer, Boolean> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ HttpHeadersMap f45802a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f45803b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpHeadersMap$getAll$3(HttpHeadersMap httpHeadersMap, int i) {
        super(1);
        this.f45802a = httpHeadersMap;
        this.f45803b = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(this.f45802a.f45798b[((Number) obj).intValue()] == this.f45803b);
    }
}
