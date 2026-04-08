package androidx.camera.core.resolutionselector;

import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class AspectRatioStrategy {

    /* JADX INFO: renamed from: b */
    public static final AspectRatioStrategy f3175b = new AspectRatioStrategy(0);

    /* JADX INFO: renamed from: c */
    public static final AspectRatioStrategy f3176c = new AspectRatioStrategy(1);

    /* JADX INFO: renamed from: a */
    public final int f3177a;

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface AspectRatioFallbackRule {
    }

    public AspectRatioStrategy(int i) {
        this.f3177a = i;
    }
}
