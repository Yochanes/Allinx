package io.ktor.utils.p043io.charsets;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/utils/io/charsets/MalformedInputException;", "Ljava/nio/charset/MalformedInputException;", "ktor-io"}, m18303k = 1, m18304mv = {1, 4, 2})
public class MalformedInputException extends java.nio.charset.MalformedInputException {

    /* JADX INFO: renamed from: a */
    public final String f47327a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MalformedInputException(String message) {
        super(0);
        Intrinsics.m18599g(message, "message");
        this.f47327a = message;
    }

    @Override // java.nio.charset.MalformedInputException, java.lang.Throwable
    public final String getMessage() {
        return this.f47327a;
    }
}
