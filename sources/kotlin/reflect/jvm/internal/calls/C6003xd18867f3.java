package kotlin.reflect.jvm.internal.calls;

import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$createAnnotationInstance$toString$2$1$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\n¢\u0006\u0002\b\u0007"}, m18302d2 = {"<anonymous>", "", "T", "", "entry", "", "", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class C6003xd18867f3 extends Lambda implements Function1<Map.Entry<? extends String, ? extends Object>, CharSequence> {

    /* JADX INFO: renamed from: a */
    public static final C6003xd18867f3 f51981a = new C6003xd18867f3(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String string;
        Map.Entry entry = (Map.Entry) obj;
        Intrinsics.m18599g(entry, "entry");
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof boolean[]) {
            string = Arrays.toString((boolean[]) value);
            Intrinsics.m18598f(string, "toString(this)");
        } else if (value instanceof char[]) {
            string = Arrays.toString((char[]) value);
            Intrinsics.m18598f(string, "toString(this)");
        } else if (value instanceof byte[]) {
            string = Arrays.toString((byte[]) value);
            Intrinsics.m18598f(string, "toString(this)");
        } else if (value instanceof short[]) {
            string = Arrays.toString((short[]) value);
            Intrinsics.m18598f(string, "toString(this)");
        } else if (value instanceof int[]) {
            string = Arrays.toString((int[]) value);
            Intrinsics.m18598f(string, "toString(this)");
        } else if (value instanceof float[]) {
            string = Arrays.toString((float[]) value);
            Intrinsics.m18598f(string, "toString(this)");
        } else if (value instanceof long[]) {
            string = Arrays.toString((long[]) value);
            Intrinsics.m18598f(string, "toString(this)");
        } else if (value instanceof double[]) {
            string = Arrays.toString((double[]) value);
            Intrinsics.m18598f(string, "toString(this)");
        } else if (value instanceof Object[]) {
            string = Arrays.toString((Object[]) value);
            Intrinsics.m18598f(string, "toString(this)");
        } else {
            string = value.toString();
        }
        return str + '=' + string;
    }
}
