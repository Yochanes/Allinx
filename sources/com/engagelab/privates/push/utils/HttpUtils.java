package com.engagelab.privates.push.utils;

import android.content.Context;
import com.engagelab.privates.common.constants.MTCommonConstants;
import com.engagelab.privates.common.https.HostVerifier;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.common.utils.SystemUtil;
import com.engagelab.privates.common.utils.Utils;
import com.exchange.allin.p024ui.page.account.register.AbstractC2929c;
import com.google.common.net.HttpHeaders;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class HttpUtils {
    private static final String TAG = "HttpClient";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e8 A[Catch: all -> 0x00ed, Exception -> 0x015c, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x00ed, blocks: (B:54:0x00dd, B:56:0x00e8), top: B:93:0x00dd }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011d A[Catch: all -> 0x0121, Exception -> 0x015c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0121, blocks: (B:64:0x0112, B:66:0x011d), top: B:91:0x0112 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014f A[Catch: all -> 0x0153, Exception -> 0x015c, TRY_ENTER, TRY_LEAVE, TryCatch #10 {all -> 0x0153, blocks: (B:72:0x0144, B:74:0x014f), top: B:97:0x0144 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015f  */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r9v16, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r9v21, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] get(Context context, String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream inputStream;
        ?? th = SystemUtil.isNetworkConnecting(context);
        try {
            try {
                if (th == 0) {
                    MTCommonLog.m13010d(TAG, "can't get, network is disConnected");
                    return null;
                }
                try {
                    th = (HttpURLConnection) new URL(str).openConnection();
                    try {
                        th.setRequestMethod("GET");
                        th.setConnectTimeout(6000);
                        th.setReadTimeout(6000);
                        th.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, "identity");
                        th.addRequestProperty(HttpHeaders.CONNECTION, "Close");
                        th.setRequestProperty("Charset", MTCommonConstants.UTF_8);
                        if (th instanceof HttpsURLConnection) {
                            ((HttpsURLConnection) th).setHostnameVerifier(new HostVerifier(th.getURL().getHost()));
                        }
                        th.setDoInput(true);
                        th.setUseCaches(false);
                        th.connect();
                    } catch (MalformedURLException e) {
                        e = e;
                        inputStream = null;
                    } catch (IOException e2) {
                        e = e2;
                        inputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = null;
                    }
                } catch (MalformedURLException e3) {
                    e = e3;
                    th = 0;
                    inputStream = null;
                } catch (IOException e4) {
                    e = e4;
                    th = 0;
                    inputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    th = 0;
                    inputStream = null;
                }
                try {
                    if (th.getResponseCode() == 200) {
                        inputStream = th.getInputStream();
                        try {
                            byteArrayOutputStream = new ByteArrayOutputStream();
                        } catch (MalformedURLException e5) {
                            e = e5;
                            byteArrayOutputStream = null;
                            MTCommonLog.m13013w(TAG, "get malformedURLException:" + e.getMessage());
                            try {
                                if (th != 0) {
                                    th.disconnect();
                                    th = th;
                                }
                            } catch (Throwable th4) {
                            }
                            if (byteArrayOutputStream == null) {
                            }
                        } catch (IOException e6) {
                            e = e6;
                            byteArrayOutputStream = null;
                            MTCommonLog.m13013w(TAG, "get ioException:" + e.getMessage());
                            try {
                                Utils.closeQuietly(byteArrayOutputStream);
                                Utils.closeQuietly(inputStream);
                                Utils.closeQuietly(null);
                                if (th != 0) {
                                    th.disconnect();
                                    th = th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                AbstractC2929c.m13709n(TAG, new StringBuilder("close failed "), th);
                            }
                            if (byteArrayOutputStream == null) {
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            byteArrayOutputStream = null;
                            MTCommonLog.m13013w(TAG, "get failed " + th.getMessage());
                            try {
                                Utils.closeQuietly(byteArrayOutputStream);
                                Utils.closeQuietly(inputStream);
                                Utils.closeQuietly(null);
                                if (th != 0) {
                                    th.disconnect();
                                    th = th;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                AbstractC2929c.m13709n(TAG, new StringBuilder("close failed "), th);
                            }
                            if (byteArrayOutputStream == null) {
                            }
                        }
                        try {
                            byte[] bArr = new byte[UserMetadata.MAX_ATTRIBUTE_SIZE];
                            while (true) {
                                int i = inputStream.read(bArr);
                                if (i != -1) {
                                    byteArrayOutputStream.write(bArr, 0, i);
                                }
                            }
                            Utils.closeQuietly(byteArrayOutputStream);
                            Utils.closeQuietly(inputStream);
                            Utils.closeQuietly(null);
                            th.disconnect();
                            th = th;
                        } catch (MalformedURLException e7) {
                            e = e7;
                            MTCommonLog.m13013w(TAG, "get malformedURLException:" + e.getMessage());
                            if (byteArrayOutputStream == null) {
                            }
                        } catch (IOException e8) {
                            e = e8;
                            MTCommonLog.m13013w(TAG, "get ioException:" + e.getMessage());
                            Utils.closeQuietly(byteArrayOutputStream);
                            Utils.closeQuietly(inputStream);
                            Utils.closeQuietly(null);
                            if (th != 0) {
                            }
                            if (byteArrayOutputStream == null) {
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            MTCommonLog.m13013w(TAG, "get failed " + th.getMessage());
                            Utils.closeQuietly(byteArrayOutputStream);
                            Utils.closeQuietly(inputStream);
                            Utils.closeQuietly(null);
                            if (th != 0) {
                            }
                            if (byteArrayOutputStream == null) {
                            }
                        }
                    } else {
                        inputStream = null;
                        byteArrayOutputStream = null;
                    }
                    Utils.closeQuietly(byteArrayOutputStream);
                    Utils.closeQuietly(inputStream);
                    Utils.closeQuietly(null);
                    th.disconnect();
                    th = th;
                } catch (Throwable th9) {
                    AbstractC2929c.m13709n(TAG, new StringBuilder("close failed "), th9);
                }
            } catch (Exception unused) {
            }
            if (byteArrayOutputStream == null) {
                return null;
            }
            return byteArrayOutputStream.toByteArray();
        } finally {
            try {
                Utils.closeQuietly(byteArrayOutputStream);
                Utils.closeQuietly(inputStream);
                Utils.closeQuietly(null);
                if (th != 0) {
                    try {
                        th.disconnect();
                    } catch (Exception unused2) {
                    }
                }
            } catch (Throwable th10) {
                AbstractC2929c.m13709n(TAG, new StringBuilder("close failed "), th10);
            }
        }
    }
}
