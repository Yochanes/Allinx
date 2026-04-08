package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.profileinstaller.DeviceProfileWriter;
import java.io.Serializable;

/* JADX INFO: renamed from: androidx.activity.g */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0048g implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f203a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f204b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f205c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f206d;

    public /* synthetic */ RunnableC0048g(DrmSessionEventListener.EventDispatcher eventDispatcher, DrmSessionEventListener drmSessionEventListener, int i) {
        this.f203a = 2;
        this.f204b = eventDispatcher;
        this.f206d = drmSessionEventListener;
        this.f205c = i;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.media3.exoplayer.drm.DrmSessionEventListener, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f203a) {
            case 0:
                ((ComponentActivity$activityResultRegistry$1) this.f204b).m222a(this.f205c, ((ActivityResultContract.SynchronousResult) this.f206d).f247a);
                break;
            case 1:
                ((ComponentActivity$activityResultRegistry$1) this.f204b).m223b(this.f205c, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.f206d));
                break;
            case 2:
                DrmSessionEventListener.EventDispatcher eventDispatcher = (DrmSessionEventListener.EventDispatcher) this.f204b;
                int i = eventDispatcher.f26820a;
                this.f206d.mo10011f0(i, eventDispatcher.f26821b, this.f205c);
                break;
            default:
                ((DeviceProfileWriter) this.f204b).f31473b.mo11499a(this.f205c, (Serializable) this.f206d);
                break;
        }
    }

    public /* synthetic */ RunnableC0048g(Object obj, int i, int i2, Object obj2) {
        this.f203a = i2;
        this.f204b = obj;
        this.f205c = i;
        this.f206d = obj2;
    }
}
