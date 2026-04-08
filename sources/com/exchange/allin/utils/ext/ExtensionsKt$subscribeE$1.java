package com.exchange.allin.utils.ext;

import android.util.Log;
import io.reactivex.rxjava3.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
final class ExtensionsKt$subscribeE$1<T> implements Consumer {

    /* JADX INFO: renamed from: a */
    public static final ExtensionsKt$subscribeE$1 f41653a = new ExtensionsKt$subscribeE$1();

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object it) {
        Intrinsics.m18599g(it, "it");
        Log.e("TAG", "subscribeE123: ");
    }
}
