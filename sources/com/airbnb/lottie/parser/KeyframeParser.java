package com.airbnb.lottie.parser;

import android.graphics.PointF;
import android.view.animation.BaseInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.Keyframe;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class KeyframeParser {

    /* JADX INFO: renamed from: a */
    public static final LinearInterpolator f34791a = new LinearInterpolator();

    /* JADX INFO: renamed from: b */
    public static final JsonReader.Options f34792b = JsonReader.Options.m12715a("t", "s", "e", "o", "i", "h", "to", "ti");

    /* JADX INFO: renamed from: c */
    public static final JsonReader.Options f34793c = JsonReader.Options.m12715a("x", "y");

    /* JADX INFO: renamed from: a */
    public static BaseInterpolator m12692a(PointF pointF, PointF pointF2) {
        pointF.x = MiscUtils.m12746b(pointF.x, -1.0f, 1.0f);
        pointF.y = MiscUtils.m12746b(pointF.y, -100.0f, 100.0f);
        pointF2.x = MiscUtils.m12746b(pointF2.x, -1.0f, 1.0f);
        float fM12746b = MiscUtils.m12746b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fM12746b;
        ThreadLocal threadLocal = Utils.f34879a;
        try {
            return new PathInterpolator(pointF.x, pointF.y, pointF2.x, fM12746b);
        } catch (IllegalArgumentException e) {
            return "The Path cannot loop back on itself.".equals(e.getMessage()) ? new PathInterpolator(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0033. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:100:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01fb A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Keyframe m12693b(JsonReader jsonReader, LottieComposition lottieComposition, float f, ValueParser valueParser, boolean z2, boolean z3) {
        Object obj;
        BaseInterpolator baseInterpolatorM12692a;
        Object obj2;
        BaseInterpolator baseInterpolatorM12692a2;
        BaseInterpolator baseInterpolatorM12692a3;
        BaseInterpolator baseInterpolatorM12692a4;
        JsonReader.Options options;
        PointF pointF;
        PointF pointF2;
        JsonReader.Options options2;
        PointF pointF3;
        PointF pointF4;
        LinearInterpolator linearInterpolator = f34791a;
        JsonReader.Options options3 = f34792b;
        if (!z2 || !z3) {
            JsonReader.Options options4 = options3;
            if (!z2) {
                return new Keyframe(valueParser.mo12686a(jsonReader, f));
            }
            jsonReader.mo12705b();
            PointF pointFM12689b = null;
            PointF pointFM12689b2 = null;
            PointF pointFM12689b3 = null;
            boolean z4 = false;
            PointF pointFM12689b4 = null;
            Object objMo12686a = null;
            float fMo12710j = 0.0f;
            Object objMo12686a2 = null;
            while (jsonReader.mo12708h()) {
                JsonReader.Options options5 = options4;
                switch (jsonReader.mo12700H(options5)) {
                    case 0:
                        options4 = options5;
                        fMo12710j = (float) jsonReader.mo12710j();
                        continue;
                    case 1:
                        objMo12686a = valueParser.mo12686a(jsonReader, f);
                        break;
                    case 2:
                        objMo12686a2 = valueParser.mo12686a(jsonReader, f);
                        break;
                    case 3:
                        pointFM12689b4 = JsonUtils.m12689b(jsonReader, 1.0f);
                        break;
                    case 4:
                        pointFM12689b = JsonUtils.m12689b(jsonReader, 1.0f);
                        break;
                    case 5:
                        z4 = jsonReader.mo12711k() == 1;
                        break;
                    case 6:
                        pointFM12689b2 = JsonUtils.m12689b(jsonReader, f);
                        break;
                    case 7:
                        pointFM12689b3 = JsonUtils.m12689b(jsonReader, f);
                        break;
                    default:
                        jsonReader.mo12702M();
                        break;
                }
                options4 = options5;
            }
            jsonReader.mo12707g();
            if (z4) {
                obj = objMo12686a;
            } else {
                if (pointFM12689b4 != null && pointFM12689b != null) {
                    baseInterpolatorM12692a = m12692a(pointFM12689b4, pointFM12689b);
                    obj = objMo12686a2;
                    Keyframe keyframe = new Keyframe(lottieComposition, objMo12686a, obj, baseInterpolatorM12692a, fMo12710j, (Float) null);
                    keyframe.f34898o = pointFM12689b2;
                    keyframe.f34899p = pointFM12689b3;
                    return keyframe;
                }
                obj = objMo12686a2;
            }
            baseInterpolatorM12692a = linearInterpolator;
            Keyframe keyframe2 = new Keyframe(lottieComposition, objMo12686a, obj, baseInterpolatorM12692a, fMo12710j, (Float) null);
            keyframe2.f34898o = pointFM12689b2;
            keyframe2.f34899p = pointFM12689b3;
            return keyframe2;
        }
        jsonReader.mo12705b();
        PointF pointF5 = null;
        PointF pointFM12689b5 = null;
        PointF pointFM12689b6 = null;
        boolean z5 = false;
        PointF pointFM12689b7 = null;
        PointF pointFM12689b8 = null;
        PointF pointF6 = null;
        Object objMo12686a3 = null;
        PointF pointF7 = null;
        PointF pointF8 = null;
        float fMo12710j2 = 0.0f;
        Object objMo12686a4 = null;
        while (jsonReader.mo12708h()) {
            int iMo12700H = jsonReader.mo12700H(options3);
            JsonReader.Token token = JsonReader.Token.f34828c;
            LinearInterpolator linearInterpolator2 = linearInterpolator;
            JsonReader.Token token2 = JsonReader.Token.f34832i;
            boolean z6 = z5;
            JsonReader.Options options6 = f34793c;
            switch (iMo12700H) {
                case 0:
                    options2 = options3;
                    pointF3 = pointFM12689b5;
                    pointF4 = pointFM12689b6;
                    z5 = z6;
                    fMo12710j2 = (float) jsonReader.mo12710j();
                    pointFM12689b5 = pointF3;
                    options3 = options2;
                    linearInterpolator = linearInterpolator2;
                    pointFM12689b6 = pointF4;
                    break;
                case 1:
                    options = options3;
                    objMo12686a3 = valueParser.mo12686a(jsonReader, f);
                    z5 = z6;
                    options3 = options;
                    linearInterpolator = linearInterpolator2;
                    break;
                case 2:
                    options = options3;
                    objMo12686a4 = valueParser.mo12686a(jsonReader, f);
                    z5 = z6;
                    options3 = options;
                    linearInterpolator = linearInterpolator2;
                    break;
                case 3:
                    options2 = options3;
                    pointF3 = pointFM12689b5;
                    pointF4 = pointFM12689b6;
                    Object obj3 = objMo12686a3;
                    if (jsonReader.mo12714z() == token) {
                        jsonReader.mo12705b();
                        float fMo12710j3 = 0.0f;
                        float fMo12710j4 = 0.0f;
                        float fMo12710j5 = 0.0f;
                        float fMo12710j6 = 0.0f;
                        while (jsonReader.mo12708h()) {
                            int iMo12700H2 = jsonReader.mo12700H(options6);
                            if (iMo12700H2 != 0) {
                                if (iMo12700H2 != 1) {
                                    jsonReader.mo12702M();
                                } else if (jsonReader.mo12714z() == token2) {
                                    fMo12710j6 = (float) jsonReader.mo12710j();
                                    fMo12710j4 = fMo12710j6;
                                } else {
                                    jsonReader.mo12704a();
                                    fMo12710j4 = (float) jsonReader.mo12710j();
                                    fMo12710j6 = jsonReader.mo12714z() == token2 ? (float) jsonReader.mo12710j() : fMo12710j4;
                                    jsonReader.mo12706d();
                                }
                            } else if (jsonReader.mo12714z() == token2) {
                                fMo12710j5 = (float) jsonReader.mo12710j();
                                fMo12710j3 = fMo12710j5;
                            } else {
                                jsonReader.mo12704a();
                                fMo12710j3 = (float) jsonReader.mo12710j();
                                fMo12710j5 = jsonReader.mo12714z() == token2 ? (float) jsonReader.mo12710j() : fMo12710j3;
                                jsonReader.mo12706d();
                            }
                        }
                        PointF pointF9 = new PointF(fMo12710j3, fMo12710j4);
                        pointF7 = new PointF(fMo12710j5, fMo12710j6);
                        jsonReader.mo12707g();
                        z5 = z6;
                        objMo12686a3 = obj3;
                        pointF6 = pointF9;
                    } else {
                        pointFM12689b7 = JsonUtils.m12689b(jsonReader, f);
                        z5 = z6;
                        objMo12686a3 = obj3;
                    }
                    pointFM12689b5 = pointF3;
                    options3 = options2;
                    linearInterpolator = linearInterpolator2;
                    pointFM12689b6 = pointF4;
                    break;
                case 4:
                    Object obj4 = objMo12686a3;
                    if (jsonReader.mo12714z() == token) {
                        jsonReader.mo12705b();
                        float fMo12710j7 = 0.0f;
                        float fMo12710j8 = 0.0f;
                        float fMo12710j9 = 0.0f;
                        float fMo12710j10 = 0.0f;
                        while (jsonReader.mo12708h()) {
                            JsonReader.Options options7 = options3;
                            int iMo12700H3 = jsonReader.mo12700H(options6);
                            if (iMo12700H3 != 0) {
                                pointF2 = pointFM12689b6;
                                if (iMo12700H3 != 1) {
                                    jsonReader.mo12702M();
                                } else if (jsonReader.mo12714z() == token2) {
                                    fMo12710j10 = (float) jsonReader.mo12710j();
                                    pointFM12689b5 = pointFM12689b5;
                                    fMo12710j8 = fMo12710j10;
                                } else {
                                    pointF = pointFM12689b5;
                                    jsonReader.mo12704a();
                                    fMo12710j8 = (float) jsonReader.mo12710j();
                                    fMo12710j10 = jsonReader.mo12714z() == token2 ? (float) jsonReader.mo12710j() : fMo12710j8;
                                    jsonReader.mo12706d();
                                    pointFM12689b5 = pointF;
                                }
                            } else {
                                pointF = pointFM12689b5;
                                pointF2 = pointFM12689b6;
                                if (jsonReader.mo12714z() == token2) {
                                    fMo12710j9 = (float) jsonReader.mo12710j();
                                    pointFM12689b5 = pointF;
                                    fMo12710j7 = fMo12710j9;
                                } else {
                                    jsonReader.mo12704a();
                                    fMo12710j7 = (float) jsonReader.mo12710j();
                                    fMo12710j9 = jsonReader.mo12714z() == token2 ? (float) jsonReader.mo12710j() : fMo12710j7;
                                    jsonReader.mo12706d();
                                    pointFM12689b5 = pointF;
                                }
                            }
                            options3 = options7;
                            pointFM12689b6 = pointF2;
                        }
                        options = options3;
                        PointF pointF10 = new PointF(fMo12710j7, fMo12710j8);
                        pointF5 = new PointF(fMo12710j9, fMo12710j10);
                        jsonReader.mo12707g();
                        z5 = z6;
                        objMo12686a3 = obj4;
                        pointF8 = pointF10;
                    } else {
                        options = options3;
                        pointFM12689b8 = JsonUtils.m12689b(jsonReader, f);
                        z5 = z6;
                        objMo12686a3 = obj4;
                    }
                    options3 = options;
                    linearInterpolator = linearInterpolator2;
                    break;
                case 5:
                    z5 = jsonReader.mo12711k() == 1;
                    linearInterpolator = linearInterpolator2;
                    break;
                case 6:
                    pointFM12689b5 = JsonUtils.m12689b(jsonReader, f);
                    z5 = z6;
                    linearInterpolator = linearInterpolator2;
                    break;
                case 7:
                    pointFM12689b6 = JsonUtils.m12689b(jsonReader, f);
                    z5 = z6;
                    linearInterpolator = linearInterpolator2;
                    break;
                default:
                    jsonReader.mo12702M();
                    z5 = z6;
                    linearInterpolator = linearInterpolator2;
                    break;
            }
        }
        LinearInterpolator linearInterpolator3 = linearInterpolator;
        PointF pointF11 = pointFM12689b5;
        PointF pointF12 = pointFM12689b6;
        boolean z7 = z5;
        Object obj5 = objMo12686a3;
        jsonReader.mo12707g();
        if (z7) {
            obj2 = obj5;
        } else {
            if (pointFM12689b7 != null && pointFM12689b8 != null) {
                baseInterpolatorM12692a4 = m12692a(pointFM12689b7, pointFM12689b8);
                obj2 = objMo12686a4;
                baseInterpolatorM12692a2 = null;
                baseInterpolatorM12692a3 = null;
                if (baseInterpolatorM12692a2 == null) {
                }
                keyframe.f34898o = pointF11;
                keyframe.f34899p = pointF12;
                return keyframe;
            }
            if (pointF6 != null && pointF7 != null && pointF8 != null && pointF5 != null) {
                baseInterpolatorM12692a2 = m12692a(pointF6, pointF8);
                baseInterpolatorM12692a3 = m12692a(pointF7, pointF5);
                obj2 = objMo12686a4;
                baseInterpolatorM12692a4 = null;
                Keyframe keyframe3 = (baseInterpolatorM12692a2 == null || baseInterpolatorM12692a3 == null) ? new Keyframe(lottieComposition, obj5, obj2, baseInterpolatorM12692a4, fMo12710j2, (Float) null) : new Keyframe(lottieComposition, obj5, obj2, baseInterpolatorM12692a2, baseInterpolatorM12692a3, fMo12710j2);
                keyframe3.f34898o = pointF11;
                keyframe3.f34899p = pointF12;
                return keyframe3;
            }
            obj2 = objMo12686a4;
        }
        baseInterpolatorM12692a4 = linearInterpolator3;
        baseInterpolatorM12692a2 = null;
        baseInterpolatorM12692a3 = null;
        if (baseInterpolatorM12692a2 == null) {
        }
        keyframe3.f34898o = pointF11;
        keyframe3.f34899p = pointF12;
        return keyframe3;
    }
}
