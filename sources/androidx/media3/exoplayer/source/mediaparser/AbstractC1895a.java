package androidx.media3.exoplayer.source.mediaparser;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.graphics.Insets;
import android.graphics.Matrix;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Bundle;
import android.view.SurfaceControl;
import android.view.View;
import android.view.Window;
import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import androidx.media3.p017ui.DefaultTimeBar;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: androidx.media3.exoplayer.source.mediaparser.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1895a {
    /* JADX INFO: renamed from: A */
    public static /* bridge */ /* synthetic */ int m10591A(MediaFormat mediaFormat) {
        return mediaFormat.getInteger("rotation-degrees", 0);
    }

    /* JADX INFO: renamed from: B */
    public static /* bridge */ /* synthetic */ int m10592B(MediaFormat mediaFormat) {
        return mediaFormat.getInteger("sample-rate", -1);
    }

    /* JADX INFO: renamed from: C */
    public static /* bridge */ /* synthetic */ int m10593C(MediaFormat mediaFormat) {
        return mediaFormat.getInteger("encoder-delay", 0);
    }

    /* JADX INFO: renamed from: D */
    public static /* bridge */ /* synthetic */ int m10594D(MediaFormat mediaFormat) {
        return mediaFormat.getInteger("encoder-padding", 0);
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ float m10595a(MediaFormat mediaFormat) {
        return mediaFormat.getFloat("frame-rate", -1.0f);
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ float m10596b(View view) {
        return view.getTransitionAlpha();
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ int m10597c(MediaFormat mediaFormat) {
        return mediaFormat.getInteger("width", -1);
    }

    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ int m10598d(MediaFormat mediaFormat, String str) {
        return mediaFormat.getInteger(str, 0);
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ int m10599e(PropertyMapper propertyMapper, int i) {
        return propertyMapper.mapInt("iconPadding", i);
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ long m10600f(MediaFormat mediaFormat) {
        return mediaFormat.getLong("subsample-offset-us-long", Long.MAX_VALUE);
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ AssetFileDescriptor m10601g(ContentResolver contentResolver, Uri uri, Bundle bundle) {
        return contentResolver.openTypedAssetFile(uri, "image/*", bundle, null);
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ ColorStateList m10602h(ColorStateListDrawable colorStateListDrawable) {
        return colorStateListDrawable.getColorStateList();
    }

    /* JADX INFO: renamed from: i */
    public static /* bridge */ /* synthetic */ Insets m10603i(int i) {
        return Insets.of(0, 0, 0, i);
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ ColorStateListDrawable m10604j(Drawable drawable) {
        return (ColorStateListDrawable) drawable;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ SurfaceControl.Transaction m10605k() {
        return new SurfaceControl.Transaction();
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ View.AccessibilityDelegate m10606l(View view) {
        return view.getAccessibilityDelegate();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ InspectionCompanion.UninitializedPropertyMapException m10607m() {
        return new InspectionCompanion.UninitializedPropertyMapException();
    }

    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ void m10608n(float f, View view) {
        view.setTransitionAlpha(f);
    }

    /* JADX INFO: renamed from: o */
    public static /* bridge */ /* synthetic */ void m10609o(int i, View view) {
        view.setTransitionVisibility(i);
    }

    /* JADX INFO: renamed from: p */
    public static /* bridge */ /* synthetic */ void m10610p(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ void m10611q(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ void m10612r(DefaultTimeBar defaultTimeBar, List list) {
        defaultTimeBar.setSystemGestureExclusionRects(list);
    }

    /* JADX INFO: renamed from: s */
    public static /* bridge */ /* synthetic */ boolean m10613s(Context context, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        return context.bindService(intent, i, executor, serviceConnection);
    }

    /* JADX INFO: renamed from: t */
    public static /* bridge */ /* synthetic */ boolean m10614t(Drawable drawable) {
        return drawable instanceof ColorStateListDrawable;
    }

    /* JADX INFO: renamed from: u */
    public static /* bridge */ /* synthetic */ boolean m10615u(Window window) {
        return window.isNavigationBarContrastEnforced();
    }

    /* JADX INFO: renamed from: v */
    public static /* bridge */ /* synthetic */ float m10616v(MediaFormat mediaFormat) {
        return mediaFormat.getFloat("pixel-width-height-ratio-float", 1.0f);
    }

    /* JADX INFO: renamed from: w */
    public static /* bridge */ /* synthetic */ int m10617w(MediaFormat mediaFormat) {
        return mediaFormat.getInteger("height", -1);
    }

    /* JADX INFO: renamed from: x */
    public static /* bridge */ /* synthetic */ void m10618x(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    /* JADX INFO: renamed from: y */
    public static /* bridge */ /* synthetic */ int m10619y(MediaFormat mediaFormat) {
        return mediaFormat.getInteger("max-input-size", -1);
    }

    /* JADX INFO: renamed from: z */
    public static /* bridge */ /* synthetic */ int m10620z(MediaFormat mediaFormat) {
        return mediaFormat.getInteger("exo-pcm-encoding", -1);
    }
}
