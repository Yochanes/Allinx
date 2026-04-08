package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.p013ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import io.intercom.android.sdk.C5101R;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomPreviewNotificationBinding implements ViewBinding {

    @NonNull
    public final ComposeView chatSnippetComposeView;

    @NonNull
    public final TextView inAppNotificationMessageSummary;

    @NonNull
    public final FrameLayout notificationRoot;

    @NonNull
    public final FrameLayout parentCard;

    @NonNull
    public final ImageView previewAvatar;

    @NonNull
    public final ComposeView previewAvatarComposeView;

    @NonNull
    public final TextView replyFromTextview;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final ComposeView ticketHeaderComposeView;

    private IntercomPreviewNotificationBinding(@NonNull FrameLayout frameLayout, @NonNull ComposeView composeView, @NonNull TextView textView, @NonNull FrameLayout frameLayout2, @NonNull FrameLayout frameLayout3, @NonNull ImageView imageView, @NonNull ComposeView composeView2, @NonNull TextView textView2, @NonNull ComposeView composeView3) {
        this.rootView = frameLayout;
        this.chatSnippetComposeView = composeView;
        this.inAppNotificationMessageSummary = textView;
        this.notificationRoot = frameLayout2;
        this.parentCard = frameLayout3;
        this.previewAvatar = imageView;
        this.previewAvatarComposeView = composeView2;
        this.replyFromTextview = textView2;
        this.ticketHeaderComposeView = composeView3;
    }

    @NonNull
    public static IntercomPreviewNotificationBinding bind(@NonNull View view) {
        int i = C5101R.id.chat_snippet_compose_view;
        ComposeView composeView = (ComposeView) ViewBindings.m12059a(i, view);
        if (composeView != null) {
            i = C5101R.id.in_app_notification_message_summary;
            TextView textView = (TextView) ViewBindings.m12059a(i, view);
            if (textView != null) {
                FrameLayout frameLayout = (FrameLayout) view;
                i = C5101R.id.parent_card;
                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.m12059a(i, view);
                if (frameLayout2 != null) {
                    i = C5101R.id.preview_avatar;
                    ImageView imageView = (ImageView) ViewBindings.m12059a(i, view);
                    if (imageView != null) {
                        i = C5101R.id.preview_avatar_compose_view;
                        ComposeView composeView2 = (ComposeView) ViewBindings.m12059a(i, view);
                        if (composeView2 != null) {
                            i = C5101R.id.reply_from_textview;
                            TextView textView2 = (TextView) ViewBindings.m12059a(i, view);
                            if (textView2 != null) {
                                i = C5101R.id.ticket_header_compose_view;
                                ComposeView composeView3 = (ComposeView) ViewBindings.m12059a(i, view);
                                if (composeView3 != null) {
                                    return new IntercomPreviewNotificationBinding(frameLayout, composeView, textView, frameLayout, frameLayout2, imageView, composeView2, textView2, composeView3);
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
    public static IntercomPreviewNotificationBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return m22081getRoot();
    }

    @NonNull
    public static IntercomPreviewNotificationBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(C5101R.layout.intercom_preview_notification, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    /* JADX INFO: renamed from: getRoot, reason: collision with other method in class */
    public FrameLayout m22081getRoot() {
        return this.rootView;
    }
}
