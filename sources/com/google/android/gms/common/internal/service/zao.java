package com.google.android.gms.common.internal.service;

import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.internal.TelemetryLoggingOptions;
import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zao extends GoogleApi<TelemetryLoggingOptions> implements TelemetryLoggingClient {
    public static final /* synthetic */ int zab = 0;
    private static final Api.ClientKey<zap> zac;
    private static final Api.AbstractClientBuilder<zap, TelemetryLoggingOptions> zad;
    private static final Api<TelemetryLoggingOptions> zae;

    static {
        Api.ClientKey<zap> clientKey = new Api.ClientKey<>();
        zac = clientKey;
        zan zanVar = new zan();
        zad = zanVar;
        zae = new Api<>("ClientTelemetry.API", zanVar, clientKey);
    }

    public zao(Context context, TelemetryLoggingOptions telemetryLoggingOptions) {
        super(context, zae, telemetryLoggingOptions, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.common.internal.TelemetryLoggingClient
    public final Task<Void> log(TelemetryData telemetryData) {
        TaskApiCall.Builder builder = TaskApiCall.builder();
        builder.setFeatures(com.google.android.gms.internal.base.zad.zaa);
        builder.setAutoResolveMissingFeatures(false);
        builder.run(new zam(telemetryData));
        return doBestEffortWrite(builder.build());
    }
}
