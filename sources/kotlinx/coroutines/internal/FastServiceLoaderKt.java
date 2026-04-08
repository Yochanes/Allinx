package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"kotlinx-coroutines-core"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class FastServiceLoaderKt {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f56328a = 0;

    static {
        Object objM18312a;
        try {
            objM18312a = Class.forName("android.os.Build");
        } catch (Throwable th) {
            objM18312a = ResultKt.m18312a(th);
        }
        boolean z2 = objM18312a instanceof Result.Failure;
    }
}
