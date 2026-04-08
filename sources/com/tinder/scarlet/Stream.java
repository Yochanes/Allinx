package com.tinder.scarlet;

import kotlin.Metadata;
import org.reactivestreams.Publisher;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, m18302d2 = {"Lcom/tinder/scarlet/Stream;", "T", "Lorg/reactivestreams/Publisher;", "Disposable", "Observer", "scarlet-core"}, m18303k = 1, m18304mv = {1, 4, 2})
public interface Stream<T> extends Publisher<T> {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/tinder/scarlet/Stream$Disposable;", "", "scarlet-core"}, m18303k = 1, m18304mv = {1, 4, 2})
    public interface Disposable {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00002\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Lcom/tinder/scarlet/Stream$Observer;", "T", "", "scarlet-core"}, m18303k = 1, m18304mv = {1, 4, 2})
    public interface Observer<T> {
        void onComplete();

        void onError(Throwable th);

        void onNext(Object obj);
    }
}
