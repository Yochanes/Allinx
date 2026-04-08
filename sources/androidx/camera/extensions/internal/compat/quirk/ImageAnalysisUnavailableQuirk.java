package androidx.camera.extensions.internal.compat.quirk;

import android.os.Build;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Quirk;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class ImageAnalysisUnavailableQuirk implements Quirk {

    /* JADX INFO: renamed from: a */
    public static final HashSet f3228a = new HashSet(Arrays.asList(Pair.create("samsung", "dm3q"), Pair.create("samsung", "q2q"), Pair.create("samsung", "a52sxq"), Pair.create("samsung", "b0q")));

    public ImageAnalysisUnavailableQuirk() {
        HashSet hashSet = new HashSet();
        String str = Build.BRAND;
        if (str.equalsIgnoreCase("SAMSUNG") && Build.DEVICE.equalsIgnoreCase("dm3q")) {
            hashSet.addAll(Arrays.asList(Pair.create("1", 1), Pair.create("1", 4), Pair.create("3", 1), Pair.create("3", 4)));
            return;
        }
        if (str.equalsIgnoreCase("SAMSUNG") && Build.DEVICE.equalsIgnoreCase("q2q")) {
            hashSet.addAll(Arrays.asList(Pair.create("0", 1), Pair.create("0", 4)));
            return;
        }
        if (str.equalsIgnoreCase("SAMSUNG") && Build.DEVICE.equalsIgnoreCase("a52sxq")) {
            hashSet.addAll(Arrays.asList(Pair.create("0", 1), Pair.create("0", 4)));
        } else if (str.equalsIgnoreCase("SAMSUNG") && Build.DEVICE.equalsIgnoreCase("b0q")) {
            hashSet.addAll(Arrays.asList(Pair.create("3", 1), Pair.create("3", 4)));
        }
    }
}
