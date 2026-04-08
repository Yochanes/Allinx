package androidx.work;

import android.os.Trace;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/work/ConfigurationKt$createDefaultTracer$tracer$1", "Landroidx/work/Tracer;", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class ConfigurationKt$createDefaultTracer$tracer$1 implements Tracer {
    /* JADX INFO: renamed from: a */
    public final void m12088a(String label) {
        Intrinsics.m18599g(label, "label");
        Trace.beginSection(androidx.tracing.Trace.m11952e(label));
    }
}
