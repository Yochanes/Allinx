package org.aspectj.runtime.reflect;

import java.lang.reflect.Modifier;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
class StringMaker {

    /* JADX INFO: renamed from: e */
    public static final StringMaker f58014e;

    /* JADX INFO: renamed from: a */
    public boolean f58015a;

    /* JADX INFO: renamed from: b */
    public boolean f58016b;

    /* JADX INFO: renamed from: c */
    public boolean f58017c;

    /* JADX INFO: renamed from: d */
    public boolean f58018d;

    static {
        StringMaker stringMaker = new StringMaker();
        stringMaker.f58015a = true;
        stringMaker.f58016b = true;
        stringMaker.f58017c = false;
        stringMaker.f58018d = false;
        f58014e = stringMaker;
        stringMaker.f58015a = true;
        stringMaker.f58016b = true;
        stringMaker.f58017c = false;
        stringMaker.f58018d = false;
    }

    /* JADX INFO: renamed from: c */
    public static String m21744c(Class cls, String str, boolean z2) {
        if (cls == null) {
            return "ANONYMOUS";
        }
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            return AbstractC0000a.m19p(new StringBuilder(), m21744c(componentType, componentType.getName(), z2), "[]");
        }
        if (!z2) {
            return str.replace('$', '.');
        }
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            str = str.substring(iLastIndexOf + 1);
        }
        return str.replace('$', '.');
    }

    /* JADX INFO: renamed from: a */
    public final void m21745a(StringBuffer stringBuffer, Class[] clsArr) {
        if (clsArr == null) {
            return;
        }
        if (!this.f58016b) {
            if (clsArr.length == 0) {
                stringBuffer.append("()");
                return;
            } else {
                stringBuffer.append("(..)");
                return;
            }
        }
        stringBuffer.append("(");
        for (int i = 0; i < clsArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(", ");
            }
            Class cls = clsArr[i];
            stringBuffer.append(m21744c(cls, cls.getName(), this.f58015a));
        }
        stringBuffer.append(")");
    }

    /* JADX INFO: renamed from: b */
    public final String m21746b(int i) {
        if (!this.f58017c) {
            return "";
        }
        String string = Modifier.toString(i);
        return string.length() == 0 ? "" : string.concat(" ");
    }
}
