package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import io.intercom.android.sdk.C5101R;
import io.intercom.android.sdk.views.IntercomToolbar;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomActivitySheetBinding implements ViewBinding {

    @NonNull
    public final IntercomToolbar intercomToolbar;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final LinearLayout sheetRoot;

    @NonNull
    public final FrameLayout sheetView;

    private IntercomActivitySheetBinding(@NonNull LinearLayout linearLayout, @NonNull IntercomToolbar intercomToolbar, @NonNull LinearLayout linearLayout2, @NonNull FrameLayout frameLayout) {
        this.rootView = linearLayout;
        this.intercomToolbar = intercomToolbar;
        this.sheetRoot = linearLayout2;
        this.sheetView = frameLayout;
    }

    @NonNull
    public static IntercomActivitySheetBinding bind(@NonNull View view) {
        int i = C5101R.id.intercom_toolbar;
        IntercomToolbar intercomToolbar = (IntercomToolbar) ViewBindings.m12059a(i, view);
        if (intercomToolbar != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            int i2 = C5101R.id.sheet_view;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.m12059a(i2, view);
            if (frameLayout != null) {
                return new IntercomActivitySheetBinding(linearLayout, intercomToolbar, linearLayout, frameLayout);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static IntercomActivitySheetBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return m22057getRoot();
    }

    @NonNull
    public static IntercomActivitySheetBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(C5101R.layout.intercom_activity_sheet, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    /* JADX INFO: renamed from: getRoot, reason: collision with other method in class */
    public LinearLayout m22057getRoot() {
        return this.rootView;
    }
}
