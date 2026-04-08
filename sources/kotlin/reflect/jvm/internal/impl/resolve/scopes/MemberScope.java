package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface MemberScope extends ResolutionScope {

    /* JADX INFO: renamed from: a */
    public static final Companion f54453a = Companion.f54454a;

    /* JADX INFO: compiled from: Proguard */
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f54454a = new Companion();

        /* JADX INFO: renamed from: b */
        public static final Function1 f54455b = null;

        /* JADX INFO: renamed from: a */
        public static Function1 m20000a() {
            return MemberScope$Companion$ALL_NAME_FILTER$1.f54456a;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class DefaultImpls {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Empty extends MemberScopeImpl {

        /* JADX INFO: renamed from: b */
        public static final Empty f54457b = new Empty();

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        /* JADX INFO: renamed from: a */
        public final Set mo19035a() {
            return EmptySet.f51498a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        /* JADX INFO: renamed from: c */
        public final Set mo19037c() {
            return EmptySet.f51498a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        /* JADX INFO: renamed from: e */
        public final Set mo19039e() {
            return EmptySet.f51498a;
        }
    }

    /* JADX INFO: renamed from: a */
    Set mo19035a();

    /* JADX INFO: renamed from: b */
    Collection mo19036b(Name name, NoLookupLocation noLookupLocation);

    /* JADX INFO: renamed from: c */
    Set mo19037c();

    /* JADX INFO: renamed from: d */
    Collection mo19038d(Name name, LookupLocation lookupLocation);

    /* JADX INFO: renamed from: e */
    Set mo19039e();
}
