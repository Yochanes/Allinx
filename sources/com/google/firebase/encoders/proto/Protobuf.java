package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.annotations.ExtraProperty;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@ExtraProperty
public @interface Protobuf {

    /* JADX INFO: compiled from: Proguard */
    public enum IntEncoding {
        DEFAULT,
        SIGNED,
        FIXED
    }

    IntEncoding intEncoding() default IntEncoding.DEFAULT;

    int tag();
}
