package androidx.room;

import androidx.room.InvalidationTracker;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/room/MultiInstanceInvalidationClient;", "", "room-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class MultiInstanceInvalidationClient {

    /* JADX INFO: renamed from: a */
    public IMultiInstanceInvalidationService f31925a;

    /* JADX INFO: renamed from: androidx.room.MultiInstanceInvalidationClient$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/room/MultiInstanceInvalidationClient$1", "Landroidx/room/InvalidationTracker$Observer;", "room-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @SourceDebugExtension
    public final class C21911 extends InvalidationTracker.Observer {
        @Override // androidx.room.InvalidationTracker.Observer
        /* JADX INFO: renamed from: a */
        public final void mo11790a(Set tables) {
            Intrinsics.m18599g(tables, "tables");
            throw null;
        }
    }
}
