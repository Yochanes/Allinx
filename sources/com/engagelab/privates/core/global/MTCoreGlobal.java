package com.engagelab.privates.core.global;

import android.content.Context;
import android.text.TextUtils;
import com.engagelab.privates.common.C2485m;
import com.engagelab.privates.common.global.MTGlobal;
import com.engagelab.privates.core.api.Address;
import com.engagelab.privates.core.constants.MTCoreConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class MTCoreGlobal {
    private static volatile Address address = null;
    private static int connectRetryCount = 3;
    private static long heartbeatInterval = 290000;
    private static int loginCode = 0;
    private static boolean onlyBeWakeState = true;
    private static boolean onlyWakeState = true;
    private static String password = null;
    private static int registerCode = -1;
    private static String registrationId = null;
    private static long rid = 0;
    private static int seedId = 0;
    private static long serverTime = 0;
    private static long userId = 0;
    private static boolean wakeAndBeWakeState = true;

    public static int getConnectRetryCount() {
        return connectRetryCount;
    }

    public static long getHeartbeatInterval() {
        return heartbeatInterval;
    }

    public static List<String> getHttpAddress(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(getHttpAddressSet(context));
        Collections.shuffle(arrayList);
        return arrayList;
    }

    private static Set<String> getHttpAddressSet(Context context) {
        return C2485m.m13034e(context);
    }

    public static int getLoginCode(Context context) {
        if (loginCode == -1) {
            loginCode = C2485m.m13037f(context);
        }
        return loginCode;
    }

    public static boolean getOnlyBeWakeState() {
        if (MTGlobal.IS_FOR_BINANCE || MTGlobal.IS_FOR_PINGANBANK) {
            return onlyBeWakeState;
        }
        return true;
    }

    public static boolean getOnlyWakeState() {
        if (MTGlobal.IS_FOR_BINANCE || MTGlobal.IS_FOR_PINGANBANK) {
            return onlyWakeState;
        }
        return true;
    }

    public static String getPassword(Context context) {
        if (TextUtils.isEmpty(password)) {
            password = C2485m.m13038g(context);
        }
        return password;
    }

    public static byte getPlatformState(Context context) {
        return C2485m.m13039h(context);
    }

    public static int getRegisterCode(Context context) {
        if (registerCode == -1) {
            registerCode = C2485m.m13040i(context);
        }
        return registerCode;
    }

    public static String getRegistrationId(Context context) {
        if (TextUtils.isEmpty(registrationId)) {
            registrationId = C2485m.m13041j(context);
        }
        return registrationId;
    }

    public static long getRid() {
        long j = rid;
        long j2 = (j + (j % 2 == 0 ? 1L : 2L)) % 32767;
        rid = j2;
        return j2;
    }

    public static int getSeedId(Context context) {
        if (seedId == 0) {
            seedId = C2485m.m13042k(context);
        }
        return seedId;
    }

    public static long getServerTime(Context context) {
        if (serverTime == 0) {
            serverTime = C2485m.m13043l(context);
        }
        return serverTime;
    }

    public static long getUserId(Context context) {
        if (userId == 0) {
            userId = C2485m.m13049r(context);
        }
        return userId;
    }

    public static boolean getWakeAndBeWakeState() {
        return wakeAndBeWakeState;
    }

    public static void setConnectRetryCount(int i) {
        if (i < 3) {
            connectRetryCount = 3;
        } else {
            connectRetryCount = i;
        }
    }

    public static void setHeartbeatInterval(long j) {
        if (j <= 0) {
            heartbeatInterval = MTCoreConstants.Heartbeat.DEFAULT_VALUE_HEARTBEAT_INTERVAL;
        } else {
            heartbeatInterval = j;
        }
    }

    public static void setLoginCode(int i) {
        loginCode = i;
    }

    public static void setOnlyBeWakeState(boolean z2) {
        if (MTGlobal.IS_FOR_BINANCE || MTGlobal.IS_FOR_PINGANBANK) {
            onlyBeWakeState = z2;
        }
    }

    public static void setOnlyWakeState(boolean z2) {
        if (MTGlobal.IS_FOR_BINANCE || MTGlobal.IS_FOR_PINGANBANK) {
            onlyWakeState = z2;
        }
    }

    public static void setPassword(String str) {
        password = str;
    }

    public static void setPlatformState(Context context, byte b2) {
        C2485m.m13015a(context, b2);
    }

    public static void setRegisterCode(int i) {
        registerCode = i;
    }

    public static void setRegistrationId(String str) {
        registrationId = str;
    }

    public static void setSeedId(int i) {
        seedId = i;
    }

    public static void setServerTime(long j) {
        serverTime = j;
    }

    public static void setUserId(long j) {
        userId = j;
    }

    public static void setWakeAndBeWakeState(boolean z2) {
        wakeAndBeWakeState = z2;
    }
}
