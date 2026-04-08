package androidx.sqlite.p018db;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, m18302d2 = {"Landroidx/sqlite/db/SupportSQLiteCompat;", "", "Api16Impl", "Api19Impl", "Api21Impl", "Api23Impl", "Api29Impl", "sqlite_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@RestrictTo
public final class SupportSQLiteCompat {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/sqlite/db/SupportSQLiteCompat$Api16Impl;", "", "sqlite_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @RequiresApi
    @RestrictTo
    public static final class Api16Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/sqlite/db/SupportSQLiteCompat$Api19Impl;", "", "sqlite_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @RequiresApi
    @RestrictTo
    public static final class Api19Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/sqlite/db/SupportSQLiteCompat$Api21Impl;", "", "sqlite_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @RequiresApi
    @RestrictTo
    public static final class Api21Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/sqlite/db/SupportSQLiteCompat$Api23Impl;", "", "sqlite_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @RequiresApi
    @RestrictTo
    public static final class Api23Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/sqlite/db/SupportSQLiteCompat$Api29Impl;", "", "sqlite_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @RequiresApi
    @RestrictTo
    public static final class Api29Impl {
        /* JADX INFO: renamed from: a */
        public static final List m11933a(Cursor cursor) {
            Intrinsics.m18599g(cursor, "cursor");
            List<Uri> notificationUris = cursor.getNotificationUris();
            Intrinsics.m18596d(notificationUris);
            return notificationUris;
        }

        /* JADX INFO: renamed from: b */
        public static final void m11934b(Cursor cursor, ContentResolver contentResolver, List list) {
            Intrinsics.m18599g(cursor, "cursor");
            cursor.setNotificationUris(contentResolver, list);
        }
    }
}
