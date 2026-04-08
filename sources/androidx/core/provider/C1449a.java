package androidx.core.provider;

import androidx.collection.LruCache;
import java.util.Comparator;

/* JADX INFO: renamed from: androidx.core.provider.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1449a implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        LruCache lruCache = FontProvider.f23269a;
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i = 0; i < bArr.length; i++) {
            byte b2 = bArr[i];
            byte b3 = bArr2[i];
            if (b2 != b3) {
                return b2 - b3;
            }
        }
        return 0;
    }
}
