package io.ktor.http.content;

import io.ktor.http.ContentType;
import io.ktor.http.ContentTypesKt;
import io.ktor.http.content.OutgoingContent;
import io.ktor.utils.p043io.ByteWriteChannel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/content/WriterContent;", "Lio/ktor/http/content/OutgoingContent$WriteChannelContent;", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class WriterContent extends OutgoingContent.WriteChannelContent {
    @Override // io.ktor.http.content.OutgoingContent
    /* JADX INFO: renamed from: b */
    public final ContentType getF45174a() {
        return null;
    }

    @Override // io.ktor.http.content.OutgoingContent.WriteChannelContent
    /* JADX INFO: renamed from: d */
    public final Object mo16929d(ByteWriteChannel byteWriteChannel, Continuation continuation) {
        ContentTypesKt.m16949a(null);
        throw null;
    }
}
