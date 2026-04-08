package org.aspectj.runtime.reflect;

import org.aspectj.lang.reflect.FieldSignature;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class FieldSignatureImpl extends MemberSignatureImpl implements FieldSignature {
    @Override // org.aspectj.runtime.reflect.SignatureImpl
    /* JADX INFO: renamed from: a */
    public final String mo21734a() {
        StringMaker stringMaker = StringMaker.f58014e;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(stringMaker.m21746b(super.mo21742d()));
        boolean z2 = stringMaker.f58016b;
        if (z2) {
            throw null;
        }
        if (z2) {
            stringBuffer.append(" ");
        }
        Class cls = this.f58011d;
        cls.getClass();
        stringBuffer.append(StringMaker.m21744c(cls, super.mo21741c(), stringMaker.f58018d));
        stringBuffer.append(".");
        String str = this.f58009b;
        str.getClass();
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    @Override // org.aspectj.runtime.reflect.SignatureImpl
    /* JADX INFO: renamed from: b */
    public final Class mo21740b() {
        Class cls = this.f58011d;
        cls.getClass();
        return cls;
    }

    @Override // org.aspectj.runtime.reflect.SignatureImpl
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ String mo21741c() {
        throw null;
    }

    @Override // org.aspectj.runtime.reflect.SignatureImpl
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ int mo21742d() {
        throw null;
    }
}
