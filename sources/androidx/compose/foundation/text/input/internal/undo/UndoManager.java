package androidx.compose.foundation.text.input.internal.undo;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/foundation/text/input/internal/undo/UndoManager;", "T", "", "Companion", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class UndoManager<T> {

    /* JADX INFO: renamed from: a */
    public final int f9416a;

    /* JADX INFO: renamed from: b */
    public final SnapshotStateList f9417b;

    /* JADX INFO: renamed from: c */
    public final SnapshotStateList f9418c;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/text/input/internal/undo/UndoManager$Companion;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public UndoManager(int i, List list, List list2) {
        this.f9416a = i;
        SnapshotStateList snapshotStateList = new SnapshotStateList();
        snapshotStateList.addAll(list);
        this.f9417b = snapshotStateList;
        SnapshotStateList snapshotStateList2 = new SnapshotStateList();
        snapshotStateList2.addAll(list2);
        this.f9418c = snapshotStateList2;
        if (i < 0) {
            InlineClassHelperKt.m2705a("Capacity must be a positive integer");
        }
        if (this.f9418c.size() + this.f9417b.size() <= i) {
            return;
        }
        InlineClassHelperKt.m2705a("Initial list of undo and redo operations have a size greater than the given capacity.");
    }
}
