package io.ktor.http.cio;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18302d2 = {"<anonymous>", "", "it", "invoke", "(I)Ljava/lang/Integer;"}, m18303k = 3, m18304mv = {1, 4, 2})
final class HttpHeadersMap$getAll$1 extends Lambda implements Function1<Integer, Integer> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ HttpHeadersMap f45800a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpHeadersMap$getAll$1(HttpHeadersMap httpHeadersMap) {
        super(1);
        this.f45800a = httpHeadersMap;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int iIntValue = ((Number) obj).intValue() + 1;
        if (iIntValue >= this.f45800a.f45797a) {
            return null;
        }
        return Integer.valueOf(iIntValue);
    }
}
