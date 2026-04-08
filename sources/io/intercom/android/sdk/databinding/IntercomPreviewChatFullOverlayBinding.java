package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.p013ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import io.intercom.android.sdk.C5101R;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomPreviewChatFullOverlayBinding implements ViewBinding {

    @NonNull
    public final FrameLayout chatAvatarContainer;

    @NonNull
    public final FrameLayout chatFullBody;

    @NonNull
    public final ComposeView chatFullComposeView;

    @NonNull
    public final View chatOverlayOverflowFade;

    @NonNull
    public final ImageView chatheadAvatar;

    @NonNull
    public final ComposeView chatheadAvatarComposeView;

    @NonNull
    public final FrameLayout chatheadRoot;

    @NonNull
    public final LinearLayout chatheadTextContainer;

    @NonNull
    public final TextView chatheadTextHeader;

    @NonNull
    public final FrameLayout parentCard;

    @NonNull
    private final FrameLayout rootView;

    private IntercomPreviewChatFullOverlayBinding(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull FrameLayout frameLayout3, @NonNull ComposeView composeView, @NonNull View view, @NonNull ImageView imageView, @NonNull ComposeView composeView2, @NonNull FrameLayout frameLayout4, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull FrameLayout frameLayout5) {
        this.rootView = frameLayout;
        this.chatAvatarContainer = frameLayout2;
        this.chatFullBody = frameLayout3;
        this.chatFullComposeView = composeView;
        this.chatOverlayOverflowFade = view;
        this.chatheadAvatar = imageView;
        this.chatheadAvatarComposeView = composeView2;
        this.chatheadRoot = frameLayout4;
        this.chatheadTextContainer = linearLayout;
        this.chatheadTextHeader = textView;
        this.parentCard = frameLayout5;
    }

    @NonNull
    public static IntercomPreviewChatFullOverlayBinding bind(@NonNull View view) {
        View viewM12059a;
        int i = C5101R.id.chat_avatar_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.m12059a(i, view);
        if (frameLayout != null) {
            i = C5101R.id.chat_full_body;
            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.m12059a(i, view);
            if (frameLayout2 != null) {
                i = C5101R.id.chat_full_compose_view;
                ComposeView composeView = (ComposeView) ViewBindings.m12059a(i, view);
                if (composeView != null && (viewM12059a = ViewBindings.m12059a((i = C5101R.id.chat_overlay_overflow_fade), view)) != null) {
                    i = C5101R.id.chathead_avatar;
                    ImageView imageView = (ImageView) ViewBindings.m12059a(i, view);
                    if (imageView != null) {
                        i = C5101R.id.chathead_avatar_compose_view;
                        ComposeView composeView2 = (ComposeView) ViewBindings.m12059a(i, view);
                        if (composeView2 != null) {
                            FrameLayout frameLayout3 = (FrameLayout) view;
                            i = C5101R.id.chathead_text_container;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.m12059a(i, view);
                            if (linearLayout != null) {
                                i = C5101R.id.chathead_text_header;
                                TextView textView = (TextView) ViewBindings.m12059a(i, view);
                                if (textView != null) {
                                    i = C5101R.id.parent_card;
                                    FrameLayout frameLayout4 = (FrameLayout) ViewBindings.m12059a(i, view);
                                    if (frameLayout4 != null) {
                                        return new IntercomPreviewChatFullOverlayBinding(frameLayout3, frameLayout, frameLayout2, composeView, viewM12059a, imageView, composeView2, frameLayout3, linearLayout, textView, frameLayout4);
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
    public static IntercomPreviewChatFullOverlayBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return m22079getRoot();
    }

    @NonNull
    public static IntercomPreviewChatFullOverlayBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(C5101R.layout.intercom_preview_chat_full_overlay, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    /* JADX INFO: renamed from: getRoot, reason: collision with other method in class */
    public FrameLayout m22079getRoot() {
        return this.rootView;
    }
}
