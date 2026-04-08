package androidx.media3.common.util;

import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class XmlPullParserUtil {
    /* JADX INFO: renamed from: a */
    public static String m9636a(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m9637b(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m9638c(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }
}
