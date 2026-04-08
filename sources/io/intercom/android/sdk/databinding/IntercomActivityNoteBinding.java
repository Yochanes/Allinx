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
import io.intercom.android.sdk.conversation.ReactionInputView;
import io.intercom.android.sdk.views.ContentAwareScrollView;
import io.intercom.android.sdk.views.IntercomToolbar;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomActivityNoteBinding implements ViewBinding {

    @NonNull
    public final LinearLayout appBarLayout;

    @NonNull
    public final IntercomToolbar intercomToolbar;

    @NonNull
    public final FrameLayout noteComposerContainer;

    @NonNull
    public final LinearLayout noteLayout;

    @NonNull
    public final View noteTouchTarget;

    @NonNull
    public final ContentAwareScrollView noteView;

    @NonNull
    public final ReactionInputView reactionInputView;

    @NonNull
    private final FrameLayout rootView;

    private IntercomActivityNoteBinding(@NonNull FrameLayout frameLayout, @NonNull LinearLayout linearLayout, @NonNull IntercomToolbar intercomToolbar, @NonNull FrameLayout frameLayout2, @NonNull LinearLayout linearLayout2, @NonNull View view, @NonNull ContentAwareScrollView contentAwareScrollView, @NonNull ReactionInputView reactionInputView) {
        this.rootView = frameLayout;
        this.appBarLayout = linearLayout;
        this.intercomToolbar = intercomToolbar;
        this.noteComposerContainer = frameLayout2;
        this.noteLayout = linearLayout2;
        this.noteTouchTarget = view;
        this.noteView = contentAwareScrollView;
        this.reactionInputView = reactionInputView;
    }

    @NonNull
    public static IntercomActivityNoteBinding bind(@NonNull View view) {
        View viewM12059a;
        int i = C5101R.id.app_bar_layout;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.m12059a(i, view);
        if (linearLayout != null) {
            i = C5101R.id.intercom_toolbar;
            IntercomToolbar intercomToolbar = (IntercomToolbar) ViewBindings.m12059a(i, view);
            if (intercomToolbar != null) {
                i = C5101R.id.note_composer_container;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.m12059a(i, view);
                if (frameLayout != null) {
                    i = C5101R.id.note_layout;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.m12059a(i, view);
                    if (linearLayout2 != null && (viewM12059a = ViewBindings.m12059a((i = C5101R.id.note_touch_target), view)) != null) {
                        i = C5101R.id.note_view;
                        ContentAwareScrollView contentAwareScrollView = (ContentAwareScrollView) ViewBindings.m12059a(i, view);
                        if (contentAwareScrollView != null) {
                            i = C5101R.id.reaction_input_view;
                            ReactionInputView reactionInputView = (ReactionInputView) ViewBindings.m12059a(i, view);
                            if (reactionInputView != null) {
                                return new IntercomActivityNoteBinding((FrameLayout) view, linearLayout, intercomToolbar, frameLayout, linearLayout2, viewM12059a, contentAwareScrollView, reactionInputView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static IntercomActivityNoteBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return m22055getRoot();
    }

    @NonNull
    public static IntercomActivityNoteBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(C5101R.layout.intercom_activity_note, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    /* JADX INFO: renamed from: getRoot, reason: collision with other method in class */
    public FrameLayout m22055getRoot() {
        return this.rootView;
    }
}
