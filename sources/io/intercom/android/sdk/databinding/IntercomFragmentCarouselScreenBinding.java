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
import io.intercom.android.sdk.views.ContentAwareScrollView;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomFragmentCarouselScreenBinding implements ViewBinding {

    @NonNull
    public final LinearLayout intercomCarouselActionLayout;

    @NonNull
    public final FrameLayout intercomCarouselContentContainer;

    @NonNull
    public final LinearLayout intercomCarouselFragmentRoot;

    @NonNull
    public final View intercomCarouselGradient;

    @NonNull
    public final ContentAwareScrollView intercomCarouselScrollView;

    @NonNull
    private final LinearLayout rootView;

    private IntercomFragmentCarouselScreenBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull FrameLayout frameLayout, @NonNull LinearLayout linearLayout3, @NonNull View view, @NonNull ContentAwareScrollView contentAwareScrollView) {
        this.rootView = linearLayout;
        this.intercomCarouselActionLayout = linearLayout2;
        this.intercomCarouselContentContainer = frameLayout;
        this.intercomCarouselFragmentRoot = linearLayout3;
        this.intercomCarouselGradient = view;
        this.intercomCarouselScrollView = contentAwareScrollView;
    }

    @NonNull
    public static IntercomFragmentCarouselScreenBinding bind(@NonNull View view) {
        int i = C5101R.id.intercom_carousel_action_layout;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.m12059a(i, view);
        if (linearLayout != null) {
            i = C5101R.id.intercom_carousel_content_container;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.m12059a(i, view);
            if (frameLayout != null) {
                LinearLayout linearLayout2 = (LinearLayout) view;
                i = C5101R.id.intercom_carousel_gradient;
                View viewM12059a = ViewBindings.m12059a(i, view);
                if (viewM12059a != null) {
                    i = C5101R.id.intercom_carousel_scroll_view;
                    ContentAwareScrollView contentAwareScrollView = (ContentAwareScrollView) ViewBindings.m12059a(i, view);
                    if (contentAwareScrollView != null) {
                        return new IntercomFragmentCarouselScreenBinding(linearLayout2, linearLayout, frameLayout, linearLayout2, viewM12059a, contentAwareScrollView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static IntercomFragmentCarouselScreenBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return m22073getRoot();
    }

    @NonNull
    public static IntercomFragmentCarouselScreenBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(C5101R.layout.intercom_fragment_carousel_screen, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    /* JADX INFO: renamed from: getRoot, reason: collision with other method in class */
    public LinearLayout m22073getRoot() {
        return this.rootView;
    }
}
