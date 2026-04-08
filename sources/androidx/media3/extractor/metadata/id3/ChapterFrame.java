package androidx.media3.extractor.metadata.id3;

import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class ChapterFrame extends Id3Frame {

    /* JADX INFO: renamed from: b */
    public final String f28487b;

    /* JADX INFO: renamed from: c */
    public final int f28488c;

    /* JADX INFO: renamed from: d */
    public final int f28489d;

    /* JADX INFO: renamed from: e */
    public final long f28490e;

    /* JADX INFO: renamed from: f */
    public final long f28491f;

    /* JADX INFO: renamed from: g */
    public final Id3Frame[] f28492g;

    public ChapterFrame(String str, int i, int i2, long j, long j2, Id3Frame[] id3FrameArr) {
        super("CHAP");
        this.f28487b = str;
        this.f28488c = i;
        this.f28489d = i2;
        this.f28490e = j;
        this.f28491f = j2;
        this.f28492g = id3FrameArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ChapterFrame.class == obj.getClass()) {
            ChapterFrame chapterFrame = (ChapterFrame) obj;
            if (this.f28488c == chapterFrame.f28488c && this.f28489d == chapterFrame.f28489d && this.f28490e == chapterFrame.f28490e && this.f28491f == chapterFrame.f28491f && Objects.equals(this.f28487b, chapterFrame.f28487b) && Arrays.equals(this.f28492g, chapterFrame.f28492g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((((((527 + this.f28488c) * 31) + this.f28489d) * 31) + ((int) this.f28490e)) * 31) + ((int) this.f28491f)) * 31;
        String str = this.f28487b;
        return i + (str != null ? str.hashCode() : 0);
    }
}
