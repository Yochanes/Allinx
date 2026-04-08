package com.google.android.material.navigation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.ColorUtils;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.C3898a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@RestrictTo
public class DrawerLayoutUtils {
    private static final int DEFAULT_SCRIM_COLOR = -1728053248;
    private static final int DEFAULT_SCRIM_ALPHA = Color.alpha(DEFAULT_SCRIM_COLOR);

    /* JADX INFO: renamed from: com.google.android.material.navigation.DrawerLayoutUtils$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C38991 extends AnimatorListenerAdapter {
        final /* synthetic */ DrawerLayout val$drawerLayout;
        final /* synthetic */ View val$drawerView;

        public C38991(DrawerLayout drawerLayout, View view) {
            this.val$drawerLayout = drawerLayout;
            this.val$drawerView = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.val$drawerLayout.m8754b(this.val$drawerView, false);
            this.val$drawerLayout.setScrimColor(DrawerLayoutUtils.DEFAULT_SCRIM_COLOR);
        }
    }

    private DrawerLayoutUtils() {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m14692a(DrawerLayout drawerLayout, ValueAnimator valueAnimator) {
        lambda$getScrimCloseAnimatorUpdateListener$0(drawerLayout, valueAnimator);
    }

    @NonNull
    public static Animator.AnimatorListener getScrimCloseAnimatorListener(@NonNull DrawerLayout drawerLayout, @NonNull View view) {
        return new C38991(drawerLayout, view);
    }

    @NonNull
    public static ValueAnimator.AnimatorUpdateListener getScrimCloseAnimatorUpdateListener(@NonNull DrawerLayout drawerLayout) {
        return new C3898a(drawerLayout, 1);
    }

    private static /* synthetic */ void lambda$getScrimCloseAnimatorUpdateListener$0(DrawerLayout drawerLayout, ValueAnimator valueAnimator) {
        drawerLayout.setScrimColor(ColorUtils.m7560i(DEFAULT_SCRIM_COLOR, AnimationUtils.lerp(DEFAULT_SCRIM_ALPHA, 0, valueAnimator.getAnimatedFraction())));
    }
}
