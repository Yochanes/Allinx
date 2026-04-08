package androidx.camera.core.resolutionselector;

import android.util.Size;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class ResolutionStrategy {

    /* JADX INFO: renamed from: c */
    public static final ResolutionStrategy f3184c;

    /* JADX INFO: renamed from: a */
    public Size f3185a;

    /* JADX INFO: renamed from: b */
    public int f3186b = 1;

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ResolutionFallbackRule {
    }

    static {
        ResolutionStrategy resolutionStrategy = new ResolutionStrategy();
        resolutionStrategy.f3185a = null;
        resolutionStrategy.f3186b = 0;
        f3184c = resolutionStrategy;
    }

    public ResolutionStrategy(Size size) {
        this.f3185a = size;
    }
}
