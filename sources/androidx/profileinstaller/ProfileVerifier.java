package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.concurrent.futures.ResolvableFuture;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class ProfileVerifier {

    /* JADX INFO: renamed from: a */
    public static final ResolvableFuture f31499a = new ResolvableFuture();

    /* JADX INFO: renamed from: b */
    public static final Object f31500b = new Object();

    /* JADX INFO: renamed from: c */
    public static CompilationStatus f31501c = null;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api33Impl {
        /* JADX INFO: renamed from: a */
        public static PackageInfo m11519a(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RestrictTo
    public static class Cache {

        /* JADX INFO: renamed from: a */
        public final int f31502a;

        /* JADX INFO: renamed from: b */
        public final int f31503b;

        /* JADX INFO: renamed from: c */
        public final long f31504c;

        /* JADX INFO: renamed from: d */
        public final long f31505d;

        public Cache(int i, int i2, long j, long j2) {
            this.f31502a = i;
            this.f31503b = i2;
            this.f31504c = j;
            this.f31505d = j2;
        }

        /* JADX INFO: renamed from: a */
        public static Cache m11520a(File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                Cache cache = new Cache(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return cache;
            } finally {
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m11521b(File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f31502a);
                dataOutputStream.writeInt(this.f31503b);
                dataOutputStream.writeLong(this.f31504c);
                dataOutputStream.writeLong(this.f31505d);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof Cache)) {
                Cache cache = (Cache) obj;
                if (this.f31503b == cache.f31503b && this.f31504c == cache.f31504c && this.f31502a == cache.f31502a && this.f31505d == cache.f31505d) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(Integer.valueOf(this.f31503b), Long.valueOf(this.f31504c), Integer.valueOf(this.f31502a), Long.valueOf(this.f31505d));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class CompilationStatus {

        /* JADX INFO: compiled from: Proguard */
        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface ResultCode {
        }
    }

    /* JADX INFO: renamed from: a */
    public static long m11516a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? Api33Impl.m11519a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* JADX INFO: renamed from: b */
    public static CompilationStatus m11517b() {
        CompilationStatus compilationStatus = new CompilationStatus();
        f31501c = compilationStatus;
        f31499a.set(compilationStatus);
        return f31501c;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m11518c(Context context, boolean z2) {
        int i;
        boolean z3;
        int i2;
        long length;
        File file;
        Cache cacheM11520a;
        Cache cache;
        int i3;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        if (z2 || f31501c == null) {
            synchronized (f31500b) {
                if (z2) {
                    i = 0;
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    if (assetFileDescriptorOpenFd.getLength() <= 0) {
                    }
                    assetFileDescriptorOpenFd.close();
                    i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 28) {
                        File file2 = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                        long length2 = file2.length();
                        if (file2.exists()) {
                            File file3 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                            length = file3.length();
                            if (file3.exists()) {
                                long jM11516a = m11516a(context);
                                file = new File(context.getFilesDir(), "profileInstalled");
                                if (file.exists()) {
                                }
                                if (cacheM11520a == null) {
                                    if (z3) {
                                    }
                                }
                                if (z2) {
                                    i = 2;
                                }
                                if (cacheM11520a != null) {
                                    i = 3;
                                }
                                cache = new Cache(1, i, jM11516a, length);
                                if (cacheM11520a != null) {
                                    cache.m11521b(file);
                                }
                                m11517b();
                                return;
                            }
                        }
                    }
                    m11517b();
                    return;
                }
                if (f31501c != null) {
                    return;
                }
                i = 0;
                try {
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    try {
                        z3 = assetFileDescriptorOpenFd.getLength() <= 0;
                        assetFileDescriptorOpenFd.close();
                    } finally {
                    }
                } catch (IOException unused) {
                    z3 = false;
                }
                i2 = Build.VERSION.SDK_INT;
                if (i2 >= 28 && i2 != 30) {
                    File file22 = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length22 = file22.length();
                    boolean z4 = !file22.exists() && length22 > 0;
                    File file32 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    length = file32.length();
                    boolean z5 = !file32.exists() && length > 0;
                    try {
                        long jM11516a2 = m11516a(context);
                        file = new File(context.getFilesDir(), "profileInstalled");
                        if (file.exists()) {
                            cacheM11520a = null;
                        } else {
                            try {
                                cacheM11520a = Cache.m11520a(file);
                            } catch (IOException unused2) {
                                m11517b();
                                return;
                            }
                        }
                        if (cacheM11520a == null && cacheM11520a.f31504c == jM11516a2 && (i3 = cacheM11520a.f31503b) != 2) {
                            i = i3;
                        } else if (z3) {
                            i = 327680;
                        } else if (z4) {
                            i = 1;
                        } else if (z5) {
                            i = 2;
                        }
                        if (z2 && z5 && i != 1) {
                            i = 2;
                        }
                        if (cacheM11520a != null && cacheM11520a.f31503b == 2 && i == 1 && length22 < cacheM11520a.f31505d) {
                            i = 3;
                        }
                        cache = new Cache(1, i, jM11516a2, length);
                        if (cacheM11520a != null || !cacheM11520a.equals(cache)) {
                            try {
                                cache.m11521b(file);
                            } catch (IOException unused3) {
                            }
                        }
                        m11517b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused4) {
                        m11517b();
                        return;
                    }
                }
                m11517b();
                return;
            }
        }
    }
}
