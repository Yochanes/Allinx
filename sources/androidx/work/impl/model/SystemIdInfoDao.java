package androidx.work.impl.model;

import androidx.room.Dao;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Dao
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, m18302d2 = {"Landroidx/work/impl/model/SystemIdInfoDao;", "", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public interface SystemIdInfoDao {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class DefaultImpls {
    }

    /* JADX INFO: renamed from: a */
    default void m12216a(WorkGenerationalId id) {
        Intrinsics.m18599g(id, "id");
        mo12221f(id.f33001b, id.f33000a);
    }

    /* JADX INFO: renamed from: b */
    ArrayList mo12217b();

    /* JADX INFO: renamed from: c */
    void mo12218c(SystemIdInfo systemIdInfo);

    /* JADX INFO: renamed from: d */
    SystemIdInfo mo12219d(int i, String str);

    /* JADX INFO: renamed from: e */
    default SystemIdInfo m12220e(WorkGenerationalId id) {
        Intrinsics.m18599g(id, "id");
        return mo12219d(id.f33001b, id.f33000a);
    }

    /* JADX INFO: renamed from: f */
    void mo12221f(int i, String str);

    /* JADX INFO: renamed from: g */
    void mo12222g(String str);
}
