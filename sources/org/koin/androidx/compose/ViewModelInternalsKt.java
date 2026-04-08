package org.koin.androidx.compose;

import androidx.compose.runtime.Composer;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"koin-androidx-compose_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class ViewModelInternalsKt {
    /* JADX INFO: renamed from: a */
    public static final CreationExtras m21789a(ViewModelStoreOwner viewModelStoreOwner, Composer composer) {
        composer.mo4228f(19932612);
        CreationExtras defaultViewModelCreationExtras = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelCreationExtras() : CreationExtras.Empty.f25038b;
        composer.mo4218K();
        return defaultViewModelCreationExtras;
    }
}
