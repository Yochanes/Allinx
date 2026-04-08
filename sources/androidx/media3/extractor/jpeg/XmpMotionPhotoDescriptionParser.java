package androidx.media3.extractor.jpeg;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.XmlPullParserUtil;
import androidx.media3.extractor.jpeg.MotionPhotoDescription;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class XmpMotionPhotoDescriptionParser {

    /* JADX INFO: renamed from: a */
    public static final String[] f28444a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: b */
    public static final String[] f28445b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: c */
    public static final String[] f28446c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c9, code lost:
    
        return null;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static MotionPhotoDescription m10842a(String str) throws XmlPullParserException, IOException {
        long j;
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!XmlPullParserUtil.m9638c(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw ParserException.m9344a(null, "Couldn't find xmp metadata");
        }
        ImmutableList immutableListM14824of = ImmutableList.m14824of();
        long j2 = -9223372036854775807L;
        loop0: while (true) {
            xmlPullParserNewPullParser.next();
            if (XmlPullParserUtil.m9638c(xmlPullParserNewPullParser, "rdf:Description")) {
                String[] strArr = f28444a;
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i2 >= 4) {
                        break loop0;
                    }
                    String strM9636a = XmlPullParserUtil.m9636a(xmlPullParserNewPullParser, strArr[i2]);
                    if (strM9636a == null) {
                        i2++;
                    } else {
                        if (Integer.parseInt(strM9636a) != 1) {
                            break;
                        }
                        String[] strArr2 = f28445b;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= 4) {
                                break;
                            }
                            String strM9636a2 = XmlPullParserUtil.m9636a(xmlPullParserNewPullParser, strArr2[i3]);
                            if (strM9636a2 != null) {
                                j = Long.parseLong(strM9636a2);
                                if (j == -1) {
                                    break;
                                }
                            } else {
                                i3++;
                            }
                        }
                        j = -9223372036854775807L;
                        String[] strArr3 = f28446c;
                        while (true) {
                            if (i >= 2) {
                                immutableListM14824of = ImmutableList.m14824of();
                                break;
                            }
                            String strM9636a3 = XmlPullParserUtil.m9636a(xmlPullParserNewPullParser, strArr3[i]);
                            if (strM9636a3 != null) {
                                immutableListM14824of = ImmutableList.m14826of(new MotionPhotoDescription.ContainerItem("image/jpeg", 0L, 0L), new MotionPhotoDescription.ContainerItem("video/mp4", Long.parseLong(strM9636a3), 0L));
                                break;
                            }
                            i++;
                        }
                        j2 = j;
                    }
                }
            } else if (XmlPullParserUtil.m9638c(xmlPullParserNewPullParser, "Container:Directory")) {
                immutableListM14824of = m10843b(xmlPullParserNewPullParser, "Container", "Item");
            } else if (XmlPullParserUtil.m9638c(xmlPullParserNewPullParser, "GContainer:Directory")) {
                immutableListM14824of = m10843b(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
            if (XmlPullParserUtil.m9637b(xmlPullParserNewPullParser, "x:xmpmeta")) {
                if (!immutableListM14824of.isEmpty()) {
                    return new MotionPhotoDescription(j2, immutableListM14824of);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static ImmutableList m10843b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        ImmutableList.Builder builder = ImmutableList.builder();
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.m9638c(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strM9636a = XmlPullParserUtil.m9636a(xmlPullParser, strConcat3);
                String strM9636a2 = XmlPullParserUtil.m9636a(xmlPullParser, strConcat4);
                String strM9636a3 = XmlPullParserUtil.m9636a(xmlPullParser, strConcat5);
                String strM9636a4 = XmlPullParserUtil.m9636a(xmlPullParser, strConcat6);
                if (strM9636a == null || strM9636a2 == null) {
                    return ImmutableList.m14824of();
                }
                builder.add(new MotionPhotoDescription.ContainerItem(strM9636a, strM9636a3 != null ? Long.parseLong(strM9636a3) : 0L, strM9636a4 != null ? Long.parseLong(strM9636a4) : 0L));
            }
        } while (!XmlPullParserUtil.m9637b(xmlPullParser, strConcat2));
        return builder.build();
    }
}
