package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.value.ScaleXY;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ScaleXYParser implements ValueParser<ScaleXY> {

    /* JADX INFO: renamed from: a */
    public static final ScaleXYParser f34810a = new ScaleXYParser();

    @Override // com.airbnb.lottie.parser.ValueParser
    /* JADX INFO: renamed from: a */
    public final Object mo12686a(JsonReader jsonReader, float f) {
        boolean z2 = jsonReader.mo12714z() == JsonReader.Token.f34826a;
        if (z2) {
            jsonReader.mo12704a();
        }
        float fMo12710j = (float) jsonReader.mo12710j();
        float fMo12710j2 = (float) jsonReader.mo12710j();
        while (jsonReader.mo12708h()) {
            jsonReader.mo12702M();
        }
        if (z2) {
            jsonReader.mo12706d();
        }
        return new ScaleXY((fMo12710j / 100.0f) * f, (fMo12710j2 / 100.0f) * f);
    }
}
