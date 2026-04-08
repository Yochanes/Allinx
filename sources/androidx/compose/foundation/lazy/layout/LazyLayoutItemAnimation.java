package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p013ui.graphics.GraphicsContext;
import androidx.compose.p013ui.graphics.layer.GraphicsLayer;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;", "", "Companion", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class LazyLayoutItemAnimation {

    /* JADX INFO: renamed from: r */
    public static final long f7212r;

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ int f7213s = 0;

    /* JADX INFO: renamed from: a */
    public final CoroutineScope f7214a;

    /* JADX INFO: renamed from: b */
    public final GraphicsContext f7215b;

    /* JADX INFO: renamed from: c */
    public final Function0 f7216c;

    /* JADX INFO: renamed from: d */
    public SpringSpec f7217d;

    /* JADX INFO: renamed from: e */
    public SpringSpec f7218e;

    /* JADX INFO: renamed from: f */
    public boolean f7219f;

    /* JADX INFO: renamed from: g */
    public final MutableState f7220g;

    /* JADX INFO: renamed from: h */
    public final MutableState f7221h;

    /* JADX INFO: renamed from: i */
    public final MutableState f7222i;

    /* JADX INFO: renamed from: j */
    public final MutableState f7223j;

    /* JADX INFO: renamed from: k */
    public long f7224k;

    /* JADX INFO: renamed from: l */
    public long f7225l;

    /* JADX INFO: renamed from: m */
    public GraphicsLayer f7226m;

    /* JADX INFO: renamed from: n */
    public final Animatable f7227n;

    /* JADX INFO: renamed from: o */
    public final Animatable f7228o;

    /* JADX INFO: renamed from: p */
    public final MutableState f7229p;

    /* JADX INFO: renamed from: q */
    public long f7230q;

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m18302d2 = {"<anonymous>", "", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    final class C06181 extends Lambda implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Object invoke() {
            return Unit.f51459a;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation$Companion;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    static {
        long j = Integer.MAX_VALUE;
        f7212r = (j & 4294967295L) | (j << 32);
    }

    public LazyLayoutItemAnimation(CoroutineScope coroutineScope, GraphicsContext graphicsContext, Function0 function0) {
        this.f7214a = coroutineScope;
        this.f7215b = graphicsContext;
        this.f7216c = function0;
        Boolean bool = Boolean.FALSE;
        this.f7220g = SnapshotStateKt.m4525g(bool);
        this.f7221h = SnapshotStateKt.m4525g(bool);
        this.f7222i = SnapshotStateKt.m4525g(bool);
        this.f7223j = SnapshotStateKt.m4525g(bool);
        long j = f7212r;
        this.f7224k = j;
        this.f7225l = 0L;
        this.f7226m = graphicsContext != null ? graphicsContext.mo4959b() : null;
        this.f7227n = new Animatable(new IntOffset(0L), VectorConvertersKt.f4692g, null, 12);
        this.f7228o = new Animatable(Float.valueOf(1.0f), VectorConvertersKt.f4686a, null, 12);
        this.f7229p = SnapshotStateKt.m4525g(new IntOffset(0L));
        this.f7230q = j;
    }

    /* JADX INFO: renamed from: a */
    public final void m3036a() {
        GraphicsLayer graphicsLayer = this.f7226m;
        SpringSpec springSpec = this.f7217d;
        boolean zBooleanValue = ((Boolean) ((SnapshotMutableStateImpl) this.f7221h).getF20325a()).booleanValue();
        CoroutineScope coroutineScope = this.f7214a;
        if (zBooleanValue || springSpec == null || graphicsLayer == null) {
            if (m3038c()) {
                if (graphicsLayer != null) {
                    graphicsLayer.m5390f(1.0f);
                }
                BuildersKt.m20507c(coroutineScope, null, null, new LazyLayoutItemAnimation$animateAppearance$1(this, null), 3);
                return;
            }
            return;
        }
        m3040e(true);
        boolean zM3038c = m3038c();
        boolean z2 = !zM3038c;
        if (!zM3038c) {
            graphicsLayer.m5390f(0.0f);
        }
        BuildersKt.m20507c(coroutineScope, null, null, new LazyLayoutItemAnimation$animateAppearance$2(z2, this, springSpec, graphicsLayer, null), 3);
    }

    /* JADX INFO: renamed from: b */
    public final void m3037b() {
        if (((Boolean) ((SnapshotMutableStateImpl) this.f7220g).getF20325a()).booleanValue()) {
            BuildersKt.m20507c(this.f7214a, null, null, new LazyLayoutItemAnimation$cancelPlacementAnimation$1(this, null), 3);
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m3038c() {
        return ((Boolean) ((SnapshotMutableStateImpl) this.f7222i).getF20325a()).booleanValue();
    }

    /* JADX INFO: renamed from: d */
    public final void m3039d() {
        GraphicsContext graphicsContext;
        boolean zBooleanValue = ((Boolean) ((SnapshotMutableStateImpl) this.f7220g).getF20325a()).booleanValue();
        CoroutineScope coroutineScope = this.f7214a;
        if (zBooleanValue) {
            m3042g(false);
            BuildersKt.m20507c(coroutineScope, null, null, new LazyLayoutItemAnimation$release$1(this, null), 3);
        }
        if (((Boolean) ((SnapshotMutableStateImpl) this.f7221h).getF20325a()).booleanValue()) {
            m3040e(false);
            BuildersKt.m20507c(coroutineScope, null, null, new LazyLayoutItemAnimation$release$2(this, null), 3);
        }
        if (m3038c()) {
            m3041f(false);
            BuildersKt.m20507c(coroutineScope, null, null, new LazyLayoutItemAnimation$release$3(this, null), 3);
        }
        this.f7219f = false;
        m3043h(0L);
        this.f7224k = f7212r;
        GraphicsLayer graphicsLayer = this.f7226m;
        if (graphicsLayer != null && (graphicsContext = this.f7215b) != null) {
            graphicsContext.mo4958a(graphicsLayer);
        }
        this.f7226m = null;
        this.f7217d = null;
        this.f7218e = null;
    }

    /* JADX INFO: renamed from: e */
    public final void m3040e(boolean z2) {
        ((SnapshotMutableStateImpl) this.f7221h).setValue(Boolean.valueOf(z2));
    }

    /* JADX INFO: renamed from: f */
    public final void m3041f(boolean z2) {
        ((SnapshotMutableStateImpl) this.f7222i).setValue(Boolean.valueOf(z2));
    }

    /* JADX INFO: renamed from: g */
    public final void m3042g(boolean z2) {
        ((SnapshotMutableStateImpl) this.f7220g).setValue(Boolean.valueOf(z2));
    }

    /* JADX INFO: renamed from: h */
    public final void m3043h(long j) {
        ((SnapshotMutableStateImpl) this.f7229p).setValue(new IntOffset(j));
    }
}
