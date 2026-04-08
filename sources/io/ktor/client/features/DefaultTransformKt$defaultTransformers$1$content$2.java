package io.ktor.client.features;

import io.ktor.http.ContentType;
import io.ktor.http.content.OutgoingContent;
import io.ktor.utils.p043io.ByteReadChannel;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"io/ktor/client/features/DefaultTransformKt$defaultTransformers$1$content$2", "Lio/ktor/http/content/OutgoingContent$ReadChannelContent;", "ktor-client-core"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class DefaultTransformKt$defaultTransformers$1$content$2 extends OutgoingContent.ReadChannelContent {

    /* JADX INFO: renamed from: a */
    public final ContentType f45174a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f45175b;

    public DefaultTransformKt$defaultTransformers$1$content$2(Object obj, ContentType contentType) {
        this.f45175b = obj;
        if (contentType == null) {
            ContentType contentType2 = ContentType.Application.f45588a;
            contentType = ContentType.Application.f45588a;
        }
        this.f45174a = contentType;
    }

    @Override // io.ktor.http.content.OutgoingContent
    /* JADX INFO: renamed from: b, reason: from getter */
    public final ContentType getF45174a() {
        return this.f45174a;
    }

    @Override // io.ktor.http.content.OutgoingContent.ReadChannelContent
    /* JADX INFO: renamed from: d */
    public final ByteReadChannel mo16866d() {
        return (ByteReadChannel) this.f45175b;
    }
}
