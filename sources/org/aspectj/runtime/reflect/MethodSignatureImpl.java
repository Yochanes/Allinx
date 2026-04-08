package org.aspectj.runtime.reflect;

import org.aspectj.lang.reflect.MethodSignature;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
class MethodSignatureImpl extends CodeSignatureImpl implements MethodSignature {

    /* JADX INFO: renamed from: i */
    public Class f58006i;

    @Override // org.aspectj.runtime.reflect.SignatureImpl
    /* JADX INFO: renamed from: a */
    public final String mo21734a() {
        StringMaker stringMaker = StringMaker.f58014e;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(stringMaker.m21746b(mo21742d()));
        if (stringMaker.f58016b) {
            Class cls = this.f58006i;
            cls.getClass();
            stringBuffer.append(StringMaker.m21744c(cls, cls.getName(), stringMaker.f58015a));
        }
        if (stringMaker.f58016b) {
            stringBuffer.append(" ");
        }
        Class cls2 = this.f58011d;
        cls2.getClass();
        stringBuffer.append(StringMaker.m21744c(cls2, mo21741c(), stringMaker.f58018d));
        stringBuffer.append(".");
        String str = this.f58009b;
        str.getClass();
        stringBuffer.append(str);
        Class[] clsArr = this.f57995g;
        clsArr.getClass();
        stringMaker.m21745a(stringBuffer, clsArr);
        this.f57996h.getClass();
        return stringBuffer.toString();
    }
}
