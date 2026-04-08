package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import io.intercom.android.sdk.C5101R;
import io.intercom.android.sdk.lightbox.LightBoxImageView;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomActivityLightboxBinding implements ViewBinding {

    @NonNull
    public final LightBoxImageView fullImage;

    @NonNull
    public final RelativeLayout rootView;

    @NonNull
    private final RelativeLayout rootView_;

    private IntercomActivityLightboxBinding(@NonNull RelativeLayout relativeLayout, @NonNull LightBoxImageView lightBoxImageView, @NonNull RelativeLayout relativeLayout2) {
        this.rootView_ = relativeLayout;
        this.fullImage = lightBoxImageView;
        this.rootView = relativeLayout2;
    }

    @NonNull
    public static IntercomActivityLightboxBinding bind(@NonNull View view) {
        int i = C5101R.id.full_image;
        LightBoxImageView lightBoxImageView = (LightBoxImageView) ViewBindings.m12059a(i, view);
        if (lightBoxImageView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        }
        RelativeLayout relativeLayout = (RelativeLayout) view;
        return new IntercomActivityLightboxBinding(relativeLayout, lightBoxImageView, relativeLayout);
    }

    @NonNull
    public static IntercomActivityLightboxBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return m22054getRoot();
    }

    @NonNull
    public static IntercomActivityLightboxBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(C5101R.layout.intercom_activity_lightbox, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    /* JADX INFO: renamed from: getRoot, reason: collision with other method in class */
    public RelativeLayout m22054getRoot() {
        return this.rootView_;
    }
}
