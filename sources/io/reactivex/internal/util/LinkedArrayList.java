package io.reactivex.internal.util;

import java.util.ArrayList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class LinkedArrayList {
    public final String toString() {
        ArrayList arrayList = new ArrayList(0 + 1);
        Object[] objArr = null;
        int i = 0;
        int i2 = 0;
        while (i < 0) {
            arrayList.add(objArr[i2]);
            i++;
            i2++;
            if (i2 == 0) {
                objArr = (Object[]) objArr[0];
                i2 = 0;
            }
        }
        return arrayList.toString();
    }
}
