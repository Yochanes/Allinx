package org.aspectj.runtime.reflect;

import org.aspectj.lang.reflect.ConstructorSignature;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
class ConstructorSignatureImpl extends CodeSignatureImpl implements ConstructorSignature {
    @Override // org.aspectj.runtime.reflect.SignatureImpl
    /* JADX INFO: renamed from: a */
    public final String mo21734a() {
        StringMaker stringMaker = StringMaker.f58014e;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(stringMaker.m21746b(mo21742d()));
        Class cls = this.f58011d;
        cls.getClass();
        stringBuffer.append(StringMaker.m21744c(cls, mo21741c(), stringMaker.f58018d));
        Class[] clsArr = this.f57995g;
        clsArr.getClass();
        stringMaker.m21745a(stringBuffer, clsArr);
        this.f57996h.getClass();
        return stringBuffer.toString();
    }
}
