package androidx.camera.camera2.internal.compat.quirk;

import android.util.Pair;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Quirk;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class FlashAvailabilityBufferUnderflowQuirk implements Quirk {

    /* JADX INFO: renamed from: a */
    public static final HashSet f2056a;

    static {
        HashSet hashSet = new HashSet();
        f2056a = hashSet;
        Locale locale = Locale.US;
        hashSet.add(new Pair("sprd".toLowerCase(locale), "lemp".toLowerCase(locale)));
        hashSet.add(new Pair("sprd".toLowerCase(locale), "DM20C".toLowerCase(locale)));
    }
}
