package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class BlockingIgnoringReceiver extends CountDownLatch implements Consumer<Throwable>, Action {
    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        countDown();
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        countDown();
    }
}
