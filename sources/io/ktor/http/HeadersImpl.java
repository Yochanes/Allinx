package io.ktor.http;

import io.ktor.util.InternalAPI;
import io.ktor.util.StringValuesImpl;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@InternalAPI
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/http/HeadersImpl;", "Lio/ktor/http/Headers;", "Lio/ktor/util/StringValuesImpl;", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class HeadersImpl extends StringValuesImpl implements Headers {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeadersImpl(Map values) {
        super(values, true);
        Intrinsics.m18599g(values, "values");
    }

    @Override // io.ktor.util.StringValuesImpl
    public final String toString() {
        return "Headers " + entries();
    }
}
