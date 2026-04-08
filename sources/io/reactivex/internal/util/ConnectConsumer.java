package io.reactivex.internal.util;

import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ConnectConsumer implements Consumer<Disposable> {

    /* JADX INFO: renamed from: a */
    public Disposable f49272a;

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        this.f49272a = (Disposable) obj;
    }
}
