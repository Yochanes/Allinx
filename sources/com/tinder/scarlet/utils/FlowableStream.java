package com.tinder.scarlet.utils;

import com.tinder.scarlet.Stream;
import kotlin.Metadata;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0004¨\u0006\u0005"}, m18302d2 = {"Lcom/tinder/scarlet/utils/FlowableStream;", "T", "Lcom/tinder/scarlet/Stream;", "Lorg/reactivestreams/Publisher;", "FlowableStreamDisposable", "scarlet-core-internal"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class FlowableStream<T> implements Stream<T>, Publisher<T> {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/tinder/scarlet/utils/FlowableStream$FlowableStreamDisposable;", "Lcom/tinder/scarlet/Stream$Disposable;", "scarlet-core-internal"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class FlowableStreamDisposable implements Stream.Disposable {
    }

    @Override // org.reactivestreams.Publisher
    /* JADX INFO: renamed from: g */
    public final void mo15432g(Subscriber subscriber) {
        throw null;
    }
}
