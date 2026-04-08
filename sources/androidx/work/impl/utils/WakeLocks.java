package androidx.work.impl.utils;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.Logger;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"work-runtime_release"}, m18303k = 2, m18304mv = {1, 8, 0}, m18306xi = 48)
@JvmName
@SourceDebugExtension
public final class WakeLocks {

    /* JADX INFO: renamed from: a */
    public static final String f33087a;

    static {
        String strM12101g = Logger.m12101g("WakeLocks");
        Intrinsics.m18598f(strM12101g, "tagWithPrefix(\"WakeLocks\")");
        f33087a = strM12101g;
    }

    /* JADX INFO: renamed from: a */
    public static final void m12285a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (WakeLocksHolder.f33088a) {
            linkedHashMap.putAll(WakeLocksHolder.f33089b);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                Logger.m12100e().mo12107h(f33087a, "WakeLock held for " + str);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final PowerManager.WakeLock m12286b(Context context, String tag) {
        Intrinsics.m18599g(context, "context");
        Intrinsics.m18599g(tag, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        Intrinsics.m18597e(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String strConcat = "WorkManager: ".concat(tag);
        PowerManager.WakeLock wakeLock = ((PowerManager) systemService).newWakeLock(1, strConcat);
        synchronized (WakeLocksHolder.f33088a) {
        }
        Intrinsics.m18598f(wakeLock, "wakeLock");
        return wakeLock;
    }
}
