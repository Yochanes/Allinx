package androidx.camera.video;

import androidx.annotation.RequiresApi;
import com.google.auto.value.AutoValue;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class FallbackStrategy {

    /* JADX INFO: renamed from: a */
    public static final FallbackStrategy f3301a = new AutoValue_FallbackStrategy_RuleStrategy(Quality.f3308g, 0);

    /* JADX INFO: compiled from: Proguard */
    @AutoValue
    public static abstract class RuleStrategy extends FallbackStrategy {
        /* JADX INFO: renamed from: a */
        public abstract Quality mo1802a();

        /* JADX INFO: renamed from: b */
        public abstract int mo1803b();
    }
}
