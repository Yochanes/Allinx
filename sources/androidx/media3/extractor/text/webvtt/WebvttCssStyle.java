package androidx.media3.extractor.text.webvtt;

import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Set;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class WebvttCssStyle {

    /* JADX INFO: renamed from: a */
    public String f29321a;

    /* JADX INFO: renamed from: b */
    public String f29322b;

    /* JADX INFO: renamed from: c */
    public Set f29323c;

    /* JADX INFO: renamed from: d */
    public String f29324d;

    /* JADX INFO: renamed from: e */
    public String f29325e;

    /* JADX INFO: renamed from: f */
    public int f29326f;

    /* JADX INFO: renamed from: g */
    public boolean f29327g;

    /* JADX INFO: renamed from: h */
    public int f29328h;

    /* JADX INFO: renamed from: i */
    public boolean f29329i;

    /* JADX INFO: renamed from: j */
    public int f29330j;

    /* JADX INFO: renamed from: k */
    public int f29331k;

    /* JADX INFO: renamed from: l */
    public int f29332l;

    /* JADX INFO: renamed from: m */
    public int f29333m;

    /* JADX INFO: renamed from: n */
    public int f29334n;

    /* JADX INFO: renamed from: o */
    public float f29335o;

    /* JADX INFO: renamed from: p */
    public int f29336p;

    /* JADX INFO: renamed from: q */
    public boolean f29337q;

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface FontSizeUnit {
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface StyleFlags {
    }

    /* JADX INFO: renamed from: a */
    public static int m11030a(int i, int i2, String str, String str2) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i2;
        }
        return -1;
    }
}
