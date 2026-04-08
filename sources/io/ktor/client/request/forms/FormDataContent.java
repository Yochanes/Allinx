package io.ktor.client.request.forms;

import io.ktor.http.ContentType;
import io.ktor.http.content.OutgoingContent;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/client/request/forms/FormDataContent;", "Lio/ktor/http/content/OutgoingContent$ByteArrayContent;", "ktor-client-core"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class FormDataContent extends OutgoingContent.ByteArrayContent {
    @Override // io.ktor.http.content.OutgoingContent
    /* JADX INFO: renamed from: a */
    public final Long mo16864a() {
        return 0L;
    }

    @Override // io.ktor.http.content.OutgoingContent
    /* JADX INFO: renamed from: b */
    public final ContentType getF45171a() {
        return null;
    }

    @Override // io.ktor.http.content.OutgoingContent.ByteArrayContent
    /* JADX INFO: renamed from: d */
    public final byte[] mo16886d() {
        return null;
    }
}
