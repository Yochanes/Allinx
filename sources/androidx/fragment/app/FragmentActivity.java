package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.app.OnMultiWindowModeChangedProvider;
import androidx.core.app.OnPictureInPictureModeChangedProvider;
import androidx.core.app.SharedElementCallback;
import androidx.core.content.OnConfigurationChangedProvider;
import androidx.core.content.OnTrimMemoryProvider;
import androidx.core.util.Consumer;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuProvider;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.loader.app.LoaderManager;
import androidx.os.SavedStateRegistry;
import androidx.os.SavedStateRegistryOwner;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class FragmentActivity extends ComponentActivity implements ActivityCompat.OnRequestPermissionsResultCallback, ActivityCompat.RequestPermissionsRequestCodeValidator {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    boolean mResumed;
    final FragmentController mFragments = new FragmentController(new HostCallbacks());
    final LifecycleRegistry mFragmentLifecycleRegistry = new LifecycleRegistry(this);
    boolean mStopped = true;

    /* JADX INFO: compiled from: Proguard */
    public class HostCallbacks extends FragmentHostCallback<FragmentActivity> implements OnConfigurationChangedProvider, OnTrimMemoryProvider, OnMultiWindowModeChangedProvider, OnPictureInPictureModeChangedProvider, ViewModelStoreOwner, OnBackPressedDispatcherOwner, ActivityResultRegistryOwner, SavedStateRegistryOwner, FragmentOnAttachListener, MenuHost {
        public HostCallbacks() {
            super(FragmentActivity.this);
        }

        @Override // androidx.fragment.app.FragmentOnAttachListener
        /* JADX INFO: renamed from: a */
        public final void mo8934a(Fragment fragment) {
            FragmentActivity.this.onAttachFragment(fragment);
        }

        @Override // androidx.core.view.MenuHost
        public final void addMenuProvider(MenuProvider menuProvider) {
            FragmentActivity.this.addMenuProvider(menuProvider);
        }

        @Override // androidx.core.content.OnConfigurationChangedProvider
        public final void addOnConfigurationChangedListener(Consumer consumer) {
            FragmentActivity.this.addOnConfigurationChangedListener(consumer);
        }

        @Override // androidx.core.app.OnMultiWindowModeChangedProvider
        public final void addOnMultiWindowModeChangedListener(Consumer consumer) {
            FragmentActivity.this.addOnMultiWindowModeChangedListener(consumer);
        }

        @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
        public final void addOnPictureInPictureModeChangedListener(Consumer consumer) {
            FragmentActivity.this.addOnPictureInPictureModeChangedListener(consumer);
        }

        @Override // androidx.core.content.OnTrimMemoryProvider
        public final void addOnTrimMemoryListener(Consumer consumer) {
            FragmentActivity.this.addOnTrimMemoryListener(consumer);
        }

        @Override // androidx.fragment.app.FragmentHostCallback, androidx.fragment.app.FragmentContainer
        /* JADX INFO: renamed from: b */
        public final View mo8925b(int i) {
            return FragmentActivity.this.findViewById(i);
        }

        @Override // androidx.fragment.app.FragmentHostCallback, androidx.fragment.app.FragmentContainer
        /* JADX INFO: renamed from: c */
        public final boolean mo8926c() {
            Window window = FragmentActivity.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        /* JADX INFO: renamed from: d */
        public final void mo8935d(PrintWriter printWriter, String[] strArr) {
            FragmentActivity.this.dump("  ", null, printWriter, strArr);
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        /* JADX INFO: renamed from: e */
        public final FragmentActivity mo8936e() {
            return FragmentActivity.this;
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        /* JADX INFO: renamed from: f */
        public final LayoutInflater mo8937f() {
            FragmentActivity fragmentActivity = FragmentActivity.this;
            return fragmentActivity.getLayoutInflater().cloneInContext(fragmentActivity);
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        /* JADX INFO: renamed from: g */
        public final boolean mo8938g(String str) {
            return ActivityCompat.m7394j(FragmentActivity.this, str);
        }

        @Override // androidx.activity.result.ActivityResultRegistryOwner
        public final ActivityResultRegistry getActivityResultRegistry() {
            return FragmentActivity.this.getActivityResultRegistry();
        }

        @Override // androidx.lifecycle.LifecycleOwner
        public final Lifecycle getLifecycle() {
            return FragmentActivity.this.mFragmentLifecycleRegistry;
        }

        @Override // androidx.activity.OnBackPressedDispatcherOwner
        public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return FragmentActivity.this.getOnBackPressedDispatcher();
        }

        @Override // androidx.os.SavedStateRegistryOwner
        public final SavedStateRegistry getSavedStateRegistry() {
            return FragmentActivity.this.getSavedStateRegistry();
        }

        @Override // androidx.lifecycle.ViewModelStoreOwner
        public final ViewModelStore getViewModelStore() {
            return FragmentActivity.this.getViewModelStore();
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        /* JADX INFO: renamed from: h */
        public final void mo8939h() {
            FragmentActivity.this.invalidateMenu();
        }

        @Override // androidx.core.view.MenuHost
        public final void removeMenuProvider(MenuProvider menuProvider) {
            FragmentActivity.this.removeMenuProvider(menuProvider);
        }

        @Override // androidx.core.content.OnConfigurationChangedProvider
        public final void removeOnConfigurationChangedListener(Consumer consumer) {
            FragmentActivity.this.removeOnConfigurationChangedListener(consumer);
        }

        @Override // androidx.core.app.OnMultiWindowModeChangedProvider
        public final void removeOnMultiWindowModeChangedListener(Consumer consumer) {
            FragmentActivity.this.removeOnMultiWindowModeChangedListener(consumer);
        }

        @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
        public final void removeOnPictureInPictureModeChangedListener(Consumer consumer) {
            FragmentActivity.this.removeOnPictureInPictureModeChangedListener(consumer);
        }

        @Override // androidx.core.content.OnTrimMemoryProvider
        public final void removeOnTrimMemoryListener(Consumer consumer) {
            FragmentActivity.this.removeOnTrimMemoryListener(consumer);
        }
    }

    public FragmentActivity() {
        getSavedStateRegistry().m11873c("android:support:lifecycle", new C1695e(this, 0));
        addOnConfigurationChangedListener(new C1696f(this, 0));
        addOnNewIntentListener(new C1696f(this, 1));
        addOnContextAvailableListener(new C1697g(this));
    }

    /* JADX INFO: renamed from: n */
    public static boolean m8933n(FragmentManager fragmentManager) {
        Lifecycle.State state = Lifecycle.State.f24882c;
        boolean zM8933n = false;
        for (Fragment fragment : fragmentManager.f24623c.m9046f()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zM8933n |= m8933n(fragment.getChildFragmentManager());
                }
                FragmentViewLifecycleOwner fragmentViewLifecycleOwner = fragment.mViewLifecycleOwner;
                if (fragmentViewLifecycleOwner != null) {
                    fragmentViewLifecycleOwner.m9082b();
                    if (fragmentViewLifecycleOwner.f24750f.f24894d.compareTo(Lifecycle.State.f24883d) >= 0) {
                        fragment.mViewLifecycleOwner.f24750f.m9134h(state);
                        zM8933n = true;
                    }
                }
                if (fragment.mLifecycleRegistry.f24894d.compareTo(Lifecycle.State.f24883d) >= 0) {
                    fragment.mLifecycleRegistry.m9134h(state);
                    zM8933n = true;
                }
            }
        }
        return zM8933n;
    }

    @Nullable
    public final View dispatchFragmentsOnCreateView(@Nullable View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return this.mFragments.f24592a.f24597d.f24626f.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                LoaderManager.m9196b(this).mo9197a(str2, printWriter);
            }
            this.mFragments.f24592a.f24597d.m9015w(str, fileDescriptor, printWriter, strArr);
        }
    }

    @NonNull
    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.f24592a.f24597d;
    }

    @NonNull
    @Deprecated
    public LoaderManager getSupportLoaderManager() {
        return LoaderManager.m9196b(this);
    }

    public void markFragmentsCreated() {
        FragmentManager supportFragmentManager;
        do {
            supportFragmentManager = getSupportFragmentManager();
            Lifecycle.State state = Lifecycle.State.f24880a;
        } while (m8933n(supportFragmentManager));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @CallSuper
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        this.mFragments.m8942a();
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.m9132f(Lifecycle.Event.ON_CREATE);
        FragmentManager fragmentManager = this.mFragments.f24592a.f24597d;
        fragmentManager.f24612I = false;
        fragmentManager.f24613J = false;
        fragmentManager.f24619P.f24674f = false;
        fragmentManager.m9014v(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    @Nullable
    public View onCreateView(@Nullable View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f24592a.f24597d.m9005m();
        this.mFragmentLifecycleRegistry.m9132f(Lifecycle.Event.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.mFragments.f24592a.f24597d.m9003k(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.f24592a.f24597d.m9014v(5);
        this.mFragmentLifecycleRegistry.m9132f(Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @CallSuper
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        this.mFragments.m8942a();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.m8942a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.f24592a.f24597d.m8965A(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.m9132f(Lifecycle.Event.ON_RESUME);
        FragmentManager fragmentManager = this.mFragments.f24592a.f24597d;
        fragmentManager.f24612I = false;
        fragmentManager.f24613J = false;
        fragmentManager.f24619P.f24674f = false;
        fragmentManager.m9014v(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.m8942a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            FragmentManager fragmentManager = this.mFragments.f24592a.f24597d;
            fragmentManager.f24612I = false;
            fragmentManager.f24613J = false;
            fragmentManager.f24619P.f24674f = false;
            fragmentManager.m9014v(4);
        }
        this.mFragments.f24592a.f24597d.m8965A(true);
        this.mFragmentLifecycleRegistry.m9132f(Lifecycle.Event.ON_START);
        FragmentManager fragmentManager2 = this.mFragments.f24592a.f24597d;
        fragmentManager2.f24612I = false;
        fragmentManager2.f24613J = false;
        fragmentManager2.f24619P.f24674f = false;
        fragmentManager2.m9014v(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.m8942a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        FragmentManager fragmentManager = this.mFragments.f24592a.f24597d;
        fragmentManager.f24613J = true;
        fragmentManager.f24619P.f24674f = true;
        fragmentManager.m9014v(4);
        this.mFragmentLifecycleRegistry.m9132f(Lifecycle.Event.ON_STOP);
    }

    public void setEnterSharedElementCallback(@Nullable SharedElementCallback sharedElementCallback) {
        ActivityCompat.m7392h(this, sharedElementCallback);
    }

    public void setExitSharedElementCallback(@Nullable SharedElementCallback sharedElementCallback) {
        ActivityCompat.m7393i(this, sharedElementCallback);
    }

    public void startActivityFromFragment(@NonNull Fragment fragment, @NonNull Intent intent, int i, @Nullable Bundle bundle) {
        if (i == -1) {
            startActivityForResult(intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i, bundle);
        }
    }

    @Deprecated
    public void startIntentSenderFromFragment(@NonNull Fragment fragment, @NonNull IntentSender intentSender, int i, @Nullable Intent intent, int i2, int i3, int i4, @Nullable Bundle bundle) {
        if (i == -1) {
            startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        finishAfterTransition();
    }

    public void supportPostponeEnterTransition() {
        postponeEnterTransition();
    }

    public void supportStartPostponedEnterTransition() {
        startPostponedEnterTransition();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    @Nullable
    public View onCreateView(@NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    public void startActivityFromFragment(@NonNull Fragment fragment, @NonNull Intent intent, int i) {
        startActivityFromFragment(fragment, intent, i, (Bundle) null);
    }

    @MainThread
    @Deprecated
    public void onAttachFragment(@NonNull Fragment fragment) {
    }

    @Override // androidx.core.app.ActivityCompat.RequestPermissionsRequestCodeValidator
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }
}
