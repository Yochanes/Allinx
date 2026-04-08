package androidx.camera.core.impl;

import android.util.Size;
import androidx.annotation.RequiresApi;
import com.google.auto.value.AutoValue;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@AutoValue
@RequiresApi
public abstract class SurfaceSizeDefinition {
    /* JADX INFO: renamed from: a */
    public static SurfaceSizeDefinition m1555a(Size size, Map map, Size size2, Map map2, Size size3, Map map3, Map map4) {
        return new AutoValue_SurfaceSizeDefinition(size, map, size2, map2, size3, map3, map4);
    }

    /* JADX INFO: renamed from: b */
    public abstract Size mo1430b();

    /* JADX INFO: renamed from: c */
    public abstract Map mo1431c();

    /* JADX INFO: renamed from: d */
    public abstract Size mo1432d();

    /* JADX INFO: renamed from: e */
    public abstract Size mo1433e();

    /* JADX INFO: renamed from: f */
    public abstract Map mo1434f();

    /* JADX INFO: renamed from: g */
    public abstract Map mo1435g();

    /* JADX INFO: renamed from: h */
    public abstract Map mo1436h();
}
