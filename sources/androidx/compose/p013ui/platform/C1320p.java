package androidx.compose.p013ui.platform;

import androidx.customview.poolingcontainer.PoolingContainerListener;

/* JADX INFO: renamed from: androidx.compose.ui.platform.p */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1320p implements PoolingContainerListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractComposeView f19662a;

    public /* synthetic */ C1320p(AbstractComposeView abstractComposeView) {
        this.f19662a = abstractComposeView;
    }

    @Override // androidx.customview.poolingcontainer.PoolingContainerListener
    /* JADX INFO: renamed from: a */
    public final void mo6254a() {
        this.f19662a.disposeComposition();
    }
}
