package io.ktor.http.content;

import io.ktor.http.ContentType;
import io.ktor.http.content.OutgoingContent;
import io.ktor.utils.p043io.ByteReadChannel;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/content/URIFileContent;", "Lio/ktor/http/content/OutgoingContent$ReadChannelContent;", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class URIFileContent extends OutgoingContent.ReadChannelContent {
    @Override // io.ktor.http.content.OutgoingContent
    /* JADX INFO: renamed from: b */
    public final ContentType getF45174a() {
        return null;
    }

    @Override // io.ktor.http.content.OutgoingContent.ReadChannelContent
    /* JADX INFO: renamed from: d */
    public final ByteReadChannel mo16866d() {
        throw null;
    }
}
