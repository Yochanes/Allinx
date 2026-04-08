package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import io.intercom.android.sdk.C5101R;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomMessengerCardBlockBinding implements ViewBinding {

    @NonNull
    public final ProgressBar loadingView;

    @NonNull
    private final FrameLayout rootView;

    private IntercomMessengerCardBlockBinding(@NonNull FrameLayout frameLayout, @NonNull ProgressBar progressBar) {
        this.rootView = frameLayout;
        this.loadingView = progressBar;
    }

    @NonNull
    public static IntercomMessengerCardBlockBinding bind(@NonNull View view) {
        int i = C5101R.id.loading_view;
        ProgressBar progressBar = (ProgressBar) ViewBindings.m12059a(i, view);
        if (progressBar != null) {
            return new IntercomMessengerCardBlockBinding((FrameLayout) view, progressBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static IntercomMessengerCardBlockBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return m22076getRoot();
    }

    @NonNull
    public static IntercomMessengerCardBlockBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(C5101R.layout.intercom_messenger_card_block, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    /* JADX INFO: renamed from: getRoot, reason: collision with other method in class */
    public FrameLayout m22076getRoot() {
        return this.rootView;
    }
}
