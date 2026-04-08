package androidx.camera.core.internal.compat.workaround;

import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class JpegMetadataCorrector {

    /* JADX INFO: renamed from: a */
    public final IncorrectJpegMetadataQuirk f3004a;

    public JpegMetadataCorrector(Quirks quirks) {
        this.f3004a = (IncorrectJpegMetadataQuirk) quirks.m1514b(IncorrectJpegMetadataQuirk.class);
    }
}
