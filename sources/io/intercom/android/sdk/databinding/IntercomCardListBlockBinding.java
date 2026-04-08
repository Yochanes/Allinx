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

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomCardListBlockBinding implements ViewBinding {

    @NonNull
    public final LinearLayout cardLinks;

    @NonNull
    private final FrameLayout rootView;

    private IntercomCardListBlockBinding(@NonNull FrameLayout frameLayout, @NonNull LinearLayout linearLayout) {
        this.rootView = frameLayout;
        this.cardLinks = linearLayout;
    }

    @NonNull
    public static IntercomCardListBlockBinding bind(@NonNull View view) {
        int i = C5101R.id.card_links;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.m12059a(i, view);
        if (linearLayout != null) {
            return new IntercomCardListBlockBinding((FrameLayout) view, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static IntercomCardListBlockBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return m22065getRoot();
    }

    @NonNull
    public static IntercomCardListBlockBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(C5101R.layout.intercom_card_list_block, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    /* JADX INFO: renamed from: getRoot, reason: collision with other method in class */
    public FrameLayout m22065getRoot() {
        return this.rootView;
    }
}
