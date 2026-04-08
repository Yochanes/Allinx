package androidx.core.content;

import android.accounts.AccountManager;
import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AppOpsManager;
import android.app.DownloadManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.SearchManager;
import android.app.UiModeManager;
import android.app.WallpaperManager;
import android.app.admin.DevicePolicyManager;
import android.app.job.JobScheduler;
import android.app.usage.UsageStatsManager;
import android.appwidget.AppWidgetManager;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.RestrictionsManager;
import android.content.pm.LauncherApps;
import android.content.res.ColorStateList;
import android.hardware.ConsumerIrManager;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.hardware.input.InputManager;
import android.hardware.usb.UsbManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.MediaRouter;
import android.media.projection.MediaProjectionManager;
import android.media.session.MediaSessionManager;
import android.media.tv.TvInputManager;
import android.net.ConnectivityManager;
import android.net.nsd.NsdManager;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.nfc.NfcManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.DropBoxManager;
import android.os.Handler;
import android.os.PowerManager;
import android.os.Process;
import android.os.UserManager;
import android.os.Vibrator;
import android.os.storage.StorageManager;
import android.print.PrintManager;
import android.telecom.TelecomManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.os.ExecutorCompat;
import com.engagelab.privates.common.constants.MTCommonConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.AttributeType;
import io.intercom.android.sdk.models.Participant;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.concurrent.Executor;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public class ContextCompat {

    /* JADX INFO: renamed from: a */
    public static final Object f23118a = null;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api21Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api23Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api24Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api26Impl {
        /* JADX INFO: renamed from: a */
        public static Intent m7490a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
            return (i & 4) != 0 ? context.registerReceiver(broadcastReceiver, intentFilter, ContextCompat.m7487d(context), null) : context.registerReceiver(broadcastReceiver, intentFilter, null, null, 0);
        }

        /* JADX INFO: renamed from: b */
        public static void m7491b(Context context, Intent intent) {
            context.startForegroundService(intent);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api28Impl {
        /* JADX INFO: renamed from: a */
        public static Executor m7492a(Context context) {
            return context.getMainExecutor();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api30Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api33Impl {
        /* JADX INFO: renamed from: a */
        public static Intent m7493a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
            return context.registerReceiver(broadcastReceiver, intentFilter, null, null, i);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class LegacyServiceMapHolder {
        static {
            HashMap map = new HashMap();
            map.put(SubscriptionManager.class, "telephony_subscription_service");
            map.put(UsageStatsManager.class, "usagestats");
            map.put(AppWidgetManager.class, "appwidget");
            map.put(BatteryManager.class, "batterymanager");
            map.put(CameraManager.class, "camera");
            map.put(JobScheduler.class, "jobscheduler");
            map.put(LauncherApps.class, "launcherapps");
            map.put(MediaProjectionManager.class, "media_projection");
            map.put(MediaSessionManager.class, "media_session");
            map.put(RestrictionsManager.class, "restrictions");
            map.put(TelecomManager.class, "telecom");
            map.put(TvInputManager.class, "tv_input");
            map.put(AppOpsManager.class, "appops");
            map.put(CaptioningManager.class, "captioning");
            map.put(ConsumerIrManager.class, "consumer_ir");
            map.put(PrintManager.class, "print");
            map.put(BluetoothManager.class, "bluetooth");
            map.put(DisplayManager.class, Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
            map.put(UserManager.class, Participant.USER_TYPE);
            map.put(InputManager.class, MetricTracker.Object.INPUT);
            map.put(MediaRouter.class, "media_router");
            map.put(NsdManager.class, "servicediscovery");
            map.put(AccessibilityManager.class, "accessibility");
            map.put(AccountManager.class, "account");
            map.put(ActivityManager.class, MTCommonConstants.Lifecycle.KEY_ACTIVITY);
            map.put(AlarmManager.class, "alarm");
            map.put(AudioManager.class, "audio");
            map.put(ClipboardManager.class, "clipboard");
            map.put(ConnectivityManager.class, "connectivity");
            map.put(DevicePolicyManager.class, "device_policy");
            map.put(DownloadManager.class, "download");
            map.put(DropBoxManager.class, "dropbox");
            map.put(InputMethodManager.class, "input_method");
            map.put(KeyguardManager.class, "keyguard");
            map.put(LayoutInflater.class, "layout_inflater");
            map.put(LocationManager.class, FirebaseAnalytics.Param.LOCATION);
            map.put(NfcManager.class, "nfc");
            map.put(NotificationManager.class, "notification");
            map.put(PowerManager.class, "power");
            map.put(SearchManager.class, FirebaseAnalytics.Event.SEARCH);
            map.put(SensorManager.class, "sensor");
            map.put(StorageManager.class, "storage");
            map.put(TelephonyManager.class, AttributeType.PHONE);
            map.put(TextServicesManager.class, "textservices");
            map.put(UiModeManager.class, "uimode");
            map.put(UsbManager.class, "usb");
            map.put(Vibrator.class, "vibrator");
            map.put(WallpaperManager.class, "wallpaper");
            map.put(WifiP2pManager.class, "wifip2p");
            map.put(WifiManager.class, "wifi");
            map.put(WindowManager.class, "window");
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface RegisterReceiverFlags {
    }

    /* JADX INFO: renamed from: a */
    public static int m7484a(Context context, String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : new NotificationManagerCompat(context).f23064b.areNotificationsEnabled() ? 0 : -1;
        }
        throw new NullPointerException("permission must be non-null");
    }

    /* JADX INFO: renamed from: b */
    public static ColorStateList m7485b(Context context, int i) {
        return ResourcesCompat.m7540a(context.getResources(), i, context.getTheme());
    }

    /* JADX INFO: renamed from: c */
    public static Executor m7486c(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? Api28Impl.m7492a(context) : ExecutorCompat.m7646a(new Handler(context.getMainLooper()));
    }

    /* JADX INFO: renamed from: d */
    public static String m7487d(Context context) {
        String str = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (PermissionChecker.m7503a(context, str) == 0) {
            return str;
        }
        throw new RuntimeException(AbstractC0000a.m3D("Permission ", str, " is required by your application to receive broadcasts, please add it to your manifest"));
    }

    /* JADX INFO: renamed from: e */
    public static void m7488e(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        int i2 = i & 2;
        if (i2 == 0 && (i & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i2 != 0 && (i & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33) {
            Api33Impl.m7493a(context, broadcastReceiver, intentFilter, i);
            return;
        }
        if (i3 >= 26) {
            Api26Impl.m7490a(context, broadcastReceiver, intentFilter, i);
        } else if ((i & 4) != 0) {
            context.registerReceiver(broadcastReceiver, intentFilter, m7487d(context), null);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, null, null);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m7489f(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.m7491b(context, intent);
        } else {
            context.startService(intent);
        }
    }
}
