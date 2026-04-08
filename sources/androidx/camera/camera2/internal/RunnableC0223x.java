package androidx.camera.camera2.internal;

import androidx.camera.core.FocusMeteringResult;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.x */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0223x implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2154a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FocusMeteringControl f2155b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f2156c;

    public /* synthetic */ RunnableC0223x(FocusMeteringControl focusMeteringControl, long j, int i) {
        this.f2154a = i;
        this.f2155b = focusMeteringControl;
        this.f2156c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2154a) {
            case 0:
                FocusMeteringControl focusMeteringControl = this.f2155b;
                focusMeteringControl.getClass();
                focusMeteringControl.f1793b.execute(new RunnableC0223x(focusMeteringControl, this.f2156c, 3));
                break;
            case 1:
                FocusMeteringControl focusMeteringControl2 = this.f2155b;
                focusMeteringControl2.getClass();
                focusMeteringControl2.f1793b.execute(new RunnableC0223x(focusMeteringControl2, this.f2156c, 2));
                break;
            case 2:
                FocusMeteringControl focusMeteringControl3 = this.f2155b;
                if (this.f2156c == focusMeteringControl3.f1802k) {
                    focusMeteringControl3.m1023b();
                }
                break;
            default:
                FocusMeteringControl focusMeteringControl4 = this.f2155b;
                if (this.f2156c == focusMeteringControl4.f1802k) {
                    focusMeteringControl4.f1804m = false;
                    ScheduledFuture scheduledFuture = focusMeteringControl4.f1801j;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(true);
                        focusMeteringControl4.f1801j = null;
                    }
                    CallbackToFutureAdapter.Completer completer = focusMeteringControl4.f1810s;
                    if (completer != null) {
                        completer.m6742b(new FocusMeteringResult(false));
                        focusMeteringControl4.f1810s = null;
                    }
                }
                break;
        }
    }
}
