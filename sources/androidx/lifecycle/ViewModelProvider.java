package androidx.lifecycle;

import android.app.Application;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.ViewModelProviderImpl;
import androidx.lifecycle.viewmodel.internal.DefaultViewModelProviderFactory;
import androidx.lifecycle.viewmodel.internal.JvmViewModelProviders;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, m18302d2 = {"Landroidx/lifecycle/ViewModelProvider;", "", "Factory", "OnRequeryFactory", "NewInstanceFactory", "AndroidViewModelFactory", "Companion", "lifecycle-viewmodel_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public class ViewModelProvider {

    /* JADX INFO: renamed from: b */
    public static final ViewModelProvider$special$$inlined$Key$1 f25005b = new ViewModelProvider$special$$inlined$Key$1();

    /* JADX INFO: renamed from: a */
    public final ViewModelProviderImpl f25006a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m18302d2 = {"Landroidx/lifecycle/ViewModelProvider$Companion;", "", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "", "VIEW_MODEL_KEY", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "lifecycle-viewmodel_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static ViewModelProvider m9177a(ViewModelStore store, Factory factory, CreationExtras extras) {
            Intrinsics.m18599g(store, "store");
            Intrinsics.m18599g(factory, "factory");
            Intrinsics.m18599g(extras, "extras");
            return new ViewModelProvider(store, factory, extras);
        }

        /* JADX INFO: renamed from: b */
        public static ViewModelProvider m9178b(ViewModelStoreOwner owner, Factory factory, int i) {
            if ((i & 2) != 0) {
                Intrinsics.m18599g(owner, "owner");
                factory = owner instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) owner).getDefaultViewModelProviderFactory() : DefaultViewModelProviderFactory.f25049a;
            }
            Intrinsics.m18599g(owner, "owner");
            CreationExtras extras = owner instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) owner).getDefaultViewModelCreationExtras() : CreationExtras.Empty.f25038b;
            Intrinsics.m18599g(owner, "owner");
            Intrinsics.m18599g(factory, "factory");
            Intrinsics.m18599g(extras, "extras");
            return new ViewModelProvider(owner.getViewModelStore(), factory, extras);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Companion", "lifecycle-viewmodel_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static class NewInstanceFactory implements Factory {

        /* JADX INFO: renamed from: a */
        public static NewInstanceFactory f25010a;

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, m18302d2 = {"Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory$Companion;", "", "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "_instance", "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "", "VIEW_MODEL_KEY", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "lifecycle-viewmodel_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
        public static final class Companion {
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass) {
            Intrinsics.m18599g(modelClass, "modelClass");
            return JvmViewModelProviders.m9193a(modelClass);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class cls, CreationExtras extras) {
            Intrinsics.m18599g(extras, "extras");
            return create(cls);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public final ViewModel create(KClass modelClass, CreationExtras creationExtras) {
            Intrinsics.m18599g(modelClass, "modelClass");
            return create(JvmClassMappingKt.m18572b(modelClass), creationExtras);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelProvider(ViewModelStore store, Factory factory) {
        this(store, factory, CreationExtras.Empty.f25038b);
        Intrinsics.m18599g(store, "store");
    }

    /* JADX INFO: renamed from: a */
    public final ViewModel m9174a(Class cls) {
        return m9175b(JvmClassMappingKt.m18575e(cls));
    }

    /* JADX INFO: renamed from: b */
    public final ViewModel m9175b(KClass modelClass) {
        Intrinsics.m18599g(modelClass, "modelClass");
        String strMo18587c = modelClass.mo18587c();
        if (strMo18587c == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return this.f25006a.m9190a("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strMo18587c), modelClass);
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, m18302d2 = {"Landroidx/lifecycle/ViewModelProvider$Factory;", "", "Companion", "lifecycle-viewmodel_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public interface Factory {

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/lifecycle/ViewModelProvider$Factory$Companion;", "", "lifecycle-viewmodel_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
        public static final class Companion {
        }

        default ViewModel create(Class modelClass) {
            Intrinsics.m18599g(modelClass, "modelClass");
            throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
        }

        default ViewModel create(Class modelClass, CreationExtras extras) {
            Intrinsics.m18599g(modelClass, "modelClass");
            Intrinsics.m18599g(extras, "extras");
            return create(modelClass);
        }

        default ViewModel create(KClass modelClass, CreationExtras extras) {
            Intrinsics.m18599g(modelClass, "modelClass");
            Intrinsics.m18599g(extras, "extras");
            return create(JvmClassMappingKt.m18572b(modelClass), extras);
        }
    }

    public ViewModelProvider(ViewModelStore store, Factory factory, CreationExtras defaultCreationExtras) {
        Intrinsics.m18599g(store, "store");
        Intrinsics.m18599g(factory, "factory");
        Intrinsics.m18599g(defaultCreationExtras, "defaultCreationExtras");
        this.f25006a = new ViewModelProviderImpl(store, factory, defaultCreationExtras);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ViewModelProvider(ViewModelStoreOwner viewModelStoreOwner, Factory factory) {
        CreationExtras defaultViewModelCreationExtras;
        Intrinsics.m18599g(factory, "factory");
        ViewModelStore viewModelStore = viewModelStoreOwner.getViewModelStore();
        if (viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory) {
            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelCreationExtras();
        } else {
            defaultViewModelCreationExtras = CreationExtras.Empty.f25038b;
        }
        this(viewModelStore, factory, defaultViewModelCreationExtras);
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "Companion", "lifecycle-viewmodel_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static class AndroidViewModelFactory extends NewInstanceFactory {

        /* JADX INFO: renamed from: c */
        public static AndroidViewModelFactory f25007c;

        /* JADX INFO: renamed from: d */
        public static final ViewModelProvider$AndroidViewModelFactory$special$$inlined$Key$1 f25008d = new ViewModelProvider$AndroidViewModelFactory$special$$inlined$Key$1();

        /* JADX INFO: renamed from: b */
        public final Application f25009b;

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, m18302d2 = {"Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory$Companion;", "", "Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;", "_instance", "Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "Landroid/app/Application;", "APPLICATION_KEY", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "lifecycle-viewmodel_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
        public static final class Companion {
        }

        public AndroidViewModelFactory(Application application) {
            this.f25009b = application;
        }

        /* JADX INFO: renamed from: a */
        public final ViewModel m9176a(Class cls, Application application) {
            if (!AndroidViewModel.class.isAssignableFrom(cls)) {
                return super.create(cls);
            }
            try {
                ViewModel viewModel = (ViewModel) cls.getConstructor(Application.class).newInstance(application);
                Intrinsics.m18596d(viewModel);
                return viewModel;
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            }
        }

        @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
        public final ViewModel create(Class cls, CreationExtras extras) {
            Intrinsics.m18599g(extras, "extras");
            if (this.f25009b != null) {
                return create(cls);
            }
            Application application = (Application) extras.mo9187a(f25008d);
            if (application != null) {
                return m9176a(cls, application);
            }
            if (AndroidViewModel.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return JvmViewModelProviders.m9193a(cls);
        }

        @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
        public final ViewModel create(Class modelClass) {
            Intrinsics.m18599g(modelClass, "modelClass");
            Application application = this.f25009b;
            if (application != null) {
                return m9176a(modelClass, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/lifecycle/ViewModelProvider$OnRequeryFactory;", "", "lifecycle-viewmodel_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    @RestrictTo
    public static class OnRequeryFactory {
        /* JADX INFO: renamed from: a */
        public void mo9109a(ViewModel viewModel) {
        }
    }
}
