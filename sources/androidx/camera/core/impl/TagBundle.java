package androidx.camera.core.impl;

import android.util.ArrayMap;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class TagBundle {

    /* JADX INFO: renamed from: b */
    public static final TagBundle f2798b = new TagBundle(new ArrayMap());

    /* JADX INFO: renamed from: a */
    public final ArrayMap f2799a;

    public TagBundle(ArrayMap arrayMap) {
        this.f2799a = arrayMap;
    }

    public final String toString() {
        return "android.hardware.camera2.CaptureRequest.setTag.CX";
    }
}
