package kotlin.text;

import androidx.compose.p013ui.platform.AbstractC1313i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"kotlin-stdlib"}, m18303k = 5, m18304mv = {2, 1, 0}, m18306xi = 49, m18307xs = "kotlin/text/StringsKt")
class StringsKt__StringNumberConversionsKt extends StringsKt__StringNumberConversionsJVMKt {
    /* JADX INFO: renamed from: a */
    public static final void m20451a(String input) {
        Intrinsics.m18599g(input, "input");
        throw new NumberFormatException(AbstractC1313i.m6244a('\'', "Invalid number format: '", input));
    }
}
