package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class DescriptorKindExclude {

    /* JADX INFO: compiled from: Proguard */
    public static final class NonExtensions extends DescriptorKindExclude {

        /* JADX INFO: renamed from: a */
        public static final NonExtensions f54420a = new NonExtensions();

        /* JADX INFO: renamed from: b */
        public static final int f54421b;

        static {
            DescriptorKindFilter.Companion companion = DescriptorKindFilter.f54423c;
            companion.getClass();
            int i = DescriptorKindFilter.f54431k;
            companion.getClass();
            int i2 = DescriptorKindFilter.f54429i;
            companion.getClass();
            f54421b = (~(DescriptorKindFilter.f54430j | i2)) & i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude
        /* JADX INFO: renamed from: a */
        public final int mo19998a() {
            return f54421b;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class TopLevelPackages extends DescriptorKindExclude {

        /* JADX INFO: renamed from: a */
        public static final TopLevelPackages f54422a = new TopLevelPackages();

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude
        /* JADX INFO: renamed from: a */
        public final int mo19998a() {
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo19998a();

    public final String toString() {
        return getClass().getSimpleName();
    }
}
