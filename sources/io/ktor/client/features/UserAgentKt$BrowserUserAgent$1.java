package io.ktor.client.features;

import io.ktor.client.features.UserAgent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m18302d2 = {"<anonymous>", "", "Lio/ktor/client/features/UserAgent$Config;", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
final class UserAgentKt$BrowserUserAgent$1 extends Lambda implements Function1<UserAgent.Config, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        UserAgent.Config receiver = (UserAgent.Config) obj;
        Intrinsics.m18599g(receiver, "$receiver");
        receiver.f45315a = "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Ubuntu Chromium/70.0.3538.77 Chrome/70.0.3538.77 Safari/537.36";
        return Unit.f51459a;
    }
}
