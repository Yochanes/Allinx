package androidx.media3.extractor.metadata.emsg;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.metadata.MetadataInputBuffer;
import androidx.media3.extractor.metadata.SimpleMetadataDecoder;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class EventMessageDecoder extends SimpleMetadataDecoder {
    @Override // androidx.media3.extractor.metadata.SimpleMetadataDecoder
    /* JADX INFO: renamed from: b */
    public final Metadata mo10845b(MetadataInputBuffer metadataInputBuffer, ByteBuffer byteBuffer) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(byteBuffer.array(), byteBuffer.limit());
        String strM9563p = parsableByteArray.m9563p();
        strM9563p.getClass();
        String strM9563p2 = parsableByteArray.m9563p();
        strM9563p2.getClass();
        return new Metadata(new EventMessage(strM9563p, strM9563p2, parsableByteArray.m9562o(), parsableByteArray.m9562o(), Arrays.copyOfRange(parsableByteArray.f25644a, parsableByteArray.f25645b, parsableByteArray.f25646c)));
    }
}
