package io.ktor.http.content;

import io.ktor.utils.p043io.jvm.javaio.PollersKt;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, m18302d2 = {"<anonymous>", "Ljava/lang/reflect/Method;", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
public final class BlockingBridgeKt$isParkingAllowedFunction$2 extends Lambda implements Function0<Method> {

    /* JADX INFO: renamed from: a */
    public static final BlockingBridgeKt$isParkingAllowedFunction$2 f45918a = new BlockingBridgeKt$isParkingAllowedFunction$2(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        try {
            ThreadLocal threadLocal = PollersKt.f47485a;
            return PollersKt.class.getMethod("isParkingAllowed", new Class[0]);
        } catch (Throwable unused) {
            return null;
        }
    }
}
