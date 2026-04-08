package com.geetest.gtc4;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.geetest.gtc4.GeeGuard;
import com.geetest.gtc4.GeeGuardConfiguration;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.RunnableC3710c;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.geetest.gtc4.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public class C3629b {
    /* JADX INFO: renamed from: a */
    public static GeeGuardReceipt m14398a(Context context, String str, String str2) {
        if (str == null) {
            return null;
        }
        String data = Core.getData(context.getApplicationContext(), new GeeGuardConfiguration.Builder().setAppId(str).addSignature(str2).build());
        String string = context.getSharedPreferences("gt_core", 0).getString("gt_gid3", null);
        GeeGuardReceipt geeGuardReceipt = new GeeGuardReceipt();
        geeGuardReceipt.geeToken = data;
        geeGuardReceipt.geeID = string;
        geeGuardReceipt.appID = str;
        if (string != null && string.length() > 0) {
            String[] strArrSplit = string.split("-");
            if (strArrSplit.length == 4) {
                geeGuardReceipt.geeIDTimestamp = strArrSplit[1];
            }
        }
        return geeGuardReceipt;
    }

    /* JADX INFO: renamed from: a */
    public static void m14400a(String str, GeeGuardReceipt geeGuardReceipt, int i, GeeGuard.CallbackHandler callbackHandler) {
        Pair pair;
        HashMap map = new HashMap();
        map.put("API-Version", "1");
        map.put("AppID", str);
        map.put("GeeID", geeGuardReceipt.geeID);
        map.put("Client-Type", "1");
        String str2 = geeGuardReceipt.geeToken;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://riskct.geetest.com/g2/api/v1/client_report").openConnection();
            httpURLConnection.setConnectTimeout(i > 0 ? i : 5000);
            if (i <= 0) {
                i = 3000;
            }
            httpURLConnection.setReadTimeout(i);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setUseCaches(false);
            if (map.size() > 0) {
                for (Map.Entry entry : map.entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(str2.getBytes(StandardCharsets.UTF_8));
                outputStream.flush();
                outputStream.close();
            }
            int responseCode = httpURLConnection.getResponseCode();
            Pair<Boolean, String> pairM14397a = m14397a(httpURLConnection.getInputStream());
            if (((Boolean) pairM14397a.first).booleanValue()) {
                pair = new Pair(Integer.valueOf(responseCode), (String) pairM14397a.second);
            } else {
                pair = new Pair(Integer.valueOf(-responseCode), (String) pairM14397a.second);
            }
        } catch (MalformedURLException e) {
            C3628a.m14396a(String.valueOf(-11), e);
            pair = new Pair(-11, e.toString());
        } catch (ProtocolException e2) {
            C3628a.m14396a(String.valueOf(-12), e2);
            pair = new Pair(-12, e2.toString());
        } catch (IOException e3) {
            C3628a.m14396a(String.valueOf(-13), e3);
            pair = new Pair(-13, e3.toString());
        } catch (Exception e4) {
            C3628a.m14396a(String.valueOf(-14), e4);
            pair = new Pair(-14, e4.toString());
        }
        if (((Integer) pair.first).intValue() != 200) {
            if (callbackHandler != null) {
                callbackHandler.onCompletion(-300, geeGuardReceipt);
                return;
            }
            return;
        }
        geeGuardReceipt.originalResponse = (String) pair.second;
        try {
            JSONObject jSONObject = new JSONObject((String) pair.second);
            if (jSONObject.getInt("code") == 0) {
                geeGuardReceipt.respondedGeeToken = jSONObject.getJSONObject("data").getString("gee_token");
                if (callbackHandler != null) {
                    callbackHandler.onCompletion(200, geeGuardReceipt);
                }
            } else if (callbackHandler != null) {
                callbackHandler.onCompletion(-501, geeGuardReceipt);
            }
        } catch (JSONException e5) {
            C3628a.m14396a(String.valueOf(-15), e5);
            if (callbackHandler != null) {
                callbackHandler.onCompletion(-500, geeGuardReceipt);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m14399a(Context context, String str, String str2, int i, GeeGuard.CallbackHandler callbackHandler) {
        if (str == null) {
            C3628a.m14396a("Empty App ID", new IllegalArgumentException("Empty App ID"));
            if (callbackHandler != null) {
                callbackHandler.onCompletion(-200, null);
                return;
            }
            return;
        }
        GeeGuardReceipt geeGuardReceiptM14398a = m14398a(context, str, str2);
        if (geeGuardReceiptM14398a != null) {
            new Thread(new RunnableC3710c(i, 1, str, geeGuardReceiptM14398a, callbackHandler)).start();
        } else if (callbackHandler != null) {
            callbackHandler.onCompletion(-200, null);
        }
    }

    /* JADX INFO: renamed from: a */
    public static Pair<Boolean, String> m14397a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                }
                Pair<Boolean, String> pair = new Pair<>(Boolean.TRUE, byteArrayOutputStream.toString());
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e) {
                    C3628a.m14396a(String.valueOf(-13), e);
                }
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    C3628a.m14396a(String.valueOf(-13), e2);
                }
                return pair;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e3) {
                    C3628a.m14396a(String.valueOf(-13), e3);
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                        throw th;
                    } catch (IOException e4) {
                        C3628a.m14396a(String.valueOf(-13), e4);
                        throw th;
                    }
                }
                throw th;
            }
        } catch (IOException e5) {
            C3628a.m14396a(String.valueOf(-13), e5);
            Pair<Boolean, String> pair2 = new Pair<>(Boolean.FALSE, e5.toString());
            try {
                byteArrayOutputStream.close();
            } catch (IOException e6) {
                C3628a.m14396a(String.valueOf(-13), e6);
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e7) {
                    C3628a.m14396a(String.valueOf(-13), e7);
                }
            }
            return pair2;
        } catch (Exception e8) {
            C3628a.m14396a(String.valueOf(-14), e8);
            Pair<Boolean, String> pair3 = new Pair<>(Boolean.FALSE, e8.toString());
            try {
                byteArrayOutputStream.close();
            } catch (IOException e9) {
                C3628a.m14396a(String.valueOf(-13), e9);
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    C3628a.m14396a(String.valueOf(-13), e10);
                }
            }
            return pair3;
        }
    }
}
