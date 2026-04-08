package androidx.compose.foundation.text;

import androidx.camera.core.impl.C0281g;
import androidx.camera.core.impl.Config;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.media3.common.FlagSet;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.work.DirectExecutor;
import androidx.work.RunnableC2271b;
import androidx.work.RunnableC2272c;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: androidx.compose.foundation.text.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0708a implements TextRangeScopeMeasurePolicy, ListenerSet.Event, ListenerSet.IterationFinishedEvent, CallbackToFutureAdapter.Resolver, Predicate, Config.OptionMatcher, SynchronizationGuard.CriticalSection {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8767a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f8768b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f8769c;

    public /* synthetic */ C0708a(int i, Object obj, Object obj2) {
        this.f8767a = i;
        this.f8768b = obj;
        this.f8769c = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    /* JADX INFO: renamed from: d */
    public Object mo188d(CallbackToFutureAdapter.Completer completer) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        completer.m6741a(new RunnableC2271b(atomicBoolean, 1), DirectExecutor.f32569a);
        ((Executor) this.f8768b).execute(new RunnableC2272c(atomicBoolean, completer, (Lambda) this.f8769c, 1));
        return Unit.f51459a;
    }

    @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
    /* JADX INFO: renamed from: e */
    public void mo41e(Object obj, FlagSet flagSet) {
        ((AnalyticsListener) obj).mo10083H((Player) this.f8769c, new AnalyticsListener.Events(flagSet, ((DefaultAnalyticsCollector) this.f8768b).f26379f));
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object execute() {
        switch (this.f8767a) {
            case 14:
                return Uploader.m14428e((Uploader) this.f8768b, (Iterable) this.f8769c);
            default:
                return Uploader.m14431h((Uploader) this.f8768b, (HashMap) this.f8769c);
        }
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        switch (this.f8767a) {
            case 1:
                analyticsListener.mo10081F((AnalyticsListener.EventTime) this.f8768b, (Exception) this.f8769c);
                break;
            case 2:
                analyticsListener.mo10096d((AnalyticsListener.EventTime) this.f8768b, (PlaybackParameters) this.f8769c);
                break;
            case 3:
                analyticsListener.mo10076A((AnalyticsListener.EventTime) this.f8768b, (Tracks) this.f8769c);
                break;
            case 4:
                analyticsListener.mo10082G((AnalyticsListener.EventTime) this.f8768b, (MediaLoadData) this.f8769c);
                break;
            case 5:
            default:
                analyticsListener.mo10094b((AnalyticsListener.EventTime) this.f8768b, this.f8769c);
                break;
            case 6:
                analyticsListener.mo10112t((AnalyticsListener.EventTime) this.f8768b, (DecoderCounters) this.f8769c);
                break;
            case 7:
                analyticsListener.mo10104l((AnalyticsListener.EventTime) this.f8768b, (Metadata) this.f8769c);
                break;
            case 8:
                analyticsListener.mo10106n((AnalyticsListener.EventTime) this.f8768b, (PlaybackException) this.f8769c);
                break;
            case 9:
                AnalyticsListener.EventTime eventTime = (AnalyticsListener.EventTime) this.f8768b;
                VideoSize videoSize = (VideoSize) this.f8769c;
                analyticsListener.mo10079D(eventTime, videoSize);
                int i = videoSize.f25426a;
                break;
        }
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        return ((C0281g) this.f8768b).compare(obj, this.f8769c) >= 0;
    }

    public /* synthetic */ C0708a(AnalyticsListener.EventTime eventTime, Object obj, long j) {
        this.f8767a = 10;
        this.f8768b = eventTime;
        this.f8769c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C0708a(Executor executor, Function0 function0) {
        this.f8767a = 11;
        this.f8768b = executor;
        this.f8769c = (Lambda) function0;
    }
}
