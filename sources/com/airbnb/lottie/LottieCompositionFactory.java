package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import com.airbnb.lottie.model.Font;
import com.airbnb.lottie.model.LottieCompositionCache;
import com.airbnb.lottie.parser.LottieCompositionMoshiParser;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import okio.Okio;
import okio.PeekSource;
import okio.RealBufferedSource;
import okio.RealBufferedSource$inputStream$1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class LottieCompositionFactory {

    /* JADX INFO: renamed from: a */
    public static final HashMap f34054a = new HashMap();

    /* JADX INFO: renamed from: b */
    public static final HashSet f34055b = new HashSet();

    /* JADX INFO: renamed from: c */
    public static final byte[] f34056c = {80, 75, 3, 4};

    /* JADX INFO: renamed from: a */
    public static LottieTask m12557a(String str, Callable callable, Runnable runnable) {
        LottieComposition lottieComposition = str == null ? null : (LottieComposition) LottieCompositionCache.f34507b.f34508a.get(str);
        LottieTask lottieTask = lottieComposition != null ? new LottieTask(new CallableC2411i(lottieComposition), false) : null;
        HashMap map = f34054a;
        if (str != null && map.containsKey(str)) {
            lottieTask = (LottieTask) map.get(str);
        }
        if (lottieTask != null) {
            if (runnable != null) {
                runnable.run();
            }
            return lottieTask;
        }
        LottieTask lottieTask2 = new LottieTask(callable, false);
        if (str != null) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            lottieTask2.m12581b(new C2412j(str, atomicBoolean, 0));
            lottieTask2.m12580a(new C2412j(str, atomicBoolean, 1));
            if (!atomicBoolean.get()) {
                map.put(str, lottieTask2);
                if (map.size() == 1) {
                    m12565i(false);
                }
            }
        }
        return lottieTask2;
    }

    /* JADX INFO: renamed from: b */
    public static LottieResult m12558b(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return m12559c(context.getAssets().open(str), str2);
            }
            return m12563g(context, new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e) {
            return new LottieResult((Throwable) e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static LottieResult m12559c(InputStream inputStream, String str) {
        try {
            return m12560d(JsonReader.m12698x(Okio.m21671d(Okio.m21677j(inputStream))), str, true);
        } finally {
            Utils.m12750b(inputStream);
        }
    }

    /* JADX INFO: renamed from: d */
    public static LottieResult m12560d(JsonReader jsonReader, String str, boolean z2) {
        try {
            try {
                LottieComposition lottieCompositionM12697a = LottieCompositionMoshiParser.m12697a(jsonReader);
                if (str != null) {
                    LottieCompositionCache.f34507b.f34508a.put(str, lottieCompositionM12697a);
                }
                LottieResult lottieResult = new LottieResult(lottieCompositionM12697a);
                if (z2) {
                    Utils.m12750b(jsonReader);
                }
                return lottieResult;
            } catch (Exception e) {
                LottieResult lottieResult2 = new LottieResult((Throwable) e);
                if (z2) {
                    Utils.m12750b(jsonReader);
                }
                return lottieResult2;
            }
        } catch (Throwable th) {
            if (z2) {
                Utils.m12750b(jsonReader);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public static LottieTask m12561e(Context context, int i, String str) {
        return m12557a(str, new CallableC2410h(new WeakReference(context), context.getApplicationContext(), i, str), null);
    }

    /* JADX INFO: renamed from: f */
    public static LottieResult m12562f(Context context, int i, String str) {
        Boolean bool;
        try {
            RealBufferedSource realBufferedSourceM21671d = Okio.m21671d(Okio.m21677j(context.getResources().openRawResource(i)));
            try {
                try {
                    RealBufferedSource realBufferedSourceM21671d2 = Okio.m21671d(new PeekSource(realBufferedSourceM21671d));
                    byte[] bArr = f34056c;
                    int length = bArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            realBufferedSourceM21671d2.close();
                            bool = Boolean.TRUE;
                            break;
                        }
                        if (realBufferedSourceM21671d2.m21697g() != bArr[i2]) {
                            bool = Boolean.FALSE;
                            break;
                        }
                        i2++;
                    }
                } catch (NoSuchMethodError unused) {
                    bool = Boolean.FALSE;
                }
            } catch (Exception unused2) {
                Logger.f34863a.getClass();
                bool = Boolean.FALSE;
            }
            return bool.booleanValue() ? m12563g(context, new ZipInputStream(new RealBufferedSource$inputStream$1(realBufferedSourceM21671d)), str) : m12559c(new RealBufferedSource$inputStream$1(realBufferedSourceM21671d), str);
        } catch (Resources.NotFoundException e) {
            return new LottieResult((Throwable) e);
        }
    }

    /* JADX INFO: renamed from: g */
    public static LottieResult m12563g(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return m12564h(context, zipInputStream, str);
        } finally {
            Utils.m12750b(zipInputStream);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0104 A[Catch: IOException -> 0x0265, TryCatch #1 {IOException -> 0x0265, blocks: (B:3:0x000a, B:6:0x0014, B:8:0x0020, B:56:0x0134, B:9:0x0025, B:11:0x0031, B:12:0x0036, B:14:0x0042, B:15:0x0059, B:18:0x0063, B:20:0x006b, B:22:0x0073, B:25:0x007d, B:27:0x0085, B:30:0x008e, B:31:0x0093, B:51:0x00fa, B:53:0x0104, B:54:0x0121, B:50:0x00d9, B:55:0x0125, B:32:0x00b1, B:41:0x00ca, B:49:0x00d8, B:48:0x00d5), top: B:111:0x000a, inners: #4 }] */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static LottieResult m12564h(Context context, ZipInputStream zipInputStream, String str) {
        LottieImageAsset lottieImageAsset;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            LottieComposition lottieComposition = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    lottieComposition = (LottieComposition) m12560d(JsonReader.m12698x(Okio.m21671d(Okio.m21677j(zipInputStream))), null, false).f34100a;
                } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                    String[] strArrSplit = name.split(RemoteSettings.FORWARD_SLASH_STRING);
                    map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
                } else if (name.contains(".ttf") || name.contains(".otf")) {
                    String[] strArrSplit2 = name.split(RemoteSettings.FORWARD_SLASH_STRING);
                    String str2 = strArrSplit2[strArrSplit2.length - 1];
                    String str3 = str2.split("\\.")[0];
                    File file = new File(context.getCacheDir(), str2);
                    new FileOutputStream(file);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int i = zipInputStream.read(bArr);
                                if (i == -1) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, i);
                            }
                            fileOutputStream.flush();
                            fileOutputStream.close();
                        } catch (Throwable th) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        Logger.m12737c("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th3);
                        Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                        if (!file.delete()) {
                        }
                        map2.put(str3, typefaceCreateFromFile);
                        nextEntry = zipInputStream.getNextEntry();
                    }
                    Typeface typefaceCreateFromFile2 = Typeface.createFromFile(file);
                    if (!file.delete()) {
                        Logger.m12736b("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                    }
                    map2.put(str3, typefaceCreateFromFile2);
                } else {
                    zipInputStream.closeEntry();
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (lottieComposition == null) {
                return new LottieResult((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : map.entrySet()) {
                String str4 = (String) entry.getKey();
                Iterator it = lottieComposition.f34042d.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        lottieImageAsset = null;
                        break;
                    }
                    lottieImageAsset = (LottieImageAsset) it.next();
                    if (lottieImageAsset.f34098c.equals(str4)) {
                        break;
                    }
                }
                if (lottieImageAsset != null) {
                    lottieImageAsset.f34099d = Utils.m12753e((Bitmap) entry.getValue(), lottieImageAsset.f34096a, lottieImageAsset.f34097b);
                }
            }
            for (Map.Entry entry2 : map2.entrySet()) {
                boolean z2 = false;
                for (Font font : lottieComposition.f34043e.values()) {
                    if (font.f34497a.equals(entry2.getKey())) {
                        font.f34500d = (Typeface) entry2.getValue();
                        z2 = true;
                    }
                }
                if (!z2) {
                    Logger.m12736b("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
                }
            }
            if (map.isEmpty()) {
                Iterator it2 = lottieComposition.f34042d.entrySet().iterator();
                while (it2.hasNext()) {
                    LottieImageAsset lottieImageAsset2 = (LottieImageAsset) ((Map.Entry) it2.next()).getValue();
                    if (lottieImageAsset2 == null) {
                        return null;
                    }
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    String str5 = lottieImageAsset2.f34098c;
                    if (str5.startsWith("data:") && str5.indexOf("base64,") > 0) {
                        try {
                            byte[] bArrDecode = Base64.decode(str5.substring(str5.indexOf(44) + 1), 0);
                            lottieImageAsset2.f34099d = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                        } catch (IllegalArgumentException e) {
                            Logger.m12737c("data URL did not have correct base64 format.", e);
                            return null;
                        }
                    }
                }
            }
            if (str != null) {
                LottieCompositionCache.f34507b.f34508a.put(str, lottieComposition);
            }
            return new LottieResult(lottieComposition);
        } catch (IOException e2) {
            return new LottieResult((Throwable) e2);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m12565i(boolean z2) {
        ArrayList arrayList = new ArrayList(f34055b);
        for (int i = 0; i < arrayList.size(); i++) {
            ((LottieTaskIdleListener) arrayList.get(i)).m12583a();
        }
    }

    /* JADX INFO: renamed from: j */
    public static String m12566j(Context context, int i) {
        StringBuilder sb = new StringBuilder("rawRes");
        sb.append((context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_");
        sb.append(i);
        return sb.toString();
    }
}
