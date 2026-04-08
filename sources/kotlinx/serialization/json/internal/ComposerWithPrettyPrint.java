package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/serialization/json/internal/ComposerWithPrettyPrint;", "Lkotlinx/serialization/json/internal/Composer;", "kotlinx-serialization-json"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class ComposerWithPrettyPrint extends Composer {

    /* JADX INFO: renamed from: c */
    public int f56882c;

    @Override // kotlinx.serialization.json.internal.Composer
    /* JADX INFO: renamed from: a */
    public final void mo21103a() {
        this.f56879b = true;
        this.f56882c++;
    }

    @Override // kotlinx.serialization.json.internal.Composer
    /* JADX INFO: renamed from: b */
    public final void mo21104b() {
        this.f56879b = false;
        m21110h("\n");
        if (this.f56882c > 0) {
            throw null;
        }
    }

    @Override // kotlinx.serialization.json.internal.Composer
    /* JADX INFO: renamed from: c */
    public final void mo21105c() {
        if (this.f56879b) {
            this.f56879b = false;
        } else {
            mo21104b();
        }
    }

    @Override // kotlinx.serialization.json.internal.Composer
    /* JADX INFO: renamed from: k */
    public final void mo21113k() {
        m21107e(' ');
    }

    @Override // kotlinx.serialization.json.internal.Composer
    /* JADX INFO: renamed from: l */
    public final void mo21114l() {
        this.f56882c--;
    }
}
