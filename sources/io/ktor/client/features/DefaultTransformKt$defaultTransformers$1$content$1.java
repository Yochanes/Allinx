package io.ktor.client.features;

import io.ktor.http.ContentType;
import io.ktor.http.content.OutgoingContent;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"io/ktor/client/features/DefaultTransformKt$defaultTransformers$1$content$1", "Lio/ktor/http/content/OutgoingContent$ByteArrayContent;", "ktor-client-core"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class DefaultTransformKt$defaultTransformers$1$content$1 extends OutgoingContent.ByteArrayContent {

    /* JADX INFO: renamed from: a */
    public final ContentType f45171a;

    /* JADX INFO: renamed from: b */
    public final long f45172b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f45173c;

    public DefaultTransformKt$defaultTransformers$1$content$1(Object obj, ContentType contentType) {
        this.f45173c = obj;
        if (contentType == null) {
            ContentType contentType2 = ContentType.Application.f45588a;
            contentType = ContentType.Application.f45588a;
        }
        this.f45171a = contentType;
        this.f45172b = ((byte[]) obj).length;
    }

    @Override // io.ktor.http.content.OutgoingContent
    /* JADX INFO: renamed from: a */
    public final Long mo16864a() {
        return Long.valueOf(this.f45172b);
    }

    @Override // io.ktor.http.content.OutgoingContent
    /* JADX INFO: renamed from: b, reason: from getter */
    public final ContentType getF45171a() {
        return this.f45171a;
    }

    @Override // io.ktor.http.content.OutgoingContent.ByteArrayContent
    /* JADX INFO: renamed from: d */
    public final byte[] mo16886d() {
        return (byte[]) this.f45173c;
    }
}
