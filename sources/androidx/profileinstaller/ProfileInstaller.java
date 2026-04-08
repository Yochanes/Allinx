package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import androidx.annotation.RestrictTo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ProfileInstaller {

    /* JADX INFO: renamed from: a */
    public static final DiagnosticsCallback f31495a = new C21071();

    /* JADX INFO: renamed from: b */
    public static final DiagnosticsCallback f31496b = new C21082();

    /* JADX INFO: renamed from: androidx.profileinstaller.ProfileInstaller$2 */
    /* JADX INFO: compiled from: Proguard */
    public class C21082 implements DiagnosticsCallback {
        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        /* JADX INFO: renamed from: a */
        public final void mo11499a(int i, Serializable serializable) {
            String str;
            switch (i) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case 2:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case 3:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case 4:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case 5:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case 6:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case 7:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case 8:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                case 9:
                default:
                    str = "";
                    break;
                case 10:
                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                case 11:
                    str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
            }
            if (i == 6 || i == 7 || i == 8) {
                Log.e("ProfileInstaller", str, (Throwable) serializable);
            } else {
                Log.d("ProfileInstaller", str);
            }
        }

        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        /* JADX INFO: renamed from: b */
        public final void mo11500b() {
            Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface DiagnosticCode {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface DiagnosticsCallback {
        /* JADX INFO: renamed from: a */
        void mo11499a(int i, Serializable serializable);

        /* JADX INFO: renamed from: b */
        void mo11500b();
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ResultCode {
    }

    /* JADX INFO: renamed from: a */
    public static void m11501a(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x02da A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x016b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x01c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0153  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m11502b(Context context, Executor executor, DiagnosticsCallback diagnosticsCallback, boolean z2) {
        char c2;
        FileInputStream fileInputStreamM11491a;
        DexProfileData[] dexProfileDataArrM11509g;
        DexProfileData[] dexProfileDataArr;
        DexProfileData[] dexProfileDataArr2;
        byte[] bArr;
        boolean z3;
        Throwable th;
        Throwable th2;
        boolean z4;
        byte[] bArr2;
        ByteArrayOutputStream byteArrayOutputStream;
        int i;
        DeviceProfileWriter deviceProfileWriter;
        FileInputStream fileInputStreamM11491a2;
        boolean z5;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z2) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j = dataInputStream.readLong();
                            dataInputStream.close();
                            z5 = j == packageInfo.lastUpdateTime;
                            if (z5) {
                                diagnosticsCallback.mo11499a(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                        z5 = false;
                    }
                    if (z5) {
                    }
                } else {
                    z5 = false;
                    if (z5) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        ProfileVerifier.m11518c(context, false);
                        return;
                    }
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            DeviceProfileWriter deviceProfileWriter2 = new DeviceProfileWriter(assets, executor, diagnosticsCallback, name, file2);
            byte[] bArr3 = deviceProfileWriter2.f31474c;
            if (bArr3 != null) {
                if (file2.exists()) {
                    if (!file2.canWrite()) {
                        deviceProfileWriter2.m11492b(4, null);
                    }
                    deviceProfileWriter2.f31477f = true;
                    byte[] bArr4 = ProfileTranscoder.f31497a;
                    try {
                        fileInputStreamM11491a = deviceProfileWriter2.m11491a(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e) {
                        diagnosticsCallback.mo11499a(6, e);
                        fileInputStreamM11491a = null;
                    } catch (IOException e2) {
                        diagnosticsCallback.mo11499a(7, e2);
                        fileInputStreamM11491a = null;
                    }
                    c2 = '\b';
                    try {
                        try {
                        } catch (IOException e3) {
                            diagnosticsCallback.mo11499a(7, e3);
                        }
                        if (fileInputStreamM11491a != null) {
                            try {
                                try {
                                } catch (IllegalStateException e4) {
                                    diagnosticsCallback.mo11499a(8, e4);
                                    fileInputStreamM11491a.close();
                                    dexProfileDataArrM11509g = null;
                                    deviceProfileWriter2.f31478g = dexProfileDataArrM11509g;
                                    dexProfileDataArr = deviceProfileWriter2.f31478g;
                                    if (dexProfileDataArr != null) {
                                    }
                                    DiagnosticsCallback diagnosticsCallback2 = deviceProfileWriter2.f31473b;
                                    dexProfileDataArr2 = deviceProfileWriter2.f31478g;
                                    if (dexProfileDataArr2 != null) {
                                    }
                                    bArr = deviceProfileWriter2.f31479h;
                                    if (bArr != null) {
                                    }
                                    if (z3) {
                                    }
                                    z4 = z3;
                                    ProfileVerifier.m11518c(context, (z4 || !z2) ? 0 : c2);
                                }
                            } catch (IOException e5) {
                                diagnosticsCallback.mo11499a(7, e5);
                                fileInputStreamM11491a.close();
                                dexProfileDataArrM11509g = null;
                                deviceProfileWriter2.f31478g = dexProfileDataArrM11509g;
                                dexProfileDataArr = deviceProfileWriter2.f31478g;
                                if (dexProfileDataArr != null) {
                                }
                                DiagnosticsCallback diagnosticsCallback22 = deviceProfileWriter2.f31473b;
                                dexProfileDataArr2 = deviceProfileWriter2.f31478g;
                                if (dexProfileDataArr2 != null) {
                                }
                                bArr = deviceProfileWriter2.f31479h;
                                if (bArr != null) {
                                }
                                if (z3) {
                                }
                                z4 = z3;
                                ProfileVerifier.m11518c(context, (z4 || !z2) ? 0 : c2);
                            }
                            if (!Arrays.equals(bArr4, Encoding.m11494b(fileInputStreamM11491a, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            dexProfileDataArrM11509g = ProfileTranscoder.m11509g(fileInputStreamM11491a, Encoding.m11494b(fileInputStreamM11491a, 4), deviceProfileWriter2.f31476e);
                            try {
                                fileInputStreamM11491a.close();
                            } catch (IOException e6) {
                                diagnosticsCallback.mo11499a(7, e6);
                            }
                            deviceProfileWriter2.f31478g = dexProfileDataArrM11509g;
                        }
                        dexProfileDataArr = deviceProfileWriter2.f31478g;
                        if (dexProfileDataArr != null && ((i = Build.VERSION.SDK_INT) >= 31 || i == 24 || i == 25)) {
                            try {
                                fileInputStreamM11491a2 = deviceProfileWriter2.m11491a(assets, "dexopt/baseline.profm");
                            } catch (FileNotFoundException e7) {
                                diagnosticsCallback.mo11499a(9, e7);
                                deviceProfileWriter = null;
                            } catch (IOException e8) {
                                diagnosticsCallback.mo11499a(7, e8);
                                deviceProfileWriter = null;
                            } catch (IllegalStateException e9) {
                                deviceProfileWriter2.f31478g = null;
                                diagnosticsCallback.mo11499a(8, e9);
                                deviceProfileWriter = null;
                            }
                            if (fileInputStreamM11491a2 == null) {
                                try {
                                    if (!Arrays.equals(ProfileTranscoder.f31498b, Encoding.m11494b(fileInputStreamM11491a2, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    deviceProfileWriter2.f31478g = ProfileTranscoder.m11506d(fileInputStreamM11491a2, Encoding.m11494b(fileInputStreamM11491a2, 4), bArr3, dexProfileDataArr);
                                    fileInputStreamM11491a2.close();
                                    deviceProfileWriter = deviceProfileWriter2;
                                } finally {
                                }
                            } else {
                                if (fileInputStreamM11491a2 != null) {
                                    fileInputStreamM11491a2.close();
                                }
                                deviceProfileWriter = null;
                            }
                            if (deviceProfileWriter != null) {
                                deviceProfileWriter2 = deviceProfileWriter;
                            }
                        }
                        DiagnosticsCallback diagnosticsCallback222 = deviceProfileWriter2.f31473b;
                        dexProfileDataArr2 = deviceProfileWriter2.f31478g;
                        if (dexProfileDataArr2 != null && (bArr2 = deviceProfileWriter2.f31474c) != null) {
                            if (deviceProfileWriter2.f31477f) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr4);
                                    byteArrayOutputStream.write(bArr2);
                                } finally {
                                }
                            } catch (IOException e10) {
                                diagnosticsCallback222.mo11499a(7, e10);
                            } catch (IllegalStateException e11) {
                                diagnosticsCallback222.mo11499a(8, e11);
                            }
                            if (ProfileTranscoder.m11511i(byteArrayOutputStream, bArr2, dexProfileDataArr2)) {
                                deviceProfileWriter2.f31479h = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                deviceProfileWriter2.f31478g = null;
                            } else {
                                diagnosticsCallback222.mo11499a(5, null);
                                deviceProfileWriter2.f31478g = null;
                                byteArrayOutputStream.close();
                            }
                        }
                        bArr = deviceProfileWriter2.f31479h;
                        if (bArr != null) {
                            z3 = false;
                            c2 = 1;
                        } else {
                            try {
                                if (!deviceProfileWriter2.f31477f) {
                                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                }
                                try {
                                    try {
                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                                        try {
                                            try {
                                                FileOutputStream fileOutputStream = new FileOutputStream(deviceProfileWriter2.f31475d);
                                                try {
                                                    try {
                                                        FileChannel channel = fileOutputStream.getChannel();
                                                        try {
                                                            FileLock fileLockTryLock = channel.tryLock();
                                                            try {
                                                                try {
                                                                    if (fileLockTryLock != null) {
                                                                        try {
                                                                            if (fileLockTryLock.isValid()) {
                                                                                byte[] bArr5 = new byte[512];
                                                                                while (true) {
                                                                                    int i2 = byteArrayInputStream.read(bArr5);
                                                                                    if (i2 <= 0) {
                                                                                        break;
                                                                                    } else {
                                                                                        fileOutputStream.write(bArr5, 0, i2);
                                                                                    }
                                                                                }
                                                                                c2 = 1;
                                                                                deviceProfileWriter2.m11492b(1, null);
                                                                                fileLockTryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                deviceProfileWriter2.f31479h = null;
                                                                                deviceProfileWriter2.f31478g = null;
                                                                                z3 = true;
                                                                            }
                                                                        } catch (Throwable th3) {
                                                                            th = th3;
                                                                            Throwable th4 = th;
                                                                            if (fileLockTryLock == null) {
                                                                                throw th4;
                                                                            }
                                                                            try {
                                                                                fileLockTryLock.close();
                                                                                throw th4;
                                                                            } catch (Throwable th5) {
                                                                                th4.addSuppressed(th5);
                                                                                throw th4;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th6) {
                                                                    th = th6;
                                                                    Throwable th7 = th;
                                                                    if (channel == null) {
                                                                        throw th7;
                                                                    }
                                                                    try {
                                                                        channel.close();
                                                                        throw th7;
                                                                    } catch (Throwable th8) {
                                                                        th7.addSuppressed(th8);
                                                                        throw th7;
                                                                    }
                                                                    th2 = th;
                                                                    try {
                                                                        fileOutputStream.close();
                                                                        throw th2;
                                                                    } catch (Throwable th9) {
                                                                        th2.addSuppressed(th9);
                                                                        throw th2;
                                                                    }
                                                                }
                                                            } catch (Throwable th10) {
                                                                th = th10;
                                                            }
                                                        } catch (Throwable th11) {
                                                            th = th11;
                                                        }
                                                    } catch (Throwable th12) {
                                                        th = th12;
                                                        th2 = th;
                                                        fileOutputStream.close();
                                                        throw th2;
                                                    }
                                                } catch (Throwable th13) {
                                                    th = th13;
                                                    th2 = th;
                                                    fileOutputStream.close();
                                                    throw th2;
                                                }
                                            } catch (Throwable th14) {
                                                th = th14;
                                                th = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th;
                                                } catch (Throwable th15) {
                                                    th.addSuppressed(th15);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th16) {
                                            th = th16;
                                            th = th;
                                            byteArrayInputStream.close();
                                            throw th;
                                        }
                                    } catch (FileNotFoundException e12) {
                                        e = e12;
                                        deviceProfileWriter2.m11492b(6, e);
                                        z3 = false;
                                        if (z3) {
                                        }
                                        z4 = z3;
                                        ProfileVerifier.m11518c(context, (z4 || !z2) ? 0 : c2);
                                    } catch (IOException e13) {
                                        e = e13;
                                        deviceProfileWriter2.m11492b(7, e);
                                        z3 = false;
                                        if (z3) {
                                        }
                                        z4 = z3;
                                        ProfileVerifier.m11518c(context, (z4 || !z2) ? 0 : c2);
                                    }
                                } catch (FileNotFoundException e14) {
                                    e = e14;
                                    c2 = 1;
                                    deviceProfileWriter2.m11492b(6, e);
                                    z3 = false;
                                    if (z3) {
                                    }
                                    z4 = z3;
                                    ProfileVerifier.m11518c(context, (z4 || !z2) ? 0 : c2);
                                } catch (IOException e15) {
                                    e = e15;
                                    c2 = 1;
                                    deviceProfileWriter2.m11492b(7, e);
                                    z3 = false;
                                    if (z3) {
                                    }
                                    z4 = z3;
                                    ProfileVerifier.m11518c(context, (z4 || !z2) ? 0 : c2);
                                }
                            } finally {
                                deviceProfileWriter2.f31479h = null;
                                deviceProfileWriter2.f31478g = null;
                            }
                        }
                        if (z3) {
                            m11501a(packageInfo, filesDir);
                        }
                        z4 = z3;
                    } finally {
                    }
                } else {
                    try {
                        if (!file2.createNewFile()) {
                            deviceProfileWriter2.m11492b(4, null);
                        }
                        deviceProfileWriter2.f31477f = true;
                        byte[] bArr42 = ProfileTranscoder.f31497a;
                        fileInputStreamM11491a = deviceProfileWriter2.m11491a(assets, "dexopt/baseline.prof");
                        c2 = '\b';
                        if (fileInputStreamM11491a != null) {
                        }
                        dexProfileDataArr = deviceProfileWriter2.f31478g;
                        if (dexProfileDataArr != null) {
                            fileInputStreamM11491a2 = deviceProfileWriter2.m11491a(assets, "dexopt/baseline.profm");
                            if (fileInputStreamM11491a2 == null) {
                            }
                            if (deviceProfileWriter != null) {
                            }
                        }
                        DiagnosticsCallback diagnosticsCallback2222 = deviceProfileWriter2.f31473b;
                        dexProfileDataArr2 = deviceProfileWriter2.f31478g;
                        if (dexProfileDataArr2 != null) {
                            if (deviceProfileWriter2.f31477f) {
                            }
                        }
                        bArr = deviceProfileWriter2.f31479h;
                        if (bArr != null) {
                        }
                        if (z3) {
                        }
                        z4 = z3;
                    } catch (IOException unused2) {
                        c2 = 1;
                        deviceProfileWriter2.m11492b(4, null);
                    }
                }
                ProfileVerifier.m11518c(context, (z4 || !z2) ? 0 : c2);
            }
            deviceProfileWriter2.m11492b(3, Integer.valueOf(Build.VERSION.SDK_INT));
            c2 = 1;
            z4 = false;
            ProfileVerifier.m11518c(context, (z4 || !z2) ? 0 : c2);
        } catch (PackageManager.NameNotFoundException e16) {
            diagnosticsCallback.mo11499a(7, e16);
            ProfileVerifier.m11518c(context, false);
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.ProfileInstaller$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C21071 implements DiagnosticsCallback {
        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        /* JADX INFO: renamed from: b */
        public final void mo11500b() {
        }

        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        /* JADX INFO: renamed from: a */
        public final void mo11499a(int i, Serializable serializable) {
        }
    }
}
