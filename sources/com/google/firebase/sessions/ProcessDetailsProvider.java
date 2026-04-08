package com.google.firebase.sessions;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import androidx.core.text.util.AbstractC1451a;
import coil.util.AbstractC2383b;
import com.engagelab.privates.common.constants.MTCommonConstants;
import com.google.android.gms.common.util.ProcessUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0002J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fJ\r\u0010\u0011\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0012¨\u0006\u0013"}, m18302d2 = {"Lcom/google/firebase/sessions/ProcessDetailsProvider;", "", "()V", "buildProcessDetails", "Lcom/google/firebase/sessions/ProcessDetails;", "processName", "", "pid", "", "importance", "isDefaultProcess", "", "getAppProcessDetails", "", "context", "Landroid/content/Context;", "getCurrentProcessDetails", "getProcessName", "getProcessName$com_google_firebase_firebase_sessions", "com.google.firebase-firebase-sessions"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class ProcessDetailsProvider {

    @NotNull
    public static final ProcessDetailsProvider INSTANCE = new ProcessDetailsProvider();

    private ProcessDetailsProvider() {
    }

    private final ProcessDetails buildProcessDetails(String processName, int pid, int importance, boolean isDefaultProcess) {
        return new ProcessDetails(processName, pid, importance, isDefaultProcess);
    }

    public static /* synthetic */ ProcessDetails buildProcessDetails$default(ProcessDetailsProvider processDetailsProvider, String str, int i, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        if ((i3 & 8) != 0) {
            z2 = false;
        }
        return processDetailsProvider.buildProcessDetails(str, i, i2, z2);
    }

    @NotNull
    public final List<ProcessDetails> getAppProcessDetails(@NotNull Context context) {
        Intrinsics.m18599g(context, "context");
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService(MTCommonConstants.Lifecycle.KEY_ACTIVITY);
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        if (runningAppProcesses == null) {
            runningAppProcesses = EmptyList.f51496a;
        }
        ArrayList arrayListM18468z = CollectionsKt.m18468z(runningAppProcesses);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : arrayListM18468z) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.m18452r(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            String str2 = runningAppProcessInfo.processName;
            Intrinsics.m18598f(str2, "runningAppProcessInfo.processName");
            arrayList2.add(new ProcessDetails(str2, runningAppProcessInfo.pid, runningAppProcessInfo.importance, Intrinsics.m18594b(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    @NotNull
    public final ProcessDetails getCurrentProcessDetails(@NotNull Context context) {
        Object next;
        Intrinsics.m18599g(context, "context");
        int iMyPid = Process.myPid();
        Iterator<T> it = getAppProcessDetails(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ProcessDetails) next).getPid() == iMyPid) {
                break;
            }
        }
        ProcessDetails processDetails = (ProcessDetails) next;
        return processDetails == null ? buildProcessDetails$default(this, getProcessName$com_google_firebase_firebase_sessions(), iMyPid, 0, false, 12, null) : processDetails;
    }

    @NotNull
    public final String getProcessName$com_google_firebase_firebase_sessions() throws Throwable {
        String strM12549e;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            String strM7681f = AbstractC1451a.m7681f();
            Intrinsics.m18598f(strM7681f, "myProcessName()");
            return strM7681f;
        }
        if (i >= 28 && (strM12549e = AbstractC2383b.m12549e()) != null) {
            return strM12549e;
        }
        String myProcessName = ProcessUtils.getMyProcessName();
        return myProcessName != null ? myProcessName : "";
    }
}
