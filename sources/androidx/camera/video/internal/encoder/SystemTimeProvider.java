package androidx.camera.video.internal.encoder;

import androidx.annotation.RequiresApi;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class SystemTimeProvider implements TimeProvider {
    /* JADX INFO: renamed from: a */
    public final long m1915a() {
        return TimeUnit.NANOSECONDS.toMicros(System.nanoTime());
    }
}
