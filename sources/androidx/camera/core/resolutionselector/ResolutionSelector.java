package androidx.camera.core.resolutionselector;

import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class ResolutionSelector {

    /* JADX INFO: renamed from: a */
    public final AspectRatioStrategy f3178a;

    /* JADX INFO: renamed from: b */
    public final ResolutionStrategy f3179b;

    /* JADX INFO: renamed from: c */
    public final ResolutionFilter f3180c;

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface AllowedResolutionMode {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder {

        /* JADX INFO: renamed from: a */
        public AspectRatioStrategy f3181a = AspectRatioStrategy.f3175b;

        /* JADX INFO: renamed from: b */
        public ResolutionStrategy f3182b = null;

        /* JADX INFO: renamed from: c */
        public ResolutionFilter f3183c = null;

        /* JADX INFO: renamed from: a */
        public final ResolutionSelector m1733a() {
            return new ResolutionSelector(this.f3181a, this.f3182b, this.f3183c);
        }
    }

    public ResolutionSelector(AspectRatioStrategy aspectRatioStrategy, ResolutionStrategy resolutionStrategy, ResolutionFilter resolutionFilter) {
        this.f3178a = aspectRatioStrategy;
        this.f3179b = resolutionStrategy;
        this.f3180c = resolutionFilter;
    }
}
