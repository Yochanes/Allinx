package androidx.media3.exoplayer.image;

import androidx.annotation.VisibleForTesting;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.decoder.DecoderOutputBuffer;
import androidx.media3.decoder.SimpleDecoder;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.analytics.C1795m;
import androidx.media3.exoplayer.image.ImageDecoder;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class BitmapFactoryImageDecoder extends SimpleDecoder<DecoderInputBuffer, ImageOutputBuffer, ImageDecoderException> implements ImageDecoder {

    /* JADX INFO: renamed from: o */
    public final C1795m f26860o;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.image.BitmapFactoryImageDecoder$1 */
    /* JADX INFO: compiled from: Proguard */
    class C18301 extends ImageOutputBuffer {
        public C18301() {
        }

        @Override // androidx.media3.exoplayer.image.ImageOutputBuffer, androidx.media3.decoder.DecoderOutputBuffer
        /* JADX INFO: renamed from: i */
        public final void mo9746i() {
            BitmapFactoryImageDecoder.this.m9754m(this);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @VisibleForTesting
    public interface BitmapDecoder {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Factory implements ImageDecoder.Factory {

        /* JADX INFO: renamed from: b */
        public final C1795m f26862b = new C1795m(4);

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0073, code lost:
        
            if (r2 >= 26) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0078, code lost:
        
            if (r2 >= 34) goto L45;
         */
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int m10336a(Format format) {
            String str = format.f25161n;
            if (str == null || !MimeTypes.m9339j(str)) {
                return RendererCapabilities.m10033n(0, 0, 0, 0);
            }
            int i = Util.f25665a;
            String str2 = format.f25161n;
            str2.getClass();
            int i2 = Util.f25665a;
            switch (str2) {
                case "image/jpeg":
                case "image/webp":
                case "image/bmp":
                case "image/png":
                    return RendererCapabilities.m10033n(4, 0, 0, 0);
            }
            return RendererCapabilities.m10033n(1, 0, 0, 0);
        }
    }

    public BitmapFactoryImageDecoder(C1795m c1795m) {
        super(new DecoderInputBuffer[1], new ImageOutputBuffer[1]);
        this.f26860o = c1795m;
    }

    @Override // androidx.media3.decoder.SimpleDecoder
    /* JADX INFO: renamed from: g */
    public final DecoderInputBuffer mo9748g() {
        return new DecoderInputBuffer(1);
    }

    @Override // androidx.media3.decoder.Decoder
    public final String getName() {
        return "BitmapFactoryImageDecoder";
    }

    @Override // androidx.media3.decoder.SimpleDecoder
    /* JADX INFO: renamed from: h */
    public final DecoderOutputBuffer mo9749h() {
        return new C18301();
    }

    @Override // androidx.media3.decoder.SimpleDecoder
    /* JADX INFO: renamed from: i */
    public final DecoderException mo9750i(Throwable th) {
        return new ImageDecoderException("Unexpected decode error", th);
    }

    @Override // androidx.media3.decoder.SimpleDecoder
    /* JADX INFO: renamed from: j */
    public final DecoderException mo9751j(DecoderInputBuffer decoderInputBuffer, DecoderOutputBuffer decoderOutputBuffer, boolean z2) {
        ImageOutputBuffer imageOutputBuffer = (ImageOutputBuffer) decoderOutputBuffer;
        try {
            ByteBuffer byteBuffer = decoderInputBuffer.f25936d;
            byteBuffer.getClass();
            Assertions.m9464e(byteBuffer.hasArray());
            Assertions.m9460a(byteBuffer.arrayOffset() == 0);
            imageOutputBuffer.f26867f = this.f26860o.m10149f(byteBuffer.remaining(), byteBuffer.array());
            imageOutputBuffer.f25941b = decoderInputBuffer.f25938g;
            return null;
        } catch (ImageDecoderException e) {
            return e;
        }
    }
}
