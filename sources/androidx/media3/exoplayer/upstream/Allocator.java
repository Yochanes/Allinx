package androidx.media3.exoplayer.upstream;

import androidx.media3.common.util.UnstableApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface Allocator {

    /* JADX INFO: compiled from: Proguard */
    public interface AllocationNode {
        /* JADX INFO: renamed from: a */
        Allocation mo10559a();

        AllocationNode next();
    }

    /* JADX INFO: renamed from: a */
    void mo10657a(AllocationNode allocationNode);

    /* JADX INFO: renamed from: b */
    Allocation mo10658b();

    /* JADX INFO: renamed from: c */
    void mo10659c(Allocation allocation);

    /* JADX INFO: renamed from: d */
    void mo10660d();

    /* JADX INFO: renamed from: e */
    int mo10661e();
}
