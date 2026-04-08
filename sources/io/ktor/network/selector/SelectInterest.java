package io.ktor.network.selector;

import io.ktor.util.InternalAPI;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@InternalAPI
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/network/selector/SelectInterest;", "", "Companion", "ktor-network"}, m18303k = 1, m18304mv = {1, 4, 2})
public enum SelectInterest {
    READ(1),
    WRITE(4),
    /* JADX INFO: Fake field, exist only in values array */
    ACCEPT(16),
    CONNECT(8);


    /* JADX INFO: renamed from: g */
    public static final SelectInterest[] f45995g = values();

    /* JADX INFO: renamed from: i */
    public static final int[] f45996i;

    /* JADX INFO: renamed from: a */
    public final int f45997a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/network/selector/SelectInterest$Companion;", "", "ktor-network"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Companion {
    }

    static {
        SelectInterest[] selectInterestArrValues = values();
        ArrayList arrayList = new ArrayList(selectInterestArrValues.length);
        for (SelectInterest selectInterest : selectInterestArrValues) {
            arrayList.add(Integer.valueOf(selectInterest.f45997a));
        }
        f45996i = CollectionsKt.m18463w0(arrayList);
        int length = values().length;
    }

    SelectInterest(int i) {
        this.f45997a = i;
    }
}
