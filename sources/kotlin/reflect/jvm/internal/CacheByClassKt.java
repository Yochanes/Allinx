package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"kotlin-reflection"}, m18303k = 2, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class CacheByClassKt {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f51746a = 0;

    static {
        Object objM18312a;
        try {
            objM18312a = Class.forName("java.lang.ClassValue");
        } catch (Throwable th) {
            objM18312a = ResultKt.m18312a(th);
        }
        if (!(objM18312a instanceof Result.Failure)) {
            objM18312a = Boolean.TRUE;
        }
        Object obj = Boolean.FALSE;
        if (objM18312a instanceof Result.Failure) {
            objM18312a = obj;
        }
    }
}
