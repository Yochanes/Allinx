package androidx.media3.extractor.metadata;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public abstract class SimpleMetadataDecoder implements MetadataDecoder {
    @Override // androidx.media3.extractor.metadata.MetadataDecoder
    /* JADX INFO: renamed from: a */
    public final Metadata mo10844a(MetadataInputBuffer metadataInputBuffer) {
        ByteBuffer byteBuffer = metadataInputBuffer.f25936d;
        byteBuffer.getClass();
        Assertions.m9460a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return mo10845b(metadataInputBuffer, byteBuffer);
    }

    /* JADX INFO: renamed from: b */
    public abstract Metadata mo10845b(MetadataInputBuffer metadataInputBuffer, ByteBuffer byteBuffer);
}
