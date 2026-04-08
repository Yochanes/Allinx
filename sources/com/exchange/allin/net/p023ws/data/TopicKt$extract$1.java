package com.exchange.allin.net.p023ws.data;

import io.reactivex.rxjava3.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
final class TopicKt$extract$1<T, R> implements Function {
    @Override // io.reactivex.rxjava3.functions.Function
    public final Object apply(Object obj) throws WebSocketResponseError {
        WebSocketResult it = (WebSocketResult) obj;
        Intrinsics.m18599g(it, "it");
        if (it.getError() == null) {
            return it;
        }
        it.getId();
        String msg = it.getError();
        Intrinsics.m18599g(msg, "msg");
        throw new WebSocketResponseError(msg);
    }
}
