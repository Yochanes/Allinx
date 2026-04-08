package kotlin.reflect;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.KTypeImpl;
import org.slf4j.Marker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SinceKotlin
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlin/reflect/KTypeProjection;", "", "Companion", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final /* data */ class KTypeProjection {

    /* JADX INFO: renamed from: c */
    public static final KTypeProjection f51715c = new KTypeProjection(null, null);

    /* JADX INFO: renamed from: a */
    public final KVariance f51716a;

    /* JADX INFO: renamed from: b */
    public final KTypeImpl f51717b;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/reflect/KTypeProjection$Companion;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f51718a;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                KVariance kVariance = KVariance.f51719a;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                KVariance kVariance2 = KVariance.f51719a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                KVariance kVariance3 = KVariance.f51719a;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f51718a = iArr;
        }
    }

    public KTypeProjection(KVariance kVariance, KTypeImpl kTypeImpl) {
        String str;
        this.f51716a = kVariance;
        this.f51717b = kTypeImpl;
        if ((kVariance == null) == (kTypeImpl == null)) {
            return;
        }
        if (kVariance == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + kVariance + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KTypeProjection)) {
            return false;
        }
        KTypeProjection kTypeProjection = (KTypeProjection) obj;
        return this.f51716a == kTypeProjection.f51716a && Intrinsics.m18594b(this.f51717b, kTypeProjection.f51717b);
    }

    public final int hashCode() {
        KVariance kVariance = this.f51716a;
        int iHashCode = (kVariance == null ? 0 : kVariance.hashCode()) * 31;
        KTypeImpl kTypeImpl = this.f51717b;
        return iHashCode + (kTypeImpl != null ? kTypeImpl.hashCode() : 0);
    }

    public final String toString() {
        KVariance kVariance = this.f51716a;
        int i = kVariance == null ? -1 : WhenMappings.f51718a[kVariance.ordinal()];
        if (i == -1) {
            return Marker.ANY_MARKER;
        }
        KTypeImpl kTypeImpl = this.f51717b;
        if (i == 1) {
            return String.valueOf(kTypeImpl);
        }
        if (i == 2) {
            return "in " + kTypeImpl;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return "out " + kTypeImpl;
    }
}
