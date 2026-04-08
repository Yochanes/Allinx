package androidx.media3.extractor.avi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AviMainHeaderChunk implements AviChunk {

    /* JADX INFO: renamed from: a */
    public final int f28344a;

    /* JADX INFO: renamed from: b */
    public final int f28345b;

    /* JADX INFO: renamed from: c */
    public final int f28346c;

    public AviMainHeaderChunk(int i, int i2, int i3) {
        this.f28344a = i;
        this.f28345b = i2;
        this.f28346c = i3;
    }

    @Override // androidx.media3.extractor.avi.AviChunk
    public final int getType() {
        return 1751742049;
    }
}
