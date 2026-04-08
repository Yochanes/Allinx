package androidx.constraintlayout.core.dsl;

import java.util.HashMap;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract class Chain extends Helper {

    /* JADX INFO: compiled from: Proguard */
    public class Anchor {
        public final String toString() {
            return AbstractC0000a.m3D("[", ",0,0", "]");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class Style {

        /* JADX INFO: renamed from: a */
        public static final Style f21202a;

        /* JADX INFO: renamed from: b */
        public static final Style f21203b;

        /* JADX INFO: renamed from: c */
        public static final Style f21204c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ Style[] f21205d;

        static {
            Style style = new Style("PACKED", 0);
            f21202a = style;
            Style style2 = new Style("SPREAD", 1);
            f21203b = style2;
            Style style3 = new Style("SPREAD_INSIDE", 2);
            f21204c = style3;
            f21205d = new Style[]{style, style2, style3};
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) f21205d.clone();
        }
    }

    static {
        HashMap map = new HashMap();
        map.put(Style.f21203b, "'spread'");
        map.put(Style.f21204c, "'spread_inside'");
        map.put(Style.f21202a, "'packed'");
    }
}
