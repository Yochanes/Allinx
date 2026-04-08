package com.exchange.allin.p024ui.widgets.depth;

import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"com/exchange/allin/ui/widgets/depth/DepthMapView$gestureDetector$1", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class DepthMapView$gestureDetector$1 extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DepthMapView f41437a;

    public DepthMapView$gestureDetector$1(DepthMapView depthMapView) {
        this.f41437a = depthMapView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent e) {
        Intrinsics.m18599g(e, "e");
        DepthMapView depthMapView = this.f41437a;
        if (depthMapView.f41407M) {
            depthMapView.f41408N = true;
            depthMapView.f41423j = true;
            depthMapView.invalidate();
        }
    }
}
