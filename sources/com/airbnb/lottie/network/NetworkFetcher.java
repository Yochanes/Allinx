package com.airbnb.lottie.network;

import android.content.Context;
import androidx.annotation.RestrictTo;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieResult;
import com.airbnb.lottie.utils.Logger;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.zip.ZipInputStream;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class NetworkFetcher {

    /* JADX INFO: renamed from: a */
    public final NetworkCache f34752a;

    /* JADX INFO: renamed from: b */
    public final DefaultLottieNetworkFetcher f34753b;

    public NetworkFetcher(NetworkCache networkCache, DefaultLottieNetworkFetcher defaultLottieNetworkFetcher) {
        this.f34752a = networkCache;
        this.f34753b = defaultLottieNetworkFetcher;
    }

    /* JADX INFO: renamed from: a */
    public final LottieResult m12678a(Context context, String str, InputStream inputStream, String str2, String str3) {
        LottieResult lottieResultM12563g;
        FileExtension fileExtension;
        if (str2 == null) {
            str2 = "application/json";
        }
        boolean zContains = str2.contains("application/zip");
        NetworkCache networkCache = this.f34752a;
        if (zContains || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            Logger.m12735a();
            FileExtension fileExtension2 = FileExtension.ZIP;
            lottieResultM12563g = str3 != null ? LottieCompositionFactory.m12563g(context, new ZipInputStream(new FileInputStream(networkCache.m12677c(str, inputStream, fileExtension2))), str) : LottieCompositionFactory.m12563g(context, new ZipInputStream(inputStream), null);
            fileExtension = fileExtension2;
        } else {
            Logger.m12735a();
            fileExtension = FileExtension.JSON;
            lottieResultM12563g = str3 != null ? LottieCompositionFactory.m12559c(new FileInputStream(networkCache.m12677c(str, inputStream, fileExtension).getAbsolutePath()), str) : LottieCompositionFactory.m12559c(inputStream, null);
        }
        if (str3 != null && lottieResultM12563g.f34100a != null) {
            File file = new File(networkCache.m12676b(), NetworkCache.m12675a(str, fileExtension, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            boolean zRenameTo = file.renameTo(file2);
            file2.toString();
            Logger.m12735a();
            if (!zRenameTo) {
                Logger.m12736b("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
            }
        }
        return lottieResultM12563g;
    }
}
