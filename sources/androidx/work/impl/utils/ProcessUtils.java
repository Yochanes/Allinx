package androidx.work.impl.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.WorkManager;
import com.engagelab.privates.common.constants.MTCommonConstants;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"work-runtime_release"}, m18303k = 2, m18304mv = {1, 8, 0}, m18306xi = 48)
@JvmName
@SourceDebugExtension
public final class ProcessUtils {

    /* JADX INFO: renamed from: a */
    public static final String f33076a;

    static {
        String strM12101g = Logger.m12101g("ProcessUtils");
        Intrinsics.m18598f(strM12101g, "tagWithPrefix(\"ProcessUtils\")");
        f33076a = strM12101g;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m12283a(Context context, Configuration configuration) {
        String strM12273a;
        Object next;
        Object objInvoke;
        Intrinsics.m18599g(context, "context");
        Intrinsics.m18599g(configuration, "configuration");
        if (Build.VERSION.SDK_INT >= 28) {
            strM12273a = Api28Impl.m12273a();
        } else {
            strM12273a = null;
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, WorkManager.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
                declaredMethod.setAccessible(true);
                objInvoke = declaredMethod.invoke(null, new Object[0]);
                Intrinsics.m18596d(objInvoke);
            } catch (Throwable th) {
                Logger.m12100e().mo12103b(f33076a, "Unable to check ActivityThread for processName", th);
            }
            if (objInvoke instanceof String) {
                strM12273a = (String) objInvoke;
            } else {
                int iMyPid = Process.myPid();
                Object systemService = context.getSystemService(MTCommonConstants.Lifecycle.KEY_ACTIVITY);
                Intrinsics.m18597e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
                if (runningAppProcesses != null) {
                    Iterator<T> it = runningAppProcesses.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (((ActivityManager.RunningAppProcessInfo) next).pid == iMyPid) {
                            break;
                        }
                    }
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
                    if (runningAppProcessInfo != null) {
                        strM12273a = runningAppProcessInfo.processName;
                    }
                }
            }
        }
        return Intrinsics.m18594b(strM12273a, context.getApplicationInfo().processName);
    }
}
