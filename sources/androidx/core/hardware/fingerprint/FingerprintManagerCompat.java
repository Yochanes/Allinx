package androidx.core.hardware.fingerprint;

import android.hardware.fingerprint.FingerprintManager;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
@Deprecated
public class FingerprintManagerCompat {

    /* JADX INFO: renamed from: androidx.core.hardware.fingerprint.FingerprintManagerCompat$1 */
    /* JADX INFO: compiled from: Proguard */
    class C14361 extends FingerprintManager.AuthenticationCallback {
        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public final void onAuthenticationError(int i, CharSequence charSequence) {
            throw null;
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public final void onAuthenticationFailed() {
            throw null;
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public final void onAuthenticationHelp(int i, CharSequence charSequence) {
            throw null;
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
            FingerprintManager.CryptoObject cryptoObject = authenticationResult.getCryptoObject();
            if (cryptoObject != null) {
                if (cryptoObject.getCipher() != null) {
                    cryptoObject.getCipher();
                } else if (cryptoObject.getSignature() != null) {
                    cryptoObject.getSignature();
                } else if (cryptoObject.getMac() != null) {
                    cryptoObject.getMac();
                }
            }
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api23Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class AuthenticationCallback {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class AuthenticationResult {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class CryptoObject {
    }
}
