package io.ktor.http;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/http/InvalidCookieDateException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class InvalidCookieDateException extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidCookieDateException(String data, String reason) {
        super("Failed to parse date string: \"" + data + "\". Reason: \"" + reason + '\"');
        Intrinsics.m18599g(data, "data");
        Intrinsics.m18599g(reason, "reason");
    }
}
