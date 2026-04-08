package io.ktor.http.cio.internals;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\r\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0002*\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, m18302d2 = {"<anonymous>", "", "T", "", "", "s", "idx", "", "invoke", "(Ljava/lang/CharSequence;I)C"}, m18303k = 3, m18304mv = {1, 4, 2})
final class AsciiCharTree$Companion$build$2 extends Lambda implements Function2<CharSequence, Integer, Character> {

    /* JADX INFO: renamed from: a */
    public static final AsciiCharTree$Companion$build$2 f45882a = new AsciiCharTree$Companion$build$2(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CharSequence s = (CharSequence) obj;
        int iIntValue = ((Number) obj2).intValue();
        Intrinsics.m18599g(s, "s");
        return Character.valueOf(s.charAt(iIntValue));
    }
}
