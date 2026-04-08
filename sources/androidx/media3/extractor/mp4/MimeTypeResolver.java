package androidx.media3.extractor.mp4;

import androidx.media3.common.MimeTypes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class MimeTypeResolver {
    /* JADX INFO: renamed from: a */
    public static String m10927a(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        boolean z2 = false;
        String str = null;
        while (it.hasNext()) {
            String str2 = ((TrackSampleTable) it.next()).f28902a.f28874g.f25161n;
            if (MimeTypes.m9341l(str2)) {
                return "video/mp4";
            }
            if (MimeTypes.m9338i(str2)) {
                z2 = true;
            } else if (MimeTypes.m9339j(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        return z2 ? "audio/mp4" : str != null ? str : "application/mp4";
    }
}
