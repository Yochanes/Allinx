package com.geetest.gtc4;

import android.content.Context;
import android.content.pm.Signature;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Random;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public class Utils {
    public static String getCert() throws NoSuchAlgorithmException, IOException, CertificateException, KeyStoreException, NoSuchProviderException, InvalidAlgorithmParameterException {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            if (keyStore.containsAlias("no506b3822wb")) {
                keyStore.deleteEntry("no506b3822wb");
            }
            KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder("no506b3822wb", 12);
            byte[] bArr = new byte[8];
            new Random().nextBytes(bArr);
            builder.setAttestationChallenge(bArr);
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
            keyPairGenerator.initialize(builder.build());
            keyPairGenerator.generateKeyPair();
            return Base64.encodeToString(((X509Certificate) keyStore.getCertificateChain("no506b3822wb")[0]).getExtensionValue("1.3.6.1.4.1.11129.2.1.17"), 2);
        } catch (Throwable unused) {
            return "";
        }
    }

    private static String getSignature(Context context) {
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            if (signatureArr == null || signatureArr.length <= 0) {
                return "";
            }
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(signatureArr[0].toByteArray());
            StringBuilder sb = new StringBuilder();
            for (byte b2 : bArrDigest) {
                sb.append(Integer.toHexString((b2 & UnsignedBytes.MAX_VALUE) | 256).substring(1, 3));
            }
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }
}
