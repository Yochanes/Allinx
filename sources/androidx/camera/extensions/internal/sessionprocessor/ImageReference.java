package androidx.camera.extensions.internal.sessionprocessor;

import android.media.Image;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public interface ImageReference {
    /* JADX INFO: renamed from: a */
    boolean mo1768a();

    Image get();

    boolean increment();
}
