package io.intercom.android.sdk.metrics;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.google.gson.Gson;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.metrics.ops.OpsMetricObject;
import io.intercom.android.sdk.persistence.JsonStorage;
import io.intercom.android.sdk.utilities.IoUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class MetricsStore {
    private static final String METRICS_DIR = "intercomMetrics";
    private static final String OPS_METRICS_DIR = "intercomOpsMetrics";
    private static final int STORED_METRIC_LIMIT = 200;
    private static final int STORED_OP_METRIC_LIMIT = 100;
    private final Provider<Api> apiProvider;
    private final Provider<AppConfig> appConfigProvider;
    private final JsonStorage.LoadFailureHandler deleteOnFailureHandler;
    private final Executor executor;
    private final String installerPackageName;
    private final boolean isDebugBuild;
    private final File metricsDir;
    private final File opsMetricsDir;
    private final JsonStorage storage;
    private final Twig twig;

    /* JADX INFO: renamed from: io.intercom.android.sdk.metrics.MetricsStore$1 */
    /* JADX INFO: compiled from: Proguard */
    public class RunnableC56191 implements Runnable {
        final /* synthetic */ MetricObject val$metric;

        public RunnableC56191(MetricObject metricObject) {
            this.val$metric = metricObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MetricsStore.access$000(MetricsStore.this)) {
                return;
            }
            JsonStorage jsonStorageAccess$200 = MetricsStore.access$200(MetricsStore.this);
            MetricObject metricObject = this.val$metric;
            jsonStorageAccess$200.saveToFileAsJson(metricObject, MetricsStore.access$100(MetricsStore.this, metricObject));
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.metrics.MetricsStore$2 */
    /* JADX INFO: compiled from: Proguard */
    public class RunnableC56202 implements Runnable {
        final /* synthetic */ OpsMetricObject val$opsMetric;

        public RunnableC56202(OpsMetricObject opsMetricObject) {
            this.val$opsMetric = opsMetricObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MetricsStore.access$300(MetricsStore.this)) {
                return;
            }
            JsonStorage jsonStorageAccess$200 = MetricsStore.access$200(MetricsStore.this);
            OpsMetricObject opsMetricObject = this.val$opsMetric;
            jsonStorageAccess$200.saveToFileAsJson(opsMetricObject, MetricsStore.access$400(MetricsStore.this, opsMetricObject));
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.metrics.MetricsStore$3 */
    /* JADX INFO: compiled from: Proguard */
    public class RunnableC56213 implements Runnable {
        public RunnableC56213() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            List<MetricObject> listLoadMetrics = MetricsStore.this.loadMetrics();
            List<OpsMetricObject> listLoadOpsMetrics = MetricsStore.this.loadOpsMetrics();
            if (listLoadMetrics.isEmpty() && listLoadOpsMetrics.isEmpty()) {
                return;
            }
            MetricsStore.access$500(MetricsStore.this, listLoadMetrics, listLoadOpsMetrics);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.metrics.MetricsStore$5 */
    /* JADX INFO: compiled from: Proguard */
    public class C56235 implements JsonStorage.LoadHandler<List<MetricObject>> {
        final /* synthetic */ List val$metrics;

        public C56235(List list) {
            this.val$metrics = list;
        }

        @Override // io.intercom.android.sdk.persistence.JsonStorage.LoadHandler
        public /* bridge */ /* synthetic */ void onLoad(List<MetricObject> list) {
            onLoad2(list);
        }

        /* JADX INFO: renamed from: onLoad, reason: avoid collision after fix types in other method */
        public void onLoad2(List<MetricObject> list) {
            MetricsStore.access$700(list, this.val$metrics);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.metrics.MetricsStore$6 */
    /* JADX INFO: compiled from: Proguard */
    public class C56246 implements JsonStorage.LoadHandler<List<OpsMetricObject>> {
        final /* synthetic */ List val$opsMetrics;

        public C56246(List list) {
            this.val$opsMetrics = list;
        }

        @Override // io.intercom.android.sdk.persistence.JsonStorage.LoadHandler
        public /* bridge */ /* synthetic */ void onLoad(List<OpsMetricObject> list) {
            onLoad2(list);
        }

        /* JADX INFO: renamed from: onLoad, reason: avoid collision after fix types in other method */
        public void onLoad2(List<OpsMetricObject> list) {
            MetricsStore.access$700(list, this.val$opsMetrics);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.metrics.MetricsStore$7 */
    /* JADX INFO: compiled from: Proguard */
    public class C56257 implements JsonStorage.LoadFailureHandler {
        public C56257() {
        }

        @Override // io.intercom.android.sdk.persistence.JsonStorage.LoadFailureHandler
        public void onLoadFailed(File file, Exception exc) {
            IoUtils.safelyDelete(file);
            MetricsStore.access$800(MetricsStore.this).m15313v(exc, "Couldn't load file " + file.getAbsolutePath(), new Object[0]);
        }
    }

    public MetricsStore(Context context, Provider<Api> provider, Provider<AppConfig> provider2) {
        this(provider, provider2, Executors.newSingleThreadExecutor(), new JsonStorage(new Gson()), new File(context.getCacheDir(), METRICS_DIR), new File(context.getCacheDir(), OPS_METRICS_DIR), AppTypeDetector.isDebugBuild(context), AppTypeDetector.getInstallerPackageName(context), LumberMill.getLogger());
    }

    public static /* synthetic */ boolean access$000(MetricsStore metricsStore) {
        return metricsStore.hasReachedMetricStorageLimit();
    }

    public static /* synthetic */ File access$100(MetricsStore metricsStore, MetricObject metricObject) {
        return metricsStore.getFile(metricObject);
    }

    public static /* synthetic */ JsonStorage access$200(MetricsStore metricsStore) {
        return metricsStore.storage;
    }

    public static /* synthetic */ boolean access$300(MetricsStore metricsStore) {
        return metricsStore.hasReachedOpsMetricStorageLimit();
    }

    public static /* synthetic */ File access$400(MetricsStore metricsStore, OpsMetricObject opsMetricObject) {
        return metricsStore.getFile(opsMetricObject);
    }

    public static /* synthetic */ void access$500(MetricsStore metricsStore, List list, List list2) {
        metricsStore.uploadMetrics(list, list2);
    }

    public static /* synthetic */ Executor access$600(MetricsStore metricsStore) {
        return metricsStore.executor;
    }

    public static /* synthetic */ void access$700(List list, List list2) {
        copyNonNullItems(list, list2);
    }

    public static /* synthetic */ Twig access$800(MetricsStore metricsStore) {
        return metricsStore.twig;
    }

    private static <T> void copyNonNullItems(List<T> list, List<T> list2) {
        for (T t : list) {
            if (t != null) {
                list2.add(t);
            }
        }
    }

    private File getFile(MetricObject metricObject) {
        return new File(this.metricsDir, metricObject.getId() + ".json");
    }

    private boolean hasReachedMetricStorageLimit() {
        return this.storage.getDirectoryFileCount(this.metricsDir) > STORED_METRIC_LIMIT;
    }

    private boolean hasReachedOpsMetricStorageLimit() {
        return this.storage.getDirectoryFileCount(this.opsMetricsDir) > 100;
    }

    private boolean isDisabled() {
        return !this.appConfigProvider.get().isMetricsEnabled();
    }

    private void uploadMetrics(List<MetricObject> list, List<OpsMetricObject> list2) {
        this.apiProvider.get().sendMetrics(list, list2, new C56224(list, list2));
    }

    @VisibleForTesting
    public void deleteFilesFor(List<MetricObject> list, List<OpsMetricObject> list2) {
        Iterator<MetricObject> it = list.iterator();
        while (it.hasNext()) {
            IoUtils.safelyDelete(getFile(it.next()));
        }
        Iterator<OpsMetricObject> it2 = list2.iterator();
        while (it2.hasNext()) {
            IoUtils.safelyDelete(getFile(it2.next()));
        }
    }

    public void loadAndSendMetrics() {
        this.executor.execute(new RunnableC56213());
    }

    @VisibleForTesting
    public List<MetricObject> loadMetrics() throws Throwable {
        ArrayList arrayList = new ArrayList();
        this.storage.loadFilesInDirectory(this.metricsDir, MetricObject.class, new C56235(arrayList), this.deleteOnFailureHandler);
        return arrayList;
    }

    @VisibleForTesting
    public List<OpsMetricObject> loadOpsMetrics() throws Throwable {
        ArrayList arrayList = new ArrayList();
        this.storage.loadFilesInDirectory(this.opsMetricsDir, OpsMetricObject.class, new C56246(arrayList), this.deleteOnFailureHandler);
        return arrayList;
    }

    public void track(MetricObject metricObject) {
        if (isDisabled()) {
            return;
        }
        metricObject.addInstallerPackageName(this.installerPackageName).addIsDebugBuild(this.isDebugBuild);
        this.executor.execute(new RunnableC56191(metricObject));
    }

    private File getFile(OpsMetricObject opsMetricObject) {
        return new File(this.opsMetricsDir, opsMetricObject.getId() + ".json");
    }

    public void track(OpsMetricObject opsMetricObject) {
        if (isDisabled()) {
            return;
        }
        this.executor.execute(new RunnableC56202(opsMetricObject));
    }

    @VisibleForTesting
    public MetricsStore(Provider<Api> provider, Provider<AppConfig> provider2, Executor executor, JsonStorage jsonStorage, File file, File file2, boolean z2, String str, Twig twig) {
        this.deleteOnFailureHandler = new C56257();
        this.apiProvider = provider;
        this.appConfigProvider = provider2;
        this.executor = executor;
        this.storage = jsonStorage;
        this.metricsDir = file;
        this.opsMetricsDir = file2;
        this.isDebugBuild = z2;
        this.installerPackageName = str;
        this.twig = twig;
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.metrics.MetricsStore$4 */
    /* JADX INFO: compiled from: Proguard */
    public class C56224 implements Callback<Void> {
        final /* synthetic */ List val$metrics;
        final /* synthetic */ List val$opsMetrics;

        /* JADX INFO: renamed from: io.intercom.android.sdk.metrics.MetricsStore$4$1, reason: invalid class name */
        /* JADX INFO: compiled from: Proguard */
        public class AnonymousClass1 implements Runnable {
            public AnonymousClass1() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C56224 c56224 = C56224.this;
                MetricsStore.this.deleteFilesFor(c56224.val$metrics, c56224.val$opsMetrics);
            }
        }

        public C56224(List list, List list2) {
            this.val$metrics = list;
            this.val$opsMetrics = list2;
        }

        @Override // retrofit2.Callback
        public void onResponse(Call<Void> call, Response<Void> response) {
            if (response.f59450a.m21308d() || response.f59450a.f57232d == 400) {
                MetricsStore.access$600(MetricsStore.this).execute(new AnonymousClass1());
            }
        }

        @Override // retrofit2.Callback
        public void onFailure(Call<Void> call, Throwable th) {
        }
    }
}
