package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class PathParser implements ValueParser<PointF> {

    /* JADX INFO: renamed from: a */
    public static final PathParser f34804a = new PathParser();

    @Override // com.airbnb.lottie.parser.ValueParser
    /* JADX INFO: renamed from: a */
    public final Object mo12686a(JsonReader jsonReader, float f) {
        return JsonUtils.m12689b(jsonReader, f);
    }
}
