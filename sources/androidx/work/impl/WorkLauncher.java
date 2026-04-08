package androidx.work.impl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m18302d2 = {"Landroidx/work/impl/WorkLauncher;", "", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public interface WorkLauncher {
    /* JADX INFO: renamed from: a */
    void mo12144a(StartStopToken startStopToken, int i);

    /* JADX INFO: renamed from: b */
    default void m12145b(StartStopToken workSpecId) {
        Intrinsics.m18599g(workSpecId, "workSpecId");
        mo12144a(workSpecId, -512);
    }
}
