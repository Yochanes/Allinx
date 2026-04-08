package kotlin.coroutines.intrinsics;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SinceKotlin
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/coroutines/intrinsics/CoroutineSingletons;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@PublishedApi
public final class CoroutineSingletons {

    /* JADX INFO: renamed from: a */
    public static final CoroutineSingletons f51584a;

    /* JADX INFO: renamed from: b */
    public static final CoroutineSingletons f51585b;

    /* JADX INFO: renamed from: c */
    public static final CoroutineSingletons f51586c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ CoroutineSingletons[] f51587d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ EnumEntries f51588f;

    static {
        CoroutineSingletons coroutineSingletons = new CoroutineSingletons("COROUTINE_SUSPENDED", 0);
        f51584a = coroutineSingletons;
        CoroutineSingletons coroutineSingletons2 = new CoroutineSingletons("UNDECIDED", 1);
        f51585b = coroutineSingletons2;
        CoroutineSingletons coroutineSingletons3 = new CoroutineSingletons("RESUMED", 2);
        f51586c = coroutineSingletons3;
        CoroutineSingletons[] coroutineSingletonsArr = {coroutineSingletons, coroutineSingletons2, coroutineSingletons3};
        f51587d = coroutineSingletonsArr;
        f51588f = EnumEntriesKt.m18563a(coroutineSingletonsArr);
    }

    public static CoroutineSingletons valueOf(String str) {
        return (CoroutineSingletons) Enum.valueOf(CoroutineSingletons.class, str);
    }

    public static CoroutineSingletons[] values() {
        return (CoroutineSingletons[]) f51587d.clone();
    }
}
