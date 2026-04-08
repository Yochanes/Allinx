package androidx.media3.extractor.text.ttml;

import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class TtmlRenderUtil {
    /* JADX INFO: renamed from: a */
    public static TtmlStyle m11020a(TtmlStyle ttmlStyle, String[] strArr, Map map) {
        int i = 0;
        if (ttmlStyle == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (TtmlStyle) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                TtmlStyle ttmlStyle2 = new TtmlStyle();
                int length = strArr.length;
                while (i < length) {
                    ttmlStyle2.m11021a((TtmlStyle) map.get(strArr[i]));
                    i++;
                }
                return ttmlStyle2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                ttmlStyle.m11021a((TtmlStyle) map.get(strArr[0]));
                return ttmlStyle;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    ttmlStyle.m11021a((TtmlStyle) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return ttmlStyle;
    }
}
