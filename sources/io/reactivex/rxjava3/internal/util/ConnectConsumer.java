package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ConnectConsumer implements Consumer<Disposable> {

    /* JADX INFO: renamed from: a */
    public Disposable f51221a;

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        this.f51221a = (Disposable) obj;
    }
}
