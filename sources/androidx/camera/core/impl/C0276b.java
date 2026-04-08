package androidx.camera.core.impl;

import androidx.camera.core.CameraFilter;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: androidx.camera.core.impl.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0276b implements CameraFilter {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2827b;

    @Override // androidx.camera.core.CameraFilter
    /* JADX INFO: renamed from: b */
    public final List mo1216b(List list) {
        switch (this.f2827b) {
            case 0:
                int i = CameraFilters.f2642a;
                return list;
            default:
                int i2 = CameraFilters.f2642a;
                return Collections.EMPTY_LIST;
        }
    }
}
