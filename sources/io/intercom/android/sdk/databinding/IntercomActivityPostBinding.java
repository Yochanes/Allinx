package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import io.intercom.android.sdk.C5101R;
import io.intercom.android.sdk.conversation.ReactionInputView;
import io.intercom.android.sdk.views.ContentAwareScrollView;
import io.intercom.android.sdk.views.IntercomToolbar;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomActivityPostBinding implements ViewBinding {

    @NonNull
    public final LinearLayout appBarLayout;

    @NonNull
    public final FrameLayout conversationCoordinator;

    @NonNull
    public final IntercomToolbar intercomToolbar;

    @NonNull
    public final FrameLayout postContainer;

    @NonNull
    public final View postTouchTarget;

    @NonNull
    public final ContentAwareScrollView postView;

    @NonNull
    public final ReactionInputView reactionInputView;

    @NonNull
    private final RelativeLayout rootView;

    private IntercomActivityPostBinding(@NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull IntercomToolbar intercomToolbar, @NonNull FrameLayout frameLayout2, @NonNull View view, @NonNull ContentAwareScrollView contentAwareScrollView, @NonNull ReactionInputView reactionInputView) {
        this.rootView = relativeLayout;
        this.appBarLayout = linearLayout;
        this.conversationCoordinator = frameLayout;
        this.intercomToolbar = intercomToolbar;
        this.postContainer = frameLayout2;
        this.postTouchTarget = view;
        this.postView = contentAwareScrollView;
        this.reactionInputView = reactionInputView;
    }

    @NonNull
    public static IntercomActivityPostBinding bind(@NonNull View view) {
        View viewM12059a;
        int i = C5101R.id.app_bar_layout;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.m12059a(i, view);
        if (linearLayout != null) {
            i = C5101R.id.conversation_coordinator;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.m12059a(i, view);
            if (frameLayout != null) {
                i = C5101R.id.intercom_toolbar;
                IntercomToolbar intercomToolbar = (IntercomToolbar) ViewBindings.m12059a(i, view);
                if (intercomToolbar != null) {
                    i = C5101R.id.post_container;
                    FrameLayout frameLayout2 = (FrameLayout) ViewBindings.m12059a(i, view);
                    if (frameLayout2 != null && (viewM12059a = ViewBindings.m12059a((i = C5101R.id.post_touch_target), view)) != null) {
                        i = C5101R.id.post_view;
                        ContentAwareScrollView contentAwareScrollView = (ContentAwareScrollView) ViewBindings.m12059a(i, view);
                        if (contentAwareScrollView != null) {
                            i = C5101R.id.reaction_input_view;
                            ReactionInputView reactionInputView = (ReactionInputView) ViewBindings.m12059a(i, view);
                            if (reactionInputView != null) {
                                return new IntercomActivityPostBinding((RelativeLayout) view, linearLayout, frameLayout, intercomToolbar, frameLayout2, viewM12059a, contentAwareScrollView, reactionInputView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static IntercomActivityPostBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return m22056getRoot();
    }

    @NonNull
    public static IntercomActivityPostBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(C5101R.layout.intercom_activity_post, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    /* JADX INFO: renamed from: getRoot, reason: collision with other method in class */
    public RelativeLayout m22056getRoot() {
        return this.rootView;
    }
}
