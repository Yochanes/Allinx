package androidx.camera.video;

import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import com.google.auto.value.AutoValue;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@AutoValue
@RequiresApi
@RestrictTo
public abstract class MediaSpec {

    /* JADX INFO: compiled from: Proguard */
    @AutoValue.Builder
    @RestrictTo
    public static abstract class Builder {
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface OutputFormat {
    }

    /* JADX INFO: renamed from: a */
    public abstract AudioSpec mo1804a();

    /* JADX INFO: renamed from: b */
    public abstract int mo1805b();

    /* JADX INFO: renamed from: c */
    public abstract VideoSpec mo1806c();
}
