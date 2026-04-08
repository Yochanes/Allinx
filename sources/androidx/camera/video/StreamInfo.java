package androidx.camera.video;

import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.ConstantObservable;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@AutoValue
@RequiresApi
@RestrictTo
public abstract class StreamInfo {

    /* JADX INFO: renamed from: a */
    public static final StreamInfo f3337a = new AutoValue_StreamInfo(StreamState.f3341b);

    /* JADX INFO: renamed from: b */
    public static final Set f3338b = Collections.unmodifiableSet(new HashSet(Arrays.asList(0, -1)));

    /* JADX INFO: renamed from: c */
    public static final ConstantObservable f3339c = new ConstantObservable(new AutoValue_StreamInfo(StreamState.f3340a));

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    @RestrictTo
    public static final class StreamState {

        /* JADX INFO: renamed from: a */
        public static final StreamState f3340a;

        /* JADX INFO: renamed from: b */
        public static final StreamState f3341b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ StreamState[] f3342c;

        static {
            StreamState streamState = new StreamState("ACTIVE", 0);
            f3340a = streamState;
            StreamState streamState2 = new StreamState("INACTIVE", 1);
            f3341b = streamState2;
            f3342c = new StreamState[]{streamState, streamState2};
        }

        public static StreamState valueOf(String str) {
            return (StreamState) Enum.valueOf(StreamState.class, str);
        }

        public static StreamState[] values() {
            return (StreamState[]) f3342c.clone();
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo1814a();

    /* JADX INFO: renamed from: b */
    public abstract SurfaceRequest.TransformationInfo mo1815b();

    /* JADX INFO: renamed from: c */
    public abstract StreamState mo1816c();
}
