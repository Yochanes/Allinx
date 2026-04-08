package androidx.camera.camera2.internal;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import androidx.camera.camera2.internal.concurrent.Camera2CameraCoordinator;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraFactory;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CameraStateRegistry;
import androidx.camera.core.impl.CameraThreadConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class Camera2CameraFactory implements CameraFactory {

    /* JADX INFO: renamed from: a */
    public final Camera2CameraCoordinator f1576a;

    /* JADX INFO: renamed from: b */
    public final CameraThreadConfig f1577b;

    /* JADX INFO: renamed from: c */
    public final CameraStateRegistry f1578c;

    /* JADX INFO: renamed from: d */
    public final CameraManagerCompat f1579d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f1580e;

    /* JADX INFO: renamed from: f */
    public final DisplayInfoManager f1581f;

    /* JADX INFO: renamed from: g */
    public final HashMap f1582g = new HashMap();

    public Camera2CameraFactory(Context context, CameraThreadConfig cameraThreadConfig, CameraSelector cameraSelector) throws InitializationException {
        String strM989a;
        this.f1577b = cameraThreadConfig;
        CameraManagerCompat cameraManagerCompatM1094a = CameraManagerCompat.m1094a(context, cameraThreadConfig.mo1383c());
        this.f1579d = cameraManagerCompatM1094a;
        this.f1581f = DisplayInfoManager.m1012b(context);
        try {
            ArrayList<String> arrayList = new ArrayList();
            List<String> listAsList = Arrays.asList(cameraManagerCompatM1094a.f1965a.mo1101f());
            if (cameraSelector == null) {
                Iterator it = listAsList.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) it.next());
                }
            } else {
                try {
                    strM989a = CameraSelectionOptimizer.m989a(cameraManagerCompatM1094a, cameraSelector.m1219c(), listAsList);
                } catch (IllegalStateException unused) {
                    strM989a = null;
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str : listAsList) {
                    if (!str.equals(strM989a)) {
                        arrayList2.add(m902e(str));
                    }
                }
                Iterator it2 = cameraSelector.m1218b(arrayList2).iterator();
                while (it2.hasNext()) {
                    arrayList.add(((CameraInfoInternal) ((CameraInfo) it2.next())).mo945c());
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (String str2 : arrayList) {
                if (str2.equals("0") || str2.equals("1")) {
                    arrayList3.add(str2);
                } else {
                    if (!"robolectric".equals(Build.FINGERPRINT)) {
                        try {
                            int[] iArr = (int[]) this.f1579d.m1095b(str2).m1089a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                            if (iArr != null) {
                                for (int i : iArr) {
                                    if (i != 0) {
                                    }
                                }
                            }
                            Logger.m1280a("Camera2CameraFactory", "Camera " + str2 + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
                        } catch (CameraAccessExceptionCompat e) {
                            throw new InitializationException(new CameraUnavailableException(e));
                        }
                    }
                    arrayList3.add(str2);
                }
            }
            this.f1580e = arrayList3;
            Camera2CameraCoordinator camera2CameraCoordinator = new Camera2CameraCoordinator(this.f1579d);
            this.f1576a = camera2CameraCoordinator;
            CameraStateRegistry cameraStateRegistry = new CameraStateRegistry(camera2CameraCoordinator);
            this.f1578c = cameraStateRegistry;
            camera2CameraCoordinator.f2105a.add(cameraStateRegistry);
        } catch (CameraAccessExceptionCompat e2) {
            throw new InitializationException(new CameraUnavailableException(e2));
        } catch (CameraUnavailableException e3) {
            throw new InitializationException(e3);
        }
    }

    @Override // androidx.camera.core.impl.CameraFactory
    /* JADX INFO: renamed from: a */
    public final LinkedHashSet mo898a() {
        return new LinkedHashSet(this.f1580e);
    }

    @Override // androidx.camera.core.impl.CameraFactory
    /* JADX INFO: renamed from: b */
    public final CameraManagerCompat mo899b() {
        return this.f1579d;
    }

    @Override // androidx.camera.core.impl.CameraFactory
    /* JADX INFO: renamed from: c */
    public final CameraInternal mo900c(String str) throws CameraUnavailableException {
        if (!this.f1580e.contains(str)) {
            throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
        }
        Camera2CameraInfoImpl camera2CameraInfoImplM902e = m902e(str);
        Camera2CameraCoordinator camera2CameraCoordinator = this.f1576a;
        CameraThreadConfig cameraThreadConfig = this.f1577b;
        return new Camera2CameraImpl(this.f1579d, str, camera2CameraInfoImplM902e, camera2CameraCoordinator, this.f1578c, cameraThreadConfig.mo1382b(), cameraThreadConfig.mo1383c(), this.f1581f);
    }

    @Override // androidx.camera.core.impl.CameraFactory
    /* JADX INFO: renamed from: d */
    public final Camera2CameraCoordinator mo901d() {
        return this.f1576a;
    }

    /* JADX INFO: renamed from: e */
    public final Camera2CameraInfoImpl m902e(String str) throws CameraUnavailableException {
        HashMap map = this.f1582g;
        try {
            Camera2CameraInfoImpl camera2CameraInfoImpl = (Camera2CameraInfoImpl) map.get(str);
            if (camera2CameraInfoImpl != null) {
                return camera2CameraInfoImpl;
            }
            Camera2CameraInfoImpl camera2CameraInfoImpl2 = new Camera2CameraInfoImpl(str, this.f1579d);
            map.put(str, camera2CameraInfoImpl2);
            return camera2CameraInfoImpl2;
        } catch (CameraAccessExceptionCompat e) {
            throw new CameraUnavailableException(e);
        }
    }
}
