package com.exchange.kline;

import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"com/exchange/kline/KLineView$initStopDelay$1", "Ljava/lang/Runnable;", "kline_release"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class KLineView$initStopDelay$1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ KLineView f41986a;

    public KLineView$initStopDelay$1(KLineView kLineView) {
        this.f41986a = kLineView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        KLineView kLineView = this.f41986a;
        float f = kLineView.f41957q1;
        if (f < -200.0f) {
            if (f < -6000.0f) {
                kLineView.f41912a += 6;
            } else if (f < -4000.0f) {
                kLineView.f41912a += 5;
            } else if (f < -2500.0f) {
                kLineView.f41912a += 4;
            } else if (f < -1000.0f) {
                kLineView.f41912a += 3;
            } else {
                kLineView.f41912a++;
            }
            kLineView.f41957q1 = f + 200.0f;
            int i = kLineView.f41912a;
            ArrayList arrayList = kLineView.f41905W;
            if (i > arrayList.size() - kLineView.f41921d) {
                kLineView.f41912a = arrayList.size() - kLineView.f41921d;
            }
        } else if (f > 200.0f) {
            if (f > 6000.0f) {
                kLineView.f41912a -= 6;
            } else if (f > 4000.0f) {
                kLineView.f41912a -= 5;
            } else if (f > 2500.0f) {
                kLineView.f41912a -= 4;
            } else if (f > 1000.0f) {
                kLineView.f41912a -= 3;
            } else {
                kLineView.f41912a--;
            }
            kLineView.f41957q1 = f - 200.0f;
            if (kLineView.f41912a < 0) {
                kLineView.f41912a = 0;
            }
        }
        kLineView.m14274r();
        kLineView.m14271o();
        if (Math.abs(kLineView.f41957q1) > 200.0f) {
            kLineView.postDelayed(this, 15L);
        }
    }
}
