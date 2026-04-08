package io.ktor.client.request;

import io.ktor.http.content.OutgoingContent;
import io.ktor.util.InternalAPI;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@InternalAPI
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/client/request/ClientUpgradeContent;", "Lio/ktor/http/content/OutgoingContent$NoContent;", "ktor-client-core"}, m18303k = 1, m18304mv = {1, 4, 2})
public abstract class ClientUpgradeContent extends OutgoingContent.NoContent {

    /* JADX INFO: renamed from: a */
    public final Lazy f45467a = LazyKt.m18299b(ClientUpgradeContent$content$2.f45468a);
}
