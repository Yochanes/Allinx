package androidx.media3.extractor.metadata.icy;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.metadata.MetadataInputBuffer;
import androidx.media3.extractor.metadata.SimpleMetadataDecoder;
import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class IcyDecoder extends SimpleMetadataDecoder {

    /* JADX INFO: renamed from: c */
    public static final Pattern f28470c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* JADX INFO: renamed from: a */
    public final CharsetDecoder f28471a = StandardCharsets.UTF_8.newDecoder();

    /* JADX INFO: renamed from: b */
    public final CharsetDecoder f28472b = StandardCharsets.ISO_8859_1.newDecoder();

    @Override // androidx.media3.extractor.metadata.SimpleMetadataDecoder
    /* JADX INFO: renamed from: b */
    public final Metadata mo10845b(MetadataInputBuffer metadataInputBuffer, ByteBuffer byteBuffer) {
        String string;
        CharsetDecoder charsetDecoder = this.f28472b;
        CharsetDecoder charsetDecoder2 = this.f28471a;
        String str = null;
        try {
            string = charsetDecoder2.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String string2 = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = string2;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = null;
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            charsetDecoder2.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (string == null) {
            return new Metadata(new IcyInfo(bArr, null, null));
        }
        Matcher matcher = f28470c.matcher(string);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String lowerCase = Ascii.toLowerCase(strGroup);
                lowerCase.getClass();
                if (lowerCase.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (lowerCase.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new Metadata(new IcyInfo(bArr, str, str2));
    }
}
