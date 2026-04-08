package com.airbnb.lottie.parser;

import android.graphics.Color;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ColorParser implements ValueParser<Integer> {

    /* JADX INFO: renamed from: a */
    public static final ColorParser f34762a = new ColorParser();

    @Override // com.airbnb.lottie.parser.ValueParser
    /* JADX INFO: renamed from: a */
    public final Object mo12686a(JsonReader jsonReader, float f) {
        boolean z2 = jsonReader.mo12714z() == JsonReader.Token.f34826a;
        if (z2) {
            jsonReader.mo12704a();
        }
        double dMo12710j = jsonReader.mo12710j();
        double dMo12710j2 = jsonReader.mo12710j();
        double dMo12710j3 = jsonReader.mo12710j();
        double dMo12710j4 = jsonReader.mo12714z() == JsonReader.Token.f34832i ? jsonReader.mo12710j() : 1.0d;
        if (z2) {
            jsonReader.mo12706d();
        }
        if (dMo12710j <= 1.0d && dMo12710j2 <= 1.0d && dMo12710j3 <= 1.0d) {
            dMo12710j *= 255.0d;
            dMo12710j2 *= 255.0d;
            dMo12710j3 *= 255.0d;
            if (dMo12710j4 <= 1.0d) {
                dMo12710j4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) dMo12710j4, (int) dMo12710j, (int) dMo12710j2, (int) dMo12710j3));
    }
}
