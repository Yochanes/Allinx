package com.airbnb.lottie.network;

import androidx.annotation.RestrictTo;
import com.airbnb.lottie.utils.Logger;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class DefaultLottieFetchResult implements LottieFetchResult {

    /* JADX INFO: renamed from: a */
    public final HttpURLConnection f34746a;

    public DefaultLottieFetchResult(HttpURLConnection httpURLConnection) {
        this.f34746a = httpURLConnection;
    }

    /* JADX INFO: renamed from: a */
    public final String m12672a() {
        HttpURLConnection httpURLConnection = this.f34746a;
        try {
            if (m12673b()) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to fetch ");
            sb.append(httpURLConnection.getURL());
            sb.append(". Failed with ");
            sb.append(httpURLConnection.getResponseCode());
            sb.append("\n");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        sb2.append(line);
                        sb2.append('\n');
                    } else {
                        try {
                            break;
                        } catch (Exception unused) {
                        }
                    }
                } finally {
                    try {
                        bufferedReader.close();
                    } catch (Exception unused2) {
                    }
                }
            }
            sb.append(sb2.toString());
            return sb.toString();
        } catch (IOException e) {
            Logger.m12737c("get error failed ", e);
            return e.getMessage();
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m12673b() {
        try {
            return this.f34746a.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f34746a.disconnect();
    }
}
