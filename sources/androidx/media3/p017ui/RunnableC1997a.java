package androidx.media3.p017ui;

import android.view.View;

/* JADX INFO: renamed from: androidx.media3.ui.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1997a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f30140a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f30141b;

    public /* synthetic */ RunnableC1997a(int i, View view) {
        this.f30140a = i;
        this.f30141b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.f30141b;
        switch (this.f30140a) {
            case 0:
                int i = DefaultTimeBar.f29822U;
                ((DefaultTimeBar) view).m11101f(false);
                break;
            case 1:
                float[] fArr = PlayerControlView.f29880G0;
                ((PlayerControlView) view).m11130n();
                break;
            default:
                ((PlayerView) view).invalidate();
                break;
        }
    }
}
