package androidx.work.impl;

import androidx.work.impl.model.WorkGenerationalId;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/work/impl/SynchronizedStartStopTokensImpl;", "Landroidx/work/impl/StartStopTokens;", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
final class SynchronizedStartStopTokensImpl implements StartStopTokens {

    /* JADX INFO: renamed from: a */
    public final StartStopTokens f32693a;

    /* JADX INFO: renamed from: b */
    public final Object f32694b = new Object();

    public SynchronizedStartStopTokensImpl(StartStopTokens startStopTokens) {
        this.f32693a = startStopTokens;
    }

    @Override // androidx.work.impl.StartStopTokens
    /* JADX INFO: renamed from: b */
    public final StartStopToken mo12130b(WorkGenerationalId workGenerationalId) {
        StartStopToken startStopTokenMo12130b;
        synchronized (this.f32694b) {
            startStopTokenMo12130b = ((StartStopTokensImpl) this.f32693a).mo12130b(workGenerationalId);
        }
        return startStopTokenMo12130b;
    }

    @Override // androidx.work.impl.StartStopTokens
    /* JADX INFO: renamed from: c */
    public final boolean mo12131c(WorkGenerationalId workGenerationalId) {
        boolean zContainsKey;
        synchronized (this.f32694b) {
            zContainsKey = ((StartStopTokensImpl) this.f32693a).f32692a.containsKey(workGenerationalId);
        }
        return zContainsKey;
    }

    @Override // androidx.work.impl.StartStopTokens
    /* JADX INFO: renamed from: d */
    public final StartStopToken mo12132d(WorkGenerationalId id) {
        StartStopToken startStopTokenMo12132d;
        Intrinsics.m18599g(id, "id");
        synchronized (this.f32694b) {
            startStopTokenMo12132d = ((StartStopTokensImpl) this.f32693a).mo12132d(id);
        }
        return startStopTokenMo12132d;
    }

    @Override // androidx.work.impl.StartStopTokens
    public final List remove(String workSpecId) {
        List listRemove;
        Intrinsics.m18599g(workSpecId, "workSpecId");
        synchronized (this.f32694b) {
            listRemove = ((StartStopTokensImpl) this.f32693a).remove(workSpecId);
        }
        return listRemove;
    }
}
