package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class PointFParser implements ValueParser<PointF> {

    /* JADX INFO: renamed from: a */
    public static final PointFParser f34805a = new PointFParser();

    @Override // com.airbnb.lottie.parser.ValueParser
    /* JADX INFO: renamed from: a */
    public final Object mo12686a(JsonReader jsonReader, float f) {
        JsonReader.Token tokenMo12714z = jsonReader.mo12714z();
        if (tokenMo12714z == JsonReader.Token.f34826a) {
            return JsonUtils.m12689b(jsonReader, f);
        }
        if (tokenMo12714z == JsonReader.Token.f34828c) {
            return JsonUtils.m12689b(jsonReader, f);
        }
        if (tokenMo12714z != JsonReader.Token.f34832i) {
            throw new IllegalArgumentException("Cannot convert json to point. Next token is " + tokenMo12714z);
        }
        PointF pointF = new PointF(((float) jsonReader.mo12710j()) * f, ((float) jsonReader.mo12710j()) * f);
        while (jsonReader.mo12708h()) {
            jsonReader.mo12702M();
        }
        return pointF;
    }
}
