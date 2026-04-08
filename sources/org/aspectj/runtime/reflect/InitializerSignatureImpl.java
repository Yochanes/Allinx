package org.aspectj.runtime.reflect;

import java.lang.reflect.Modifier;
import org.aspectj.lang.reflect.InitializerSignature;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
class InitializerSignatureImpl extends CodeSignatureImpl implements InitializerSignature {
    @Override // org.aspectj.runtime.reflect.SignatureImpl
    /* JADX INFO: renamed from: a */
    public final String mo21734a() {
        StringMaker stringMaker = StringMaker.f58014e;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(stringMaker.m21746b(mo21742d()));
        Class cls = this.f58011d;
        cls.getClass();
        stringBuffer.append(StringMaker.m21744c(cls, mo21741c(), stringMaker.f58018d));
        stringBuffer.append(".");
        stringBuffer.append(Modifier.isStatic(mo21742d()) ? "<clinit>" : "<init>");
        return stringBuffer.toString();
    }
}
