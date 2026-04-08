package io.ktor.http.cio;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m18302d2 = {"<anonymous>", "", "it", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
final class HttpHeadersMap$getAll$2 extends Lambda implements Function1<Integer, Integer> {

    /* JADX INFO: renamed from: a */
    public static final HttpHeadersMap$getAll$2 f45801a = new HttpHeadersMap$getAll$2(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Integer.valueOf(((Number) obj).intValue() * 8);
    }
}
