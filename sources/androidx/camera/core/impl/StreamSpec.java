package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.annotation.RequiresApi;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.AutoValue_StreamSpec;
import com.google.auto.value.AutoValue;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@AutoValue
@RequiresApi
public abstract class StreamSpec {

    /* JADX INFO: renamed from: a */
    public static final Range f2781a = new Range(0, 0);

    /* JADX INFO: compiled from: Proguard */
    @AutoValue.Builder
    public static abstract class Builder {
        /* JADX INFO: renamed from: a */
        public abstract StreamSpec mo1422a();

        /* JADX INFO: renamed from: b */
        public abstract Builder mo1423b(DynamicRange dynamicRange);

        /* JADX INFO: renamed from: c */
        public abstract Builder mo1424c(Range range);

        /* JADX INFO: renamed from: d */
        public abstract Builder mo1425d(Config config);

        /* JADX INFO: renamed from: e */
        public abstract Builder mo1426e(Size size);
    }

    /* JADX INFO: renamed from: a */
    public static Builder m1548a(Size size) {
        AutoValue_StreamSpec.Builder builder = new AutoValue_StreamSpec.Builder();
        builder.mo1426e(size);
        builder.mo1424c(f2781a);
        builder.f2588b = DynamicRange.f2247d;
        return builder;
    }

    /* JADX INFO: renamed from: b */
    public abstract DynamicRange mo1417b();

    /* JADX INFO: renamed from: c */
    public abstract Range mo1418c();

    /* JADX INFO: renamed from: d */
    public abstract Config mo1419d();

    /* JADX INFO: renamed from: e */
    public abstract Size mo1420e();

    /* JADX INFO: renamed from: f */
    public abstract Builder mo1421f();
}
