package com.king.camera.scan.config;

import android.util.Size;
import androidx.camera.core.resolutionselector.ResolutionFilter;
import com.king.logx.LogX;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.king.camera.scan.config.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4976a implements ResolutionFilter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42997a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AdaptiveCameraConfig f42998b;

    public /* synthetic */ C4976a(AdaptiveCameraConfig adaptiveCameraConfig, int i) {
        this.f42997a = i;
        this.f42998b = adaptiveCameraConfig;
    }

    @Override // androidx.camera.core.resolutionselector.ResolutionFilter
    /* JADX INFO: renamed from: a */
    public final ArrayList mo1732a(ArrayList arrayList) {
        switch (this.f42997a) {
            case 0:
                AdaptiveCameraConfig adaptiveCameraConfig = this.f42998b;
                adaptiveCameraConfig.getClass();
                LogX.m15342d("ImageAnalysis supportedSizes: " + arrayList, new Object[0]);
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Size size = (Size) it.next();
                    if (Math.min(size.getWidth(), size.getHeight()) <= adaptiveCameraConfig.f42994c) {
                        arrayList2.add(size);
                    }
                }
                return arrayList2;
            default:
                AdaptiveCameraConfig adaptiveCameraConfig2 = this.f42998b;
                adaptiveCameraConfig2.getClass();
                LogX.m15342d("Preview supportedSizes: " + arrayList, new Object[0]);
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Size size2 = (Size) it2.next();
                    if (Math.min(size2.getWidth(), size2.getHeight()) <= adaptiveCameraConfig2.f42993b) {
                        arrayList3.add(size2);
                    }
                }
                return arrayList3;
        }
    }
}
