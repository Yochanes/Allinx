package androidx.work.impl;

import androidx.annotation.RestrictTo;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/work/impl/WorkerStoppedException;", "Ljava/util/concurrent/CancellationException;", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@RestrictTo
public final class WorkerStoppedException extends CancellationException {

    /* JADX INFO: renamed from: a */
    public final int f32740a;

    public WorkerStoppedException(int i) {
        this.f32740a = i;
    }
}
