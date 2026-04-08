package io.ktor.http.cio.internals;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0002*\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m18302d2 = {"<anonymous>", "", "T", "", "", "it", "invoke", "(Ljava/lang/CharSequence;)I"}, m18303k = 3, m18304mv = {1, 4, 2})
final class AsciiCharTree$Companion$build$1 extends Lambda implements Function1<CharSequence, Integer> {

    /* JADX INFO: renamed from: a */
    public static final AsciiCharTree$Companion$build$1 f45881a = new AsciiCharTree$Companion$build$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CharSequence it = (CharSequence) obj;
        Intrinsics.m18599g(it, "it");
        return Integer.valueOf(it.length());
    }
}
