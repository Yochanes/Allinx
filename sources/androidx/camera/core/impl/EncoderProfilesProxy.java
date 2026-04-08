package androidx.camera.core.impl;

import androidx.annotation.RequiresApi;
import com.google.auto.value.AutoValue;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public interface EncoderProfilesProxy {

    /* JADX INFO: compiled from: Proguard */
    @AutoValue
    public static abstract class AudioProfileProxy {

        /* JADX INFO: compiled from: Proguard */
        @Retention(RetentionPolicy.SOURCE)
        public @interface AudioEncoder {
        }

        /* JADX INFO: renamed from: a */
        public static AudioProfileProxy m1485a(int i, String str, int i2, int i3, int i4, int i5) {
            return new AutoValue_EncoderProfilesProxy_AudioProfileProxy(i, str, i2, i3, i4, i5);
        }

        /* JADX INFO: renamed from: b */
        public abstract int mo1387b();

        /* JADX INFO: renamed from: c */
        public abstract int mo1388c();

        /* JADX INFO: renamed from: d */
        public abstract int mo1389d();

        /* JADX INFO: renamed from: e */
        public abstract String mo1390e();

        /* JADX INFO: renamed from: f */
        public abstract int mo1391f();

        /* JADX INFO: renamed from: g */
        public abstract int mo1392g();
    }

    /* JADX INFO: compiled from: Proguard */
    @AutoValue
    public static abstract class ImmutableEncoderProfilesProxy implements EncoderProfilesProxy {
        /* JADX INFO: renamed from: e */
        public static ImmutableEncoderProfilesProxy m1486e(int i, int i2, ArrayList arrayList, List list) {
            return new AutoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy(i, i2, Collections.unmodifiableList(new ArrayList(list)), Collections.unmodifiableList(new ArrayList(arrayList)));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @AutoValue
    public static abstract class VideoProfileProxy {

        /* JADX INFO: compiled from: Proguard */
        @Retention(RetentionPolicy.SOURCE)
        public @interface VideoEncoder {
        }

        /* JADX INFO: renamed from: a */
        public static VideoProfileProxy m1487a(int i, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            return new AutoValue_EncoderProfilesProxy_VideoProfileProxy(i, str, i2, i3, i4, i5, i6, i7, i8, i9);
        }

        /* JADX INFO: renamed from: b */
        public abstract int mo1397b();

        /* JADX INFO: renamed from: c */
        public abstract int mo1398c();

        /* JADX INFO: renamed from: d */
        public abstract int mo1399d();

        /* JADX INFO: renamed from: e */
        public abstract int mo1400e();

        /* JADX INFO: renamed from: f */
        public abstract int mo1401f();

        /* JADX INFO: renamed from: g */
        public abstract int mo1402g();

        /* JADX INFO: renamed from: h */
        public abstract int mo1403h();

        /* JADX INFO: renamed from: i */
        public abstract String mo1404i();

        /* JADX INFO: renamed from: j */
        public abstract int mo1405j();

        /* JADX INFO: renamed from: k */
        public abstract int mo1406k();
    }

    /* JADX INFO: renamed from: a */
    int mo1393a();

    /* JADX INFO: renamed from: b */
    int mo1394b();

    /* JADX INFO: renamed from: c */
    List mo1395c();

    /* JADX INFO: renamed from: d */
    List mo1396d();
}
