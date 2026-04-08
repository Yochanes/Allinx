package androidx.media3.exoplayer.image;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.Decoder;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.image.BitmapFactoryImageDecoder;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface ImageDecoder extends Decoder<DecoderInputBuffer, ImageOutputBuffer, ImageDecoderException> {

    /* JADX INFO: compiled from: Proguard */
    public interface Factory {

        /* JADX INFO: renamed from: a */
        public static final BitmapFactoryImageDecoder.Factory f26865a = new BitmapFactoryImageDecoder.Factory();
    }

    @Override // androidx.media3.decoder.Decoder
    /* JADX INFO: renamed from: a */
    ImageOutputBuffer mo9737a();

    @Override // androidx.media3.decoder.Decoder
    /* JADX INFO: renamed from: a */
    /* bridge */ /* synthetic */ default Object mo9737a() {
        return mo9737a();
    }

    @Override // androidx.media3.decoder.Decoder
    /* JADX INFO: renamed from: b */
    /* bridge */ /* synthetic */ default void mo9738b(Object obj) {
        mo10337f((DecoderInputBuffer) obj);
    }

    /* JADX INFO: renamed from: f */
    void mo10337f(DecoderInputBuffer decoderInputBuffer);
}
