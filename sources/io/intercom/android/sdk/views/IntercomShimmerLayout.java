package io.intercom.android.sdk.views;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import com.facebook.shimmer.Shimmer;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.common.api.CommonStatusCodes;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class IntercomShimmerLayout extends ShimmerFrameLayout {
    private static final Shimmer SHIMMER_CONFIG;

    static {
        Shimmer.AlphaHighlightBuilder alphaHighlightBuilder = new Shimmer.AlphaHighlightBuilder();
        alphaHighlightBuilder.f42148a.f42140m = 0.0f;
        SHIMMER_CONFIG = ((Shimmer.AlphaHighlightBuilder) ((Shimmer.AlphaHighlightBuilder) ((Shimmer.AlphaHighlightBuilder) ((Shimmer.AlphaHighlightBuilder) alphaHighlightBuilder.m14311f(0.01f)).m14309d(1500L)).m14310e(0.6f)).m14312g(100L)).m14307a();
    }

    public IntercomShimmerLayout(Context context) {
        super(context);
        init();
    }

    private void init() {
        setShimmer(SHIMMER_CONFIG);
    }

    public IntercomShimmerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public IntercomShimmerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    @TargetApi(CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE)
    public IntercomShimmerLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init();
    }
}
