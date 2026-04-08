package androidx.work;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Function;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: androidx.work.c */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2272c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f32655a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AtomicBoolean f32656b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CallbackToFutureAdapter.Completer f32657c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Function f32658d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ RunnableC2272c(AtomicBoolean atomicBoolean, CallbackToFutureAdapter.Completer completer, Function0 function0, int i) {
        this.f32655a = i;
        this.f32656b = atomicBoolean;
        this.f32657c = completer;
        switch (i) {
            case 1:
                this.f32658d = (Lambda) function0;
                break;
            default:
                this.f32658d = function0;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f32655a) {
            case 0:
                CallbackToFutureAdapter.Completer completer = this.f32657c;
                Function0 function0 = (Function0) this.f32658d;
                if (!this.f32656b.get()) {
                    try {
                        completer.m6742b(function0.invoke());
                    } catch (Throwable th) {
                        completer.m6744d(th);
                        return;
                    }
                    break;
                }
                break;
            default:
                CallbackToFutureAdapter.Completer completer2 = this.f32657c;
                ?? r1 = (Lambda) this.f32658d;
                if (!this.f32656b.get()) {
                    try {
                        completer2.m6742b(r1.invoke());
                    } catch (Throwable th2) {
                        completer2.m6744d(th2);
                    }
                    break;
                }
                break;
        }
    }
}
