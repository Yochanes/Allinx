package androidx.camera.core.impl;

import android.os.Handler;
import androidx.annotation.RequiresApi;
import com.google.auto.value.AutoValue;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@AutoValue
@RequiresApi
public abstract class CameraThreadConfig {
    /* JADX INFO: renamed from: a */
    public static CameraThreadConfig m1455a(Executor executor, Handler handler) {
        return new AutoValue_CameraThreadConfig(executor, handler);
    }

    /* JADX INFO: renamed from: b */
    public abstract Executor mo1382b();

    /* JADX INFO: renamed from: c */
    public abstract Handler mo1383c();
}
