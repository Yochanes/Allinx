package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.core.view.accessibility.AbstractC1465b;
import java.util.Random;

/* JADX INFO: renamed from: androidx.profileinstaller.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ChoreographerFrameCallbackC2109a implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ProfileInstallerInitializer f31516a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f31517b;

    public /* synthetic */ ChoreographerFrameCallbackC2109a(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f31516a = profileInstallerInitializer;
        this.f31517b = context;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f31516a.getClass();
        (Build.VERSION.SDK_INT >= 28 ? AbstractC1465b.m8064l(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC2110b(this.f31517b, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
    }
}
