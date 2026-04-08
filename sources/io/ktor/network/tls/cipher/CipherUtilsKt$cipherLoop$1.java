package io.ktor.network.tls.cipher;

import io.ktor.utils.p043io.core.BytePacketBuilder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m18302d2 = {"<anonymous>", "", "Lio/ktor/utils/io/core/BytePacketBuilder;", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
final class CipherUtilsKt$cipherLoop$1 extends Lambda implements Function1<BytePacketBuilder, Unit> {

    /* JADX INFO: renamed from: a */
    public static final CipherUtilsKt$cipherLoop$1 f46344a = new CipherUtilsKt$cipherLoop$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        BytePacketBuilder receiver = (BytePacketBuilder) obj;
        Intrinsics.m18599g(receiver, "$receiver");
        return Unit.f51459a;
    }
}
