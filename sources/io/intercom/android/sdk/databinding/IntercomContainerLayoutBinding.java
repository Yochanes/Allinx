package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import io.intercom.android.sdk.C5101R;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomContainerLayoutBinding implements ViewBinding {

    @NonNull
    public final LinearLayout cellLayout;

    @NonNull
    public final ProgressBar progressBar;

    @NonNull
    private final FrameLayout rootView;

    private IntercomContainerLayoutBinding(@NonNull FrameLayout frameLayout, @NonNull LinearLayout linearLayout, @NonNull ProgressBar progressBar) {
        this.rootView = frameLayout;
        this.cellLayout = linearLayout;
        this.progressBar = progressBar;
    }

    @NonNull
    public static IntercomContainerLayoutBinding bind(@NonNull View view) {
        int i = C5101R.id.cellLayout;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.m12059a(i, view);
        if (linearLayout != null) {
            i = C5101R.id.progressBar;
            ProgressBar progressBar = (ProgressBar) ViewBindings.m12059a(i, view);
            if (progressBar != null) {
                return new IntercomContainerLayoutBinding((FrameLayout) view, linearLayout, progressBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static IntercomContainerLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return m22068getRoot();
    }

    @NonNull
    public static IntercomContainerLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(C5101R.layout.intercom_container_layout, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    /* JADX INFO: renamed from: getRoot, reason: collision with other method in class */
    public FrameLayout m22068getRoot() {
        return this.rootView;
    }
}
