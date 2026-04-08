package androidx.compose.runtime;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"androidx/compose/runtime/SnapshotLongStateKt__SnapshotLongStateKt"}, m18303k = 4, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class SnapshotLongStateKt {
    /* JADX INFO: renamed from: a */
    public static final MutableLongState m4517a(long j) {
        return new ParcelableSnapshotMutableLongState(j);
    }
}
