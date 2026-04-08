package com.airbnb.lottie.network;

import androidx.annotation.RestrictTo;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class DefaultLottieNetworkFetcher implements LottieNetworkFetcher {
    /* JADX INFO: renamed from: a */
    public final DefaultLottieFetchResult m12674a(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new DefaultLottieFetchResult(httpURLConnection);
    }
}
