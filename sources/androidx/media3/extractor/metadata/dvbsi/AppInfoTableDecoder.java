package androidx.media3.extractor.metadata.dvbsi;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.metadata.MetadataInputBuffer;
import androidx.media3.extractor.metadata.SimpleMetadataDecoder;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class AppInfoTableDecoder extends SimpleMetadataDecoder {
    @Override // androidx.media3.extractor.metadata.SimpleMetadataDecoder
    /* JADX INFO: renamed from: b */
    public final Metadata mo10845b(MetadataInputBuffer metadataInputBuffer, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            ParsableBitArray parsableBitArray = new ParsableBitArray(byteBuffer.array(), byteBuffer.limit());
            parsableBitArray.m9538o(12);
            int iM9527d = (parsableBitArray.m9527d() + parsableBitArray.m9530g(12)) - 4;
            parsableBitArray.m9538o(44);
            parsableBitArray.m9539p(parsableBitArray.m9530g(12));
            parsableBitArray.m9538o(16);
            ArrayList arrayList = new ArrayList();
            while (parsableBitArray.m9527d() < iM9527d) {
                parsableBitArray.m9538o(48);
                int iM9530g = parsableBitArray.m9530g(8);
                parsableBitArray.m9538o(4);
                int iM9527d2 = parsableBitArray.m9527d() + parsableBitArray.m9530g(12);
                String str = null;
                String str2 = null;
                while (parsableBitArray.m9527d() < iM9527d2) {
                    int iM9530g2 = parsableBitArray.m9530g(8);
                    int iM9530g3 = parsableBitArray.m9530g(8);
                    int iM9527d3 = parsableBitArray.m9527d() + iM9530g3;
                    if (iM9530g2 == 2) {
                        int iM9530g4 = parsableBitArray.m9530g(16);
                        parsableBitArray.m9538o(8);
                        if (iM9530g4 == 3) {
                            while (parsableBitArray.m9527d() < iM9527d3) {
                                int iM9530g5 = parsableBitArray.m9530g(8);
                                Charset charset = StandardCharsets.US_ASCII;
                                byte[] bArr = new byte[iM9530g5];
                                parsableBitArray.m9533j(iM9530g5, bArr);
                                str = new String(bArr, charset);
                                int iM9530g6 = parsableBitArray.m9530g(8);
                                for (int i = 0; i < iM9530g6; i++) {
                                    parsableBitArray.m9539p(parsableBitArray.m9530g(8));
                                }
                            }
                        }
                    } else if (iM9530g2 == 21) {
                        Charset charset2 = StandardCharsets.US_ASCII;
                        byte[] bArr2 = new byte[iM9530g3];
                        parsableBitArray.m9533j(iM9530g3, bArr2);
                        str2 = new String(bArr2, charset2);
                    }
                    parsableBitArray.m9536m(iM9527d3 * 8);
                }
                parsableBitArray.m9536m(iM9527d2 * 8);
                if (str != null && str2 != null) {
                    arrayList.add(new AppInfoTable(iM9530g, str.concat(str2)));
                }
            }
            if (!arrayList.isEmpty()) {
                return new Metadata(arrayList);
            }
        }
        return null;
    }
}
