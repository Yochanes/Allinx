package androidx.camera.video.internal.compat.quirk;

import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Quirk;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class CameraUseInconsistentTimebaseQuirk implements Quirk {

    /* JADX INFO: renamed from: a */
    public static final HashSet f3414a = new HashSet(Arrays.asList("samsungexynos7570", "samsungexynos7870", "qcom"));

    /* JADX INFO: renamed from: b */
    public static final HashSet f3415b = new HashSet(Arrays.asList("sm4350", "sm6375"));

    /* JADX INFO: renamed from: c */
    public static final HashSet f3416c = new HashSet(Arrays.asList("m2007j20cg", "m2007j20ct"));
}
