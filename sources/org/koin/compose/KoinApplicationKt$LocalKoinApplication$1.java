package org.koin.compose;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.koin.compose.error.UnknownKoinContext;
import org.koin.core.Koin;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m18302d2 = {"<anonymous>", "Lorg/koin/core/Koin;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class KoinApplicationKt$LocalKoinApplication$1 extends Lambda implements Function0<Koin> {

    /* JADX INFO: renamed from: a */
    public static final KoinApplicationKt$LocalKoinApplication$1 f58192a = new KoinApplicationKt$LocalKoinApplication$1(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        throw new UnknownKoinContext();
    }
}
