package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import io.intercom.android.sdk.C5101R;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomDefaultLauncherBinding implements ViewBinding {

    @NonNull
    public final TextView launcherBadgeCount;

    @NonNull
    public final ImageButton launcherIcon;

    @NonNull
    public final FrameLayout launcherRoot;

    @NonNull
    private final FrameLayout rootView;

    private IntercomDefaultLauncherBinding(@NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull ImageButton imageButton, @NonNull FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.launcherBadgeCount = textView;
        this.launcherIcon = imageButton;
        this.launcherRoot = frameLayout2;
    }

    @NonNull
    public static IntercomDefaultLauncherBinding bind(@NonNull View view) {
        int i = C5101R.id.launcher_badge_count;
        TextView textView = (TextView) ViewBindings.m12059a(i, view);
        if (textView != null) {
            i = C5101R.id.launcher_icon;
            ImageButton imageButton = (ImageButton) ViewBindings.m12059a(i, view);
            if (imageButton != null) {
                FrameLayout frameLayout = (FrameLayout) view;
                return new IntercomDefaultLauncherBinding(frameLayout, textView, imageButton, frameLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static IntercomDefaultLauncherBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return m22070getRoot();
    }

    @NonNull
    public static IntercomDefaultLauncherBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(C5101R.layout.intercom_default_launcher, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    /* JADX INFO: renamed from: getRoot, reason: collision with other method in class */
    public FrameLayout m22070getRoot() {
        return this.rootView;
    }
}
