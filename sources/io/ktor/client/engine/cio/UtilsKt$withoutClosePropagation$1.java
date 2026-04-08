package io.ktor.client.engine.cio;

import io.ktor.utils.p043io.ByteChannelKt$ByteChannel$1;
import io.ktor.utils.p043io.ByteWriteChannelKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "it", "", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
final class UtilsKt$withoutClosePropagation$1 extends Lambda implements Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ByteChannelKt$ByteChannel$1 f45145a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtilsKt$withoutClosePropagation$1(ByteChannelKt$ByteChannel$1 byteChannelKt$ByteChannel$1) {
        super(1);
        this.f45145a = byteChannelKt$ByteChannel$1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ByteWriteChannelKt.m17380a(this.f45145a);
        return Unit.f51459a;
    }
}
