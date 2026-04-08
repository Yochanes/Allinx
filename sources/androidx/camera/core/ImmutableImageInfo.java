package androidx.camera.core;

import android.graphics.Matrix;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.TagBundle;
import androidx.camera.core.impl.utils.ExifData;
import com.google.auto.value.AutoValue;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@AutoValue
@RequiresApi
@RestrictTo
public abstract class ImmutableImageInfo implements ImageInfo {
    /* JADX INFO: renamed from: e */
    public static ImageInfo m1279e(TagBundle tagBundle, long j, int i, Matrix matrix) {
        return new AutoValue_ImmutableImageInfo(tagBundle, j, i, matrix);
    }

    @Override // androidx.camera.core.ImageInfo
    /* JADX INFO: renamed from: b */
    public final void mo1269b(ExifData.Builder builder) {
        builder.m1603e(((AutoValue_ImmutableImageInfo) this).f2182c);
    }

    /* JADX INFO: renamed from: f */
    public abstract Matrix mo1198f();
}
