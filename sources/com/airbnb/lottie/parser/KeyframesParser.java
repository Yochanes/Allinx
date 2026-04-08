package com.airbnb.lottie.parser;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.animation.keyframe.PathKeyframe;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.value.Keyframe;
import java.util.ArrayList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class KeyframesParser {

    /* JADX INFO: renamed from: a */
    public static final JsonReader.Options f34794a = JsonReader.Options.m12715a("k");

    /* JADX INFO: renamed from: a */
    public static ArrayList m12694a(JsonReader jsonReader, LottieComposition lottieComposition, float f, ValueParser valueParser, boolean z2) {
        JsonReader jsonReader2;
        LottieComposition lottieComposition2;
        float f2;
        ValueParser valueParser2;
        boolean z3;
        ArrayList arrayList = new ArrayList();
        if (jsonReader.mo12714z() == JsonReader.Token.f34831g) {
            lottieComposition.m12554a("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.mo12705b();
        while (jsonReader.mo12708h()) {
            if (jsonReader.mo12700H(f34794a) != 0) {
                jsonReader.mo12702M();
            } else if (jsonReader.mo12714z() == JsonReader.Token.f34826a) {
                jsonReader.mo12704a();
                if (jsonReader.mo12714z() == JsonReader.Token.f34832i) {
                    JsonReader jsonReader3 = jsonReader;
                    LottieComposition lottieComposition3 = lottieComposition;
                    float f3 = f;
                    ValueParser valueParser3 = valueParser;
                    boolean z4 = z2;
                    Keyframe keyframeM12693b = KeyframeParser.m12693b(jsonReader3, lottieComposition3, f3, valueParser3, false, z4);
                    jsonReader2 = jsonReader3;
                    lottieComposition2 = lottieComposition3;
                    f2 = f3;
                    valueParser2 = valueParser3;
                    z3 = z4;
                    arrayList.add(keyframeM12693b);
                } else {
                    jsonReader2 = jsonReader;
                    lottieComposition2 = lottieComposition;
                    f2 = f;
                    valueParser2 = valueParser;
                    z3 = z2;
                    while (jsonReader2.mo12708h()) {
                        arrayList.add(KeyframeParser.m12693b(jsonReader2, lottieComposition2, f2, valueParser2, true, z3));
                    }
                }
                jsonReader2.mo12706d();
                jsonReader = jsonReader2;
                lottieComposition = lottieComposition2;
                f = f2;
                valueParser = valueParser2;
                z2 = z3;
            } else {
                JsonReader jsonReader4 = jsonReader;
                arrayList.add(KeyframeParser.m12693b(jsonReader4, lottieComposition, f, valueParser, false, z2));
                jsonReader = jsonReader4;
            }
        }
        jsonReader.mo12707g();
        m12695b(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static void m12695b(ArrayList arrayList) {
        int i;
        Object obj;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            Keyframe keyframe = (Keyframe) arrayList.get(i2);
            i2++;
            Keyframe keyframe2 = (Keyframe) arrayList.get(i2);
            keyframe.f34891h = Float.valueOf(keyframe2.f34890g);
            if (keyframe.f34886c == null && (obj = keyframe2.f34885b) != null) {
                keyframe.f34886c = obj;
                if (keyframe instanceof PathKeyframe) {
                    ((PathKeyframe) keyframe).m12619d();
                }
            }
        }
        Keyframe keyframe3 = (Keyframe) arrayList.get(i);
        if ((keyframe3.f34885b == null || keyframe3.f34886c == null) && arrayList.size() > 1) {
            arrayList.remove(keyframe3);
        }
    }
}
