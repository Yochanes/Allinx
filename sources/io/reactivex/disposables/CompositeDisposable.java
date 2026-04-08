package io.reactivex.disposables;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableContainer;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.OpenHashSet;
import java.util.ArrayList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class CompositeDisposable implements Disposable, DisposableContainer {

    /* JADX INFO: renamed from: a */
    public OpenHashSet f47545a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f47546b;

    @Override // io.reactivex.internal.disposables.DisposableContainer
    /* JADX INFO: renamed from: a */
    public final boolean mo17604a(Disposable disposable) {
        if (!mo17606c(disposable)) {
            return false;
        }
        disposable.dispose();
        return true;
    }

    @Override // io.reactivex.internal.disposables.DisposableContainer
    /* JADX INFO: renamed from: b */
    public final boolean mo17605b(Disposable disposable) {
        ObjectHelper.m17628b(disposable, "d is null");
        if (!this.f47546b) {
            synchronized (this) {
                try {
                    if (!this.f47546b) {
                        OpenHashSet openHashSet = this.f47545a;
                        if (openHashSet == null) {
                            openHashSet = new OpenHashSet();
                            int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(15));
                            openHashSet.f49284a = iNumberOfLeadingZeros - 1;
                            openHashSet.f49286c = (int) (0.75f * iNumberOfLeadingZeros);
                            openHashSet.f49287d = new Object[iNumberOfLeadingZeros];
                            this.f47545a = openHashSet;
                        }
                        openHashSet.m17905a(disposable);
                        return true;
                    }
                } finally {
                }
            }
        }
        disposable.dispose();
        return false;
    }

    @Override // io.reactivex.internal.disposables.DisposableContainer
    /* JADX INFO: renamed from: c */
    public final boolean mo17606c(Disposable disposable) {
        Object obj;
        ObjectHelper.m17628b(disposable, "Disposable item is null");
        if (this.f47546b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f47546b) {
                    return false;
                }
                OpenHashSet openHashSet = this.f47545a;
                if (openHashSet != null) {
                    Object[] objArr = openHashSet.f49287d;
                    int i = openHashSet.f49284a;
                    int iHashCode = disposable.hashCode() * (-1640531527);
                    int i2 = (iHashCode ^ (iHashCode >>> 16)) & i;
                    Object obj2 = objArr[i2];
                    if (obj2 != null) {
                        if (obj2.equals(disposable)) {
                            openHashSet.m17906b(i2, i, objArr);
                        } else {
                            do {
                                i2 = (i2 + 1) & i;
                                obj = objArr[i2];
                                if (obj == null) {
                                }
                            } while (!obj.equals(disposable));
                            openHashSet.m17906b(i2, i, objArr);
                        }
                        return true;
                    }
                }
                return false;
            } finally {
            }
        }
    }

    @Override // io.reactivex.disposables.Disposable
    /* JADX INFO: renamed from: d */
    public final boolean mo17596d() {
        return this.f47546b;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        if (this.f47546b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f47546b) {
                    return;
                }
                this.f47546b = true;
                OpenHashSet openHashSet = this.f47545a;
                ArrayList arrayList = null;
                this.f47545a = null;
                if (openHashSet == null) {
                    return;
                }
                for (Object obj : openHashSet.f49287d) {
                    if (obj instanceof Disposable) {
                        try {
                            ((Disposable) obj).dispose();
                        } catch (Throwable th) {
                            Exceptions.m17612a(th);
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
                    throw ExceptionHelper.m17889c((Throwable) arrayList.get(0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m17607e() {
        if (this.f47546b) {
            return 0;
        }
        synchronized (this) {
            try {
                if (this.f47546b) {
                    return 0;
                }
                OpenHashSet openHashSet = this.f47545a;
                return openHashSet != null ? openHashSet.f49285b : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
