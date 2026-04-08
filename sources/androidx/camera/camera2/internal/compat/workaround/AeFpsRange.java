package androidx.camera.camera2.internal.compat.workaround;

import android.util.Range;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk;
import androidx.camera.core.impl.Quirks;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class AeFpsRange {

    /* JADX INFO: renamed from: a */
    public final Range f2070a;

    public AeFpsRange(Quirks quirks) {
        AeFpsRangeLegacyQuirk aeFpsRangeLegacyQuirk = (AeFpsRangeLegacyQuirk) quirks.m1514b(AeFpsRangeLegacyQuirk.class);
        if (aeFpsRangeLegacyQuirk == null) {
            this.f2070a = null;
        } else {
            this.f2070a = aeFpsRangeLegacyQuirk.f2043a;
        }
    }
}
