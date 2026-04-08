package com.exchange.kline;

import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"com/exchange/kline/FlashKLineView$initStopDelay$1", "Ljava/lang/Runnable;", "kline_release"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class FlashKLineView$initStopDelay$1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FlashKLineView f41804a;

    public FlashKLineView$initStopDelay$1(FlashKLineView flashKLineView) {
        this.f41804a = flashKLineView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FlashKLineView flashKLineView = this.f41804a;
        float f = flashKLineView.f41720P0;
        if (f < -200.0f) {
            if (f < -6000.0f) {
                flashKLineView.f41738a += 6;
            } else if (f < -4000.0f) {
                flashKLineView.f41738a += 5;
            } else if (f < -2500.0f) {
                flashKLineView.f41738a += 4;
            } else if (f < -1000.0f) {
                flashKLineView.f41738a += 3;
            } else {
                flashKLineView.f41738a++;
            }
            flashKLineView.f41720P0 = f + 200.0f;
            int i = flashKLineView.f41738a;
            ArrayList arrayList = flashKLineView.f41699F;
            if (i > arrayList.size() - flashKLineView.f41747d) {
                flashKLineView.f41738a = arrayList.size() - flashKLineView.f41747d;
            }
        } else if (f > 200.0f) {
            if (f > 6000.0f) {
                flashKLineView.f41738a -= 6;
            } else if (f > 4000.0f) {
                flashKLineView.f41738a -= 5;
            } else if (f > 2500.0f) {
                flashKLineView.f41738a -= 4;
            } else if (f > 1000.0f) {
                flashKLineView.f41738a -= 3;
            } else {
                flashKLineView.f41738a--;
            }
            flashKLineView.f41720P0 = f - 200.0f;
            if (flashKLineView.f41738a < 0) {
                flashKLineView.f41738a = 0;
            }
        }
        flashKLineView.m14251o();
        flashKLineView.m14248l();
        if (Math.abs(flashKLineView.f41720P0) > 200.0f) {
            flashKLineView.postDelayed(this, 15L);
        }
    }
}
