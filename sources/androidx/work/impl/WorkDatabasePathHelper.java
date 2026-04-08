package androidx.work.impl;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/work/impl/WorkDatabasePathHelper;", "", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@RestrictTo
@SourceDebugExtension
public final class WorkDatabasePathHelper {
    /* JADX INFO: renamed from: a */
    public static final void m12143a(Context context) {
        Map mapM18485h;
        Intrinsics.m18599g(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        Intrinsics.m18598f(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        if (databasePath.exists()) {
            Logger.m12100e().mo12102a(WorkDatabasePathHelperKt.f32712a, "Migrating WorkDatabase to the no-backup directory");
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            Intrinsics.m18598f(databasePath2, "context.getDatabasePath(WORK_DATABASE_NAME)");
            File noBackupFilesDir = context.getNoBackupFilesDir();
            Intrinsics.m18598f(noBackupFilesDir, "context.noBackupFilesDir");
            File file = new File(noBackupFilesDir, "androidx.work.workdb");
            String[] strArr = WorkDatabasePathHelperKt.f32713b;
            int iM18484g = MapsKt.m18484g(strArr.length);
            if (iM18484g < 16) {
                iM18484g = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM18484g);
            for (String str : strArr) {
                linkedHashMap.put(new File(databasePath2.getPath() + str), new File(file.getPath() + str));
            }
            Pair pair = new Pair(databasePath2, file);
            if (linkedHashMap.isEmpty()) {
                mapM18485h = MapsKt.m18485h(pair);
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                linkedHashMap2.put(databasePath2, file);
                mapM18485h = linkedHashMap2;
            }
            for (Map.Entry entry : mapM18485h.entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        Logger.m12100e().mo12107h(WorkDatabasePathHelperKt.f32712a, "Over-writing contents of " + file3);
                    }
                    Logger.m12100e().mo12102a(WorkDatabasePathHelperKt.f32712a, file2.renameTo(file3) ? "Migrated " + file2 + "to " + file3 : "Renaming " + file2 + " to " + file3 + " failed");
                }
            }
        }
    }
}
