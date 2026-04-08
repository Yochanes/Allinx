package androidx.media3.extractor.text.webvtt;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.datastore.preferences.protobuf.AbstractC1610a;
import androidx.media3.common.text.Cue;
import androidx.media3.common.text.HorizontalTextInVerticalContextSpan;
import androidx.media3.common.text.RubySpan;
import androidx.media3.common.text.SpanUtil;
import androidx.media3.common.text.VoiceSpan;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.primitives.Ints;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class WebvttCueParser {

    /* JADX INFO: renamed from: a */
    public static final Pattern f29341a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* JADX INFO: renamed from: b */
    public static final Pattern f29342b = Pattern.compile("(\\S+?):(\\S+)");

    /* JADX INFO: renamed from: c */
    public static final Map f29343c;

    /* JADX INFO: renamed from: d */
    public static final Map f29344d;

    /* JADX INFO: compiled from: Proguard */
    public static class Element {

        /* JADX INFO: renamed from: c */
        public static final C1975a f29345c = new C1975a(0);

        /* JADX INFO: renamed from: a */
        public final StartTag f29346a;

        /* JADX INFO: renamed from: b */
        public final int f29347b;

        public Element(StartTag startTag, int i) {
            this.f29346a = startTag;
            this.f29347b = i;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class StartTag {

        /* JADX INFO: renamed from: a */
        public final String f29348a;

        /* JADX INFO: renamed from: b */
        public final int f29349b;

        /* JADX INFO: renamed from: c */
        public final String f29350c;

        /* JADX INFO: renamed from: d */
        public final Set f29351d;

        public StartTag(String str, int i, String str2, Set set) {
            this.f29349b = i;
            this.f29348a = str;
            this.f29350c = str2;
            this.f29351d = set;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class StyleMatch implements Comparable<StyleMatch> {

        /* JADX INFO: renamed from: a */
        public final int f29352a;

        /* JADX INFO: renamed from: b */
        public final WebvttCssStyle f29353b;

        public StyleMatch(int i, WebvttCssStyle webvttCssStyle) {
            this.f29352a = i;
            this.f29353b = webvttCssStyle;
        }

        @Override // java.lang.Comparable
        public final int compareTo(StyleMatch styleMatch) {
            return Integer.compare(this.f29352a, styleMatch.f29352a);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class WebvttCueInfoBuilder {

        /* JADX INFO: renamed from: c */
        public CharSequence f29356c;

        /* JADX INFO: renamed from: a */
        public long f29354a = 0;

        /* JADX INFO: renamed from: b */
        public long f29355b = 0;

        /* JADX INFO: renamed from: d */
        public int f29357d = 2;

        /* JADX INFO: renamed from: e */
        public float f29358e = -3.4028235E38f;

        /* JADX INFO: renamed from: f */
        public int f29359f = 1;

        /* JADX INFO: renamed from: g */
        public int f29360g = 0;

        /* JADX INFO: renamed from: h */
        public float f29361h = -3.4028235E38f;

        /* JADX INFO: renamed from: i */
        public int f29362i = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: j */
        public float f29363j = 1.0f;

        /* JADX INFO: renamed from: k */
        public int f29364k = Integer.MIN_VALUE;

        /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Cue.Builder m11038a() {
            Layout.Alignment alignment;
            float f = this.f29361h;
            float f2 = -3.4028235E38f;
            if (f == -3.4028235E38f) {
                int i = this.f29357d;
                f = i != 4 ? i != 5 ? 0.5f : 1.0f : 0.0f;
            }
            int i2 = this.f29362i;
            if (i2 == Integer.MIN_VALUE) {
                int i3 = this.f29357d;
                if (i3 == 1) {
                    i2 = 0;
                } else if (i3 == 3) {
                    i2 = 2;
                } else if (i3 != 4) {
                    if (i3 != 5) {
                        i2 = 1;
                    }
                }
            }
            Cue.Builder builder = new Cue.Builder();
            int i4 = this.f29357d;
            if (i4 == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i4 == 2) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            } else if (i4 == 3) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (i4 != 4) {
                if (i4 != 5) {
                    AbstractC1610a.m8738p(i4, "Unknown textAlignment: ", "WebvttCueParser");
                    alignment = null;
                }
            }
            builder.f25538c = alignment;
            float f3 = this.f29358e;
            int i5 = this.f29359f;
            if (f3 == -3.4028235E38f || i5 != 0 || (f3 >= 0.0f && f3 <= 1.0f)) {
                if (f3 != -3.4028235E38f) {
                    f2 = f3;
                } else if (i5 == 0) {
                    f2 = 1.0f;
                }
            }
            builder.f25540e = f2;
            builder.f25541f = i5;
            builder.f25542g = this.f29360g;
            builder.f25543h = f;
            builder.f25544i = i2;
            float f4 = this.f29363j;
            if (i2 == 0) {
                f = 1.0f - f;
            } else if (i2 == 1) {
                f = f <= 0.5f ? f * 2.0f : (1.0f - f) * 2.0f;
            } else if (i2 != 2) {
                throw new IllegalStateException(String.valueOf(i2));
            }
            builder.f25547l = Math.min(f4, f);
            builder.f25551p = this.f29364k;
            CharSequence charSequence = this.f29356c;
            if (charSequence != null) {
                builder.f25536a = charSequence;
            }
            return builder;
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f29343c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f29344d = Collections.unmodifiableMap(map2);
    }

    /* JADX INFO: renamed from: a */
    public static void m11031a(String str, StartTag startTag, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i;
        int length;
        int i2;
        int i3;
        int i4;
        int i5;
        i = startTag.f29349b;
        length = spannableStringBuilder.length();
        String str2 = startTag.f29348a;
        str2.getClass();
        i2 = -1;
        switch (str2) {
            case "":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i, length, 33);
                break;
            case "c":
                for (String str3 : startTag.f29351d) {
                    Map map = f29343c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i, length, 33);
                    } else {
                        Map map2 = f29344d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i, length, 33);
                        }
                    }
                }
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                break;
            case "v":
                spannableStringBuilder.setSpan(new VoiceSpan(startTag.f29350c), i, length, 33);
                break;
            case "ruby":
                int iM11033c = m11033c(list2, str, startTag);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, Element.f29345c);
                int i6 = startTag.f29349b;
                int i7 = 0;
                int length2 = 0;
                while (i7 < arrayList.size()) {
                    if ("rt".equals(((Element) arrayList.get(i7)).f29346a.f29348a)) {
                        Element element = (Element) arrayList.get(i7);
                        int iM11033c2 = m11033c(list2, str, element.f29346a);
                        if (iM11033c2 == i2) {
                            iM11033c2 = iM11033c != i2 ? iM11033c : 1;
                        }
                        int i8 = element.f29346a.f29349b - length2;
                        int i9 = element.f29347b - length2;
                        CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i8, i9);
                        spannableStringBuilder.delete(i8, i9);
                        spannableStringBuilder.setSpan(new RubySpan(charSequenceSubSequence.toString(), iM11033c2), i6, i8, 33);
                        length2 = charSequenceSubSequence.length() + length2;
                        i6 = i8;
                    }
                    i7++;
                    i2 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList arrayListM11032b = m11032b(list2, str, startTag);
        for (int i10 = 0; i10 < arrayListM11032b.size(); i10++) {
            WebvttCssStyle webvttCssStyle = ((StyleMatch) arrayListM11032b.get(i10)).f29353b;
            int i11 = webvttCssStyle.f29332l;
            if (i11 == -1 && webvttCssStyle.f29333m == -1) {
                i3 = -1;
            } else {
                i3 = (webvttCssStyle.f29333m == 1 ? (char) 2 : (char) 0) | (i11 == 1 ? (char) 1 : (char) 0);
            }
            if (i3 != -1) {
                int i12 = webvttCssStyle.f29332l;
                if (i12 == -1 && webvttCssStyle.f29333m == -1) {
                    i5 = -1;
                    i4 = 1;
                } else {
                    i4 = 1;
                    i5 = (i12 == 1 ? 1 : 0) | (webvttCssStyle.f29333m == 1 ? 2 : 0);
                }
                SpanUtil.m9459a(spannableStringBuilder, new StyleSpan(i5), i, length);
            } else {
                i4 = 1;
            }
            if (webvttCssStyle.f29330j == i4) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i, length, 33);
            }
            if (webvttCssStyle.f29331k == i4) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
            }
            if (webvttCssStyle.f29327g) {
                if (!webvttCssStyle.f29327g) {
                    throw new IllegalStateException("Font color not defined");
                }
                SpanUtil.m9459a(spannableStringBuilder, new ForegroundColorSpan(webvttCssStyle.f29326f), i, length);
            }
            if (webvttCssStyle.f29329i) {
                if (!webvttCssStyle.f29329i) {
                    throw new IllegalStateException("Background color not defined.");
                }
                SpanUtil.m9459a(spannableStringBuilder, new BackgroundColorSpan(webvttCssStyle.f29328h), i, length);
            }
            if (webvttCssStyle.f29325e != null) {
                SpanUtil.m9459a(spannableStringBuilder, new TypefaceSpan(webvttCssStyle.f29325e), i, length);
            }
            int i13 = webvttCssStyle.f29334n;
            if (i13 == 1) {
                SpanUtil.m9459a(spannableStringBuilder, new AbsoluteSizeSpan((int) webvttCssStyle.f29335o, true), i, length);
            } else if (i13 == 2) {
                SpanUtil.m9459a(spannableStringBuilder, new RelativeSizeSpan(webvttCssStyle.f29335o), i, length);
            } else if (i13 == 3) {
                SpanUtil.m9459a(spannableStringBuilder, new RelativeSizeSpan(webvttCssStyle.f29335o / 100.0f), i, length);
            }
            if (webvttCssStyle.f29337q) {
                spannableStringBuilder.setSpan(new HorizontalTextInVerticalContextSpan(), i, length, 33);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList m11032b(List list, String str, StartTag startTag) {
        ?? size;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            WebvttCssStyle webvttCssStyle = (WebvttCssStyle) list.get(i);
            String str2 = startTag.f29348a;
            if (webvttCssStyle.f29321a.isEmpty() && webvttCssStyle.f29322b.isEmpty() && webvttCssStyle.f29323c.isEmpty() && webvttCssStyle.f29324d.isEmpty()) {
                size = TextUtils.isEmpty(str2);
            } else {
                int iM11030a = WebvttCssStyle.m11030a(WebvttCssStyle.m11030a(WebvttCssStyle.m11030a(0, Ints.MAX_POWER_OF_TWO, webvttCssStyle.f29321a, str), 2, webvttCssStyle.f29322b, str2), 4, webvttCssStyle.f29324d, startTag.f29350c);
                if (iM11030a != -1) {
                    size = !startTag.f29351d.containsAll(webvttCssStyle.f29323c) ? 0 : iM11030a + (webvttCssStyle.f29323c.size() * 4);
                }
            }
            if (size > 0) {
                arrayList.add(new StyleMatch(size, webvttCssStyle));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static int m11033c(List list, String str, StartTag startTag) {
        ArrayList arrayListM11032b = m11032b(list, str, startTag);
        for (int i = 0; i < arrayListM11032b.size(); i++) {
            int i2 = ((StyleMatch) arrayListM11032b.get(i)).f29353b.f29336p;
            if (i2 != -1) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public static WebvttCueInfo m11034d(String str, Matcher matcher, ParsableByteArray parsableByteArray, ArrayList arrayList) {
        WebvttCueInfoBuilder webvttCueInfoBuilder = new WebvttCueInfoBuilder();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            webvttCueInfoBuilder.f29354a = WebvttParserUtil.m11040b(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            webvttCueInfoBuilder.f29355b = WebvttParserUtil.m11040b(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            m11035e(strGroup3, webvttCueInfoBuilder);
            StringBuilder sb = new StringBuilder();
            parsableByteArray.getClass();
            String strM9555h = parsableByteArray.m9555h(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(strM9555h)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strM9555h.trim());
                strM9555h = parsableByteArray.m9555h(StandardCharsets.UTF_8);
            }
            webvttCueInfoBuilder.f29356c = m11036f(str, sb.toString(), arrayList);
            return new WebvttCueInfo(webvttCueInfoBuilder.m11038a().m9457a(), webvttCueInfoBuilder.f29354a, webvttCueInfoBuilder.f29355b);
        } catch (IllegalArgumentException unused) {
            Log.m9511g("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: e */
    public static void m11035e(String str, WebvttCueInfoBuilder webvttCueInfoBuilder) {
        int i;
        String strSubstring;
        int i2;
        int i3;
        Matcher matcher = f29342b.matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                if ("line".equals(strGroup)) {
                    m11037g(strGroup2, webvttCueInfoBuilder);
                } else if ("align".equals(strGroup)) {
                    switch (strGroup2) {
                        case "center":
                        case "middle":
                            i = 2;
                            break;
                        case "end":
                            i = 3;
                            break;
                        case "left":
                            i = 4;
                            break;
                        case "right":
                            i = 5;
                            break;
                        case "start":
                            i = 1;
                            break;
                        default:
                            Log.m9511g("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                            i = 2;
                            break;
                    }
                    webvttCueInfoBuilder.f29357d = i;
                } else if ("position".equals(strGroup)) {
                    int iIndexOf = strGroup2.indexOf(44);
                    if (iIndexOf != -1) {
                        strSubstring = strGroup2.substring(iIndexOf + 1);
                        strSubstring.getClass();
                        switch (strSubstring) {
                            case "line-left":
                            case "start":
                                i2 = 0;
                                break;
                            case "center":
                            case "middle":
                                i2 = 1;
                                break;
                            case "line-right":
                            case "end":
                                i2 = 2;
                                break;
                            default:
                                Log.m9511g("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                                i2 = Integer.MIN_VALUE;
                                break;
                        }
                        webvttCueInfoBuilder.f29362i = i2;
                        strGroup2 = strGroup2.substring(0, iIndexOf);
                    }
                    webvttCueInfoBuilder.f29361h = WebvttParserUtil.m11039a(strGroup2);
                } else if ("size".equals(strGroup)) {
                    webvttCueInfoBuilder.f29363j = WebvttParserUtil.m11039a(strGroup2);
                } else if ("vertical".equals(strGroup)) {
                    if (strGroup2.equals("lr")) {
                        i3 = 2;
                    } else if (strGroup2.equals("rl")) {
                        i3 = 1;
                    } else {
                        Log.m9511g("WebvttCueParser", "Invalid 'vertical' value: ".concat(strGroup2));
                        i3 = Integer.MIN_VALUE;
                    }
                    webvttCueInfoBuilder.f29364k = i3;
                } else {
                    Log.m9511g("WebvttCueParser", "Unknown cue setting " + strGroup + ":" + strGroup2);
                }
            } catch (NumberFormatException unused) {
                Log.m9511g("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:69:0x0105. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: f */
    public static SpannedString m11036f(String str, String str2, List list) {
        String strSubstring;
        int i;
        char c2;
        int i2 = 2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (true) {
            String strTrim = "";
            if (i3 >= str2.length()) {
                while (!arrayDeque.isEmpty()) {
                    m11031a(str, (StartTag) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                m11031a(str, new StartTag("", 0, "", Collections.EMPTY_SET), Collections.EMPTY_LIST, spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            char cCharAt = str2.charAt(i3);
            if (cCharAt == '&') {
                i3++;
                int iIndexOf = str2.indexOf(59, i3);
                int iIndexOf2 = str2.indexOf(32, i3);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    strSubstring = str2.substring(i3, iIndexOf);
                    strSubstring.getClass();
                    switch (strSubstring) {
                        case "gt":
                            spannableStringBuilder.append('>');
                            break;
                        case "lt":
                            spannableStringBuilder.append('<');
                            break;
                        case "amp":
                            spannableStringBuilder.append('&');
                            break;
                        case "nbsp":
                            spannableStringBuilder.append(' ');
                            break;
                        default:
                            Log.m9511g("WebvttCueParser", "ignoring unsupported entity: '&" + strSubstring + ";'");
                            break;
                    }
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i3 = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i3++;
            } else {
                int length = i3 + 1;
                if (length < str2.length()) {
                    boolean z2 = str2.charAt(length) == '/';
                    int iIndexOf3 = str2.indexOf(62, length);
                    length = iIndexOf3 == -1 ? str2.length() : iIndexOf3 + 1;
                    int i4 = length - 2;
                    boolean z3 = str2.charAt(i4) == '/';
                    int i5 = i3 + (z2 ? i2 : 1);
                    if (!z3) {
                        i4 = length - 1;
                    }
                    String strSubstring2 = str2.substring(i5, i4);
                    if (!strSubstring2.trim().isEmpty()) {
                        String strTrim2 = strSubstring2.trim();
                        Assertions.m9460a(!strTrim2.isEmpty());
                        int i6 = Util.f25665a;
                        String str3 = strTrim2.split("[ \\.]", i2)[0];
                        str3.getClass();
                        switch (str3.hashCode()) {
                            case 98:
                                i = str3.equals("b") ? 0 : -1;
                                break;
                            case 99:
                                i = str3.equals("c") ? 1 : -1;
                                break;
                            case 105:
                                i = str3.equals("i") ? i2 : -1;
                                break;
                            case 117:
                                i = str3.equals("u") ? 3 : -1;
                                break;
                            case 118:
                                i = str3.equals("v") ? 4 : -1;
                                break;
                            case 3650:
                                i = str3.equals("rt") ? 5 : -1;
                                break;
                            case 3314158:
                                i = str3.equals("lang") ? 6 : -1;
                                break;
                            case 3511770:
                                i = str3.equals("ruby") ? 7 : -1;
                                break;
                            default:
                                i = -1;
                                break;
                        }
                        switch (i) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                if (z2) {
                                    while (!arrayDeque.isEmpty()) {
                                        StartTag startTag = (StartTag) arrayDeque.pop();
                                        m11031a(str, startTag, arrayList, spannableStringBuilder, list);
                                        if (arrayDeque.isEmpty()) {
                                            arrayList.clear();
                                        } else {
                                            arrayList.add(new Element(startTag, spannableStringBuilder.length()));
                                        }
                                        if (startTag.f29348a.equals(str3)) {
                                            break;
                                        }
                                    }
                                } else if (!z3) {
                                    int length2 = spannableStringBuilder.length();
                                    String strTrim3 = strSubstring2.trim();
                                    Assertions.m9460a(!strTrim3.isEmpty());
                                    int iIndexOf4 = strTrim3.indexOf(" ");
                                    if (iIndexOf4 == -1) {
                                        c2 = 0;
                                    } else {
                                        strTrim = strTrim3.substring(iIndexOf4).trim();
                                        c2 = 0;
                                        strTrim3 = strTrim3.substring(0, iIndexOf4);
                                    }
                                    String[] strArrSplit = strTrim3.split("\\.", -1);
                                    String str4 = strArrSplit[c2];
                                    HashSet hashSet = new HashSet();
                                    for (int i7 = 1; i7 < strArrSplit.length; i7++) {
                                        hashSet.add(strArrSplit[i7]);
                                    }
                                    arrayDeque.push(new StartTag(str4, length2, strTrim, hashSet));
                                }
                                break;
                        }
                    }
                    i3 = length;
                }
                i3 = length;
            }
            i2 = 2;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m11037g(String str, WebvttCueInfoBuilder webvttCueInfoBuilder) {
        String strSubstring;
        int i = 2;
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            strSubstring = str.substring(iIndexOf + 1);
            strSubstring.getClass();
            switch (strSubstring) {
                case "center":
                case "middle":
                    i = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i = 0;
                    break;
                default:
                    Log.m9511g("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                    i = Integer.MIN_VALUE;
                    break;
            }
            webvttCueInfoBuilder.f29360g = i;
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            webvttCueInfoBuilder.f29358e = WebvttParserUtil.m11039a(str);
            webvttCueInfoBuilder.f29359f = 0;
        } else {
            webvttCueInfoBuilder.f29358e = Integer.parseInt(str);
            webvttCueInfoBuilder.f29359f = 1;
        }
    }
}
