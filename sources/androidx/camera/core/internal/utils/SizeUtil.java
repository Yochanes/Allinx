package androidx.camera.core.internal.utils;

import android.util.Size;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class SizeUtil {

    /* JADX INFO: renamed from: a */
    public static final Size f3012a = new Size(0, 0);

    /* JADX INFO: renamed from: b */
    public static final Size f3013b = new Size(320, 240);

    /* JADX INFO: renamed from: c */
    public static final Size f3014c = new Size(640, 480);

    /* JADX INFO: renamed from: d */
    public static final Size f3015d = new Size(720, 480);

    /* JADX INFO: renamed from: e */
    public static final Size f3016e = new Size(1280, 720);

    /* JADX INFO: renamed from: f */
    public static final Size f3017f = new Size(1920, 1080);

    /* JADX INFO: renamed from: g */
    public static final Size f3018g = new Size(1920, 1440);

    /* JADX INFO: renamed from: a */
    public static int m1663a(Size size) {
        return size.getHeight() * size.getWidth();
    }
}
