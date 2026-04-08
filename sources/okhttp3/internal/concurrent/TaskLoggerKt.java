package okhttp3.internal.concurrent;

import com.google.firebase.messaging.ServiceStarter;
import java.util.Arrays;
import kotlin.Metadata;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"okhttp"}, m18303k = 2, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class TaskLoggerKt {
    /* JADX INFO: renamed from: a */
    public static final void m21367a(Task task, TaskQueue taskQueue, String str) {
        TaskRunner.f57359h.getClass();
        TaskRunner.f57361j.fine(taskQueue.f57353b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + task.f57348a);
    }

    /* JADX INFO: renamed from: b */
    public static final String m21368b(long j) {
        String strM12i;
        if (j <= -999500000) {
            strM12i = AbstractC0000a.m12i((j - ((long) 500000000)) / ((long) 1000000000), " s ", new StringBuilder());
        } else if (j <= -999500) {
            strM12i = AbstractC0000a.m12i((j - ((long) 500000)) / ((long) 1000000), " ms", new StringBuilder());
        } else if (j <= 0) {
            strM12i = AbstractC0000a.m12i((j - ((long) ServiceStarter.ERROR_UNKNOWN)) / ((long) 1000), " µs", new StringBuilder());
        } else if (j < 999500) {
            strM12i = AbstractC0000a.m12i((j + ((long) ServiceStarter.ERROR_UNKNOWN)) / ((long) 1000), " µs", new StringBuilder());
        } else if (j < 999500000) {
            strM12i = AbstractC0000a.m12i((j + ((long) 500000)) / ((long) 1000000), " ms", new StringBuilder());
        } else {
            strM12i = AbstractC0000a.m12i((j + ((long) 500000000)) / ((long) 1000000000), " s ", new StringBuilder());
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{strM12i}, 1));
    }
}
