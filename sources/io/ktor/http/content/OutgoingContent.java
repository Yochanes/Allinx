package io.ktor.http.content;

import io.ktor.http.ContentType;
import io.ktor.http.EmptyHeaders;
import io.ktor.http.Headers;
import io.ktor.utils.p043io.ByteReadChannel;
import io.ktor.utils.p043io.ByteWriteChannel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, m18302d2 = {"Lio/ktor/http/content/OutgoingContent;", "", "ByteArrayContent", "NoContent", "ProtocolUpgrade", "ReadChannelContent", "WriteChannelContent", "Lio/ktor/http/content/OutgoingContent$NoContent;", "Lio/ktor/http/content/OutgoingContent$ReadChannelContent;", "Lio/ktor/http/content/OutgoingContent$WriteChannelContent;", "Lio/ktor/http/content/OutgoingContent$ByteArrayContent;", "Lio/ktor/http/content/OutgoingContent$ProtocolUpgrade;", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
public abstract class OutgoingContent {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/content/OutgoingContent$ByteArrayContent;", "Lio/ktor/http/content/OutgoingContent;", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static abstract class ByteArrayContent extends OutgoingContent {
        /* JADX INFO: renamed from: d */
        public abstract byte[] mo16886d();
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/content/OutgoingContent$NoContent;", "Lio/ktor/http/content/OutgoingContent;", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static abstract class NoContent extends OutgoingContent {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/content/OutgoingContent$ProtocolUpgrade;", "Lio/ktor/http/content/OutgoingContent;", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static abstract class ProtocolUpgrade extends OutgoingContent {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/content/OutgoingContent$ReadChannelContent;", "Lio/ktor/http/content/OutgoingContent;", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static abstract class ReadChannelContent extends OutgoingContent {
        /* JADX INFO: renamed from: d */
        public abstract ByteReadChannel mo16866d();
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/content/OutgoingContent$WriteChannelContent;", "Lio/ktor/http/content/OutgoingContent;", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static abstract class WriteChannelContent extends OutgoingContent {
        /* JADX INFO: renamed from: d */
        public abstract Object mo16929d(ByteWriteChannel byteWriteChannel, Continuation continuation);
    }

    /* JADX INFO: renamed from: a */
    public Long mo16864a() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public ContentType mo16865b() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public Headers mo16921c() {
        Headers.f45656a.getClass();
        return EmptyHeaders.f45641c;
    }
}
