package androidx.sqlite.p018db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.compose.animation.AbstractC0455a;
import androidx.sqlite.p018db.framework.FrameworkSQLiteDatabase;
import java.io.Closeable;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, m18302d2 = {"Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "Ljava/io/Closeable;", "Callback", "Configuration", "Factory", "sqlite_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public interface SupportSQLiteOpenHelper extends Closeable {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration;", "", "Builder", "Companion", "sqlite_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Configuration {

        /* JADX INFO: renamed from: a */
        public final Context f32100a;

        /* JADX INFO: renamed from: b */
        public final String f32101b;

        /* JADX INFO: renamed from: c */
        public final Callback f32102c;

        /* JADX INFO: renamed from: d */
        public final boolean f32103d;

        /* JADX INFO: renamed from: e */
        public final boolean f32104e;

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration$Builder;", "", "sqlite_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
        public static class Builder {

            /* JADX INFO: renamed from: a */
            public final Context f32105a;

            /* JADX INFO: renamed from: b */
            public String f32106b;

            /* JADX INFO: renamed from: c */
            public Callback f32107c;

            /* JADX INFO: renamed from: d */
            public boolean f32108d;

            /* JADX INFO: renamed from: e */
            public boolean f32109e;

            public Builder(Context context) {
                this.f32105a = context;
            }

            /* JADX INFO: renamed from: a */
            public final Configuration m11936a() {
                String str;
                Callback callback = this.f32107c;
                if (callback == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                if (this.f32108d && ((str = this.f32106b) == null || str.length() == 0)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
                return new Configuration(this.f32105a, this.f32106b, callback, this.f32108d, this.f32109e);
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration$Companion;", "", "sqlite_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
        public static final class Companion {
        }

        public Configuration(Context context, String str, Callback callback, boolean z2, boolean z3) {
            Intrinsics.m18599g(callback, "callback");
            this.f32100a = context;
            this.f32101b = str;
            this.f32102c = callback;
            this.f32103d = z2;
            this.f32104e = z3;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m18302d2 = {"Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;", "", "sqlite_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public interface Factory {
        /* JADX INFO: renamed from: e */
        SupportSQLiteOpenHelper mo189e(Configuration configuration);
    }

    /* JADX INFO: renamed from: c0 */
    SupportSQLiteDatabase mo11760c0();

    void setWriteAheadLoggingEnabled(boolean z2);

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;", "", "Companion", "sqlite_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static abstract class Callback {

        /* JADX INFO: renamed from: a */
        public final int f32099a;

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback$Companion;", "", "", "TAG", "Ljava/lang/String;", "sqlite_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
        public static final class Companion {
        }

        public Callback(int i) {
            this.f32099a = i;
        }

        /* JADX INFO: renamed from: a */
        public static void m11935a(String str) {
            if (str.equalsIgnoreCase(":memory:")) {
                return;
            }
            int length = str.length() - 1;
            int i = 0;
            boolean z2 = false;
            while (i <= length) {
                boolean z3 = Intrinsics.m18601i(str.charAt(!z2 ? i : length), 32) <= 0;
                if (z2) {
                    if (!z3) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z3) {
                    i++;
                } else {
                    z2 = true;
                }
            }
            if (str.subSequence(i, length + 1).toString().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: ".concat(str));
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception e) {
                Log.w("SupportSQLite", "delete failed: ", e);
            }
        }

        /* JADX INFO: renamed from: c */
        public abstract void mo11830c(FrameworkSQLiteDatabase frameworkSQLiteDatabase);

        /* JADX INFO: renamed from: d */
        public void mo11831d(FrameworkSQLiteDatabase frameworkSQLiteDatabase, int i, int i2) {
            throw new SQLiteException(AbstractC0455a.m2237l(i, i2, "Can't downgrade database from version ", " to "));
        }

        /* JADX INFO: renamed from: f */
        public abstract void mo11833f(FrameworkSQLiteDatabase frameworkSQLiteDatabase, int i, int i2);

        /* JADX INFO: renamed from: b */
        public void mo11829b(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        }

        /* JADX INFO: renamed from: e */
        public void mo11832e(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        }
    }
}
