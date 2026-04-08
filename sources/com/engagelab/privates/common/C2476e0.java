package com.engagelab.privates.common;

import android.text.TextUtils;
import com.engagelab.privates.common.constants.MTCommonConstants;
import com.engagelab.privates.core.api.Outputer;
import com.exchange.allin.p024ui.page.account.register.AbstractC2929c;

/* JADX INFO: renamed from: com.engagelab.privates.common.e0 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class C2476e0 {
    /* JADX INFO: renamed from: a */
    public static byte[] m12956a(int i, long j) {
        Outputer outputer = new Outputer(11);
        outputer.writeU16(0);
        outputer.writeU8((byte) i);
        outputer.writeU64(j);
        return outputer.toByteArray();
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m12958b(String str) {
        try {
            byte[] bytes = str.getBytes(MTCommonConstants.UTF_8);
            Outputer outputer = new Outputer(bytes.length);
            outputer.writeByteArrayIncludeLength(bytes);
            return outputer.toByteArray();
        } catch (Throwable th) {
            AbstractC2929c.m13709n("MTPushProtocol", new StringBuilder("packageAliasRequest failed "), th);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m12955a(byte b2, String str, String str2) {
        int length;
        try {
            byte[] bytes = str.getBytes(MTCommonConstants.UTF_8);
            byte[] bytes2 = !TextUtils.isEmpty(str2) ? str2.getBytes(MTCommonConstants.UTF_8) : null;
            if (bytes2 != null && bytes2.length > 0) {
                length = bytes.length + 1 + bytes2.length;
            } else {
                length = bytes.length + 1;
            }
            Outputer outputer = new Outputer(length);
            outputer.writeByteArrayIncludeLength(bytes);
            outputer.writeU8(b2);
            if (bytes2 != null && bytes2.length > 0) {
                outputer.writeByteArrayIncludeLength(bytes2);
            }
            return outputer.toByteArray();
        } catch (Throwable th) {
            AbstractC2929c.m13709n("MTPushProtocol", new StringBuilder("packagePlatformTokenBody failed "), th);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m12957a(String str) {
        try {
            byte[] bytes = str.getBytes(MTCommonConstants.UTF_8);
            Outputer outputer = new Outputer(bytes.length + 2);
            outputer.writeU8(7);
            outputer.writeU8(1);
            outputer.writeByteArrayIncludeLength(bytes);
            return outputer.toByteArray();
        } catch (Throwable th) {
            AbstractC2929c.m13709n("MTPushProtocol", new StringBuilder("packageMobileNumberBody failed "), th);
            return null;
        }
    }
}
