package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class LazyScopeAdapter$lazyScope$1 extends Lambda implements Function0<MemberScope> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function0 f54452a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyScopeAdapter$lazyScope$1(Function0 function0) {
        super(0);
        this.f54452a = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        MemberScope memberScope = (MemberScope) this.f54452a.invoke();
        return memberScope instanceof AbstractScopeAdapter ? ((AbstractScopeAdapter) memberScope).m19994h() : memberScope;
    }
}
