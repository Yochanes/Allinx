package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.AutoValue_StreamSpec;
import androidx.camera.core.impl.StreamSpec;
import com.google.auto.value.AutoValue;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@AutoValue
@RequiresApi
public abstract class AttachedSurfaceInfo {
    /* JADX INFO: renamed from: a */
    public static AttachedSurfaceInfo m1373a(SurfaceConfig surfaceConfig, int i, Size size, DynamicRange dynamicRange, ArrayList arrayList, Config config, Range range) {
        return new AutoValue_AttachedSurfaceInfo(surfaceConfig, i, size, dynamicRange, arrayList, config, range);
    }

    /* JADX INFO: renamed from: b */
    public abstract List mo1374b();

    /* JADX INFO: renamed from: c */
    public abstract DynamicRange mo1375c();

    /* JADX INFO: renamed from: d */
    public abstract int mo1376d();

    /* JADX INFO: renamed from: e */
    public abstract Config mo1377e();

    /* JADX INFO: renamed from: f */
    public abstract Size mo1378f();

    /* JADX INFO: renamed from: g */
    public abstract SurfaceConfig mo1379g();

    /* JADX INFO: renamed from: h */
    public abstract Range mo1380h();

    /* JADX INFO: renamed from: i */
    public final StreamSpec m1381i(Camera2ImplConfig camera2ImplConfig) {
        StreamSpec.Builder builderM1548a = StreamSpec.m1548a(mo1378f());
        builderM1548a.mo1423b(mo1375c());
        ((AutoValue_StreamSpec.Builder) builderM1548a).f2590d = camera2ImplConfig;
        if (mo1380h() != null) {
            builderM1548a.mo1424c(mo1380h());
        }
        return builderM1548a.mo1422a();
    }
}
