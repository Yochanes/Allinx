package kotlin.p044io;

import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
final class FilesKt__UtilsKt$copyRecursively$1 implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws IOException {
        IOException exception = (IOException) obj2;
        Intrinsics.m18599g((File) obj, "<unused var>");
        Intrinsics.m18599g(exception, "exception");
        throw exception;
    }
}
