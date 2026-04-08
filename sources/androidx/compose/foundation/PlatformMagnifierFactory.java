package androidx.compose.foundation;

import android.os.Build;
import android.view.View;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/foundation/PlatformMagnifierFactory;", "", "Companion", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface PlatformMagnifierFactory {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/PlatformMagnifierFactory$Companion;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static PlatformMagnifierFactory m2501a() {
            if (Magnifier_androidKt.m2486a()) {
                return Build.VERSION.SDK_INT == 28 ? PlatformMagnifierFactoryApi28Impl.f5126a : PlatformMagnifierFactoryApi29Impl.f5128a;
            }
            throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
        }
    }

    /* JADX INFO: renamed from: a */
    PlatformMagnifier mo2499a(View view, boolean z2, long j, float f, float f2, boolean z3, Density density, float f3);

    /* JADX INFO: renamed from: b */
    boolean mo2500b();
}
