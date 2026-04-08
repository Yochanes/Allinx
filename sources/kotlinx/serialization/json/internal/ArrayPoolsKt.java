package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"kotlinx-serialization-json"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class ArrayPoolsKt {

    /* JADX INFO: renamed from: a */
    public static final int f56872a;

    static {
        Object objM18312a;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            Intrinsics.m18598f(property, "getProperty(...)");
            objM18312a = StringsKt.m20428Z(property);
        } catch (Throwable th) {
            objM18312a = ResultKt.m18312a(th);
        }
        if (objM18312a instanceof Result.Failure) {
            objM18312a = null;
        }
        Integer num = (Integer) objM18312a;
        f56872a = num != null ? num.intValue() : 2097152;
    }
}
