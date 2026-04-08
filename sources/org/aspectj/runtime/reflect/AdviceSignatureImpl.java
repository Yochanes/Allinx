package org.aspectj.runtime.reflect;

import java.util.StringTokenizer;
import org.aspectj.lang.reflect.AdviceSignature;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
class AdviceSignatureImpl extends CodeSignatureImpl implements AdviceSignature {
    @Override // org.aspectj.runtime.reflect.SignatureImpl
    /* JADX INFO: renamed from: a */
    public final String mo21734a() {
        StringMaker stringMaker = StringMaker.f58014e;
        StringBuffer stringBuffer = new StringBuffer();
        boolean z2 = stringMaker.f58016b;
        if (z2) {
            throw null;
        }
        if (z2) {
            stringBuffer.append(" ");
        }
        Class cls = this.f58011d;
        cls.getClass();
        stringBuffer.append(StringMaker.m21744c(cls, mo21741c(), stringMaker.f58018d));
        stringBuffer.append(".");
        String str = this.f58009b;
        str.getClass();
        if (str.indexOf(36) != -1) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, "$");
            while (stringTokenizer.hasMoreTokens()) {
                String strNextToken = stringTokenizer.nextToken();
                if (strNextToken.startsWith("before") || strNextToken.startsWith("after") || strNextToken.startsWith("around")) {
                    str = strNextToken;
                    break;
                }
            }
        }
        stringBuffer.append(str);
        Class[] clsArr = this.f57995g;
        clsArr.getClass();
        stringMaker.m21745a(stringBuffer, clsArr);
        this.f57996h.getClass();
        return stringBuffer.toString();
    }
}
