package com.exchange.allin;

import androidx.compose.runtime.internal.StabilityInferred;
import com.engagelab.privates.core.api.MTCorePrivatesApi;
import com.engagelab.privates.push.api.MTPushPrivatesApi;
import com.exchange.allin.config.AppConfig;
import com.exchange.allin.p021db.AppDatabase;
import com.exchange.allin.p022di.ProviderKt;
import com.exchange.allin.utils.AutoSizer$fixInvalidOnSplit$1;
import com.google.android.gms.common.internal.ImagesContract;
import com.mvi.base.BaseApp;
import com.yariksoffice.lingver.Lingver;
import io.intercom.android.sdk.Intercom;
import java.lang.ref.WeakReference;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import me.jessyan.autosize.AutoSizeConfig;
import org.json.JSONException;
import org.koin.android.ext.koin.KoinExtKt;
import org.koin.android.logger.AndroidLogger;
import org.koin.core.Koin;
import org.koin.core.KoinApplication;
import org.koin.core.context.GlobalContext;
import org.koin.core.error.KoinAppAlreadyStartedException;
import org.koin.core.logger.Level;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m18302d2 = {"Lcom/exchange/allin/App;", "Lcom/mvi/base/BaseApp;", "<init>", "()V", "Companion", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class App extends BaseApp {

    /* JADX INFO: renamed from: a */
    public static final Companion f35180a = new Companion();

    /* JADX INFO: renamed from: b */
    public static final ReadWriteProperty f35181b = Delegates.m18642a();

    /* JADX INFO: renamed from: c */
    public static WeakReference f35182c;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/App$Companion;", "", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ KProperty[] f35183a = {Reflection.f51660a.mo18615e(new MutablePropertyReference1Impl(Companion.class, "app", "getApp()Lcom/exchange/allin/App;", 0))};

        /* JADX INFO: renamed from: a */
        public final App m13197a() {
            return (App) App.f35181b.getValue(this, f35183a[0]);
        }
    }

    @Override // android.app.Application
    public final void onCreate() throws JSONException {
        super.onCreate();
        Companion companion = f35180a;
        companion.getClass();
        f35181b.setValue(companion, Companion.f35183a[0], this);
        AutoSizeConfig.getInstance().setOnAdaptListener(new AutoSizer$fixInvalidOnSplit$1());
        AppDatabase.f35320l.m13218a(this);
        MTCorePrivatesApi.configAppChannel(this, ImagesContract.LOCAL);
        MTCorePrivatesApi.configDebugMode(this, true);
        MTPushPrivatesApi.init(this);
        Locale locale = Lingver.f43487c;
        Lingver.Companion.m15437a(this, AppConfig.Pref.f35244a.m13205g());
        Intercom.INSTANCE.initialize(this, "android_sdk-19b0993ca3daed21caf9edf21ab747ecba09c140", "zoc03ukq");
        synchronized (GlobalContext.f58199a) {
            KoinApplication koinApplication = new KoinApplication();
            if (GlobalContext.f58200b != null) {
                throw new KoinAppAlreadyStartedException("A Koin Application has already been started");
            }
            GlobalContext.f58200b = koinApplication.f58197a;
            AndroidLogger androidLogger = new AndroidLogger(Level.f58225f);
            Koin koin = koinApplication.f58197a;
            koin.getClass();
            koin.f58196c = androidLogger;
            KoinExtKt.m21786a(koinApplication, companion.m13197a());
            koinApplication.m21799a(ProviderKt.f35345a);
            koinApplication.f58197a.m21797a();
        }
    }
}
