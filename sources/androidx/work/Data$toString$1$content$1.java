package androidx.work;

import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, m18302d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "", "", "", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class Data$toString$1$content$1 extends Lambda implements Function1<Map.Entry<? extends String, ? extends Object>, CharSequence> {

    /* JADX INFO: renamed from: a */
    public static final Data$toString$1$content$1 f32566a = new Data$toString$1$content$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Intrinsics.m18599g(entry, "<name for destructuring parameter 0>");
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        StringBuilder sbM21r = AbstractC0000a.m21r(str, " : ");
        if (value instanceof Object[]) {
            value = Arrays.toString((Object[]) value);
            Intrinsics.m18598f(value, "toString(this)");
        }
        sbM21r.append(value);
        return sbM21r.toString();
    }
}
