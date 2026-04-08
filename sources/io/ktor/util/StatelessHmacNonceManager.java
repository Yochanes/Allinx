package io.ktor.util;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/util/StatelessHmacNonceManager;", "Lio/ktor/util/NonceManager;", "ktor-utils"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class StatelessHmacNonceManager implements NonceManager {

    /* JADX INFO: renamed from: io.ktor.util.StatelessHmacNonceManager$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m18302d2 = {"<anonymous>", "", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
    final class C59361 extends Lambda implements Function0<String> {
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CryptoKt.m17166a();
        }
    }

    /* JADX INFO: renamed from: io.ktor.util.StatelessHmacNonceManager$2 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m18302d2 = {"<anonymous>", "", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
    final class C59372 extends Lambda implements Function0<String> {
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CryptoKt.m17166a();
        }
    }
}
