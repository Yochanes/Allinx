package androidx.media3.common.text;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class TextEmphasisSpan implements LanguageFeatureSpan {

    /* JADX INFO: renamed from: d */
    public static final String f25564d;

    /* JADX INFO: renamed from: e */
    public static final String f25565e;

    /* JADX INFO: renamed from: f */
    public static final String f25566f;

    /* JADX INFO: renamed from: a */
    public final int f25567a;

    /* JADX INFO: renamed from: b */
    public final int f25568b;

    /* JADX INFO: renamed from: c */
    public final int f25569c;

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface MarkFill {
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface MarkShape {
    }

    static {
        int i = Util.f25665a;
        f25564d = Integer.toString(0, 36);
        f25565e = Integer.toString(1, 36);
        f25566f = Integer.toString(2, 36);
    }

    public TextEmphasisSpan(int i, int i2, int i3) {
        this.f25567a = i;
        this.f25568b = i2;
        this.f25569c = i3;
    }
}
