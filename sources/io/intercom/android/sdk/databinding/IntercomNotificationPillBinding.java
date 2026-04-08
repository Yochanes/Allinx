package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import io.intercom.android.sdk.C5101R;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomNotificationPillBinding implements ViewBinding {

    @NonNull
    public final TextView notificationPill;

    @NonNull
    private final TextView rootView;

    private IntercomNotificationPillBinding(@NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = textView;
        this.notificationPill = textView2;
    }

    @NonNull
    public static IntercomNotificationPillBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) view;
        return new IntercomNotificationPillBinding(textView, textView);
    }

    @NonNull
    public static IntercomNotificationPillBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return m22077getRoot();
    }

    @NonNull
    public static IntercomNotificationPillBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(C5101R.layout.intercom_notification_pill, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    /* JADX INFO: renamed from: getRoot, reason: collision with other method in class */
    public TextView m22077getRoot() {
        return this.rootView;
    }
}
