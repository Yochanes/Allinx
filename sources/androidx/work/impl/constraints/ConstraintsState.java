package androidx.work.impl.constraints;

import kotlin.Metadata;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m18302d2 = {"Landroidx/work/impl/constraints/ConstraintsState;", "", "ConstraintsMet", "ConstraintsNotMet", "Landroidx/work/impl/constraints/ConstraintsState$ConstraintsMet;", "Landroidx/work/impl/constraints/ConstraintsState$ConstraintsNotMet;", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public abstract class ConstraintsState {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/work/impl/constraints/ConstraintsState$ConstraintsMet;", "Landroidx/work/impl/constraints/ConstraintsState;", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class ConstraintsMet extends ConstraintsState {

        /* JADX INFO: renamed from: a */
        public static final ConstraintsMet f32895a = new ConstraintsMet();
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/work/impl/constraints/ConstraintsState$ConstraintsNotMet;", "Landroidx/work/impl/constraints/ConstraintsState;", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final /* data */ class ConstraintsNotMet extends ConstraintsState {

        /* JADX INFO: renamed from: a */
        public final int f32896a;

        public ConstraintsNotMet(int i) {
            this.f32896a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConstraintsNotMet) && this.f32896a == ((ConstraintsNotMet) obj).f32896a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f32896a);
        }

        public final String toString() {
            return AbstractC0000a.m17n(new StringBuilder("ConstraintsNotMet(reason="), this.f32896a, ')');
        }
    }
}
