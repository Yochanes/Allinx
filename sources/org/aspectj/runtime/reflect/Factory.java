package org.aspectj.runtime.reflect;

import io.intercom.android.sdk.models.AttributeType;
import java.util.Hashtable;
import java.util.StringTokenizer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.reflect.MethodSignature;
import org.aspectj.runtime.reflect.JoinPointImpl;
import org.slf4j.Marker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class Factory {

    /* JADX INFO: renamed from: b */
    public static final Hashtable f57997b;

    /* JADX INFO: renamed from: c */
    public static final Object[] f57998c;

    /* JADX INFO: renamed from: a */
    public final ClassLoader f57999a;

    static {
        Hashtable hashtable = new Hashtable();
        f57997b = hashtable;
        hashtable.put("void", Void.TYPE);
        hashtable.put(AttributeType.BOOLEAN, Boolean.TYPE);
        hashtable.put("byte", Byte.TYPE);
        hashtable.put("char", Character.TYPE);
        hashtable.put("short", Short.TYPE);
        hashtable.put("int", Integer.TYPE);
        hashtable.put("long", Long.TYPE);
        hashtable.put(AttributeType.FLOAT, Float.TYPE);
        hashtable.put("double", Double.TYPE);
        f57998c = new Object[0];
    }

    public Factory(Class cls, String str) {
        this.f57999a = cls.getClassLoader();
    }

    /* JADX INFO: renamed from: a */
    public static Class m21735a(ClassLoader classLoader, String str) {
        if (str.equals(Marker.ANY_MARKER)) {
            return null;
        }
        Class cls = (Class) f57997b.get(str);
        if (cls != null) {
            return cls;
        }
        try {
            return classLoader == null ? Class.forName(str) : Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return ClassNotFoundException.class;
        }
    }

    /* JADX INFO: renamed from: b */
    public static JoinPoint m21736b(JoinPoint.StaticPart staticPart, Object obj, Object obj2) {
        return new JoinPointImpl(staticPart, obj, obj2, f57998c);
    }

    /* JADX INFO: renamed from: c */
    public static JoinPoint m21737c(JoinPoint.StaticPart staticPart, Object obj, Object obj2, Object obj3) {
        return new JoinPointImpl(staticPart, obj, obj2, new Object[]{obj3});
    }

    /* JADX INFO: renamed from: d */
    public final MethodSignature m21738d(String str, String str2, String str3, String str4, String str5, String str6) {
        ClassLoader classLoader = this.f57999a;
        Class clsM21735a = m21735a(classLoader, str2);
        int i = Integer.parseInt("1", 16);
        StringTokenizer stringTokenizer = new StringTokenizer(str3, ":");
        int iCountTokens = stringTokenizer.countTokens();
        Class[] clsArr = new Class[iCountTokens];
        for (int i2 = 0; i2 < iCountTokens; i2++) {
            clsArr[i2] = m21735a(classLoader, stringTokenizer.nextToken());
        }
        StringTokenizer stringTokenizer2 = new StringTokenizer(str4, ":");
        int iCountTokens2 = stringTokenizer2.countTokens();
        String[] strArr = new String[iCountTokens2];
        for (int i3 = 0; i3 < iCountTokens2; i3++) {
            strArr[i3] = stringTokenizer2.nextToken();
        }
        StringTokenizer stringTokenizer3 = new StringTokenizer(str5, ":");
        int iCountTokens3 = stringTokenizer3.countTokens();
        Class[] clsArr2 = new Class[iCountTokens3];
        for (int i4 = 0; i4 < iCountTokens3; i4++) {
            clsArr2[i4] = m21735a(classLoader, stringTokenizer3.nextToken());
        }
        Class clsM21735a2 = m21735a(classLoader, str6);
        MethodSignatureImpl methodSignatureImpl = new MethodSignatureImpl();
        methodSignatureImpl.f58008a = i;
        methodSignatureImpl.f58009b = str;
        methodSignatureImpl.f58011d = clsM21735a;
        methodSignatureImpl.f57995g = clsArr;
        methodSignatureImpl.f57996h = clsArr2;
        methodSignatureImpl.f58006i = clsM21735a2;
        return methodSignatureImpl;
    }

    /* JADX INFO: renamed from: e */
    public final JoinPoint.StaticPart m21739e(Signature signature) {
        JoinPointImpl.StaticPartImpl staticPartImpl = new JoinPointImpl.StaticPartImpl();
        staticPartImpl.f58004a = "method-execution";
        staticPartImpl.f58005b = signature;
        return staticPartImpl;
    }
}
