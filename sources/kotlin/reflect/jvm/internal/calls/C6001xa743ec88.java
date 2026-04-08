package kotlin.reflect.jvm.internal.calls;

import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$createAnnotationInstance$hashCode$2 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18302d2 = {"<anonymous>", "", "T", "", "invoke", "()Ljava/lang/Integer;"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class C6001xa743ec88 extends Lambda implements Function0<Integer> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Map f51978a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6001xa743ec88(Map map) {
        super(0);
        this.f51978a = map;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int iHashCode = 0;
        for (Map.Entry entry : this.f51978a.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            iHashCode += (value instanceof boolean[] ? Arrays.hashCode((boolean[]) value) : value instanceof char[] ? Arrays.hashCode((char[]) value) : value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value instanceof short[] ? Arrays.hashCode((short[]) value) : value instanceof int[] ? Arrays.hashCode((int[]) value) : value instanceof float[] ? Arrays.hashCode((float[]) value) : value instanceof long[] ? Arrays.hashCode((long[]) value) : value instanceof double[] ? Arrays.hashCode((double[]) value) : value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode()) ^ (str.hashCode() * 127);
        }
        return Integer.valueOf(iHashCode);
    }
}
