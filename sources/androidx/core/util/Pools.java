package androidx.core.util;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/core/util/Pools;", "", "Pool", "SimplePool", "SynchronizedPool", "core_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class Pools {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, m18302d2 = {"Landroidx/core/util/Pools$Pool;", "", "T", "core_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public interface Pool<T> {
        /* JADX INFO: renamed from: a */
        boolean mo7692a(Object obj);

        /* JADX INFO: renamed from: b */
        Object mo7693b();
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/core/util/Pools$SimplePool;", "", "T", "Landroidx/core/util/Pools$Pool;", "core_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static class SimplePool<T> implements Pool<T> {

        /* JADX INFO: renamed from: a */
        public final Object[] f23340a;

        /* JADX INFO: renamed from: b */
        public int f23341b;

        public SimplePool(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f23340a = new Object[i];
        }

        @Override // androidx.core.util.Pools.Pool
        /* JADX INFO: renamed from: a */
        public boolean mo7692a(Object instance) {
            Object[] objArr;
            boolean z2;
            Intrinsics.m18599g(instance, "instance");
            int i = this.f23341b;
            int i2 = 0;
            while (true) {
                objArr = this.f23340a;
                if (i2 >= i) {
                    z2 = false;
                    break;
                }
                if (objArr[i2] == instance) {
                    z2 = true;
                    break;
                }
                i2++;
            }
            if (z2) {
                throw new IllegalStateException("Already in the pool!");
            }
            int i3 = this.f23341b;
            if (i3 >= objArr.length) {
                return false;
            }
            objArr[i3] = instance;
            this.f23341b = i3 + 1;
            return true;
        }

        @Override // androidx.core.util.Pools.Pool
        /* JADX INFO: renamed from: b */
        public Object mo7693b() {
            int i = this.f23341b;
            if (i <= 0) {
                return null;
            }
            int i2 = i - 1;
            Object[] objArr = this.f23340a;
            Object obj = objArr[i2];
            Intrinsics.m18597e(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
            objArr[i2] = null;
            this.f23341b--;
            return obj;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/core/util/Pools$SynchronizedPool;", "", "T", "Landroidx/core/util/Pools$SimplePool;", "core_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static class SynchronizedPool<T> extends SimplePool<T> {

        /* JADX INFO: renamed from: c */
        public final Object f23342c;

        public SynchronizedPool(int i) {
            super(i);
            this.f23342c = new Object();
        }

        @Override // androidx.core.util.Pools.SimplePool, androidx.core.util.Pools.Pool
        /* JADX INFO: renamed from: a */
        public final boolean mo7692a(Object instance) {
            boolean zMo7692a;
            Intrinsics.m18599g(instance, "instance");
            synchronized (this.f23342c) {
                zMo7692a = super.mo7692a(instance);
            }
            return zMo7692a;
        }

        @Override // androidx.core.util.Pools.SimplePool, androidx.core.util.Pools.Pool
        /* JADX INFO: renamed from: b */
        public final Object mo7693b() {
            Object objMo7693b;
            synchronized (this.f23342c) {
                objMo7693b = super.mo7693b();
            }
            return objMo7693b;
        }
    }
}
