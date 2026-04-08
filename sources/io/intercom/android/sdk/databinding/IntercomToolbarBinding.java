package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import io.intercom.android.sdk.C5101R;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomToolbarBinding implements ViewBinding {

    @NonNull
    public final FrameLayout intercomLeftItemLayout;

    @NonNull
    public final ImageView intercomToolbarAvatar;

    @NonNull
    public final View intercomToolbarAvatarActiveState;

    @NonNull
    public final ImageButton intercomToolbarClose;

    @NonNull
    public final View intercomToolbarDivider;

    @NonNull
    public final ImageButton intercomToolbarInbox;

    @NonNull
    public final TextView intercomToolbarSubtitle;

    @NonNull
    public final TextView intercomToolbarTitle;

    @NonNull
    public final LinearLayout intercomToolbarTitleContainer;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final RelativeLayout toolbarContentContainer;

    @NonNull
    public final ProgressBar toolbarProgressBar;

    @NonNull
    public final ImageView wallpaperImage;

    private IntercomToolbarBinding(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull ImageView imageView, @NonNull View view, @NonNull ImageButton imageButton, @NonNull View view2, @NonNull ImageButton imageButton2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout, @NonNull ProgressBar progressBar, @NonNull ImageView imageView2) {
        this.rootView = frameLayout;
        this.intercomLeftItemLayout = frameLayout2;
        this.intercomToolbarAvatar = imageView;
        this.intercomToolbarAvatarActiveState = view;
        this.intercomToolbarClose = imageButton;
        this.intercomToolbarDivider = view2;
        this.intercomToolbarInbox = imageButton2;
        this.intercomToolbarSubtitle = textView;
        this.intercomToolbarTitle = textView2;
        this.intercomToolbarTitleContainer = linearLayout;
        this.toolbarContentContainer = relativeLayout;
        this.toolbarProgressBar = progressBar;
        this.wallpaperImage = imageView2;
    }

    @NonNull
    public static IntercomToolbarBinding bind(@NonNull View view) {
        View viewM12059a;
        View viewM12059a2;
        int i = C5101R.id.intercom_left_item_layout;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.m12059a(i, view);
        if (frameLayout != null) {
            i = C5101R.id.intercom_toolbar_avatar;
            ImageView imageView = (ImageView) ViewBindings.m12059a(i, view);
            if (imageView != null && (viewM12059a = ViewBindings.m12059a((i = C5101R.id.intercom_toolbar_avatar_active_state), view)) != null) {
                i = C5101R.id.intercom_toolbar_close;
                ImageButton imageButton = (ImageButton) ViewBindings.m12059a(i, view);
                if (imageButton != null && (viewM12059a2 = ViewBindings.m12059a((i = C5101R.id.intercom_toolbar_divider), view)) != null) {
                    i = C5101R.id.intercom_toolbar_inbox;
                    ImageButton imageButton2 = (ImageButton) ViewBindings.m12059a(i, view);
                    if (imageButton2 != null) {
                        i = C5101R.id.intercom_toolbar_subtitle;
                        TextView textView = (TextView) ViewBindings.m12059a(i, view);
                        if (textView != null) {
                            i = C5101R.id.intercom_toolbar_title;
                            TextView textView2 = (TextView) ViewBindings.m12059a(i, view);
                            if (textView2 != null) {
                                i = C5101R.id.intercom_toolbar_title_container;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.m12059a(i, view);
                                if (linearLayout != null) {
                                    i = C5101R.id.toolbar_content_container;
                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.m12059a(i, view);
                                    if (relativeLayout != null) {
                                        i = C5101R.id.toolbar_progress_bar;
                                        ProgressBar progressBar = (ProgressBar) ViewBindings.m12059a(i, view);
                                        if (progressBar != null) {
                                            i = C5101R.id.wallpaper_image;
                                            ImageView imageView2 = (ImageView) ViewBindings.m12059a(i, view);
                                            if (imageView2 != null) {
                                                return new IntercomToolbarBinding((FrameLayout) view, frameLayout, imageView, viewM12059a, imageButton, viewM12059a2, imageButton2, textView, textView2, linearLayout, relativeLayout, progressBar, imageView2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static IntercomToolbarBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return m22083getRoot();
    }

    @NonNull
    public static IntercomToolbarBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(C5101R.layout.intercom_toolbar, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    /* JADX INFO: renamed from: getRoot, reason: collision with other method in class */
    public FrameLayout m22083getRoot() {
        return this.rootView;
    }
}
