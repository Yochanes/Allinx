package io.ktor.http.auth;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/auth/HeaderValueEncoding;", "", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class HeaderValueEncoding {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ HeaderValueEncoding[] f45718a = {new HeaderValueEncoding("QUOTED_WHEN_REQUIRED", 0), new HeaderValueEncoding("QUOTED_ALWAYS", 1), new HeaderValueEncoding("URI_ENCODE", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    HeaderValueEncoding EF5;

    public static HeaderValueEncoding valueOf(String str) {
        return (HeaderValueEncoding) Enum.valueOf(HeaderValueEncoding.class, str);
    }

    public static HeaderValueEncoding[] values() {
        return (HeaderValueEncoding[]) f45718a.clone();
    }
}
