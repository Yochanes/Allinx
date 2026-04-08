package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import io.intercom.android.sdk.C5101R;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomCarouselActionButtonBinding implements ViewBinding {

    @NonNull
    private final TextView rootView;

    private IntercomCarouselActionButtonBinding(@NonNull TextView textView) {
        this.rootView = textView;
    }

    @NonNull
    public static IntercomCarouselActionButtonBinding bind(@NonNull View view) {
        if (view != null) {
            return new IntercomCarouselActionButtonBinding((TextView) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static IntercomCarouselActionButtonBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return m22066getRoot();
    }

    @NonNull
    public static IntercomCarouselActionButtonBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(C5101R.layout.intercom_carousel_action_button, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    /* JADX INFO: renamed from: getRoot, reason: collision with other method in class */
    public TextView m22066getRoot() {
        return this.rootView;
    }
}
