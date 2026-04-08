package androidx.media3.extractor.flv;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.TrackOutput;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class VideoTagPayloadReader extends TagPayloadReader {

    /* JADX INFO: renamed from: b */
    public final ParsableByteArray f28415b;

    /* JADX INFO: renamed from: c */
    public final ParsableByteArray f28416c;

    /* JADX INFO: renamed from: d */
    public int f28417d;

    /* JADX INFO: renamed from: e */
    public boolean f28418e;

    /* JADX INFO: renamed from: f */
    public boolean f28419f;

    /* JADX INFO: renamed from: g */
    public int f28420g;

    public VideoTagPayloadReader(TrackOutput trackOutput) {
        super(trackOutput);
        this.f28415b = new ParsableByteArray(NalUnitUtil.f25700a);
        this.f28416c = new ParsableByteArray(4);
    }
}
