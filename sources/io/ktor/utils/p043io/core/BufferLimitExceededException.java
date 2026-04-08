package io.ktor.utils.p043io.core;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/utils/io/core/BufferLimitExceededException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class BufferLimitExceededException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferLimitExceededException(String message) {
        super(message);
        Intrinsics.m18599g(message, "message");
    }
}
