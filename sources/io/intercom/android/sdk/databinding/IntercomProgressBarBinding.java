package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import io.intercom.android.sdk.C5101R;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomProgressBarBinding implements ViewBinding {

    @NonNull
    public final ProgressBar progressBar;

    @NonNull
    private final ProgressBar rootView;

    private IntercomProgressBarBinding(@NonNull ProgressBar progressBar, @NonNull ProgressBar progressBar2) {
        this.rootView = progressBar;
        this.progressBar = progressBar2;
    }

    @NonNull
    public static IntercomProgressBarBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ProgressBar progressBar = (ProgressBar) view;
        return new IntercomProgressBarBinding(progressBar, progressBar);
    }

    @NonNull
    public static IntercomProgressBarBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return m22082getRoot();
    }

    @NonNull
    public static IntercomProgressBarBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(C5101R.layout.intercom_progress_bar, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    /* JADX INFO: renamed from: getRoot, reason: collision with other method in class */
    public ProgressBar m22082getRoot() {
        return this.rootView;
    }
}
