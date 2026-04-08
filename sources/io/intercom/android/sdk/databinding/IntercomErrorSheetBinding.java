package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import io.intercom.android.sdk.C5101R;
import io.intercom.android.sdk.views.IntercomErrorView;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomErrorSheetBinding implements ViewBinding {

    @NonNull
    public final Button actionButton;

    @NonNull
    public final TextView emptyTextSubtitle;

    @NonNull
    public final TextView emptyTextTitle;

    @NonNull
    public final IntercomErrorView errorLayoutSheet;

    @NonNull
    private final IntercomErrorView rootView;

    private IntercomErrorSheetBinding(@NonNull IntercomErrorView intercomErrorView, @NonNull Button button, @NonNull TextView textView, @NonNull TextView textView2, @NonNull IntercomErrorView intercomErrorView2) {
        this.rootView = intercomErrorView;
        this.actionButton = button;
        this.emptyTextSubtitle = textView;
        this.emptyTextTitle = textView2;
        this.errorLayoutSheet = intercomErrorView2;
    }

    @NonNull
    public static IntercomErrorSheetBinding bind(@NonNull View view) {
        int i = C5101R.id.action_button;
        Button button = (Button) ViewBindings.m12059a(i, view);
        if (button != null) {
            i = C5101R.id.empty_text_subtitle;
            TextView textView = (TextView) ViewBindings.m12059a(i, view);
            if (textView != null) {
                i = C5101R.id.empty_text_title;
                TextView textView2 = (TextView) ViewBindings.m12059a(i, view);
                if (textView2 != null) {
                    IntercomErrorView intercomErrorView = (IntercomErrorView) view;
                    return new IntercomErrorSheetBinding(intercomErrorView, button, textView, textView2, intercomErrorView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static IntercomErrorSheetBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return m22071getRoot();
    }

    @NonNull
    public static IntercomErrorSheetBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(C5101R.layout.intercom_error_sheet, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    /* JADX INFO: renamed from: getRoot, reason: collision with other method in class */
    public IntercomErrorView m22071getRoot() {
        return this.rootView;
    }
}
