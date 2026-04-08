package com.geetest.captcha;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001A.AbstractC0000a;

/* JADX INFO: renamed from: com.geetest.captcha.h0 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001#B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000bJ\u0018\u0010\u0012\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0014\u001a\u00020\u000bJ\u0006\u0010\u0016\u001a\u00020\u0013J\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000bJ\u0018\u0010\u0017\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0014\u001a\u00020\u000bJ\u000e\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000bJ\u0018\u0010\u0018\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0014\u001a\u00020\u000bJ\u0016\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u000bJ\u001a\u0010\u001b\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0002J\u000e\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u000bJ\u000e\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000bJ\u000e\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0011J\u000e\u0010!\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000bJ\u0018\u0010!\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0014\u001a\u00020\u000bJ\u000e\u0010\"\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000bJ\u0018\u0010\"\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0014\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, m18302d2 = {"Lcom/geetest/captcha/utils/LogUtils;", "", "()V", "DEBUG", "", "ERROR", "INFO", "LEVEL", "NO_LOG", "PRINT_SIZE", "TAG", "", "VERBOSE", "WARN", "logger", "Lcom/geetest/captcha/utils/LogUtils$Logger;", "releaseLog", "", "d", "", "msg", MTPushConstants.Operation.KEY_TAG, "destroy", "e", "i", "init", FirebaseAnalytics.Param.LEVEL, "log2sd", "printLongString", "data", "release", "setReleaseLog", "enable", "v", "w", "Logger", "captcha_release"}, m18303k = 1, m18304mv = {1, 4, 1})
public final class C3588h0 {

    /* JADX INFO: renamed from: a */
    public static int f42222a = 4;

    /* JADX INFO: renamed from: b */
    public static a f42223b = null;

    /* JADX INFO: renamed from: c */
    public static boolean f42224c = true;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final C3588h0 f42225d = new C3588h0();

    /* JADX INFO: renamed from: com.geetest.captcha.h0$a */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0003J!\u0010\u000b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, m18302d2 = {"Lcom/geetest/captcha/utils/LogUtils$Logger;", "", "<init>", "()V", "", "checkLogFile", "destroy", "init", "", MTPushConstants.Operation.KEY_TAG, "msg", "log", "(Ljava/lang/String;Ljava/lang/String;)V", FirebaseAnalytics.Param.CONTENT, "write", "(Ljava/lang/String;)V", "Landroid/os/Handler;", "handler$delegate", "Lkotlin/Lazy;", "getHandler", "()Landroid/os/Handler;", "handler", "Ljava/text/SimpleDateFormat;", "sdf", "Ljava/text/SimpleDateFormat;", "Landroid/os/HandlerThread;", "thread$delegate", "getThread", "()Landroid/os/HandlerThread;", "thread", "Companion", "Item", "captcha_release"}, m18303k = 1, m18304mv = {1, 4, 1})
    public static final class a {

        /* JADX INFO: renamed from: d */
        @NotNull
        public static final C6441a f42226d = new C6441a();

        /* JADX INFO: renamed from: a */
        public final Lazy f42227a = LazyKt.m18299b(d.INSTANCE);

        /* JADX INFO: renamed from: b */
        public final Lazy f42228b = LazyKt.m18299b(new c());

        /* JADX INFO: renamed from: c */
        public final SimpleDateFormat f42229c = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);

        /* JADX INFO: renamed from: com.geetest.captcha.h0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Proguard */
        public static final class C6441a {
            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ boolean m14341a(C6441a c6441a) {
                c6441a.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append(C3590i0.f42234a);
                File file = new File(AbstractC0000a.m19p(sb, File.separator, "Geetest"));
                if (!file.exists()) {
                    return false;
                }
                File file2 = new File(file, "captcha_log.txt");
                if (file2.exists() && file2.length() >= 10485760) {
                    return file2.delete();
                }
                return false;
            }

            /* JADX INFO: renamed from: b */
            public static final /* synthetic */ String m14342b(C6441a c6441a) {
                c6441a.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append(C3590i0.f42234a);
                return AbstractC0000a.m19p(sb, File.separator, "Geetest");
            }
        }

        /* JADX INFO: renamed from: com.geetest.captcha.h0$a$b */
        /* JADX INFO: compiled from: Proguard */
        public static final class b {

            /* JADX INFO: renamed from: a */
            public long f42230a;

            /* JADX INFO: renamed from: b */
            @Nullable
            public String f42231b;

            /* JADX INFO: renamed from: c */
            @Nullable
            public String f42232c;
        }

        /* JADX INFO: renamed from: com.geetest.captcha.h0$a$c */
        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m18302d2 = {"<anonymous>", "com/geetest/captcha/utils/LogUtils$Logger$handler$2$1", "invoke", "()Lcom/geetest/captcha/utils/LogUtils$Logger$handler$2$1;"}, m18303k = 3, m18304mv = {1, 4, 1})
        public static final class c extends Lambda implements Function0<HandlerC6442a> {

            /* JADX INFO: renamed from: com.geetest.captcha.h0$a$c$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: Proguard */
            public static final class HandlerC6442a extends Handler {
                public HandlerC6442a(Looper looper) {
                    super(looper);
                }

                @Override // android.os.Handler
                public void handleMessage(@NotNull Message msg) throws Throwable {
                    Intrinsics.m18599g(msg, "msg");
                    super.handleMessage(msg);
                    try {
                        if (Thread.interrupted()) {
                            return;
                        }
                        int i = msg.what;
                        if (i != 0) {
                            if (i == 1) {
                                C6441a.m14341a(a.f42226d);
                                return;
                            }
                            return;
                        }
                        Object obj = msg.obj;
                        if (obj == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.geetest.captcha.utils.LogUtils.Logger.Item");
                        }
                        b bVar = (b) obj;
                        a aVar = a.this;
                        C6441a c6441a = a.f42226d;
                        SimpleDateFormat simpleDateFormat = aVar.f42229c;
                        long j = bVar.f42230a;
                        String str = simpleDateFormat.format(new Date(j)) + '\t' + bVar.f42231b + '\n' + bVar.f42232c + '\n';
                        Intrinsics.m18598f(str, "StringBuilder().apply {\n…             }.toString()");
                        a.m14334a(aVar, str);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

            public c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                return invoke();
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final HandlerC6442a invoke() {
                return new HandlerC6442a(a.m14333a(a.this).getLooper());
            }
        }

        /* JADX INFO: renamed from: com.geetest.captcha.h0$a$d */
        /* JADX INFO: compiled from: Proguard */
        public static final class d extends Lambda implements Function0<HandlerThread> {
            public static final d INSTANCE = new d();

            public d() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                return invoke();
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final HandlerThread invoke() {
                return new HandlerThread("Captcha Thread");
            }
        }

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ HandlerThread m14333a(a aVar) {
            return aVar.m14339d();
        }

        /* JADX INFO: renamed from: b */
        public final synchronized void m14337b() {
            try {
                m14338c().removeMessages(0);
                m14338c().removeMessages(1);
                m14339d().quitSafely();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* JADX INFO: renamed from: c */
        public final Handler m14338c() {
            return (Handler) this.f42228b.getValue();
        }

        /* JADX INFO: renamed from: d */
        public final HandlerThread m14339d() {
            return (HandlerThread) this.f42227a.getValue();
        }

        /* JADX INFO: renamed from: e */
        public final synchronized void m14340e() {
            m14339d().start();
        }

        /* JADX INFO: renamed from: a */
        public final synchronized void m14336a(@Nullable String str, @Nullable String str2) {
            Message messageObtainMessage = m14338c().obtainMessage();
            Intrinsics.m18598f(messageObtainMessage, "handler.obtainMessage()");
            messageObtainMessage.what = 0;
            b bVar = new b();
            bVar.f42230a = System.currentTimeMillis();
            bVar.f42231b = str;
            bVar.f42232c = str2;
            messageObtainMessage.obj = bVar;
            m14338c().sendMessage(messageObtainMessage);
        }

        /* JADX INFO: renamed from: a */
        public final synchronized void m14335a() {
            Message messageObtainMessage = m14338c().obtainMessage();
            Intrinsics.m18598f(messageObtainMessage, "handler.obtainMessage()");
            messageObtainMessage.what = 1;
            m14338c().sendMessage(messageObtainMessage);
        }

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ void m14334a(a aVar, String str) throws Throwable {
            BufferedOutputStream bufferedOutputStream;
            aVar.getClass();
            BufferedOutputStream bufferedOutputStream2 = null;
            try {
                try {
                    File file = new File(C6441a.m14342b(f42226d));
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(file, "captcha_log.txt"), true));
                } catch (IOException unused) {
                    return;
                }
            } catch (Exception unused2) {
            } catch (Throwable th) {
                th = th;
            }
            try {
                Charset charsetForName = Charset.forName("utf-8");
                Intrinsics.m18598f(charsetForName, "Charset.forName(charsetName)");
                if (str != null) {
                    byte[] bytes = str.getBytes(charsetForName);
                    Intrinsics.m18598f(bytes, "(this as java.lang.String).getBytes(charset)");
                    bufferedOutputStream.write(bytes);
                    bufferedOutputStream.close();
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            } catch (Exception unused3) {
                bufferedOutputStream2 = bufferedOutputStream;
                if (bufferedOutputStream2 != null) {
                    bufferedOutputStream2.close();
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedOutputStream2 = bufferedOutputStream;
                if (bufferedOutputStream2 != null) {
                    try {
                        bufferedOutputStream2.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m14327a(@NotNull String msg) {
        Intrinsics.m18599g(msg, "msg");
        if (f42222a <= 2) {
            Log.d("Captcha", msg);
            m14332c("Captcha", msg);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m14329b(@NotNull String msg) {
        Intrinsics.m18599g(msg, "msg");
        if (f42222a <= 5) {
            Log.e("Captcha", msg);
            m14332c("Captcha", msg);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m14331c(@NotNull String msg) {
        Intrinsics.m18599g(msg, "msg");
        if (f42224c) {
            Log.i("Captcha", msg);
        }
        m14332c("Captcha", msg);
    }

    /* JADX INFO: renamed from: a */
    public final void m14328a(@Nullable String str, @NotNull String msg) {
        Intrinsics.m18599g(msg, "msg");
        if (f42222a <= 2) {
            Log.d(str, msg);
            m14332c(str, msg);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m14330b(@Nullable String str, @NotNull String msg) {
        Intrinsics.m18599g(msg, "msg");
        if (f42222a <= 3) {
            Log.i(str, msg);
            m14332c(str, msg);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m14332c(String str, String str2) {
        if (f42223b == null) {
            a aVar = new a();
            f42223b = aVar;
            aVar.m14340e();
            a aVar2 = f42223b;
            if (aVar2 != null) {
                aVar2.m14335a();
            }
        }
        a aVar3 = f42223b;
        if (aVar3 != null) {
            aVar3.m14336a(str, str2);
        }
    }
}
