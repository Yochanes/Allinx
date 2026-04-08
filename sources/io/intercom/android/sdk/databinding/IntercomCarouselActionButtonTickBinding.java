package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import io.intercom.android.sdk.C5101R;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomCarouselActionButtonTickBinding implements ViewBinding {

    @NonNull
    private final ImageView rootView;

    private IntercomCarouselActionButtonTickBinding(@NonNull ImageView imageView) {
        this.rootView = imageView;
    }

    @NonNull
    public static IntercomCarouselActionButtonTickBinding bind(@NonNull View view) {
        if (view != null) {
            return new IntercomCarouselActionButtonTickBinding((ImageView) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static IntercomCarouselActionButtonTickBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return m22067getRoot();
    }

    @NonNull
    public static IntercomCarouselActionButtonTickBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(C5101R.layout.intercom_carousel_action_button_tick, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    /* JADX INFO: renamed from: getRoot, reason: collision with other method in class */
    public ImageView m22067getRoot() {
        return this.rootView;
    }
}
