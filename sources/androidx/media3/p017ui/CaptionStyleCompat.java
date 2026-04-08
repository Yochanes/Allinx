package androidx.media3.p017ui;

import android.graphics.Typeface;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class CaptionStyleCompat {

    /* JADX INFO: renamed from: g */
    public static final CaptionStyleCompat f29815g = new CaptionStyleCompat(-1, -16777216, 0, 0, -1, null);

    /* JADX INFO: renamed from: a */
    public final int f29816a;

    /* JADX INFO: renamed from: b */
    public final int f29817b;

    /* JADX INFO: renamed from: c */
    public final int f29818c;

    /* JADX INFO: renamed from: d */
    public final int f29819d;

    /* JADX INFO: renamed from: e */
    public final int f29820e;

    /* JADX INFO: renamed from: f */
    public final Typeface f29821f;

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface EdgeType {
    }

    public CaptionStyleCompat(int i, int i2, int i3, int i4, int i5, Typeface typeface) {
        this.f29816a = i;
        this.f29817b = i2;
        this.f29818c = i3;
        this.f29819d = i4;
        this.f29820e = i5;
        this.f29821f = typeface;
    }
}
