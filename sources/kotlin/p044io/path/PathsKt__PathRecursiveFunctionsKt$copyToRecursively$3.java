package kotlin.p044io.path;

import io.intercom.android.sdk.utilities.AbstractC5852a;
import java.nio.file.Path;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
final class PathsKt__PathRecursiveFunctionsKt$copyToRecursively$3 implements Function3 {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Exception {
        Path pathM16785s = AbstractC5852a.m16785s(obj);
        Path pathM16785s2 = AbstractC5852a.m16785s(obj2);
        Exception exception = (Exception) obj3;
        Intrinsics.m18599g(pathM16785s, "<unused var>");
        Intrinsics.m18599g(pathM16785s2, "<unused var>");
        Intrinsics.m18599g(exception, "exception");
        throw exception;
    }
}
