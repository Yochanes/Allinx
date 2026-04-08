package io.ktor.http.cio.internals;

import io.ktor.http.HttpMethod;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "it", "Lio/ktor/http/HttpMethod;", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
public final class CharsKt$DefaultHttpMethods$1 extends Lambda implements Function1<HttpMethod, Integer> {

    /* JADX INFO: renamed from: a */
    public static final CharsKt$DefaultHttpMethods$1 f45902a = new CharsKt$DefaultHttpMethods$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        HttpMethod it = (HttpMethod) obj;
        Intrinsics.m18599g(it, "it");
        return Integer.valueOf(it.f45665a.length());
    }
}
