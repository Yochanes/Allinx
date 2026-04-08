package androidx.constraintlayout.compose;

import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import io.intercom.android.sdk.models.carousel.BlockAlignment;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/constraintlayout/compose/AnchorFunctions;", "", "constraintlayout-compose_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class AnchorFunctions {
    /* JADX INFO: renamed from: a */
    public static String m6746a(int i) {
        if (i == -2) {
            return OpsMetricTracker.START;
        }
        if (i == -1) {
            return "end";
        }
        if (i == 0) {
            return BlockAlignment.LEFT;
        }
        if (i == 1) {
            return BlockAlignment.RIGHT;
        }
        Log.e("CCL", "verticalAnchorIndexToAnchorName: Unknown vertical index");
        return OpsMetricTracker.START;
    }
}
