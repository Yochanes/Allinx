package com.engagelab.privates.common;

import android.content.Context;
import android.util.Pair;
import com.engagelab.privates.common.constants.MTCommonConstants;
import com.engagelab.privates.common.global.MTGlobal;
import com.engagelab.privates.common.https.HostVerifier;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.common.utils.SystemUtil;
import com.engagelab.privates.common.utils.Utils;
import com.exchange.allin.p024ui.page.account.register.AbstractC2929c;
import com.google.common.net.HttpHeaders;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: renamed from: com.engagelab.privates.common.o */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class C2487o {
    /* JADX WARN: Code restructure failed: missing block: B:69:0x010a, code lost:
    
        if (r7 == 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x010c, code lost:
    
        r9 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0135, code lost:
    
        if (r7 == 0) goto L79;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair<Integer, byte[]> m13062a(Context context, String str, Map<String, String> map, byte[] bArr, boolean z2) {
        Throwable th;
        ?? r7;
        OutputStream outputStream;
        SocketTimeoutException e;
        ?? r72;
        OutputStream outputStream2;
        OutputStream outputStream3;
        OutputStream outputStream4;
        Closeable closeable;
        ?? r73;
        ByteArrayOutputStream byteArrayOutputStream;
        Closeable closeable2;
        ?? r74;
        Closeable closeable3;
        ?? r75;
        OutputStream outputStream5;
        int responseCode;
        OutputStream outputStream6;
        Closeable closeable4;
        ?? r76;
        OutputStream outputStream7;
        OutputStream outputStream8;
        byte[] byteArray;
        InputStream inputStream;
        InputStream inputStream2;
        byte[] bArr2;
        byte[] bArr3 = null;
        int i = -1;
        try {
            try {
                str = (HttpURLConnection) new URL(str).openConnection();
            } catch (Throwable th2) {
                Utils.closeQuietly(outputStream6);
                Utils.closeQuietly(byteArrayOutputStream);
                Utils.closeQuietly(z2);
                Utils.closeQuietly(null);
                if (str != 0) {
                    str.disconnect();
                }
                throw th2;
            }
        } catch (SocketTimeoutException e2) {
            e = e2;
            r72 = 0;
            outputStream2 = null;
        } catch (Throwable th3) {
            th = th3;
            r7 = 0;
            outputStream = null;
        }
        try {
            str.setRequestMethod("POST");
            str.setConnectTimeout(6000);
            str.setReadTimeout(6000);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                try {
                    str.setRequestProperty(entry.getKey(), entry.getValue());
                } catch (SocketTimeoutException e3) {
                    e = e3;
                    closeable4 = null;
                    outputStream7 = null;
                    byteArrayOutputStream = null;
                    r76 = str;
                    MTCommonLog.m13013w("HttpClient", "post socketTimeoutException:" + e.getMessage());
                    Utils.closeQuietly(outputStream7);
                    Utils.closeQuietly(byteArrayOutputStream);
                    Utils.closeQuietly(closeable4);
                    Utils.closeQuietly(null);
                    outputStream6 = outputStream7;
                    str = r76;
                    z2 = closeable4;
                } catch (Throwable th4) {
                    th = th4;
                    closeable3 = null;
                    outputStream5 = null;
                    byteArrayOutputStream = null;
                    r75 = str;
                    MTCommonLog.m13013w("HttpClient", "post failed " + th.getMessage());
                    Utils.closeQuietly(outputStream5);
                    Utils.closeQuietly(byteArrayOutputStream);
                    Utils.closeQuietly(closeable3);
                    Utils.closeQuietly(null);
                    outputStream6 = outputStream5;
                    str = r75;
                    z2 = closeable3;
                }
            }
            if (str instanceof HttpsURLConnection) {
                ((HttpsURLConnection) str).setHostnameVerifier(new HostVerifier(str.getURL().getHost()));
            }
            str.setDoInput(true);
            str.setDoOutput(true);
            str.setUseCaches(false);
            outputStream8 = str.getOutputStream();
            try {
                outputStream8.write(bArr);
                outputStream8.flush();
                str.connect();
                responseCode = str.getResponseCode();
            } catch (SocketTimeoutException e4) {
                e = e4;
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (SocketTimeoutException e5) {
            e = e5;
            outputStream2 = null;
            r72 = str;
            outputStream4 = outputStream2;
            r74 = r72;
            closeable2 = outputStream2;
            byteArrayOutputStream = null;
            outputStream7 = outputStream4;
            r76 = r74;
            closeable4 = closeable2;
            MTCommonLog.m13013w("HttpClient", "post socketTimeoutException:" + e.getMessage());
            Utils.closeQuietly(outputStream7);
            Utils.closeQuietly(byteArrayOutputStream);
            Utils.closeQuietly(closeable4);
            Utils.closeQuietly(null);
            outputStream6 = outputStream7;
            str = r76;
            z2 = closeable4;
        } catch (Throwable th6) {
            th = th6;
            outputStream = null;
            r7 = str;
            outputStream3 = outputStream;
            r73 = r7;
            closeable = outputStream;
            byteArrayOutputStream = null;
            outputStream5 = outputStream3;
            r75 = r73;
            closeable3 = closeable;
            MTCommonLog.m13013w("HttpClient", "post failed " + th.getMessage());
            Utils.closeQuietly(outputStream5);
            Utils.closeQuietly(byteArrayOutputStream);
            Utils.closeQuietly(closeable3);
            Utils.closeQuietly(null);
            outputStream6 = outputStream5;
            str = r75;
            z2 = closeable3;
        }
        if (responseCode != 200 || z2 == 0) {
            byteArray = null;
            inputStream = null;
            byteArrayOutputStream = null;
        } else {
            try {
                inputStream2 = str.getInputStream();
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        bArr2 = new byte[4096];
                    } catch (SocketTimeoutException e6) {
                        e = e6;
                        i = responseCode;
                        outputStream7 = outputStream8;
                        r76 = str;
                        closeable4 = inputStream2;
                        MTCommonLog.m13013w("HttpClient", "post socketTimeoutException:" + e.getMessage());
                        Utils.closeQuietly(outputStream7);
                        Utils.closeQuietly(byteArrayOutputStream);
                        Utils.closeQuietly(closeable4);
                        Utils.closeQuietly(null);
                        outputStream6 = outputStream7;
                        str = r76;
                        z2 = closeable4;
                    } catch (Throwable th7) {
                        th = th7;
                        i = responseCode;
                        outputStream5 = outputStream8;
                        r75 = str;
                        closeable3 = inputStream2;
                        MTCommonLog.m13013w("HttpClient", "post failed " + th.getMessage());
                        Utils.closeQuietly(outputStream5);
                        Utils.closeQuietly(byteArrayOutputStream);
                        Utils.closeQuietly(closeable3);
                        Utils.closeQuietly(null);
                        outputStream6 = outputStream5;
                        str = r75;
                        z2 = closeable3;
                    }
                } catch (SocketTimeoutException e7) {
                    e = e7;
                    i = responseCode;
                    outputStream4 = outputStream8;
                    r74 = str;
                    closeable2 = inputStream2;
                    byteArrayOutputStream = null;
                    outputStream7 = outputStream4;
                    r76 = r74;
                    closeable4 = closeable2;
                    MTCommonLog.m13013w("HttpClient", "post socketTimeoutException:" + e.getMessage());
                    Utils.closeQuietly(outputStream7);
                    Utils.closeQuietly(byteArrayOutputStream);
                    Utils.closeQuietly(closeable4);
                    Utils.closeQuietly(null);
                    outputStream6 = outputStream7;
                    str = r76;
                    z2 = closeable4;
                } catch (Throwable th8) {
                    th = th8;
                    i = responseCode;
                    outputStream3 = outputStream8;
                    r73 = str;
                    closeable = inputStream2;
                    byteArrayOutputStream = null;
                    outputStream5 = outputStream3;
                    r75 = r73;
                    closeable3 = closeable;
                    MTCommonLog.m13013w("HttpClient", "post failed " + th.getMessage());
                    Utils.closeQuietly(outputStream5);
                    Utils.closeQuietly(byteArrayOutputStream);
                    Utils.closeQuietly(closeable3);
                    Utils.closeQuietly(null);
                    outputStream6 = outputStream5;
                    str = r75;
                    z2 = closeable3;
                }
            } catch (SocketTimeoutException e8) {
                e = e8;
                i = responseCode;
                closeable2 = null;
                outputStream4 = outputStream8;
                r74 = str;
                byteArrayOutputStream = null;
                outputStream7 = outputStream4;
                r76 = r74;
                closeable4 = closeable2;
                MTCommonLog.m13013w("HttpClient", "post socketTimeoutException:" + e.getMessage());
                Utils.closeQuietly(outputStream7);
                Utils.closeQuietly(byteArrayOutputStream);
                Utils.closeQuietly(closeable4);
                Utils.closeQuietly(null);
                outputStream6 = outputStream7;
                str = r76;
                z2 = closeable4;
            } catch (Throwable th9) {
                th = th9;
                i = responseCode;
                closeable = null;
                outputStream3 = outputStream8;
                r73 = str;
                byteArrayOutputStream = null;
                outputStream5 = outputStream3;
                r75 = r73;
                closeable3 = closeable;
                MTCommonLog.m13013w("HttpClient", "post failed " + th.getMessage());
                Utils.closeQuietly(outputStream5);
                Utils.closeQuietly(byteArrayOutputStream);
                Utils.closeQuietly(closeable3);
                Utils.closeQuietly(null);
                outputStream6 = outputStream5;
                str = r75;
                z2 = closeable3;
            }
            while (true) {
                int i2 = inputStream2.read(bArr2);
                if (i2 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, i2);
                str.disconnect();
                i = responseCode;
                return new Pair<>(Integer.valueOf(i), bArr3);
            }
            byteArray = byteArrayOutputStream.toByteArray();
            inputStream = inputStream2;
        }
        Utils.closeQuietly(outputStream8);
        Utils.closeQuietly(byteArrayOutputStream);
        Utils.closeQuietly(inputStream);
        Utils.closeQuietly(null);
        bArr3 = byteArray;
        str.disconnect();
        i = responseCode;
        return new Pair<>(Integer.valueOf(i), bArr3);
    }

    /* JADX INFO: renamed from: a */
    public static int m13061a(Context context, String str, String str2, byte[] bArr) {
        HashMap map = new HashMap();
        map.put(HttpHeaders.AUTHORIZATION, str2);
        map.put("Charset", MTCommonConstants.UTF_8);
        map.put(HttpHeaders.ACCEPT, "application/jason");
        map.put(HttpHeaders.ACCEPT_ENCODING, "gzip");
        map.put("content-type", "application/octet-stream");
        map.put(HttpHeaders.CONTENT_LENGTH, String.valueOf(bArr.length));
        map.put("X-App-Key", MTGlobal.getAppKey(context));
        map.put("Encrypt-Type", MTGlobal.getEncryptType() == 2 ? "SM4" : "");
        return ((Integer) m13062a(context, str, map, bArr, false).first).intValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:(4:131|12|23|24)|(7:26|127|27|28|133|29|(2:30|(1:32)(7:135|39|116|40|118|41|42)))(4:111|58|59|121)|87|88|119|89|(1:91)|113|121) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0094 A[Catch: all -> 0x00d5, IOException -> 0x00d8, MalformedURLException -> 0x00dc, TRY_LEAVE, TryCatch #18 {MalformedURLException -> 0x00dc, IOException -> 0x00d8, all -> 0x00d5, blocks: (B:8:0x002f, B:10:0x0043, B:24:0x0073, B:26:0x0094), top: B:129:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0126 A[Catch: all -> 0x012a, Exception -> 0x0193, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x012a, blocks: (B:71:0x011e, B:73:0x0126), top: B:109:0x011e }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0157 A[Catch: all -> 0x015b, Exception -> 0x0193, TRY_ENTER, TRY_LEAVE, TryCatch #19 {Exception -> 0x0193, blocks: (B:73:0x0126, B:83:0x0157, B:91:0x0186, B:59:0x00e6), top: B:122:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0186 A[Catch: all -> 0x018a, Exception -> 0x0193, TRY_ENTER, TRY_LEAVE, TryCatch #16 {all -> 0x018a, blocks: (B:89:0x017e, B:91:0x0186), top: B:119:0x017e }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.io.Closeable] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] m13063a(Context context, String str, String str2) {
        Throwable th;
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        IOException e;
        MalformedURLException e2;
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2;
        ByteArrayOutputStream byteArrayOutputStream3;
        InputStream inputStream2;
        HttpURLConnection httpURLConnection2;
        InputStream inputStream3;
        HttpURLConnection httpURLConnection3;
        InputStream inputStream4;
        HttpURLConnection httpURLConnection4;
        int responseCode;
        ByteArrayOutputStream byteArrayOutputStream4;
        ?? r1 = "responseCode:";
        if (!SystemUtil.isNetworkConnecting(context)) {
            MTCommonLog.m13010d("HttpClient", "can't get, network is disConnected");
            return null;
        }
        ?? r7 = "requestUrl:" + str;
        MTCommonLog.m13010d("HttpClient", r7);
        try {
            try {
                try {
                    httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                    try {
                        httpURLConnection.setRequestMethod("GET");
                        httpURLConnection.setConnectTimeout(6000);
                        httpURLConnection.setReadTimeout(6000);
                        httpURLConnection.setRequestProperty(HttpHeaders.AUTHORIZATION, str2);
                        httpURLConnection.setRequestProperty("Charset", MTCommonConstants.UTF_8);
                    } catch (MalformedURLException e3) {
                        e2 = e3;
                        inputStream = null;
                    } catch (IOException e4) {
                        e = e4;
                        inputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = null;
                    }
                } finally {
                    try {
                        Utils.closeQuietly(r1);
                        Utils.closeQuietly(str2);
                        if (r7 != 0) {
                            try {
                                r7.disconnect();
                            } catch (Exception unused) {
                            }
                        }
                    } catch (Throwable th3) {
                        AbstractC2929c.m13709n("HttpClient", new StringBuilder("close failed "), th3);
                    }
                }
            } catch (MalformedURLException e5) {
                e2 = e5;
                httpURLConnection = null;
                inputStream = null;
            } catch (IOException e6) {
                e = e6;
                httpURLConnection = null;
                inputStream = null;
            } catch (Throwable th4) {
                th = th4;
                httpURLConnection = null;
                inputStream = null;
            }
            if (httpURLConnection instanceof HttpsURLConnection) {
                try {
                    ((HttpsURLConnection) httpURLConnection).setHostnameVerifier(new HostVerifier(httpURLConnection.getURL().getHost()));
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setUseCaches(false);
                    httpURLConnection.connect();
                    responseCode = httpURLConnection.getResponseCode();
                    MTCommonLog.m13010d("HttpClient", "responseCode:" + responseCode);
                } catch (MalformedURLException e7) {
                    e2 = e7;
                    inputStream4 = null;
                    byteArrayOutputStream3 = null;
                    httpURLConnection4 = httpURLConnection;
                } catch (IOException e8) {
                    e = e8;
                    inputStream3 = null;
                    byteArrayOutputStream2 = null;
                    httpURLConnection3 = httpURLConnection;
                    MTCommonLog.m13013w("HttpClient", "get ioException:" + e.getMessage());
                    try {
                        Utils.closeQuietly(byteArrayOutputStream2);
                        Utils.closeQuietly(inputStream3);
                        r1 = byteArrayOutputStream2;
                        r7 = httpURLConnection3;
                        str2 = inputStream3;
                        if (httpURLConnection3 != null) {
                        }
                    } catch (Throwable th5) {
                        AbstractC2929c.m13709n("HttpClient", new StringBuilder("close failed "), th5);
                        r1 = byteArrayOutputStream2;
                        r7 = th5;
                        str2 = inputStream3;
                    }
                    return null;
                } catch (Throwable th6) {
                    th = th6;
                    inputStream2 = null;
                    byteArrayOutputStream = null;
                    httpURLConnection2 = httpURLConnection;
                    MTCommonLog.m13013w("HttpClient", "get failed " + th.getMessage());
                    try {
                        Utils.closeQuietly(byteArrayOutputStream);
                        Utils.closeQuietly(inputStream2);
                        r1 = byteArrayOutputStream;
                        r7 = httpURLConnection2;
                        str2 = inputStream2;
                        if (httpURLConnection2 != null) {
                        }
                    } catch (Throwable th7) {
                        AbstractC2929c.m13709n("HttpClient", new StringBuilder("close failed "), th7);
                        r1 = byteArrayOutputStream;
                        r7 = th7;
                        str2 = inputStream2;
                    }
                    return null;
                }
                if (responseCode != 200) {
                    inputStream = httpURLConnection.getInputStream();
                    try {
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                    } catch (MalformedURLException e9) {
                        e2 = e9;
                        byteArrayOutputStream3 = null;
                        httpURLConnection4 = httpURLConnection;
                        inputStream4 = inputStream;
                    } catch (IOException e10) {
                        e = e10;
                        byteArrayOutputStream2 = null;
                        httpURLConnection3 = httpURLConnection;
                        inputStream3 = inputStream;
                        MTCommonLog.m13013w("HttpClient", "get ioException:" + e.getMessage());
                        Utils.closeQuietly(byteArrayOutputStream2);
                        Utils.closeQuietly(inputStream3);
                        r1 = byteArrayOutputStream2;
                        r7 = httpURLConnection3;
                        str2 = inputStream3;
                        if (httpURLConnection3 != null) {
                            httpURLConnection3.disconnect();
                            r1 = byteArrayOutputStream2;
                            r7 = httpURLConnection3;
                            str2 = inputStream3;
                        }
                        return null;
                    } catch (Throwable th8) {
                        th = th8;
                        byteArrayOutputStream = null;
                        httpURLConnection2 = httpURLConnection;
                        inputStream2 = inputStream;
                        MTCommonLog.m13013w("HttpClient", "get failed " + th.getMessage());
                        Utils.closeQuietly(byteArrayOutputStream);
                        Utils.closeQuietly(inputStream2);
                        r1 = byteArrayOutputStream;
                        r7 = httpURLConnection2;
                        str2 = inputStream2;
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                            r1 = byteArrayOutputStream;
                            r7 = httpURLConnection2;
                            str2 = inputStream2;
                        }
                        return null;
                    }
                    try {
                        byte[] bArr = new byte[UserMetadata.MAX_ATTRIBUTE_SIZE];
                        while (true) {
                            int i = inputStream.read(bArr);
                            if (i != -1) {
                                byteArrayOutputStream4.write(bArr, 0, i);
                            } else {
                                byte[] byteArray = byteArrayOutputStream4.toByteArray();
                                try {
                                    Utils.closeQuietly(byteArrayOutputStream4);
                                    Utils.closeQuietly(inputStream);
                                } catch (Throwable th9) {
                                    AbstractC2929c.m13709n("HttpClient", new StringBuilder("close failed "), th9);
                                }
                                try {
                                    httpURLConnection.disconnect();
                                    return byteArray;
                                } catch (Exception unused2) {
                                    return byteArray;
                                }
                            }
                        }
                    } catch (MalformedURLException e11) {
                        e2 = e11;
                        byteArrayOutputStream3 = byteArrayOutputStream4;
                        httpURLConnection4 = httpURLConnection;
                        inputStream4 = inputStream;
                    } catch (IOException e12) {
                        e = e12;
                        byteArrayOutputStream2 = byteArrayOutputStream4;
                        httpURLConnection3 = httpURLConnection;
                        inputStream3 = inputStream;
                        MTCommonLog.m13013w("HttpClient", "get ioException:" + e.getMessage());
                        Utils.closeQuietly(byteArrayOutputStream2);
                        Utils.closeQuietly(inputStream3);
                        r1 = byteArrayOutputStream2;
                        r7 = httpURLConnection3;
                        str2 = inputStream3;
                        if (httpURLConnection3 != null) {
                        }
                        return null;
                    } catch (Throwable th10) {
                        th = th10;
                        byteArrayOutputStream = byteArrayOutputStream4;
                        httpURLConnection2 = httpURLConnection;
                        inputStream2 = inputStream;
                        MTCommonLog.m13013w("HttpClient", "get failed " + th.getMessage());
                        Utils.closeQuietly(byteArrayOutputStream);
                        Utils.closeQuietly(inputStream2);
                        r1 = byteArrayOutputStream;
                        r7 = httpURLConnection2;
                        str2 = inputStream2;
                        if (httpURLConnection2 != null) {
                        }
                        return null;
                    }
                } else {
                    try {
                        Utils.closeQuietly(null);
                        Utils.closeQuietly(null);
                        httpURLConnection.disconnect();
                    } catch (Throwable th11) {
                        AbstractC2929c.m13709n("HttpClient", new StringBuilder("close failed "), th11);
                    }
                }
                byteArrayOutputStream3 = null;
                httpURLConnection4 = httpURLConnection;
                inputStream4 = inputStream;
                MTCommonLog.m13013w("HttpClient", "get malformedURLException:" + e2.getMessage());
                if (httpURLConnection4 != null) {
                    httpURLConnection4.disconnect();
                    r1 = byteArrayOutputStream3;
                    r7 = httpURLConnection4;
                    str2 = inputStream4;
                }
            } else {
                httpURLConnection.setDoInput(true);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.connect();
                responseCode = httpURLConnection.getResponseCode();
                MTCommonLog.m13010d("HttpClient", "responseCode:" + responseCode);
                if (responseCode != 200) {
                }
                byteArrayOutputStream3 = null;
                httpURLConnection4 = httpURLConnection;
                inputStream4 = inputStream;
                MTCommonLog.m13013w("HttpClient", "get malformedURLException:" + e2.getMessage());
            }
        } catch (Exception unused3) {
        }
        return null;
    }
}
