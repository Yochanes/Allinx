package com.king.zxing;

import com.google.zxing.Result;
import com.king.camera.scan.BaseCameraScanFragment;
import com.king.zxing.analyze.MultiFormatAnalyzer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class BarcodeCameraScanFragment extends BaseCameraScanFragment<Result> {
    @Override // com.king.camera.scan.BaseCameraScanFragment
    /* JADX INFO: renamed from: h */
    public final MultiFormatAnalyzer mo15329h() {
        return new MultiFormatAnalyzer();
    }

    @Override // com.king.camera.scan.BaseCameraScanFragment
    /* JADX INFO: renamed from: i */
    public final int mo15330i() {
        return com.exchange.allin.R.layout.zxl_camera_scan;
    }

    @Override // com.king.camera.scan.BaseCameraScanFragment
    /* JADX INFO: renamed from: j */
    public final void mo15331j() {
        super.mo15331j();
    }
}
