package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import com.airbnb.lottie.utils.Utils;
import java.util.ArrayList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class CompoundTrimPathContent {

    /* JADX INFO: renamed from: a */
    public final ArrayList f34132a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final void m12588a(Path path) {
        ArrayList arrayList = this.f34132a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            TrimPathContent trimPathContent = (TrimPathContent) arrayList.get(size);
            ThreadLocal threadLocal = Utils.f34879a;
            if (trimPathContent != null && !trimPathContent.f34238a) {
                Utils.m12749a(path, trimPathContent.f34241d.m12615j() / 100.0f, trimPathContent.f34242e.m12615j() / 100.0f, trimPathContent.f34243f.m12615j() / 360.0f);
            }
        }
    }
}
