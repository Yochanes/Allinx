package io.intercom.android.sdk.api;

import android.content.Context;
import android.util.Base64;
import io.intercom.android.sdk.BuildConfig;
import io.intercom.android.sdk.identity.AppIdentity;
import io.intercom.android.sdk.utilities.commons.DeviceUtils;
import java.util.Random;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
class HeaderInterceptor implements Interceptor {
    private static final String ACCEPT_LANGUAGE = "Accept-Language";
    private static final String AUTHORIZATION = "Authorization";
    private static final String CONTENT_TYPE_KEY = "Content-Type";
    private static final String CONTENT_TYPE_VALUE = "application/json";
    private static final String HOST_APP_VERSION_KEY = "X-INTERCOM-HOST-APP-VERSION";
    private static final String IDEMPOTENCY_KEY = "Idempotency-Key";
    private static final String INTERCOM_AGENT = "X-INTERCOM-AGENT";
    private static final String INTERCOM_AGENT_WRAPPER = "X-INTERCOM-AGENT-WRAPPER";
    private static final String SUPPORTED_LANGUAGES_KEY = "X-INTERCOM-SUPPORTED-LANGUAGES";
    private static final String SUPPORTED_LANGUAGE_LIST = "ar,bg,bn,bs,ca,cs,da,de,de-form,el,es,et,fa-IR,fi,fr,hi,he,hr,hu,id,it,ja,ko,lt,lv,mn,ms,nb,nl,pl,pt-PT,pt-BR,ro,ru,sl,sr,sv,sw,th,tr,uk,vi,zh-Hant,zh-Hans";
    private final AppIdentity appIdentity;
    private final String appVersion;
    private final String cordovaVersion;
    private final String flutterVersion;
    private final Random random;
    private final String reactNativeVersion;
    private final String userLocale;
    private final String versionName;

    public HeaderInterceptor(String str, String str2, String str3, String str4, AppIdentity appIdentity, String str5, String str6, Random random) {
        this.cordovaVersion = str;
        this.reactNativeVersion = str2;
        this.flutterVersion = str3;
        this.versionName = str4;
        this.appIdentity = appIdentity;
        this.userLocale = str5;
        this.appVersion = str6;
        this.random = random;
    }

    public static HeaderInterceptor create(Context context, AppIdentity appIdentity) {
        return new HeaderInterceptor(context.getSharedPreferences(PlatformIdentifierUtilKt.WRAPPER_PREFS, 0).getString(PlatformIdentifierUtilKt.CORDOVA_VERSION, ""), context.getSharedPreferences(PlatformIdentifierUtilKt.WRAPPER_PREFS, 0).getString(PlatformIdentifierUtilKt.REACT_NATIVE_VERSION, ""), "", BuildConfig.VERSION_NAME, appIdentity, UserLocaleUtilKt.getUserLocaleString(context), DeviceUtils.getAppVersion(context), new Random());
    }

    private String getBasicAuth() {
        return "Basic " + Base64.encodeToString((this.appIdentity.appId() + ":" + this.appIdentity.apiKey()).getBytes(), 2);
    }

    public static void setCordovaVersion(Context context, String str) {
        context.getSharedPreferences(PlatformIdentifierUtilKt.WRAPPER_PREFS, 0).edit().putString(PlatformIdentifierUtilKt.CORDOVA_VERSION, str).apply();
    }

    public static void setReactNativeVersion(Context context, String str) {
        context.getSharedPreferences(PlatformIdentifierUtilKt.WRAPPER_PREFS, 0).edit().putString(PlatformIdentifierUtilKt.REACT_NATIVE_VERSION, str).apply();
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Request.Builder builderM21295b = chain.request().m21295b();
        builderM21295b.m21299d("Content-Type", CONTENT_TYPE_VALUE);
        builderM21295b.m21299d("Authorization", getBasicAuth());
        builderM21295b.m21299d(IDEMPOTENCY_KEY, Long.toHexString(this.random.nextLong()));
        builderM21295b.m21299d(INTERCOM_AGENT, "intercom-android-sdk/" + this.versionName);
        builderM21295b.m21299d("Accept-Language", this.userLocale);
        builderM21295b.m21299d(SUPPORTED_LANGUAGES_KEY, SUPPORTED_LANGUAGE_LIST);
        builderM21295b.m21299d(HOST_APP_VERSION_KEY, this.appVersion);
        if (!this.cordovaVersion.isEmpty()) {
            builderM21295b.m21299d(INTERCOM_AGENT_WRAPPER, "intercom-sdk-cordova/" + this.cordovaVersion);
        }
        if (!this.reactNativeVersion.isEmpty()) {
            builderM21295b.m21299d(INTERCOM_AGENT_WRAPPER, "intercom-sdk-react-native/" + this.reactNativeVersion);
        }
        if (!this.flutterVersion.isEmpty()) {
            builderM21295b.m21299d(INTERCOM_AGENT_WRAPPER, "intercom-sdk-flutter/" + this.flutterVersion);
        }
        return chain.mo21281a(builderM21295b.m21297b());
    }
}
