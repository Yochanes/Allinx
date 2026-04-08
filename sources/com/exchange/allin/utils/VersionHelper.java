package com.exchange.allin.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.FileProvider;
import com.airbnb.lottie.utils.AbstractC2433a;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/utils/VersionHelper;", "", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@SourceDebugExtension
public final class VersionHelper {

    /* JADX INFO: renamed from: a */
    public static final VersionHelper$completeReceiver$1 f41617a = new VersionHelper$completeReceiver$1();

    /* JADX INFO: renamed from: a */
    public static void m14187a(Context context, Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.addFlags(1);
        intent.setDataAndType(FileProvider.getUriForFile(context, "com.exchange.allin.fileProvider", new File(uri.getPath())), "application/vnd.android.package-archive");
        context.startActivity(intent);
    }

    /* JADX INFO: renamed from: b */
    public static void m14188b(Context context, Uri uri) {
        Intrinsics.m18599g(context, "context");
        Intrinsics.m18599g(uri, "uri");
        if (Build.VERSION.SDK_INT < 26) {
            m14187a(context, uri);
        } else if (AbstractC2433a.m12782y(context.getPackageManager())) {
            m14187a(context, uri);
        } else {
            m14187a(context, uri);
        }
    }
}
