package androidx.privacysandbox.ads.adservices.customaudience;

import android.adservices.customaudience.JoinCustomAudienceRequest;
import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.MeasurementManager;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.app.UiModeManager;
import android.app.UiModeManager$ContrastChangeListener;
import android.app.job.JobScheduler;
import android.net.Uri;
import android.p012os.OutcomeReceiver;
import android.view.InputEvent;
import androidx.arch.core.executor.ExecutorC0154a;
import java.util.List;

/* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.customaudience.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2096a {
    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m11434A() {
    }

    /* JADX INFO: renamed from: B */
    public static /* bridge */ /* synthetic */ DeletionRequest.Builder m11435B(DeletionRequest.Builder builder) {
        return builder.setDomainUris(null);
    }

    /* JADX INFO: renamed from: C */
    public static /* bridge */ /* synthetic */ DeletionRequest.Builder m11436C(DeletionRequest.Builder builder) {
        return builder.setOriginUris(null);
    }

    /* JADX INFO: renamed from: D */
    public static /* bridge */ /* synthetic */ DeletionRequest.Builder m11437D(DeletionRequest.Builder builder) {
        return builder.setDeletionMode(0);
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ float m11438a(UiModeManager uiModeManager) {
        return uiModeManager.getContrast();
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ int m11439b(Topic topic) {
        return topic.getTopicId();
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ long m11440c(Topic topic) {
        return topic.getTaxonomyVersion();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ DeletionRequest.Builder m11441d() {
        return new DeletionRequest.Builder();
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ DeletionRequest.Builder m11442e(DeletionRequest.Builder builder) {
        return builder.setMatchBehavior(0);
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ DeletionRequest m11443f(DeletionRequest.Builder builder) {
        return builder.build();
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ MeasurementManager m11444g(Object obj) {
        return (MeasurementManager) obj;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ GetTopicsRequest.Builder m11445h() {
        return new GetTopicsRequest.Builder();
    }

    /* JADX INFO: renamed from: i */
    public static /* bridge */ /* synthetic */ GetTopicsRequest.Builder m11446i(GetTopicsRequest.Builder builder) {
        return builder.setAdsSdkName(null);
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ GetTopicsRequest m11447j(GetTopicsRequest.Builder builder) {
        return builder.build();
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ GetTopicsResponse m11448k(Object obj) {
        return (GetTopicsResponse) obj;
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ Topic m11449l(Object obj) {
        return (Topic) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ JobScheduler m11450m(JobScheduler jobScheduler) {
        return jobScheduler.forNamespace("androidx.work.systemjobscheduler");
    }

    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ Class m11451n() {
        return MeasurementManager.class;
    }

    /* JADX INFO: renamed from: o */
    public static /* bridge */ /* synthetic */ List m11452o(GetTopicsResponse getTopicsResponse) {
        return getTopicsResponse.getTopics();
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m11453p() {
        new JoinCustomAudienceRequest.Builder();
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ void m11454q(MeasurementManager measurementManager, DeletionRequest deletionRequest, ExecutorC0154a executorC0154a, OutcomeReceiver outcomeReceiver) {
        measurementManager.deleteRegistrations(deletionRequest, executorC0154a, outcomeReceiver);
    }

    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ void m11455r(MeasurementManager measurementManager, Uri uri, InputEvent inputEvent, ExecutorC0154a executorC0154a, OutcomeReceiver outcomeReceiver) {
        measurementManager.registerSource(uri, inputEvent, executorC0154a, outcomeReceiver);
    }

    /* JADX INFO: renamed from: s */
    public static /* bridge */ /* synthetic */ void m11456s(MeasurementManager measurementManager, Uri uri, ExecutorC0154a executorC0154a, OutcomeReceiver outcomeReceiver) {
        measurementManager.registerTrigger(uri, executorC0154a, outcomeReceiver);
    }

    /* JADX INFO: renamed from: t */
    public static /* bridge */ /* synthetic */ void m11457t(MeasurementManager measurementManager, ExecutorC0154a executorC0154a, OutcomeReceiver outcomeReceiver) {
        measurementManager.getMeasurementApiStatus(executorC0154a, outcomeReceiver);
    }

    /* JADX INFO: renamed from: u */
    public static /* bridge */ /* synthetic */ void m11458u(UiModeManager uiModeManager, UiModeManager$ContrastChangeListener uiModeManager$ContrastChangeListener) {
        uiModeManager.removeContrastChangeListener(uiModeManager$ContrastChangeListener);
    }

    /* JADX INFO: renamed from: v */
    public static /* bridge */ /* synthetic */ long m11459v(Topic topic) {
        return topic.getModelVersion();
    }

    /* JADX INFO: renamed from: w */
    public static /* bridge */ /* synthetic */ DeletionRequest.Builder m11460w(DeletionRequest.Builder builder) {
        return builder.setStart(null);
    }

    /* JADX INFO: renamed from: x */
    public static /* bridge */ /* synthetic */ GetTopicsRequest.Builder m11461x(GetTopicsRequest.Builder builder) {
        return builder.setShouldRecordObservation(false);
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m11462y() {
    }

    /* JADX INFO: renamed from: z */
    public static /* bridge */ /* synthetic */ DeletionRequest.Builder m11463z(DeletionRequest.Builder builder) {
        return builder.setEnd(null);
    }
}
