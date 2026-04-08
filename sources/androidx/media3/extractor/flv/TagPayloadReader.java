package androidx.media3.extractor.flv;

import androidx.media3.common.ParserException;
import androidx.media3.extractor.TrackOutput;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
abstract class TagPayloadReader {

    /* JADX INFO: renamed from: a */
    public final TrackOutput f28414a;

    /* JADX INFO: compiled from: Proguard */
    public static final class UnsupportedFormatException extends ParserException {
        public UnsupportedFormatException(String str) {
            super(str, null, false, 1);
        }
    }

    public TagPayloadReader(TrackOutput trackOutput) {
        this.f28414a = trackOutput;
    }
}
