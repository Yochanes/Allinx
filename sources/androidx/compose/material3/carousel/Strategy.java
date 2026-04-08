package androidx.compose.material3.carousel;

import androidx.collection.MutableFloatList;
import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/material3/carousel/Strategy;", "", "Companion", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class Strategy {

    /* JADX INFO: renamed from: a */
    public final KeylineList f15324a;

    /* JADX INFO: renamed from: b */
    public final Object f15325b;

    /* JADX INFO: renamed from: c */
    public final Object f15326c;

    /* JADX INFO: renamed from: d */
    public final float f15327d;

    /* JADX INFO: renamed from: e */
    public final float f15328e;

    /* JADX INFO: renamed from: f */
    public final float f15329f;

    /* JADX INFO: renamed from: g */
    public final float f15330g;

    /* JADX INFO: renamed from: h */
    public final float f15331h;

    /* JADX INFO: renamed from: i */
    public final float f15332i;

    /* JADX INFO: renamed from: j */
    public final MutableFloatList f15333j;

    /* JADX INFO: renamed from: k */
    public final MutableFloatList f15334k;

    /* JADX INFO: renamed from: l */
    public final boolean f15335l;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material3/carousel/Strategy$Companion;", "", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    static {
        KeylineList keylineList = KeylineList.f15312i;
        EmptyList emptyList = EmptyList.f51496a;
        new Strategy(keylineList, emptyList, emptyList, 0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    public Strategy(KeylineList keylineList, List list, List list2, float f, float f2, float f3, float f4) {
        this.f15324a = keylineList;
        this.f15325b = list;
        this.f15326c = list2;
        this.f15327d = f;
        this.f15328e = f2;
        this.f15329f = f3;
        this.f15330g = f4;
        float fMax = list.isEmpty() ? 0.0f : Math.max(((Keyline) CollectionsKt.m18398B((List) CollectionsKt.m18411L(list))).f15307c - ((Keyline) CollectionsKt.m18398B((List) CollectionsKt.m18398B(list))).f15307c, f3);
        this.f15331h = fMax;
        float fMax2 = list2.isEmpty() ? 0.0f : Math.max(((Keyline) CollectionsKt.m18411L((List) CollectionsKt.m18398B(list2))).f15307c - ((Keyline) CollectionsKt.m18411L((List) CollectionsKt.m18411L(list2))).f15307c, f4);
        this.f15332i = fMax2;
        this.f15333j = StrategyKt.m4117a(fMax, list, true);
        this.f15334k = StrategyKt.m4117a(fMax2, list2, false);
        this.f15335l = (keylineList.f15313a.isEmpty() || f == 0.0f || m4116a() == 0.0f) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public final float m4116a() {
        KeylineList keylineList = this.f15324a;
        Keyline keyline = (Keyline) CollectionsKt.m18406G(keylineList.f15317f, keylineList);
        if (keyline != null) {
            return keyline.f15305a;
        }
        throw new NoSuchElementException("All KeylineLists must have at least one focal keyline");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Strategy)) {
            return false;
        }
        boolean z2 = this.f15335l;
        if (!z2 && !((Strategy) obj).f15335l) {
            return true;
        }
        Strategy strategy = (Strategy) obj;
        return z2 == strategy.f15335l && this.f15327d == strategy.f15327d && this.f15328e == strategy.f15328e && this.f15329f == strategy.f15329f && this.f15330g == strategy.f15330g && m4116a() == strategy.m4116a() && this.f15331h == strategy.f15331h && this.f15332i == strategy.f15332i && Intrinsics.m18594b(this.f15333j, strategy.f15333j) && Intrinsics.m18594b(this.f15334k, strategy.f15334k) && Intrinsics.m18594b(this.f15324a, strategy.f15324a);
    }

    public final int hashCode() {
        boolean z2 = this.f15335l;
        if (!z2) {
            return Boolean.hashCode(z2);
        }
        return this.f15324a.hashCode() + ((this.f15334k.hashCode() + ((this.f15333j.hashCode() + AbstractC0455a.m2226a(AbstractC0455a.m2226a((Float.hashCode(m4116a()) + AbstractC0455a.m2226a(AbstractC0455a.m2226a(AbstractC0455a.m2226a(AbstractC0455a.m2226a(Boolean.hashCode(z2) * 31, this.f15327d, 31), this.f15328e, 31), this.f15329f, 31), this.f15330g, 31)) * 31, this.f15331h, 31), this.f15332i, 31)) * 31)) * 31);
    }
}
