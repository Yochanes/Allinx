package androidx.compose.p013ui.input.pointer.util;

import androidx.compose.p013ui.internal.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/input/pointer/util/VelocityTracker1D;", "", "Strategy", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class VelocityTracker1D {

    /* JADX INFO: renamed from: a */
    public final boolean f18402a;

    /* JADX INFO: renamed from: b */
    public final Strategy f18403b;

    /* JADX INFO: renamed from: c */
    public final int f18404c;

    /* JADX INFO: renamed from: d */
    public final DataPointAtTime[] f18405d;

    /* JADX INFO: renamed from: e */
    public int f18406e;

    /* JADX INFO: renamed from: f */
    public final float[] f18407f;

    /* JADX INFO: renamed from: g */
    public final float[] f18408g;

    /* JADX INFO: renamed from: h */
    public final float[] f18409h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/input/pointer/util/VelocityTracker1D$Strategy;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Strategy {

        /* JADX INFO: renamed from: a */
        public static final Strategy f18410a;

        /* JADX INFO: renamed from: b */
        public static final Strategy f18411b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ Strategy[] f18412c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ EnumEntries f18413d;

        static {
            Strategy strategy = new Strategy("Lsq2", 0);
            f18410a = strategy;
            Strategy strategy2 = new Strategy("Impulse", 1);
            f18411b = strategy2;
            Strategy[] strategyArr = {strategy, strategy2};
            f18412c = strategyArr;
            f18413d = EnumEntriesKt.m18563a(strategyArr);
        }

        public static Strategy valueOf(String str) {
            return (Strategy) Enum.valueOf(Strategy.class, str);
        }

        public static Strategy[] values() {
            return (Strategy[]) f18412c.clone();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Strategy.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Strategy strategy = Strategy.f18410a;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public VelocityTracker1D(boolean z2, Strategy strategy) {
        int i;
        this.f18402a = z2;
        this.f18403b = strategy;
        if (z2 && strategy.equals(Strategy.f18410a)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int iOrdinal = strategy.ordinal();
        if (iOrdinal == 0) {
            i = 3;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i = 2;
        }
        this.f18404c = i;
        this.f18405d = new DataPointAtTime[20];
        this.f18407f = new float[20];
        this.f18408g = new float[20];
        this.f18409h = new float[3];
    }

    /* JADX INFO: renamed from: a */
    public final void m5588a(float f, long j) {
        int i = (this.f18406e + 1) % 20;
        this.f18406e = i;
        DataPointAtTime[] dataPointAtTimeArr = this.f18405d;
        DataPointAtTime dataPointAtTime = dataPointAtTimeArr[i];
        if (dataPointAtTime != null) {
            dataPointAtTime.f18395a = j;
            dataPointAtTime.f18396b = f;
        } else {
            DataPointAtTime dataPointAtTime2 = new DataPointAtTime();
            dataPointAtTime2.f18395a = j;
            dataPointAtTime2.f18396b = f;
            dataPointAtTimeArr[i] = dataPointAtTime2;
        }
    }

    /* JADX INFO: renamed from: b */
    public final float m5589b(float f) {
        Strategy strategy;
        float[] fArr;
        float[] fArr2;
        float f2;
        boolean z2;
        int i;
        float fSignum;
        float f3 = f;
        float f4 = 0.0f;
        if (f3 <= 0.0f) {
            InlineClassHelperKt.m5597b("maximumVelocity should be a positive value. You specified=" + f3);
        }
        int i2 = this.f18406e;
        DataPointAtTime[] dataPointAtTimeArr = this.f18405d;
        DataPointAtTime dataPointAtTime = dataPointAtTimeArr[i2];
        if (dataPointAtTime == null) {
            f2 = 0.0f;
        } else {
            int i3 = 0;
            DataPointAtTime dataPointAtTime2 = dataPointAtTime;
            while (true) {
                DataPointAtTime dataPointAtTime3 = dataPointAtTimeArr[i2];
                boolean z3 = this.f18402a;
                strategy = this.f18403b;
                fArr = this.f18407f;
                fArr2 = this.f18408g;
                if (dataPointAtTime3 == null) {
                    f2 = f4;
                    z2 = z3;
                    i = 1;
                    break;
                }
                long j = dataPointAtTime.f18395a;
                f2 = f4;
                int i4 = i2;
                long j2 = dataPointAtTime3.f18395a;
                float f5 = j - j2;
                z2 = z3;
                i = 1;
                float fAbs = Math.abs(j2 - dataPointAtTime2.f18395a);
                dataPointAtTime2 = (strategy == Strategy.f18410a || z2) ? dataPointAtTime3 : dataPointAtTime;
                if (f5 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                fArr[i3] = dataPointAtTime3.f18396b;
                fArr2[i3] = -f5;
                i2 = (i4 == 0 ? 20 : i4) - 1;
                i3++;
                if (i3 >= 20) {
                    break;
                }
                f4 = f2;
            }
            if (i3 >= this.f18404c) {
                int iOrdinal = strategy.ordinal();
                if (iOrdinal == 0) {
                    try {
                        float[] fArr3 = this.f18409h;
                        VelocityTrackerKt.m5592c(fArr2, fArr, i3, fArr3);
                        fSignum = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        fSignum = f2;
                    }
                } else {
                    if (iOrdinal != i) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i5 = i3 - i;
                    float f6 = fArr2[i5];
                    int i6 = i5;
                    float fAbs2 = f2;
                    while (i6 > 0) {
                        int i7 = i6 - 1;
                        float f7 = fArr2[i7];
                        if (f6 != f7) {
                            float f8 = (z2 ? -fArr[i7] : fArr[i6] - fArr[i7]) / (f6 - f7);
                            fAbs2 += Math.abs(f8) * (f8 - (Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2))));
                            if (i6 == i5) {
                                fAbs2 *= 0.5f;
                            }
                        }
                        i6--;
                        f6 = f7;
                    }
                    fSignum = Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2));
                }
                f4 = fSignum * 1000;
            } else {
                f4 = f2;
            }
        }
        if (f4 == f2 || Float.isNaN(f4)) {
            return f2;
        }
        if (f4 <= f2) {
            f3 = -f3;
            if (f4 >= f3) {
                return f4;
            }
        } else if (f4 <= f3) {
            f3 = f4;
        }
        return f3;
    }

    public /* synthetic */ VelocityTracker1D() {
        this(false, Strategy.f18410a);
    }

    public VelocityTracker1D(int i) {
        this(true, Strategy.f18411b);
    }
}
