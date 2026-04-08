package androidx.media3.exoplayer.scheduler;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.PersistableBundle;
import android.os.PowerManager;
import androidx.compose.p013ui.text.android.AbstractC1329b;
import androidx.datastore.preferences.protobuf.AbstractC1610a;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class PlatformScheduler implements Scheduler {

    /* JADX INFO: compiled from: Proguard */
    public static final class PlatformSchedulerService extends JobService {
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        @Override // android.app.job.JobService
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean onStartJob(JobParameters jobParameters) {
            int i;
            Intent intentRegisterReceiver;
            int intExtra;
            PersistableBundle extras = jobParameters.getExtras();
            int i2 = new Requirements(extras.getInt("requirements")).f27103a;
            if ((i2 & 1) != 0) {
                Object systemService = getSystemService("connectivity");
                systemService.getClass();
                ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    i = i2 & 3;
                } else {
                    if (Util.f25665a >= 24) {
                        Network activeNetwork = connectivityManager.getActiveNetwork();
                        if (activeNetwork != null) {
                            try {
                                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                                if (networkCapabilities != null) {
                                    if (networkCapabilities.hasCapability(16)) {
                                    }
                                }
                            } catch (SecurityException unused) {
                            }
                        }
                        i = i2 & 3;
                    }
                    if ((i2 & 2) != 0 && connectivityManager.isActiveNetworkMetered()) {
                        i = 2;
                    }
                }
            } else {
                i = 0;
            }
            if (((i2 & 8) != 0) && ((intentRegisterReceiver = registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"))) == null || ((intExtra = intentRegisterReceiver.getIntExtra("status", -1)) != 2 && intExtra != 5))) {
                i |= 8;
            }
            if ((i2 & 4) != 0) {
                Object systemService2 = getSystemService("power");
                systemService2.getClass();
                PowerManager powerManager = (PowerManager) systemService2;
                if (!(Util.f25665a >= 23 ? powerManager.isDeviceIdleMode() : !powerManager.isInteractive())) {
                    i |= 4;
                }
            }
            if ((i2 & 16) != 0) {
                if (!(registerReceiver(null, new IntentFilter("android.intent.action.DEVICE_STORAGE_LOW")) == null)) {
                    i |= 16;
                }
            }
            if (i != 0) {
                AbstractC1610a.m8738p(i, "Requirements not met: ", "PlatformScheduler");
                jobFinished(jobParameters, true);
                return false;
            }
            String string = extras.getString("service_action");
            string.getClass();
            String string2 = extras.getString("service_package");
            string2.getClass();
            Intent intent = new Intent(string).setPackage(string2);
            if (Util.f25665a >= 26) {
                AbstractC1329b.m6453c(this, intent);
                return false;
            }
            startService(intent);
            return false;
        }

        @Override // android.app.job.JobService
        public final boolean onStopJob(JobParameters jobParameters) {
            return false;
        }
    }

    static {
        int i = Util.f25665a;
    }
}
