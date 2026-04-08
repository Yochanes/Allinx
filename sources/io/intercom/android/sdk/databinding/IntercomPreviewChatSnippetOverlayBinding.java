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
public final class IntercomPreviewChatSnippetOverlayBinding implements ViewBinding {

    @NonNull
    public final FrameLayout chatAvatarContainer;

    @NonNull
    public final FrameLayout chatFullBody;

    @NonNull
    public final ComposeView chatSnippetComposeView;

    @NonNull
    public final ImageView chatheadAvatar;

    @NonNull
    public final ComposeView chatheadAvatarComposeView;

    @NonNull
    public final FrameLayout chatheadRoot;

    @NonNull
    public final TextView chatheadTextBody;

    @NonNull
    public final LinearLayout chatheadTextContainer;

    @NonNull
    public final TextView chatheadTextHeader;

    @NonNull
    public final FrameLayout parentCard;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final ComposeView ticketHeaderComposeView;

    private IntercomPreviewChatSnippetOverlayBinding(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull FrameLayout frameLayout3, @NonNull ComposeView composeView, @NonNull ImageView imageView, @NonNull ComposeView composeView2, @NonNull FrameLayout frameLayout4, @NonNull TextView textView, @NonNull LinearLayout linearLayout, @NonNull TextView textView2, @NonNull FrameLayout frameLayout5, @NonNull ComposeView composeView3) {
        this.rootView = frameLayout;
        this.chatAvatarContainer = frameLayout2;
        this.chatFullBody = frameLayout3;
        this.chatSnippetComposeView = composeView;
        this.chatheadAvatar = imageView;
        this.chatheadAvatarComposeView = composeView2;
        this.chatheadRoot = frameLayout4;
        this.chatheadTextBody = textView;
        this.chatheadTextContainer = linearLayout;
        this.chatheadTextHeader = textView2;
        this.parentCard = frameLayout5;
        this.ticketHeaderComposeView = composeView3;
    }

    @NonNull
    public static IntercomPreviewChatSnippetOverlayBinding bind(@NonNull View view) {
        int i = C5101R.id.chat_avatar_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.m12059a(i, view);
        if (frameLayout != null) {
            i = C5101R.id.chat_full_body;
            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.m12059a(i, view);
            if (frameLayout2 != null) {
                i = C5101R.id.chat_snippet_compose_view;
                ComposeView composeView = (ComposeView) ViewBindings.m12059a(i, view);
                if (composeView != null) {
                    i = C5101R.id.chathead_avatar;
                    ImageView imageView = (ImageView) ViewBindings.m12059a(i, view);
                    if (imageView != null) {
                        i = C5101R.id.chathead_avatar_compose_view;
                        ComposeView composeView2 = (ComposeView) ViewBindings.m12059a(i, view);
                        if (composeView2 != null) {
                            FrameLayout frameLayout3 = (FrameLayout) view;
                            i = C5101R.id.chathead_text_body;
                            TextView textView = (TextView) ViewBindings.m12059a(i, view);
                            if (textView != null) {
                                i = C5101R.id.chathead_text_container;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.m12059a(i, view);
                                if (linearLayout != null) {
                                    i = C5101R.id.chathead_text_header;
                                    TextView textView2 = (TextView) ViewBindings.m12059a(i, view);
                                    if (textView2 != null) {
                                        i = C5101R.id.parent_card;
                                        FrameLayout frameLayout4 = (FrameLayout) ViewBindings.m12059a(i, view);
                                        if (frameLayout4 != null) {
                                            i = C5101R.id.ticket_header_compose_view;
                                            ComposeView composeView3 = (ComposeView) ViewBindings.m12059a(i, view);
                                            if (composeView3 != null) {
                                                return new IntercomPreviewChatSnippetOverlayBinding(frameLayout3, frameLayout, frameLayout2, composeView, imageView, composeView2, frameLayout3, textView, linearLayout, textView2, frameLayout4, composeView3);
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
    public static IntercomPreviewChatSnippetOverlayBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return m22080getRoot();
    }

    @NonNull
    public static IntercomPreviewChatSnippetOverlayBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(C5101R.layout.intercom_preview_chat_snippet_overlay, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    /* JADX INFO: renamed from: getRoot, reason: collision with other method in class */
    public FrameLayout m22080getRoot() {
        return this.rootView;
    }
}
