package androidx.media3.p017ui;

import android.text.Html;
import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class SpannedToHtmlConverter {

    /* JADX INFO: renamed from: a */
    public static final Pattern f30062a = Pattern.compile("(&#13;)?&#10;");

    /* JADX INFO: compiled from: Proguard */
    public static class HtmlAndCss {

        /* JADX INFO: renamed from: a */
        public final String f30063a;

        /* JADX INFO: renamed from: b */
        public final Object f30064b;

        public HtmlAndCss(String str, Map map) {
            this.f30063a = str;
            this.f30064b = map;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SpanInfo {

        /* JADX INFO: renamed from: e */
        public static final C2006j f30065e = new C2006j(0);

        /* JADX INFO: renamed from: f */
        public static final C2006j f30066f = new C2006j(1);

        /* JADX INFO: renamed from: a */
        public final int f30067a;

        /* JADX INFO: renamed from: b */
        public final int f30068b;

        /* JADX INFO: renamed from: c */
        public final String f30069c;

        /* JADX INFO: renamed from: d */
        public final String f30070d;

        public SpanInfo(int i, int i2, String str, String str2) {
            this.f30067a = i;
            this.f30068b = i2;
            this.f30069c = str;
            this.f30070d = str2;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Transition {

        /* JADX INFO: renamed from: a */
        public final ArrayList f30071a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public final ArrayList f30072b = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public static String m11174a(CharSequence charSequence) {
        return f30062a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
