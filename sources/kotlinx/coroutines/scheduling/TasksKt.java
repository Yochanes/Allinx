package kotlinx.coroutines.scheduling;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlinx.coroutines.internal.SystemPropsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002*\f\b\u0000\u0010\u0001\"\u00020\u00002\u00020\u0000¨\u0006\u0002"}, m18302d2 = {"", "TaskContext", "kotlinx-coroutines-core"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class TasksKt {

    /* JADX INFO: renamed from: a */
    public static final String f56480a;

    /* JADX INFO: renamed from: b */
    public static final long f56481b;

    /* JADX INFO: renamed from: c */
    public static final int f56482c;

    /* JADX INFO: renamed from: d */
    public static final int f56483d;

    /* JADX INFO: renamed from: e */
    public static final long f56484e;

    /* JADX INFO: renamed from: f */
    public static final NanoTimeSource f56485f;

    static {
        String strM20855c = SystemPropsKt.m20855c("kotlinx.coroutines.scheduler.default.name");
        if (strM20855c == null) {
            strM20855c = "DefaultDispatcher";
        }
        f56480a = strM20855c;
        f56481b = SystemPropsKt.m20854b(100000L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.resolution.ns");
        int iM20853a = SystemPropsKt.m20853a();
        if (iM20853a < 2) {
            iM20853a = 2;
        }
        f56482c = SystemPropsKt.m20856d(iM20853a, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f56483d = SystemPropsKt.m20856d(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f56484e = TimeUnit.SECONDS.toNanos(SystemPropsKt.m20854b(60L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.keep.alive.sec"));
        f56485f = NanoTimeSource.f56475a;
    }
}
