package com.google.firebase.encoders.json;

import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.ValueEncoderContext;

/* JADX INFO: renamed from: com.google.firebase.encoders.json.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4710b implements ValueEncoder {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42814a;

    public /* synthetic */ C4710b(int i) {
        this.f42814a = i;
    }

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ValueEncoderContext valueEncoderContext) {
        switch (this.f42814a) {
            case 0:
                JsonDataEncoderBuilder.m15210c((String) obj, valueEncoderContext);
                break;
            default:
                JsonDataEncoderBuilder.m15208a((Boolean) obj, valueEncoderContext);
                break;
        }
    }
}
