package com.king.camera.scan;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.view.PreviewView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.chiclaim.android.downloader.ViewOnClickListenerC2463a;
import com.king.camera.scan.CameraScan;
import com.king.camera.scan.manager.AmbientLightManager;
import com.king.logx.LogX;
import com.king.zxing.analyze.MultiFormatAnalyzer;
import java.util.Arrays;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseCameraScanFragment<T> extends Fragment implements CameraScan.OnScanResultCallback<T> {

    /* JADX INFO: renamed from: a */
    public View f42984a;

    /* JADX INFO: renamed from: b */
    public PreviewView f42985b;

    /* JADX INFO: renamed from: c */
    public View f42986c;

    /* JADX INFO: renamed from: d */
    public BaseCameraScan f42987d;

    /* JADX INFO: renamed from: h */
    public abstract MultiFormatAnalyzer mo15329h();

    /* JADX INFO: renamed from: i */
    public int mo15330i() {
        return com.exchange.allin.R.layout.camera_scan;
    }

    /* JADX INFO: renamed from: j */
    public void mo15331j() {
        this.f42985b = (PreviewView) this.f42984a.findViewById(com.exchange.allin.R.id.previewView);
        View viewFindViewById = this.f42984a.findViewById(com.exchange.allin.R.id.ivFlashlight);
        this.f42986c = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new ViewOnClickListenerC2463a(this, 3));
        }
        BaseCameraScan baseCameraScan = new BaseCameraScan(requireContext(), getViewLifecycleOwner(), this.f42985b);
        this.f42987d = baseCameraScan;
        baseCameraScan.f42965g = mo15329h();
        View view = this.f42986c;
        baseCameraScan.f42969k = view;
        AmbientLightManager ambientLightManager = baseCameraScan.f42974p;
        if (ambientLightManager != null) {
            ambientLightManager.f43002d = view != null;
        }
        baseCameraScan.f42971m = this;
        m15332k();
    }

    /* JADX INFO: renamed from: k */
    public final void m15332k() {
        if (this.f42987d != null) {
            if (ContextCompat.m7484a(requireContext(), "android.permission.CAMERA") == 0) {
                this.f42987d.m15323d();
                return;
            }
            LogX.m15342d("checkPermissionResult != PERMISSION_GRANTED", new Object[0]);
            String[] strArr = {"android.permission.CAMERA"};
            LogX.m15342d("requestPermissions: %s", Arrays.toString(strArr));
            requestPermissions(strArr, 134);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(mo15330i(), viewGroup, false);
        this.f42984a = viewInflate;
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        BaseCameraScan baseCameraScan = this.f42987d;
        if (baseCameraScan != null) {
            baseCameraScan.m15322c();
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 134) {
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                if ("android.permission.CAMERA".equals(strArr[i2]) && iArr[i2] == 0) {
                    m15332k();
                    return;
                }
            }
            requireActivity().finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        mo15331j();
    }
}
