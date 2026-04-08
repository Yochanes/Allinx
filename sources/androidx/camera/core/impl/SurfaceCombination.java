package androidx.camera.core.impl;

import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class SurfaceCombination {

    /* JADX INFO: renamed from: a */
    public final ArrayList f2782a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public static void m1549b(ArrayList arrayList, int i, int[] iArr, int i2) {
        if (i2 >= iArr.length) {
            arrayList.add((int[]) iArr.clone());
            return;
        }
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = 0;
            while (true) {
                if (i4 >= i2) {
                    iArr[i2] = i3;
                    m1549b(arrayList, i, iArr, i2 + 1);
                    break;
                } else if (i3 == iArr[i4]) {
                    break;
                } else {
                    i4++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1550a(SurfaceConfig surfaceConfig) {
        this.f2782a.add(surfaceConfig);
    }

    /* JADX INFO: renamed from: c */
    public final List m1551c(List list) {
        if (list.isEmpty()) {
            return new ArrayList();
        }
        int size = list.size();
        ArrayList arrayList = this.f2782a;
        if (size != arrayList.size()) {
            return null;
        }
        int size2 = arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        boolean z2 = false;
        m1549b(arrayList2, size2, new int[size2], 0);
        SurfaceConfig[] surfaceConfigArr = new SurfaceConfig[list.size()];
        Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int[] iArr = (int[]) it.next();
            boolean z3 = true;
            for (int i = 0; i < arrayList.size(); i++) {
                if (iArr[i] < list.size()) {
                    SurfaceConfig surfaceConfig = (SurfaceConfig) arrayList.get(i);
                    SurfaceConfig surfaceConfig2 = (SurfaceConfig) list.get(iArr[i]);
                    surfaceConfig.getClass();
                    z3 &= surfaceConfig2.mo1427c().f2792a <= surfaceConfig.mo1427c().f2792a && surfaceConfig2.mo1428d() == surfaceConfig.mo1428d();
                    if (!z3) {
                        break;
                    }
                    surfaceConfigArr[iArr[i]] = (SurfaceConfig) arrayList.get(i);
                }
            }
            if (z3) {
                z2 = true;
                break;
            }
        }
        if (z2) {
            return Arrays.asList(surfaceConfigArr);
        }
        return null;
    }
}
