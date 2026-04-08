package com.airbnb.lottie.utils;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.pm.PackageManager;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.navigation.NavigationBarItemView;
import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclEntryPermission;
import java.nio.file.attribute.AclEntryType;
import java.nio.file.attribute.UserPrincipal;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.time.Duration;

/* JADX INFO: renamed from: com.airbnb.lottie.utils.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2433a {
    /* JADX INFO: renamed from: A */
    public static /* bridge */ /* synthetic */ boolean m12754A(Duration duration) {
        return duration.isNegative();
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ NotificationChannel m12755B(String str) {
        return new NotificationChannel("com.google.android.gms.availability", str, 4);
    }

    /* JADX INFO: renamed from: C */
    public static /* bridge */ /* synthetic */ boolean m12756C(PackageManager packageManager) {
        return packageManager.isInstantApp();
    }

    /* JADX INFO: renamed from: D */
    public static /* bridge */ /* synthetic */ boolean m12757D(Duration duration) {
        return duration.isZero();
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ long m12758a(Duration duration) {
        return duration.toNanos();
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ NotificationChannel m12759b(NotificationManager notificationManager) {
        return notificationManager.getNotificationChannel("com.google.android.gms.availability");
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ NotificationChannel m12760c(String str) {
        return new NotificationChannel("download_channel_normal", str, 2);
    }

    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ CharSequence m12761d(NotificationChannel notificationChannel) {
        return notificationChannel.getName();
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ Class m12762e() {
        return AclEntryPermission.class;
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ Path m12763f(String str, String[] strArr) {
        return Paths.get(str, strArr);
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ AclEntry.Builder m12764g() {
        return AclEntry.newBuilder();
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ AclEntry.Builder m12765h(AclEntry.Builder builder) {
        return builder.setType(AclEntryType.ALLOW);
    }

    /* JADX INFO: renamed from: i */
    public static /* bridge */ /* synthetic */ AclEntry.Builder m12766i(AclEntry.Builder builder, UserPrincipal userPrincipal) {
        return builder.setPrincipal(userPrincipal);
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ AclEntry m12767j(AclEntry.Builder builder) {
        return builder.build();
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ AclEntryType m12768k() {
        return AclEntryType.ALLOW;
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ UserPrincipal m12769l(UserPrincipalLookupService userPrincipalLookupService, String str) {
        return userPrincipalLookupService.lookupPrincipalByName(str);
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ UserPrincipalLookupService m12770m(FileSystem fileSystem) {
        return fileSystem.getUserPrincipalLookupService();
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m12771n() {
    }

    /* JADX INFO: renamed from: o */
    public static /* bridge */ /* synthetic */ void m12772o(Animator.AnimatorListener animatorListener, Animator animator, boolean z2) {
        animatorListener.onAnimationStart(animator, z2);
    }

    /* JADX INFO: renamed from: p */
    public static /* bridge */ /* synthetic */ void m12773p(Animator.AnimatorListener animatorListener, BaseLottieAnimator baseLottieAnimator, boolean z2) {
        animatorListener.onAnimationEnd(baseLottieAnimator, z2);
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ void m12774q(AnimatorSet animatorSet) {
        animatorSet.reverse();
    }

    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ void m12775r(NotificationChannel notificationChannel, String str) {
        notificationChannel.setName(str);
    }

    /* JADX INFO: renamed from: s */
    public static /* bridge */ /* synthetic */ void m12776s(NotificationManager notificationManager, NotificationChannel notificationChannel) {
        notificationManager.createNotificationChannel(notificationChannel);
    }

    /* JADX INFO: renamed from: t */
    public static /* bridge */ /* synthetic */ void m12777t(Canvas canvas, RectF rectF) {
        canvas.clipOutRect(rectF);
    }

    /* JADX INFO: renamed from: u */
    public static /* bridge */ /* synthetic */ void m12778u(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setHintText(charSequence);
    }

    /* JADX INFO: renamed from: v */
    public static /* bridge */ /* synthetic */ void m12779v(AutofillManager autofillManager, MaterialCheckBox materialCheckBox) {
        autofillManager.notifyValueChanged(materialCheckBox);
    }

    /* JADX INFO: renamed from: w */
    public static /* bridge */ /* synthetic */ void m12780w(AppBarLayout appBarLayout, boolean z2) {
        appBarLayout.setKeyboardNavigationCluster(z2);
    }

    /* JADX INFO: renamed from: x */
    public static /* bridge */ /* synthetic */ void m12781x(NavigationBarItemView navigationBarItemView, boolean z2) {
        navigationBarItemView.setDefaultFocusHighlightEnabled(z2);
    }

    /* JADX INFO: renamed from: y */
    public static /* bridge */ /* synthetic */ boolean m12782y(PackageManager packageManager) {
        return packageManager.canRequestPackageInstalls();
    }

    /* JADX INFO: renamed from: z */
    public static /* bridge */ /* synthetic */ boolean m12783z(PackageManager packageManager, String str) {
        return packageManager.isInstantApp(str);
    }
}
