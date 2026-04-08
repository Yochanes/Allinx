package androidx.media3.extractor.metadata.id3;

import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class ChapterTocFrame extends Id3Frame {

    /* JADX INFO: renamed from: b */
    public final String f28493b;

    /* JADX INFO: renamed from: c */
    public final boolean f28494c;

    /* JADX INFO: renamed from: d */
    public final boolean f28495d;

    /* JADX INFO: renamed from: e */
    public final String[] f28496e;

    /* JADX INFO: renamed from: f */
    public final Id3Frame[] f28497f;

    public ChapterTocFrame(String str, boolean z2, boolean z3, String[] strArr, Id3Frame[] id3FrameArr) {
        super("CTOC");
        this.f28493b = str;
        this.f28494c = z2;
        this.f28495d = z3;
        this.f28496e = strArr;
        this.f28497f = id3FrameArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ChapterTocFrame.class == obj.getClass()) {
            ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
            if (this.f28494c == chapterTocFrame.f28494c && this.f28495d == chapterTocFrame.f28495d && Objects.equals(this.f28493b, chapterTocFrame.f28493b) && Arrays.equals(this.f28496e, chapterTocFrame.f28496e) && Arrays.equals(this.f28497f, chapterTocFrame.f28497f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((527 + (this.f28494c ? 1 : 0)) * 31) + (this.f28495d ? 1 : 0)) * 31;
        String str = this.f28493b;
        return i + (str != null ? str.hashCode() : 0);
    }
}
