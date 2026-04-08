package com.exchange.allin.utils;

import androidx.compose.runtime.internal.StabilityInferred;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.exchange.allin.config.AppConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/utils/LanguageHelper;", "", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@SourceDebugExtension
public final class LanguageHelper {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    public static String m14180a() {
        String strM13205g = AppConfig.Pref.f35244a.m13205g();
        switch (strM13205g.hashCode()) {
            case 2097:
                return !strM13205g.equals("AR") ? "en" : "ar";
            case 2105:
                return !strM13205g.equals("AZ") ? "en" : "az";
            case 2124:
                return !strM13205g.equals("BN") ? "en" : "bn";
            case 2177:
                return !strM13205g.equals("DE") ? "en" : "de";
            case 2217:
                strM13205g.equals("EN");
                return "en";
            case MTCoreConstants.RemoteWhat.UPLOAD /* 2222 */:
                return !strM13205g.equals("ES") ? "en" : "es";
            case 2235:
                return !strM13205g.equals("FA") ? "en" : "fa";
            case 2252:
                return !strM13205g.equals("FR") ? "en" : "fr";
            case 2301:
                return !strM13205g.equals("HE") ? "en" : "he";
            case 2305:
                return !strM13205g.equals("HI") ? "en" : "hi";
            case 2317:
                return !strM13205g.equals("HU") ? "en" : "hu";
            case 2347:
                return !strM13205g.equals("IT") ? "en" : "it";
            case 2374:
                return !strM13205g.equals("JP") ? "en" : "ja";
            case 2400:
                return !strM13205g.equals("KK") ? "en" : "kk";
            case 2407:
                return !strM13205g.equals("KR") ? "en" : "ko";
            case 2470:
                return !strM13205g.equals("MS") ? "en" : "ms";
            case 2564:
                return !strM13205g.equals("PT") ? "en" : "pt";
            case 2627:
                return !strM13205g.equals("RU") ? "en" : "ru";
            case 2686:
                return !strM13205g.equals("TR") ? "en" : "tr";
            case 2739:
                return !strM13205g.equals("VI") ? "en" : "vi";
            case 72636:
                return !strM13205g.equals("INA") ? "en" : "id";
            case 2573724:
                return !strM13205g.equals("THAI") ? "en" : "th";
            case 85307758:
                return !strM13205g.equals("ZH-TC") ? "en" : "zh-TW";
            default:
                return "en";
        }
    }
}
