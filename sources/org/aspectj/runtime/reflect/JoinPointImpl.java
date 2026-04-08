package org.aspectj.runtime.reflect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
class JoinPointImpl implements ProceedingJoinPoint {

    /* JADX INFO: renamed from: a */
    public final Object f58000a;

    /* JADX INFO: renamed from: b */
    public final Object f58001b;

    /* JADX INFO: renamed from: c */
    public final Object[] f58002c;

    /* JADX INFO: renamed from: d */
    public final JoinPoint.StaticPart f58003d;

    /* JADX INFO: compiled from: Proguard */
    public static class EnclosingStaticPartImpl extends StaticPartImpl implements JoinPoint.EnclosingStaticPart {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class StaticPartImpl implements JoinPoint.StaticPart {

        /* JADX INFO: renamed from: a */
        public String f58004a;

        /* JADX INFO: renamed from: b */
        public Signature f58005b;

        @Override // org.aspectj.lang.JoinPoint.StaticPart
        public final String toString() {
            StringMaker stringMaker = StringMaker.f58014e;
            StringBuffer stringBuffer = new StringBuffer();
            String strSubstring = this.f58004a;
            int iLastIndexOf = strSubstring.lastIndexOf(45);
            if (iLastIndexOf != -1) {
                strSubstring = strSubstring.substring(iLastIndexOf + 1);
            }
            stringBuffer.append(strSubstring);
            stringBuffer.append("(");
            stringBuffer.append(((SignatureImpl) this.f58005b).m21743e());
            stringBuffer.append(")");
            return stringBuffer.toString();
        }
    }

    public JoinPointImpl(JoinPoint.StaticPart staticPart, Object obj, Object obj2, Object[] objArr) {
        this.f58003d = staticPart;
        this.f58000a = obj;
        this.f58001b = obj2;
        this.f58002c = objArr;
    }

    @Override // org.aspectj.lang.JoinPoint
    /* JADX INFO: renamed from: a */
    public final Object mo21733a() {
        return this.f58001b;
    }

    public final String toString() {
        return this.f58003d.toString();
    }
}
