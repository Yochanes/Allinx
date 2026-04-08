package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class DocumentDataParser implements ValueParser<DocumentData> {

    /* JADX INFO: renamed from: a */
    public static final DocumentDataParser f34764a = new DocumentDataParser();

    /* JADX INFO: renamed from: b */
    public static final JsonReader.Options f34765b = JsonReader.Options.m12715a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override // com.airbnb.lottie.parser.ValueParser
    /* JADX INFO: renamed from: a */
    public final Object mo12686a(JsonReader jsonReader, float f) {
        boolean z2;
        int i;
        DocumentData.Justification justification = DocumentData.Justification.f34495a;
        jsonReader.mo12705b();
        String strMo12713u = null;
        DocumentData.Justification justification2 = justification;
        float fMo12710j = 0.0f;
        float fMo12710j2 = 0.0f;
        float fMo12710j3 = 0.0f;
        float fMo12710j4 = 0.0f;
        int iMo12711k = 0;
        int iM12688a = 0;
        int iM12688a2 = 0;
        boolean zMo12709i = true;
        String strMo12713u2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        while (jsonReader.mo12708h()) {
            switch (jsonReader.mo12700H(f34765b)) {
                case 0:
                    z2 = zMo12709i;
                    strMo12713u = jsonReader.mo12713u();
                    zMo12709i = z2;
                    break;
                case 1:
                    z2 = zMo12709i;
                    strMo12713u2 = jsonReader.mo12713u();
                    zMo12709i = z2;
                    break;
                case 2:
                    z2 = zMo12709i;
                    fMo12710j = (float) jsonReader.mo12710j();
                    zMo12709i = z2;
                    break;
                case 3:
                    z2 = zMo12709i;
                    i = iM12688a2;
                    int iMo12711k2 = jsonReader.mo12711k();
                    justification2 = (iMo12711k2 > 2 || iMo12711k2 < 0) ? justification : DocumentData.Justification.values()[iMo12711k2];
                    iM12688a2 = i;
                    zMo12709i = z2;
                    break;
                case 4:
                    z2 = zMo12709i;
                    iMo12711k = jsonReader.mo12711k();
                    zMo12709i = z2;
                    break;
                case 5:
                    z2 = zMo12709i;
                    fMo12710j2 = (float) jsonReader.mo12710j();
                    zMo12709i = z2;
                    break;
                case 6:
                    z2 = zMo12709i;
                    fMo12710j3 = (float) jsonReader.mo12710j();
                    zMo12709i = z2;
                    break;
                case 7:
                    z2 = zMo12709i;
                    iM12688a = JsonUtils.m12688a(jsonReader);
                    zMo12709i = z2;
                    break;
                case 8:
                    iM12688a2 = JsonUtils.m12688a(jsonReader);
                    break;
                case 9:
                    z2 = zMo12709i;
                    fMo12710j4 = (float) jsonReader.mo12710j();
                    zMo12709i = z2;
                    break;
                case 10:
                    zMo12709i = jsonReader.mo12709i();
                    iM12688a2 = iM12688a2;
                    break;
                case 11:
                    z2 = zMo12709i;
                    jsonReader.mo12704a();
                    i = iM12688a2;
                    pointF = new PointF(((float) jsonReader.mo12710j()) * f, ((float) jsonReader.mo12710j()) * f);
                    jsonReader.mo12706d();
                    iM12688a2 = i;
                    zMo12709i = z2;
                    break;
                case TYPE_BYTES_VALUE:
                    jsonReader.mo12704a();
                    z2 = zMo12709i;
                    pointF2 = new PointF(((float) jsonReader.mo12710j()) * f, ((float) jsonReader.mo12710j()) * f);
                    jsonReader.mo12706d();
                    iM12688a2 = iM12688a2;
                    zMo12709i = z2;
                    break;
                default:
                    jsonReader.mo12701L();
                    jsonReader.mo12702M();
                    break;
            }
        }
        jsonReader.mo12707g();
        DocumentData documentData = new DocumentData();
        documentData.f34482a = strMo12713u;
        documentData.f34483b = strMo12713u2;
        documentData.f34484c = fMo12710j;
        documentData.f34485d = justification2;
        documentData.f34486e = iMo12711k;
        documentData.f34487f = fMo12710j2;
        documentData.f34488g = fMo12710j3;
        documentData.f34489h = iM12688a;
        documentData.f34490i = iM12688a2;
        documentData.f34491j = fMo12710j4;
        documentData.f34492k = zMo12709i;
        documentData.f34493l = pointF;
        documentData.f34494m = pointF2;
        return documentData;
    }
}
