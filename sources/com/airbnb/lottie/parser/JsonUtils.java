package com.airbnb.lottie.parser;

import android.graphics.Color;
import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.util.ArrayList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class JsonUtils {

    /* JADX INFO: renamed from: a */
    public static final JsonReader.Options f34789a = JsonReader.Options.m12715a("x", "y");

    /* JADX INFO: renamed from: com.airbnb.lottie.parser.JsonUtils$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C24241 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f34790a;

        static {
            int[] iArr = new int[JsonReader.Token.values().length];
            f34790a = iArr;
            try {
                iArr[6] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34790a[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34790a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m12688a(JsonReader jsonReader) {
        jsonReader.mo12704a();
        int iMo12710j = (int) (jsonReader.mo12710j() * 255.0d);
        int iMo12710j2 = (int) (jsonReader.mo12710j() * 255.0d);
        int iMo12710j3 = (int) (jsonReader.mo12710j() * 255.0d);
        while (jsonReader.mo12708h()) {
            jsonReader.mo12702M();
        }
        jsonReader.mo12706d();
        return Color.argb(255, iMo12710j, iMo12710j2, iMo12710j3);
    }

    /* JADX INFO: renamed from: b */
    public static PointF m12689b(JsonReader jsonReader, float f) {
        int iOrdinal = jsonReader.mo12714z().ordinal();
        if (iOrdinal == 0) {
            jsonReader.mo12704a();
            float fMo12710j = (float) jsonReader.mo12710j();
            float fMo12710j2 = (float) jsonReader.mo12710j();
            while (jsonReader.mo12714z() != JsonReader.Token.f34827b) {
                jsonReader.mo12702M();
            }
            jsonReader.mo12706d();
            return new PointF(fMo12710j * f, fMo12710j2 * f);
        }
        if (iOrdinal != 2) {
            if (iOrdinal != 6) {
                throw new IllegalArgumentException("Unknown point starts with " + jsonReader.mo12714z());
            }
            float fMo12710j3 = (float) jsonReader.mo12710j();
            float fMo12710j4 = (float) jsonReader.mo12710j();
            while (jsonReader.mo12708h()) {
                jsonReader.mo12702M();
            }
            return new PointF(fMo12710j3 * f, fMo12710j4 * f);
        }
        jsonReader.mo12705b();
        float fM12691d = 0.0f;
        float fM12691d2 = 0.0f;
        while (jsonReader.mo12708h()) {
            int iMo12700H = jsonReader.mo12700H(f34789a);
            if (iMo12700H == 0) {
                fM12691d = m12691d(jsonReader);
            } else if (iMo12700H != 1) {
                jsonReader.mo12701L();
                jsonReader.mo12702M();
            } else {
                fM12691d2 = m12691d(jsonReader);
            }
        }
        jsonReader.mo12707g();
        return new PointF(fM12691d * f, fM12691d2 * f);
    }

    /* JADX INFO: renamed from: c */
    public static ArrayList m12690c(JsonReader jsonReader, float f) {
        ArrayList arrayList = new ArrayList();
        jsonReader.mo12704a();
        while (jsonReader.mo12714z() == JsonReader.Token.f34826a) {
            jsonReader.mo12704a();
            arrayList.add(m12689b(jsonReader, f));
            jsonReader.mo12706d();
        }
        jsonReader.mo12706d();
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public static float m12691d(JsonReader jsonReader) {
        JsonReader.Token tokenMo12714z = jsonReader.mo12714z();
        int iOrdinal = tokenMo12714z.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 6) {
                return (float) jsonReader.mo12710j();
            }
            throw new IllegalArgumentException("Unknown value for token of type " + tokenMo12714z);
        }
        jsonReader.mo12704a();
        float fMo12710j = (float) jsonReader.mo12710j();
        while (jsonReader.mo12708h()) {
            jsonReader.mo12702M();
        }
        jsonReader.mo12706d();
        return fMo12710j;
    }
}
