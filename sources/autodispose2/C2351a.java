package autodispose2;

import autodispose2.androidx.lifecycle.AndroidLifecycleScopeProvider;
import autodispose2.lifecycle.LifecycleScopes;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.operators.completable.CompletableError;

/* JADX INFO: renamed from: autodispose2.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2351a implements Supplier {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AndroidLifecycleScopeProvider f33230a;

    public /* synthetic */ C2351a(AndroidLifecycleScopeProvider androidLifecycleScopeProvider) {
        this.f33230a = androidLifecycleScopeProvider;
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() {
        try {
            return LifecycleScopes.m12375a(this.f33230a);
        } catch (OutsideScopeException e) {
            return new CompletableError(e);
        }
    }
}
