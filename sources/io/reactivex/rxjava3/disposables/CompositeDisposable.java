package io.reactivex.rxjava3.disposables;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.OpenHashSet;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class CompositeDisposable implements Disposable, DisposableContainer {

    /* JADX INFO: renamed from: a */
    public OpenHashSet f49373a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f49374b;

    @Override // io.reactivex.rxjava3.disposables.DisposableContainer
    /* JADX INFO: renamed from: a */
    public final boolean mo17942a(Disposable disposable) {
        if (!mo17944c(disposable)) {
            return false;
        }
        disposable.dispose();
        return true;
    }

    @Override // io.reactivex.rxjava3.disposables.DisposableContainer
    /* JADX INFO: renamed from: b */
    public final boolean mo17943b(Disposable disposable) {
        Objects.requireNonNull(disposable, "disposable is null");
        if (!this.f49374b) {
            synchronized (this) {
                try {
                    if (!this.f49374b) {
                        OpenHashSet openHashSet = this.f49373a;
                        if (openHashSet == null) {
                            openHashSet = new OpenHashSet();
                            int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(15));
                            openHashSet.f51233a = iNumberOfLeadingZeros - 1;
                            openHashSet.f51235c = (int) (0.75f * iNumberOfLeadingZeros);
                            openHashSet.f51236d = new Object[iNumberOfLeadingZeros];
                            this.f49373a = openHashSet;
                        }
                        openHashSet.m18267a(disposable);
                        return true;
                    }
                } finally {
                }
            }
        }
        disposable.dispose();
        return false;
    }

    @Override // io.reactivex.rxjava3.disposables.DisposableContainer
    /* JADX INFO: renamed from: c */
    public final boolean mo17944c(Disposable disposable) {
        Object obj;
        Objects.requireNonNull(disposable, "disposable is null");
        if (this.f49374b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f49374b) {
                    return false;
                }
                OpenHashSet openHashSet = this.f49373a;
                if (openHashSet != null) {
                    Object[] objArr = openHashSet.f51236d;
                    int i = openHashSet.f51233a;
                    int iHashCode = disposable.hashCode() * (-1640531527);
                    int i2 = (iHashCode ^ (iHashCode >>> 16)) & i;
                    Object obj2 = objArr[i2];
                    if (obj2 != null) {
                        if (obj2.equals(disposable)) {
                            openHashSet.m18268b(i2, i, objArr);
                        } else {
                            do {
                                i2 = (i2 + 1) & i;
                                obj = objArr[i2];
                                if (obj == null) {
                                }
                            } while (!obj.equals(disposable));
                            openHashSet.m18268b(i2, i, objArr);
                        }
                        return true;
                    }
                }
                return false;
            } finally {
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo12353d() {
        return this.f49374b;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        if (this.f49374b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f49374b) {
                    return;
                }
                this.f49374b = true;
                OpenHashSet openHashSet = this.f49373a;
                ArrayList arrayList = null;
                this.f49373a = null;
                if (openHashSet == null) {
                    return;
                }
                for (Object obj : openHashSet.f51236d) {
                    if (obj instanceof Disposable) {
                        try {
                            ((Disposable) obj).dispose();
                        } catch (Throwable th) {
                            Exceptions.m17950a(th);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(th);
                        }
                    }
                }
                if (arrayList != null) {
                    if (arrayList.size() != 1) {
                        throw new CompositeException(arrayList);
                    }
                    throw ExceptionHelper.m18251f((Throwable) arrayList.get(0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m17945e() {
        if (this.f49374b) {
            return 0;
        }
        synchronized (this) {
            try {
                if (this.f49374b) {
                    return 0;
                }
                OpenHashSet openHashSet = this.f49373a;
                return openHashSet != null ? openHashSet.f51234b : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
