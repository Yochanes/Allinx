package kotlin;

import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"kotlin/ExceptionsKt__ExceptionsKt"}, m18303k = 4, m18304mv = {2, 1, 0}, m18306xi = 49)
public final class ExceptionsKt extends ExceptionsKt__ExceptionsKt {
    /* JADX INFO: renamed from: a */
    public static void m18297a(Throwable th, Throwable exception) {
        Intrinsics.m18599g(th, "<this>");
        Intrinsics.m18599g(exception, "exception");
        if (th != exception) {
            PlatformImplementationsKt.f51610a.mo18564a(th, exception);
        }
    }
}
