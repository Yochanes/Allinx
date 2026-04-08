package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0001\nJ'\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, m18302d2 = {"Landroidx/activity/result/contract/ActivityResultContract;", "I", "O", "", "Landroid/content/Context;", "context", MetricTracker.Object.INPUT, "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "getSynchronousResult", "(Landroid/content/Context;Ljava/lang/Object;)Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "SynchronousResult", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public abstract class ActivityResultContract<I, O> {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "T", "", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class SynchronousResult<T> {

        /* JADX INFO: renamed from: a */
        public final Serializable f247a;

        public SynchronousResult(Serializable serializable) {
            this.f247a = serializable;
        }
    }

    public abstract Intent createIntent(Context context, Object obj);

    @Nullable
    public SynchronousResult<O> getSynchronousResult(@NotNull Context context, I input) {
        Intrinsics.m18599g(context, "context");
        return null;
    }

    public abstract Object parseResult(int i, Intent intent);
}
