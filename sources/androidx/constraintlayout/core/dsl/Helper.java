package androidx.constraintlayout.core.dsl;

import androidx.constraintlayout.core.dsl.Constraint;
import java.util.HashMap;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class Helper {

    /* JADX INFO: compiled from: Proguard */
    public static final class HelperType {
        public final String toString() {
            return null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class Type {

        /* JADX INFO: renamed from: a */
        public static final Type f21245a;

        /* JADX INFO: renamed from: b */
        public static final Type f21246b;

        /* JADX INFO: renamed from: c */
        public static final Type f21247c;

        /* JADX INFO: renamed from: d */
        public static final Type f21248d;

        /* JADX INFO: renamed from: f */
        public static final Type f21249f;

        /* JADX INFO: renamed from: g */
        public static final /* synthetic */ Type[] f21250g;

        static {
            Type type = new Type("VERTICAL_GUIDELINE", 0);
            f21245a = type;
            Type type2 = new Type("HORIZONTAL_GUIDELINE", 1);
            f21246b = type2;
            Type type3 = new Type("VERTICAL_CHAIN", 2);
            f21247c = type3;
            Type type4 = new Type("HORIZONTAL_CHAIN", 3);
            f21248d = type4;
            Type type5 = new Type("BARRIER", 4);
            f21249f = type5;
            f21250g = new Type[]{type, type2, type3, type4, type5};
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f21250g.clone();
        }
    }

    static {
        HashMap map = new HashMap();
        map.put(Constraint.Side.f21233a, "'left'");
        map.put(Constraint.Side.f21234b, "'right'");
        map.put(Constraint.Side.f21235c, "'top'");
        map.put(Constraint.Side.f21236d, "'bottom'");
        map.put(Constraint.Side.f21237f, "'start'");
        map.put(Constraint.Side.f21238g, "'end'");
        map.put(Constraint.Side.f21239i, "'baseline'");
        HashMap map2 = new HashMap();
        map2.put(Type.f21245a, "vGuideline");
        map2.put(Type.f21246b, "hGuideline");
        map2.put(Type.f21247c, "vChain");
        map2.put(Type.f21248d, "hChain");
        map2.put(Type.f21249f, "barrier");
    }

    public final String toString() {
        return AbstractC0000a.m13j("null:{\n", "},\n");
    }
}
