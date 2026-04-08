package androidx.core.os;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.camera.core.RunnableC0247f;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerCompat {

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api28Impl {
        /* JADX INFO: renamed from: a */
        public static Handler m7649a(Looper looper) {
            return Handler.createAsync(looper);
        }

        /* JADX INFO: renamed from: b */
        public static boolean m7650b(Handler handler, RunnableC0247f runnableC0247f) {
            return handler.postDelayed(runnableC0247f, "retry_token", 500L);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api29Impl {
    }

    /* JADX INFO: renamed from: a */
    public static Handler m7647a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.m7649a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e) {
            e = e;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e2) {
            e = e2;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e3) {
            e = e3;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m7648b(Handler handler, RunnableC0247f runnableC0247f) {
        if (Build.VERSION.SDK_INT >= 28) {
            Api28Impl.m7650b(handler, runnableC0247f);
            return;
        }
        Message messageObtain = Message.obtain(handler, runnableC0247f);
        messageObtain.obj = "retry_token";
        handler.sendMessageDelayed(messageObtain, 500L);
    }
}
