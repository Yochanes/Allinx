package androidx.graphics.path;

import android.graphics.PointF;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/graphics/path/PathSegment;", "", "Type", "graphics-path_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class PathSegment {

    /* JADX INFO: renamed from: a */
    public final Type f24828a;

    /* JADX INFO: renamed from: b */
    public final PointF[] f24829b;

    /* JADX INFO: renamed from: c */
    public final float f24830c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/graphics/path/PathSegment$Type;", "", "graphics-path_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Type {

        /* JADX INFO: renamed from: a */
        public static final Type f24831a;

        /* JADX INFO: renamed from: b */
        public static final Type f24832b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ Type[] f24833c;

        /* JADX INFO: Fake field, exist only in values array */
        Type EF0;

        static {
            Type type = new Type("Move", 0);
            Type type2 = new Type("Line", 1);
            Type type3 = new Type("Quadratic", 2);
            Type type4 = new Type("Conic", 3);
            Type type5 = new Type("Cubic", 4);
            Type type6 = new Type("Close", 5);
            f24831a = type6;
            Type type7 = new Type("Done", 6);
            f24832b = type7;
            f24833c = new Type[]{type, type2, type3, type4, type5, type6, type7};
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f24833c.clone();
        }
    }

    public PathSegment(Type type, PointF[] pointFArr, float f) {
        this.f24828a = type;
        this.f24829b = pointFArr;
        this.f24830c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!PathSegment.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.m18597e(obj, "null cannot be cast to non-null type androidx.graphics.path.PathSegment");
        PathSegment pathSegment = (PathSegment) obj;
        return this.f24828a == pathSegment.f24828a && Arrays.equals(this.f24829b, pathSegment.f24829b) && this.f24830c == pathSegment.f24830c;
    }

    public final int hashCode() {
        return Float.hashCode(this.f24830c) + (((this.f24828a.hashCode() * 31) + Arrays.hashCode(this.f24829b)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PathSegment(type=");
        sb.append(this.f24828a);
        sb.append(", points=");
        String string = Arrays.toString(this.f24829b);
        Intrinsics.m18598f(string, "toString(this)");
        sb.append(string);
        sb.append(", weight=");
        return AbstractC0000a.m16m(sb, this.f24830c, ')');
    }
}
