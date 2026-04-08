package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class FloatParser implements ValueParser<Float> {

    /* JADX INFO: renamed from: a */
    public static final FloatParser f34778a = new FloatParser();

    @Override // com.airbnb.lottie.parser.ValueParser
    /* JADX INFO: renamed from: a */
    public final Object mo12686a(JsonReader jsonReader, float f) {
        return Float.valueOf(JsonUtils.m12691d(jsonReader) * f);
    }
}
