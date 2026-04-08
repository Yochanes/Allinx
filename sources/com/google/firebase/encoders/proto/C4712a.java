package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import java.util.Map;

/* JADX INFO: renamed from: com.google.firebase.encoders.proto.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4712a implements ObjectEncoder {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42816a;

    public /* synthetic */ C4712a(int i) {
        this.f42816a = i;
    }

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        switch (this.f42816a) {
            case 0:
                ProtobufDataEncoderContext.m15211a((Map.Entry) obj, objectEncoderContext);
                break;
            default:
                ProtobufEncoder.Builder.m15212a(obj, objectEncoderContext);
                break;
        }
    }
}
