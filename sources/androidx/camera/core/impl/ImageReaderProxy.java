package androidx.camera.core.impl;

import android.view.Surface;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.ImageProxy;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public interface ImageReaderProxy {

    /* JADX INFO: compiled from: Proguard */
    @RestrictTo
    public interface OnImageAvailableListener {
        /* JADX INFO: renamed from: b */
        void mo1168b(ImageReaderProxy imageReaderProxy);
    }

    /* JADX INFO: renamed from: a */
    Surface mo1184a();

    /* JADX INFO: renamed from: b */
    ImageProxy mo1185b();

    void close();

    /* JADX INFO: renamed from: d */
    int mo1186d();

    /* JADX INFO: renamed from: e */
    void mo1187e();

    /* JADX INFO: renamed from: f */
    int mo1188f();

    /* JADX INFO: renamed from: g */
    ImageProxy mo1189g();

    int getHeight();

    int getWidth();

    /* JADX INFO: renamed from: h */
    void mo1190h(OnImageAvailableListener onImageAvailableListener, Executor executor);
}
