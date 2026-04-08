package androidx.camera.video.internal.encoder;

import androidx.annotation.RequiresApi;
import androidx.camera.video.internal.BufferProvider;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public interface Encoder {

    /* JADX INFO: compiled from: Proguard */
    public interface ByteBufferInput extends EncoderInput, BufferProvider<InputBuffer> {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface EncoderInput {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface SurfaceInput extends EncoderInput {

        /* JADX INFO: compiled from: Proguard */
        public interface OnSurfaceUpdateListener {
        }
    }
}
