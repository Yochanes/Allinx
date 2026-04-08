package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class RenderingFormat {

    /* JADX INFO: renamed from: a */
    public static final RenderingFormat f54317a;

    /* JADX INFO: renamed from: b */
    public static final RenderingFormat f54318b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ RenderingFormat[] f54319c;

    /* JADX INFO: compiled from: Proguard */
    public static final class HTML extends RenderingFormat {
        public HTML() {
            super("HTML", 1);
        }

        @Override // kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat
        /* JADX INFO: renamed from: a */
        public final String mo19805a(String string) {
            Intrinsics.m18599g(string, "string");
            return StringsKt.m20411I(StringsKt.m20411I(string, "<", "&lt;"), ">", "&gt;");
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class PLAIN extends RenderingFormat {
        public PLAIN() {
            super("PLAIN", 0);
        }

        @Override // kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat
        /* JADX INFO: renamed from: a */
        public final String mo19805a(String string) {
            Intrinsics.m18599g(string, "string");
            return string;
        }
    }

    static {
        PLAIN plain = new PLAIN();
        f54317a = plain;
        HTML html = new HTML();
        f54318b = html;
        f54319c = new RenderingFormat[]{plain, html};
    }

    public static RenderingFormat valueOf(String str) {
        return (RenderingFormat) Enum.valueOf(RenderingFormat.class, str);
    }

    public static RenderingFormat[] values() {
        return (RenderingFormat[]) f54319c.clone();
    }

    /* JADX INFO: renamed from: a */
    public abstract String mo19805a(String str);
}
