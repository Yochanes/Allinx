package io.ktor.http.cio.websocket;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "it", "Lio/ktor/http/cio/websocket/Frame;", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
public final class WebSocketDeflateExtension$Config$compressCondition$1 extends Lambda implements Function1<Frame, Boolean> {
    public static final WebSocketDeflateExtension$Config$compressCondition$1 INSTANCE = new WebSocketDeflateExtension$Config$compressCondition$1();

    public WebSocketDeflateExtension$Config$compressCondition$1() {
        super(1);
    }

    public final boolean invoke(@NotNull Frame it) {
        Intrinsics.m18599g(it, "it");
        return true;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(invoke((Frame) obj));
    }
}
