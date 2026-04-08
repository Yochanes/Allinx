package org.aspectj.runtime.reflect;

import java.lang.ref.SoftReference;
import org.aspectj.lang.Signature;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
abstract class SignatureImpl implements Signature {

    /* JADX INFO: renamed from: f */
    public static boolean f58007f = true;

    /* JADX INFO: renamed from: a */
    public int f58008a;

    /* JADX INFO: renamed from: b */
    public String f58009b;

    /* JADX INFO: renamed from: c */
    public String f58010c;

    /* JADX INFO: renamed from: d */
    public Class f58011d;

    /* JADX INFO: renamed from: e */
    public CacheImpl f58012e;

    /* JADX INFO: compiled from: Proguard */
    public interface Cache {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class CacheImpl implements Cache {

        /* JADX INFO: renamed from: a */
        public SoftReference f58013a;
    }

    /* JADX INFO: renamed from: a */
    public abstract String mo21734a();

    /* JADX INFO: renamed from: b */
    public Class mo21740b() {
        Class cls = this.f58011d;
        if (cls != null) {
            return cls;
        }
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public String mo21741c() {
        if (this.f58010c == null) {
            this.f58010c = mo21740b().getName();
        }
        return this.f58010c;
    }

    /* JADX INFO: renamed from: d */
    public int mo21742d() {
        int i = this.f58008a;
        if (i != -1) {
            return i;
        }
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public final String m21743e() {
        StringMaker stringMaker = StringMaker.f58014e;
        String strMo21734a = null;
        if (f58007f) {
            CacheImpl cacheImpl = this.f58012e;
            if (cacheImpl == null) {
                try {
                    CacheImpl cacheImpl2 = new CacheImpl();
                    cacheImpl2.f58013a = new SoftReference(new String[3]);
                    this.f58012e = cacheImpl2;
                } catch (Throwable unused) {
                    f58007f = false;
                }
            } else {
                String[] strArr = (String[]) cacheImpl.f58013a.get();
                if (strArr != null) {
                    strMo21734a = strArr[0];
                }
            }
        }
        if (strMo21734a == null) {
            strMo21734a = mo21734a();
        }
        if (f58007f) {
            CacheImpl cacheImpl3 = this.f58012e;
            String[] strArr2 = (String[]) cacheImpl3.f58013a.get();
            if (strArr2 == null) {
                strArr2 = new String[3];
                cacheImpl3.f58013a = new SoftReference(strArr2);
            }
            strArr2[0] = strMo21734a;
        }
        return strMo21734a;
    }

    public final String toString() {
        StringMaker stringMaker = StringMaker.f58014e;
        return m21743e();
    }
}
