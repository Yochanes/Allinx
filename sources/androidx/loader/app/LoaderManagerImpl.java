package androidx.loader.app;

import androidx.collection.SparseArrayCompat;
import androidx.core.util.DebugUtils;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.loader.content.Loader;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.king.logx.logger.Logger;
import java.io.PrintWriter;
import kotlin.jvm.JvmClassMappingKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class LoaderManagerImpl extends LoaderManager {

    /* JADX INFO: renamed from: a */
    public final Object f25054a;

    /* JADX INFO: renamed from: b */
    public final LoaderViewModel f25055b;

    /* JADX INFO: compiled from: Proguard */
    public static class LoaderInfo<D> extends MutableLiveData<D> implements Loader.OnLoadCompleteListener<D> {
        @Override // androidx.lifecycle.LiveData
        /* JADX INFO: renamed from: g */
        public final void mo9114g() {
            throw null;
        }

        @Override // androidx.lifecycle.LiveData
        /* JADX INFO: renamed from: h */
        public final void mo9144h() {
            throw null;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #0 : ");
            sb.append("null");
            sb.append("}}");
            return sb.toString();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class LoaderObserver<D> implements Observer<D> {
        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: a */
        public final void mo1166a(Object obj) {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class LoaderViewModel extends ViewModel {

        /* JADX INFO: renamed from: b */
        public static final ViewModelProvider.Factory f25056b = new C17161();

        /* JADX INFO: renamed from: a */
        public final SparseArrayCompat f25057a = new SparseArrayCompat(0);

        /* JADX INFO: renamed from: androidx.loader.app.LoaderManagerImpl$LoaderViewModel$1 */
        /* JADX INFO: compiled from: Proguard */
        public static class C17161 implements ViewModelProvider.Factory {
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final ViewModel create(Class cls) {
                return new LoaderViewModel();
            }
        }

        @Override // androidx.lifecycle.ViewModel
        public final void onCleared() {
            super.onCleared();
            SparseArrayCompat sparseArrayCompat = this.f25057a;
            if (sparseArrayCompat.m2137f() > 0) {
                ((LoaderInfo) sparseArrayCompat.m2138h(0)).getClass();
                throw null;
            }
            int i = sparseArrayCompat.f3888d;
            Object[] objArr = sparseArrayCompat.f3887c;
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = null;
            }
            sparseArrayCompat.f3888d = 0;
            sparseArrayCompat.f3885a = false;
        }
    }

    public LoaderManagerImpl(LifecycleOwner lifecycleOwner, ViewModelStore viewModelStore) {
        this.f25054a = lifecycleOwner;
        this.f25055b = (LoaderViewModel) new ViewModelProvider(viewModelStore, LoaderViewModel.f25056b).m9175b(JvmClassMappingKt.m18575e(LoaderViewModel.class));
    }

    @Override // androidx.loader.app.LoaderManager
    /* JADX INFO: renamed from: a */
    public final void mo9197a(String str, PrintWriter printWriter) {
        SparseArrayCompat sparseArrayCompat = this.f25055b.f25057a;
        if (sparseArrayCompat.m2137f() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + Logger.INDENT;
            if (sparseArrayCompat.m2137f() <= 0) {
                return;
            }
            LoaderInfo loaderInfo = (LoaderInfo) sparseArrayCompat.m2138h(0);
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(sparseArrayCompat.m2135d(0));
            printWriter.print(": ");
            printWriter.println(loaderInfo.toString());
            printWriter.print(str2);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mArgs=");
            printWriter.println((Object) null);
            printWriter.print(str2);
            printWriter.print("mLoader=");
            printWriter.println((Object) null);
            throw null;
        }
    }

    @Override // androidx.loader.app.LoaderManager
    /* JADX INFO: renamed from: c */
    public final void mo9198c() {
        SparseArrayCompat sparseArrayCompat = this.f25055b.f25057a;
        int iM2137f = sparseArrayCompat.m2137f();
        for (int i = 0; i < iM2137f; i++) {
            ((LoaderInfo) sparseArrayCompat.m2138h(i)).getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        DebugUtils.m7691a(sb, this.f25054a);
        sb.append("}}");
        return sb.toString();
    }
}
