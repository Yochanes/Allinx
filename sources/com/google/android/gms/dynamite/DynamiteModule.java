package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import p003C.AbstractC0011b;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public final class DynamiteModule {

    @KeepForSdk
    public static final int LOCAL = -1;

    @KeepForSdk
    public static final int NONE = 0;

    @KeepForSdk
    public static final int NO_SELECTION = 0;

    @KeepForSdk
    public static final int REMOTE = 1;

    @Nullable
    @GuardedBy("DynamiteModule.class")
    private static Boolean zzb = null;

    @Nullable
    @GuardedBy("DynamiteModule.class")
    private static String zzc = null;

    @GuardedBy("DynamiteModule.class")
    private static boolean zzd = false;

    @GuardedBy("DynamiteModule.class")
    private static int zze = -1;

    @Nullable
    @GuardedBy("DynamiteModule.class")
    private static Boolean zzf;

    @Nullable
    @GuardedBy("DynamiteModule.class")
    private static zzq zzk;

    @Nullable
    @GuardedBy("DynamiteModule.class")
    private static zzr zzl;
    private final Context zzj;
    private static final ThreadLocal zzg = new ThreadLocal();
    private static final ThreadLocal zzh = new zzd();
    private static final VersionPolicy.IVersions zzi = new zze();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE = new zzf();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_LOCAL = new zzg();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING = new zzh();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new zzi();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new zzj();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new zzk();

    @NonNull
    public static final VersionPolicy zza = new zzl();

    /* JADX INFO: compiled from: Proguard */
    @DynamiteApi
    public static class DynamiteLoaderClassLoader {

        @Nullable
        @GuardedBy("DynamiteLoaderClassLoader.class")
        public static ClassLoader sClassLoader;
    }

    /* JADX INFO: compiled from: Proguard */
    @KeepForSdk
    public static class LoadingException extends Exception {
        public /* synthetic */ LoadingException(String str, zzp zzpVar) {
            super(str);
        }

        public /* synthetic */ LoadingException(String str, Throwable th, zzp zzpVar) {
            super(str, th);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface VersionPolicy {

        /* JADX INFO: compiled from: Proguard */
        @KeepForSdk
        public interface IVersions {
            int zza(@NonNull Context context, @NonNull String str);

            int zzb(@NonNull Context context, @NonNull String str, boolean z2);
        }

        /* JADX INFO: compiled from: Proguard */
        @KeepForSdk
        public static class SelectionResult {

            @KeepForSdk
            public int localVersion = 0;

            @KeepForSdk
            public int remoteVersion = 0;

            @KeepForSdk
            public int selection = 0;
        }

        @NonNull
        @KeepForSdk
        SelectionResult selectModule(@NonNull Context context, @NonNull String str, @NonNull IVersions iVersions);
    }

    private DynamiteModule(Context context) {
        Preconditions.checkNotNull(context);
        this.zzj = context;
    }

    @KeepForSdk
    public static int getLocalVersion(@NonNull Context context, @NonNull String str) {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (Objects.equal(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e.getMessage())));
            return 0;
        }
    }

    @KeepForSdk
    public static int getRemoteVersion(@NonNull Context context, @NonNull String str) {
        return zza(context, str, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0094 A[Catch: all -> 0x0088, TRY_LEAVE, TryCatch #5 {all -> 0x0088, blocks: (B:7:0x0050, B:11:0x0082, B:18:0x008e, B:21:0x0094, B:25:0x009d, B:103:0x01f7, B:104:0x0202, B:107:0x0205, B:108:0x0206, B:109:0x020e, B:110:0x020f, B:112:0x022d, B:114:0x023a, B:124:0x025a, B:125:0x0262, B:126:0x0263, B:127:0x0275, B:128:0x0276, B:129:0x02a3), top: B:149:0x0050, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009a  */
    @NonNull
    @ResultIgnorabilityUnspecified
    @KeepForSdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static DynamiteModule load(@NonNull Context context, @NonNull VersionPolicy versionPolicy, @NonNull String str) throws Throwable {
        long j;
        VersionPolicy.SelectionResult selectionResultSelectModule;
        int i;
        DynamiteModule dynamiteModuleZzc;
        Boolean bool;
        IObjectWrapper iObjectWrapperZzh;
        DynamiteModule dynamiteModule;
        zzr zzrVar;
        boolean z2;
        IObjectWrapper iObjectWrapperZze;
        Cursor cursor;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new LoadingException("null application Context", null);
        }
        ThreadLocal threadLocal = zzg;
        zzn zznVar = (zzn) threadLocal.get();
        zzn zznVar2 = new zzn(null);
        threadLocal.set(zznVar2);
        ThreadLocal threadLocal2 = zzh;
        Long l = (Long) threadLocal2.get();
        long jLongValue = l.longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            selectionResultSelectModule = versionPolicy.selectModule(context, str, zzi);
            i = selectionResultSelectModule.localVersion;
            j = jLongValue;
        } catch (Throwable th) {
            th = th;
            j = jLongValue;
        }
        try {
            Log.i("DynamiteModule", "Considering local module " + str + ":" + i + " and remote module " + str + ":" + selectionResultSelectModule.remoteVersion);
            int i2 = selectionResultSelectModule.selection;
            if (i2 != 0) {
                if (i2 != -1) {
                    if (i2 == 1 || selectionResultSelectModule.remoteVersion != 0) {
                        if (i2 != -1) {
                            dynamiteModuleZzc = zzc(applicationContext, str);
                        } else {
                            if (i2 != 1) {
                                throw new LoadingException("VersionPolicy returned invalid code:" + i2, null);
                            }
                            try {
                                int i3 = selectionResultSelectModule.remoteVersion;
                                try {
                                    synchronized (DynamiteModule.class) {
                                        if (!zzf(context)) {
                                            throw new LoadingException("Remote loading disabled", null);
                                        }
                                        bool = zzb;
                                    }
                                    if (bool == null) {
                                        throw new LoadingException("Failed to determine which loading route to use.", null);
                                    }
                                    if (bool.booleanValue()) {
                                        Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i3);
                                        synchronized (DynamiteModule.class) {
                                            zzrVar = zzl;
                                        }
                                        if (zzrVar == null) {
                                            throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                        }
                                        zzn zznVar3 = (zzn) threadLocal.get();
                                        if (zznVar3 == null || zznVar3.zza == null) {
                                            throw new LoadingException("No result cursor", null);
                                        }
                                        Context applicationContext2 = context.getApplicationContext();
                                        Cursor cursor2 = zznVar3.zza;
                                        ObjectWrapper.wrap(null);
                                        synchronized (DynamiteModule.class) {
                                            z2 = zze >= 2;
                                        }
                                        if (z2) {
                                            Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                            iObjectWrapperZze = zzrVar.zzf(ObjectWrapper.wrap(applicationContext2), str, i3, ObjectWrapper.wrap(cursor2));
                                        } else {
                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                            iObjectWrapperZze = zzrVar.zze(ObjectWrapper.wrap(applicationContext2), str, i3, ObjectWrapper.wrap(cursor2));
                                        }
                                        Context context2 = (Context) ObjectWrapper.unwrap(iObjectWrapperZze);
                                        if (context2 == null) {
                                            throw new LoadingException("Failed to get module context", null);
                                        }
                                        dynamiteModule = new DynamiteModule(context2);
                                    } else {
                                        Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i3);
                                        zzq zzqVarZzg = zzg(context);
                                        if (zzqVarZzg == null) {
                                            throw new LoadingException("Failed to create IDynamiteLoader.", null);
                                        }
                                        int iZze = zzqVarZzg.zze();
                                        if (iZze >= 3) {
                                            zzn zznVar4 = (zzn) threadLocal.get();
                                            if (zznVar4 == null) {
                                                throw new LoadingException("No cached result cursor holder", null);
                                            }
                                            iObjectWrapperZzh = zzqVarZzg.zzi(ObjectWrapper.wrap(context), str, i3, ObjectWrapper.wrap(zznVar4.zza));
                                        } else if (iZze == 2) {
                                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                                            iObjectWrapperZzh = zzqVarZzg.zzj(ObjectWrapper.wrap(context), str, i3);
                                        } else {
                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                            iObjectWrapperZzh = zzqVarZzg.zzh(ObjectWrapper.wrap(context), str, i3);
                                        }
                                        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapperZzh);
                                        if (objUnwrap == null) {
                                            throw new LoadingException("Failed to load remote module.", null);
                                        }
                                        dynamiteModule = new DynamiteModule((Context) objUnwrap);
                                    }
                                    dynamiteModuleZzc = dynamiteModule;
                                } catch (RemoteException e) {
                                    throw new LoadingException("Failed to load remote module.", e, null);
                                } catch (LoadingException e2) {
                                    throw e2;
                                } catch (Throwable th2) {
                                    CrashUtils.addDynamiteErrorToDropBox(context, th2);
                                    throw new LoadingException("Failed to load remote module.", th2, null);
                                }
                            } catch (LoadingException e3) {
                                Log.w("DynamiteModule", "Failed to load remote module: " + e3.getMessage());
                                int i4 = selectionResultSelectModule.localVersion;
                                if (i4 == 0 || versionPolicy.selectModule(context, str, new zzo(i4, 0)).selection != -1) {
                                    throw new LoadingException("Remote load failed. No local fallback found.", e3, null);
                                }
                                dynamiteModuleZzc = zzc(applicationContext, str);
                            }
                        }
                        if (j != 0) {
                            zzh.remove();
                        } else {
                            zzh.set(l);
                        }
                        cursor = zznVar2.zza;
                        if (cursor != null) {
                            cursor.close();
                        }
                        zzg.set(zznVar);
                        return dynamiteModuleZzc;
                    }
                } else if (selectionResultSelectModule.localVersion != 0) {
                    i2 = -1;
                    if (i2 == 1) {
                    }
                    if (i2 != -1) {
                    }
                    if (j != 0) {
                    }
                    cursor = zznVar2.zza;
                    if (cursor != null) {
                    }
                    zzg.set(zznVar);
                    return dynamiteModuleZzc;
                }
            }
            throw new LoadingException("No acceptable module " + str + " found. Local version is " + selectionResultSelectModule.localVersion + " and remote version is " + selectionResultSelectModule.remoteVersion + ".", null);
        } catch (Throwable th3) {
            th = th3;
            if (j == 0) {
                zzh.remove();
            } else {
                zzh.set(l);
            }
            Cursor cursor3 = zznVar2.zza;
            if (cursor3 != null) {
                cursor3.close();
            }
            zzg.set(zznVar);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x017d A[Catch: all -> 0x00ec, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x00ec, blocks: (B:3:0x0002, B:64:0x00e1, B:66:0x00e7, B:74:0x010d, B:102:0x016f, B:106:0x017d, B:124:0x01d2, B:125:0x01d5, B:119:0x01c9, B:72:0x00f2, B:127:0x01d7, B:4:0x0003, B:7:0x0009, B:8:0x0025, B:62:0x00de, B:21:0x0049, B:45:0x00a1, B:48:0x00a4, B:55:0x00bc, B:63:0x00e0, B:61:0x00c2), top: B:134:0x0002, inners: #5, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b0 A[Catch: all -> 0x0036, TryCatch #10 {, blocks: (B:9:0x0026, B:11:0x0032, B:52:0x00b9, B:16:0x003b, B:18:0x0042, B:20:0x0048, B:25:0x004f, B:27:0x0053, B:31:0x005d, B:33:0x0065, B:36:0x006c, B:43:0x0098, B:44:0x00a0, B:39:0x0073, B:41:0x0079, B:42:0x008a, B:47:0x00a3, B:50:0x00a6, B:51:0x00b0, B:17:0x003e), top: B:141:0x0026, inners: #12 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:118:0x01c7 -> B:135:0x01cc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x01c9 -> B:135:0x01cc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zza(@NonNull Context context, @NonNull String str, boolean z2) {
        Field declaredField;
        Throwable th;
        RemoteException remoteException;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = zzb;
                int iZzf = 0;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e.toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                zzd(classLoader);
                            } catch (LoadingException unused) {
                            }
                            bool = Boolean.TRUE;
                        } else {
                            if (!zzf(context)) {
                                return 0;
                            }
                            if (!zzd) {
                                Boolean bool2 = Boolean.TRUE;
                                if (bool2.equals(null)) {
                                    declaredField.set(null, ClassLoader.getSystemClassLoader());
                                    bool = Boolean.FALSE;
                                } else {
                                    try {
                                        int iZzb = zzb(context, str, z2, true);
                                        String str2 = zzc;
                                        if (str2 != null && !str2.isEmpty()) {
                                            ClassLoader classLoaderZza = zzb.zza();
                                            if (classLoaderZza == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    AbstractC0011b.m35d();
                                                    String str3 = zzc;
                                                    Preconditions.checkNotNull(str3);
                                                    classLoaderZza = AbstractC0011b.m34c(ClassLoader.getSystemClassLoader(), str3);
                                                } else {
                                                    String str4 = zzc;
                                                    Preconditions.checkNotNull(str4);
                                                    classLoaderZza = new zzc(str4, ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            zzd(classLoaderZza);
                                            declaredField.set(null, classLoaderZza);
                                            zzb = bool2;
                                            return iZzb;
                                        }
                                        return iZzb;
                                    } catch (LoadingException unused2) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                            Log.w("DynamiteModule", "Failed to load module via V2: " + e.toString());
                            bool = Boolean.FALSE;
                            zzb = bool;
                        }
                        zzb = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return zzb(context, str, z2, false);
                    } catch (LoadingException e2) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e2.getMessage());
                        return 0;
                    }
                }
                zzq zzqVarZzg = zzg(context);
                try {
                    if (zzqVarZzg != null) {
                        try {
                            int iZze = zzqVarZzg.zze();
                            if (iZze >= 3) {
                                zzn zznVar = (zzn) zzg.get();
                                if (zznVar == null || (cursor = zznVar.zza) == null) {
                                    Cursor cursor2 = (Cursor) ObjectWrapper.unwrap(zzqVarZzg.zzk(ObjectWrapper.wrap(context), str, z2, ((Long) zzh.get()).longValue()));
                                    if (cursor2 != null) {
                                        try {
                                            if (cursor2.moveToFirst()) {
                                                int i = cursor2.getInt(0);
                                                cursor = (i <= 0 || !zze(cursor2)) ? cursor2 : null;
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                                iZzf = i;
                                            } else {
                                                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                            }
                                        } catch (RemoteException e3) {
                                            remoteException = e3;
                                            cursor = cursor2;
                                            Log.w("DynamiteModule", "Failed to retrieve remote module version: " + remoteException.getMessage());
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cursor = cursor2;
                                            if (cursor == null) {
                                                throw th;
                                            }
                                            cursor.close();
                                            throw th;
                                        }
                                    } else {
                                        Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                        if (cursor2 != null) {
                                        }
                                    }
                                } else {
                                    iZzf = cursor.getInt(0);
                                }
                            } else if (iZze == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                iZzf = zzqVarZzg.zzg(ObjectWrapper.wrap(context), str, z2);
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                iZzf = zzqVarZzg.zzf(ObjectWrapper.wrap(context), str, z2);
                            }
                        } catch (RemoteException e4) {
                            remoteException = e4;
                        }
                    }
                    return iZzf;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            CrashUtils.addDynamiteErrorToDropBox(context, th4);
            throw th4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int zzb(Context context, String str, boolean z2, boolean z3) throws Throwable {
        Throwable th;
        Exception exc;
        ?? r1 = 0;
        try {
            try {
                boolean z4 = true;
                Cursor cursorQuery = context.getContentResolver().query(new Uri.Builder().scheme(FirebaseAnalytics.Param.CONTENT).authority("com.google.android.gms.chimera").path(true != z2 ? MetricTracker.Place.API : "api_force_staging").appendPath(str).appendQueryParameter("requestStartTime", String.valueOf(((Long) zzh.get()).longValue())).build(), null, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            boolean z5 = false;
                            int i = cursorQuery.getInt(0);
                            if (i > 0) {
                                synchronized (DynamiteModule.class) {
                                    try {
                                        zzc = cursorQuery.getString(2);
                                        int columnIndex = cursorQuery.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            zze = cursorQuery.getInt(columnIndex);
                                        }
                                        int columnIndex2 = cursorQuery.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            if (cursorQuery.getInt(columnIndex2) == 0) {
                                                z4 = false;
                                            }
                                            zzd = z4;
                                            z5 = z4;
                                        }
                                    } finally {
                                    }
                                }
                                if (zze(cursorQuery)) {
                                    cursorQuery = null;
                                }
                            }
                            if (z3 && z5) {
                                throw new LoadingException("forcing fallback to container DynamiteLoader impl", null);
                            }
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return i;
                        }
                    } catch (Exception e) {
                        exc = e;
                        if (exc instanceof LoadingException) {
                            throw exc;
                        }
                        throw new LoadingException("V2 version check failed: " + exc.getMessage(), exc, null);
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new LoadingException("Failed to connect to dynamite module ContentResolver.", null);
            } catch (Throwable th2) {
                th = th2;
                r1 = context;
                if (r1 != 0) {
                    throw th;
                }
                r1.close();
                throw th;
            }
        } catch (Exception e2) {
            exc = e2;
        } catch (Throwable th3) {
            th = th3;
            if (r1 != 0) {
            }
        }
    }

    private static DynamiteModule zzc(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context);
    }

    @GuardedBy("DynamiteModule.class")
    private static void zzd(ClassLoader classLoader) throws LoadingException {
        zzr zzrVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                zzrVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                zzrVar = iInterfaceQueryLocalInterface instanceof zzr ? (zzr) iInterfaceQueryLocalInterface : new zzr(iBinder);
            }
            zzl = zzrVar;
        } catch (ClassNotFoundException e) {
            e = e;
            throw new LoadingException("Failed to instantiate dynamite loader", e, null);
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new LoadingException("Failed to instantiate dynamite loader", e, null);
        } catch (InstantiationException e3) {
            e = e3;
            throw new LoadingException("Failed to instantiate dynamite loader", e, null);
        } catch (NoSuchMethodException e4) {
            e = e4;
            throw new LoadingException("Failed to instantiate dynamite loader", e, null);
        } catch (InvocationTargetException e5) {
            e = e5;
            throw new LoadingException("Failed to instantiate dynamite loader", e, null);
        }
    }

    private static boolean zze(Cursor cursor) {
        zzn zznVar = (zzn) zzg.get();
        if (zznVar == null || zznVar.zza != null) {
            return false;
        }
        zznVar.zza = cursor;
        return true;
    }

    @GuardedBy("DynamiteModule.class")
    private static boolean zzf(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(zzf)) {
            return true;
        }
        boolean z2 = false;
        if (zzf == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z2 = true;
            }
            zzf = Boolean.valueOf(z2);
            if (z2 && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                zzd = true;
            }
        }
        if (!z2) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z2;
    }

    @Nullable
    private static zzq zzg(Context context) {
        zzq zzqVar;
        synchronized (DynamiteModule.class) {
            zzq zzqVar2 = zzk;
            if (zzqVar2 != null) {
                return zzqVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzqVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    zzqVar = iInterfaceQueryLocalInterface instanceof zzq ? (zzq) iInterfaceQueryLocalInterface : new zzq(iBinder);
                }
                if (zzqVar != null) {
                    zzk = zzqVar;
                    return zzqVar;
                }
            } catch (Exception e) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e.getMessage());
            }
            return null;
        }
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public Context getModuleContext() {
        return this.zzj;
    }

    @NonNull
    @KeepForSdk
    public IBinder instantiate(@NonNull String str) throws LoadingException {
        try {
            return (IBinder) this.zzj.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e, null);
        }
    }
}
