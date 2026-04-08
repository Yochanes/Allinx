package com.google.protobuf;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@CheckReturnValue
interface MessageInfoFactory {
    boolean isSupported(Class<?> cls);

    MessageInfo messageInfoFor(Class<?> cls);
}
