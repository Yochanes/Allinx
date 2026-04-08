package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Base64;
import android.util.Xml;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.R;
import androidx.core.provider.FontRequest;
import com.google.firebase.messaging.ServiceStarter;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class FontResourcesParserCompat {

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api21Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface FamilyResourceEntry {
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    public @interface FetchStrategy {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class FontFamilyFilesResourceEntry implements FamilyResourceEntry {

        /* JADX INFO: renamed from: a */
        public final FontFileResourceEntry[] f23157a;

        public FontFamilyFilesResourceEntry(FontFileResourceEntry[] fontFileResourceEntryArr) {
            this.f23157a = fontFileResourceEntryArr;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class FontFileResourceEntry {

        /* JADX INFO: renamed from: a */
        public final String f23158a;

        /* JADX INFO: renamed from: b */
        public final int f23159b;

        /* JADX INFO: renamed from: c */
        public final boolean f23160c;

        /* JADX INFO: renamed from: d */
        public final String f23161d;

        /* JADX INFO: renamed from: e */
        public final int f23162e;

        /* JADX INFO: renamed from: f */
        public final int f23163f;

        public FontFileResourceEntry(int i, int i2, int i3, String str, String str2, boolean z2) {
            this.f23158a = str;
            this.f23159b = i;
            this.f23160c = z2;
            this.f23161d = str2;
            this.f23162e = i2;
            this.f23163f = i3;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ProviderResourceEntry implements FamilyResourceEntry {

        /* JADX INFO: renamed from: a */
        public final FontRequest f23164a;

        /* JADX INFO: renamed from: b */
        public final FontRequest f23165b;

        /* JADX INFO: renamed from: c */
        public final int f23166c;

        /* JADX INFO: renamed from: d */
        public final int f23167d;

        /* JADX INFO: renamed from: e */
        public final String f23168e;

        public ProviderResourceEntry(FontRequest fontRequest, FontRequest fontRequest2, int i, int i2, String str) {
            this.f23164a = fontRequest;
            this.f23165b = fontRequest2;
            this.f23167d = i;
            this.f23166c = i2;
            this.f23168e = str;
        }
    }

    /* JADX INFO: renamed from: a */
    public static FamilyResourceEntry m7537a(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            m7539c(xmlResourceParser);
            return null;
        }
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), R.styleable.f22939b);
        String string = typedArrayObtainAttributes.getString(0);
        String string2 = typedArrayObtainAttributes.getString(5);
        String string3 = typedArrayObtainAttributes.getString(6);
        String string4 = typedArrayObtainAttributes.getString(2);
        int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
        int integer = typedArrayObtainAttributes.getInteger(3, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(4, ServiceStarter.ERROR_UNKNOWN);
        String string5 = typedArrayObtainAttributes.getString(7);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlResourceParser.next() != 3) {
                m7539c(xmlResourceParser);
            }
            List listM7538b = m7538b(resources, resourceId);
            return new ProviderResourceEntry(new FontRequest(string, string2, string3, listM7538b), string4 != null ? new FontRequest(string, string2, string4, listM7538b) : null, integer, integer2, string5);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlResourceParser.next() != 3) {
            if (xmlResourceParser.getEventType() == 2) {
                if (xmlResourceParser.getName().equals("font")) {
                    TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), R.styleable.f22940c);
                    int i = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, CarouselScreenFragment.CAROUSEL_ANIMATION_MS);
                    boolean z2 = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                    int i2 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                    String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                    int i3 = typedArrayObtainAttributes2.getInt(i2, 0);
                    int i4 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                    int resourceId2 = typedArrayObtainAttributes2.getResourceId(i4, 0);
                    String string7 = typedArrayObtainAttributes2.getString(i4);
                    typedArrayObtainAttributes2.recycle();
                    while (xmlResourceParser.next() != 3) {
                        m7539c(xmlResourceParser);
                    }
                    arrayList.add(new FontFileResourceEntry(i, i3, resourceId2, string7, string6, z2));
                } else {
                    m7539c(xmlResourceParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new FontFamilyFilesResourceEntry((FontFileResourceEntry[]) arrayList.toArray(new FontFileResourceEntry[0]));
    }

    /* JADX INFO: renamed from: b */
    public static List m7538b(Resources resources, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m7539c(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }
}
