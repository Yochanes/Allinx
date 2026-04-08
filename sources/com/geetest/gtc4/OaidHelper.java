package com.geetest.gtc4;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import coil.util.AbstractC2383b;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.security.MessageDigest;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public class OaidHelper {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC3618e f42311a;

    /* JADX INFO: renamed from: b */
    public static Context f42312b = null;

    /* JADX INFO: renamed from: c */
    public static boolean f42313c = false;

    /* JADX INFO: renamed from: d */
    public static PackageManager f42314d;

    /* JADX INFO: renamed from: com.geetest.gtc4.OaidHelper$a */
    /* JADX INFO: compiled from: Proguard */
    public static class C3614a extends C3623j {
        public C3614a() {
            super("com.asus.msa.SupplementaryDID", "com.asus.msa.SupplementaryDID.SupplementaryDIDService", "com.asus.msa.action.ACCESS_DID", "com.asus.msa.SupplementaryDID.IDidAidlInterface");
        }

        @Override // com.geetest.gtc4.OaidHelper.C3623j
        /* JADX INFO: renamed from: a */
        public final int mo14387a() {
            return 2;
        }
    }

    /* JADX INFO: renamed from: com.geetest.gtc4.OaidHelper$b */
    /* JADX INFO: compiled from: Proguard */
    public static class C3615b extends C3623j {
        public C3615b() {
            super("com.coolpad.deviceidsupport", "com.coolpad.deviceidsupport.DeviceIdService", null, "com.coolpad.deviceidsupport.IDeviceIdManager");
        }

        @Override // com.geetest.gtc4.OaidHelper.C3623j
        /* JADX INFO: renamed from: a */
        public final int mo14387a() {
            return 2;
        }
    }

    /* JADX INFO: renamed from: com.geetest.gtc4.OaidHelper$c */
    /* JADX INFO: compiled from: Proguard */
    public static class C3616c extends C3623j {
        public C3616c() {
            super("com.huawei.hwid", null, "com.uodis.opendevice.OPENIDS_SERVICE", "com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
        }
    }

    /* JADX INFO: renamed from: com.geetest.gtc4.OaidHelper$d */
    /* JADX INFO: compiled from: Proguard */
    public static class C3617d implements IInterface {

        /* JADX INFO: renamed from: a */
        public final IBinder f42315a;

        /* JADX INFO: renamed from: b */
        public final String f42316b;

        public C3617d(IBinder iBinder, String str) {
            this.f42315a = iBinder;
            this.f42316b = str;
        }

        /* JADX INFO: renamed from: a */
        public final String m14388a(String str, String str2, String str3, int i) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                try {
                    parcelObtain.writeInterfaceToken(this.f42316b);
                    if (!TextUtils.isEmpty(str)) {
                        parcelObtain.writeString(str);
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        parcelObtain.writeString(str2);
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        parcelObtain.writeString(str3);
                    }
                    this.f42315a.transact(i, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } catch (Exception unused) {
                    return "";
                }
            } catch (Throwable unused2) {
                parcelObtain.recycle();
                parcelObtain2.recycle();
                return "";
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.f42315a;
        }
    }

    /* JADX INFO: renamed from: com.geetest.gtc4.OaidHelper$e */
    /* JADX INFO: compiled from: Proguard */
    public interface InterfaceC3618e {
        /* JADX INFO: renamed from: a */
        boolean mo14389a(Context context);

        /* JADX INFO: renamed from: b */
        String mo14390b(Context context);

        /* JADX INFO: renamed from: c */
        boolean mo14391c(Context context);
    }

    /* JADX INFO: renamed from: com.geetest.gtc4.OaidHelper$f */
    /* JADX INFO: compiled from: Proguard */
    public static class C3619f extends C3623j {
        public C3619f() {
            super("com.zui.deviceidservice", "com.zui.deviceidservice.DeviceidService", null, "com.zui.deviceidservice.IDeviceidInterface");
        }
    }

    /* JADX INFO: renamed from: com.geetest.gtc4.OaidHelper$g */
    /* JADX INFO: compiled from: Proguard */
    public static class C3620g extends C3621h {
        public C3620g() {
            super("com.meizu.flyme.openidsdk", "");
        }

        @Override // com.geetest.gtc4.OaidHelper.C3621h, com.geetest.gtc4.OaidHelper.InterfaceC3618e
        /* JADX INFO: renamed from: a */
        public final boolean mo14389a(Context context) {
            if (super.mo14389a(context)) {
                C3621h.f42318f = true;
            } else {
                try {
                    Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, new String[]{"support"}, null);
                    if (cursorQuery == null) {
                        return false;
                    }
                    cursorQuery.moveToFirst();
                    int columnIndex = cursorQuery.getColumnIndex("value");
                    if (columnIndex >= 0) {
                        String string = cursorQuery.getString(columnIndex);
                        if (TextUtils.isEmpty(string)) {
                            return false;
                        }
                        C3621h.f42318f = "0".equals(string);
                    } else {
                        C3621h.f42318f = false;
                    }
                } catch (Throwable unused) {
                    C3621h.f42318f = false;
                    return false;
                }
            }
            this.f42322d = true;
            return C3621h.f42318f;
        }

        @Override // com.geetest.gtc4.OaidHelper.C3621h, com.geetest.gtc4.OaidHelper.InterfaceC3618e
        /* JADX INFO: renamed from: b */
        public final String mo14390b(Context context) {
            this.f42321c = new String[]{"oaid"};
            return super.mo14390b(context);
        }
    }

    /* JADX INFO: renamed from: com.geetest.gtc4.OaidHelper$h */
    /* JADX INFO: compiled from: Proguard */
    public static class C3621h implements InterfaceC3618e {

        /* JADX INFO: renamed from: e */
        public static String f42317e = null;

        /* JADX INFO: renamed from: f */
        public static boolean f42318f = false;

        /* JADX INFO: renamed from: a */
        public final String f42319a;

        /* JADX INFO: renamed from: b */
        public final String f42320b;

        /* JADX INFO: renamed from: c */
        public String[] f42321c;

        /* JADX INFO: renamed from: d */
        public boolean f42322d = false;

        public C3621h(String str, String str2) {
            this.f42319a = str;
            this.f42320b = str2;
        }

        @Override // com.geetest.gtc4.OaidHelper.InterfaceC3618e
        /* JADX INFO: renamed from: a */
        public boolean mo14389a(Context context) {
            if (this.f42322d) {
                return f42318f;
            }
            if (context == null) {
                return false;
            }
            try {
                PackageManager packageManagerAccess$000 = OaidHelper.access$000(context);
                f42318f = (packageManagerAccess$000 == null || packageManagerAccess$000.resolveContentProvider(this.f42319a, 0) == null) ? false : true;
            } catch (Throwable unused) {
                f42318f = false;
            }
            this.f42322d = true;
            return f42318f;
        }

        @Override // com.geetest.gtc4.OaidHelper.InterfaceC3618e
        /* JADX INFO: renamed from: b */
        public String mo14390b(Context context) {
            Cursor cursorQuery;
            if (TextUtils.isEmpty(f42317e)) {
                try {
                    cursorQuery = context.getContentResolver().query(Uri.parse("content://" + this.f42319a + RemoteSettings.FORWARD_SLASH_STRING + this.f42320b), null, null, this.f42321c, null);
                    if (cursorQuery != null) {
                        try {
                            cursorQuery.moveToFirst();
                            f42317e = cursorQuery.getString(cursorQuery.getColumnIndex("value"));
                        } catch (Throwable unused) {
                            try {
                                f42317e = null;
                                return f42317e;
                            } finally {
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                            }
                        }
                    }
                } catch (Throwable unused2) {
                    cursorQuery = null;
                }
                if (cursorQuery != null) {
                }
            }
            return f42317e;
        }

        @Override // com.geetest.gtc4.OaidHelper.InterfaceC3618e
        /* JADX INFO: renamed from: c */
        public final boolean mo14391c(Context context) {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.geetest.gtc4.OaidHelper$i */
    /* JADX INFO: compiled from: Proguard */
    public static class ServiceConnectionC3622i implements ServiceConnection {

        /* JADX INFO: renamed from: a */
        public C3617d f42323a;

        /* JADX INFO: renamed from: b */
        public final String f42324b;

        /* JADX INFO: renamed from: c */
        public final CountDownLatch f42325c;

        /* JADX INFO: renamed from: d */
        public IBinder f42326d;

        public ServiceConnectionC3622i(String str, CountDownLatch countDownLatch) {
            this.f42324b = str;
            this.f42325c = countDownLatch;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m14392a(Context context, Intent intent) {
            C3617d c3617d;
            if (this.f42323a != null) {
                return true;
            }
            try {
                boolean zBindService = context.bindService(intent, this, 1);
                this.f42325c.await(1L, TimeUnit.SECONDS);
                IBinder iBinder = this.f42326d;
                String str = this.f42324b;
                if (iBinder == null) {
                    c3617d = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(str);
                    c3617d = iInterfaceQueryLocalInterface instanceof C3617d ? (C3617d) iInterfaceQueryLocalInterface : new C3617d(iBinder, str);
                }
                this.f42323a = c3617d;
                return zBindService;
            } catch (Throwable unused) {
                return false;
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f42326d = iBinder;
                this.f42325c.countDown();
            } catch (Throwable unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            this.f42323a = null;
            this.f42326d = null;
        }
    }

    /* JADX INFO: renamed from: com.geetest.gtc4.OaidHelper$j */
    /* JADX INFO: compiled from: Proguard */
    public static class C3623j implements InterfaceC3618e {

        /* JADX INFO: renamed from: f */
        public static String f42327f = null;

        /* JADX INFO: renamed from: g */
        public static boolean f42328g = false;

        /* JADX INFO: renamed from: h */
        public static boolean f42329h = false;

        /* JADX INFO: renamed from: i */
        public static final CountDownLatch f42330i = new CountDownLatch(1);

        /* JADX INFO: renamed from: a */
        public final String f42331a;

        /* JADX INFO: renamed from: b */
        public final String f42332b;

        /* JADX INFO: renamed from: c */
        public final String f42333c;

        /* JADX INFO: renamed from: d */
        public final String f42334d;

        /* JADX INFO: renamed from: e */
        public ServiceConnectionC3622i f42335e;

        public C3623j(String str, String str2, String str3, String str4) {
            this.f42331a = str;
            this.f42332b = str2;
            this.f42333c = str3;
            this.f42334d = str4;
        }

        /* JADX INFO: renamed from: a */
        public int mo14387a() {
            return 1;
        }

        /* JADX INFO: renamed from: b */
        public String mo14393b() {
            return null;
        }

        @Override // com.geetest.gtc4.OaidHelper.InterfaceC3618e
        /* JADX INFO: renamed from: c */
        public boolean mo14391c(Context context) {
            if (context == null || TextUtils.isEmpty(this.f42331a)) {
                return false;
            }
            if (this.f42335e == null) {
                this.f42335e = new ServiceConnectionC3622i(this.f42334d, f42330i);
            }
            Intent intent = new Intent();
            if (TextUtils.isEmpty(this.f42332b)) {
                intent.setPackage(this.f42331a);
            } else {
                intent.setComponent(new ComponentName(this.f42331a, this.f42332b));
            }
            if (!TextUtils.isEmpty(this.f42333c)) {
                intent.setAction(this.f42333c);
            }
            return this.f42335e.m14392a(context, intent);
        }

        /* JADX INFO: renamed from: d */
        public String mo14394d(Context context) {
            return null;
        }

        /* JADX INFO: renamed from: e */
        public String mo14395e(Context context) {
            return null;
        }

        @Override // com.geetest.gtc4.OaidHelper.InterfaceC3618e
        /* JADX INFO: renamed from: a */
        public boolean mo14389a(Context context) {
            if (f42329h) {
                return f42328g;
            }
            boolean z2 = false;
            if (context != null && !TextUtils.isEmpty(this.f42331a)) {
                try {
                    PackageInfo packageInfo = OaidHelper.access$000(context).getPackageInfo(this.f42331a, 0);
                    if (Build.VERSION.SDK_INT < 28) {
                        if (packageInfo != null && packageInfo.versionCode > 0) {
                            z2 = true;
                        }
                        f42328g = z2;
                    } else if (packageInfo != null) {
                        if (AbstractC2383b.m12546b(packageInfo) >= 1) {
                            return true;
                        }
                    }
                } catch (Throwable unused) {
                }
                return false;
            }
            f42328g = false;
            f42329h = true;
            return f42328g;
        }

        @Override // com.geetest.gtc4.OaidHelper.InterfaceC3618e
        /* JADX INFO: renamed from: b */
        public String mo14390b(Context context) {
            ServiceConnectionC3622i serviceConnectionC3622i;
            C3617d c3617d;
            ServiceConnectionC3622i serviceConnectionC3622i2;
            if (!TextUtils.isEmpty(f42327f) || (serviceConnectionC3622i = this.f42335e) == null || (c3617d = serviceConnectionC3622i.f42323a) == null) {
                return f42327f;
            }
            try {
                String strM14388a = c3617d.m14388a(mo14394d(context), mo14395e(context), mo14393b(), mo14387a());
                f42327f = strM14388a;
                if (!TextUtils.isEmpty(strM14388a) && (serviceConnectionC3622i2 = this.f42335e) != null) {
                    context.unbindService(serviceConnectionC3622i2);
                }
            } catch (Throwable unused) {
            }
            return f42327f;
        }
    }

    /* JADX INFO: renamed from: com.geetest.gtc4.OaidHelper$k */
    /* JADX INFO: compiled from: Proguard */
    public static class C3624k extends C3623j {

        /* JADX INFO: renamed from: j */
        public String f42336j;

        /* JADX INFO: renamed from: k */
        public String f42337k;

        public C3624k() {
            super("com.heytap.openid", "com.heytap.openid.IdentifyService", "action.com.heytap.openid.OPEN_ID_SERVICE", "com.heytap.openid.IOpenID");
        }

        @Override // com.geetest.gtc4.OaidHelper.C3623j
        /* JADX INFO: renamed from: b */
        public final String mo14393b() {
            return "OUID";
        }

        @Override // com.geetest.gtc4.OaidHelper.C3623j
        /* JADX INFO: renamed from: d */
        public final String mo14394d(Context context) {
            if (TextUtils.isEmpty(this.f42337k)) {
                this.f42337k = context.getPackageName();
            }
            return this.f42337k;
        }

        @Override // com.geetest.gtc4.OaidHelper.C3623j
        @SuppressLint({"PackageManagerGetSignatures"})
        /* JADX INFO: renamed from: e */
        public final String mo14395e(Context context) {
            if (TextUtils.isEmpty(this.f42336j)) {
                try {
                    if (TextUtils.isEmpty(this.f42337k)) {
                        this.f42337k = context.getPackageName();
                    }
                    this.f42337k = this.f42337k;
                    Signature[] signatureArr = OaidHelper.access$000(context).getPackageInfo(this.f42337k, 64).signatures;
                    if (signatureArr != null && signatureArr.length > 0) {
                        byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(signatureArr[0].toByteArray());
                        StringBuilder sb = new StringBuilder();
                        for (byte b2 : bArrDigest) {
                            sb.append(Integer.toHexString((b2 & UnsignedBytes.MAX_VALUE) | 256).substring(1, 3));
                        }
                        this.f42336j = sb.toString();
                    }
                } catch (Throwable unused) {
                }
            }
            return this.f42336j;
        }
    }

    /* JADX INFO: renamed from: com.geetest.gtc4.OaidHelper$l */
    /* JADX INFO: compiled from: Proguard */
    public static class C3625l extends C3623j {
        public C3625l() {
            super("com.samsung.android.deviceidservice", "com.samsung.android.deviceidservice.DeviceIdService", null, "com.samsung.android.deviceidservice.IDeviceIdService");
        }
    }

    /* JADX INFO: renamed from: com.geetest.gtc4.OaidHelper$m */
    /* JADX INFO: compiled from: Proguard */
    public static class C3626m extends C3621h {
        public C3626m() {
            super("com.vivo.vms.IdProvider", "IdentifierId/OAID");
        }
    }

    /* JADX INFO: renamed from: com.geetest.gtc4.OaidHelper$n */
    /* JADX INFO: compiled from: Proguard */
    public static class C3627n implements InterfaceC3618e {

        /* JADX INFO: renamed from: b */
        public static String f42338b;

        /* JADX INFO: renamed from: a */
        public Class f42339a = null;

        @Override // com.geetest.gtc4.OaidHelper.InterfaceC3618e
        @SuppressLint({"PrivateApi"})
        /* JADX INFO: renamed from: a */
        public final boolean mo14389a(Context context) {
            try {
                this.f42339a = Class.forName("com.android.id.impl.IdProviderImpl");
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        @Override // com.geetest.gtc4.OaidHelper.InterfaceC3618e
        /* JADX INFO: renamed from: b */
        public final String mo14390b(Context context) {
            if (TextUtils.isEmpty(f42338b)) {
                try {
                    f42338b = String.valueOf(this.f42339a.getMethod("getOAID", Context.class).invoke(this.f42339a.newInstance(), context));
                } catch (Throwable unused) {
                    f42338b = null;
                }
            }
            return f42338b;
        }

        @Override // com.geetest.gtc4.OaidHelper.InterfaceC3618e
        /* JADX INFO: renamed from: c */
        public final boolean mo14391c(Context context) {
            return true;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    static {
        InterfaceC3618e c3619f;
        String upperCase = Build.MANUFACTURER.toUpperCase();
        upperCase.getClass();
        byte b2 = -1;
        switch (upperCase.hashCode()) {
            case -2053026509:
                if (upperCase.equals("LENOVO")) {
                    b2 = 0;
                }
                break;
            case -1712043046:
                if (upperCase.equals("SAMSUNG")) {
                    b2 = 1;
                }
                break;
            case -1706170181:
                if (upperCase.equals("XIAOMI")) {
                    b2 = 2;
                }
                break;
            case -1134767290:
                if (upperCase.equals("BLACKSHARK")) {
                    b2 = 3;
                }
                break;
            case -602397472:
                if (upperCase.equals("ONEPLUS")) {
                    b2 = 4;
                }
                break;
            case 89198:
                if (upperCase.equals("ZUI")) {
                    b2 = 5;
                }
                break;
            case 2018896:
                if (upperCase.equals("ASUS")) {
                    b2 = 6;
                }
                break;
            case 2255112:
                if (upperCase.equals("IQOO")) {
                    b2 = 7;
                }
                break;
            case 2432928:
                if (upperCase.equals("OPPO")) {
                    b2 = 8;
                }
                break;
            case 2634924:
                if (upperCase.equals("VIVO")) {
                    b2 = 9;
                }
                break;
            case 68924490:
                if (upperCase.equals("HONOR")) {
                    b2 = 10;
                }
                break;
            case 73239724:
                if (upperCase.equals("MEIZU")) {
                    b2 = Ascii.f42547VT;
                }
                break;
            case 77852109:
                if (upperCase.equals("REDMI")) {
                    b2 = Ascii.f42536FF;
                }
                break;
            case 1670208650:
                if (upperCase.equals("COOLPAD")) {
                    b2 = Ascii.f42534CR;
                }
                break;
            case 1972178256:
                if (upperCase.equals("HUA_WEI")) {
                    b2 = Ascii.f42544SO;
                }
                break;
            case 2141820391:
                if (upperCase.equals("HUAWEI")) {
                    b2 = Ascii.f42543SI;
                }
                break;
        }
        switch (b2) {
            case 0:
            case 5:
                c3619f = new C3619f();
                break;
            case 1:
                c3619f = new C3625l();
                break;
            case 2:
            case 3:
            case TYPE_BYTES_VALUE:
                c3619f = new C3627n();
                break;
            case 4:
            case 8:
                c3619f = new C3624k();
                break;
            case 6:
                c3619f = new C3614a();
                break;
            case 7:
            case 9:
                c3619f = new C3626m();
                break;
            case 10:
            case 14:
            case 15:
                c3619f = new C3616c();
                break;
            case 11:
                c3619f = new C3620g();
                break;
            case 13:
                c3619f = new C3615b();
                break;
            default:
                c3619f = null;
                break;
        }
        f42311a = c3619f;
    }

    private OaidHelper() {
    }

    public static /* synthetic */ PackageManager access$000(Context context) {
        return getPackageManager(context);
    }

    public static String getOaid(Context context) {
        isSupport(context);
        if (f42313c) {
            return getOaid();
        }
        return null;
    }

    private static PackageManager getPackageManager(Context context) {
        if (f42314d == null) {
            f42314d = context.getPackageManager();
        }
        return f42314d;
    }

    private static void isSupport(Context context) {
        InterfaceC3618e interfaceC3618e = f42311a;
        if (interfaceC3618e == null || context == null) {
            return;
        }
        f42312b = context.getApplicationContext();
        if (isSupportService()) {
            f42313c = interfaceC3618e.mo14391c(f42312b);
        }
    }

    private static boolean isSupportService() {
        InterfaceC3618e interfaceC3618e;
        try {
            Context context = f42312b;
            if (context == null || (interfaceC3618e = f42311a) == null) {
                return false;
            }
            return interfaceC3618e.mo14389a(context);
        } catch (Throwable unused) {
            return false;
        }
    }

    private static String getOaid() {
        InterfaceC3618e interfaceC3618e;
        try {
            Context context = f42312b;
            if (context == null || (interfaceC3618e = f42311a) == null || !f42313c) {
                return null;
            }
            return interfaceC3618e.mo14390b(context);
        } catch (Throwable unused) {
            return null;
        }
    }
}
