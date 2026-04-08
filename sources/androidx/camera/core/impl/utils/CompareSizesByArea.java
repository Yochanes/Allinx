package androidx.camera.core.impl.utils;

import android.util.Size;
import androidx.annotation.RequiresApi;
import java.util.Comparator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class CompareSizesByArea implements Comparator<Size> {

    /* JADX INFO: renamed from: a */
    public final boolean f2850a;

    public CompareSizesByArea(boolean z2) {
        this.f2850a = z2;
    }

    @Override // java.util.Comparator
    public final int compare(Size size, Size size2) {
        Size size3 = size;
        Size size4 = size2;
        int iSignum = Long.signum((((long) size3.getWidth()) * ((long) size3.getHeight())) - (((long) size4.getWidth()) * ((long) size4.getHeight())));
        return this.f2850a ? iSignum * (-1) : iSignum;
    }
}
