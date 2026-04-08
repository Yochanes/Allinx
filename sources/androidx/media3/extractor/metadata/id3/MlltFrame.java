package androidx.media3.extractor.metadata.id3;

import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class MlltFrame extends Id3Frame {

    /* JADX INFO: renamed from: b */
    public final int f28515b;

    /* JADX INFO: renamed from: c */
    public final int f28516c;

    /* JADX INFO: renamed from: d */
    public final int f28517d;

    /* JADX INFO: renamed from: e */
    public final int[] f28518e;

    /* JADX INFO: renamed from: f */
    public final int[] f28519f;

    public MlltFrame(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        super("MLLT");
        this.f28515b = i;
        this.f28516c = i2;
        this.f28517d = i3;
        this.f28518e = iArr;
        this.f28519f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && MlltFrame.class == obj.getClass()) {
            MlltFrame mlltFrame = (MlltFrame) obj;
            if (this.f28515b == mlltFrame.f28515b && this.f28516c == mlltFrame.f28516c && this.f28517d == mlltFrame.f28517d && Arrays.equals(this.f28518e, mlltFrame.f28518e) && Arrays.equals(this.f28519f, mlltFrame.f28519f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f28519f) + ((Arrays.hashCode(this.f28518e) + ((((((527 + this.f28515b) * 31) + this.f28516c) * 31) + this.f28517d) * 31)) * 31);
    }
}
