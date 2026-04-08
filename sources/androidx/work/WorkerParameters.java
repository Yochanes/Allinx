package androidx.work;

import android.net.Network;
import androidx.annotation.RestrictTo;
import androidx.work.impl.utils.WorkForegroundUpdater;
import androidx.work.impl.utils.WorkProgressUpdater;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class WorkerParameters {

    /* JADX INFO: renamed from: a */
    public UUID f32635a;

    /* JADX INFO: renamed from: b */
    public Data f32636b;

    /* JADX INFO: renamed from: c */
    public HashSet f32637c;

    /* JADX INFO: renamed from: d */
    public RuntimeExtras f32638d;

    /* JADX INFO: renamed from: e */
    public int f32639e;

    /* JADX INFO: renamed from: f */
    public ExecutorService f32640f;

    /* JADX INFO: renamed from: g */
    public CoroutineDispatcher f32641g;

    /* JADX INFO: renamed from: h */
    public WorkManagerTaskExecutor f32642h;

    /* JADX INFO: renamed from: i */
    public DefaultWorkerFactory f32643i;

    /* JADX INFO: renamed from: j */
    public WorkProgressUpdater f32644j;

    /* JADX INFO: renamed from: k */
    public WorkForegroundUpdater f32645k;

    /* JADX INFO: compiled from: Proguard */
    @RestrictTo
    public static class RuntimeExtras {

        /* JADX INFO: renamed from: a */
        public List f32646a;

        /* JADX INFO: renamed from: b */
        public List f32647b;

        /* JADX INFO: renamed from: c */
        public Network f32648c;

        public RuntimeExtras() {
            List list = Collections.EMPTY_LIST;
            this.f32646a = list;
            this.f32647b = list;
        }
    }
}
