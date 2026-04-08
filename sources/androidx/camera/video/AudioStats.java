package androidx.camera.video;

import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import com.google.auto.value.AutoValue;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@AutoValue
@RequiresApi
public abstract class AudioStats {

    /* JADX INFO: renamed from: a */
    public static final Set f3273a = Collections.unmodifiableSet(new HashSet(Arrays.asList(2, 3, 4)));

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface AudioState {
    }

    /* JADX INFO: renamed from: a */
    public abstract double mo1799a();

    /* JADX INFO: renamed from: b */
    public abstract int mo1800b();

    /* JADX INFO: renamed from: c */
    public abstract Throwable mo1801c();
}
