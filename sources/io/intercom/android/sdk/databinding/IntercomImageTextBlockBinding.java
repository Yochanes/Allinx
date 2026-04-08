package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import io.intercom.android.sdk.C5101R;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomImageTextBlockBinding implements ViewBinding {

    @NonNull
    public final FrameLayout imageHolder;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView text;

    @NonNull
    public final TextView title;

    private IntercomImageTextBlockBinding(@NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = linearLayout;
        this.imageHolder = frameLayout;
        this.text = textView;
        this.title = textView2;
    }

    @NonNull
    public static IntercomImageTextBlockBinding bind(@NonNull View view) {
        int i = C5101R.id.image_holder;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.m12059a(i, view);
        if (frameLayout != null) {
            i = C5101R.id.text;
            TextView textView = (TextView) ViewBindings.m12059a(i, view);
            if (textView != null) {
                i = C5101R.id.title;
                TextView textView2 = (TextView) ViewBindings.m12059a(i, view);
                if (textView2 != null) {
                    return new IntercomImageTextBlockBinding((LinearLayout) view, frameLayout, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static IntercomImageTextBlockBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return m22074getRoot();
    }

    @NonNull
    public static IntercomImageTextBlockBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(C5101R.layout.intercom_image_text_block, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    /* JADX INFO: renamed from: getRoot, reason: collision with other method in class */
    public LinearLayout m22074getRoot() {
        return this.rootView;
    }
}
