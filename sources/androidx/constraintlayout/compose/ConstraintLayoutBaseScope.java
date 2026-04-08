package androidx.constraintlayout.compose;

import androidx.compose.animation.AbstractC0455a;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.parser.CLObject;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;", "", "BaselineAnchor", "HorizontalAnchor", "VerticalAnchor", "constraintlayout-compose_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public abstract class ConstraintLayoutBaseScope {

    /* JADX INFO: renamed from: a */
    public final CLObject f20872a;

    /* JADX INFO: compiled from: Proguard */
    @Stable
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$BaselineAnchor;", "", "constraintlayout-compose_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final /* data */ class BaselineAnchor {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BaselineAnchor)) {
                return false;
            }
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Stable
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;", "", "constraintlayout-compose_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final /* data */ class HorizontalAnchor {

        /* JADX INFO: renamed from: a */
        public final Object f20873a;

        /* JADX INFO: renamed from: b */
        public final int f20874b;

        /* JADX INFO: renamed from: c */
        public final ConstrainedLayoutReference f20875c;

        public HorizontalAnchor(Object obj, int i, ConstrainedLayoutReference constrainedLayoutReference) {
            this.f20873a = obj;
            this.f20874b = i;
            this.f20875c = constrainedLayoutReference;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HorizontalAnchor)) {
                return false;
            }
            HorizontalAnchor horizontalAnchor = (HorizontalAnchor) obj;
            return this.f20873a.equals(horizontalAnchor.f20873a) && this.f20874b == horizontalAnchor.f20874b && this.f20875c.equals(horizontalAnchor.f20875c);
        }

        public final int hashCode() {
            return this.f20875c.hashCode() + AbstractC0455a.m2228c(this.f20874b, this.f20873a.hashCode() * 31, 31);
        }

        public final String toString() {
            return "HorizontalAnchor(id=" + this.f20873a + ", index=" + this.f20874b + ", reference=" + this.f20875c + ')';
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Stable
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;", "", "constraintlayout-compose_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final /* data */ class VerticalAnchor {

        /* JADX INFO: renamed from: a */
        public final Object f20876a;

        /* JADX INFO: renamed from: b */
        public final int f20877b;

        /* JADX INFO: renamed from: c */
        public final ConstrainedLayoutReference f20878c;

        public VerticalAnchor(Object obj, int i, ConstrainedLayoutReference constrainedLayoutReference) {
            this.f20876a = obj;
            this.f20877b = i;
            this.f20878c = constrainedLayoutReference;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VerticalAnchor)) {
                return false;
            }
            VerticalAnchor verticalAnchor = (VerticalAnchor) obj;
            return this.f20876a.equals(verticalAnchor.f20876a) && this.f20877b == verticalAnchor.f20877b && this.f20878c.equals(verticalAnchor.f20878c);
        }

        public final int hashCode() {
            return this.f20878c.hashCode() + AbstractC0455a.m2228c(this.f20877b, this.f20876a.hashCode() * 31, 31);
        }

        public final String toString() {
            return "VerticalAnchor(id=" + this.f20876a + ", index=" + this.f20877b + ", reference=" + this.f20878c + ')';
        }
    }

    public ConstraintLayoutBaseScope() {
        new ArrayList();
        this.f20872a = new CLObject(new char[0]);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConstraintLayoutBaseScope)) {
            return false;
        }
        return Intrinsics.m18594b(this.f20872a, ((ConstraintLayoutBaseScope) obj).f20872a);
    }

    public final int hashCode() {
        return this.f20872a.hashCode();
    }
}
