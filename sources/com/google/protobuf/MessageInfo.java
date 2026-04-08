package com.google.protobuf;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@CheckReturnValue
interface MessageInfo {
    MessageLite getDefaultInstance();

    ProtoSyntax getSyntax();

    boolean isMessageSetWireFormat();
}
