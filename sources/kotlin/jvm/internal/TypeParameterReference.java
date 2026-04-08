package kotlin.jvm.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.SinceKotlin;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVariance;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SinceKotlin
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlin/jvm/internal/TypeParameterReference;", "Lkotlin/reflect/KTypeParameter;", "Companion", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@SourceDebugExtension
public final class TypeParameterReference implements KTypeParameter {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/jvm/internal/TypeParameterReference$Companion;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
        public /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[KVariance.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    KVariance kVariance = KVariance.f51719a;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    KVariance kVariance2 = KVariance.f51719a;
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused3) {
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public static String m18634a(KTypeParameter kTypeParameter) {
            StringBuilder sb = new StringBuilder();
            int iOrdinal = kTypeParameter.mo18633k().ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    sb.append("in ");
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    sb.append("out ");
                }
            }
            sb.append(kTypeParameter.getName());
            return sb.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TypeParameterReference)) {
            return false;
        }
        TypeParameterReference typeParameterReference = (TypeParameterReference) obj;
        typeParameterReference.getClass();
        typeParameterReference.getClass();
        return true;
    }

    @Override // kotlin.reflect.KTypeParameter
    public final String getName() {
        return null;
    }

    @Override // kotlin.reflect.KTypeParameter
    public final List getUpperBounds() {
        return null;
    }

    public final int hashCode() {
        throw null;
    }

    @Override // kotlin.reflect.KTypeParameter
    /* JADX INFO: renamed from: k */
    public final KVariance mo18633k() {
        return null;
    }

    public final String toString() {
        return Companion.m18634a(this);
    }
}
