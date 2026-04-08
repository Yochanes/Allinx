package com.google.firebase.crashlytics.internal.model.serialization;

import android.util.JsonReader;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;

/* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.serialization.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4698a implements CrashlyticsReportJsonTransform.ObjectParser {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42805a;

    public /* synthetic */ C4698a(int i) {
        this.f42805a = i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser
    public final Object parse(JsonReader jsonReader) {
        switch (this.f42805a) {
            case 0:
                return CrashlyticsReportJsonTransform.m15189c(jsonReader);
            case 1:
                return CrashlyticsReportJsonTransform.m15188b(jsonReader);
            case 2:
                return CrashlyticsReportJsonTransform.m15190d(jsonReader);
            case 3:
                return CrashlyticsReportJsonTransform.m15194h(jsonReader);
            case 4:
                return CrashlyticsReportJsonTransform.m15195i(jsonReader);
            case 5:
                return CrashlyticsReportJsonTransform.m15192f(jsonReader);
            case 6:
                return CrashlyticsReportJsonTransform.m15191e(jsonReader);
            case 7:
                return CrashlyticsReportJsonTransform.m15193g(jsonReader);
            default:
                return CrashlyticsReportJsonTransform.m15187a(jsonReader);
        }
    }
}
