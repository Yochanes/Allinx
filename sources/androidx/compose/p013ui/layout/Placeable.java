package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.graphics.layer.GraphicsLayer;
import androidx.compose.p013ui.node.MotionReferencePlacementDelegate;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.p013ui.unit.IntSize;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/layout/Measured;", "PlacementScope", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public abstract class Placeable implements Measured {

    /* JADX INFO: renamed from: a */
    public int f18567a;

    /* JADX INFO: renamed from: b */
    public int f18568b;

    /* JADX INFO: renamed from: c */
    public long f18569c;

    /* JADX INFO: renamed from: d */
    public long f18570d = PlaceableKt.f18574b;

    /* JADX INFO: renamed from: f */
    public long f18571f = 0;

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @PlacementScopeMarker
    @SourceDebugExtension
    public static abstract class PlacementScope {

        /* JADX INFO: renamed from: a */
        public boolean f18572a;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a */
        public static final void m5674a(PlacementScope placementScope, Placeable placeable) {
            placementScope.getClass();
            if (placeable instanceof MotionReferencePlacementDelegate) {
                ((MotionReferencePlacementDelegate) placeable).mo5853Z(placementScope.f18572a);
            }
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ void m5675f(PlacementScope placementScope, Placeable placeable, int i, int i2) {
            placementScope.m5683e(placeable, i, i2, 0.0f);
        }

        /* JADX INFO: renamed from: g */
        public static void m5676g(PlacementScope placementScope, Placeable placeable, long j) {
            placementScope.getClass();
            m5674a(placementScope, placeable);
            placeable.mo5616y0(IntOffset.m6653d(j, placeable.f18571f), 0.0f, null);
        }

        /* JADX INFO: renamed from: h */
        public static void m5677h(PlacementScope placementScope, Placeable placeable, int i, int i2) {
            long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
            if (placementScope.mo5655c() == LayoutDirection.f20569a || placementScope.mo5656d() == 0) {
                m5674a(placementScope, placeable);
                placeable.mo5616y0(IntOffset.m6653d(j, placeable.f18571f), 0.0f, null);
            } else {
                int iMo5656d = (placementScope.mo5656d() - placeable.f18567a) - ((int) (j >> 32));
                m5674a(placementScope, placeable);
                placeable.mo5616y0(IntOffset.m6653d((((long) iMo5656d) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), placeable.f18571f), 0.0f, null);
            }
        }

        /* JADX INFO: renamed from: i */
        public static void m5678i(PlacementScope placementScope, Placeable placeable, int i, int i2) {
            Function1 function1 = PlaceableKt.f18573a;
            PlaceableKt$DefaultLayerBlock$1 placeableKt$DefaultLayerBlock$1 = PlaceableKt$DefaultLayerBlock$1.f18575a;
            long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
            if (placementScope.mo5655c() == LayoutDirection.f20569a || placementScope.mo5656d() == 0) {
                m5674a(placementScope, placeable);
                placeable.mo5616y0(IntOffset.m6653d(j, placeable.f18571f), 0.0f, placeableKt$DefaultLayerBlock$1);
            } else {
                int iMo5656d = (placementScope.mo5656d() - placeable.f18567a) - ((int) (j >> 32));
                m5674a(placementScope, placeable);
                placeable.mo5616y0(IntOffset.m6653d((((long) iMo5656d) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L), placeable.f18571f), 0.0f, placeableKt$DefaultLayerBlock$1);
            }
        }

        /* JADX INFO: renamed from: j */
        public static void m5679j(PlacementScope placementScope, Placeable placeable, long j) {
            Function1 function1 = PlaceableKt.f18573a;
            PlaceableKt$DefaultLayerBlock$1 placeableKt$DefaultLayerBlock$1 = PlaceableKt$DefaultLayerBlock$1.f18575a;
            if (placementScope.mo5655c() == LayoutDirection.f20569a || placementScope.mo5656d() == 0) {
                m5674a(placementScope, placeable);
                placeable.mo5616y0(IntOffset.m6653d(j, placeable.f18571f), 0.0f, placeableKt$DefaultLayerBlock$1);
            } else {
                int iMo5656d = (placementScope.mo5656d() - placeable.f18567a) - ((int) (j >> 32));
                m5674a(placementScope, placeable);
                placeable.mo5616y0(IntOffset.m6653d((((long) ((int) (j & 4294967295L))) & 4294967295L) | (((long) iMo5656d) << 32), placeable.f18571f), 0.0f, placeableKt$DefaultLayerBlock$1);
            }
        }

        /* JADX INFO: renamed from: k */
        public static void m5680k(PlacementScope placementScope, Placeable placeable, long j, GraphicsLayer graphicsLayer) {
            if (placementScope.mo5655c() == LayoutDirection.f20569a || placementScope.mo5656d() == 0) {
                m5674a(placementScope, placeable);
                placeable.mo5672w0(IntOffset.m6653d(j, placeable.f18571f), 0.0f, graphicsLayer);
            } else {
                int iMo5656d = (placementScope.mo5656d() - placeable.f18567a) - ((int) (j >> 32));
                m5674a(placementScope, placeable);
                placeable.mo5672w0(IntOffset.m6653d((((long) ((int) (j & 4294967295L))) & 4294967295L) | (((long) iMo5656d) << 32), placeable.f18571f), 0.0f, graphicsLayer);
            }
        }

        /* JADX INFO: renamed from: m */
        public static /* synthetic */ void m5681m(PlacementScope placementScope, Placeable placeable, int i, int i2, Function1 function1, int i3) {
            if ((i3 & 8) != 0) {
                Function1 function12 = PlaceableKt.f18573a;
                function1 = PlaceableKt$DefaultLayerBlock$1.f18575a;
            }
            placementScope.m5684l(placeable, i, i2, 0.0f, function1);
        }

        /* JADX INFO: renamed from: n */
        public static void m5682n(PlacementScope placementScope, Placeable placeable, long j) {
            Function1 function1 = PlaceableKt.f18573a;
            PlaceableKt$DefaultLayerBlock$1 placeableKt$DefaultLayerBlock$1 = PlaceableKt$DefaultLayerBlock$1.f18575a;
            placementScope.getClass();
            m5674a(placementScope, placeable);
            placeable.mo5616y0(IntOffset.m6653d(j, placeable.f18571f), 0.0f, placeableKt$DefaultLayerBlock$1);
        }

        /* JADX INFO: renamed from: b */
        public LayoutCoordinates mo5654b() {
            return null;
        }

        /* JADX INFO: renamed from: c */
        public abstract LayoutDirection mo5655c();

        /* JADX INFO: renamed from: d */
        public abstract int mo5656d();

        /* JADX INFO: renamed from: e */
        public final void m5683e(Placeable placeable, int i, int i2, float f) {
            m5674a(this, placeable);
            placeable.mo5616y0(IntOffset.m6653d((((long) i2) & 4294967295L) | (((long) i) << 32), placeable.f18571f), f, null);
        }

        /* JADX INFO: renamed from: l */
        public final void m5684l(Placeable placeable, int i, int i2, float f, Function1 function1) {
            m5674a(this, placeable);
            placeable.mo5616y0(IntOffset.m6653d((((long) i2) & 4294967295L) | (((long) i) << 32), placeable.f18571f), f, function1);
        }
    }

    public Placeable() {
        long j = 0;
        this.f18569c = (j & 4294967295L) | (j << 32);
    }

    /* JADX INFO: renamed from: C0 */
    public final void m5668C0(long j) {
        if (Constraints.m6611b(this.f18570d, j)) {
            return;
        }
        this.f18570d = j;
        m5671v0();
    }

    /* JADX INFO: renamed from: q0 */
    public int mo5669q0() {
        return (int) (this.f18569c & 4294967295L);
    }

    /* JADX INFO: renamed from: r0 */
    public int mo5670r0() {
        return (int) (this.f18569c >> 32);
    }

    /* JADX INFO: renamed from: v0 */
    public final void m5671v0() {
        this.f18567a = RangesKt.m18656c((int) (this.f18569c >> 32), Constraints.m6619j(this.f18570d), Constraints.m6617h(this.f18570d));
        int iM18656c = RangesKt.m18656c((int) (this.f18569c & 4294967295L), Constraints.m6618i(this.f18570d), Constraints.m6616g(this.f18570d));
        this.f18568b = iM18656c;
        int i = this.f18567a;
        long j = this.f18569c;
        this.f18571f = (((long) ((i - ((int) (j >> 32))) / 2)) << 32) | (4294967295L & ((long) ((iM18656c - ((int) (j & 4294967295L))) / 2)));
    }

    /* JADX INFO: renamed from: w0 */
    public void mo5672w0(long j, float f, GraphicsLayer graphicsLayer) {
        mo5616y0(j, f, null);
    }

    /* JADX INFO: renamed from: y0 */
    public abstract void mo5616y0(long j, float f, Function1 function1);

    /* JADX INFO: renamed from: z0 */
    public final void m5673z0(long j) {
        if (IntSize.m6665b(this.f18569c, j)) {
            return;
        }
        this.f18569c = j;
        m5671v0();
    }
}
