package androidx.work;

import androidx.work.impl.DefaultRunnableScheduler;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/work/Configuration;", "", "Builder", "Companion", "Provider", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class Configuration {

    /* JADX INFO: renamed from: a */
    public final ExecutorService f32528a = ConfigurationKt.m12087a(false);

    /* JADX INFO: renamed from: b */
    public final DefaultScheduler f32529b = Dispatchers.f55294a;

    /* JADX INFO: renamed from: c */
    public final ExecutorService f32530c = ConfigurationKt.m12087a(true);

    /* JADX INFO: renamed from: d */
    public final SystemClock f32531d = new SystemClock();

    /* JADX INFO: renamed from: e */
    public final DefaultWorkerFactory f32532e = DefaultWorkerFactory.f32568a;

    /* JADX INFO: renamed from: f */
    public final NoOpInputMergerFactory f32533f = NoOpInputMergerFactory.f32593a;

    /* JADX INFO: renamed from: g */
    public final DefaultRunnableScheduler f32534g = new DefaultRunnableScheduler();

    /* JADX INFO: renamed from: h */
    public final int f32535h = 4;

    /* JADX INFO: renamed from: i */
    public final int f32536i = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: k */
    public final int f32538k = 20;

    /* JADX INFO: renamed from: j */
    public final int f32537j = 8;

    /* JADX INFO: renamed from: l */
    public final boolean f32539l = true;

    /* JADX INFO: renamed from: m */
    public final ConfigurationKt$createDefaultTracer$tracer$1 f32540m = new ConfigurationKt$createDefaultTracer$tracer$1();

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/work/Configuration$Builder;", "", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Builder {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/work/Configuration$Companion;", "", "", "MIN_SCHEDULER_LIMIT", "I", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m18302d2 = {"Landroidx/work/Configuration$Provider;", "", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public interface Provider {
        /* JADX INFO: renamed from: a */
        Configuration m12086a();
    }

    public Configuration(Builder builder) {
    }
}
