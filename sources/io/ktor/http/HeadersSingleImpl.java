package io.ktor.http;

import io.ktor.util.InternalAPI;
import io.ktor.util.StringValuesSingleImpl;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@InternalAPI
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/http/HeadersSingleImpl;", "Lio/ktor/http/Headers;", "Lio/ktor/util/StringValuesSingleImpl;", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class HeadersSingleImpl extends StringValuesSingleImpl implements Headers {
    @Override // io.ktor.util.StringValuesSingleImpl
    public final String toString() {
        return "Headers " + entries();
    }
}
