package androidx.room;

import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.room.InvalidationTracker;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/room/RoomTrackingLiveData$observer$1", "Landroidx/room/InvalidationTracker$Observer;", "room-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class RoomTrackingLiveData$observer$1 extends InvalidationTracker.Observer {
    @Override // androidx.room.InvalidationTracker.Observer
    /* JADX INFO: renamed from: a */
    public final void mo11790a(Set tables) {
        Intrinsics.m18599g(tables, "tables");
        ArchTaskExecutor.m803a();
        throw null;
    }
}
