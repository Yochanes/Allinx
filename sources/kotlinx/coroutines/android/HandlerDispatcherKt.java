package kotlinx.coroutines.android;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;
import p008J.ChoreographerFrameCallbackC0018c;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0001\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m18302d2 = {"Landroid/view/Choreographer;", "choreographer", "Landroid/view/Choreographer;", "kotlinx-coroutines-android"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class HandlerDispatcherKt {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f55385a = 0;

    @Nullable
    private static volatile Choreographer choreographer;

    static {
        Object objM18312a;
        try {
            objM18312a = new HandlerContext(m20659b(Looper.getMainLooper()));
        } catch (Throwable th) {
            objM18312a = ResultKt.m18312a(th);
        }
        if (objM18312a instanceof Result.Failure) {
            objM18312a = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m20658a() {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            Intrinsics.m18596d(choreographer2);
            choreographer = choreographer2;
        }
        choreographer2.postFrameCallback(new ChoreographerFrameCallbackC0018c());
    }

    /* JADX INFO: renamed from: b */
    public static final Handler m20659b(Looper looper) throws IllegalAccessException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 28) {
            Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            Intrinsics.m18597e(objInvoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) objInvoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
