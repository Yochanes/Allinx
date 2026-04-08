package org.aspectj.internal.lang.reflect;

import org.aspectj.lang.reflect.PerClauseKind;
import org.aspectj.lang.reflect.PointcutBasedPerClause;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class PointcutBasedPerClauseImpl extends PerClauseImpl implements PointcutBasedPerClause {

    /* JADX INFO: renamed from: org.aspectj.internal.lang.reflect.PointcutBasedPerClauseImpl$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C63671 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f57987a;

        static {
            int[] iArr = new int[PerClauseKind.values().length];
            f57987a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57987a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57987a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f57987a[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // org.aspectj.internal.lang.reflect.PerClauseImpl
    public final String toString() {
        throw null;
    }
}
