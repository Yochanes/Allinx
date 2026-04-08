package io.ktor.http.cio.websocket;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "it", "Lio/ktor/http/cio/websocket/Frame;", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
public final class WebSocketDeflateExtension$Config$compressIf$1 extends Lambda implements Function1<Frame, Boolean> {
    final /* synthetic */ Function1 $block;
    final /* synthetic */ Function1 $old;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketDeflateExtension$Config$compressIf$1(Function1 function1, Function1 function12) {
        super(1);
        this.$block = function1;
        this.$old = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(invoke((Frame) obj));
    }

    public final boolean invoke(@NotNull Frame it) {
        Intrinsics.m18599g(it, "it");
        return ((Boolean) this.$block.invoke(it)).booleanValue() && ((Boolean) this.$old.invoke(it)).booleanValue();
    }
}
