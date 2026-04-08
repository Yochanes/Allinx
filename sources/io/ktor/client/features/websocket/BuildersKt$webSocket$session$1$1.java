package io.ktor.client.features.websocket;

import io.ktor.http.URLBuilder;
import io.ktor.http.URLProtocol;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "Lio/ktor/http/URLBuilder;", "it", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
final class BuildersKt$webSocket$session$1$1 extends Lambda implements Function2<URLBuilder, URLBuilder, Unit> {

    /* JADX INFO: renamed from: a */
    public static final BuildersKt$webSocket$session$1$1 f45437a = new BuildersKt$webSocket$session$1$1(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        URLBuilder receiver = (URLBuilder) obj;
        URLBuilder it = (URLBuilder) obj2;
        Intrinsics.m18599g(receiver, "$receiver");
        Intrinsics.m18599g(it, "it");
        receiver.m16984c(URLProtocol.f45704d);
        receiver.f45695c = receiver.f45693a.f45708b;
        return Unit.f51459a;
    }
}
