package androidx.sqlite.p018db.framework;

import android.content.Context;
import androidx.sqlite.p018db.framework.FrameworkSQLiteOpenHelper;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m18302d2 = {"<anonymous>", "Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper;", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class FrameworkSQLiteOpenHelper$lazyDelegate$1 extends Lambda implements Function0<FrameworkSQLiteOpenHelper.OpenHelper> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FrameworkSQLiteOpenHelper f32138a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrameworkSQLiteOpenHelper$lazyDelegate$1(FrameworkSQLiteOpenHelper frameworkSQLiteOpenHelper) {
        super(0);
        this.f32138a = frameworkSQLiteOpenHelper;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        FrameworkSQLiteOpenHelper.OpenHelper openHelper;
        FrameworkSQLiteOpenHelper frameworkSQLiteOpenHelper = this.f32138a;
        String str = frameworkSQLiteOpenHelper.f32115b;
        Context context = frameworkSQLiteOpenHelper.f32114a;
        if (str == null || !frameworkSQLiteOpenHelper.f32117d) {
            openHelper = new FrameworkSQLiteOpenHelper.OpenHelper(context, frameworkSQLiteOpenHelper.f32115b, new FrameworkSQLiteOpenHelper.DBRefHolder(), frameworkSQLiteOpenHelper.f32116c, frameworkSQLiteOpenHelper.f32118f);
        } else {
            File noBackupFilesDir = context.getNoBackupFilesDir();
            Intrinsics.m18598f(noBackupFilesDir, "context.noBackupFilesDir");
            openHelper = new FrameworkSQLiteOpenHelper.OpenHelper(context, new File(noBackupFilesDir, frameworkSQLiteOpenHelper.f32115b).getAbsolutePath(), new FrameworkSQLiteOpenHelper.DBRefHolder(), frameworkSQLiteOpenHelper.f32116c, frameworkSQLiteOpenHelper.f32118f);
        }
        openHelper.setWriteAheadLoggingEnabled(frameworkSQLiteOpenHelper.f32120i);
        return openHelper;
    }
}
