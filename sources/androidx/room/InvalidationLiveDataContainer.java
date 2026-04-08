package androidx.room;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/room/InvalidationLiveDataContainer;", "", "room-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class InvalidationLiveDataContainer {

    /* JADX INFO: renamed from: a */
    public final Set f31900a;

    public InvalidationLiveDataContainer(RoomDatabase roomDatabase) {
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        Intrinsics.m18598f(setNewSetFromMap, "newSetFromMap(IdentityHashMap())");
        this.f31900a = setNewSetFromMap;
    }
}
