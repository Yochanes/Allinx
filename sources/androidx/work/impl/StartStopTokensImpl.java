package androidx.work.impl;

import androidx.work.impl.model.WorkGenerationalId;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/work/impl/StartStopTokensImpl;", "Landroidx/work/impl/StartStopTokens;", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
final class StartStopTokensImpl implements StartStopTokens {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f32692a = new LinkedHashMap();

    @Override // androidx.work.impl.StartStopTokens
    /* JADX INFO: renamed from: b */
    public final StartStopToken mo12130b(WorkGenerationalId workGenerationalId) {
        LinkedHashMap linkedHashMap = this.f32692a;
        Object startStopToken = linkedHashMap.get(workGenerationalId);
        if (startStopToken == null) {
            startStopToken = new StartStopToken(workGenerationalId);
            linkedHashMap.put(workGenerationalId, startStopToken);
        }
        return (StartStopToken) startStopToken;
    }

    @Override // androidx.work.impl.StartStopTokens
    /* JADX INFO: renamed from: c */
    public final boolean mo12131c(WorkGenerationalId workGenerationalId) {
        return this.f32692a.containsKey(workGenerationalId);
    }

    @Override // androidx.work.impl.StartStopTokens
    /* JADX INFO: renamed from: d */
    public final StartStopToken mo12132d(WorkGenerationalId id) {
        Intrinsics.m18599g(id, "id");
        return (StartStopToken) this.f32692a.remove(id);
    }

    @Override // androidx.work.impl.StartStopTokens
    public final List remove(String workSpecId) {
        Intrinsics.m18599g(workSpecId, "workSpecId");
        LinkedHashMap linkedHashMap = this.f32692a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (Intrinsics.m18594b(((WorkGenerationalId) entry.getKey()).f33000a, workSpecId)) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap2.keySet().iterator();
        while (it.hasNext()) {
            linkedHashMap.remove((WorkGenerationalId) it.next());
        }
        return CollectionsKt.m18465x0(linkedHashMap2.values());
    }
}
