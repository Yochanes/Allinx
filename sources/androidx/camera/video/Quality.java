package androidx.camera.video;

import androidx.annotation.RequiresApi;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class Quality {

    /* JADX INFO: renamed from: a */
    public static final Quality f3302a;

    /* JADX INFO: renamed from: b */
    public static final Quality f3303b;

    /* JADX INFO: renamed from: c */
    public static final Quality f3304c;

    /* JADX INFO: renamed from: d */
    public static final Quality f3305d;

    /* JADX INFO: renamed from: e */
    public static final Quality f3306e;

    /* JADX INFO: renamed from: f */
    public static final Quality f3307f;

    /* JADX INFO: renamed from: g */
    public static final Quality f3308g;

    /* JADX INFO: renamed from: h */
    public static final HashSet f3309h;

    /* JADX INFO: renamed from: i */
    public static final List f3310i;

    /* JADX INFO: compiled from: Proguard */
    @AutoValue
    public static abstract class ConstantQuality extends Quality {
        /* JADX INFO: renamed from: a */
        public abstract String mo1809a();

        /* JADX INFO: renamed from: b */
        public abstract int mo1810b();
    }

    static {
        AutoValue_Quality_ConstantQuality autoValue_Quality_ConstantQuality = new AutoValue_Quality_ConstantQuality(4, "SD");
        f3302a = autoValue_Quality_ConstantQuality;
        AutoValue_Quality_ConstantQuality autoValue_Quality_ConstantQuality2 = new AutoValue_Quality_ConstantQuality(5, "HD");
        f3303b = autoValue_Quality_ConstantQuality2;
        AutoValue_Quality_ConstantQuality autoValue_Quality_ConstantQuality3 = new AutoValue_Quality_ConstantQuality(6, "FHD");
        f3304c = autoValue_Quality_ConstantQuality3;
        AutoValue_Quality_ConstantQuality autoValue_Quality_ConstantQuality4 = new AutoValue_Quality_ConstantQuality(8, "UHD");
        f3305d = autoValue_Quality_ConstantQuality4;
        AutoValue_Quality_ConstantQuality autoValue_Quality_ConstantQuality5 = new AutoValue_Quality_ConstantQuality(0, "LOWEST");
        f3306e = autoValue_Quality_ConstantQuality5;
        AutoValue_Quality_ConstantQuality autoValue_Quality_ConstantQuality6 = new AutoValue_Quality_ConstantQuality(1, "HIGHEST");
        f3307f = autoValue_Quality_ConstantQuality6;
        f3308g = new AutoValue_Quality_ConstantQuality(-1, "NONE");
        f3309h = new HashSet(Arrays.asList(autoValue_Quality_ConstantQuality5, autoValue_Quality_ConstantQuality6, autoValue_Quality_ConstantQuality, autoValue_Quality_ConstantQuality2, autoValue_Quality_ConstantQuality3, autoValue_Quality_ConstantQuality4));
        f3310i = Arrays.asList(autoValue_Quality_ConstantQuality4, autoValue_Quality_ConstantQuality3, autoValue_Quality_ConstantQuality2, autoValue_Quality_ConstantQuality);
    }
}
