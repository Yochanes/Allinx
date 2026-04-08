package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class IntegerParser implements ValueParser<Integer> {

    /* JADX INFO: renamed from: a */
    public static final IntegerParser f34788a = new IntegerParser();

    @Override // com.airbnb.lottie.parser.ValueParser
    /* JADX INFO: renamed from: a */
    public final Object mo12686a(JsonReader jsonReader, float f) {
        return Integer.valueOf(Math.round(JsonUtils.m12691d(jsonReader) * f));
    }
}
