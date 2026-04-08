package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import io.intercom.android.sdk.C5101R;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomWebviewCardInputBinding implements ViewBinding {

    @NonNull
    public final AutoCompleteTextView input;

    @NonNull
    private final FrameLayout rootView;

    private IntercomWebviewCardInputBinding(@NonNull FrameLayout frameLayout, @NonNull AutoCompleteTextView autoCompleteTextView) {
        this.rootView = frameLayout;
        this.input = autoCompleteTextView;
    }

    @NonNull
    public static IntercomWebviewCardInputBinding bind(@NonNull View view) {
        int i = C5101R.id.input;
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) ViewBindings.m12059a(i, view);
        if (autoCompleteTextView != null) {
            return new IntercomWebviewCardInputBinding((FrameLayout) view, autoCompleteTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static IntercomWebviewCardInputBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return m22085getRoot();
    }

    @NonNull
    public static IntercomWebviewCardInputBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(C5101R.layout.intercom_webview_card_input, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    /* JADX INFO: renamed from: getRoot, reason: collision with other method in class */
    public FrameLayout m22085getRoot() {
        return this.rootView;
    }
}
