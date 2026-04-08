package androidx.camera.core.impl;

import android.util.Size;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import com.google.auto.value.AutoValue;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@AutoValue
@RequiresApi
public abstract class OutputSurface {
    /* JADX INFO: renamed from: a */
    public static OutputSurface m1512a(Surface surface, Size size, int i) {
        return new AutoValue_OutputSurface(surface, size, i);
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo1408b();

    /* JADX INFO: renamed from: c */
    public abstract Size mo1409c();

    /* JADX INFO: renamed from: d */
    public abstract Surface mo1410d();
}
