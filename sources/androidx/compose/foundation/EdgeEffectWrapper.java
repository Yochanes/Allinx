package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p013ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/EdgeEffectWrapper;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class EdgeEffectWrapper {

    /* JADX INFO: renamed from: a */
    public final Context f4966a;

    /* JADX INFO: renamed from: b */
    public final int f4967b;

    /* JADX INFO: renamed from: c */
    public long f4968c = 0;

    /* JADX INFO: renamed from: d */
    public EdgeEffect f4969d;

    /* JADX INFO: renamed from: e */
    public EdgeEffect f4970e;

    /* JADX INFO: renamed from: f */
    public EdgeEffect f4971f;

    /* JADX INFO: renamed from: g */
    public EdgeEffect f4972g;

    /* JADX INFO: renamed from: h */
    public EdgeEffect f4973h;

    /* JADX INFO: renamed from: i */
    public EdgeEffect f4974i;

    /* JADX INFO: renamed from: j */
    public EdgeEffect f4975j;

    /* JADX INFO: renamed from: k */
    public EdgeEffect f4976k;

    public EdgeEffectWrapper(Context context, int i) {
        this.f4966a = context;
        this.f4967b = i;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m2452f(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m2453g(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !(EdgeEffectCompat.m2448b(edgeEffect) == 0.0f);
    }

    /* JADX INFO: renamed from: a */
    public final EdgeEffect m2454a(Orientation orientation) {
        int i = Build.VERSION.SDK_INT;
        Context context = this.f4966a;
        EdgeEffect edgeEffectM2426a = i >= 31 ? Api31Impl.m2426a(context) : new GlowEdgeEffectCompat(context);
        edgeEffectM2426a.setColor(this.f4967b);
        if (!IntSize.m6665b(this.f4968c, 0L)) {
            if (orientation == Orientation.f5829a) {
                long j = this.f4968c;
                edgeEffectM2426a.setSize((int) (j >> 32), (int) (j & 4294967295L));
                return edgeEffectM2426a;
            }
            long j2 = this.f4968c;
            edgeEffectM2426a.setSize((int) (j2 & 4294967295L), (int) (j2 >> 32));
        }
        return edgeEffectM2426a;
    }

    /* JADX INFO: renamed from: b */
    public final EdgeEffect m2455b() {
        EdgeEffect edgeEffect = this.f4970e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM2454a = m2454a(Orientation.f5829a);
        this.f4970e = edgeEffectM2454a;
        return edgeEffectM2454a;
    }

    /* JADX INFO: renamed from: c */
    public final EdgeEffect m2456c() {
        EdgeEffect edgeEffect = this.f4971f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM2454a = m2454a(Orientation.f5830b);
        this.f4971f = edgeEffectM2454a;
        return edgeEffectM2454a;
    }

    /* JADX INFO: renamed from: d */
    public final EdgeEffect m2457d() {
        EdgeEffect edgeEffect = this.f4972g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM2454a = m2454a(Orientation.f5830b);
        this.f4972g = edgeEffectM2454a;
        return edgeEffectM2454a;
    }

    /* JADX INFO: renamed from: e */
    public final EdgeEffect m2458e() {
        EdgeEffect edgeEffect = this.f4969d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM2454a = m2454a(Orientation.f5829a);
        this.f4969d = edgeEffectM2454a;
        return edgeEffectM2454a;
    }
}
