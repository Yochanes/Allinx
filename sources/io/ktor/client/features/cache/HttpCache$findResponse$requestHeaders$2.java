package io.ktor.client.features.cache;

import io.ktor.http.Headers;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "", "p1", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
final /* synthetic */ class HttpCache$findResponse$requestHeaders$2 extends FunctionReferenceImpl implements Function1<String, List<? extends String>> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String p1 = (String) obj;
        Intrinsics.m18599g(p1, "p1");
        return ((Headers) this.receiver).mo16961c(p1);
    }
}
