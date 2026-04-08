package com.yariksoffice.lingver;

import android.content.Context;
import com.exchange.allin.App;
import com.yariksoffice.lingver.store.PreferenceLocaleStore;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lcom/yariksoffice/lingver/Lingver;", "", "Companion", "com.yariksoffice.lingver.library"}, m18303k = 1, m18304mv = {1, 4, 0})
public final class Lingver {

    /* JADX INFO: renamed from: c */
    public static final Locale f43487c;

    /* JADX INFO: renamed from: d */
    public static Lingver f43488d;

    /* JADX INFO: renamed from: a */
    public Locale f43489a = f43487c;

    /* JADX INFO: renamed from: b */
    public final PreferenceLocaleStore f43490b;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m18302d2 = {"Lcom/yariksoffice/lingver/Lingver$Companion;", "", "Ljava/util/Locale;", "defaultLocale", "Ljava/util/Locale;", "Lcom/yariksoffice/lingver/Lingver;", "instance", "Lcom/yariksoffice/lingver/Lingver;", "com.yariksoffice.lingver.library"}, m18303k = 1, m18304mv = {1, 4, 0})
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static void m15437a(App app, String defaultLanguage) throws JSONException {
            Intrinsics.m18600h(defaultLanguage, "defaultLanguage");
            PreferenceLocaleStore preferenceLocaleStore = new PreferenceLocaleStore(app, new Locale(defaultLanguage));
            if (Lingver.f43488d != null) {
                throw new IllegalStateException("Already initialized");
            }
            Lingver lingver = new Lingver(preferenceLocaleStore, new UpdateLocaleDelegate());
            app.registerActivityLifecycleCallbacks(new LingverActivityLifecycleCallbacks(new Lingver$initialize$1(lingver)));
            app.registerComponentCallbacks(new LingverApplicationCallbacks(new Lingver$initialize$2(lingver, app)));
            Locale locale = preferenceLocaleStore.m15440b() ? lingver.f43489a : preferenceLocaleStore.m15439a();
            Intrinsics.m18600h(locale, "locale");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("language", locale.getLanguage());
            jSONObject.put("country", locale.getCountry());
            jSONObject.put("variant", locale.getVariant());
            preferenceLocaleStore.f43496a.edit().putString("language_key", jSONObject.toString()).apply();
            UpdateLocaleDelegate.m15438a(app, locale);
            Context appContext = app.getApplicationContext();
            if (appContext != app) {
                Intrinsics.m18595c(appContext, "appContext");
                UpdateLocaleDelegate.m15438a(appContext, locale);
            }
            Lingver.f43488d = lingver;
        }
    }

    static {
        Locale locale = Locale.getDefault();
        Intrinsics.m18595c(locale, "Locale.getDefault()");
        f43487c = locale;
    }

    public Lingver(PreferenceLocaleStore preferenceLocaleStore, UpdateLocaleDelegate updateLocaleDelegate) {
        this.f43490b = preferenceLocaleStore;
    }
}
