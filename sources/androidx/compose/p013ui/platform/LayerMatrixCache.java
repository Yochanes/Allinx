package androidx.compose.p013ui.platform;

import android.graphics.Matrix;
import androidx.compose.p013ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.p013ui.graphics.MatrixKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/platform/LayerMatrixCache;", "T", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class LayerMatrixCache<T> {

    /* JADX INFO: renamed from: a */
    public final Lambda f19457a;

    /* JADX INFO: renamed from: b */
    public Matrix f19458b;

    /* JADX INFO: renamed from: e */
    public boolean f19461e;

    /* JADX INFO: renamed from: f */
    public boolean f19462f;

    /* JADX INFO: renamed from: c */
    public final float[] f19459c = androidx.compose.p013ui.graphics.Matrix.m5228a();

    /* JADX INFO: renamed from: d */
    public final float[] f19460d = androidx.compose.p013ui.graphics.Matrix.m5228a();

    /* JADX INFO: renamed from: g */
    public boolean f19463g = true;

    /* JADX INFO: renamed from: h */
    public boolean f19464h = true;

    /* JADX WARN: Multi-variable type inference failed */
    public LayerMatrixCache(Function2 function2) {
        this.f19457a = (Lambda) function2;
    }

    /* JADX INFO: renamed from: a */
    public final float[] m6153a(Object obj) {
        boolean z2 = this.f19462f;
        float[] fArr = this.f19460d;
        if (z2) {
            this.f19463g = InvertMatrixKt.m6151a(m6154b(obj), fArr);
            this.f19462f = false;
        }
        if (this.f19463g) {
            return fArr;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.Lambda] */
    /* JADX INFO: renamed from: b */
    public final float[] m6154b(Object obj) {
        boolean z2 = this.f19461e;
        float[] fArr = this.f19459c;
        if (!z2) {
            return fArr;
        }
        Matrix matrix = this.f19458b;
        if (matrix == null) {
            matrix = new Matrix();
            this.f19458b = matrix;
        }
        this.f19457a.invoke(obj, matrix);
        AndroidMatrixConversions_androidKt.m5119b(matrix, fArr);
        this.f19461e = false;
        this.f19464h = MatrixKt.m5234a(fArr);
        return fArr;
    }

    /* JADX INFO: renamed from: c */
    public final void m6155c() {
        this.f19461e = true;
        this.f19462f = true;
    }
}
