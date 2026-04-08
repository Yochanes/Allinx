package androidx.media3.common;

import android.view.Surface;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface VideoFrameProcessor {

    /* JADX INFO: compiled from: Proguard */
    public interface Factory {
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InputType {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface Listener {
    }

    /* JADX INFO: renamed from: a */
    Surface m9393a();

    /* JADX INFO: renamed from: b */
    boolean m9394b();

    /* JADX INFO: renamed from: c */
    int m9395c();

    /* JADX INFO: renamed from: d */
    void m9396d();

    void flush();
}
