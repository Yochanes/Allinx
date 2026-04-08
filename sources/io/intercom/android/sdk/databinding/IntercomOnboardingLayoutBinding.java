package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import io.intercom.android.sdk.C5101R;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomOnboardingLayoutBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    private IntercomOnboardingLayoutBinding(@NonNull LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    @NonNull
    public static IntercomOnboardingLayoutBinding bind(@NonNull View view) {
        if (view != null) {
            return new IntercomOnboardingLayoutBinding((LinearLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static IntercomOnboardingLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return m22078getRoot();
    }

    @NonNull
    public static IntercomOnboardingLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(C5101R.layout.intercom_onboarding_layout, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    /* JADX INFO: renamed from: getRoot, reason: collision with other method in class */
    public LinearLayout m22078getRoot() {
        return this.rootView;
    }
}
