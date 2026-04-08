package kotlin.p044io.path;

import io.intercom.android.sdk.utilities.AbstractC5852a;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
final /* synthetic */ class PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$3 extends FunctionReferenceImpl implements Function2<Path, Exception, FileVisitResult> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Path p0 = AbstractC5852a.m16785s(obj);
        Exception p1 = (Exception) obj2;
        Intrinsics.m18599g(p0, "p0");
        Intrinsics.m18599g(p1, "p1");
        PathsKt__PathRecursiveFunctionsKt.m18570a(p0, p1);
        throw null;
    }
}
