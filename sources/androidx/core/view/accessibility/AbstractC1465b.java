package androidx.core.view.accessibility;

import android.app.job.JobInfo;
import android.content.ContentResolver;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.PrecomputedText;
import android.util.Size;
import android.view.accessibility.AccessibilityNodeInfo;
import coil.util.C2382a;
import coil.util.GifUtils$animatable2CallbackOf$1;
import java.io.File;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: androidx.core.view.accessibility.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1465b {
    /* JADX INFO: renamed from: A */
    public static /* bridge */ /* synthetic */ boolean m8049A(CharSequence charSequence) {
        return charSequence instanceof PrecomputedText;
    }

    /* JADX INFO: renamed from: B */
    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction m8050B() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
    }

    /* JADX INFO: renamed from: C */
    public static /* bridge */ /* synthetic */ void m8051C(ImageDecoder imageDecoder, int i) {
        imageDecoder.setMemorySizePolicy(i);
    }

    /* JADX INFO: renamed from: D */
    public static /* bridge */ /* synthetic */ boolean m8052D(NetworkRequest networkRequest, int i) {
        return networkRequest.hasCapability(i);
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ int m8053a(MediaDrm mediaDrm, byte[] bArr) {
        return mediaDrm.getSecurityLevel(bArr);
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ ImageDecoder.Source m8054b(ContentResolver contentResolver, Uri uri) {
        return ImageDecoder.createSource(contentResolver, uri);
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ ImageDecoder.Source m8055c(AssetManager assetManager, String str) {
        return ImageDecoder.createSource(assetManager, str);
    }

    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ ImageDecoder.Source m8056d(Resources resources, int i) {
        return ImageDecoder.createSource(resources, i);
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ ImageDecoder.Source m8057e(File file) {
        return ImageDecoder.createSource(file);
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ ImageDecoder.Source m8058f(ByteBuffer byteBuffer) {
        return ImageDecoder.createSource(byteBuffer);
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ ImageDecoder m8059g(Object obj) {
        return (ImageDecoder) obj;
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ AnimatedImageDrawable m8060h(Drawable drawable) {
        return (AnimatedImageDrawable) drawable;
    }

    /* JADX INFO: renamed from: i */
    public static /* bridge */ /* synthetic */ AnimatedImageDrawable m8061i(Object obj) {
        return (AnimatedImageDrawable) obj;
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ Drawable m8062j(ImageDecoder.Source source, ImageDecoder$OnHeaderDecodedListener imageDecoder$OnHeaderDecodedListener) {
        return ImageDecoder.decodeDrawable(source, imageDecoder$OnHeaderDecodedListener);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ MediaMetadataRetriever.BitmapParams m8063k() {
        return new MediaMetadataRetriever.BitmapParams();
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ Handler m8064l(Looper looper) {
        return Handler.createAsync(looper);
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ Size m8065m(ImageDecoder.ImageInfo imageInfo) {
        return imageInfo.getSize();
    }

    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction m8066n() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
    }

    /* JADX INFO: renamed from: o */
    public static /* bridge */ /* synthetic */ void m8067o(JobInfo.Builder builder) {
        builder.setImportantWhileForeground(true);
    }

    /* JADX INFO: renamed from: p */
    public static /* bridge */ /* synthetic */ void m8068p(JobInfo.Builder builder, NetworkRequest networkRequest) {
        builder.setRequiredNetwork(networkRequest);
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ void m8069q(ImageDecoder imageDecoder) {
        imageDecoder.close();
    }

    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ void m8070r(ImageDecoder imageDecoder, int i) {
        imageDecoder.setAllocator(i);
    }

    /* JADX INFO: renamed from: s */
    public static /* bridge */ /* synthetic */ void m8071s(ImageDecoder imageDecoder, int i, int i2) {
        imageDecoder.setTargetSize(i, i2);
    }

    /* JADX INFO: renamed from: t */
    public static /* bridge */ /* synthetic */ void m8072t(ImageDecoder imageDecoder, ColorSpace colorSpace) {
        imageDecoder.setTargetColorSpace(colorSpace);
    }

    /* JADX INFO: renamed from: u */
    public static /* bridge */ /* synthetic */ void m8073u(ImageDecoder imageDecoder, C2382a c2382a) {
        imageDecoder.setPostProcessor(c2382a);
    }

    /* JADX INFO: renamed from: v */
    public static /* bridge */ /* synthetic */ void m8074v(ImageDecoder imageDecoder, boolean z2) {
        imageDecoder.setUnpremultipliedRequired(z2);
    }

    /* JADX INFO: renamed from: w */
    public static /* bridge */ /* synthetic */ void m8075w(AnimatedImageDrawable animatedImageDrawable, int i) {
        animatedImageDrawable.setRepeatCount(i);
    }

    /* JADX INFO: renamed from: x */
    public static /* bridge */ /* synthetic */ void m8076x(AnimatedImageDrawable animatedImageDrawable, GifUtils$animatable2CallbackOf$1 gifUtils$animatable2CallbackOf$1) {
        animatedImageDrawable.registerAnimationCallback(gifUtils$animatable2CallbackOf$1);
    }

    /* JADX INFO: renamed from: y */
    public static /* bridge */ /* synthetic */ boolean m8077y(Drawable drawable) {
        return drawable instanceof AnimatedImageDrawable;
    }

    /* JADX INFO: renamed from: z */
    public static /* bridge */ /* synthetic */ boolean m8078z(NetworkRequest networkRequest, int i) {
        return networkRequest.hasTransport(i);
    }
}
