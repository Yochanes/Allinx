package com.exchange.allin.utils;

import com.exchange.allin.utils.ext.ToastExtKt;
import io.reactivex.rxjava3.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
final class ImageGenerator$album$4<T> implements Consumer {
    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        Boolean granted = (Boolean) obj;
        Intrinsics.m18599g(granted, "granted");
        if (granted.booleanValue()) {
            throw null;
        }
        ToastExtKt.m14235a("SDCard card write permission is required to save pictures");
    }
}
