package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import androidx.arch.core.executor.ExecutorC0154a;
import androidx.profileinstaller.ProfileInstaller;
import java.io.File;
import java.io.Serializable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {

    /* JADX INFO: compiled from: Proguard */
    public class ResultDiagnostics implements ProfileInstaller.DiagnosticsCallback {
        public ResultDiagnostics() {
        }

        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        /* JADX INFO: renamed from: a */
        public final void mo11499a(int i, Serializable serializable) {
            ((ProfileInstaller.C21082) ProfileInstaller.f31496b).mo11499a(i, serializable);
            ProfileInstallReceiver.this.setResultCode(i);
        }

        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        /* JADX INFO: renamed from: b */
        public final void mo11500b() {
            ((ProfileInstaller.C21082) ProfileInstaller.f31496b).mo11500b();
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            ProfileInstaller.m11502b(context, new ExecutorC0154a(1), new ResultDiagnostics(), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if (!"WRITE_SKIP_FILE".equals(string)) {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        ResultDiagnostics resultDiagnostics = new ResultDiagnostics();
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        resultDiagnostics.mo11499a(11, null);
                        return;
                    }
                    return;
                }
                ResultDiagnostics resultDiagnostics2 = new ResultDiagnostics();
                try {
                    ProfileInstaller.m11501a(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    resultDiagnostics2.mo11499a(10, null);
                    return;
                } catch (PackageManager.NameNotFoundException e) {
                    resultDiagnostics2.mo11499a(7, e);
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            ResultDiagnostics resultDiagnostics3 = new ResultDiagnostics();
            Process.sendSignal(Process.myPid(), 10);
            resultDiagnostics3.mo11499a(12, null);
        } else {
            if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
                return;
            }
            String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
            ResultDiagnostics resultDiagnostics4 = new ResultDiagnostics();
            if (!"DROP_SHADER_CACHE".equals(string2)) {
                resultDiagnostics4.mo11499a(16, null);
                return;
            }
            if (BenchmarkOperation.m11490a(Build.VERSION.SDK_INT >= 34 ? context.createDeviceProtectedStorageContext().getCacheDir() : context.createDeviceProtectedStorageContext().getCodeCacheDir())) {
                resultDiagnostics4.mo11499a(14, null);
            } else {
                resultDiagnostics4.mo11499a(15, null);
            }
        }
    }
}
