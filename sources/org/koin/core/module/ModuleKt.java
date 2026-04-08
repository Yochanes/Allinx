package org.koin.core.module;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"koin-core"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class ModuleKt {
    /* JADX INFO: renamed from: a */
    public static final void m21810a(List list, LinkedHashSet linkedHashSet) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Module module = (Module) it.next();
            linkedHashSet.add(module);
            m21810a(module.f58233e, linkedHashSet);
        }
    }
}
