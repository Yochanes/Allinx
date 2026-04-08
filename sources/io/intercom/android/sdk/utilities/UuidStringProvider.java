package io.intercom.android.sdk.utilities;

import java.util.UUID;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface UuidStringProvider {
    public static final UuidStringProvider SYSTEM = new C58501();

    /* JADX INFO: renamed from: io.intercom.android.sdk.utilities.UuidStringProvider$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C58501 implements UuidStringProvider {
        @Override // io.intercom.android.sdk.utilities.UuidStringProvider
        public String newUuidString() {
            return UUID.randomUUID().toString();
        }
    }

    String newUuidString();
}
