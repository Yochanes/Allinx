package io.ktor.client.features.cache;

import io.ktor.http.HeaderValue;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/client/features/cache/CacheControl;", "", "ktor-client-core"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class CacheControl {

    /* JADX INFO: renamed from: a */
    public static final HeaderValue f45318a;

    /* JADX INFO: renamed from: b */
    public static final HeaderValue f45319b;

    /* JADX INFO: renamed from: c */
    public static final HeaderValue f45320c;

    static {
        EmptyList emptyList = EmptyList.f51496a;
        f45318a = new HeaderValue("no-store", emptyList);
        f45319b = new HeaderValue("no-cache", emptyList);
        f45320c = new HeaderValue("private", emptyList);
        new HeaderValue("must-revalidate", emptyList);
    }
}
