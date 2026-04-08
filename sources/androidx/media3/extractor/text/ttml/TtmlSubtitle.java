package androidx.media3.extractor.text.ttml;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.text.Subtitle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class TtmlSubtitle implements Subtitle {

    /* JADX INFO: renamed from: a */
    public final TtmlNode f29289a;

    /* JADX INFO: renamed from: b */
    public final long[] f29290b;

    /* JADX INFO: renamed from: c */
    public final Map f29291c;

    /* JADX INFO: renamed from: d */
    public final HashMap f29292d;

    /* JADX INFO: renamed from: f */
    public final HashMap f29293f;

    public TtmlSubtitle(TtmlNode ttmlNode, HashMap map, HashMap map2, HashMap map3) {
        this.f29289a = ttmlNode;
        this.f29292d = map2;
        this.f29293f = map3;
        this.f29291c = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        ttmlNode.m11005d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.f29290b = jArr;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    /* JADX INFO: renamed from: a */
    public final int mo10949a(long j) {
        long[] jArr = this.f29290b;
        int iM9610a = Util.m9610a(jArr, j, false);
        if (iM9610a < jArr.length) {
            return iM9610a;
        }
        return -1;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    /* JADX INFO: renamed from: b */
    public final long mo10950b(int i) {
        return this.f29290b[i];
    }

    @Override // androidx.media3.extractor.text.Subtitle
    /* JADX INFO: renamed from: c */
    public final List mo10951c(long j) {
        TtmlNode ttmlNode = this.f29289a;
        ArrayList<Pair> arrayList = new ArrayList();
        ttmlNode.m11007g(j, ttmlNode.f29238h, arrayList);
        TreeMap treeMap = new TreeMap();
        ttmlNode.m11009i(j, false, ttmlNode.f29238h, treeMap);
        HashMap map = this.f29292d;
        ttmlNode.m11008h(j, this.f29291c, map, ttmlNode.f29238h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = (String) this.f29293f.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                TtmlRegion ttmlRegion = (TtmlRegion) map.get(pair.first);
                ttmlRegion.getClass();
                Cue.Builder builder = new Cue.Builder();
                builder.f25537b = bitmapDecodeByteArray;
                builder.f25543h = ttmlRegion.f29259b;
                builder.f25544i = 0;
                builder.f25540e = ttmlRegion.f29260c;
                builder.f25541f = 0;
                builder.f25542g = ttmlRegion.f29262e;
                builder.f25547l = ttmlRegion.f29263f;
                builder.f25548m = ttmlRegion.f29264g;
                builder.f25551p = ttmlRegion.f29267j;
                arrayList2.add(builder.m9457a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            TtmlRegion ttmlRegion2 = (TtmlRegion) map.get(entry.getKey());
            ttmlRegion2.getClass();
            Cue.Builder builder2 = (Cue.Builder) entry.getValue();
            CharSequence charSequence = builder2.f25536a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (DeleteTextSpan deleteTextSpan : (DeleteTextSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), DeleteTextSpan.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(deleteTextSpan), spannableStringBuilder.getSpanEnd(deleteTextSpan), (CharSequence) "");
            }
            for (int i = 0; i < spannableStringBuilder.length(); i++) {
                if (spannableStringBuilder.charAt(i) == ' ') {
                    int i2 = i + 1;
                    int i3 = i2;
                    while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                        i3++;
                    }
                    int i4 = i3 - i2;
                    if (i4 > 0) {
                        spannableStringBuilder.delete(i, i4 + i);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
                if (spannableStringBuilder.charAt(i5) == '\n') {
                    int i6 = i5 + 1;
                    if (spannableStringBuilder.charAt(i6) == ' ') {
                        spannableStringBuilder.delete(i6, i5 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    int i8 = i7 + 1;
                    if (spannableStringBuilder.charAt(i8) == '\n') {
                        spannableStringBuilder.delete(i7, i8);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            builder2.f25540e = ttmlRegion2.f29260c;
            builder2.f25541f = ttmlRegion2.f29261d;
            builder2.f25542g = ttmlRegion2.f29262e;
            builder2.f25543h = ttmlRegion2.f29259b;
            builder2.f25547l = ttmlRegion2.f29263f;
            builder2.f25546k = ttmlRegion2.f29266i;
            builder2.f25545j = ttmlRegion2.f29265h;
            builder2.f25551p = ttmlRegion2.f29267j;
            arrayList2.add(builder2.m9457a());
        }
        return arrayList2;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    /* JADX INFO: renamed from: d */
    public final int mo10952d() {
        return this.f29290b.length;
    }
}
