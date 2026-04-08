package com.chiclaim.android.downloader.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.core.content.FileProvider;
import com.airbnb.lottie.utils.AbstractC2433a;
import com.chiclaim.android.downloader.UpgradePermissionDialogActivity;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"downloader_release"}, m18303k = 2, m18304mv = {1, 6, 0}, m18306xi = 48)
@JvmName
public final class InstallUtils {
    /* JADX INFO: renamed from: a */
    public static final Intent m12872a(Context context, Uri uri) {
        Intrinsics.m18599g(context, "context");
        if (Build.VERSION.SDK_INT >= 26 ? AbstractC2433a.m12782y(context.getPackageManager()) : true) {
            Intent intent = new Intent("android.intent.action.VIEW");
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            intent.addFlags(1);
            intent.setDataAndType(uri, "application/vnd.android.package-archive");
            return intent;
        }
        int i = UpgradePermissionDialogActivity.f35099c;
        String string = uri.toString();
        Intrinsics.m18598f(string, "uri.toString()");
        Intent intent2 = new Intent(context, (Class<?>) UpgradePermissionDialogActivity.class);
        if (!(context instanceof Activity)) {
            intent2.addFlags(268435456);
        }
        intent2.putExtra("extra_uri_path", string);
        return intent2;
    }

    /* JADX INFO: renamed from: b */
    public static final Intent m12873b(Context context, File file) {
        Intrinsics.m18599g(context, "context");
        Uri uriForFile = FileProvider.getUriForFile(context, Intrinsics.m18604l(".file.download.fileProvider", context.getPackageName()), file);
        Intrinsics.m18598f(uriForFile, "{\n        FileProvider.g…  apkFile\n        )\n    }");
        return m12872a(context, uriForFile);
    }
}
