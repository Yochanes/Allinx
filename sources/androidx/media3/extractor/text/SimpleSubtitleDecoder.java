package androidx.media3.extractor.text;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.decoder.DecoderOutputBuffer;
import androidx.media3.decoder.SimpleDecoder;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public abstract class SimpleSubtitleDecoder extends SimpleDecoder<SubtitleInputBuffer, SubtitleOutputBuffer, SubtitleDecoderException> implements SubtitleDecoder {

    /* JADX INFO: renamed from: o */
    public final String f28982o;

    /* JADX INFO: renamed from: androidx.media3.extractor.text.SimpleSubtitleDecoder$1 */
    /* JADX INFO: compiled from: Proguard */
    class C19651 extends SubtitleOutputBuffer {
        public C19651() {
        }

        @Override // androidx.media3.decoder.DecoderOutputBuffer
        /* JADX INFO: renamed from: i */
        public final void mo9746i() {
            SimpleSubtitleDecoder.this.m9754m(this);
        }
    }

    public SimpleSubtitleDecoder(String str) {
        super(new SubtitleInputBuffer[2], new SubtitleOutputBuffer[2]);
        this.f28982o = str;
        int i = this.f25950g;
        DecoderInputBuffer[] decoderInputBufferArr = this.f25948e;
        Assertions.m9464e(i == decoderInputBufferArr.length);
        for (DecoderInputBuffer decoderInputBuffer : decoderInputBufferArr) {
            decoderInputBuffer.m9743j(UserMetadata.MAX_ATTRIBUTE_SIZE);
        }
    }

    @Override // androidx.media3.decoder.SimpleDecoder
    /* JADX INFO: renamed from: g */
    public final DecoderInputBuffer mo9748g() {
        return new SubtitleInputBuffer(1);
    }

    @Override // androidx.media3.decoder.Decoder
    public final String getName() {
        return this.f28982o;
    }

    @Override // androidx.media3.decoder.SimpleDecoder
    /* JADX INFO: renamed from: h */
    public final DecoderOutputBuffer mo9749h() {
        return new C19651();
    }

    @Override // androidx.media3.decoder.SimpleDecoder
    /* JADX INFO: renamed from: i */
    public final DecoderException mo9750i(Throwable th) {
        return new SubtitleDecoderException("Unexpected decode error", th);
    }

    @Override // androidx.media3.decoder.SimpleDecoder
    /* JADX INFO: renamed from: j */
    public final DecoderException mo9751j(DecoderInputBuffer decoderInputBuffer, DecoderOutputBuffer decoderOutputBuffer, boolean z2) {
        SubtitleInputBuffer subtitleInputBuffer = (SubtitleInputBuffer) decoderInputBuffer;
        SubtitleOutputBuffer subtitleOutputBuffer = (SubtitleOutputBuffer) decoderOutputBuffer;
        try {
            ByteBuffer byteBuffer = subtitleInputBuffer.f25936d;
            byteBuffer.getClass();
            Subtitle subtitleMo10628n = mo10628n(byteBuffer.array(), byteBuffer.limit(), z2);
            long j = subtitleInputBuffer.f25938g;
            long j2 = subtitleInputBuffer.f28996n;
            subtitleOutputBuffer.f25941b = j;
            subtitleOutputBuffer.f28997f = subtitleMo10628n;
            if (j2 != Long.MAX_VALUE) {
                j = j2;
            }
            subtitleOutputBuffer.f28998g = j;
            subtitleOutputBuffer.f25943d = false;
            return null;
        } catch (SubtitleDecoderException e) {
            return e;
        }
    }

    /* JADX INFO: renamed from: n */
    public abstract Subtitle mo10628n(byte[] bArr, int i, boolean z2);

    @Override // androidx.media3.extractor.text.SubtitleDecoder
    /* JADX INFO: renamed from: d */
    public final void mo10958d(long j) {
    }
}
