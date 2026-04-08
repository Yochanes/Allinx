package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import io.intercom.android.sdk.C5101R;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomFakeComposerBinding implements ViewBinding {

    @NonNull
    public final EditText composerInputView;

    @NonNull
    private final EditText rootView;

    private IntercomFakeComposerBinding(@NonNull EditText editText, @NonNull EditText editText2) {
        this.rootView = editText;
        this.composerInputView = editText2;
    }

    @NonNull
    public static IntercomFakeComposerBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        EditText editText = (EditText) view;
        return new IntercomFakeComposerBinding(editText, editText);
    }

    @NonNull
    public static IntercomFakeComposerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return m22072getRoot();
    }

    @NonNull
    public static IntercomFakeComposerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(C5101R.layout.intercom_fake_composer, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    /* JADX INFO: renamed from: getRoot, reason: collision with other method in class */
    public EditText m22072getRoot() {
        return this.rootView;
    }
}
