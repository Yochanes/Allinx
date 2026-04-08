package androidx.camera.core.impl;

import androidx.annotation.RequiresApi;
import androidx.camera.core.CameraFilter;
import androidx.camera.core.CameraInfo;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class LensFacingCameraFilter implements CameraFilter {

    /* JADX INFO: renamed from: b */
    public final int f2741b;

    public LensFacingCameraFilter(int i) {
        this.f2741b = i;
    }

    @Override // androidx.camera.core.CameraFilter
    /* JADX INFO: renamed from: b */
    public final List mo1216b(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraInfo cameraInfo = (CameraInfo) it.next();
            Preconditions.m7695b(cameraInfo instanceof CameraInfoInternal, "The camera info doesn't contain internal implementation.");
            if (cameraInfo.mo949h() == this.f2741b) {
                arrayList.add(cameraInfo);
            }
        }
        return arrayList;
    }
}
