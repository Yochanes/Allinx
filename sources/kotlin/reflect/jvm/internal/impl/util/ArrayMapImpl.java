package kotlin.reflect.jvm.internal.impl.util;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.AbstractIterator;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension
public final class ArrayMapImpl<T> extends ArrayMap<T> {

    /* JADX INFO: renamed from: a */
    public Object[] f55019a;

    /* JADX INFO: renamed from: b */
    public int f55020b;

    /* JADX INFO: compiled from: Proguard */
    public static final class Companion {
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.util.ArrayMapImpl$iterator$1 */
    /* JADX INFO: compiled from: Proguard */
    public final class C62251 extends AbstractIterator<Object> {

        /* JADX INFO: renamed from: c */
        public int f55021c = -1;

        public C62251() {
        }

        @Override // kotlin.collections.AbstractIterator
        /* JADX INFO: renamed from: c */
        public final void mo18318c() {
            int i;
            Object[] objArr;
            do {
                i = this.f55021c + 1;
                this.f55021c = i;
                objArr = ArrayMapImpl.this.f55019a;
                if (i >= objArr.length) {
                    break;
                }
            } while (objArr[i] == null);
            if (i >= objArr.length) {
                this.f51467a = 2;
                return;
            }
            Object obj = objArr[i];
            Intrinsics.m18597e(obj, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
            this.f51468b = obj;
            this.f51467a = 1;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    /* JADX INFO: renamed from: c */
    public final int mo20323c() {
        return this.f55020b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    /* JADX INFO: renamed from: e */
    public final void mo20324e(int i, Object obj) {
        Object[] objArr = this.f55019a;
        if (objArr.length <= i) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length * 2);
            Intrinsics.m18598f(objArrCopyOf, "copyOf(this, newSize)");
            this.f55019a = objArrCopyOf;
        }
        Object[] objArr2 = this.f55019a;
        if (objArr2[i] == null) {
            this.f55020b++;
        }
        objArr2[i] = obj;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public final Object get(int i) {
        return ArraysKt.m18341H(i, this.f55019a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap, java.lang.Iterable
    public final Iterator iterator() {
        return new C62251();
    }
}
