package androidx.core.app;

import android.view.FrameMetrics;
import android.view.Window;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class FrameMetricsAggregator {

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class FrameMetricsApi24Impl extends FrameMetricsBaseImpl {

        /* JADX INFO: renamed from: androidx.core.app.FrameMetricsAggregator$FrameMetricsApi24Impl$1 */
        /* JADX INFO: compiled from: Proguard */
        public class WindowOnFrameMetricsAvailableListenerC14231 implements Window.OnFrameMetricsAvailableListener {
            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                throw null;
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class FrameMetricsBaseImpl {
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface MetricType {
    }
}
