package androidx.camera.camera2.internal.compat.workaround;

import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.quirk.UseTorchAsFlashQuirk;
import androidx.camera.core.impl.Quirks;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class UseTorchAsFlash {

    /* JADX INFO: renamed from: a */
    public final boolean f2093a;

    public UseTorchAsFlash(Quirks quirks) {
        this.f2093a = quirks.m1513a(UseTorchAsFlashQuirk.class);
    }
}
