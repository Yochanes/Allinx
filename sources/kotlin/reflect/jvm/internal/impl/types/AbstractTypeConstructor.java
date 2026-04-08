package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractTypeConstructor extends ClassifierBasedTypeConstructor {

    /* JADX INFO: renamed from: b */
    public final NotNullLazyValue f54784b;

    /* JADX INFO: compiled from: Proguard */
    public final class ModuleViewTypeConstructor implements TypeConstructor {
        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        /* JADX INFO: renamed from: a */
        public final Collection mo19009a() {
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        /* JADX INFO: renamed from: b */
        public final ClassifierDescriptor mo18838b() {
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        /* JADX INFO: renamed from: d */
        public final boolean mo18839d() {
            throw null;
        }

        public final boolean equals(Object obj) {
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public final List getParameters() {
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        /* JADX INFO: renamed from: l */
        public final KotlinBuiltIns mo19010l() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Supertypes {

        /* JADX INFO: renamed from: a */
        public final Collection f54785a;

        /* JADX INFO: renamed from: b */
        public List f54786b;

        public Supertypes(Collection allSupertypes) {
            Intrinsics.m18599g(allSupertypes, "allSupertypes");
            this.f54785a = allSupertypes;
            this.f54786b = CollectionsKt.m18413N(ErrorUtils.f54998d);
        }
    }

    public AbstractTypeConstructor(StorageManager storageManager) {
        Intrinsics.m18599g(storageManager, "storageManager");
        this.f54784b = storageManager.mo20078c(new AbstractTypeConstructor$supertypes$1(this), AbstractTypeConstructor$supertypes$2.f54788a, new AbstractTypeConstructor$supertypes$3(this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Collection mo19009a() {
        return m20118k();
    }

    /* JADX INFO: renamed from: g */
    public abstract Collection mo18840g();

    /* JADX INFO: renamed from: h */
    public KotlinType mo19017h() {
        return null;
    }

    /* JADX INFO: renamed from: i */
    public Collection mo20102i(boolean z2) {
        return EmptyList.f51496a;
    }

    /* JADX INFO: renamed from: j */
    public abstract SupertypeLoopChecker mo18841j();

    /* JADX INFO: renamed from: k */
    public final List m20118k() {
        return ((Supertypes) this.f54784b.invoke()).f54786b;
    }

    /* JADX INFO: renamed from: n */
    public void mo19019n(KotlinType type) {
        Intrinsics.m18599g(type, "type");
    }

    /* JADX INFO: renamed from: m */
    public List mo19018m(List list) {
        return list;
    }
}
