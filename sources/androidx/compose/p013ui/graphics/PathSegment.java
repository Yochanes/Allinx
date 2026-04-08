package androidx.compose.p013ui.graphics;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/graphics/PathSegment;", "", "Type", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class PathSegment {

    /* JADX INFO: renamed from: a */
    public final Type f17621a;

    /* JADX INFO: renamed from: b */
    public final float[] f17622b;

    /* JADX INFO: renamed from: c */
    public final float f17623c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/graphics/PathSegment$Type;", "", "ui-graphics_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Type {

        /* JADX INFO: renamed from: a */
        public static final Type f17624a;

        /* JADX INFO: renamed from: b */
        public static final Type f17625b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ Type[] f17626c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ EnumEntries f17627d;

        static {
            Type type = new Type("Move", 0);
            Type type2 = new Type("Line", 1);
            Type type3 = new Type("Quadratic", 2);
            Type type4 = new Type("Conic", 3);
            Type type5 = new Type("Cubic", 4);
            Type type6 = new Type("Close", 5);
            f17624a = type6;
            Type type7 = new Type("Done", 6);
            f17625b = type7;
            Type[] typeArr = {type, type2, type3, type4, type5, type6, type7};
            f17626c = typeArr;
            f17627d = EnumEntriesKt.m18563a(typeArr);
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f17626c.clone();
        }
    }

    public PathSegment(Type type, float[] fArr, float f) {
        this.f17621a = type;
        this.f17622b = fArr;
        this.f17623c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PathSegment.class == obj.getClass()) {
            PathSegment pathSegment = (PathSegment) obj;
            if (this.f17621a == pathSegment.f17621a && Arrays.equals(this.f17622b, pathSegment.f17622b) && this.f17623c == pathSegment.f17623c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f17623c) + ((Arrays.hashCode(this.f17622b) + (this.f17621a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PathSegment(type=");
        sb.append(this.f17621a);
        sb.append(", points=");
        String string = Arrays.toString(this.f17622b);
        Intrinsics.m18598f(string, "toString(...)");
        sb.append(string);
        sb.append(", weight=");
        return AbstractC0000a.m16m(sb, this.f17623c, ')');
    }
}
