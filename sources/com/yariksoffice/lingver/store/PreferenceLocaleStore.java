package com.yariksoffice.lingver.store;

import android.app.Application;
import android.content.SharedPreferences;
import java.util.Locale;
import kotlin.KotlinNullPointerException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lcom/yariksoffice/lingver/store/PreferenceLocaleStore;", "Lcom/yariksoffice/lingver/store/LocaleStore;", "Companion", "com.yariksoffice.lingver.library"}, m18303k = 1, m18304mv = {1, 4, 0})
public final class PreferenceLocaleStore implements LocaleStore {

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f43496a;

    /* JADX INFO: renamed from: b */
    public final Locale f43497b;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\n"}, m18302d2 = {"Lcom/yariksoffice/lingver/store/PreferenceLocaleStore$Companion;", "", "", "COUNTRY_JSON_KEY", "Ljava/lang/String;", "DEFAULT_PREFERENCE_NAME", "FOLLOW_SYSTEM_LOCALE_KEY", "LANGUAGE_JSON_KEY", "LANGUAGE_KEY", "VARIANT_JSON_KEY", "com.yariksoffice.lingver.library"}, m18303k = 1, m18304mv = {1, 4, 0})
    public static final class Companion {
    }

    public PreferenceLocaleStore(Application application, Locale locale) {
        this.f43497b = locale;
        this.f43496a = application.getSharedPreferences("lingver_preference", 0);
    }

    /* JADX INFO: renamed from: a */
    public final Locale m15439a() {
        SharedPreferences sharedPreferences = this.f43496a;
        String string = sharedPreferences.getString("language_key", null);
        if (string == null || StringsKt.m20448x(string)) {
            return this.f43497b;
        }
        String string2 = sharedPreferences.getString("language_key", null);
        if (string2 != null) {
            JSONObject jSONObject = new JSONObject(string2);
            return new Locale(jSONObject.getString("language"), jSONObject.getString("country"), jSONObject.getString("variant"));
        }
        KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException();
        Intrinsics.m18603k(kotlinNullPointerException, Intrinsics.class.getName());
        throw kotlinNullPointerException;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m15440b() {
        return this.f43496a.getBoolean("follow_system_locale_key", false);
    }
}
