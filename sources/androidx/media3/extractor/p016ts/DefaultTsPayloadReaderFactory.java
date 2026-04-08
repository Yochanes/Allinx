package androidx.media3.extractor.p016ts;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.p016ts.TsPayloadReader;
import com.google.common.primitives.SignedBytes;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class DefaultTsPayloadReaderFactory implements TsPayloadReader.Factory {

    /* JADX INFO: renamed from: a */
    public final List f29438a;

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public DefaultTsPayloadReaderFactory(List list) {
        this.f29438a = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX INFO: renamed from: a */
    public final List m11047a(TsPayloadReader.EsInfo esInfo) {
        String str;
        int i;
        List listSingletonList;
        ParsableByteArray parsableByteArray = new ParsableByteArray(esInfo.f29753d);
        ArrayList arrayList = this.f29438a;
        while (parsableByteArray.m9548a() > 0) {
            int iM9568u = parsableByteArray.m9568u();
            int iM9568u2 = parsableByteArray.f25645b + parsableByteArray.m9568u();
            if (iM9568u == 134) {
                arrayList = new ArrayList();
                int iM9568u3 = parsableByteArray.m9568u() & 31;
                for (int i2 = 0; i2 < iM9568u3; i2++) {
                    String strM9566s = parsableByteArray.m9566s(3, StandardCharsets.UTF_8);
                    int iM9568u4 = parsableByteArray.m9568u();
                    boolean z2 = (iM9568u4 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0;
                    if (z2) {
                        i = iM9568u4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bM9568u = (byte) parsableByteArray.m9568u();
                    parsableByteArray.m9547H(1);
                    if (z2) {
                        boolean z3 = (bM9568u & SignedBytes.MAX_POWER_OF_TWO) != 0;
                        byte[] bArr = CodecSpecificDataUtil.f25580a;
                        listSingletonList = Collections.singletonList(z3 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    Format.Builder builder = new Format.Builder();
                    builder.f25198m = MimeTypes.m9342m(str);
                    builder.f25189d = strM9566s;
                    builder.f25181H = i;
                    builder.f25201p = listSingletonList;
                    arrayList.add(new Format(builder));
                }
            }
            parsableByteArray.m9546G(iM9568u2);
            arrayList = arrayList;
        }
        return arrayList;
    }
}
