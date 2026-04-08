package androidx.camera.core;

import android.graphics.Rect;
import android.util.Size;
import androidx.annotation.RequiresApi;
import androidx.camera.core.AutoValue_ResolutionInfo_ResolutionInfoInternal;
import com.google.auto.value.AutoValue;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class ResolutionInfo {

    /* JADX INFO: renamed from: a */
    public final AutoValue_ResolutionInfo_ResolutionInfoInternal f2349a;

    /* JADX INFO: compiled from: Proguard */
    @AutoValue
    public static abstract class ResolutionInfoInternal {

        /* JADX INFO: compiled from: Proguard */
        @AutoValue.Builder
        public static abstract class Builder {
        }

        /* JADX INFO: renamed from: a */
        public abstract Rect mo1199a();

        /* JADX INFO: renamed from: b */
        public abstract Size mo1200b();

        /* JADX INFO: renamed from: c */
        public abstract int mo1201c();
    }

    public ResolutionInfo(Size size, Rect rect, int i) {
        AutoValue_ResolutionInfo_ResolutionInfoInternal.Builder builder = new AutoValue_ResolutionInfo_ResolutionInfoInternal.Builder();
        builder.f2187a = size;
        builder.f2188b = rect;
        builder.f2189c = Integer.valueOf(i);
        String strConcat = builder.f2187a == null ? " resolution" : "";
        strConcat = builder.f2188b == null ? strConcat.concat(" cropRect") : strConcat;
        strConcat = builder.f2189c == null ? AbstractC0000a.m2C(strConcat, " rotationDegrees") : strConcat;
        if (!strConcat.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(strConcat));
        }
        this.f2349a = new AutoValue_ResolutionInfo_ResolutionInfoInternal(builder.f2187a, builder.f2188b, builder.f2189c.intValue());
    }

    /* JADX INFO: renamed from: a */
    public final Size m1300a() {
        return this.f2349a.f2184a;
    }

    public final boolean equals(Object obj) {
        return this.f2349a.equals(obj);
    }

    public final int hashCode() {
        return this.f2349a.hashCode();
    }

    public final String toString() {
        return this.f2349a.toString();
    }
}
