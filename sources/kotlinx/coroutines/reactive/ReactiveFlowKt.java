package kotlinx.coroutines.reactive;

import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"kotlinx-coroutines-reactive"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class ReactiveFlowKt {

    /* JADX INFO: renamed from: a */
    public static final ContextInjector[] f56435a = (ContextInjector[]) SequencesKt.m20376r(SequencesKt.m20360b(ServiceLoader.load(ContextInjector.class, ContextInjector.class.getClassLoader()).iterator())).toArray(new ContextInjector[0]);
}
