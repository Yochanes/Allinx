package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import io.intercom.android.sdk.C5101R;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomLinkBlockBinding implements ViewBinding {

    @NonNull
    public final TextView author;

    @NonNull
    public final ImageView avatar;

    @NonNull
    public final TextView description;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView title;

    private IntercomLinkBlockBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = linearLayout;
        this.author = textView;
        this.avatar = imageView;
        this.description = textView2;
        this.title = textView3;
    }

    @NonNull
    public static IntercomLinkBlockBinding bind(@NonNull View view) {
        int i = C5101R.id.author;
        TextView textView = (TextView) ViewBindings.m12059a(i, view);
        if (textView != null) {
            i = C5101R.id.avatar;
            ImageView imageView = (ImageView) ViewBindings.m12059a(i, view);
            if (imageView != null) {
                i = C5101R.id.description;
                TextView textView2 = (TextView) ViewBindings.m12059a(i, view);
                if (textView2 != null) {
                    i = C5101R.id.title;
                    TextView textView3 = (TextView) ViewBindings.m12059a(i, view);
                    if (textView3 != null) {
                        return new IntercomLinkBlockBinding((LinearLayout) view, textView, imageView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static IntercomLinkBlockBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return m22075getRoot();
    }

    @NonNull
    public static IntercomLinkBlockBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(C5101R.layout.intercom_link_block, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    /* JADX INFO: renamed from: getRoot, reason: collision with other method in class */
    public LinearLayout m22075getRoot() {
        return this.rootView;
    }
}
