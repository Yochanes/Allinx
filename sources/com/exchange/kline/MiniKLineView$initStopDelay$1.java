package com.exchange.kline;

import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"com/exchange/kline/MiniKLineView$initStopDelay$1", "Ljava/lang/Runnable;", "kline_release"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class MiniKLineView$initStopDelay$1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MiniKLineView f42108a;

    public MiniKLineView$initStopDelay$1(MiniKLineView miniKLineView) {
        this.f42108a = miniKLineView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MiniKLineView miniKLineView = this.f42108a;
        float f = miniKLineView.f42019P0;
        if (f < -200.0f) {
            if (f < -6000.0f) {
                miniKLineView.f42037a += 6;
            } else if (f < -4000.0f) {
                miniKLineView.f42037a += 5;
            } else if (f < -2500.0f) {
                miniKLineView.f42037a += 4;
            } else if (f < -1000.0f) {
                miniKLineView.f42037a += 3;
            } else {
                miniKLineView.f42037a++;
            }
            miniKLineView.f42019P0 = f + 200.0f;
            int i = miniKLineView.f42037a;
            ArrayList arrayList = miniKLineView.f41998F;
            if (i > arrayList.size() - miniKLineView.f42046d) {
                miniKLineView.f42037a = arrayList.size() - miniKLineView.f42046d;
            }
        } else if (f > 200.0f) {
            if (f > 6000.0f) {
                miniKLineView.f42037a -= 6;
            } else if (f > 4000.0f) {
                miniKLineView.f42037a -= 5;
            } else if (f > 2500.0f) {
                miniKLineView.f42037a -= 4;
            } else if (f > 1000.0f) {
                miniKLineView.f42037a -= 3;
            } else {
                miniKLineView.f42037a--;
            }
            miniKLineView.f42019P0 = f - 200.0f;
            if (miniKLineView.f42037a < 0) {
                miniKLineView.f42037a = 0;
            }
        }
        miniKLineView.m14291o();
        miniKLineView.m14288l();
        if (Math.abs(miniKLineView.f42019P0) > 200.0f) {
            miniKLineView.postDelayed(this, 15L);
        }
    }
}
