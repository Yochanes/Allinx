package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.model.CubicCurveData;
import com.airbnb.lottie.model.content.ShapeData;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.MiscUtils;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ShapeDataParser implements ValueParser<ShapeData> {

    /* JADX INFO: renamed from: a */
    public static final ShapeDataParser f34811a = new ShapeDataParser();

    /* JADX INFO: renamed from: b */
    public static final JsonReader.Options f34812b = JsonReader.Options.m12715a("c", "v", "i", "o");

    @Override // com.airbnb.lottie.parser.ValueParser
    /* JADX INFO: renamed from: a */
    public final Object mo12686a(JsonReader jsonReader, float f) {
        if (jsonReader.mo12714z() == JsonReader.Token.f34826a) {
            jsonReader.mo12704a();
        }
        jsonReader.mo12705b();
        ArrayList arrayListM12690c = null;
        ArrayList arrayListM12690c2 = null;
        ArrayList arrayListM12690c3 = null;
        boolean zMo12709i = false;
        while (jsonReader.mo12708h()) {
            int iMo12700H = jsonReader.mo12700H(f34812b);
            if (iMo12700H == 0) {
                zMo12709i = jsonReader.mo12709i();
            } else if (iMo12700H == 1) {
                arrayListM12690c = JsonUtils.m12690c(jsonReader, f);
            } else if (iMo12700H == 2) {
                arrayListM12690c2 = JsonUtils.m12690c(jsonReader, f);
            } else if (iMo12700H != 3) {
                jsonReader.mo12701L();
                jsonReader.mo12702M();
            } else {
                arrayListM12690c3 = JsonUtils.m12690c(jsonReader, f);
            }
        }
        jsonReader.mo12707g();
        if (jsonReader.mo12714z() == JsonReader.Token.f34827b) {
            jsonReader.mo12706d();
        }
        if (arrayListM12690c == null || arrayListM12690c2 == null || arrayListM12690c3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (arrayListM12690c.isEmpty()) {
            return new ShapeData(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = arrayListM12690c.size();
        PointF pointF = (PointF) arrayListM12690c.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = (PointF) arrayListM12690c.get(i);
            int i2 = i - 1;
            arrayList.add(new CubicCurveData(MiscUtils.m12745a((PointF) arrayListM12690c.get(i2), (PointF) arrayListM12690c3.get(i2)), MiscUtils.m12745a(pointF2, (PointF) arrayListM12690c2.get(i)), pointF2));
        }
        if (zMo12709i) {
            PointF pointF3 = (PointF) arrayListM12690c.get(0);
            int i3 = size - 1;
            arrayList.add(new CubicCurveData(MiscUtils.m12745a((PointF) arrayListM12690c.get(i3), (PointF) arrayListM12690c3.get(i3)), MiscUtils.m12745a(pointF3, (PointF) arrayListM12690c2.get(0)), pointF3));
        }
        return new ShapeData(pointF, zMo12709i, arrayList);
    }
}
