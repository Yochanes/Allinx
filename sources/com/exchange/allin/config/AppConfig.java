package com.exchange.allin.config;

import android.content.ContextWrapper;
import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.exchange.allin.data.CurrencyRate;
import com.exchange.allin.data.LoginData;
import com.exchange.allin.p024ui.theme.AppColors;
import com.exchange.allin.p024ui.theme.ThemeKt;
import com.exchange.allin.utils.ext.ConfigExtKt;
import com.exchange.allin.utils.ext.StringExtKt;
import com.google.common.net.HttpHeaders;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Lcom/exchange/allin/config/AppConfig;", "", HttpHeaders.HOST, "Pref", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class AppConfig {

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/config/AppConfig$Host;", "", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class Host {

        /* JADX INFO: renamed from: c */
        public static final com.exchange.allin.config.Host f35240c;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ KProperty[] f35239b = {Reflection.f51660a.mo18615e(new MutablePropertyReference1Impl(Host.class, "hostIndex", "getHostIndex()I", 0))};

        /* JADX INFO: renamed from: a */
        public static final Host f35238a = new Host();

        static {
            com.exchange.allin.config.Host host = new com.exchange.allin.config.Host("https://user.allinpro.com/", "https://api.allinpro.com/", "wss://ws.allinpro.com/ws", "https://api.allinpro.com/futures/", "wss://api.allinpro.com/futures/wsf", "https://api.allinpro.com/futures1k/", "wss://api.allinpro.com/futures1k/wsf", "https://aggapi.allinpro.com/", "wss://aggapi.allinpro.com/ws/kline", "https://api.allinpro.com/gateway/");
            new SharedPref("hostIndex", 0);
            f35240c = host;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/config/AppConfig$Pref;", "", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Pref {

        /* JADX INFO: renamed from: A */
        public static final SharedPref f35242A;

        /* JADX INFO: renamed from: B */
        public static final SharedPref f35243B;

        /* JADX INFO: renamed from: a */
        public static final Pref f35244a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ KProperty[] f35245b;

        /* JADX INFO: renamed from: c */
        public static final SharedPref f35246c;

        /* JADX INFO: renamed from: d */
        public static final SharedPref f35247d;

        /* JADX INFO: renamed from: e */
        public static final SharedPref f35248e;

        /* JADX INFO: renamed from: f */
        public static final SharedPref f35249f;

        /* JADX INFO: renamed from: g */
        public static final SharedPref f35250g;

        /* JADX INFO: renamed from: h */
        public static final SharedPref f35251h;

        /* JADX INFO: renamed from: i */
        public static final SharedPref f35252i;

        /* JADX INFO: renamed from: j */
        public static final SharedPref f35253j;

        /* JADX INFO: renamed from: k */
        public static final SharedPref f35254k;

        /* JADX INFO: renamed from: l */
        public static final SharedPref f35255l;

        /* JADX INFO: renamed from: m */
        public static final SharedPref f35256m;

        /* JADX INFO: renamed from: n */
        public static final SharedPref f35257n;

        /* JADX INFO: renamed from: o */
        public static final SharedPref f35258o;

        /* JADX INFO: renamed from: p */
        public static final SharedPref f35259p;

        /* JADX INFO: renamed from: q */
        public static final SharedPref f35260q;

        /* JADX INFO: renamed from: r */
        public static final SharedPref f35261r;

        /* JADX INFO: renamed from: s */
        public static final SharedPref f35262s;

        /* JADX INFO: renamed from: t */
        public static final SharedPref f35263t;

        /* JADX INFO: renamed from: u */
        public static final SharedPref f35264u;

        /* JADX INFO: renamed from: v */
        public static final SharedPref f35265v;

        /* JADX INFO: renamed from: w */
        public static final SharedPref f35266w;

        /* JADX INFO: renamed from: x */
        public static final SharedPref f35267x;

        /* JADX INFO: renamed from: y */
        public static final SharedPref f35268y;

        /* JADX INFO: renamed from: z */
        public static final SharedPref f35269z;

        static {
            MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(Pref.class, "isDarkTheme", "isDarkTheme()Z", 0);
            ReflectionFactory reflectionFactory = Reflection.f51660a;
            boolean z2 = false;
            f35245b = new KProperty[]{reflectionFactory.mo18615e(mutablePropertyReference1Impl), AbstractC0455a.m2247v(Pref.class, "currencyRate", "getCurrencyRate()Ljava/lang/String;", 0, reflectionFactory), AbstractC0455a.m2247v(Pref.class, "token", "getToken()Ljava/lang/String;", 0, reflectionFactory), AbstractC0455a.m2247v(Pref.class, "accountList", "getAccountList()Ljava/lang/String;", 0, reflectionFactory), AbstractC0455a.m2247v(Pref.class, "loginData", "getLoginData()Ljava/lang/String;", 0, reflectionFactory), AbstractC0455a.m2247v(Pref.class, "language", "getLanguage()Ljava/lang/String;", 0, reflectionFactory), AbstractC0455a.m2247v(Pref.class, "identify", "getIdentify()Ljava/lang/String;", 0, reflectionFactory), AbstractC0455a.m2247v(Pref.class, "curCountry", "getCurCountry()Ljava/lang/String;", 0, reflectionFactory), AbstractC0455a.m2247v(Pref.class, "isHideAssetInfo", "isHideAssetInfo()Z", 0, reflectionFactory), AbstractC0455a.m2247v(Pref.class, "curTradeRoute", "getCurTradeRoute()Ljava/lang/String;", 0, reflectionFactory), AbstractC0455a.m2247v(Pref.class, "curSpotSymbol", "getCurSpotSymbol()Ljava/lang/String;", 0, reflectionFactory), AbstractC0455a.m2247v(Pref.class, "curFuturesSymbol", "getCurFuturesSymbol()Ljava/lang/String;", 0, reflectionFactory), AbstractC0455a.m2247v(Pref.class, "curFlashSymbol", "getCurFlashSymbol()Ljava/lang/String;", 0, reflectionFactory), AbstractC0455a.m2247v(Pref.class, "curMiniFuturesSymbol", "getCurMiniFuturesSymbol()Ljava/lang/String;", 0, reflectionFactory), AbstractC0455a.m2247v(Pref.class, "isChartGreenUpRedDown", "isChartGreenUpRedDown()Z", 0, reflectionFactory), AbstractC0455a.m2247v(Pref.class, "curKLineInterval", "getCurKLineInterval()Ljava/lang/String;", 0, reflectionFactory), AbstractC0455a.m2247v(Pref.class, "curKLineMainImg", "getCurKLineMainImg()Ljava/lang/String;", 0, reflectionFactory), AbstractC0455a.m2247v(Pref.class, "curKLineDeputyImg", "getCurKLineDeputyImg()Ljava/lang/String;", 0, reflectionFactory), AbstractC0455a.m2247v(Pref.class, "isShowFuturesLimitOrder", "isShowFuturesLimitOrder()Z", 0, reflectionFactory), AbstractC0455a.m2247v(Pref.class, "isShowFuturesMarketOrder", "isShowFuturesMarketOrder()Z", 0, reflectionFactory), AbstractC0455a.m2247v(Pref.class, "isShowFuturesConditionalOrder", "isShowFuturesConditionalOrder()Z", 0, reflectionFactory), AbstractC0455a.m2247v(Pref.class, "isShowFuturesCloseAllPositions", "isShowFuturesCloseAllPositions()Z", 0, reflectionFactory), AbstractC0455a.m2247v(Pref.class, "isShowFuturesCancelAllOrders", "isShowFuturesCancelAllOrders()Z", 0, reflectionFactory), AbstractC0455a.m2247v(Pref.class, "isShowSpotLimitOrder", "isShowSpotLimitOrder()Z", 0, reflectionFactory), AbstractC0455a.m2247v(Pref.class, "isShowSpotMarketOrder", "isShowSpotMarketOrder()Z", 0, reflectionFactory), AbstractC0455a.m2247v(Pref.class, "isShowSpotCancelAllOrders", "isShowSpotCancelAllOrders()Z", 0, reflectionFactory)};
            f35244a = new Pref();
            ContextWrapper context = ConfigExtKt.m14195d();
            AppColors appColors = ThemeKt.f41027a;
            Intrinsics.m18599g(context, "context");
            int i = context.getResources().getConfiguration().uiMode & 48;
            if (i != 16 && i == 32) {
                z2 = true;
            }
            f35246c = new SharedPref("isDarkTheme", Boolean.valueOf(z2));
            f35247d = new SharedPref("currencyRate", StringExtKt.m14225n(new CurrencyRate("USD", 1.0d, "USD")));
            f35248e = new SharedPref("token", "");
            f35249f = new SharedPref("accountList", StringExtKt.m14225n(new ArrayList()));
            f35250g = new SharedPref("loginData", StringExtKt.m14225n(new LoginData(false, null, null, null, 15, null)));
            f35251h = new SharedPref("language", "EN");
            f35252i = new SharedPref("identify", "");
            f35253j = new SharedPref("curCountry", "");
            f35254k = new SharedPref("isHideAssetInfo", Boolean.FALSE);
            f35255l = new SharedPref("curTradeRoute", "futures");
            f35256m = new SharedPref("curSpotSymbol", "");
            f35257n = new SharedPref("curFuturesSymbol", "");
            f35258o = new SharedPref("curFlashSymbol", "");
            f35259p = new SharedPref("curMiniFuturesSymbol", "");
            Boolean bool = Boolean.TRUE;
            f35260q = new SharedPref("isChartGreenUpRedDown", bool);
            f35261r = new SharedPref("curKLineInterval", "15m");
            f35262s = new SharedPref("curKLineMainImg", "MA");
            f35263t = new SharedPref("curKLineDeputyImg", "");
            f35264u = new SharedPref("isShowFuturesLimitOrder", bool);
            f35265v = new SharedPref("isShowFuturesMarketOrder", bool);
            f35266w = new SharedPref("isShowFuturesConditionalOrder", bool);
            f35267x = new SharedPref("isShowFuturesCloseAllPositions", bool);
            f35268y = new SharedPref("isShowFuturesCancelAllOrders", bool);
            f35269z = new SharedPref("isShowSpotLimitOrder", bool);
            f35242A = new SharedPref("isShowSpotMarketOrder", bool);
            f35243B = new SharedPref("isShowSpotCancelAllOrders", bool);
        }

        /* JADX INFO: renamed from: a */
        public final String m13199a() {
            return (String) f35249f.getValue(this, f35245b[3]);
        }

        /* JADX INFO: renamed from: b */
        public final String m13200b() {
            return (String) f35253j.getValue(this, f35245b[7]);
        }

        /* JADX INFO: renamed from: c */
        public final String m13201c() {
            return (String) f35257n.getValue(this, f35245b[11]);
        }

        /* JADX INFO: renamed from: d */
        public final String m13202d() {
            return (String) f35261r.getValue(this, f35245b[15]);
        }

        /* JADX INFO: renamed from: e */
        public final String m13203e() {
            return (String) f35259p.getValue(this, f35245b[13]);
        }

        /* JADX INFO: renamed from: f */
        public final String m13204f() {
            return (String) f35256m.getValue(this, f35245b[10]);
        }

        /* JADX INFO: renamed from: g */
        public final String m13205g() {
            return (String) f35251h.getValue(this, f35245b[5]);
        }

        /* JADX INFO: renamed from: h */
        public final String m13206h() {
            return (String) f35248e.getValue(this, f35245b[2]);
        }

        /* JADX INFO: renamed from: i */
        public final boolean m13207i() {
            return ((Boolean) f35260q.getValue(this, f35245b[14])).booleanValue();
        }

        /* JADX INFO: renamed from: j */
        public final boolean m13208j() {
            return m13206h().length() > 0;
        }

        /* JADX INFO: renamed from: k */
        public final boolean m13209k() {
            return ((Boolean) f35266w.getValue(this, f35245b[20])).booleanValue();
        }

        /* JADX INFO: renamed from: l */
        public final boolean m13210l() {
            return ((Boolean) f35264u.getValue(this, f35245b[18])).booleanValue();
        }

        /* JADX INFO: renamed from: m */
        public final boolean m13211m() {
            return ((Boolean) f35265v.getValue(this, f35245b[19])).booleanValue();
        }

        /* JADX INFO: renamed from: n */
        public final void m13212n(String str) {
            Intrinsics.m18599g(str, "<set-?>");
            f35257n.setValue(this, f35245b[11], str);
        }

        /* JADX INFO: renamed from: o */
        public final void m13213o(String str) {
            Intrinsics.m18599g(str, "<set-?>");
            f35261r.setValue(this, f35245b[15], str);
        }

        /* JADX INFO: renamed from: p */
        public final void m13214p(String str) {
            Intrinsics.m18599g(str, "<set-?>");
            f35248e.setValue(this, f35245b[2], str);
        }
    }
}
