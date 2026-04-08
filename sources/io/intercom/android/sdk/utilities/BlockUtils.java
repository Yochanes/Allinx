package io.intercom.android.sdk.utilities;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import io.intercom.android.sdk.C5101R;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class BlockUtils {
    private static final int DEFAULT_MARGIN_BOTTOM_DP = 10;
    private static final int LARGE_LINE_SPACING_DP = 4;
    private static final int SMALL_LINE_SPACING_DP = 2;

    public static void createLayoutParams(View view, int i, int i2) {
        view.setLayoutParams(new LinearLayout.LayoutParams(i, i2));
    }

    public static View getBlockView(ViewGroup viewGroup, LinearLayout linearLayout, Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(C5101R.layout.intercom_container_layout, viewGroup, false);
        LinearLayout linearLayout2 = (LinearLayout) viewInflate.findViewById(C5101R.id.cellLayout);
        if (linearLayout.getParent() != null) {
            ((LinearLayout) linearLayout.getParent()).removeView(linearLayout);
        }
        if (linearLayout2.getChildCount() > 0) {
            linearLayout2.removeAllViews();
        }
        linearLayout2.addView(linearLayout, 0);
        viewInflate.setFocusable(false);
        linearLayout2.setVisibility(0);
        return viewInflate;
    }

    public static void setDefaultMarginBottom(View view) {
        setMarginBottom(view, 10);
    }

    public static void setLargeLineSpacing(TextView textView) {
        setLineSpacing(textView, 4);
    }

    public static void setLayoutMarginsAndGravity(View view, int i, boolean z2) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        if (z2) {
            layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, 0);
        }
        layoutParams.gravity = i;
    }

    private static void setLineSpacing(TextView textView, int i) {
        textView.setLineSpacing(ScreenUtils.dpToPx(i, textView.getContext()), 1.0f);
    }

    public static void setMarginBottom(View view, int i) {
        ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin = ScreenUtils.dpToPx(i, view.getContext());
    }

    public static void setMarginLeft(View view, int i) {
        ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).setMarginStart(ScreenUtils.dpToPx(i, view.getContext()));
    }

    public static void setSmallLineSpacing(TextView textView) {
        setLineSpacing(textView, 2);
    }
}
