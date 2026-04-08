package androidx.media3.extractor.text.ttml;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Pair;
import androidx.media3.common.text.Cue;
import androidx.media3.common.text.HorizontalTextInVerticalContextSpan;
import androidx.media3.common.text.RubySpan;
import androidx.media3.common.text.SpanUtil;
import androidx.media3.common.text.TextEmphasisSpan;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class TtmlNode {

    /* JADX INFO: renamed from: a */
    public final String f29231a;

    /* JADX INFO: renamed from: b */
    public final String f29232b;

    /* JADX INFO: renamed from: c */
    public final boolean f29233c;

    /* JADX INFO: renamed from: d */
    public final long f29234d;

    /* JADX INFO: renamed from: e */
    public final long f29235e;

    /* JADX INFO: renamed from: f */
    public final TtmlStyle f29236f;

    /* JADX INFO: renamed from: g */
    public final String[] f29237g;

    /* JADX INFO: renamed from: h */
    public final String f29238h;

    /* JADX INFO: renamed from: i */
    public final String f29239i;

    /* JADX INFO: renamed from: j */
    public final TtmlNode f29240j;

    /* JADX INFO: renamed from: k */
    public final HashMap f29241k;

    /* JADX INFO: renamed from: l */
    public final HashMap f29242l;

    /* JADX INFO: renamed from: m */
    public ArrayList f29243m;

    public TtmlNode(String str, String str2, long j, long j2, TtmlStyle ttmlStyle, String[] strArr, String str3, String str4, TtmlNode ttmlNode) {
        this.f29231a = str;
        this.f29232b = str2;
        this.f29239i = str4;
        this.f29236f = ttmlStyle;
        this.f29237g = strArr;
        this.f29233c = str2 != null;
        this.f29234d = j;
        this.f29235e = j2;
        str3.getClass();
        this.f29238h = str3;
        this.f29240j = ttmlNode;
        this.f29241k = new HashMap();
        this.f29242l = new HashMap();
    }

    /* JADX INFO: renamed from: a */
    public static TtmlNode m11001a(String str) {
        return new TtmlNode(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    /* JADX INFO: renamed from: e */
    public static SpannableStringBuilder m11002e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            Cue.Builder builder = new Cue.Builder();
            builder.f25536a = new SpannableStringBuilder();
            treeMap.put(str, builder);
        }
        CharSequence charSequence = ((Cue.Builder) treeMap.get(str)).f25536a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    /* JADX INFO: renamed from: b */
    public final TtmlNode m11003b(int i) {
        ArrayList arrayList = this.f29243m;
        if (arrayList != null) {
            return (TtmlNode) arrayList.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX INFO: renamed from: c */
    public final int m11004c() {
        ArrayList arrayList = this.f29243m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* JADX INFO: renamed from: d */
    public final void m11005d(TreeSet treeSet, boolean z2) {
        String str = this.f29231a;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = "div".equals(str);
        if (z2 || zEquals || (zEquals2 && this.f29239i != null)) {
            long j = this.f29234d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.f29235e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.f29243m == null) {
            return;
        }
        for (int i = 0; i < this.f29243m.size(); i++) {
            ((TtmlNode) this.f29243m.get(i)).m11005d(treeSet, z2 || zEquals);
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m11006f(long j) {
        long j2 = this.f29234d;
        long j3 = this.f29235e;
        if (j2 == -9223372036854775807L && j3 == -9223372036854775807L) {
            return true;
        }
        if (j2 <= j && j3 == -9223372036854775807L) {
            return true;
        }
        if (j2 != -9223372036854775807L || j >= j3) {
            return j2 <= j && j < j3;
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m11007g(long j, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f29238h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (m11006f(j) && "div".equals(this.f29231a) && (str2 = this.f29239i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < m11004c(); i++) {
            m11003b(i).m11007g(j, str, arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02d4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b9  */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m11008h(long j, Map map, HashMap map2, String str, TreeMap treeMap) {
        Iterator it;
        int i;
        int i2;
        TtmlNode ttmlNode;
        int i3;
        int i4;
        TtmlStyle ttmlStyleM11020a;
        int i5;
        float f;
        int i6;
        int i7;
        Map map3 = map;
        int i8 = -1;
        int i9 = 1;
        if (m11006f(j)) {
            String str2 = this.f29238h;
            String str3 = "".equals(str2) ? str : str2;
            Iterator it2 = this.f29242l.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str4 = (String) entry.getKey();
                HashMap map4 = this.f29241k;
                int iIntValue = map4.containsKey(str4) ? ((Integer) map4.get(str4)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    Cue.Builder builder = (Cue.Builder) treeMap.get(str4);
                    builder.getClass();
                    TtmlRegion ttmlRegion = (TtmlRegion) map2.get(str3);
                    ttmlRegion.getClass();
                    TtmlStyle ttmlStyleM11020a2 = TtmlRenderUtil.m11020a(this.f29236f, this.f29237g, map3);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) builder.f25536a;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        builder.f25536a = spannableStringBuilder;
                    }
                    if (ttmlStyleM11020a2 != null) {
                        int i10 = ttmlStyleM11020a2.f29275h;
                        if (((i10 == i8 && ttmlStyleM11020a2.f29276i == i8) ? i8 : (i10 == i9 ? i9 : 0) | (ttmlStyleM11020a2.f29276i == i9 ? 2 : 0)) != i8) {
                            int i11 = ttmlStyleM11020a2.f29275h;
                            if (i11 != i8) {
                                i7 = (i11 != i9 ? i9 : 0) | (ttmlStyleM11020a2.f29276i != i9 ? 2 : 0);
                                StyleSpan styleSpan = new StyleSpan(i7);
                                i = 33;
                                spannableStringBuilder.setSpan(styleSpan, iIntValue, iIntValue2, 33);
                            } else if (ttmlStyleM11020a2.f29276i == i8) {
                                i7 = i8;
                                i9 = 1;
                                StyleSpan styleSpan2 = new StyleSpan(i7);
                                i = 33;
                                spannableStringBuilder.setSpan(styleSpan2, iIntValue, iIntValue2, 33);
                            } else {
                                i9 = 1;
                                i7 = (i11 != i9 ? i9 : 0) | (ttmlStyleM11020a2.f29276i != i9 ? 2 : 0);
                                StyleSpan styleSpan22 = new StyleSpan(i7);
                                i = 33;
                                spannableStringBuilder.setSpan(styleSpan22, iIntValue, iIntValue2, 33);
                            }
                        } else {
                            i = 33;
                        }
                        if (ttmlStyleM11020a2.f29273f == i9) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, iIntValue2, i);
                        }
                        if (ttmlStyleM11020a2.f29274g == i9) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), iIntValue, iIntValue2, i);
                        }
                        if (ttmlStyleM11020a2.f29270c) {
                            if (!ttmlStyleM11020a2.f29270c) {
                                throw new IllegalStateException("Font color has not been defined.");
                            }
                            SpanUtil.m9459a(spannableStringBuilder, new ForegroundColorSpan(ttmlStyleM11020a2.f29269b), iIntValue, iIntValue2);
                        }
                        if (ttmlStyleM11020a2.f29272e) {
                            if (!ttmlStyleM11020a2.f29272e) {
                                throw new IllegalStateException("Background color has not been defined.");
                            }
                            SpanUtil.m9459a(spannableStringBuilder, new BackgroundColorSpan(ttmlStyleM11020a2.f29271d), iIntValue, iIntValue2);
                        }
                        if (ttmlStyleM11020a2.f29268a != null) {
                            SpanUtil.m9459a(spannableStringBuilder, new TypefaceSpan(ttmlStyleM11020a2.f29268a), iIntValue, iIntValue2);
                        }
                        TextEmphasis textEmphasis = ttmlStyleM11020a2.f29285r;
                        if (textEmphasis != null) {
                            int i12 = textEmphasis.f29228a;
                            if (i12 == i8) {
                                int i13 = ttmlRegion.f29267j;
                                i12 = (i13 == 2 || i13 == 1) ? 3 : 1;
                                i6 = 1;
                            } else {
                                i6 = textEmphasis.f29229b;
                            }
                            i2 = i8;
                            int i14 = textEmphasis.f29230c;
                            if (i14 == -2) {
                                i14 = 1;
                            }
                            SpanUtil.m9459a(spannableStringBuilder, new TextEmphasisSpan(i12, i6, i14), iIntValue, iIntValue2);
                        } else {
                            i2 = i8;
                        }
                        int i15 = ttmlStyleM11020a2.f29280m;
                        if (i15 == 2) {
                            TtmlNode ttmlNode2 = this.f29240j;
                            while (true) {
                                if (ttmlNode2 == null) {
                                    ttmlNode2 = null;
                                    break;
                                }
                                TtmlStyle ttmlStyleM11020a3 = TtmlRenderUtil.m11020a(ttmlNode2.f29236f, ttmlNode2.f29237g, map3);
                                if (ttmlStyleM11020a3 != null && ttmlStyleM11020a3.f29280m == 1) {
                                    break;
                                } else {
                                    ttmlNode2 = ttmlNode2.f29240j;
                                }
                            }
                            if (ttmlNode2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(ttmlNode2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        ttmlNode = null;
                                        break;
                                    }
                                    TtmlNode ttmlNode3 = (TtmlNode) arrayDeque.pop();
                                    TtmlStyle ttmlStyleM11020a4 = TtmlRenderUtil.m11020a(ttmlNode3.f29236f, ttmlNode3.f29237g, map3);
                                    if (ttmlStyleM11020a4 != null && ttmlStyleM11020a4.f29280m == 3) {
                                        ttmlNode = ttmlNode3;
                                        break;
                                    }
                                    for (int iM11004c = ttmlNode3.m11004c() - 1; iM11004c >= 0; iM11004c--) {
                                        arrayDeque.push(ttmlNode3.m11003b(iM11004c));
                                    }
                                }
                                if (ttmlNode != null) {
                                    if (ttmlNode.m11004c() != 1 || ttmlNode.m11003b(0).f29232b == null) {
                                        Log.m9510f("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                    } else {
                                        String str5 = ttmlNode.m11003b(0).f29232b;
                                        int i16 = Util.f25665a;
                                        TtmlStyle ttmlStyleM11020a5 = TtmlRenderUtil.m11020a(ttmlNode.f29236f, ttmlNode.f29237g, map3);
                                        if (ttmlStyleM11020a5 != null) {
                                            i3 = ttmlStyleM11020a5.f29281n;
                                            i4 = i2;
                                        } else {
                                            i3 = i2;
                                            i4 = i3;
                                        }
                                        if (i3 == i4 && (ttmlStyleM11020a = TtmlRenderUtil.m11020a(ttmlNode2.f29236f, ttmlNode2.f29237g, map3)) != null) {
                                            i3 = ttmlStyleM11020a.f29281n;
                                        }
                                        spannableStringBuilder.setSpan(new RubySpan(str5, i3), iIntValue, iIntValue2, 33);
                                    }
                                }
                                if (ttmlStyleM11020a2.f29284q == 1) {
                                    SpanUtil.m9459a(spannableStringBuilder, new HorizontalTextInVerticalContextSpan(), iIntValue, iIntValue2);
                                }
                                i5 = ttmlStyleM11020a2.f29277j;
                                if (i5 != 1) {
                                    it = it2;
                                    f = 100.0f;
                                    SpanUtil.m9459a(spannableStringBuilder, new AbsoluteSizeSpan((int) ttmlStyleM11020a2.f29278k, true), iIntValue, iIntValue2);
                                } else if (i5 == 2) {
                                    it = it2;
                                    f = 100.0f;
                                    SpanUtil.m9459a(spannableStringBuilder, new RelativeSizeSpan(ttmlStyleM11020a2.f29278k), iIntValue, iIntValue2);
                                } else if (i5 != 3) {
                                    it = it2;
                                    f = 100.0f;
                                } else {
                                    float sizeChange = ttmlStyleM11020a2.f29278k / 100.0f;
                                    RelativeSizeSpan[] relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(iIntValue, iIntValue2, RelativeSizeSpan.class);
                                    int length = relativeSizeSpanArr.length;
                                    f = 100.0f;
                                    int i17 = 0;
                                    while (i17 < length) {
                                        RelativeSizeSpan relativeSizeSpan = relativeSizeSpanArr[i17];
                                        Iterator it3 = it2;
                                        if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= iIntValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) >= iIntValue2) {
                                            sizeChange = relativeSizeSpan.getSizeChange() * sizeChange;
                                        }
                                        if (spannableStringBuilder.getSpanStart(relativeSizeSpan) == iIntValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) == iIntValue2) {
                                            if (spannableStringBuilder.getSpanFlags(relativeSizeSpan) == 33) {
                                                spannableStringBuilder.removeSpan(relativeSizeSpan);
                                            }
                                        }
                                        i17++;
                                        it2 = it3;
                                    }
                                    it = it2;
                                    spannableStringBuilder.setSpan(new RelativeSizeSpan(sizeChange), iIntValue, iIntValue2, 33);
                                }
                                if (!"p".equals(this.f29231a)) {
                                    float f2 = ttmlStyleM11020a2.f29286s;
                                    if (f2 != Float.MAX_VALUE) {
                                        builder.f25552q = (f2 * (-90.0f)) / f;
                                    }
                                    Layout.Alignment alignment = ttmlStyleM11020a2.f29282o;
                                    if (alignment != null) {
                                        builder.f25538c = alignment;
                                    }
                                    Layout.Alignment alignment2 = ttmlStyleM11020a2.f29283p;
                                    if (alignment2 != null) {
                                        builder.f25539d = alignment2;
                                    }
                                }
                            }
                        } else if (i15 == 3 || i15 == 4) {
                            spannableStringBuilder.setSpan(new DeleteTextSpan(), iIntValue, iIntValue2, 33);
                        }
                        if (ttmlStyleM11020a2.f29284q == 1) {
                        }
                        i5 = ttmlStyleM11020a2.f29277j;
                        if (i5 != 1) {
                        }
                        if (!"p".equals(this.f29231a)) {
                        }
                    }
                    map3 = map;
                    it2 = it;
                    i8 = -1;
                    i9 = 1;
                }
                it = it2;
                map3 = map;
                it2 = it;
                i8 = -1;
                i9 = 1;
            }
            for (int i18 = 0; i18 < m11004c(); i18++) {
                m11003b(i18).m11008h(j, map, map2, str3, treeMap);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m11009i(long j, boolean z2, String str, TreeMap treeMap) {
        boolean z3;
        TreeMap treeMap2;
        long j2;
        HashMap map = this.f29241k;
        map.clear();
        HashMap map2 = this.f29242l;
        map2.clear();
        String str2 = this.f29231a;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.f29238h;
        String str4 = "".equals(str3) ? str : str3;
        if (this.f29233c && z2) {
            SpannableStringBuilder spannableStringBuilderM11002e = m11002e(str4, treeMap);
            String str5 = this.f29232b;
            str5.getClass();
            spannableStringBuilderM11002e.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z2) {
            m11002e(str4, treeMap).append('\n');
            return;
        }
        if (m11006f(j)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((Cue.Builder) entry.getValue()).f25536a;
                charSequence.getClass();
                map.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i = 0; i < m11004c(); i++) {
                TtmlNode ttmlNodeM11003b = m11003b(i);
                if (z2 || zEquals) {
                    z3 = true;
                    treeMap2 = treeMap;
                    j2 = j;
                } else {
                    z3 = false;
                    j2 = j;
                    treeMap2 = treeMap;
                }
                ttmlNodeM11003b.m11009i(j2, z3, str4, treeMap2);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderM11002e2 = m11002e(str4, treeMap);
                int length = spannableStringBuilderM11002e2.length() - 1;
                while (length >= 0 && spannableStringBuilderM11002e2.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && spannableStringBuilderM11002e2.charAt(length) != '\n') {
                    spannableStringBuilderM11002e2.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((Cue.Builder) entry2.getValue()).f25536a;
                charSequence2.getClass();
                map2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
