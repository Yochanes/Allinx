package androidx.compose.p013ui.text;

import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0006"}, m18302d2 = {"<anonymous>", "", "str", OpsMetricTracker.START, "", "end", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class AnnotatedStringKt$capitalize$1 extends Lambda implements Function3<String, Integer, Integer, String> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        int iIntValue = ((Number) obj2).intValue();
        int iIntValue2 = ((Number) obj3).intValue();
        if (iIntValue == 0) {
            Intrinsics.m18598f(str.substring(iIntValue, iIntValue2), "substring(...)");
            throw null;
        }
        String strSubstring = str.substring(iIntValue, iIntValue2);
        Intrinsics.m18598f(strSubstring, "substring(...)");
        return strSubstring;
    }
}
