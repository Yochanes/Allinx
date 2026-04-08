package androidx.compose.foundation;

import android.view.View;
import android.widget.Magnifier;
import androidx.annotation.RequiresApi;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@RequiresApi
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/PlatformMagnifierFactoryApi28Impl;", "Landroidx/compose/foundation/PlatformMagnifierFactory;", "PlatformMagnifierImpl", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class PlatformMagnifierFactoryApi28Impl implements PlatformMagnifierFactory {

    /* JADX INFO: renamed from: a */
    public static final PlatformMagnifierFactoryApi28Impl f5126a = new PlatformMagnifierFactoryApi28Impl();

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/PlatformMagnifierFactoryApi28Impl$PlatformMagnifierImpl;", "Landroidx/compose/foundation/PlatformMagnifier;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @RequiresApi
    @SourceDebugExtension
    public static class PlatformMagnifierImpl implements PlatformMagnifier {

        /* JADX INFO: renamed from: a */
        public final Magnifier f5127a;

        public PlatformMagnifierImpl(Magnifier magnifier) {
            this.f5127a = magnifier;
        }

        @Override // androidx.compose.foundation.PlatformMagnifier
        /* JADX INFO: renamed from: a */
        public final long mo2496a() {
            return (((long) this.f5127a.getHeight()) & 4294967295L) | (((long) this.f5127a.getWidth()) << 32);
        }

        @Override // androidx.compose.foundation.PlatformMagnifier
        /* JADX INFO: renamed from: b */
        public final void mo2497b() {
            this.f5127a.update();
        }

        @Override // androidx.compose.foundation.PlatformMagnifier
        /* JADX INFO: renamed from: c */
        public void mo2498c(float f, long j, long j2) {
            this.f5127a.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        }

        @Override // androidx.compose.foundation.PlatformMagnifier
        public final void dismiss() {
            this.f5127a.dismiss();
        }
    }

    @Override // androidx.compose.foundation.PlatformMagnifierFactory
    /* JADX INFO: renamed from: a */
    public final PlatformMagnifier mo2499a(View view, boolean z2, long j, float f, float f2, boolean z3, Density density, float f3) {
        return new PlatformMagnifierImpl(new Magnifier(view));
    }

    @Override // androidx.compose.foundation.PlatformMagnifierFactory
    /* JADX INFO: renamed from: b */
    public final boolean mo2500b() {
        return false;
    }
}
