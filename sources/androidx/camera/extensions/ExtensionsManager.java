package androidx.camera.extensions;

import androidx.annotation.RequiresApi;
import androidx.camera.core.CameraProvider;
import androidx.camera.core.Logger;
import androidx.camera.extensions.impl.InitializerImpl;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class ExtensionsManager {

    /* JADX INFO: renamed from: a */
    public static final Object f3213a = new Object();

    /* JADX INFO: renamed from: b */
    public static ExtensionsManager f3214b;

    /* JADX INFO: renamed from: androidx.camera.extensions.ExtensionsManager$1 */
    /* JADX INFO: compiled from: Proguard */
    class C03361 implements InitializerImpl.OnExtensionsInitializedCallback {
        final /* synthetic */ CameraProvider val$cameraProvider;
        final /* synthetic */ CallbackToFutureAdapter.Completer val$completer;

        public C03361(CallbackToFutureAdapter.Completer completer, CameraProvider cameraProvider) {
            this.val$completer = completer;
            this.val$cameraProvider = cameraProvider;
        }

        public void onFailure(int i) {
            Logger.m1282c("ExtensionsManager", "Failed to initialize extensions");
            CallbackToFutureAdapter.Completer completer = this.val$completer;
            ExtensionsAvailability extensionsAvailability = ExtensionsAvailability.LIBRARY_AVAILABLE;
            completer.m6742b(ExtensionsManager.m1742a());
        }

        public void onSuccess() {
            Logger.m1280a("ExtensionsManager", "Successfully initialized extensions");
            CallbackToFutureAdapter.Completer completer = this.val$completer;
            ExtensionsAvailability extensionsAvailability = ExtensionsAvailability.LIBRARY_AVAILABLE;
            completer.m6742b(ExtensionsManager.m1742a());
        }
    }

    /* JADX INFO: renamed from: androidx.camera.extensions.ExtensionsManager$2 */
    /* JADX INFO: compiled from: Proguard */
    class C03372 implements InitializerImpl.OnExtensionsDeinitializedCallback {
        final /* synthetic */ CallbackToFutureAdapter.Completer val$completer;

        public C03372(CallbackToFutureAdapter.Completer completer) {
            this.val$completer = completer;
        }

        public void onFailure(int i) {
            this.val$completer.m6744d(new Exception("Failed to deinitialize extensions."));
        }

        public void onSuccess() {
            this.val$completer.m6742b(null);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public enum ExtensionsAvailability {
        LIBRARY_AVAILABLE,
        LIBRARY_UNAVAILABLE_ERROR_LOADING,
        LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION,
        NONE
    }

    /* JADX INFO: renamed from: a */
    public static ExtensionsManager m1742a() {
        synchronized (f3213a) {
            try {
                ExtensionsManager extensionsManager = f3214b;
                if (extensionsManager != null) {
                    return extensionsManager;
                }
                ExtensionsManager extensionsManager2 = new ExtensionsManager();
                f3214b = extensionsManager2;
                return extensionsManager2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
