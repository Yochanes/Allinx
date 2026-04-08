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
import io.intercom.android.sdk.p032m5.components.IntercomPrimaryButton;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomConversationRatingBlockBinding implements ViewBinding {

    @NonNull
    public final LinearLayout intercomRatingOptionsLayout;

    @NonNull
    public final IntercomPrimaryButton intercomRatingTellUsMoreButton;

    @NonNull
    public final ImageView intercomYouRatedImageView;

    @NonNull
    public final LinearLayout intercomYouRatedLayout;

    @NonNull
    public final TextView rateYourConversationTextView;

    @NonNull
    private final LinearLayout rootView;

    private IntercomConversationRatingBlockBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull IntercomPrimaryButton intercomPrimaryButton, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout3, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.intercomRatingOptionsLayout = linearLayout2;
        this.intercomRatingTellUsMoreButton = intercomPrimaryButton;
        this.intercomYouRatedImageView = imageView;
        this.intercomYouRatedLayout = linearLayout3;
        this.rateYourConversationTextView = textView;
    }

    @NonNull
    public static IntercomConversationRatingBlockBinding bind(@NonNull View view) {
        int i = C5101R.id.intercom_rating_options_layout;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.m12059a(i, view);
        if (linearLayout != null) {
            i = C5101R.id.intercom_rating_tell_us_more_button;
            IntercomPrimaryButton intercomPrimaryButton = (IntercomPrimaryButton) ViewBindings.m12059a(i, view);
            if (intercomPrimaryButton != null) {
                i = C5101R.id.intercom_you_rated_image_view;
                ImageView imageView = (ImageView) ViewBindings.m12059a(i, view);
                if (imageView != null) {
                    i = C5101R.id.intercom_you_rated_layout;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.m12059a(i, view);
                    if (linearLayout2 != null) {
                        i = C5101R.id.rate_your_conversation_text_view;
                        TextView textView = (TextView) ViewBindings.m12059a(i, view);
                        if (textView != null) {
                            return new IntercomConversationRatingBlockBinding((LinearLayout) view, linearLayout, intercomPrimaryButton, imageView, linearLayout2, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static IntercomConversationRatingBlockBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return m22069getRoot();
    }

    @NonNull
    public static IntercomConversationRatingBlockBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(C5101R.layout.intercom_conversation_rating_block, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    /* JADX INFO: renamed from: getRoot, reason: collision with other method in class */
    public LinearLayout m22069getRoot() {
        return this.rootView;
    }
}
