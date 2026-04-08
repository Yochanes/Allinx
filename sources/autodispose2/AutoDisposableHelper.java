package autodispose2;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoDisposableHelper implements Disposable {

    /* JADX INFO: renamed from: a */
    public static final AutoDisposableHelper f33195a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AutoDisposableHelper[] f33196b;

    static {
        AutoDisposableHelper autoDisposableHelper = new AutoDisposableHelper("DISPOSED", 0);
        f33195a = autoDisposableHelper;
        f33196b = new AutoDisposableHelper[]{autoDisposableHelper};
    }

    /* JADX INFO: renamed from: a */
    public static void m12352a(AtomicReference atomicReference) {
        Disposable disposable;
        Disposable disposable2 = (Disposable) atomicReference.get();
        AutoDisposableHelper autoDisposableHelper = f33195a;
        if (disposable2 == autoDisposableHelper || (disposable = (Disposable) atomicReference.getAndSet(autoDisposableHelper)) == autoDisposableHelper || disposable == null) {
            return;
        }
        disposable.dispose();
    }

    public static AutoDisposableHelper valueOf(String str) {
        return (AutoDisposableHelper) Enum.valueOf(AutoDisposableHelper.class, str);
    }

    public static AutoDisposableHelper[] values() {
        return (AutoDisposableHelper[]) f33196b.clone();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo12353d() {
        return true;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
    }
}
