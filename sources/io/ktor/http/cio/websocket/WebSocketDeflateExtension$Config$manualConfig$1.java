package io.ktor.http.cio.websocket;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, m18302d2 = {"<anonymous>", "", "it", "", "Lio/ktor/http/cio/websocket/WebSocketExtensionHeader;", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
public final class WebSocketDeflateExtension$Config$manualConfig$1 extends Lambda implements Function1<List<WebSocketExtensionHeader>, Unit> {
    public static final WebSocketDeflateExtension$Config$manualConfig$1 INSTANCE = new WebSocketDeflateExtension$Config$manualConfig$1();

    public WebSocketDeflateExtension$Config$manualConfig$1() {
        super(1);
    }

    public final void invoke(@NotNull List<WebSocketExtensionHeader> it) {
        Intrinsics.m18599g(it, "it");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<WebSocketExtensionHeader>) obj);
        return Unit.f51459a;
    }
}
