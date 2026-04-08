package io.ktor.utils.p043io.core;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@ExperimentalIoApi
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/utils/io/core/InsufficientSpaceException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class InsufficientSpaceException extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public InsufficientSpaceException(String str, int i, int i2) {
        String message = "Not enough free space to write " + str + " of " + i + " bytes, available " + i2 + " bytes.";
        Intrinsics.m18599g(message, "message");
        super(message);
    }
}
