package androidx.media3.common;

import android.view.View;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class AdOverlayInfo {

    /* JADX INFO: renamed from: a */
    public final View f25083a;

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder {
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Purpose {
    }

    public AdOverlayInfo(View view) {
        this.f25083a = view;
    }
}
