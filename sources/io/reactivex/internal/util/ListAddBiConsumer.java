package io.reactivex.internal.util;

import io.reactivex.functions.BiFunction;
import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ListAddBiConsumer implements BiFunction<List, Object, List> {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ ListAddBiConsumer[] f49278a = {new ListAddBiConsumer("INSTANCE", 0)};

    /* JADX INFO: Fake field, exist only in values array */
    ListAddBiConsumer EF5;

    public static ListAddBiConsumer valueOf(String str) {
        return (ListAddBiConsumer) Enum.valueOf(ListAddBiConsumer.class, str);
    }

    public static ListAddBiConsumer[] values() {
        return (ListAddBiConsumer[]) f49278a.clone();
    }
}
