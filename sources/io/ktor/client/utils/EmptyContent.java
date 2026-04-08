package io.ktor.client.utils;

import io.ktor.http.content.OutgoingContent;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/client/utils/EmptyContent;", "Lio/ktor/http/content/OutgoingContent$NoContent;", "ktor-client-core"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class EmptyContent extends OutgoingContent.NoContent {

    /* JADX INFO: renamed from: a */
    public static final EmptyContent f45569a = new EmptyContent();

    @Override // io.ktor.http.content.OutgoingContent
    /* JADX INFO: renamed from: a */
    public final Long mo16864a() {
        return 0L;
    }

    public final String toString() {
        return "EmptyContent";
    }
}
