package com.google.protobuf;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@CheckReturnValue
interface SchemaFactory {
    <T> Schema<T> createSchema(Class<T> cls);
}
