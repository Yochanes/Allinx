package androidx.camera.lifecycle;

import android.content.Context;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.concurrent.Camera2CameraCoordinator;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraFilter;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.CameraX;
import androidx.camera.core.UseCase;
import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.impl.CameraDeviceSurfaceManager;
import androidx.camera.core.impl.CameraFactory;
import androidx.camera.core.impl.ExtendedCameraConfigProviderStore;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.camera.lifecycle.LifecycleCameraRepository;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class ProcessCameraProvider implements LifecycleCameraProvider {

    /* JADX INFO: renamed from: f */
    public static final ProcessCameraProvider f3260f = new ProcessCameraProvider();

    /* JADX INFO: renamed from: b */
    public ListenableFuture f3262b;

    /* JADX INFO: renamed from: e */
    public CameraX f3265e;

    /* JADX INFO: renamed from: a */
    public final Object f3261a = new Object();

    /* JADX INFO: renamed from: c */
    public final ListenableFuture f3263c = Futures.m1630g(null);

    /* JADX INFO: renamed from: d */
    public final LifecycleCameraRepository f3264d = new LifecycleCameraRepository();

    /* JADX INFO: renamed from: androidx.camera.lifecycle.ProcessCameraProvider$1 */
    /* JADX INFO: compiled from: Proguard */
    class C03511 implements FutureCallback<Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CallbackToFutureAdapter.Completer f3266a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ CameraX f3267b;

        public C03511(CallbackToFutureAdapter.Completer completer, CameraX cameraX) {
            this.f3266a = completer;
            this.f3267b = cameraX;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final void onFailure(Throwable th) {
            this.f3266a.m6744d(th);
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final void onSuccess(Object obj) {
            this.f3266a.m6742b(this.f3267b);
        }
    }

    /* JADX INFO: renamed from: b */
    public static ListenableFuture m1789b(Context context) {
        ListenableFuture listenableFutureM6740a;
        context.getClass();
        ProcessCameraProvider processCameraProvider = f3260f;
        synchronized (processCameraProvider.f3261a) {
            try {
                listenableFutureM6740a = processCameraProvider.f3262b;
                if (listenableFutureM6740a == null) {
                    listenableFutureM6740a = CallbackToFutureAdapter.m6740a(new C0353b(processCameraProvider, new CameraX(context)));
                    processCameraProvider.f3262b = listenableFutureM6740a;
                }
            } finally {
            }
        }
        return Futures.m1634k(listenableFutureM6740a, new C0352a(context), CameraXExecutors.m1615a());
    }

    /* JADX INFO: renamed from: a */
    public final Camera m1790a(LifecycleOwner lifecycleOwner, CameraSelector cameraSelector, UseCase... useCaseArr) {
        int i;
        LifecycleCamera lifecycleCamera;
        Collection<LifecycleCamera> collectionUnmodifiableCollection;
        LifecycleCamera lifecycleCamera2;
        boolean zContains;
        CameraX cameraX = this.f3265e;
        if (cameraX == null) {
            i = 0;
        } else {
            CameraFactory cameraFactory = cameraX.f2223f;
            if (cameraFactory == null) {
                throw new IllegalStateException("CameraX not initialized yet.");
            }
            i = cameraFactory.mo901d().f2109e;
        }
        if (i == 2) {
            throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
        }
        CameraX cameraX2 = this.f3265e;
        if (cameraX2 != null) {
            CameraFactory cameraFactory2 = cameraX2.f2223f;
            if (cameraFactory2 == null) {
                throw new IllegalStateException("CameraX not initialized yet.");
            }
            Camera2CameraCoordinator camera2CameraCoordinatorMo901d = cameraFactory2.mo901d();
            if (1 != camera2CameraCoordinatorMo901d.f2109e) {
                Iterator it = camera2CameraCoordinatorMo901d.f2105a.iterator();
                while (it.hasNext()) {
                    ((CameraCoordinator.ConcurrentCameraModeListener) it.next()).mo1331a(camera2CameraCoordinatorMo901d.f2109e, 1);
                }
            }
            if (camera2CameraCoordinatorMo901d.f2109e == 2) {
                camera2CameraCoordinatorMo901d.f2107c.clear();
            }
            camera2CameraCoordinatorMo901d.f2109e = 1;
        }
        List list = Collections.EMPTY_LIST;
        Threads.m1607a();
        CameraSelector.Builder builder = new CameraSelector.Builder(cameraSelector.f2207a);
        for (UseCase useCase : useCaseArr) {
            CameraSelector cameraSelectorM1567G = useCase.f2389f.m1567G();
            if (cameraSelectorM1567G != null) {
                Iterator it2 = cameraSelectorM1567G.f2207a.iterator();
                while (it2.hasNext()) {
                    builder.f2208a.add((CameraFilter) it2.next());
                }
            }
        }
        LinkedHashSet linkedHashSetM1217a = builder.m1220a().m1217a(this.f3265e.f2218a.m1446a());
        if (linkedHashSetM1217a.isEmpty()) {
            throw new IllegalArgumentException("Provided camera selector unable to resolve a camera for the given use case");
        }
        CameraUseCaseAdapter.CameraId cameraId = new CameraUseCaseAdapter.CameraId(linkedHashSetM1217a);
        LifecycleCameraRepository lifecycleCameraRepository = this.f3264d;
        synchronized (lifecycleCameraRepository.f3253a) {
            lifecycleCamera = (LifecycleCamera) lifecycleCameraRepository.f3254b.get(new AutoValue_LifecycleCameraRepository_Key(lifecycleOwner, cameraId));
        }
        LifecycleCameraRepository lifecycleCameraRepository2 = this.f3264d;
        synchronized (lifecycleCameraRepository2.f3253a) {
            collectionUnmodifiableCollection = Collections.unmodifiableCollection(lifecycleCameraRepository2.f3254b.values());
        }
        for (UseCase useCase2 : useCaseArr) {
            for (LifecycleCamera lifecycleCamera3 : collectionUnmodifiableCollection) {
                synchronized (lifecycleCamera3.f3249a) {
                    zContains = ((ArrayList) lifecycleCamera3.f3251c.m1646u()).contains(useCase2);
                }
                if (zContains && lifecycleCamera3 != lifecycleCamera) {
                    throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", useCase2));
                }
            }
        }
        if (lifecycleCamera == null) {
            LifecycleCameraRepository lifecycleCameraRepository3 = this.f3264d;
            CameraFactory cameraFactory3 = this.f3265e.f2223f;
            if (cameraFactory3 == null) {
                throw new IllegalStateException("CameraX not initialized yet.");
            }
            Camera2CameraCoordinator camera2CameraCoordinatorMo901d2 = cameraFactory3.mo901d();
            CameraX cameraX3 = this.f3265e;
            CameraDeviceSurfaceManager cameraDeviceSurfaceManager = cameraX3.f2224g;
            if (cameraDeviceSurfaceManager == null) {
                throw new IllegalStateException("CameraX not initialized yet.");
            }
            UseCaseConfigFactory useCaseConfigFactory = cameraX3.f2225h;
            if (useCaseConfigFactory == null) {
                throw new IllegalStateException("CameraX not initialized yet.");
            }
            CameraUseCaseAdapter cameraUseCaseAdapter = new CameraUseCaseAdapter(linkedHashSetM1217a, camera2CameraCoordinatorMo901d2, cameraDeviceSurfaceManager, useCaseConfigFactory);
            synchronized (lifecycleCameraRepository3.f3253a) {
                try {
                    Preconditions.m7695b(lifecycleCameraRepository3.f3254b.get(new AutoValue_LifecycleCameraRepository_Key(lifecycleOwner, cameraUseCaseAdapter.f2965d)) == null, "LifecycleCamera already exists for the given LifecycleOwner and set of cameras");
                    if (lifecycleOwner.getLifecycle().getF24894d() == Lifecycle.State.f24880a) {
                        throw new IllegalArgumentException("Trying to create LifecycleCamera with destroyed lifecycle.");
                    }
                    lifecycleCamera2 = new LifecycleCamera(lifecycleOwner, cameraUseCaseAdapter);
                    if (((ArrayList) cameraUseCaseAdapter.m1646u()).isEmpty()) {
                        lifecycleCamera2.m1779t();
                    }
                    lifecycleCameraRepository3.m1784d(lifecycleCamera2);
                } finally {
                }
            }
            lifecycleCamera = lifecycleCamera2;
        }
        for (CameraFilter cameraFilter : cameraSelector.f2207a) {
            if (cameraFilter.mo1215a() != CameraFilter.f2204a) {
                ExtendedCameraConfigProviderStore.m1488a(cameraFilter.mo1215a());
            }
        }
        lifecycleCamera.m1776f(null);
        if (useCaseArr.length == 0) {
            return lifecycleCamera;
        }
        LifecycleCameraRepository lifecycleCameraRepository4 = this.f3264d;
        List listAsList = Arrays.asList(useCaseArr);
        CameraFactory cameraFactory4 = this.f3265e.f2223f;
        if (cameraFactory4 == null) {
            throw new IllegalStateException("CameraX not initialized yet.");
        }
        lifecycleCameraRepository4.m1781a(lifecycleCamera, listAsList, cameraFactory4.mo901d());
        return lifecycleCamera;
    }

    /* JADX INFO: renamed from: c */
    public final void m1791c() {
        Threads.m1607a();
        CameraX cameraX = this.f3265e;
        if (cameraX != null) {
            CameraFactory cameraFactory = cameraX.f2223f;
            if (cameraFactory == null) {
                throw new IllegalStateException("CameraX not initialized yet.");
            }
            Camera2CameraCoordinator camera2CameraCoordinatorMo901d = cameraFactory.mo901d();
            if (camera2CameraCoordinatorMo901d.f2109e != 0) {
                Iterator it = camera2CameraCoordinatorMo901d.f2105a.iterator();
                while (it.hasNext()) {
                    ((CameraCoordinator.ConcurrentCameraModeListener) it.next()).mo1331a(camera2CameraCoordinatorMo901d.f2109e, 0);
                }
            }
            if (camera2CameraCoordinatorMo901d.f2109e == 2) {
                camera2CameraCoordinatorMo901d.f2107c.clear();
            }
            camera2CameraCoordinatorMo901d.f2109e = 0;
        }
        LifecycleCameraRepository lifecycleCameraRepository = this.f3264d;
        synchronized (lifecycleCameraRepository.f3253a) {
            Iterator it2 = lifecycleCameraRepository.f3254b.keySet().iterator();
            while (it2.hasNext()) {
                LifecycleCamera lifecycleCamera = (LifecycleCamera) lifecycleCameraRepository.f3254b.get((LifecycleCameraRepository.Key) it2.next());
                synchronized (lifecycleCamera.f3249a) {
                    CameraUseCaseAdapter cameraUseCaseAdapter = lifecycleCamera.f3251c;
                    cameraUseCaseAdapter.m1647w((ArrayList) cameraUseCaseAdapter.m1646u());
                }
                lifecycleCameraRepository.m1786f(lifecycleCamera.m1777r());
            }
        }
    }
}
