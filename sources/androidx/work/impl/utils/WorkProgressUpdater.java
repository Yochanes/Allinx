package androidx.work.impl.utils;

import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.ProgressUpdater;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class WorkProgressUpdater implements ProgressUpdater {

    /* JADX INFO: renamed from: c */
    public static final String f33100c = Logger.m12101g("WorkProgressUpdater");

    /* JADX INFO: renamed from: a */
    public final WorkDatabase f33101a;

    /* JADX INFO: renamed from: b */
    public final WorkManagerTaskExecutor f33102b;

    public WorkProgressUpdater(WorkDatabase workDatabase, WorkManagerTaskExecutor workManagerTaskExecutor) {
        this.f33101a = workDatabase;
        this.f33102b = workManagerTaskExecutor;
    }
}
