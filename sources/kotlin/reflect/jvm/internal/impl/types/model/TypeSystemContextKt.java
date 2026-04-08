package kotlin.reflect.jvm.internal.impl.types.model;

import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class TypeSystemContextKt {

    /* JADX INFO: compiled from: Proguard */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static final TypeVariance m20304a(Variance variance) {
        int iOrdinal = variance.ordinal();
        if (iOrdinal == 0) {
            return TypeVariance.INV;
        }
        if (iOrdinal == 1) {
            return TypeVariance.IN;
        }
        if (iOrdinal == 2) {
            return TypeVariance.OUT;
        }
        throw new NoWhenBranchMatchedException();
    }
}
