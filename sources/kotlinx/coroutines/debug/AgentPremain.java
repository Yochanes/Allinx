package kotlinx.coroutines.debug;

import android.annotation.SuppressLint;
import java.lang.instrument.ClassFileTransformer;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlinx.coroutines.debug.internal.ConcurrentWeakMap;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/coroutines/debug/AgentPremain;", "", "DebugProbesTransformer", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SuppressLint({"all"})
@IgnoreJRERequirement
public final class AgentPremain {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/coroutines/debug/AgentPremain$DebugProbesTransformer;", "Ljava/lang/instrument/ClassFileTransformer;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class DebugProbesTransformer implements ClassFileTransformer {
    }

    static {
        Object objM18312a;
        try {
            String property = System.getProperty("kotlinx.coroutines.debug.enable.creation.stack.trace");
            objM18312a = property != null ? Boolean.valueOf(Boolean.parseBoolean(property)) : null;
        } catch (Throwable th) {
            objM18312a = ResultKt.m18312a(th);
        }
        if (((Boolean) (objM18312a instanceof Result.Failure ? null : objM18312a)) != null) {
            return;
        }
        ConcurrentWeakMap concurrentWeakMap = DebugProbesImpl.f55658a;
    }
}
