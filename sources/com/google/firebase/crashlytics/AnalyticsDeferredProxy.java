package com.google.firebase.crashlytics;

import android.os.Bundle;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.annotations.DeferredApi;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.analytics.BlockingAnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.analytics.BreadcrumbAnalyticsEventReceiver;
import com.google.firebase.crashlytics.internal.analytics.CrashlyticsOriginAnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.analytics.UnavailableAnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import com.google.firebase.crashlytics.internal.breadcrumbs.DisabledBreadcrumbSource;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.google.firebase.messaging.ServiceStarter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public class AnalyticsDeferredProxy {
    private final Deferred<AnalyticsConnector> analyticsConnectorDeferred;
    private volatile AnalyticsEventLogger analyticsEventLogger;

    @GuardedBy
    private final List<BreadcrumbHandler> breadcrumbHandlerList;
    private volatile BreadcrumbSource breadcrumbSource;

    public AnalyticsDeferredProxy(Deferred<AnalyticsConnector> deferred) {
        this(deferred, new DisabledBreadcrumbSource(), new UnavailableAnalyticsEventLogger());
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m15149a(AnalyticsDeferredProxy analyticsDeferredProxy, Provider provider) {
        analyticsDeferredProxy.lambda$init$2(provider);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m15150b(AnalyticsDeferredProxy analyticsDeferredProxy, String str, Bundle bundle) {
        analyticsDeferredProxy.lambda$getAnalyticsEventLogger$1(str, bundle);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m15151c(AnalyticsDeferredProxy analyticsDeferredProxy, BreadcrumbHandler breadcrumbHandler) {
        analyticsDeferredProxy.lambda$getDeferredBreadcrumbSource$0(breadcrumbHandler);
    }

    private void init() {
        this.analyticsConnectorDeferred.whenAvailable(new C4629a(this));
    }

    private /* synthetic */ void lambda$getAnalyticsEventLogger$1(String str, Bundle bundle) {
        this.analyticsEventLogger.logEvent(str, bundle);
    }

    private /* synthetic */ void lambda$getDeferredBreadcrumbSource$0(BreadcrumbHandler breadcrumbHandler) {
        synchronized (this) {
            try {
                if (this.breadcrumbSource instanceof DisabledBreadcrumbSource) {
                    this.breadcrumbHandlerList.add(breadcrumbHandler);
                }
                this.breadcrumbSource.registerBreadcrumbHandler(breadcrumbHandler);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private /* synthetic */ void lambda$init$2(Provider provider) {
        Logger.getLogger().m15161d("AnalyticsConnector now available.");
        AnalyticsConnector analyticsConnector = (AnalyticsConnector) provider.get();
        CrashlyticsOriginAnalyticsEventLogger crashlyticsOriginAnalyticsEventLogger = new CrashlyticsOriginAnalyticsEventLogger(analyticsConnector);
        CrashlyticsAnalyticsListener crashlyticsAnalyticsListener = new CrashlyticsAnalyticsListener();
        if (subscribeToAnalyticsEvents(analyticsConnector, crashlyticsAnalyticsListener) == null) {
            Logger.getLogger().m15169w("Could not register Firebase Analytics listener; a listener is already registered.");
            return;
        }
        Logger.getLogger().m15161d("Registered Firebase Analytics listener.");
        BreadcrumbAnalyticsEventReceiver breadcrumbAnalyticsEventReceiver = new BreadcrumbAnalyticsEventReceiver();
        BlockingAnalyticsEventLogger blockingAnalyticsEventLogger = new BlockingAnalyticsEventLogger(crashlyticsOriginAnalyticsEventLogger, ServiceStarter.ERROR_UNKNOWN, TimeUnit.MILLISECONDS);
        synchronized (this) {
            try {
                Iterator<BreadcrumbHandler> it = this.breadcrumbHandlerList.iterator();
                while (it.hasNext()) {
                    breadcrumbAnalyticsEventReceiver.registerBreadcrumbHandler(it.next());
                }
                crashlyticsAnalyticsListener.setBreadcrumbEventReceiver(breadcrumbAnalyticsEventReceiver);
                crashlyticsAnalyticsListener.setCrashlyticsOriginEventReceiver(blockingAnalyticsEventLogger);
                this.breadcrumbSource = breadcrumbAnalyticsEventReceiver;
                this.analyticsEventLogger = blockingAnalyticsEventLogger;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @DeferredApi
    private static AnalyticsConnector.AnalyticsConnectorHandle subscribeToAnalyticsEvents(@NonNull AnalyticsConnector analyticsConnector, @NonNull CrashlyticsAnalyticsListener crashlyticsAnalyticsListener) {
        AnalyticsConnector.AnalyticsConnectorHandle analyticsConnectorHandleRegisterAnalyticsConnectorListener = analyticsConnector.registerAnalyticsConnectorListener("clx", crashlyticsAnalyticsListener);
        if (analyticsConnectorHandleRegisterAnalyticsConnectorListener != null) {
            return analyticsConnectorHandleRegisterAnalyticsConnectorListener;
        }
        Logger.getLogger().m15161d("Could not register AnalyticsConnectorListener with Crashlytics origin.");
        AnalyticsConnector.AnalyticsConnectorHandle analyticsConnectorHandleRegisterAnalyticsConnectorListener2 = analyticsConnector.registerAnalyticsConnectorListener(AppMeasurement.CRASH_ORIGIN, crashlyticsAnalyticsListener);
        if (analyticsConnectorHandleRegisterAnalyticsConnectorListener2 != null) {
            Logger.getLogger().m15169w("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
        }
        return analyticsConnectorHandleRegisterAnalyticsConnectorListener2;
    }

    public AnalyticsEventLogger getAnalyticsEventLogger() {
        return new C4629a(this);
    }

    public BreadcrumbSource getDeferredBreadcrumbSource() {
        return new C4629a(this);
    }

    public AnalyticsDeferredProxy(Deferred<AnalyticsConnector> deferred, @NonNull BreadcrumbSource breadcrumbSource, @NonNull AnalyticsEventLogger analyticsEventLogger) {
        this.analyticsConnectorDeferred = deferred;
        this.breadcrumbSource = breadcrumbSource;
        this.breadcrumbHandlerList = new ArrayList();
        this.analyticsEventLogger = analyticsEventLogger;
        init();
    }
}
