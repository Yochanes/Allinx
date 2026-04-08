package kotlinx.coroutines.android;

import android.os.Build;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m18302d2 = {"Lkotlinx/coroutines/android/AndroidExceptionPreHandler;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "<init>", "()V", "", "_preHandler", "Ljava/lang/Object;", "kotlinx-coroutines-android"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class AndroidExceptionPreHandler extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

    @Nullable
    private volatile Object _preHandler;

    public AndroidExceptionPreHandler() {
        super(CoroutineExceptionHandler.Key.f55278a);
        this._preHandler = this;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    /* JADX INFO: renamed from: g0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo6519g0(Throwable th) {
        Method declaredMethod;
        int i = Build.VERSION.SDK_INT;
        if (26 > i || i >= 28) {
            return;
        }
        Object obj = this._preHandler;
        if (obj != this) {
            declaredMethod = (Method) obj;
        } else {
            try {
                declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            } catch (Throwable unused) {
            }
            if (Modifier.isPublic(declaredMethod.getModifiers())) {
                if (!Modifier.isStatic(declaredMethod.getModifiers())) {
                    declaredMethod = null;
                }
                this._preHandler = declaredMethod;
            }
        }
        Object objInvoke = declaredMethod != null ? declaredMethod.invoke(null, new Object[0]) : null;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = objInvoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) objInvoke : null;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
    }
}
