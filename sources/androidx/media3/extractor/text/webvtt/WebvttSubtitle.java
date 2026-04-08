package androidx.media3.extractor.text.webvtt;

import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.text.Subtitle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class WebvttSubtitle implements Subtitle {

    /* JADX INFO: renamed from: a */
    public final List f29367a;

    /* JADX INFO: renamed from: b */
    public final long[] f29368b;

    /* JADX INFO: renamed from: c */
    public final long[] f29369c;

    public WebvttSubtitle(ArrayList arrayList) {
        this.f29367a = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f29368b = new long[arrayList.size() * 2];
        for (int i = 0; i < arrayList.size(); i++) {
            WebvttCueInfo webvttCueInfo = (WebvttCueInfo) arrayList.get(i);
            int i2 = i * 2;
            long[] jArr = this.f29368b;
            jArr[i2] = webvttCueInfo.f29339b;
            jArr[i2 + 1] = webvttCueInfo.f29340c;
        }
        long[] jArr2 = this.f29368b;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f29369c = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // androidx.media3.extractor.text.Subtitle
    /* JADX INFO: renamed from: a */
    public final int mo10949a(long j) {
        long[] jArr = this.f29369c;
        int iM9610a = Util.m9610a(jArr, j, false);
        if (iM9610a < jArr.length) {
            return iM9610a;
        }
        return -1;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    /* JADX INFO: renamed from: b */
    public final long mo10950b(int i) {
        Assertions.m9460a(i >= 0);
        long[] jArr = this.f29369c;
        Assertions.m9460a(i < jArr.length);
        return jArr[i];
    }

    @Override // androidx.media3.extractor.text.Subtitle
    /* JADX INFO: renamed from: c */
    public final List mo10951c(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (true) {
            List list = this.f29367a;
            if (i >= list.size()) {
                break;
            }
            int i2 = i * 2;
            long[] jArr = this.f29368b;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                WebvttCueInfo webvttCueInfo = (WebvttCueInfo) list.get(i);
                Cue cue = webvttCueInfo.f29338a;
                if (cue.f25523e == -3.4028235E38f) {
                    arrayList2.add(webvttCueInfo);
                } else {
                    arrayList.add(cue);
                }
            }
            i++;
        }
        Collections.sort(arrayList2, new C1975a(1));
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            Cue.Builder builderM9455a = ((WebvttCueInfo) arrayList2.get(i3)).f29338a.m9455a();
            builderM9455a.f25540e = (-1) - i3;
            builderM9455a.f25541f = 1;
            arrayList.add(builderM9455a.m9457a());
        }
        return arrayList;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    /* JADX INFO: renamed from: d */
    public final int mo10952d() {
        return this.f29369c.length;
    }
}
